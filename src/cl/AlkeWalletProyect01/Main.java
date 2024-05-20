package cl.AlkeWalletProyect01;

/**
 * @author Alexis Santander
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = new Cuenta(0); 

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Ver saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Convertir moneda");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + cuenta.getSaldo());
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 4:
                    System.out.println("1. Euros a Dólares");
                    System.out.println("2. Dólares a Euros");
                    System.out.println("3. Dólares a CLP");
                    System.out.print("Seleccione una opción: ");
                    int opcionConversion = scanner.nextInt();
                    if (opcionConversion == 1) {
                        System.out.print("Ingrese la cantidad en euros: ");
                        double euros = scanner.nextDouble();
                        double dolares = Currency.convertirEurosADolares(euros);
                        System.out.printf("%.2f euros equivalen a %.2f dólares%n", euros, dolares);
                    } else if (opcionConversion == 2) {
                        System.out.print("Ingrese la cantidad en dólares: ");
                        double dolaresInput = scanner.nextDouble();
                        double eurosOutput = Currency.convertirDolaresAEuros(dolaresInput);
                        System.out.printf("%.2f dólares equivalen a %.2f euros%n", dolaresInput, eurosOutput);
                    }  else if (opcionConversion == 3) {
                        System.out.print("Ingrese la cantidad en dólares: ");
                        double dolaresInput = scanner.nextDouble();
                        double clpOutput = Currency.convertirDolaresACLP(dolaresInput);
                        System.out.printf("%.2f dólares equivalen a %.2f clp%n", dolaresInput, clpOutput);
                    }
                    else {
                        System.out.println("Opción inválida. Intente nuevamente.");
                    
                    }
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
		}
	
	}


