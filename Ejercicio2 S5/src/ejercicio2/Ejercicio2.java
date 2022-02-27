package ejercicio2;

import java.util.Scanner;
//importamos los paquetes y luego la clase como se llama
import CalculadoraBasica.CalculadoraBasica;
import CalculadoraAvanzada.CalculadoraAvanzada;

public class Ejercicio2 {

    public static void main(String[] args) {
        int calculadora, opcion;
        double num1 = 0, num2 = 0, resultado = 0;
        String eleccion = "";

        Scanner leer = new Scanner(System.in);
        //instanciamos cada clase de las calculadoras para con ese objeto hacer uso de sus metodos dentro de cada clase
        CalculadoraBasica basica = new CalculadoraBasica();
        CalculadoraAvanzada avanzada = new CalculadoraAvanzada();

        System.out.println("ELIJA LA CALCULADORA: Basica = 1, Avanzada = 2");
        calculadora = leer.nextInt();
        //verificamos que calculador eligio el usuario
        if (calculadora == 1) {
            System.out.println("Elija la opcion: suma = 1, resta = 2, division = 3, multiplicacion = 4");
            opcion = leer.nextInt();
            System.out.println("Ingrese el numero 1: ");
            num1 = leer.nextDouble();
            System.out.println("Ingrese el numero 2: ");
            num2 = leer.nextDouble();
            //evaluamos en el switch la opcion ingresada 
            switch (opcion) {
                case 1:
                    eleccion = "suma";
                    resultado = basica.suma(num1, num2);
                    break;
                case 2:
                    eleccion = "resta";
                    resultado = basica.resta(num1, num2);
                    break;
                case 3:
                    eleccion = "multiplicacion";
                    resultado = basica.multiplicacion(num1, num2);
                    break;
                case 4:
                    eleccion = "division";
                    resultado = basica.division(num1, num2);
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Elija la opcion: potencia = 1, factorial = 2, opuesto = 3");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    eleccion = "potencia";
                    System.out.println("Ingrese el numero 1: ");
                    num1 = leer.nextDouble();
                    System.out.println("Ingrese el numero 2: ");
                    num2 = leer.nextDouble();
                    resultado = avanzada.potencia(num1, num2);
                    break;
                case 2:
                    eleccion = "factorial";
                    System.out.println("Ingrese el numero 1: ");
                    num1 = leer.nextDouble();
                    resultado = avanzada.factorial(num1);
                    break;
                case 3:
                    eleccion = "opuesto";
                    System.out.println("Ingrese el numero 1: ");
                    num1 = leer.nextDouble();
                    resultado = avanzada.opuesto(num1);
                    break;
                default:
                    break;
            }
        }
        
        System.out.println("El resultado de la operacion " + eleccion + " es: " + resultado);
    }

}
