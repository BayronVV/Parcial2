/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author estudiante
 */
import java.sql.*;
public class SeleccionServicios {
    
   public Integer m,m1;
   public String n,n1;
          
   
   
    public void guardar(Connection conexion, Seleccion d) throws SQLException{
    
        try{
            
           PreparedStatement consulta;
           consulta = conexion.prepareStatement("INSERT INTO seleccion (id, nombre, continente_id, tecnico, goles_favor, goles_contra, partidos_ganados, partidos_perdidos, partidos_jugados)"+"VALUES(?,?,?,?,?,?,?,?,?)");
           consulta.setInt(1, d.getId());
           consulta.setString(2, d.getNombre());
           consulta.setInt(3, d.getContinente_id());
           consulta.setString(4, d.getTecnico());
           consulta.setInt(5, d.getGoles_favor());
           consulta.setInt(6, d.getGoles_contra());
           consulta.setInt(7, d.getPartidos_ganados());
           consulta.setInt(8, d.getPartidos_perdidos());
           consulta.setInt(9, d.getPartidos_jugados());
           consulta.executeUpdate();
            
        }
        catch (SQLException ex){
            
            throw new SQLException(ex);
        
        }
        
        
   
    }
    
    public void eliminar(Connection conexion, Seleccion d)throws SQLException{
    
        try{
            
           PreparedStatement consulta;
           consulta = conexion.prepareStatement("DELETE FROM seleccion WHERE `seleccion`.`id`=?");
           consulta.setInt(1, d.getId());
       
           consulta.executeUpdate();
            
        }
        catch (SQLException ex){
            
            throw new SQLException(ex);
        
        }
    
    }
    
    public void buscar(Connection conexion, Seleccion d) throws SQLException{
    
        try{
            
           PreparedStatement consulta;
           consulta = conexion.prepareStatement("select * from seleccion where id=? ");
           consulta.setInt(1, d.getId());
          ResultSet rs = consulta.executeQuery();
          
          while(rs.next()){
              
              d.setNombre(rs.getString("nombre"));
              d.setContinente_id(rs.getInt("continente_id"));
              d.setTecnico(rs.getString("tecnico"));
              d.setGoles_favor(rs.getInt("goles_favor"));
              d.setGoles_contra(rs.getInt("goles_contra"));
              d.setPartidos_ganados(rs.getInt("partidos_ganados"));
              d.setPartidos_perdidos(rs.getInt("partidos_perdidos"));
              d.setPartidos_jugados(rs.getInt("partidos_jugados"));
              
              
             
          
          }
         
           
          
            
        }
        catch (SQLException ex){
            
            throw new SQLException(ex);
        
        }
    }
    
    public void actualizar(Connection conexion, Seleccion d) throws SQLException{
    
        try{
            
           PreparedStatement consulta;
           consulta = conexion.prepareStatement("UPDATE seleccion set nombre=?,continente_id=?, tecnico=?, goles_favor=?, goles_contra=?, partidos_ganados=?, partidos_perdidos=?, partidos_jugados=? where id=?");
          
           consulta.setString(1, d.getNombre());
           consulta.setInt(2, d.getContinente_id());
           consulta.setString(3, d.getTecnico());
           consulta.setInt(4, d.getGoles_favor());
           consulta.setInt(5, d.getGoles_contra());
           consulta.setInt(6, d.getPartidos_ganados());
           consulta.setInt(7, d.getPartidos_perdidos());
           consulta.setInt(8, d.getPartidos_jugados());
           consulta.setInt(9,d.getId());
           consulta.executeUpdate();
            
        }
        catch (SQLException ex){
            
            throw new SQLException(ex);
        
        }
    }
    
    public void mayorGoles(Connection conexion, Seleccion d)throws SQLException{
      
         
        try{
            
           Statement sta = conexion.createStatement();
           String consulta = "select max(partidos_ganados) as mayor,max(nombre) as nombre from seleccion";
           ResultSet rs = sta.executeQuery(consulta);
      
           rs.next();
            m = rs.getInt("mayor");
          
            n = rs.getString("nombre");
       
       
      
         
           rs.close();
           sta.close();
            
        }
        catch (SQLException ex){
            
            throw new SQLException(ex);
        
        }
        
    }
    
    public void mayorDif(Connection conexion, Seleccion d)throws SQLException{
      
         
        try{
            
           Statement sta = conexion.createStatement();
           String consulta = "SELECT goles_favor - goles_contra as diferencia, nombre from seleccion ORDER BY `diferencia` DESC";
           ResultSet rs = sta.executeQuery(consulta);
      
           rs.next();
            m1 = rs.getInt("diferencia");
            
          
            n1 = rs.getString("nombre");
       
       
      
         
           rs.close();
           sta.close();
            
        }
        catch (SQLException ex){
            
            throw new SQLException(ex);
        
        }
        
    }
}
