
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
            System.out.println("2. Salir");
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
                    salir = true;
                    break;
            }
        }

    }
}
