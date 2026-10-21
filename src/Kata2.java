import java.util.Scanner;

public class Kata2 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner entrada = new Scanner(System.in);

        String bebida;
        double gradosCelsius;

        do {
            System.out.print("Ingrese el nombre de la bebida: ");
            bebida = entrada.nextLine();

            if (bebida.length() < 2) {
                System.out.println("El nombre de la bebida es inválido");
            }

        } while (bebida.length() < 2);

        System.out.print("Ingresa la temperatura: ");
        gradosCelsius = entrada.nextDouble();

        String mensaje;

        if (gradosCelsius > 60) {
            mensaje = "Caliente";
        } else if (gradosCelsius >= 30 && gradosCelsius <= 60) {
            mensaje = "Templada";
        } else {
            mensaje = "Fría";
        }

        System.out.println(bebida + " : " + mensaje);

        entrada.close();
    }
}