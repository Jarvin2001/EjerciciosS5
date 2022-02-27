package CalculadoraAvanzada;

public class CalculadoraAvanzada {

    public double potencia(double num1, double potencia) {
        //las potencias se sacan utilizando la funcion Math.pow el primer valor es el numero el segundo es a que potencia ira
        return Math.pow(num1, potencia);
    }

    public double factorial(double num1) {
        //el factorial se saca multiplicando desde el 1 hasta llegar al numero indicado por eso empezamos con 1
        double factorial = 1;
        while (num1 != 0) {
            factorial = factorial * num1;
            //aca decrementamos para ir multiplicando hacia abajo
            num1--;
        }

        return factorial;
    }
    
    public double opuesto(double num1) {
       double opuesto = 0;
       //si el numero es positivo multiplicamos * -1 y asi se vuelve negativo
       if(num1 > 0){
           opuesto = num1 * -1;
       }
       else if(num1 < 0){
           //si el numero es menor a 0 usamos la funcion Math.abs la cual nos invierte el numero a positivo
           opuesto = Math.abs(num1);
       }
       
       return opuesto;
    }
}
