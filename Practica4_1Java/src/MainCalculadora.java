
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Jose Carlos Garrocho Radu
 */
public class MainCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;

        while (!salir) {
            System.out.println("\n*** Calculadora ***");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opción:");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer número:");
                    double num1 = scanner.nextDouble();

                    System.out.println("Ingrese el segundo número:");
                    double num2 = scanner.nextDouble();

                    double resultadoSuma = Calculator.sumar(num1, num2);
                    System.out.println("El resultado de la suma es: " + resultadoSuma);
                    break;
                case 2:
                    System.out.println("Ingrese el primer número:");
                    double num1Resta = scanner.nextDouble();

                    System.out.println("Ingrese el segundo número:");
                    double num2Resta = scanner.nextDouble();

                    double resultadoResta = Calculator.restar(num1Resta, num2Resta);
                    System.out.println("El resultado de la resta es: " + resultadoResta);
                    break;
                case 3:
                    System.out.println("Ingrese el primer número:");
                    double num1Multiplicacion = scanner.nextDouble();

                    System.out.println("Ingrese el segundo número:");
                    double num2Multiplicacion = scanner.nextDouble();

                    double resultadoMultiplicacion = Calculator.multiplicar(num1Multiplicacion, num2Multiplicacion);
                    System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
                    break;
                case 4:
                    salir = true;
                    break;
            }
        }

    }
}
