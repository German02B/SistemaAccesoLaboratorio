/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;
import logicanegocio.*;
import javax.swing.JOptionPane;

/**
 *
 * @author germa
 */
public class Main {
    
    public static void main(String[] args) {
        UsuarioService us = new UsuarioService();
        AccesoService as = new AccesoService();

        while (true) {
            String menu = "1. Registrar usuario\n" +
                          "2. Registrar entrada\n" +
                          "3. Registrar salida\n" +
                          "4. Listar usuarios\n" +
                          "5. Salir";

            String opStr = JOptionPane.showInputDialog(menu);
            if(opStr == null) break; // Cancelar
            int op = Integer.parseInt(opStr);

            try {
                switch(op) {
                    case 1:
                        String id = JOptionPane.showInputDialog("ID:");
                        String nombre = JOptionPane.showInputDialog("Nombre:");
                        String rol = JOptionPane.showInputDialog("Rol (Estudiante/Docente):");
                        us.registrarUsuario(id, nombre, rol);
                        JOptionPane.showMessageDialog(null, "Usuario registrado");
                        break;

                    case 2:
                        String idEntrada = JOptionPane.showInputDialog("ID Usuario:");
                        as.registrarEntrada(idEntrada);
                        JOptionPane.showMessageDialog(null, "Entrada registrada");
                        break;

                    case 3:
                        String idSalida = JOptionPane.showInputDialog("ID Usuario:");
                        as.registrarSalida(idSalida);
                        JOptionPane.showMessageDialog(null, "Salida registrada");
                        break;

                    case 4:
                        StringBuilder sb = new StringBuilder();
                        for (var u : us.listar()) {
                            sb.append(u.getId()).append(" - ").append(u.getNombre())
                              .append(" - ").append(u.getRol()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                        break;

                    case 5:
                        System.exit(0);
                        break;
                }
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
    }
    
}
