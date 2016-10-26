
package Dao;

import classJava.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

public class UsuarioDao extends genericDao<Usuario>{
 
  public List<Usuario> conAutenticar() {
     List<Usuario> usuario ;
      try {
          Query q = em.createNamedQuery("Usuario.conAutenticar");
       usuario=q.getResultList();
      } catch (Exception e) {
      usuario= new ArrayList();
      }
      finally{
      em.close();
      }
     return usuario;
  }
}