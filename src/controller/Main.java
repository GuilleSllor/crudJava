package controller;

import model.Alumno;
import services.AlumnoDao;


import java.text.ParseException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws ParseException {
    Alumno a = new Alumno("Maria","1A",15,"2022-12-01");
    AlumnoDao alumnoDao=new AlumnoDao();
    alumnoDao.create(a);


    }
}