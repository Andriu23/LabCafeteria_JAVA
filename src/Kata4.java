import java.util.Scanner;

public class Kata4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int dia;
        int hora;

        // Validar el día
        do {
            System.out.print("Ingresa el día (1=Lunes, 7=Domingo): ");
            dia = entrada.nextInt();

            if (dia < 1 || dia > 7) {
                System.out.println("Error: día inválido");
            }
        } while (dia < 1 || dia > 7);

        // Validar la hora
        do {
            System.out.print("Ingresa la hora (0-23): ");
            hora = entrada.nextInt();

            if (hora < 0 || hora > 23) {
                System.out.println("Error: hora inválida");
            }

        } while (hora < 0 || hora > 23);

        // Evaluar el día con switch
        switch (dia) {

            case 1, 2, 3, 4, 5 -> {
                if (hora >= 6 && hora < 20) {
                    System.out.println("La cafetería está abierta.");
                } else {
                    System.out.println("La cafetería está cerrada.");
                }
                System.out.println("Horario de lunes a viernes: 6:00 AM - 8:00 PM.");
            }

            case 6 -> {
                if (hora >= 7 && hora < 14) {
                    System.out.println("La cafetería está abierta.");
                } else {
                    System.out.println("La cafetería está cerrada.");
                }
                System.out.println("Horario de sábado: 7:00 AM - 2:00 PM.");
            }

            case 7 -> {
                System.out.println("La cafetería está cerrada.");
                System.out.println("Horario de domingo: cerrado todo el día");
            }
        }
        entrada.close();
    }
}