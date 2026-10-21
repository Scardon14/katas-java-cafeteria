import java.util.Scanner;

public class Kata4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número del día de la semana teniendo en cuenta que 1 es lunes y 7 es domingo: ");
        int dia = entrada.nextInt();
        System.out.println("Ingrese la hora en formato 0-23: ");
        int hora = entrada.nextInt();

        if (dia < 1 || dia >7){
            System.out.println("Error: día inválido");
        } else if (hora < 0 || hora > 23){
            System.out.println("Error: hora inválida.");
        } else {
            String nombreDia = switch (dia){
                case 1 -> "Lunes";
                case 2 -> "Martes";
                case 3 -> "Miercoles";
                case 4 -> "Jueves";
                case 5 -> "Viernes";
                case 6 -> "Sabado";
                case 7 -> "Domingo";
                default -> "Error: día inválido";
            };
            if (dia >= 1 && dia <= 5 && hora >= 6 && hora < 20) {
                System.out.println("La cafetería está abierta");
            } else if (dia == 6 && hora >= 7 && hora < 14) {
            System.out.println("La cafetería está abierta");
            }else {
                System.out.println("La cafetería está cerrada");
            }

            if (dia >= 1 && dia <=5){

                    System.out.println("Horario de "+nombreDia+" : 6:00 am - 8:00 pm." );
                } else if (dia == 6) {
                    System.out.println("Horario de "+ nombreDia +" : 7:00 am - 2:00 pm.");
                }else {
                    System.out.println("Horario de " + nombreDia + ": cerrado todo el día.");
                }
        }
        entrada.close();
    }
}
