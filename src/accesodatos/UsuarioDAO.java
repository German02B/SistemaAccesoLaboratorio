/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;
import entidades.Usuario;
import java.io.*;
import java.util.*;
/**
 *
 * @author germa
 */
public class UsuarioDAO {
    
     private final String archivo = "usuarios.txt";

    public void guardar(Usuario u) throws IOException {
        FileWriter fw = new FileWriter(archivo, true);
        fw.write(u.toFile() + "\n");
        fw.close();
    }

    public List<Usuario> listar() throws IOException {
        List<Usuario> lista = new ArrayList<>();
        File file = new File(archivo);
        if (!file.exists()) return lista;

        BufferedReader br = new BufferedReader(new FileReader(file));
        String linea;
        while ((linea = br.readLine()) != null) {
            lista.add(Usuario.fromFile(linea));
        }
        br.close();
        return lista;
    }
    
}
