
package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class genericDao<T extends EntidadeBase> {
     EntityManagerFactory emf;
    EntityManager em;
  public genericDao(){
       emf = Persistence.createEntityManagerFactory("Sistec_FinalPU");
       em=emf.createEntityManager();
}
  public T salvar(T t){
    try{
      em.getTransaction().begin();
      em.merge(t);
      em.getTransaction().commit();
    }catch(Exception e){
    em.getTransaction().rollback();
    }finally{
        emf.close();
    }
      return t;
  }
  public void remover (Class<T> clazz, int id){
      T t= em.find(clazz, id);
      try {
          em.getTransaction().begin();
          em.remove(t);
          em.getTransaction().commit();
      } finally {
          em.close();
      }
  }
  public T obter( Class<T> clazz, int id){
        em.getTransaction().begin();
        T t = em.find(clazz, id);
        em.getTransaction().commit();
        emf.close();
     return t;
  }
}
