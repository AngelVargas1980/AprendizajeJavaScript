/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Angel Vargas
 */
public class TransporteController {
      Transporte[] tablaTransporte;
    int indiceArray;
    private ConexionBaseDeDatos conectorBD;
    private Connection conexion;
    private PreparedStatement statement = null;
    private ResultSet result = null;
    
    public TransporteController(){
        this.tablaTransporte = new Transporte[100];
        this.indiceArray=0;
    }
    
     public void guardarTransporte(Transporte transporte){
        this.tablaTransporte[this.indiceArray]=transporte;  
        this.indiceArray=this.indiceArray+1;
        // procedimiento para almacenar en la Base de Datos
    }
    
    public Transporte[] getTransportes(){
        return this.tablaTransporte;
    }
    
    public void abrirConexion(){
        conectorBD= new ConexionBaseDeDatos();
        conexion=conectorBD.conectar();
    }    
   
    
    public String guardarTransporte2(Transporte transporte){        
        String sql = "INSERT INTO proyecto.transporte(numero_piloto, nombre_piloto, telefono_piloto, fecha_egreso, hora_egreso, destino, tipo_carga, genero_idgenero) ";
             sql += " VALUES(?,?,?,?,?,?,?,?)";              
       try{     
            abrirConexion();            
            statement = conexion.prepareStatement(sql); 
            statement.setInt(1, transporte.getCodigo_piloto());
            statement.setString(2, transporte.getNombre_piloto());
            statement.setInt(3, transporte.getTelefono_piloto());
            statement.setInt(4, transporte.getFecha_egreso());
            statement.setInt(5, transporte.getHora_egreso());    
            statement.setString(6, transporte.getDestino());
            statement.setString(7, transporte.getTipo_carga());
            statement.setInt(8, transporte.getTipo());
                int resultado = statement.executeUpdate(); 
                if(resultado > 0){
                    return String.valueOf(resultado);
                }else{
                    return String.valueOf(resultado);
                }
        }catch(SQLException e){ 
            return e.getMessage();
        }
    }
    
    public void getTransportes2(StringBuffer respuesta){   
        String sql="select * from proyecto.transporte";
        try{
        abrirConexion();
        respuesta.setLength(0); 
        statement= conexion.prepareStatement(sql);                        
        result = statement.executeQuery();            
            if (result!=null){
                while (result.next()){
                respuesta.append("<tr>");
                respuesta.append("<td >").append(result.getInt("numero_piloto")).append("</td>");
                respuesta.append("<td >").append(result.getString("nombre_piloto")).append("</td>");
                respuesta.append("<td >").append(result.getInt("telefono_piloto")).append("</td>");
                respuesta.append("<td >").append(result.getInt("fecha_egreso")).append("</td>");
                respuesta.append("<td >").append(result.getInt("hora_egreso")).append("</td>");       
                respuesta.append("<td >").append(result.getString("destino")).append("</td>");
                respuesta.append("<td >").append(result.getString("tipo_carga")).append("</td>");
                
                respuesta.append("<td id=\"").append(result.getInt("numero_piloto"))
                        .append("\"  onclick=\"eliminarTransporte(this.id);\">") 
                         
                        .append(" <a class=\"btn btn-warning\"'><i class=\"fas fa-edit\"></i>  </a>"
                                +" <a class=\"btn btn-danger\"'> <i class=\"fas fa-trash-alt\"></i> </a>"
                                + " <td></tr>");
                }
            }else{
                respuesta.append("error al consultar");
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public String eliminarTransporte(int carne){        
        String sql = "DELETE FROM transporte WHERE numero_piloto="+carne;              
       try{     
            abrirConexion();
            statement = conexion.prepareStatement(sql); 
            int resultado = statement.executeUpdate();
            if(resultado > 0){
                return String.valueOf(resultado);
            }else{
                return String.valueOf(resultado);
            }
        }catch(SQLException e){ 
            return e.getMessage();
        }
    }
    
    
}
