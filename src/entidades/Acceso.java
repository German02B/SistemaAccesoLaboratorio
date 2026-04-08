/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author germa
 */
public class Acceso {
    
     private String idUsuario;
    private String entrada;
    private String salida;

    public Acceso(String idUsuario, String entrada, String salida) {
        this.idUsuario = idUsuario;
        this.entrada = entrada;
        this.salida = salida;
    }

    public String getIdUsuario() { return idUsuario; }
    public String getEntrada() { return entrada; }
    public String getSalida() { return salida; }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String toFile() {
        return idUsuario + "," + entrada + "," + salida;
    }

    public static Acceso fromFile(String linea) {
        String[] d = linea.split(",");
        return new Acceso(d[0], d[1], d[2]);
    }
}
