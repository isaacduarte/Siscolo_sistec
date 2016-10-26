package classJava;

import Dao.EntidadeBase;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries(
        @NamedQuery(name="Usuario.conAutenticar",
                    query = "SELECT u FROM Usuario u "
                )
)
@Table(name = "Usuario")
public class Usuario implements EntidadeBase{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequen_usuario")
    private int id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String Login;
    
    @Column(nullable = false)
    private String senha;
    
    @Column(nullable = false)
    private String email;
    
    @Column(nullable = false)
    private String nivelDeAcesso;

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }
    
}