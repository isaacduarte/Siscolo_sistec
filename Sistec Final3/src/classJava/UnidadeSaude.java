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
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
/**
 *
 * @author pc isaac
 */
@Entity
@SequenceGenerator(name = "Unidade_Saude_Sequenc", sequenceName = "Unidade_Saude_Sequenc", initialValue = 1, allocationSize = 1)

@NamedQueries(
   @NamedQuery( name = "UnidadeSaude.pesquisaId",
           query = "SELECT u FROM UnidadeSaude u"
   )
)
@Table(name = "UnidadeSaude")
public class UnidadeSaude implements EntidadeBase{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Unidade_Saude_Sequenc")
    private int id;
    
    @Column()
    private String CNESUS;
    
    @Column()
    private String UnidadeSaude;
    
    @Column()
    private String NProtocolo;
    
    @Column()
    private String Municipio;
    
    @Column()
    private String UF;
    
    @Column()
    private String Prontuario;
    @OneToMany(mappedBy = "UnidadeSaude")
    @JoinColumn(name = "BuscaAtiva_Id")
    private List<BuscaAtiva> BuscaAtiva;

    public List<BuscaAtiva> getBuscaAtiva() {
        return BuscaAtiva;
    }

    public void setBuscaAtiva(List<BuscaAtiva> BuscaAtiva) {
        this.BuscaAtiva = BuscaAtiva;
    }
    
    
    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCNESUS() {
        return CNESUS;
    }

    public void setCNESUS(String CNESUS) {
        this.CNESUS = CNESUS;
    }

    public String getUnidadeSaude() {
        return UnidadeSaude;
    }

    public void setUnidadeSaude(String UnidadeSaude) {
        this.UnidadeSaude = UnidadeSaude;
    }

    public String getNProtocolo() {
        return NProtocolo;
    }

    public void setNProtocolo(String NProtocolo) {
        this.NProtocolo = NProtocolo;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getProntuario() {
        return Prontuario;
    }

    public void setProntuario(String Prontuario) {
        this.Prontuario = Prontuario;
    }

    
    
}
