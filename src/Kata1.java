import java.util.Scanner;

public class Kata1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el total de la cuenta: ");
        double totalCuenta= entrada.nextDouble();
        System.out.println("Ingrese el porcentaje de la propina: ");
        double porcentajePropina = entrada.nextDouble();

        if (totalCuenta <= 0){
            System.out.println("Error: Total inválido.");
        } else if (porcentajePropina < 0 || porcentajePropina > 100) {
            System.out.println("Error: Porcentaje inválido.");
        }else {
            double propina = (totalCuenta * porcentajePropina) / 100;
            double totalPago = totalCuenta + propina;
            System.out.println("Propina = $" + propina);
            System.out.println("Total a pagar = $" + totalPago);
            if(porcentajePropina > 30){
                System.out.println("¡Propina generosa!");
            }else if(porcentajePropina < 5){
                System.out.println("Propina muy baja");
            }
        }
        entrada.close();
    }
}
