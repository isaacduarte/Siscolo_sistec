
package Dao;


import classJava.citopatologico;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author pc isaac
 */
public class citopatologicoDao extends genericDao<citopatologico>{
    
    public List<citopatologico> pesquisaId(){
        List<citopatologico> citopatologico;
        try {
            Query q = em.createNamedQuery("citopatologico.pesquisaId");
            citopatologico= q.getResultList();
        } catch (Exception e) {
            citopatologico = new ArrayList();
        } finally{
            em.close();
        }
        return citopatologico;
    }
}

