/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo06 {
    public static void main(String[] args) {
        // Uso de printf
        // f: formato
        
        String nombreEstudiante = "Carlos Leonardo";
        String apellidoEstudiante = "Yock Solano";
        int nacimiento = 2002;
        
        // System.out.println(nombreEstudiante+" "+apellidoEstudiante+ " "+ nacimiento);
        // En printf; 
        // usamos %s para reemplazar las cadenas, enteros, decimales
        // usamos %d para reemplazar los valores enteros
        // usamos %f para reemplazar los valore decimales
        System.out.printf("Nombre:%s\n\nApellido:%s\n\nFecha:%s\n", nombreEstudiante, 
                apellidoEstudiante, nacimiento);
    }
}
