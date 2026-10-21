
import java.util.Scanner;

public class Kata6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int hora;
        int clientes;
        int totalClientes = 0;
        int contadorHoras = 0;
        int horaPico = -1;
        int maxClientes = -1;

        System.out.println("Registro de Clientes por Hora");
        System.out.print("Ingresa la hora (0-23, -1 para terminar): ");
        hora = entrada.nextInt();

        while (hora != -1) {
            if (hora < 0 || hora > 23) {
                System.out.println("Hora inválida");
            } else {
                System.out.print("Ingresa el número de clientes en esa hora: ");
                clientes = entrada.nextInt();

                if (clientes < 0) {
                    System.out.println("El número de clientes no puede ser negativo.");
                } else {
                    totalClientes += clientes;
                    contadorHoras++;

                    if (clientes > maxClientes) {
                        maxClientes = clientes;
                        horaPico = hora;
                    }
                }
            }

            System.out.print("Ingresa la hora (0-23, -1 para terminar): ");
            hora = entrada.nextInt();
        }

        if (contadorHoras == 0) {
            System.out.println("No se ingresaron datos");
        } else {
            double promedio = (double) totalClientes / contadorHoras;

            System.out.println("\n--- Reporte de Clientes ---");
            System.out.println("Total de clientes: " + totalClientes);
            System.out.println("Promedio por hora: " + String.format("%.2f", promedio));
            System.out.println("Hora con más clientes: " + horaPico
                    + " (" + maxClientes + " clientes)");
        }

        entrada.close();
    }
}
