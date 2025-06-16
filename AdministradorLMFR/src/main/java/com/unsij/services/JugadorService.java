
package com.unsij.services;
import com.unsij.dao.JugadorDAO;
import com.unsij.beans.Jugador;

import java.util.List;

/**
 * @author rafaeldiaz
 */
public class JugadorService {
    private final JugadorDAO dao = new JugadorDAO();

    public List<Jugador> obtenerJugadores() {
        return dao.listar();
    }
    
    public Jugador obtenerPorId(int id) {
        return dao.buscarPorId(id);
    }

    public void guardar(Jugador u) {
        if (u.getIdJugador() > 0) {
            dao.actualizar(u);
        } else {
            dao.insertar(u);
        }
    }

    public void eliminar(int id) {
        dao.eliminar(id);
    }

}
