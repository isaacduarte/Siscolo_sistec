
package Dao;

import classJava.BuscaAtiva;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author pc isaac
 */
public class BuscaAtivaDao extends genericDao<BuscaAtiva>{
    public List<BuscaAtivaDao> pesquisaId(){
        List<BuscaAtivaDao> busacAtiva;
        try {
            Query q = em.createNamedQuery("BuscaAtiva.PesquisaId");
            busacAtiva= q.getResultList();
        } catch (Exception e) {
            busacAtiva = new ArrayList();
        } finally{
            em.close();
        }
        return busacAtiva;
    }
}
