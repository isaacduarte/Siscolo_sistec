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
@Table(name = "Laboratorio")
public class Laboratorio implements EntidadeBase{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequen_Laboratorio")
    private int id;
    
    @Column(nullable = false)
    private String CNESLaboratorio;
    
    @Column(nullable = false)
    private String NomeLaboratorio;
            
    @Column(nullable = false)
    private int NumeroLaboratorio;
    
    @Column(nullable = false)
    private String Municipio;
    
    @Column(nullable = false)
    private String UF;
    
    @Column(nullable = false)
    private String Recebido;
    
    @Override
    public int getId() {
        return id;
    }
   
    public void setId(int id) {
        this.id = id;
    }

    public String getCNESLaboratorio() {
        return CNESLaboratorio;
    }

    public void setCNESLaboratorio(String CNESLaboratorio) {
        this.CNESLaboratorio = CNESLaboratorio;
    }

    public String getNomeLaboratorio() {
        return NomeLaboratorio;
    }

    public void setNomeLaboratorio(String NomeLaboratorio) {
        this.NomeLaboratorio = NomeLaboratorio;
    }

    public int getNumeroLaboratorio() {
        return NumeroLaboratorio;
    }

    public void setNumeroLaboratorio(int NumeroLaboratorio) {
        this.NumeroLaboratorio = NumeroLaboratorio;
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

    public String getRecebido() {
        return Recebido;
    }

    public void setRecebido(String Recebido) {
        this.Recebido = Recebido;
    }

    
}
