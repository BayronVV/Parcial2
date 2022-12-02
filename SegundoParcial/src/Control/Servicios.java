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
    
}
