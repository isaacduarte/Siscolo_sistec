
package classJava;

import Dao.EntidadeBase;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@NamedQueries(
        @NamedQuery(name="citopatologico.pesquisaId",
                    query = "SELECT c FROM citopatologico c "
                )
)
@Table(name = "citopatologico")
public class citopatologico implements EntidadeBase{
     @Id
    private int id;
    
     @Column(nullable = true)
     private String avaliacaoPreAnalitica;
     
     @Column(nullable = true)
     private String adquabilidadeMaterial;
     
     @Column(nullable = true)
     private String diagnosticoDescritivo;
     
     @Column(nullable = true)
     private String CelulasAtipicas;
     
     @Column(nullable = true)
     private String microbiologia;
     
     @Column(nullable = true)
     private String atipiasCelulasEscamosas;
     
     @Column(nullable = true)
     private String atipiasCelulasGlandulares;
     @Column(nullable = true)
     private String origemIndefinida;
     
     @Column(nullable = true)
     private String ObsG;
     
     @Column(nullable = true)
     private String SPCitotecnico;
     
     @Column(nullable = true)
     private String responsavel;
     
     @Column(nullable = true)
     private String dataResultado;
     
         
    @OneToOne
    private Paciente paciente;

    @OneToOne
    private UnidadeSaude UnidadeSaude;
    
    @OneToOne
    private Laboratorio laboratorio;
    
     @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvaliacaoPreAnalitica() {
        return avaliacaoPreAnalitica;
    }

    public void setAvaliacaoPreAnalitica(String avaliacaoPreAnalitica) {
        this.avaliacaoPreAnalitica = avaliacaoPreAnalitica;
    }

    public String getAdquabilidadeMaterial() {
        return adquabilidadeMaterial;
    }

    public void setAdquabilidadeMaterial(String adquabilidadeMaterial) {
        this.adquabilidadeMaterial = adquabilidadeMaterial;
    }

    public String getDiagnosticoDescritivo() {
        return diagnosticoDescritivo;
    }

    public void setDiagnosticoDescritivo(String diagnosticoDescritivo) {
        this.diagnosticoDescritivo = diagnosticoDescritivo;
    }

    public String getCelulasAtipicas() {
        return CelulasAtipicas;
    }

    public void setCelulasAtipicas(String CelulasAtipicas) {
        this.CelulasAtipicas = CelulasAtipicas;
    }

    public String getMicrobiologia() {
        return microbiologia;
    }

    public void setMicrobiologia(String microbiologia) {
        this.microbiologia = microbiologia;
    }

    public String getAtipiasCelulasEscamosas() {
        return atipiasCelulasEscamosas;
    }

    public void setAtipiasCelulasEscamosas(String atipiasCelulasEscamosas) {
        this.atipiasCelulasEscamosas = atipiasCelulasEscamosas;
    }

    public String getAtipiasCelulasGlandulares() {
        return atipiasCelulasGlandulares;
    }

    public void setAtipiasCelulasGlandulares(String atipiasCelulasGlandulares) {
        this.atipiasCelulasGlandulares = atipiasCelulasGlandulares;
    }

    public String getObsG() {
        return ObsG;
    }

    public void setObsG(String ObsG) {
        this.ObsG = ObsG;
    }

    public String getSPCitotecnico() {
        return SPCitotecnico;
    }

    public void setSPCitotecnico(String SPCitotecnico) {
        this.SPCitotecnico = SPCitotecnico;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getDataResultado() {
        return dataResultado;
    }

    public void setDataResultado(String dataResultado) {
        this.dataResultado = dataResultado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getOrigemIndefinida() {
        return origemIndefinida;
    }

    public void setOrigemIndefinida(String origemIndefinida) {
        this.origemIndefinida = origemIndefinida;
    }

    public UnidadeSaude getUnidadeSaude() {
        return UnidadeSaude;
    }

    public void setUnidadeSaude(UnidadeSaude UnidadeSaude) {
        this.UnidadeSaude = UnidadeSaude;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
    
    
}
