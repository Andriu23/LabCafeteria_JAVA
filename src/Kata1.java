import java.util.Scanner; // Permite utilizar la clase Scanner para leer los datos que ingresa el usuario por teclado.

public class Kata1 { // Declara la clase llamada Kata1.
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // Crea un objeto para leer los datos ingresados por teclado

        int totalCuenta; // Crea una varible de dato decimal
        int porcentaje; // Crea una varible de dato decimal

        // Validar el total de la cuenta
        do {
            System.out.print("Ingrese el total de la cuenta: "); // Muestra el mensaje por consola
            totalCuenta = entrada.nextInt(); // Lee y guarda el dato que ingreso el usuario por teclado como un tipo int

            if (totalCuenta <= 0) {
                System.out.println("Error: total inválido"); // Muestra el mensaje por consola si cumple la condición
            }

        } while (totalCuenta <= 0);

        // Validar el porcentaje de propina
        do {
            System.out.print("Ingrese el porcentaje de propina (1-100): "); // Muestra el mensaje por consola
            porcentaje = entrada.nextInt(); // Lee y guarda el dato que ingreso el usuario por teclado como un tipo int

            if (porcentaje <= 0 || porcentaje > 100) {
                System.out.println("Error: porcentaje inválido"); // Muestra el mensaje por consola si cumple la condición
            }

        } while (porcentaje <= 0 || porcentaje > 100); // Calcula el valor de la propina como un tipo de dato double

        // Calcular la propina
        int propina = totalCuenta * porcentaje / 100;

        // Evaluar el porcentaje de propina

        String mensaje = ""; // Declaramos un tipo de dato String vacío, para mostrar por consola

        if (porcentaje > 30) {
            mensaje = "¡Propina generosa!";
        } else if (porcentaje < 5) {
            mensaje = "¡Propina muy baja!";
        }

        // Calcular el total a pagar
        int totalPagar = totalCuenta + propina;

        // Mostrar resultados
        System.out.println("Propina: " + propina);
        System.out.println("Total a pagar: " + totalPagar);
        System.out.println(mensaje);

        entrada.close();
    }
}