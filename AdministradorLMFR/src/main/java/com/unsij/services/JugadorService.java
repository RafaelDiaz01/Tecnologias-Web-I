
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
    
    public void guardar(Jugador jugador) {
        if (jugador.getIdJugador() > 0) {
            dao.actualizar(jugador);
        } else {
            dao.insertar(jugador);
        }
    }
    
    public Jugador obtenerPorId(long id) {
        return dao.buscarPorId(id);
    }
    
    public void eliminar(long id) {
        dao.eliminar(id);
    }

}
