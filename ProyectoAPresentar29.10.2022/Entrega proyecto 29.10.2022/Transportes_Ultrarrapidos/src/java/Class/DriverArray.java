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
 * @author Hatziry Chacón
 */
public class DriverArray {
    Driver[] driverArray;
    int index;

    private DatabasaConnection connectDB;
    private Connection connection;
    private PreparedStatement statement = null;
    private ResultSet resultSet = null;

    public DriverArray() {
        driverArray = new Driver[100];
        this.index = 0;
    }

    public void openConnection() {
        connectDB = new DatabasaConnection();
        connection = connectDB.connection();
    }

    public String saveDriver(Driver driver) {
        String sql = "INSERT INTO transportes_ultrarrapidos_sa.piloto(id_dpi_piloto, nombre, apellido, telefono, direccion_de_domicilio) ";
        sql += " VALUES(?,?,?,?,?)";
        try {
            openConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, driver.getDpi());
            statement.setString(2, driver.getName());
            statement.setString(3, driver.getLastName());
            statement.setInt(4, driver.getPhone());
            statement.setString(5, driver.getAddress());
            int resultado = statement.executeUpdate();

            if (resultado > 0) {
                return String.valueOf(resultado);
            } else {
                return String.valueOf(resultado);
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public void getDriver(StringBuffer respuesta) {
        String sql = "select * from transportes_ultrarrapidos_sa.piloto";
        try {
            openConnection();
            respuesta.setLength(0);

            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            if (resultSet != null) {
                while (resultSet.next()) {
                    respuesta.append("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">\n"
                            + "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct\" crossorigin=\"anonymous\"></script>"
                            + "<script src=\"//cdn.jsdelivr.net/npm/sweetalert2@11\"></script>"
                            + "<script src=\"js/scriptDriver.js\" type=\"text/javascript\"></script>"
                    );
                    respuesta.append("<tr>");
                    respuesta.append("<td >").append(resultSet.getString("id_dpi_piloto")).append("</td>");
                    respuesta.append("<td >").append(resultSet.getString("nombre")).append("</td>");
                    respuesta.append("<td >").append(resultSet.getString("apellido")).append("</td>");
                    respuesta.append("<td >").append(resultSet.getString("telefono")).append("</td>");
                    respuesta.append("<td >").append(resultSet.getString("direccion_de_domicilio")).append("</td>");
                    respuesta.append("<td id=\"").append(resultSet.getString("id_dpi_piloto"))
                            .append("\"  onclick=\"deleteDriver(this.id);\">")
                            .append(" <a class=\"btn btn-warning\"'><i class=\"fas fa-edit\"></i>  </a>"
                                    + " <a class=\"btn btn-danger\"'> <i class=\"fas fa-trash-alt\"></i> </a>"
                                    + " <td></tr>");
                }
            } else {
                respuesta.append("error al consultar");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public String deleteDriver(int dpi) {
        String sql = "DELETE FROM piloto WHERE id_dpi_piloto = " + dpi;
        try {
            openConnection();
            statement = connection.prepareStatement(sql);
            int resultado = statement.executeUpdate();
            if (resultado > 0) {
                return String.valueOf(resultado);
            } else {
                return String.valueOf(resultado);
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
}
