package services;
import model.Alumno;
import java.sql.*;
/*La clase AlumnoDao es una conversion donde se realiza un a serie de metodos que van a ser utlizados
* para acceder a la BBDD(listar,buscar,borrar,insertar...etc)*/
public class AlumnoDao extends Conexion{
    String sql;
    //el metodo create inserta un nuevo alumno en la base de datos

    public void create(Alumno a){
        Connection con = connectar();
        sql="INSERT INTO alumnos (nombre,curso,media,fnac) VALUES(?,?,?,?);";
        try {
            PreparedStatement pt =con.prepareStatement(sql);
            pt.setString(1,a.getNombre());
            pt.setString(2,a.getCurso());
            pt.setFloat(3,a.getMedia());
            //la fecha de nacimiento la recibimos como java.util.date y la debemos castear a sql.Date
            java.sql.Date sqlDate = new Date(a.getfNacimiento().getTime());
            pt.setDate(4,sqlDate);

        }catch (SQLException e){
            e.printStackTrace();

        }

    }
}
