import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean seguirJugando = true;

        while (seguirJugando) {

            boolean resultadoIntroduccion = Funciones.introduccion();

            Funciones.imprimirHistoria();

            boolean resultadoFinal = Funciones.Porcentajes(sc, resultadoIntroduccion);

            Funciones.imprimirFinal(resultadoFinal);

            if (!resultadoFinal) {
                String respuesta = "";

                while (true) {
                    System.out.println("Has perdido. ¿Quieres volver a intentarlo? (si/no)");
                    respuesta = sc.nextLine().trim().toLowerCase();

                    if (respuesta.equals("si") || respuesta.equals("no")) {
                        break;
                    } else {
                        System.out.println("Entrada no válida. Por favor, escribe 'si' o 'no'.");
                    }
                }

                if (respuesta.equals("no")) {
                    seguirJugando = false;
                }

            } else {

                seguirJugando = false;
            }
        }

        System.out.println("¡Gracias por tu tiempo!");

  }
}