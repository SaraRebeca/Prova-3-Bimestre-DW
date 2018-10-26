package DAOs;

import static DAOs.DAOGenerico.em;
import Entidades.TipoTratamento;
import Entidades.TipoTratamento;
import java.util.ArrayList;
import java.util.List;

public class DAOTipoTratamento extends DAOGenerico<TipoTratamento> {

    public DAOTipoTratamento() {
        super(TipoTratamento.class);
    }

    public int autoIdTipoTratamento() {
        Integer a = (Integer) em.createQuery("SELECT MAX(e.idTipoTratamento) FROM TipoTratamento e ").getSingleResult();
        if (a != null) {
            return a + 1;
        } else {
            return 1;
        }
    }

    public List<TipoTratamento> listByNome(String nome) {
        return em.createQuery("SELECT e FROM TipoTratamento e WHERE e.nomeTipoTratamento LIKE :nome").setParameter("nome", "%" + nome + "%").getResultList();
    }

    public List<TipoTratamento> listById(int id) {
        return em.createQuery("SELECT e FROM TipoTratamento e WHERE e.idTipoTratamento = :id").setParameter("id", id).getResultList();
    }

    public List<TipoTratamento> listInOrderNome() {
        return em.createQuery("SELECT e FROM TipoTratamento e ORDER BY e.nomeTipoTratamentocol").getResultList();
    }

    public List<TipoTratamento> listInOrderId() {
        return em.createQuery("SELECT e FROM TipoTratamento e ORDER BY e.idTipoTratamento").getResultList();
    }

    public List<String> listInOrderNomeStrings(String qualOrdem) {
        List<TipoTratamento> lf;
        if (qualOrdem.equals("id")) {
            lf = listInOrderId();
        } else {
            lf = listInOrderNome();
        }

        List<String> ls = new ArrayList<>();
        for (int i = 0; i < lf.size(); i++) {
            ls.add(lf.get(i).getIdTipoTratamento() + "-" + lf.get(i).getNomeTipoTratamentocol());
        }
        return ls;
    }
}
