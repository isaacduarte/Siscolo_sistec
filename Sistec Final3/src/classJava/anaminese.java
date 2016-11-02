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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author pc isaac
 */
@Entity
@NamedQueries(
    @NamedQuery( name = "anaminese.pesquisaId",
            query = "SELECT a FROM anaminese a")
)
@Table(name = "Anaminese")
public class anaminese implements EntidadeBase{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequen_usuario")
    private int id;
    
    @Column
    private String motivoExame;
        
    @Column
    private String ExamePreventivo;
        
    @Column
    private String DIU;
        
    @Column
    private String Gravida;
        
    @Column
    private String PAnticoncepcional;
        
    @Column
    private String remedioMenopausa;
        
    @Column
    private String radiografia;
        
    @Column
    private String sangramentoRelacoesSexuais;
        
    @Column
    private String sangramentoMenopausa;
        
    @Column
    private String DUtimaMestruacao;
    
    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMotivoExame() {
        return motivoExame;
    }

    public void setMotivoExame(String motivoExame) {
        this.motivoExame = motivoExame;
    }

    public String getExamePreventivo() {
        return ExamePreventivo;
    }

    public void setExamePreventivo(String ExamePreventivo) {
        this.ExamePreventivo = ExamePreventivo;
    }

    public String getDIU() {
        return DIU;
    }

    public void setDIU(String DIU) {
        this.DIU = DIU;
    }

    public String getGravida() {
        return Gravida;
    }

    public void setGravida(String Gravida) {
        this.Gravida = Gravida;
    }

    public String getPAnticoncepcional() {
        return PAnticoncepcional;
    }

    public void setPAnticoncepcional(String PAnticoncepcional) {
        this.PAnticoncepcional = PAnticoncepcional;
    }

    public String getRemedioMenopausa() {
        return remedioMenopausa;
    }

    public void setRemedioMenopausa(String remedioMenopausa) {
        this.remedioMenopausa = remedioMenopausa;
    }

    public String getRadiografia() {
        return radiografia;
    }

    public void setRadiografia(String radiografia) {
        this.radiografia = radiografia;
    }

    public String getSangramentoRelacoesSexuais() {
        return sangramentoRelacoesSexuais;
    }

    public void setSangramentoRelacoesSexuais(String sangramentoRelacoesSexuais) {
        this.sangramentoRelacoesSexuais = sangramentoRelacoesSexuais;
    }

    public String getSangramentoMenopausa() {
        return sangramentoMenopausa;
    }

    public void setSangramentoMenopausa(String sangramentoMenopausa) {
        this.sangramentoMenopausa = sangramentoMenopausa;
    }

    public String getDUtimaMestruacao() {
        return DUtimaMestruacao;
    }

    public void setDUtimaMestruacao(String DUtimaMestruacao) {
        this.DUtimaMestruacao = DUtimaMestruacao;
    }
    
}
