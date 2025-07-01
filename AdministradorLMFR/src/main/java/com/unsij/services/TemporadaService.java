
package com.unsij.services;
import com.unsij.dao.TemporadasDAO;
import com.unsij.beans.Temporada;

import java.util.List;
/**
 *
 * @author diaz
 */
public class TemporadaService {
    private final TemporadasDAO dao = new TemporadasDAO();

    public List<Temporada> obtenerTemporadas() {
        return dao.listar();
    }
    
    public void guardar(Temporada temporadas) {
        if (temporadas.getIdTemporada() > 0) {
            dao.actualizar(temporadas);
        } else {
            dao.insertar(temporadas);
        }
    }
    
    public Temporada obtenerPorId(long id) {
        return dao.buscarPorId(id);
    }
    
    public void eliminar(long id) {
        dao.eliminar(id);
    }
}
