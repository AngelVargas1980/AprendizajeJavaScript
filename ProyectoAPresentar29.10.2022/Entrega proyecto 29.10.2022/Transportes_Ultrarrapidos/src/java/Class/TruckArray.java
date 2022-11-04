/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TruckArray {
    
     Truck[] clientTable;
      int indexArray;
    Time time;
    private DatabasaConnection conectorBD;
    private Connection conexion;
    private PreparedStatement statement = null;
    private ResultSet result = null;
    
    public TruckArray(){
        clientTable = new Truck[100];
        this.indexArray = 0;
    }
    

    public void abrirConexion(){
        conectorBD= new DatabasaConnection();
        conexion=conectorBD.connection();
    }
    
    public String registerTruck(Truck camion){        
        String sql = "INSERT INTO transportes_ultrarrapidos_sa.camion(placa_camion, transportista_id_transportista, modelo, capacidad_peso)  ";
             sql += " VALUES( ?,?,?,?)"; 
        try{
            abrirConexion();
            statement = conexion.prepareStatement(sql); 
            statement.setString(1, camion.getPlate());
            statement.setString(2, camion.getModel());
             statement.setString(3, camion.getTrans());
            statement.setString(4, camion.getCapacity());
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

    public String eliminarAlumno(int idTruck){
        String sql = "DELETE FROM camion WHERE placa = "+idTruck;
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
