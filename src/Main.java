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
                System.out.println("Has perdido. ¿Quieres volver a intentarlo? (si/no)");
                String respuesta = sc.nextLine().trim().toLowerCase();

                if (!respuesta.equals("si")) {
                    seguirJugando = false;
                }
            } else {

                seguirJugando = false;
            }
        }

        System.out.println("¡Gracias por jugar!");
    }
}