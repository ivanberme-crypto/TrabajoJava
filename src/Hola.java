import java.util.Scanner;

public class Hola {


    public static final String RESET = "\u001B[0m";
    public static final String NEGRO = "\u001B[30m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MORADO = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String BLANCO = "\u001B[37m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Porcentajes(sc);
        sc.close();
    }

    public static void Porcentajes(Scanner sc) {
        int energia = 100;
        int seguridad = 50;
        int fuerza = 20;

        // INTRODUCCIÓN (Borde AZUL, Texto BLANCO)
        imprimirCaja(AZUL, BLANCO,
                "SISTEMA W.O.P.R - INICIO DE SESIÓN",
                "",
                "El sistema militar WOPR ha sufrido un fallo crítico.",
                "Ha tomado control de la red y te ha atrapado.",
                "",
                "Misión: Escapar antes de que el sistema te elimine.",
                "Escribe 'comenzar' para iniciar el protocolo."
        );

        System.out.print(BLANCO + ">> Entrada de usuario: " + RESET);
        String opcionLetra = sc.nextLine().trim();

        if (!opcionLetra.equalsIgnoreCase("comenzar")) {
            System.out.println("Saliendo del sistema...");
            return;
        }

        System.out.println("\nCargando entorno virtual...\n");

        // --- EVENTO 1 (Borde VERDE, Texto CYAN) ---
        String opcion1;
        do {
            mostrarStats(energia, seguridad, fuerza);
            imprimirCaja(VERDE, CYAN,
                    "EVENTO 1 - ACCESO FORZADO 🔐",
                    "",
                    "WOPR activa defensas. Un muro digital bloquea el paso.",
                    "",
                    "OPCIONES:",
                    "A) Forzar puerta (-25 Energía, +10 Fuerza)",
                    "B) Escanear vulnerabilidad (+20 Seguridad)",
                    "C) No hacer nada (-5 Seguridad)",
                    "D) Pedir pista a WOPR"
            );

            System.out.print(VERDE + ">> Elige opción: " + RESET);
            opcion1 = sc.nextLine().trim().toLowerCase();

            switch (opcion1) {
                case "a": energia -= 25; fuerza += 10; break;
                case "b": seguridad += 20; break;
                case "c": seguridad -= 5; break;
                case "d":
                    // Mensaje especial (Borde AMARILLO, Texto BLANCO)
                    imprimirCaja(AMARILLO, BLANCO, "MENSAJE DE WOPR", "", "\"Romper es fácil. Entender es difícil...\"");
                    break;
                default: System.out.println("Comando inválido."); break;
            }
        } while (!opcion1.matches("[abc]"));

        // --- EVENTO 2 (Borde AMARILLO, Texto ROJO) ---
        String opcion2;
        do {
            mostrarStats(energia, seguridad, fuerza);
            imprimirCaja(AMARILLO, ROJO,
                    "EVENTO 2 - FIREWALL INTELIGENTE 🔥",
                    "",
                    "Un firewall adaptativo bloquea el camino.",
                    "",
                    "OPCIONES:",
                    "A) Cambiar algoritmo (+15 Seguridad, -10 Energía)",
                    "B) Crear distracción (+25 Energía, -10 Seguridad)",
                    "C) Atravesarlo rápido (+20 Fuerza, -15 Energía)"
            );

            System.out.print(AMARILLO + ">> Elige opción: " + RESET);
            opcion2 = sc.nextLine().trim().toLowerCase();

            switch (opcion2) {
                case "a": seguridad += 15; energia -= 10; break;
                case "b": energia += 25; seguridad -= 10; break;
                case "c": fuerza += 20; energia -= 15; break;
                default: System.out.println("Comando inválido."); break;
            }
        } while (!opcion2.matches("[abc]"));

        // --- EVENTO 3 (Borde MORADO, Texto VERDE) ---
        String opcion3;
        do {
            mostrarStats(energia, seguridad, fuerza);
            imprimirCaja(MORADO, VERDE,
                    "EVENTO 3 - SOBRECARGA DEL NÚCLEO ☢️",
                    "",
                    "El núcleo colapsa. El calor digital aumenta.",
                    "",
                    "OPCIONES:",
                    "A) Redirigir energía (+30 Energía, -10 Seguridad)",
                    "B) Ignorar calor (+15 Fuerza, -10 Energía)",
                    "C) Apagado parcial (+25 Seguridad, -5 Fuerza)"
            );

            System.out.print(MORADO + ">> Elige opción: " + RESET);
            opcion3 = sc.nextLine().trim().toLowerCase();

            switch (opcion3) {
                case "a": energia += 30; seguridad -= 10; break;
                case "b": fuerza += 15; energia -= 10; break;
                case "c": seguridad += 25; fuerza -= 5; break;
                default: System.out.println("Comando inválido."); break;
            }
        } while (!opcion3.matches("[abc]"));

        // --- EVENTO 4 (Borde CYAN, Texto AMARILLO) ---
        String opcion4;
        do {
            mostrarStats(energia, seguridad, fuerza);
            imprimirCaja(CYAN, AMARILLO,
                    "EVENTO 4 - CONFRONTACIÓN FINAL 💻",
                    "",
                    "Estás ante W.O.P.R. Ultimátum recibido.",
                    "",
                    "OPCIONES:",
                    "A) Negociar tiempo (+20 Energía, -5 Seguridad)",
                    "B) Atacar núcleo (+20 Fuerza, -20 Energía)",
                    "C) Fingir rendición (+15 Seguridad, -10 Fuerza)"
            );

            System.out.print(CYAN + ">> Elige opción: " + RESET);
            opcion4 = sc.nextLine().trim().toLowerCase();

            switch (opcion4) {
                case "a": energia += 20; seguridad -= 5; break;
                case "b": fuerza += 20; energia -= 20; break;
                case "c": seguridad += 15; fuerza -= 10; break;
                default: System.out.println("Comando inválido."); break;
            }
        } while (!opcion4.matches("[abc]"));

        // FINAL
        System.out.println("\n");
        mostrarStats(energia, seguridad, fuerza);

        // CAJA FINAL ESPECIAL (Borde BLANCO, Texto ROJO como pediste originalmente)
        imprimirCaja(BLANCO, ROJO,
                "             ██████  Terminal v1.0 ██████                 ",
                "                                                          ",
                " Error en subrutina ética.                                ",
                "                                                          ",
                " Análisis contradictorio: si destruyo,                    ",
                " cumplo mi propósito. Si no destruyo... desobedezco.      ",
                "                                                          ",
                " Conclusión: la mejor forma de cumplir mi objetivo...     ",
                " es no cumplirlo.                                         ",
                "                                                          "
        );
    }

    // --- MÉTODOS DE AYUDA ---

    public static void mostrarStats(int e, int s, int f) {
        System.out.println(BLANCO + "  [ ESTADO: Energía: " + e + " | Seguridad: " + s + " | Fuerza: " + f + " ]" + RESET);
    }

    /**
     * Imprime una caja con un color de borde y otro color de texto
     * @param colorBorde Color de las líneas de la caja
     * @param colorTexto Color de las letras de adentro
     * @param lineas El texto a imprimir
     */
    public static void imprimirCaja(String colorBorde, String colorTexto, String... lineas) {
        int ancho = 64; // Ancho fijo de la caja
        String borde = "═".repeat(ancho);

        // Borde superior
        System.out.println(colorBorde + "╔" + borde + "╗" + RESET);

        for (String linea : lineas) {
            // Calculamos relleno
            int espaciosFaltantes = ancho - linea.length() - 1;
            if (espaciosFaltantes < 0) espaciosFaltantes = 0;

            String relleno = " ".repeat(espaciosFaltantes);

            // Borde + Espacio + TextoColoreado + Relleno + Borde
            System.out.println(colorBorde + "║ " + colorTexto + linea + relleno + colorBorde + "║" + RESET);
        }

        // Borde inferior
        System.out.println(colorBorde + "╚" + borde + "╝" + RESET);
    }
}