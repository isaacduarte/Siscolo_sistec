package formatador.classes;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Principal
 */
public class Formatador {

    public Formatador(JTextField campo, String mascara) {
        this.campo = campo;
        this.mascara = mascara;

        this.campo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                executarAoDigitar(evt);
            }
        });

        this.campo.setDocument(new Limitador(mascara.length()));
    }
    private final String mascara;
    private final JTextField campo;

    private void executarAoDigitar(KeyEvent evento) {
        if (evento.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            this.campo.setText(pegarApenasPartePreenchida(mesclarTextoComMascara()));
        }
    }

    public String apenasNumeros() {
        return filtrarNumeros(this.campo.getText().trim());
    }

    private boolean eNumero(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private String filtrarNumeros(String texto) {
        String limpo = "";

        for (int i = 0; i < texto.length(); i++) {
            if (eNumero(texto.substring(i, i + 1))) {
                limpo += texto.substring(i, i + 1);
            }
        }

        return limpo;
    }

    private String mesclarTextoComMascara() {
        String mesclado = mascara;
        String texto = filtrarNumeros(this.campo.getText().trim());

        for (int i = 0; i < texto.length(); i++) {
            mesclado = mesclado.replaceFirst("#", texto.substring(i, i + 1));
        }

        return mesclado;
    }

    private String pegarApenasPartePreenchida(String texto) {
        String textoNovo = "";

        for (int i = 0; i < texto.length(); i++) {
            if (texto.substring(i, i + 1).equals("#")) {
                break;
            } else {
                textoNovo += texto.substring(i, i + 1);
            }
        }

        if (textoNovo.length() == 1) {
            if (!eNumero(textoNovo.substring(0, 1))) {
                return "";
            }
        }

        return textoNovo;
    }

    private class Limitador extends PlainDocument {

        private final int tamanhoMax;

        public Limitador(int tamanhoMax) {
            this.tamanhoMax = tamanhoMax;
        }

        @Override
        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {

            if (str == null) {
                return;
            }

            String stringAntiga = getText(0, getLength());
            int tamanhoNovo = stringAntiga.length() + str.length();

            if (tamanhoNovo <= tamanhoMax) {
                super.insertString(offset, str, attr);
            } else {
                super.insertString(offset, "", attr);
            }
        }
    }
}
