
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
}
