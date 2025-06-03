package com.unsij.services;

import com.unsij.dao.TipoUsuarioDAO;
import com.unsij.beans.TipoUsuario;

import java.util.List;

/**
 *
 * @author rafaeldiaz
 */
public class TipoUsuarioService {
    private final TipoUsuarioDAO dao = new TipoUsuarioDAO();

    public List<TipoUsuario> obtenerUsuarios() {
        return dao.listar();
    }

    public TipoUsuario obtenerPorId(int id) {
        return dao.buscarPorId(id);
    }

    public void guardar(TipoUsuario u) {
        if (u.getIdTipoUsuario() > 0) {
            dao.actualizar(u);
        } else {
            dao.insertar(u);
        }
    }

    public void eliminar(int id) {
        dao.eliminar(id);
    }
}
