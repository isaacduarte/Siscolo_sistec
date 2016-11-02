/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import classJava.ExameClinico;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author pc isaac
 */
public class ExameClinicoDao extends genericDao<ExameClinico>{
    public List<ExameClinico> pesquisaId() {
     List<ExameClinico> exameClinico ;
      try {
          Query q = em.createNamedQuery("ExameClinico.pesquisaId");
       exameClinico=q.getResultList();
      } catch (Exception e) {
      exameClinico= new ArrayList();
      }
      finally{
      em.close();
      }
     return exameClinico;
  }
}
