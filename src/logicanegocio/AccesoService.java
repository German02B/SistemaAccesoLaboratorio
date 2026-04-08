/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicanegocio;
import accesodatos.AccesoDAO;
import entidades.Acceso;
import java.time.LocalDateTime;
import java.util.*;

/**
 *
 * @author germa
 */
public class AccesoService {
    
    private AccesoDAO dao = new AccesoDAO();

    public void registrarEntrada(String idUsuario) throws Exception {
        List<Acceso> lista = dao.listar();

        for (Acceso a : lista) {
            if (a.getIdUsuario().equals(idUsuario) && a.getSalida().equals("null")) {
                throw new Exception("Ya está dentro del laboratorio");
            }
        }

        lista.add(new Acceso(idUsuario, LocalDateTime.now().toString(), "null"));
        dao.guardar(lista);
    }

    public void registrarSalida(String idUsuario) throws Exception {
        List<Acceso> lista = dao.listar();

        for (Acceso a : lista) {
            if (a.getIdUsuario().equals(idUsuario) && a.getSalida().equals("null")) {
                a.setSalida(LocalDateTime.now().toString());
                dao.guardar(lista);
                return;
            }
        }

        throw new Exception("No tiene entrada registrada");
    }
}
