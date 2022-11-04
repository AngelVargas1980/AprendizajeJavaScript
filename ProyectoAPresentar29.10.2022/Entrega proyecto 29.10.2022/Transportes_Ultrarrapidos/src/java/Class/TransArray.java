/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransArray {
    
    TransModel[] transTable;
    int indexArray;
    
    private DatabasaConnection conectDB;
    private Connection connection;
    private PreparedStatement statement = null;
    private ResultSet result = null;
    
 
  
    public void openConnection(){
       conectDB= new DatabasaConnection ();
        connection=conectDB.connection();
    }

    public String saveTrans( TransModel trans){        
    String sql = "INSERT INTO  transportes_ultrarrapidos_sa.transportista(id_transportista, nombre, apellido, correo, carne_de_conducir)  ";
             sql += " VALUES(  ?,?,?,?,?)"; 
        try{
            openConnection();
            statement = connection.prepareStatement(sql); 
            statement.setInt(1, trans.getCode());
            statement.setString(2, trans.getName());
            statement.setString(3, trans.getLastName());
            statement.setString(4, trans.getEmail());
             statement.setString(5, trans.getLicense());
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
    
    
    
  public String deleteTrans(int transId){
        String sql = "DELETE FROM transportes_ultrarrapidos_sa.transportista WHERE id_transportista = " + transId;
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