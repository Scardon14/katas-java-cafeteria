import java.util.Scanner;

public class Kata3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        double precioProducto = entrada.nextDouble();
        double subtotal = 0;

        while (precioProducto > 0){
            subtotal = subtotal + precioProducto;
            System.out.println("Ingrese el precio del producto: ");
            precioProducto = entrada.nextDouble();
        }
        System.out.println("Subtotal: $" + subtotal);
        double totalIva = subtotal * 0.19;
        System.out.println("IVA (19%): $" + totalIva);
        double totalConIva = subtotal + totalIva;
        System.out.println("Total: $" + totalConIva);

        if (totalConIva > 50000){
            double descuento = totalConIva * 0.10;
            System.out.println("Descuento: $" + descuento);
            double totalFinal = totalConIva - descuento;
            System.out.println("Total= $" + totalFinal);
        }
        entrada.close();
    }
}
