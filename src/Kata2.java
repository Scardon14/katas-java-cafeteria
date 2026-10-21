import java.util.Scanner;
public class Kata2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la bebida: ");
        String nombreBebida = entrada.nextLine();
        System.out.println("Ingrese la temperatura en grados celsius:");
        double temperatura = entrada.nextDouble();

        if (temperatura > 60){
            System.out.println(nombreBebida +":" +" Caliente");
        } else if (temperatura >= 30 && temperatura <= 60) {
            System.out.println(nombreBebida + ":" +" Templada");
        } else if (temperatura < 30) {
            System.out.println(nombreBebida +":" + " Fría");
        }
        entrada.close();
    }
}
