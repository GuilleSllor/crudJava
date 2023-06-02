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
        setNombre(nombre);
        setCurso(curso);
        this.media = media;
        this.fNacimiento = fNacimiento;
    }

    //metodo para delimitar caracteres del nombre ->50 carateres

    public void setNombre(String nombre) {
        if(nombre.length()<51 && !nombre.startsWith("'") && !nombre.endsWith("'")){
        this.nombre = nombre.substring(0,Math.min(TAMNOMBRE,nombre.length()));

        }
        else{
            System.out.println("nombre no valido");
        }
    }
    public void setCurso(String curso){
        this.curso=curso.substring(Math.min(2,curso.length()));
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public int getMedia() {
        return media;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
//metodo para delimitar caracteres del curso -> 2 caracteres


}
