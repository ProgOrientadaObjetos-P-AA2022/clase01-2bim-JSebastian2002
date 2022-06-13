/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.Estudiante;
import herencia1.EstudianteDistancia;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String Apellido;
        String id;
        int edad;
        int creditos;
        double costo;
        
        System.out.println("Ingrese su Nombre");
        nombre = entrada.nextLine();
        
        
        System.out.println("Ingrese Su apellido");
        Apellido = entrada.nextLine();
        
        
        System.out.println("Ingrese la identificacion del estudiante");
        id = entrada.nextLine();
        
        System.out.println("Ingrese la edad del estudinate");
        edad  = entrada.nextInt();
        
        System.out.println("Ingrese el numero de creditos del estudiantes");
        creditos = entrada.nextInt();
        
        
        System.out.println("Ingrese el costo del credito del estudainte");
        costo = entrada.nextDouble();
        
        
  
        EstudianteDistancia estudiante = new  EstudianteDistancia();
        
        estudiante.establecerNombresEstudiante(nombre);
        estudiante.establecerApellidoEstudiante(Apellido);
        estudiante.establecerIdentificacionEstudiante(id);
        estudiante.establecerEdadEstudiante(edad);
        estudiante.establecerNumeroAsginaturas(creditos);
        estudiante.establecerCostoAsignatura(costo);
        estudiante.calcularMatriculaDistancia();
        
        System.out.println(estudiante);

                
        


        

       

        
        
    }
    
    
}
