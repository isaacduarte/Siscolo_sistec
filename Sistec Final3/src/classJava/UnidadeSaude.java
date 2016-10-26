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
@Table(name = "UnidadeSaude")
public class UnidadeSaude implements EntidadeBase{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequen_usuario")
    private int id;
    
    @Column(nullable = false)
    private String CNESUS;
    
    @Column(nullable = false)
    private String UnidadeSaude;
    
    @Column(nullable = false)
    private String NProtocolo;
    
    @Column(nullable = false)
    private String Municipio;
    
    @Column(nullable = false)
    private String UF;
    
    @Column(nullable = false)
    private String Prontuario;

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
