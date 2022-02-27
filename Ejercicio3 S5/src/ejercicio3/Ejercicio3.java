/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

class Animal {
    String nombre;
    int edad;
    String alimento;
}

//con extends realizamos la herencia de la clase animal ya tenemos acceso a sus miembros
class Gallo extends Animal {

    String colorPlumas;

    public void Captura() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del gallo: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad del gallo: ");
        edad = leer.nextInt();
        System.out.println("Ingrese el alimento del gallo: ");
        alimento = leer.nextLine();
        alimento = leer.nextLine();
        System.out.println("Ingrese el color de plumas del gallo: ");
        colorPlumas = leer.nextLine();
    }

    public void mostrarDatos() {
        System.out.println("nombre del gallo: " + nombre);
        System.out.println("edad del gallo: " + edad);
        System.out.println("alimento del gallo: " + alimento);
        System.out.println("color de plumas del gallo: " + colorPlumas + "\n");

    }
}

class Perro extends Animal {

    String colorPelaje;
    
    public void Captura() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del perro: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad del perro: ");
        edad = leer.nextInt();
        System.out.println("Ingrese el alimento del perro: ");
        alimento = leer.nextLine();
        alimento = leer.nextLine();
        System.out.println("Ingrese el color de pelaje del perro: ");
        colorPelaje = leer.nextLine();
    }

    public void mostrarDatos() {
        System.out.println("nombre del perro: " + nombre);
        System.out.println("edad del perro: " + edad);
        System.out.println("alimento del perro: " + alimento);
        System.out.println("color de pelaje del perro: " + colorPelaje + "\n");

    }
}

class Gato extends Animal {

    String colorOjos;
    
    public void Captura() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del gato: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad del gato: ");
        edad = leer.nextInt();
        System.out.println("Ingrese el alimento del gato: ");
        alimento = leer.nextLine();
        alimento = leer.nextLine();
        System.out.println("Ingrese el color de ojos del gato: ");
        colorOjos = leer.nextLine();
    }

    public void mostrarDatos() {
        System.out.println("nombre del gato: " + nombre);
        System.out.println("edad del gato: " + edad);
        System.out.println("alimento del gato: " + alimento);
        System.out.println("color de ojos del gato: " + colorOjos + "\n");

    }
}

class Hamster extends Animal {

    int cantidadPulgas;
    
    public void Captura() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del hamster: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad del hamster: ");
        edad = leer.nextInt();
        System.out.println("Ingrese el alimento del hamster: ");
        alimento = leer.nextLine();
        alimento = leer.nextLine();
        System.out.println("Ingrese la cantidad de pulgas del hamster: ");
        cantidadPulgas = leer.nextInt();
    }

    public void mostrarDatos() {
        System.out.println("nombre del hamster: " + nombre);
        System.out.println("edad del hamster: " + edad);
        System.out.println("alimento del hamster: " + alimento);
        System.out.println("cantidad de pulgas del hamster: " + cantidadPulgas);

    }
}

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Gallo gallo = new Gallo();
        Perro perro = new Perro();
        Gato gato = new Gato();
        Hamster hamster = new Hamster();
        
        gallo.Captura();
        gallo.mostrarDatos();
        
        perro.Captura();
        perro.mostrarDatos();
        
        gato.Captura();
        gato.mostrarDatos();
        
        hamster.Captura();
        hamster.mostrarDatos();
    }

}
