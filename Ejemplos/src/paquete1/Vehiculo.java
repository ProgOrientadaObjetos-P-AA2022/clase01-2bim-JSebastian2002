/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author UTPL
 */
public class Vehiculo {
    private String tipo;
    private String matricula;
    private double valor;
    private Vehiculo[] vehiculos;
    private double costoVehiculos;
    
    
    public void establecerTipo(String m){
        tipo = m;
    }
    public void establecerMatricula(String c){
        matricula = c;
    }
    public void establecerValor(double x ) {
        valor = x;
    }
    public void establecerVehiculos(Vehiculo[] h){
        vehiculos = h;
    }
    
    
    
    public Vehiculo[] obtenerVehiculos(){
        return vehiculos;
    }
    public String obtenerTipo(){
        return tipo;
    }
    public String obtenerMatricula(){
        return matricula;
    }
    public double obtenerValor(){
        return valor;
    }

}
