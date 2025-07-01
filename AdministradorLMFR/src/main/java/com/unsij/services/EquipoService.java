package com.unsij.services;

import com.unsij.dao.EquipoDAO;
import com.unsij.beans.Equipo;

import java.util.List;

/**
 *
 * @author diaz
 */
public class EquipoService {

    private final EquipoDAO dao = new EquipoDAO();

    public List<Equipo> obtenerEquipos() {
        return dao.listar();
    }

    public void guardar(Equipo equipo) {
        if (equipo.getIdEquipo() > 0) {
            dao.actualizar(equipo);
        } else {
            dao.insertar(equipo);
        }
    }

    public Equipo obtenerPorId(long id) {
        return dao.buscarPorId(id);
    }

    public void eliminar(long id) {
        dao.eliminar(id);
    }
}
