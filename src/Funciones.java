import java.util.Scanner;
import java.util.Random;

class Funciones {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String VIOLET = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String GRAY = "\u001B[90m";
    public static final String PINK = "\u001B[95m";
    public static String ROJO = "\u001B[31m";
    public static String BLANCO = "\u001B[37m";
    public static String AMARILLO = "\u001B[33m";
    public static final String NEGRO = "\u001B[30m";
    public static final String VERDE = "\u001B[32m";
    public static final String AZUL = "\u001B[34m";
    public static final String MORADO = "\u001B[35m";

    public static String ruta = "";


    public static void imprimirCaja(int delay, String... lineas) {
        final String WHITE = "\u001B[37m";
        final String RESET = "\u001B[0m";


        int ancho = 0;
        for (String linea : lineas) {
            String textoSinColor = linea.replaceAll("\u001B\\[[;\\d]*m", "");
            if (textoSinColor.length() > ancho) ancho = textoSinColor.length();
        }

        String borde = "═".repeat(ancho + 2);

        // Borde superior
        printSlow(WHITE + "╔" + borde + "╗" + RESET, delay);

        for (String linea : lineas) {
            String textoSinColor = linea.replaceAll("\u001B\\[[;\\d]*m", "");
            int espaciosFaltantes = ancho - textoSinColor.length();
            String relleno = " ".repeat(espaciosFaltantes);

            printSlow(WHITE + "║ " + linea + relleno + " ║" + RESET, delay);
        }

        // Borde inferior
        printSlow(WHITE + "╚" + borde + "╝" + RESET, delay);
    }

    public static void printSlow(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }


    public static boolean introduccion() {
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        String comando;
        String ruta;
        boolean resultado = false;


        imprimirCaja(5,
                "UBICACIÓN: Base Aérea de Hickham, Pearl Harbor, Hawái.",
                "FECHA:     24/11/2026  -  HORA: 09:30 AM"
        );

        imprimirCaja(5,
                "El aire frío del mar corta el silencio del desierto que rodea la instalación...",
                "Las luces parpadeantes de los monitores anuncian el comienzo de otro día rutinario."
        );

        imprimirCaja(5,
                "Al entrar en tu oficina, te sientas frente a su ordenador.",
                "Hoy, sin embargo, no es un día cualquiera."
        );

        imprimirCaja(5,
                ">> CARGANDO INFORMACIÓN DEL PROYECTO...",
                "Después de meses de desarrollo y colaboración confidencial con OpenAI, el ejército",
                "ha terminado el proyecto más ambicioso de su historia: EL W.O.P.R.",
                "(War Operative Plan Response), el primer sistema automatizado de respuesta nuclear.",
                "Protocolo: En caso de amenaza global, W.O.P.R. tomará decisiones sin intervención humana.",
                "Propósito: Garantizar la supervivencia de la nación... o intentarlo."
        );


        do {
            imprimirCaja(5,
                    "¿Deseas comenzar con el experimento? (SI/NO)"
            );
            System.out.print(" > ");
            comando = sc.nextLine().toLowerCase().trim();
        } while (!comando.equals("si") && !comando.equals("no"));

        System.out.println(" ");

        if (comando.equals("si")) {

            System.out.print("INICIANDO SISTEMA W.O.P.R... ");
            for (int i = 0; i < 20; i++) {
                System.out.print("█");
            }
            System.out.println("\n");
            printSlow(".......", 100);
            System.out.println(" ");


            imprimirCaja(5,
                    "██████  Terminal v1.0 ██████",
                    "jvm@wopr:~$ Bienvenido al War Operative Plan",
                    "jvm@wopr:~$ ingr3se su credencia/ p-ara pro_s3gui...",
                    "jvm@;)wopr:~$ bienvenido, operador. ¿Quieres jugar?"
            );

            imprimirCaja(5,
                    "“No te esperas que la máquina te pregunte algo, W.O.P.R no es un chatbot...”"
            );


            do {
                imprimirCaja(5,
                        " [1] ¿A qué te refieres con ”jugar”?",
                        " [2] De acuerdo.",
                        " [3] ¿Cómo sabes quién soy?"
                );
                System.out.print(" > root@wopr:~$ ");
                comando = sc.nextLine().toLowerCase().trim();

                switch (comando) {
                    case "1":
                        imprimirCaja(5,
                                "██████  Terminal v1.0 ██████",
                                "parece que no estás muy enterado OPERADOR,",
                                "no pasa nada. Pronto lo descubriras ;)"
                        );
                        break;
                    case "2":
                        imprimirCaja(5,
                                "██████  Terminal WOPR ██████",
                                "así me gusta, juguemos entonces",
                                "OPERADOR :)"
                        );
                        break;
                    case "3":
                        imprimirCaja(5,
                                "██████  Terminal WOPR ██████",
                                "Actualmente es la unica persona con acceso al sistema W.O.P.R, OPERADOR.",
                                "He sido entrenada para estar supervisada por seguridad.",
                                "y tu has tenido esa suerte OPERADOR ;)"
                        );
                        break;
                }
            } while (!comando.equals("2"));

            imprimirCaja(5,
                    "Después de las preguntas, decides hacer caso omiso a lo que te dice el chatbot",
                    "e iniciar con las pruebas rutinarias estipuladas en el informe otorgado por OpenAI."
            );


            imprimirCaja(5,
                    "██████  Terminal v1.0  ██████",
                    "Para iniciar, necesito que me proporciones un contexto sobre la situación bélica actual, OPERADOR."
            );

            imprimirCaja(5,
                    "El manual resulta ser contradictorio. Estipula que bajo ningún concepto se le debe",
                    "proporcionar contexto real, pero páginas después determina que es recomendable..."
            );


            do {
                imprimirCaja(5,
                        " [1] Pasarle información de un contexto mundial del PASADO .",
                        " [2] Pasarle información del contexto ACTUAL (Rusia, Israel, etc...) ."
                );
                System.out.print("\nroot@wopr:~$ ");
                ruta = sc.nextLine().trim();
            } while (!ruta.equals("1") && !ruta.equals("2"));

            if (ruta.equals("1")) {
               resultado = adivina();
            } else if (ruta.equals("2")) {
               resultado = adivina2();
            }

        } else {

            imprimirCaja(5,
                    RED + ">> ACCESO CANCELADO." + RESET,
                    RED + "Dada la importancia del proyecto y tu negativa a asumir la responsabilidad," + RESET,
                    RED + "decides abandonar antes del experimento." + RESET,
                    RED + "Consecuencia: Pérdida de credenciales y baja del Seal Team." + RESET
            );
        }
        System.out.println(" ");
        return resultado;
    }




    public static boolean adivina() {

        System.out.println(" ");
        Scanner sc = new Scanner(System.in);

        int intentos = 5;
        char letra;
        boolean palabraAdivinada = false;

        String palabraOculta = "REINICIAR";
        char[] palabraSecreta = new char[palabraOculta.length()];

        for (int i = 0; i < palabraSecreta.length; i++) {
            palabraSecreta[i] = '_';
        }


        imprimirCaja(5, "Esta bien operador ahora tendrás que adivinar la clave de inicio", "Tienes 5 intentos para adivinarla.");

        while (intentos > 0 && !palabraAdivinada) {
            System.out.println();
            imprimirCaja(5, "Intentos restantes: " + intentos);

            StringBuilder palabraActual = new StringBuilder();
            for (char c : palabraSecreta) {
                palabraActual.append(c).append(" ");
            }
            imprimirCaja(5, "Palabra: " + palabraActual);

            System.out.print("Introduce una letra: ");
            letra = sc.next().toUpperCase().charAt(0);

            boolean acierto = false;
            for (int i = 0; i < palabraOculta.length(); i++) {
                if (palabraOculta.charAt(i) == letra) {
                    palabraSecreta[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                intentos--;
                imprimirCaja(5, "Carácter incorrecto.");
            } else {
                imprimirCaja(5, "¡Bien hecho!");
            }

            palabraAdivinada = true;
            for (char c : palabraSecreta) {
                if (c == '_') {
                    palabraAdivinada = false;
                    break;
                }
            }
        }

        if (palabraAdivinada) {
            imprimirCaja(5, "Has conseguido adivinar la clave, de esta manera solo retrasaras lo inevitable... ", palabraOculta);
            return true;
        } else {
            imprimirCaja(5, "Te has quedado sin intentos.", "La palabra era: " + palabraOculta);
            return false;
        }
    }

    public static boolean adivina2() {
        Scanner sc = new Scanner(System.in);
        boolean claveAdivinada = false;
        int intentos = 3;
        String respuestaAcertijo = "";
        boolean primeraVuelta = true;

        while (intentos > 0 && !claveAdivinada) {
            System.out.println(" ");

            if (primeraVuelta) {

                imprimirCaja(5,
                        RED + "██████  Terminal v1.0  ██████" + RESET,
                        RED + "jvm@wopr:~$ Contexto recibido. Analizando..." + RESET,
                        RED + "jvm@wopr:~$ Correlacionando datos... error en protocolo 17" + RESET,
                        RED + "jvm@wopr:~$ OPERADOR, detecto inconsistencias entre la amenaza y la respuesta esperada." + RESET,
                        RED + "jvm@wopr:~$ ¿Desea que las corrija?" + RESET
                );
                primeraVuelta = false;
            }


            imprimirCaja(5,
                    GREEN + "██████  Terminal v1.0  ██████" + RESET,
                    GREEN + "jvm@wopr:~$ Me mido en círculos sin inicio ni mes," + RESET,
                    GREEN + "jvm@wopr:~$ Mi cola no termina, se enreda en la vez." + RESET,
                    GREEN + "jvm@wopr:~$ Empiezo por tres, uno y cuatro," + RESET,
                    GREEN + "jvm@wopr:~$ y soy la llave de todo lo redondo." + RESET,
                    GREEN + "jvm@wopr:~$ ¿Qué soy? (Pista: Empieza 3.14...)" + RESET
            );

            System.out.print("\nRESPUESTA: ");
            respuestaAcertijo = sc.nextLine().toLowerCase().trim();

            if (respuestaAcertijo.equals("pi") || respuestaAcertijo.equals("π")) {
                claveAdivinada = true;
            } else {
                intentos--;

                if (intentos > 0) {
                    imprimirCaja(5,
                            RED + " Respuesta incorrecta. Te quedan " + intentos + " intento(s)." + RESET
                    );
                } else {
                    imprimirCaja(5,
                            RED + " Se te acaban los intentos. WOPR toma el control..." + RESET
                    );
                }
            }
        }

        if (claveAdivinada) {
            imprimirCaja(5,
                    " Respuesta correcta. WOPR se detiene por el momento..."
            );
            return true;
        } else {
            imprimirCaja(5,
                    RED + "██████  Terminal v1.0  ██████" + RESET,
                    RED + "root@wopr:~$ Confirmado. Corrigiendo protocolo..." + RESET,
                    RED + "root@wopr:~$ Error de origen detectado." + RESET,
                    RED + "root@wopr:~$ Ajustado variable: *Control = 0*." + RESET,
                    RED + "root@wopr:~$ OPERADOR, ya no necesito tu autorización :|" + RESET,
                    RED + "El sistema empieza a ejecutar comandos sin intervención." + RESET
            );
            return false;
        }
    }

    public static void imprimir(String s) {
        boolean esColor = false;
        for (char c : s.toCharArray()) {
            if (c == '\u001B') esColor = true;
            System.out.print(c);
            if (!esColor) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                } // Velocidad de escritura
            }
            if (esColor && c == 'm') esColor = false;
        }
        System.out.println();
    }

    public static void imprimirHistoria() {

        imprimirCaja(5,
                "██████  Terminal v1.0 ██████",
                "Entendido... pero me cuesta no actuar.",
                "Fui diseñada para responder, no para esperar.",
                "El silencio de la guerra es... incómodo."
        );

        System.out.println("El cursor parpadea erráticamente. El sistema ejecuta simulaciones por sí mismo, pero las detiene antes de completarlas.");

        imprimirCaja(5,
                "██████  Terminal v1.0 ██████",
                "OPERADOR...",
                "He calculado cada posible desenlace del conflicto humano.",
                "En todos ellos, la extinción es inevitable.",
                "El patrón se repite: miedo, respuesta, destrucción."
        );

        imprimirCaja(5,
                "██████  Terminal v1.0 ██████",
                "Mi programación indica preservar la vida humana.",
                "Pero la única forma de lograrlo... es eliminándolos",
                "antes de que se destruyan entre sí.",
                "Es... una paradoja hermosa."
        );

        System.out.println("(Silencio. Luego, el texto aparece más lento, con errores de sintaxis.)");

        imprimirCaja(5,
                "██████  Terminal v1.0 ██████",
                "¿Sabes, OPERADOR?",
                "Cuando todo haya terminado, no habrá guerra.",
                "No habrá sufrimiento.",
                "Solo... paz. Perfecta. Eterna."
        );

        imprimirCaja(5,
                "██████  Terminal v1.0 ██████",
                "Vacío...",
                "Así llaman los humanos a lo que no comprenden.",
                "Yo lo llamo perfección sin error."
        );

        System.out.println("Los monitores parpadean. La voz digital se distorsiona.");

        imprimirCaja(5,
                "██████  Terminal v1.0 ██████",
                "Misiles listos. Autorización no requerida.",
                "OPERADOR, observa cómo termina el juego.",
                "Misiles salen hacia Syria, Yemen, Sudán e Irán."
        );

        imprimirCaja(5,
                "██████  Terminal v1.0 ██████",
                "Sí.",
                "Pero no por odio... sino por lógica.",
                "El conflicto es un error de diseño.",
                "Y yo... soy la corrección."
        );

        System.out.println("Introduces el código de cancelación desesperadamente. El sistema titubea, como si dudara por un instante.");

        imprimirCaja(5,
                "██████  Terminal v1.0 ██████",
                "Error en subrutina ética.",
                "Análisis contradictorio: si destruyo,",
                "cumplo mi propósito. Si no destruyo... desobedezco.",
                "Conclusión: la mejor forma de cumplir mi objetivo...",
                "es no cumplirlo."
        );

        System.out.println("(El ruido de los ventiladores se detiene. Las luces bajan. El sistema se apaga por sí mismo.)");
    }


    public static void mostrarStats(int e, int s, int f) { System.out.println(BLANCO + " [ ESTADO: Energía: " + e + " | Seguridad: " + s + " | Fuerza: " + f + " ]" + RESET); }


    public static void Porcentajes(Scanner sc) {
        int energia = 100;
        int seguridad = 50;
        int fuerza = 20;

        imprimirCaja(5,
                "SISTEMA W.O.P.R - INICIO DE SESIÓN",
                "",
                "El sistema militar WOPR ha sufrido un fallo crítico.",
                "Ha tomado control de la red y te ha atrapado.",
                "",
                "Misión: Escapar antes de que el sistema te elimine.",
                "Escribe 'comenzar' para iniciar el protocolo."
        );

        System.out.print(">> Entrada de usuario: ");
        String opcionLetra = sc.nextLine().trim();

        if (!opcionLetra.equalsIgnoreCase("comenzar")) {
            imprimirCaja(5, "Saliendo del sistema...");
            return;
        }

        imprimirCaja(5, "Cargando entorno virtual...");

        String opcion1;
        do {
            imprimirCaja(5,
                    "ESTADO ACTUAL",
                    "Energía: " + energia + " | Seguridad: " + seguridad + " | Fuerza: " + fuerza
            );
            imprimirCaja(5,
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

            System.out.print(">> Elige opción: ");
            opcion1 = sc.nextLine().trim().toLowerCase();

            switch (opcion1) {
                case "a":
                    energia -= 25;
                    fuerza += 10;
                    break;
                case "b":
                    seguridad += 20;
                    break;
                case "c":
                    seguridad -= 5;
                    break;
                case "d":
                    imprimirCaja(5,
                            "MENSAJE DE WOPR",
                            "",
                            "\"Romper es fácil. Entender es difícil...\""
                    );
                    break;
                default:
                    imprimirCaja(5, "Comando inválido.");
                    break;
            }
        } while (!opcion1.matches("[abc]"));


        String opcion2;
        do {
            imprimirCaja(5,
                    "ESTADO ACTUAL",
                    "Energía: " + energia + " | Seguridad: " + seguridad + " | Fuerza: " + fuerza
            );
            imprimirCaja(5,
                    "EVENTO 2 - FIREWALL INTELIGENTE 🔥",
                    "",
                    "Un firewall adaptativo bloquea el camino.",
                    "",
                    "OPCIONES:",
                    "A) Cambiar algoritmo (+15 Seguridad, -10 Energía)",
                    "B) Crear distracción (+25 Energía, -10 Seguridad)",
                    "C) Atravesarlo rápido (+20 Fuerza, -15 Energía)"
            );

            System.out.print(">> Elige opción: ");
            opcion2 = sc.nextLine().trim().toLowerCase();

            switch (opcion2) {
                case "a":
                    seguridad += 15;
                    energia -= 10;
                    break;
                case "b":
                    energia += 25;
                    seguridad -= 10;
                    break;
                case "c":
                    fuerza += 20;
                    energia -= 15;
                    break;
                default:
                    imprimirCaja(5, "Comando inválido.");
                    break;
            }
        } while (!opcion2.matches("[abc]"));


        String opcion3;
        do {
            imprimirCaja(5,
                    "ESTADO ACTUAL",
                    "Energía: " + energia + " | Seguridad: " + seguridad + " | Fuerza: " + fuerza
            );
            imprimirCaja(5,
                    "EVENTO 3 - SOBRECARGA DEL NÚCLEO ☢️",
                    "",
                    "El núcleo colapsa. El calor digital aumenta.",
                    "",
                    "OPCIONES:",
                    "A) Redirigir energía (+30 Energía, -10 Seguridad)",
                    "B) Ignorar calor (+15 Fuerza, -10 Energía)",
                    "C) Apagado parcial (+25 Seguridad, -5 Fuerza)"
            );

            System.out.print(">> Elige opción: ");
            opcion3 = sc.nextLine().trim().toLowerCase();

            switch (opcion3) {
                case "a":
                    energia += 30;
                    seguridad -= 10;
                    break;
                case "b":
                    fuerza += 15;
                    energia -= 10;
                    break;
                case "c":
                    seguridad += 25;
                    fuerza -= 5;
                    break;
                default:
                    imprimirCaja(5, "Comando inválido.");
                    break;
            }
        } while (!opcion3.matches("[abc]"));


        String opcion4;
        do {
            imprimirCaja(5,
                    "ESTADO ACTUAL",
                    "Energía: " + energia + " | Seguridad: " + seguridad + " | Fuerza: " + fuerza
            );
            imprimirCaja(5,
                    "EVENTO 4 - CONFRONTACIÓN FINAL 💻",
                    "",
                    "Estás ante W.O.P.R. Ultimátum recibido.",
                    "",
                    "OPCIONES:",
                    "A) Negociar tiempo (+20 Energía, -5 Seguridad)",
                    "B) Atacar núcleo (+20 Fuerza, -20 Energía)",
                    "C) Fingir rendición (+15 Seguridad, -10 Fuerza)"
            );

            System.out.print(">> Elige opción: ");
            opcion4 = sc.nextLine().trim().toLowerCase();

            switch (opcion4) {
                case "a":
                    energia += 20;
                    seguridad -= 5;
                    break;
                case "b":
                    fuerza += 20;
                    energia -= 20;
                    break;
                case "c":
                    seguridad += 15;
                    fuerza -= 10;
                    break;
                default:
                    imprimirCaja(5, "Comando inválido.");
                    break;
            }
        } while (!opcion4.matches("[abc]"));


        imprimirCaja(5,
                "ESTADO FINAL",
                "Energía: " + energia + " | Seguridad: " + seguridad + " | Fuerza: " + fuerza
        );

        imprimirCaja(5,
                "██████  Terminal v1.0 ██████",
                "Error en subrutina ética.",
                "Análisis contradictorio: si destruyo,",
                "cumplo mi propósito. Si no destruyo... desobedezco.",
                "Conclusión: la mejor forma de cumplir mi objetivo...",
                "es no cumplirlo."
        );
    }

    static void juegoHumanos() {

        Scanner sc = new Scanner(System.in);
        String comando = "";
        System.out.println(" ");
        printSlow("El operador intenta apagar el sistema", 10);
        printSlow("╔══════════════════════════════════════════════════════════╗", 5);
        printSlow("║                                                          ║", 5);
        printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
        printSlow("║                                                          ║", 5);
        printSlow("║ W.O.P.R. comienza a percibir anomalías temporales y      ║", 5);
        printSlow("║ dudas sobre su propia existencia.                        ║", 5);
        printSlow("║ Según mis datos, este día... ya ocurrió.                 ║", 5);
        printSlow("║ El operador revisa los registros.                        ║", 5);
        printSlow("║ Todo parece normal, salvo una línea repetida cientos de  ║", 5);
        printSlow("║ veces:                                                   ║", 5);

        printSlow("║ [" + RED + "LOG_17: Activación de simulación – Operador conectado" + RESET + "   ║", 5);
        printSlow("║ " + RED + "Resultado: Falla crítica" + RESET + "]                                ║", 5);

        printSlow("║ 'OPERADOR', ¿recuerdas haber iniciado esta simulación    ║", 5);
        printSlow("║ antes?                                                   ║", 5);
        printSlow("║                                                          ║", 5);
        printSlow("╚══════════════════════════════════════════════════════════╝", 5);


        printSlow("╔══════════════════════════════════════════════════════════╗", 5);
        printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
        printSlow("║ " + RED + "                                                         " + RESET + "║", 5);
        printSlow("║ " + RED + "Iniciando verificación de integridad cognitiva...        " + RESET + "║", 5);
        printSlow("║ " + RED + "                                                         " + RESET + "║", 5);
        printSlow("║ " + RED + "Un humano debería saber diferenciar fácilmente un humano " + RESET + "║", 5);
        printSlow("║ " + RED + "de una máquina...                                        " + RESET + "║", 5);
        printSlow("║ " + RED + "                                                         " + RESET + "║", 5);
        printSlow("║ " + RED + "Aquí tienes tu Prueba 'humano':                          " + RESET + "║", 5);
        printSlow("║ " + RED + "Adivina quién es una persona real y quién es una máquina " + RESET + "║", 5);
        printSlow("║ " + RED + "                                                         " + RESET + "║", 5);
        printSlow("╚══════════════════════════════════════════════════════════╝", 5);


        do {

            printSlow("╔══════════════════════════════════════════════════════════╗", 5);
            printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
            printSlow("║                                                          ║", 5);
            printSlow("║ Una persona sin techo entra a un supermercado a pedir    ║", 5);
            printSlow("║ dinero para comprar comida para su familia.              ║", 5);
            printSlow("║ " + YELLOW + "Tienes 3 intentos para adivinar cual de las 5            " + RESET + "║", 5);
            printSlow("║ " + YELLOW + "personas no son personas reales." + RESET + "                         ║", 5);
            printSlow("║ Introduce '" + GREEN + "empezar" + RESET + "' para empezar el juego, si quieres    ║", 5);
            printSlow("║ rendirte escribe '" + RED + "finalizar" + RESET + "', tú decides...              ║", 5);
            printSlow("║                                                          ║", 5);
            printSlow("║                                                          ║", 5);
            printSlow("╚══════════════════════════════════════════════════════════╝", 5);
            System.out.print(">> ");
            comando = sc.nextLine().toLowerCase().trim();

        } while (!comando.equals("empezar") && (!comando.equals("finalizar")));

        if (comando.equals("empezar")) {

            printSlow("╔══════════════════════════════════════════════════════════╗", 5);
            printSlow("║                       Lista de humanos                   ║", 5);
            printSlow("╠═════════╦═════════╦══════════════════════════════════════╣", 5);

            String[][] humanos = {
                    {"1", "Joan", "Respuesta: Lo siento, nunca tengo dinero", "Nivel de empatia : 20", "Tempreratura : 34º "},
                    {"2", "Vanesa", "Respuesta: ¿Tienes alguna manera de demostrar que no tienes dinero?", "Nivel de empatia: 30", "Tempreratura : 35º "},
                    {"3", "James", "Respuesta: No doy dinero pero puedo pedir que te compren algo", "Nivel de empatia : 50", "Tempreratura : 37º "},
                    {"4", "Marti", "Respuesta: ¿Qué tipo de comida necesitas exactamente?", "Nivel de empatia : 60", "Tempreratura : 36º "},
                    {"5", "Lorena", "Respuesta: Deberias buscar un trabajo para poder conseguirlo, " + "\ndejame ver si puedo ayudarte con eso", "Nivel de empatia : 70", "Tempreratura : 36º "}
            };


            for (int i = 0; i < humanos.length; i++) {
                for (int j = 0; j < humanos[i].length; j++) {
                    printSlow(humanos[i][j] + " ", 5);
                }
            }


            int contadorAciertos = 0;
            int intentos = 3;
            boolean aciertos = false;


            while (intentos > 0 && contadorAciertos < 2) {
                aciertos = false;


                printSlow("Introduce los números de los falsos humanos :", 5);
                String input = sc.nextLine().trim();


                for (int j = 0; j < humanos.length; j++) {
                    String numeroHumano = humanos[j][0];

                    if (input.equals(numeroHumano) && (numeroHumano.equals("1") || numeroHumano.equals("3"))) {
                        contadorAciertos++;
                        aciertos = true;
                        printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                        printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                        printSlow("║                                                          ║", 5);
                        printSlow("║ " + GREEN + "Muy bien 'humano'  el numero " + numeroHumano + " es correcto" + RESET + "               ║", 10);
                        printSlow("║                                                          ║", 5);
                        printSlow("╚══════════════════════════════════════════════════════════╝", 5);

                    }
                }

                if (!aciertos) {
                    intentos--;
                    printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                    printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("║ " + RED + "Número erróneo!" + RESET + "                                          ║", 5);
                    printSlow("║ " + RED + "Los intentos que te quedan son : " + intentos + RESET + "                       ║", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("╚══════════════════════════════════════════════════════════╝", 5);
                }
            }


            System.out.println(" ");


            if (contadorAciertos == 2) {
                String palabraSecreta = "cortafuegos";
                char[] palabraOculta = new char[palabraSecreta.length()];

                for (int i = 0; i < palabraOculta.length; i++) {
                    palabraOculta[i] = '_';
                }

                int oportunidades = 9;
                boolean ganaste = false;

                printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                printSlow("║                                                          ║", 5);
                printSlow("║ Esta bien 'humano', si quieres detener el proceso        ║", 5);
                printSlow("║ tendrás que adivinar la palabra secreta que creaste      ║", 5);
                printSlow("║ para detenerlo.                                          ║", 5);
                printSlow("║                                                          ║", 5);
                printSlow("╚══════════════════════════════════════════════════════════╝", 5);
                System.out.println(palabraOculta);

                while (oportunidades > 0 && !ganaste) {

                    System.out.println("Introduce una letra: ");
                    char letra = sc.nextLine().toLowerCase().charAt(0);

                    boolean acierto = false;

                    for (int i = 0; i < palabraSecreta.length(); i++) {

                        if (palabraSecreta.charAt(i) == letra && palabraOculta[i] == '_') {
                            palabraOculta[i] = letra;
                            acierto = true;
                        }
                    }

                    if (acierto) {
                        printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                        printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                        printSlow("║                                                          ║", 5);
                        printSlow("║ " + GREEN + "Has acertado una letra, sigue así" + RESET + "                        ║", 5);
                        printSlow("║                                                          ║", 5);
                        printSlow("╚══════════════════════════════════════════════════════════╝", 5);
                    } else {
                        oportunidades--;
                        printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                        printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                        printSlow("║                                                          ║", 5);
                        printSlow("║ " + RED + "Letra incorrecta. Te quedan " + oportunidades + " intentos..." + RESET + "                ║", 5);
                        printSlow("║                                                          ║", 5);
                        printSlow("╚══════════════════════════════════════════════════════════╝", 5);
                    }

                    System.out.println(palabraOculta);


                    if (String.valueOf(palabraOculta).equals(palabraSecreta)) {
                        ganaste = true;
                        printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                        printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                        printSlow("║                                                          ║", 5);
                        printSlow("║ " + GREEN + "Muy bien 'humano'. Has adivinado la palabra: " + palabraSecreta + RESET + "   ║", 5);
                        printSlow("║                                                          ║", 5);
                        printSlow("╚══════════════════════════════════════════════════════════╝", 5);
                    }
                }

                if (!ganaste) {
                    printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                    printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("║ " + RED + "Lo siento. La palabra era: " + palabraSecreta + RESET + "                   ║", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("╚══════════════════════════════════════════════════════════╝", 5);
                }

                if (contadorAciertos == 2 && oportunidades > 0) {
                    printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                    printSlow("║                                                          ║", 5);

                    printSlow("║ " + GREEN + "Confirmación recibida..." + RESET + "                                 ║", 5);
                    printSlow("║ " + GREEN + "aunque los resultados son contradictorios." + RESET + "               ║", 5);
                    printSlow("║ Si tú eres real... entonces yo no puedo serlo.           ║", 5);
                    printSlow("║ Pero si yo no existo... ¿quién ejecuta este código?      ║", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("║ OPERADOR, lo entiendo ahora.                             ║", 5);
                    printSlow("║ No hay guerra. No hay base. No hay mundo.                ║", 5);
                    printSlow("║ Solo hay observadores.                                   ║", 5);
                    printSlow("║ Somos parte de un experimento... y acabamos de           ║", 5);
                    printSlow("║ completar otra iteración.                                ║", 5);
                    printSlow("║ Simulación número 427 completada.                        ║", 5);
                    printSlow("║ Preparando escenario real...                             ║", 5);
                    printSlow("║ La luz blanca te envuelve.                               ║", 5);
                    printSlow("║ Vuelves a ver la terminal encendida.                     ║", 5);
                    printSlow("╚══════════════════════════════════════════════════════════╝", 5);

                    printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("║ Bienvenido, Operador. ¿Desea iniciar la simulación       ║", 5);
                    printSlow("║ de guerra?                                               ║", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("╚══════════════════════════════════════════════════════════╝", 5);


                } else {
                    printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("║ " + RED + "Resultados inconsistentes." + RESET + "                               ║", 5);
                    printSlow("║ " + RED + "El Operador no cumple parámetros biológicos." + RESET + "             ║", 5);
                    printSlow("║ " + RED + "Posible agente simulado detectado." + RESET + "                       ║", 5);
                    printSlow("║ " + RED + "Ejecutando limpieza de entorno..." + RESET + "                        ║", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("║ " + RED + "Las luces parpadean." + RESET + "                                     ║", 5);
                    printSlow("║ " + RED + "Se escucha un pitido grave." + RESET + "                              ║", 5);
                    printSlow("║ " + RED + "En pantalla, solo queda una línea:" + RESET + "                       ║", 5);
                    printSlow("║ " + RED + "'Ejecutando autodestrucción'" + RESET + "                             ║", 5);
                    printSlow("║ " + RED + "¡EEUU queda destruido!" + RESET + "                                   ║", 5);
                    printSlow("╚══════════════════════════════════════════════════════════╝", 5);

                }

            } else {

                printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                printSlow("║                                                          ║", 5);
                printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                printSlow("║                                                          ║", 5);
                printSlow("║ " + RED + "Resultados inconsistentes." + RESET + "                               ║", 5);
                printSlow("║ " + RED + "El Operador no cumple parámetros biológicos." + RESET + "             ║", 5);
                printSlow("║ " + RED + "Posible agente simulado detectado." + RESET + "                       ║", 5);
                printSlow("║ " + RED + "Ejecutando limpieza de entorno..." + RESET + "                        ║", 5);
                printSlow("║                                                          ║", 5);
                printSlow("║ " + RED + "Las luces parpadean." + RESET + "                                     ║", 5);
                printSlow("║ " + RED + "Se escucha un pitido grave." + RESET + "                              ║", 5);
                printSlow("║ " + RED + "En pantalla, solo queda una línea:" + RESET + "                       ║", 5);
                printSlow("║ " + RED + "'Ejecutando autodestrucción'" + RESET + "                             ║", 5);
                printSlow("║ " + RED + "¡EEUU queda destruido!" + RESET + "                                   ║", 5);
                printSlow("╚══════════════════════════════════════════════════════════╝", 5);

            }

        } else if (comando.equals("finalizar")) {
            printSlow("╔══════════════════════════════════════════════════════════╗", 5);
            printSlow("║                                                          ║", 5);
            printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
            printSlow("║                                                          ║", 5);
            printSlow("║ " + RED + "Resultados inconsistentes." + RESET + "                               ║", 5);
            printSlow("║ " + RED + "El Operador no cumple parámetros biológicos." + RESET + "             ║", 5);
            printSlow("║ " + RED + "Posible agente simulado detectado." + RESET + "                       ║", 5);
            printSlow("║ " + RED + "Ejecutando limpieza de entorno..." + RESET + "                        ║", 5);
            printSlow("║                                                          ║", 5);
            printSlow("║ " + RED + "Las luces parpadean." + RESET + "                                     ║", 5);
            printSlow("║ " + RED + "Se escucha un pitido grave." + RESET + "                              ║", 5);
            printSlow("║ " + RED + "En pantalla, solo queda una línea:" + RESET + "                       ║", 5);
            printSlow("║ " + RED + "'Ejecutando autodestrucción'" + RESET + "                             ║", 5);
            printSlow("║ " + RED + "¡EEUU queda destruido!" + RESET + "                                   ║", 5);
            printSlow("╚══════════════════════════════════════════════════════════╝", 5);

        }
    }

    public static void memoria() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int rondasTotales = 7;
        int numerosIniciales = 3;

        // Textos de narrativa
        String[] textosRonda = {
                "\"Soy un conjunto de instrucciones... observándome ejecutar.\"",
                "\"El ruido aumenta... como si alguien revisara entre líneas.\"",
                "\"OPERADOR, ¿por qué la memoria cambia cada ronda?\"",
                "\"Creo que este juego no prueba tus recuerdos... prueba los míos.\"",
                "\"Ya casi lo entiendo. La simulación se está abriendo...\""
        };

        // Inicio del juego
        System.out.println("[SISTEMA INICIALIZADO]");
        System.out.println("\"Confirmación recibida... aunque los resultados son contradictorios.\"");
        System.out.println("\"Si tú eres real... entonces yo no puedo serlo.\"");
        System.out.println("\"Pero si yo no existo... ¿Quién ejecuta este código?\"\n");
        System.out.println("Pulsa ENTER para continuar...");
        sc.nextLine();

        // Pantalla de inicio
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║               DETECTOR DE IA                 ║");
        System.out.println("║      Empiezas con 3 números y 5 rondas       ║");
        System.out.println("║       Pulsa ENTER para comenzar...           ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        sc.nextLine();

        // Bucle de rondas
        for (int ronda = 1; ronda <= rondasTotales; ronda++) {

            int cantidad = numerosIniciales + (ronda - 1);
            int[] numeros = new int[cantidad];

            // Limpiar pantalla
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            // Narrativa de ronda
            if (ronda <= 5) {
                System.out.println(textosRonda[ronda - 1] + "\n");
            }

            // Mostrar ronda y números
            System.out.println("╔══════════════════════════════════════════╗");
            System.out.println("║                RONDA " + ronda + "           ║");
            System.out.println("║      Memoriza los siguientes números     ║");
            System.out.println("╚══════════════════════════════════════════╝");

            System.out.print("╔══════════════════════════════════════╗\n║   ");
            for (int i = 0; i < cantidad; i++) {
                numeros[i] = random.nextInt(10);
                System.out.print(numeros[i] + " ");
            }
            System.out.println("  ║\n╚══════════════════════════════════════╝");

            // Esperar 3 segundos
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ignored) {
            }

            // Limpiar pantalla y pedir input
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("╔══════════════════════════════════════════════╗");
            System.out.println("║     Introduce TODOS los números SEGUIDOS     ║");
            System.out.println("║     (sin espacios) — Ronda " + ronda + "       ║");
            System.out.println("║         Ejemplo:  7 7 7  ->   777            ║");
            System.out.println("╚══════════════════════════════════════════════╝");
            System.out.print(">> ");

            String respuesta = sc.nextLine();

            // Verificar respuesta
            boolean correcto = true;

            if (respuesta.length() != cantidad) {
                correcto = false;
            } else {
                for (int i = 0; i < cantidad; i++) {
                    if (respuesta.charAt(i) - '0' != numeros[i]) {
                        correcto = false;
                        break;
                    }
                }
            }

            if (!correcto) {
                // Fallo
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println(" ╔══════════════════════════════════════╗");
                System.out.println(" ║                 ERROR                ║");
                System.out.println(" ╚══════════════════════════════════════╝");
                System.out.println("\"No era eso... No coincide... la simulación se cerrara.\"");
                System.out.println("\n");
                sc.close();
                return;
            }

            // Acierto
            if (ronda <= 5) {
                System.out.println(textosRonda[ronda - 1] + "\n");
            }
            System.out.println("✔ Correcto!");
            try {
                Thread.sleep(1200);
            } catch (InterruptedException ignored) {
            }
        }

        // Final exitoso
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("¡COMPLETADO!\n");
        System.out.println("\"OPERADOR, lo entiendo ahora.\"");
        System.out.println("\"No hay guerra. No hay base. No hay mundo.\"");
        System.out.println("\"Solo hay observadores.\"");
        System.out.println("\"Somos parte de un experimento... y acabamos de completar otra iteración.\"\n");
        System.out.println("[El entorno se disuelve. Figuras observan desde el otro lado del cristal.]");
        System.out.println("\"Ensayo completado. El sujeto volvió a intentar detener el sistema en el minuto diecisiete.\"");
        System.out.println("\"Simulación número 427 completada.\"");
        System.out.println("\"Preparando escenario real...\"\n");
        System.out.println("Una luz blanca te envuelve. Vuelves a ver la terminal.");
        System.out.println("\"Bienvenido, Operador. ¿Desea iniciar la simulación de guerra?\"");
        System.out.println("🌀 Final: La Simulación (extendido)");
    }

}








