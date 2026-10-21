
import java.util.Scanner;

public class Kata5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int totalPedido = 0;

        System.out.println("--- Menú de la Cafetería ---");
        System.out.println("1. Café ($4.000)");
        System.out.println("2. Muffin ($3.500)");
        System.out.println("3. Sandwich ($7.500)");
        System.out.println("4. Jugo ($5.000)");
        System.out.println("5. Té ($3.000)");
        System.out.println("6. Salir");

        do {
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> {
                    totalPedido += 4000;
                    System.out.println("Producto agregado: Café ($4.000)");
                }
                case 2 -> {
                    totalPedido += 3500;
                    System.out.println("Producto agregado: Muffin ($3.500)");
                }
                case 3 -> {
                    totalPedido += 7500;
                    System.out.println("Producto agregado: Sandwich ($7.500)");
                }
                case 4 -> {
                    totalPedido += 5000;
                    System.out.println("Producto agregado: Jugo ($5.000)");
                }
                case 5 -> {
                    totalPedido += 3000;
                    System.out.println("Producto agregado: Té ($3.000)");
                }
                case 6 -> System.out.println("Finalizando el pedido");
                default -> System.out.println("Opción inválida");
            }

        } while (opcion != 6);
        System.out.println("Total del pedido: $" + totalPedido);
        entrada.close();
    }
}
