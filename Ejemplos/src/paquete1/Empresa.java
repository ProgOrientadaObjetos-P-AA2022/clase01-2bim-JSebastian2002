/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {
    private String nombre;
    private Edificio [] edificios;
    private double costoBienesInmuebles;
    
    public void establecerNombre(String m){
        nombre = m;
    }
    
    public void establecerEdificios(Edificio[] m){
        edificios = m;
    }
    
    public void establecerCostoBienesInmuebles(){
        double suma;
        suma = 0;
        //for (int i = 0; i < edificios.length; i++) {
        for (int i = 0; i < obtenerEdificios().length; i++) {
            suma = suma + obtenerEdificios()[i].obtenerCosto(); 
        }
        costoBienesInmuebles = suma;
        //fori
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public Edificio[] obtenerEdificios(){
        return edificios;
    }
    
    public double obtenerCostoBienesInmuebles(){
        return costoBienesInmuebles;
    }

    @Override
    public String toString() {
        String reporte = String.format("%s\nLiata de Edificios\n",
        obtenerNombre());
        
        for (int i = 0; i < obtenerEdificios().length; i++) {
            reporte = String.format("%s%d. %s (%.1f)\n", 
                    reporte,
                    i+1,
                    obtenerEdificios()[i].obtenerNombre().toUpperCase(),
                    obtenerEdificios()[i].obtenerCosto());
        }
        reporte = String.format("%sTotal de Inmuebles: %.1f\n",reporte,
                obtenerCostoBienesInmuebles());
    
        return reporte;
        

    }
    
}
