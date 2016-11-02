/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import classJava.Laboratorio;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author pc isaac
 */
public class LaboratorioDao extends genericDao<Laboratorio>{
    
    public List<Laboratorio> pesquisaId(){
        List<Laboratorio> laboratorio;
        try {
            Query q = em.createNamedQuery("Laboratorio.pesquisaId");
            laboratorio= q.getResultList();
        } catch (Exception e) {
            laboratorio = new ArrayList();
        } finally{
            em.close();
        }
        return laboratorio;
    }
}
