package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection con;

    private String url;

    private String user;

    private String pass;

    public Connection connectar(){
        url="jdbc:mariadb://localhost:3306/instituto";
        user="root";
        pass="";
        try{
            con= DriverManager.getConnection(url,user,pass);
            System.out.println("conexion realizada con exito");

        }catch(SQLException e) {
            e.printStackTrace();
        }
        return con;
    }


}
