import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean resultadoIntroduccion = Funciones.introduccion();

        Funciones.imprimirHistoria();

        boolean resultadoFinal = Funciones.Porcentajes(sc, resultadoIntroduccion);

        Funciones.imprimirFinal(resultadoFinal);


    }
}