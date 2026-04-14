/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudinventario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jorge
 */
public class clscsv {
    
    String archivo = "inventario.csv";
    
    public void importarDatos(){    
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;
            br.readLine();            
            
            double valor_total = 0;
            
            while ((linea = br.readLine()) != null){

                String[] datos = linea.split(",");
                
                double precio = Double.parseDouble(datos[2]);
                double cantidad = Double.parseDouble(datos[3]);
                
                double TOTAL = precio * cantidad;
                valor_total += TOTAL;
                
                String datoVisual = "Codigo: " + datos[0] + " Nombre: " + datos[1] + " Precio: " + datos[2] + " Cantidad: " + datos[3] + " Total: " + TOTAL;
                System.out.println(datoVisual);

                }
            System.out.println("El total del inventario es " + valor_total);
        
        }catch(IOException e){
            System.out.println("Mensaje de error" + e.getMessage());
        }
    }
}
