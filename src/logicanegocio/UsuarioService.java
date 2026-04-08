/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicanegocio;
import accesodatos.UsuarioDAO;
import entidades.Usuario;
import java.util.*;
/**
 *
 * @author germa
 */
public class UsuarioService {
    
    private UsuarioDAO dao = new UsuarioDAO();

    public void registrarUsuario(String id, String nombre, String rol) throws Exception {
        if (id.isEmpty() || nombre.isEmpty() || rol.isEmpty()) {
            throw new Exception("Datos incompletos");
        }

        for (Usuario u : dao.listar()) {
            if (u.getId().equals(id)) {
                throw new Exception("ID duplicado");
            }
        }

        dao.guardar(new Usuario(id, nombre, rol));
    }

    public List<Usuario> listar() throws Exception {
        return dao.listar();
    }
    
}
