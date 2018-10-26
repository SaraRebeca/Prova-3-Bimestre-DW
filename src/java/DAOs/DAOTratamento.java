package DAOs;

import Entidades.TipoTratamento;
import Entidades.Tratamento;
import java.util.ArrayList;
import java.util.List;

public class DAOTratamento extends DAOGenerico<Tratamento> {

    public DAOTratamento() {
        super(Tratamento.class);
    }

    public int autoIdTratamento() {
        Integer a = (Integer) em.createQuery("SELECT MAX(e.idTratamento) FROM Tratamento e ").getSingleResult();
        if (a != null) {
            return a + 1;
        } else {
            return 1;
        }
    }

    public List<Tratamento> listByNome(String nome) {
        return em.createQuery("SELECT e FROM Tratamento e WHERE e.nomeTratamento LIKE :nome").setParameter("nome", "%" + nome + "%").getResultList();
    }

    public List<Tratamento> listById(int id) {
        return em.createQuery("SELECT e FROM Tratamento e WHERE e.idTratamento = :id").setParameter("id", id).getResultList();
    }
    public List<Tratamento> listByIdTipoTratamento(String nomeTipo) {
        return em.createQuery("SELECT e FROM TipoTratamento e WHERE e.nomeTipoTratamento = :nomeTipo").setParameter("id", nomeTipo).getResultList();
    }
     

    public List<Tratamento> listInOrderNome() {
        return em.createQuery("SELECT e FROM Tratamento e ORDER BY e.nomeTratamento").getResultList();
    }

    public List<Tratamento> listInOrderId() {
        return em.createQuery("SELECT e FROM Tratamento e ORDER BY e.idTratamento").getResultList();
    }
    public List<Tratamento> listInOrderIdTipoTratamento() {
        return em.createQuery("SELECT e FROM TipoTratamento e ORDER BY e.nomeTipoTratamento").getResultList();
    }

    public List<String> listInOrderNomeStrings(String qualOrdem) {
        List<Tratamento> lf;
        if (qualOrdem.equals("id")) {
            lf = listInOrderId();
        } else   {
            lf = listInOrderNome();
        } 
            
                

        List<String> ls = new ArrayList<>();
        for (int i = 0; i < lf.size(); i++) {
            ls.add(lf.get(i).getIdTratamento() + "-" + lf.get(i).getNomeTratamento()) ;
        }
        return ls;
    }

    public void inserir(TipoTratamento tipoTratamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
