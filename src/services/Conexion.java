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
        //existe documentacion que indica que no necesitas invocar el Driver.Class pero si lo necesitas!!!
        //estos valores no se van a cambiar, por lo cual  podrian ser final
        //insertar en la url el utf-8 para que reconozca los caracteres especiales.
        url="jdbc:mariadb://localhost:3306/instituto?useUnicode=true&CharacterEncoding=utf-8";
        user="root";
        pass="";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(url,user,pass);
            System.out.println("conexion realizada con exito");

        }catch(SQLException e) {
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return con;
    }


}
