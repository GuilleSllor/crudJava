package model;

import java.sql.*;

public class Alumno {
    private int id;
    private String nombre;
    private String curso;
    private int media;
    private Date fNacimiento;
    private final int TAMNOMBRE=50;

    public Alumno(int id){
        this.id=id;
    }
    public Alumno(int id, String nombre, String curso, int media, Date fNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.media = media;
        this.fNacimiento = fNacimiento;
    }

}
