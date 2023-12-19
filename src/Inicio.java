
import java.util.Scanner;

public class Ejercicio3Bucles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAdivinar = (int) (Math.random() * 100) + 1;
        int intentosMaximos = 10;
        int intentosRealizados = 0;
        int numeroUsuario;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Tienes que adivinar un número entre 1 y 100.");

        while (intentosRealizados < intentosMaximos) {
            System.out.print("Introduce tu número: ");
            numeroUsuario = scanner.nextInt();
            intentosRealizados++;

            if (numeroUsuario == numeroAdivinar) {
                System.out.println("¡Felicidades! ¡Has adivinado el número en " + intentosRealizados + " intentos!");
                break;
            } else if (numeroUsuario < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor. Intentos restantes: " + (intentosMaximos - intentosRealizados));
            } else {
                System.out.println("El número a adivinar es menor. Intentos restantes: " + (intentosMaximos - intentosRealizados));
            }
        }

        if (intentosRealizados == intentosMaximos) {
            System.out.println("Lo siento, has alcanzado el límite de intentos. El número a adivinar era: " + numeroAdivinar);
        }

        scanner.close();
    }
}
