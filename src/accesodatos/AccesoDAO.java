/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;
import entidades.Acceso;
import java.io.*;
import java.util.*;
/**
 *
 * @author germa
 */
public class AccesoDAO {
    
    private final String archivo = "accesos.txt";

    public void guardar(List<Acceso> lista) throws IOException {
        FileWriter fw = new FileWriter(archivo);
        for (Acceso a : lista) {
            fw.write(a.toFile() + "\n");
        }
        fw.close();
    }

    public List<Acceso> listar() throws IOException {
        List<Acceso> lista = new ArrayList<>();
        File file = new File(archivo);
        if (!file.exists()) return lista;

        BufferedReader br = new BufferedReader(new FileReader(file));
        String linea;
        while ((linea = br.readLine()) != null) {
            lista.add(Acceso.fromFile(linea));
        }
        br.close();
        return lista;
    }
    
}
