
package com.unsij.services;
import com.unsij.dao.ArbitroDAO;
import com.unsij.beans.Arbitro;

import java.util.List;
/**
 *
 * @author diaz
 */
public class ArbitroService {
    private final ArbitroDAO dao = new ArbitroDAO();

    public List<Arbitro> obtenerArbitros() {
        return dao.listar();
    }
    
    public void guardar(Arbitro arbitro) {
        if (arbitro.getIdArbitro() > 0) {
            dao.actualizar(arbitro);
        } else {
            dao.insertar(arbitro);
        }
    }
    
    public Arbitro obtenerPorId(long id) {
        return dao.buscarPorId(id);
    }
    
    public void eliminar(long id) {
        dao.eliminar(id);
    }
}
