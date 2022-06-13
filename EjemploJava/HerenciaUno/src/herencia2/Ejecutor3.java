/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Scanner;
/**
 *
 * @author SALA I
 */
public class Ejecutor3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int seleccion;
        System.out.println("----------------------------------------------------");
        System.out.println("Menu de opciones");
        System.out.println("1: Crear objeto de tipo EstudianteDistancia");
        System.out.println("2: Crear objeto de tipo EstudiantePresncial");
        System.out.println("Seleccione que desea crear");
        System.out.println("----------------------------------------------------");
        seleccion = entrada.nextInt();
        switch (seleccion) {
            case 1: 
                /*
                String ob1;
                System.out.println("Ingrese el nombre del objeto");
                ob1 = entrada.nextLine();
                */
                EstudianteDistancia obj1 = new EstudianteDistancia();
                String nombre, apellido, cedula;
                int edad;
                System.out.println("Ingrese el nombre del estudiante");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el apellido del estudiante");
                apellido = entrada.nextLine();
                System.out.println("Ingrese la cedula del estudiante");
                cedula = entrada.nextLine();
                System.out.println("Ingrese la edad del estudiante");
                edad = entrada.nextInt();
    
                obj1.establecerNombresEstudiante(nombre);
                obj1.establecerApellidoEstudiante(apellido);
                obj1.establecerIdentificacionEstudiante(cedula);
                obj1.establecerEdadEstudiante(edad);
                
                System.out.println(obj1);
          
                break;
            case 2:
                EstudiantePresencial obj2 = new EstudiantePresencial();
                String nombre2;
               

                
                break;
                
            
        }
        /*
        En el método **main**, se debe permitir ingresar objetos 
        de tipo Estudiante Distancia y Estudiante Presencial. 
        Uno a la vez. Si el usuario ingresa 1, se debe crear un 
        Estudiante Distancia por teclado; si ingresa 2, se debe crear un 
        Estudiante Presencial. Los datos de entrada serán ingresados por 
        teclado.

        Restricciones:
        * En el código solo debe usar por una sola ocasión la siguiente 
        sentencias
        ```
            nombres = entrada.nextLine()
            apellido = entrada.nextLine()
            cedula = entrada.nextLine()
            edad = entrada.nextLine()
        
        ```
        * Si el usuario ingresa algo diferente de 1 o 2; el programa debe 
        presentar un mensaje que diga: "Error, opción no válida."
        
        */
    }
    
}
