/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudinventario;

/**
 *
 * @author Jorge
 */
public class clsArticulo {
    // atributos que necesito que tenga mi objeto
    private String codigo;
    private String descripcion;
    private Double precio;

    // constructor
    public clsArticulo(String codigo, String descripcion, Double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;

    }

    // imprimir en consola los datos del articulo
    public String aTexto() {
        // Solo retornamos la cadena, no imprimimos aquí
        return this.codigo + "|" + this.descripcion + "|" + this.precio;
    }

    // guardar informacion
    public void guardar() {
        mArticulo article = new mArticulo();
        String textoArticulo = this.aTexto(); // Obtenemos el texto una sola vez

        // Enviamos la cadena para guardar en el archivo
        article.Insertar(textoArticulo);

        // Si quieres verlo en consola una sola vez:
        System.out.println(textoArticulo);
    }
}
