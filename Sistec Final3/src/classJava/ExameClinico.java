/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classJava;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import Dao.EntidadeBase;

/**
 *
 * @author pc isaac
 */
@Entity
@Table(name = "ExameClinico")
public class ExameClinico implements EntidadeBase{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequen_usuario")
    private int id;
    @Column(nullable = false)
    private String inspecaoColo;
    
    @Column(nullable = false)
    private String numeroExame;
       
    @Column(nullable = false)
    private String ssdst;
    
    @Column(nullable = false)
    private String dataColeta;
    
    @Column(nullable = false)
    private String responsavel;

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInspecaoColo() {
        return inspecaoColo;
    }

    public void setInspecaoColo(String inspecaoColo) {
        this.inspecaoColo = inspecaoColo;
    }

    public String getNumeroExame() {
        return numeroExame;
    }

    public void setNumeroExame(String numeroExame) {
        this.numeroExame = numeroExame;
    }

    public String getSsdst() {
        return ssdst;
    }

    public void setSsdst(String ssdst) {
        this.ssdst = ssdst;
    }

    public String getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(String dataColeta) {
        this.dataColeta = dataColeta;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
    
}
