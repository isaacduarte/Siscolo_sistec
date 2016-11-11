
package classJava;

import Dao.EntidadeBase;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "Busca_Ativa_Sequenc", sequenceName = "Busca_Ativa_Sequenc", initialValue = 1,allocationSize = 1)
@NamedQueries(
        @NamedQuery(name = "BuscaAtiva.PesquisaId",
        query="SELECT BA FROM BuscaAtiva BA")
)
@Table(name = "Busca_Ativa")
public class BuscaAtiva implements EntidadeBase{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Busca_Ativa_Sequenc")
    private int id;
    
    @Column(nullable = false)
    private String dataExame;
    
    @Column(nullable = false)
    private String Referencia;
    
    @Column(nullable = false)
    private String Colposcopia;
    
    @Column(nullable = false)
    private String Biopsia;
    
    @Column(nullable = false)
    private String laudoBiopsia;

    @Column(nullable = false)
    private String Tratamento;

    @Column(nullable = true)
    private String situacaoSegmento;

    @Column(nullable = false)
    private String informacaoObtida;

    @Column(nullable = false)
    private String RExameCitopatologico;

    @Column(nullable = false)
    private String Obs;
    
    @OneToOne
    private Paciente paciente;
    
    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataExame() {
        return dataExame;
    }

    public void setDataExame(String dataExame) {
        this.dataExame = dataExame;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public String getColposcopia() {
        return Colposcopia;
    }

    public void setColposcopia(String Colposcopia) {
        this.Colposcopia = Colposcopia;
    }

    public String getBiopsia() {
        return Biopsia;
    }

    public void setBiopsia(String Biopsia) {
        this.Biopsia = Biopsia;
    }

    public String getLaudoBiopsia() {
        return laudoBiopsia;
    }

    public void setLaudoBiopsia(String laudoBiopsia) {
        this.laudoBiopsia = laudoBiopsia;
    }

    public String getTratamento() {
        return Tratamento;
    }

    public void setTratamento(String Tratamento) {
        this.Tratamento = Tratamento;
    }

    public String getSituacaoSegmento() {
        return situacaoSegmento;
    }

    public void setSituacaoSegmento(String situacaoSegmento) {
        this.situacaoSegmento = situacaoSegmento;
    }

    public String getInformacaoObtida() {
        return informacaoObtida;
    }

    public void setInformacaoObtida(String informacaoObtida) {
        this.informacaoObtida = informacaoObtida;
    }

    public String getRExameCitopatologico() {
        return RExameCitopatologico;
    }

    public void setRExameCitopatologico(String RExameCitopatologico) {
        this.RExameCitopatologico = RExameCitopatologico;
    }

    public String getObs() {
        return Obs;
    }

    public void setObs(String Obs) {
        this.Obs = Obs;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}
