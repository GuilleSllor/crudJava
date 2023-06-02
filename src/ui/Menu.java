package ui;

import java.util.Scanner;

public class Menu {

    public void menu(){
        boolean salir = false;
        int menu=0;

        while(salir==false){


            System.out.println("que operacion quieres realizar");

            System.out.println("1.Crear Alumno nuevo");
            System.out.println("2.Modificar Alumno");
            System.out.println("3.Eliminar Alumno");
            System.out.println("4.Salir");
            menu = new Scanner(System.in).nextInt();
            if(menu == 4 ){ salir = true;}
          /*  switch (menu){
                case 1 -> conexion();
                case 2 -> conexion();
                case 3 -> conexion();
            }
            */

        }


    }

}
