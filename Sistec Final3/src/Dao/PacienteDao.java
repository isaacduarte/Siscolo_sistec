
package Dao;

import classJava.Paciente;
import classJava.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;


public class PacienteDao extends genericDao<Paciente>{
    public List<Paciente> pesquisaId() {
     List<Paciente> paciente ;
      try {
          Query q = em.createNamedQuery("Paciente.pesquisaId");
       paciente=q.getResultList();
      } catch (Exception e) {
      paciente= new ArrayList();
      }
      finally{
      em.close();
      }
     return paciente;
  }
}
