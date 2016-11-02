/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import classJava.anaminese;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author pc isaac
 */
public class AnamineseDao extends genericDao<anaminese>{
    public List<anaminese> pesquisaId(){
        List<anaminese> anaminese;
        try {
            Query q = em.createNamedQuery("anaminese.pesquisaId");
            anaminese= q.getResultList();
        } catch (Exception e) {
            anaminese = new ArrayList();
        } finally{
            em.close();
        }
        return anaminese;
    }
}
