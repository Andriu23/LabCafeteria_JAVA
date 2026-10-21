import java.util.Scanner;

public class Kata3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int precio = 1;
        int subTotal = 0;

        while (precio != 0) {
            System.out.print("Ingresa el precio del producto (0 para terminar): ");
            precio = entrada.nextInt();

            subTotal = subTotal + precio;
        }

        int iva = (int) (subTotal * 0.19 );
        int total = subTotal + iva;

        System.out.println("Subtotal: $" + subTotal);
        System.out.println("IVA (19%): $" + iva);

        if (total > 50000) {
            int descuento = (int) (total * 0.10);
            int totalFinal = total - descuento;

            System.out.println("Total con IVA: $" + total);
            System.out.println("Descuento (10%): $" + descuento);
            System.out.println("Total a pagar: $" + totalFinal);
        } else {
            System.out.println("Total: $" + total);
        }

        entrada.close();
    }
}