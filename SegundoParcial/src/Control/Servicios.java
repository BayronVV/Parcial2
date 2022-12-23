/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author estudiante
 */
import Modelo.*;
import Servicios.Conexion;
public class Servicios {
    
    public void RegistrarD(Seleccion d){
        
         try{
        
            SeleccionServicios ds = new SeleccionServicios();
            ds.guardar(Conexion.obtener(), d);
        }
        catch(Exception e){
        
        }
    
    }
    
    public void EliminarD(Seleccion d){
    
        try{
        
            SeleccionServicios ds = new SeleccionServicios();
            ds.eliminar(Conexion.obtener(), d);
        }
        catch(Exception e){
        
        }
    
    }
    
    public void Buscard(Seleccion d){
    
        try{
        
            SeleccionServicios ds = new SeleccionServicios();
            ds.buscar(Conexion.obtener(), d);
        }
        catch(Exception e){
        
        }
    }
    
    public void ActualizarD(Seleccion d){
    
        try{
        
            SeleccionServicios ds = new SeleccionServicios();
            ds.actualizar(Conexion.obtener(), d);
        }
        catch(Exception e){
        
        }
    
    }
    
    public Integer MayorD(Seleccion d){
        SeleccionServicios ds = new SeleccionServicios();
        try{
        
         
            ds.mayorGoles(Conexion.obtener(), d);
              
        }
        catch(Exception e){

           
        }
        
        return ds.m;
        
        
    }
    
    public String MayorS(Seleccion d){
        SeleccionServicios ds = new SeleccionServicios();
        try{
        
         
            ds.mayorGoles(Conexion.obtener(), d);
              
        }
        catch(Exception e){

           
        }
        
        return ds.n;
        
        
    }
    
     public Integer MayorDifM(Seleccion d){
        SeleccionServicios ds = new SeleccionServicios();
        try{
        
         
            ds.mayorDif(Conexion.obtener(), d);
              
        }
        catch(Exception e){

           
        }
        
        return ds.m1;
        
        
    }
    
    public String MayorDifN(Seleccion d){
        SeleccionServicios ds = new SeleccionServicios();
        try{
        
         
            ds.mayorDif(Conexion.obtener(), d);
              
        }
        catch(Exception e){

           
        }
        
        return ds.n1;
        
        
    }
    
    public void Lista(Seleccion d){
        SeleccionServicios ds = new SeleccionServicios();
        try{
        
         
            ds.buscar2(Conexion.obtener(), d);
              
        }
        catch(Exception e){

           
        }
        
        //return ds.v;
        
        
    }
}
