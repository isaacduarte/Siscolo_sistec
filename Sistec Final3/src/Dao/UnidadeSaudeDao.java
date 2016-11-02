/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import classJava.UnidadeSaude;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author pc isaac
 */
public class UnidadeSaudeDao extends genericDao<UnidadeSaude>{
    public List<UnidadeSaude> pesquisaId(){
        List<UnidadeSaude> unidadeSaude;
        try {
            Query q = em.createNamedQuery("UnidadeSaude.pesquisaId");
            unidadeSaude = q.getResultList();
        } catch (Exception e) {
            unidadeSaude = new ArrayList();
        } finally{
            em.close();
        }
        return unidadeSaude;
    }
}
