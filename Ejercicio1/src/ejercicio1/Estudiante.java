
package ejercicio1;

import java.util.Scanner;

public class Estudiante {

    //datos que se inicializan en el constructor
    String nombre, carnet;
    int edad;
    //materias que se llenan con el metodo
    String mat1, mat2, mat3, mat4, mat5;
    //datos personales
    String numeroTelefono,direccion, responsable; 
    //declaramos el scanner 
    Scanner leer = new Scanner(System.in);
    //este seria el constructor de la clase el cual lleva el mismo nombre y recibe 3 parametros y los valores que recibe
    //se le asignan a las variables dentro
    public Estudiante(String nombre, int edad, String carnet) {
        this.nombre = nombre;
        this.edad = edad;
        this.carnet = carnet;
    }
    
    public void capturaMaterias(){
    
        System.out.println("Ingrese la materia 1: ");
        mat1 = leer.nextLine();
        System.out.println("Ingrese la materia 2: ");
        mat2 = leer.nextLine();
        System.out.println("Ingrese la materia 3: ");
        mat3 = leer.nextLine();
        System.out.println("Ingrese la materia 4: ");
        mat4 = leer.nextLine();
        System.out.println("Ingrese la materia 5: ");
        mat5 = leer.nextLine();
    }
    
    public void datosPersonales(){
        System.out.println("Ingrese numero de telefono de estudiante: ");
        numeroTelefono = leer.nextLine();
        System.out.println("Ingrese direccion de estudiante: ");
        direccion = leer.nextLine();
        System.out.println("Ingrese responsable de estudiante: ");
        responsable = leer.nextLine();
    }
}
