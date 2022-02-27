
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        String nombre, carnet;
        int edad;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Estudiante: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese el carnet del Estudiante: ");
        carnet = leer.nextLine();
        System.out.println("Ingrese la edad del Estudiante: ");
        edad = leer.nextInt();
        //instanciamos la clase Estudiante y como tiene un constructor que recibe 3 parametros se los tenemos que enviar por
        //obligacion 
        Estudiante estudiante = new Estudiante(nombre, edad, carnet);
        //haciendo uso de la instancia a la clase Estudiante tenemos acceso a sus metodos por lo tanto los llamamos abajo
        //para capturar la informacion que el usuario debe ingresar
        estudiante.capturaMaterias();
        estudiante.datosPersonales();
        
        System.out.println("-----------RESULTADOS---------------");
        System.out.println("Nombre: "+ estudiante.nombre);
        System.out.println("Edad: "+ estudiante.edad);
        System.out.println("Carnet: "+ estudiante.carnet);
        
        System.out.println("-----------MATERIAS----------------");
        System.out.println("Materia 1: "+ estudiante.mat1);
        System.out.println("Materia 2: "+ estudiante.mat2);
        System.out.println("Materia 3: "+ estudiante.mat3);
        System.out.println("Materia 4: "+ estudiante.mat4);
        System.out.println("Materia 5: "+ estudiante.mat5);
        
        System.out.println("-----------DATOS PERSONALES-----------------");
        System.out.println("Numero Telefono: "+ estudiante.numeroTelefono);
        System.out.println("Direccion: "+ estudiante.direccion);
        System.out.println("Responsable: "+ estudiante.responsable);
    }
    
}
