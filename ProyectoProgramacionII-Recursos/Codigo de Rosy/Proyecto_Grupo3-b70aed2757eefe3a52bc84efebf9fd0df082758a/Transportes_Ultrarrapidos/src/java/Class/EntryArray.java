/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ramir
 */
public class EntryArray {
    Entry[] entryRegister;
    int indexArray;
    
    private DatabasaConnection connectDB;
    private Connection connection;
    private PreparedStatement statement = null;
    private ResultSet resultSet = null;
    
    public EntryArray(){
        entryRegister = new Entry[100];
        this.indexArray = 0;
    }
    
    public void openConnection(){
        connectDB= new DatabasaConnection();
        connection=connectDB.connection();
    }
    
    public String registerEntry(Entry entry){        
        String sql = "INSERT INTO transportes_ultrarrápidos_sa.registro_ingreso(hora, dia, mes_año, Origen, Tipo_Carga, Bodega_id_Bodega) ";
             sql += " VALUES(  ?,?,?,?,?, ?)"; 
        try{
            openConnection();
            statement = connection.prepareStatement(sql); 
            statement.setString(1, entry.getTime());
            statement.setInt(2, entry.getDay());
            statement.setString(3, entry.getMonthYear());
            statement.setString(4, entry.getOrigin());
            statement.setString(5, entry.getCargoType());
            statement.setString(6, entry.getDepot());
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
    public void getEntry(StringBuffer respuesta){   
        String sql="select * from transportes_ultrarrápidos_sa.registro_ingreso";
        try{
        openConnection();
        respuesta.setLength(0);
                
        statement= connection.prepareStatement(sql);                        
        resultSet = statement.executeQuery();            
            if (resultSet!=null){
                while (resultSet.next()){
                respuesta.append("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">\n" +
                     "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct\" crossorigin=\"anonymous\"></script>"
                     +"<script src=\"//cdn.jsdelivr.net/npm/sweetalert2@11\"></script>"
                     +"<script src='js/script.js'></script>"
                     );
                respuesta.append("<tr>");
                respuesta.append("<td >").append(resultSet.getString("id_Registro_Ingreso")).append("</td>");
                respuesta.append("<td >").append(resultSet.getString("id_dpi_Piloto")).append("</td>");
                respuesta.append("<td >").append(resultSet.getString("id_Predio")).append("</td>");
                respuesta.append("<td >").append(resultSet.getString("Placa_Camion")).append("</td>");
                respuesta.append("<td >").append(resultSet.getString("hora")).append("</td>");
                respuesta.append("<td >").append(resultSet.getInt("dia")).append("</td>");
                respuesta.append("<td >").append(resultSet.getString("mes_año")).append("</td>");
                respuesta.append("<td >").append(resultSet.getString("Origen")).append("</td>");
                respuesta.append("<td >").append(resultSet.getString("Tipo_Carga")).append("</td>");
                respuesta.append("<td id=\"").append(resultSet.getString("id_Registro_Ingreso"))
                        .append("\"  onclick=\"deleteEntry(this.id);\">") 
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
    
        public String deleteEntry(int idRegister){
        String sql = "DELETE FROM registro_ingreso WHERE id_Registro_Ingreso = "+idRegister;
        try{
            openConnection();
            statement = connection.prepareStatement(sql);
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
