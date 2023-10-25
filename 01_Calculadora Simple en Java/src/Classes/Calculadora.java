package Classes;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Operaciones calculator = new Operaciones();

        int menuOption = 0;
        int n1 = 0, n2 = 0;
        String repeat_answer = "SI";

        System.out.println("Calculadora Simple en JAVA\n");

        while (menuOption != 5) {
            System.out.println("Menu:\n");
            System.out.print("1.Suma \n2.Resta \n3.Multiplicacion \n4.Division \n5.Salir\n");
            System.out.print("\nSelecciona una operacion: ");

            while (true) {
                if (scanner.hasNextInt()) {
                    menuOption = scanner.nextInt();
                    break; // Sale del bucle si se proporciona un número válido.
                } else {
                    System.out.print("Entrada inválida. Por favor, ingresa un número entero: ");
                    scanner.next(); // Limpia la entrada incorrecta.
                }
            }

            if (menuOption > 0 && menuOption < 5) {
                System.out.print("\nIngresa el primer numero: ");
                n1 = scanner.nextInt();
                System.out.print("Ingresa el segundo numero: ");
                n2 = scanner.nextInt();
                repeat_answer = "NO";
            }

            switch (menuOption) {
                case 1 ->
                    calculator.sumar(n1, n2);
                case 2 ->
                    calculator.restar(n1, n2);
                case 3 ->
                    calculator.multiplicar(n1, n2);
                case 4 ->
                    calculator.dividir(n1, n2);
                case 5 ->
                    System.exit(0);
                default ->
                    System.out.println("\nValor incorrecto, ingresa uno nuevamente\n");
            }

            while (!"SI".equals(repeat_answer)) {
                System.out.print("\nDeseas repetir otra operacion? (SI / NO): ");
                repeat_answer = scanner.next().toUpperCase();
                if ("NO".equals(repeat_answer)) {
                    System.exit(0);
                } else if (!"SI".equals(repeat_answer)) {
                    System.out.println("Opcion No valida...(SI / NO)");
                }
            }
        }

    }

}
