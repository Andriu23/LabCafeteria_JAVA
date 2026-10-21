import java.util.Scanner;

public class Kata5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion = 0;
        int total = 0;

        System.out.print("\n--- Menú de la Cafetería ---\n" +
                "1. Café ($4.000)\n" +
                "2. Muffin ($3.500)\n" +
                "3. Sandwich ($7.500)\n" +
                "4. Jugo ($5.000)\n" +
                "5. Té ($3.000)\n" +
                "6. Salir\n");

        // Repetir la solicitud de opciones
        while (opcion != 6) {
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> {
                    total += 4000;
                    System.out.println("Producto agregado: Café ($4.000)");
                }
                case 2 -> {
                    total += 3500;
                    System.out.println("Producto agregado: Muffin ($3.500)");
                }
                case 3 -> {
                    total += 7500;
                    System.out.println("Producto agregado: Sandwich ($7.500)");
                }
                case 4 -> {
                    total += 5000;
                    System.out.println("Producto agregado: Jugo ($5.000)");
                }
                case 5 -> {
                    total += 3000;
                    System.out.println("Producto agregado: Té ($3.000)");
                }
                case 6 ->
                        System.out.println("Total del pedido: $" + total);
                default ->
                        System.out.println("Opción inválida");
            }
        }
        entrada.close();
    }
}