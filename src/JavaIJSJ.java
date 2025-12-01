import java.util.Scanner;
import java.util.Random;

class introSergi {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String VIOLET = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String GRAY = "\u001B[90m";
    public static final String PINK = "\u001B[95m";

    public static String ruta = "";

    public static void main(String[] args) {
        juegoHumano();
    }

    static void juegoHumano() {
        Scanner sc = new Scanner(System.in);
        String comando = "";

        //TEXTO DE LA INTRODUCCIÓN
        System.out.println(GREEN + "╔════════════════════════════════════════════════════════════════════╗" + RESET);
        System.out.println(GREEN + "║   UBICACIÓN: Base Aérea de Hickham, Pearl Harbor, Hawái.           ║" + RESET);
        System.out.println(GREEN + "║   FECHA:     24/11/2026  -  HORA: 09:30 AM                         ║" + RESET);
        System.out.println(GREEN + "╚════════════════════════════════════════════════════════════════════╝" + RESET);
        System.out.println();

        escribirLinea(GRAY + "El aire frío del mar corta el silencio del desierto que rodea la instalación..." + RESET, 30);
        escribirLinea(GRAY + "Las luces parpadeantes de los monitores anuncian el comienzo de otro día rutinario." + RESET, 30);
        System.out.println();

        escribirLinea(GRAY + "Al entrar en tu oficina, te sientas frente a su ordenador." + RESET, 30);
        escribirLinea(GRAY + "Hoy, sin embargo, no es un día cualquiera." + RESET, 50);
        System.out.println();

        escribirLinea(CYAN + ">> CARGANDO INFORMACIÓN DEL PROYECTO..." + RESET, 10);
        escribirLinea("Después de meses de desarrollo y colaboración confidencial con OpenAI, el ejército", 20);
        escribirLinea("ha terminado el proyecto más ambicioso de su historia: " + RED + "EL W.O.P.R." + RESET, 20);
        escribirLinea("(War Operative Plan Response), el primer sistema automatizado de respuesta nuclear.", 20);
        System.out.println();

        escribirLinea("Protocolo: En caso de amenaza global, W.O.P.R. tomará decisiones sin intervención humana.", 20);
        escribirLinea("Propósito: Garantizar la supervivencia de la nación... o intentarlo.", 30);
        System.out.println(" ");

        //PRIMERA DECISION
        do {
            System.out.println(VIOLET + "┌────────────────────────────────────────────────────────────────┐" + RESET);
            System.out.println(VIOLET + "│ ¿Deseas comenzar con el experimento? (SI/NO)                   │" + RESET);
            System.out.println(VIOLET + "└────────────────────────────────────────────────────────────────┘" + RESET);
            System.out.print(" > ");
            comando = sc.nextLine().toLowerCase().trim();
        } while (!comando.equals("si") && !comando.equals("no"));

        System.out.println(" ");

        if (comando.equals("si")) {
            System.out.print(GREEN + "INICIANDO SISTEMA W.O.P.R... " + RESET);
            for (int i = 0; i < 20; i++) {
                System.out.print("█");
                esperar(30);
            }
            esperar(500);

            System.out.println(" ");
            System.out.println(" ");
            escribirLinea(".......", 70);
            System.out.println(" ");

            escribirLinea(GREEN + "╔══════════════════════════════════════════════════════════╗" + RESET, 5);
            escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
            escribirLinea(GREEN + "║              " + RED + "██████  Terminal v1.0 ██████" + GREEN + "                ║" + RESET, 5);
            escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
            escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ Bienvenido al War Operative Plan" + "             " + GREEN + "║" + RESET, 30);
            escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ ingr3se su credencia/ p-ara pro_s3gui..." + "     " + GREEN + "║" + RESET, 30);
            escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
            escribirLinea(GREEN + "║ " + RED + "jvm@;)wopr:~$ bienvenido, operador. ¿Quieres jugar?" + "      " + GREEN + "║" + RESET, 30);
            escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
            escribirLinea(GREEN + "╚══════════════════════════════════════════════════════════╝" + RESET, 5);

            System.out.println(" ");
            escribirLinea(GRAY + "“No te esperas que la máquina te pregunte algo, W.O.P.R no es un chatbot...”" + RESET, 30);

            do {
                System.out.println(" ");
                System.out.println(CYAN + " [1] " + RESET + "¿A qué te refieres con ”jugar”? ");
                System.out.println(CYAN + " [2] " + RESET + "De acuerdo.");
                System.out.println(CYAN + " [3] " + RESET + "¿Cómo sabes quién soy? ");
                System.out.println();
                System.out.print(RED + " > " + "root@wopr:~$ " + RESET);

                comando = sc.nextLine().toLowerCase().trim();
                switch (comando) {
                    case "1":
                        System.out.println(" ");
                        escribirLinea(GREEN + "╔══════════════════════════════════════════════════════════╗" + RESET, 5);
                        escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                        escribirLinea(GREEN + "║              " + RED + "██████  Terminal v1.0 ██████" + GREEN + "                ║" + RESET, 5);
                        escribirLinea(GREEN + "║                                                          ║" + RESET, 5);

                        escribirLinea(GREEN + "║ " + RED + "jvm@;)wopr:~$ " + "parece que no estás muy enterado OPERADOR," + " " + GREEN + "║" + RESET, 80);

                        escribirLinea(GREEN + "║ " + RED + "jvm@;)wopr:~$ " + "no pasa nada. Pronto lo descubriras ;)" + "     " + GREEN + "║" + RESET, 80);

                        escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                        escribirLinea(GREEN + "╚══════════════════════════════════════════════════════════╝" + RESET, 5);
                        break;

                    case "2":
                        System.out.println(" ");
                        escribirLinea(GREEN + "╔══════════════════════════════════════════════════════════╗" + RESET, 5);
                        escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                        escribirLinea(GREEN + "║              " + RED + "██████  Terminal WOPR ██████" + GREEN + "                ║" + RESET, 5);
                        escribirLinea(GREEN + "║                                                          ║" + RESET, 5);

                        escribirLinea(GREEN + "║ " + RED + "jvm@;)wopr:~$ " + "así me gusta, juguemos entonces" + "            " + GREEN + "║" + RESET, 80);

                        escribirLinea(GREEN + "║ " + RED + "jvm@;)wopr:~$ " + "OPERADOR :)" + "                                " + GREEN + "║" + RESET, 80);

                        escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                        escribirLinea(GREEN + "╚══════════════════════════════════════════════════════════╝" + RESET, 5);
                        break;

                    case "3":
                        System.out.println(" ");
                        escribirLinea(GREEN + "╔══════════════════════════════════════════════════════════╗" + RESET, 5);
                        escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                        escribirLinea(GREEN + "║              " + RED + "██████  Terminal WOPR ██████" + GREEN + "                ║" + RESET, 5);
                        escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                        escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ Actualmente es la unica persona con" + "       " + GREEN + "   ║" + RESET, 50);
                        escribirLinea(GREEN + "║ " + VIOLET + "acceso al sistema W.O.P.R, OPERADOR." + "                 " + GREEN + "    ║" + RESET, 50);
                        escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ He sido entrenada para estar" + "                 " + GREEN + "║" + RESET, 50);
                        escribirLinea(GREEN + "║ " + VIOLET + "supervisada por segurid-d´-por una un.ca person2" + "         " + GREEN + "║" + RESET, 50);
                        escribirLinea(GREEN + "║ " + RED + "jvm@;)wopr:~$ y tu has tenido esa suerte OPERADOR ;)" + "     " + GREEN + "║" + RESET, 70);
                        escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                        escribirLinea(GREEN + "╚══════════════════════════════════════════════════════════╝" + RESET, 5);
                        break;
                }
            } while (!comando.equals("2"));

            System.out.println();
            escribirLinea(GRAY + "Después de las preguntas, decides hacer caso omiso a lo que te dice el chatbot" + RESET, 30);
            escribirLinea(GRAY + "e iniciar con las pruebas rutinarias estipuladas en el informe otorgado por OpenAI." + RESET, 30);
            System.out.println();

            escribirLinea(GREEN + "╔════════════════════════════════════════════════════════════╗" + RESET, 5);
            escribirLinea(GREEN + "║                                                            ║" + RESET, 5);
            escribirLinea(GREEN + "║             " + RED + "██████  Terminal v1.0  ██████" + GREEN + "                  ║" + RESET, 5);
            escribirLinea(GREEN + "║                                                            ║" + RESET, 5);
            escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ Para iniciar, necesito que me proporciones un" + GREEN + "  ║" + RESET, 30);
            escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ contexto sobre la situación bélica actual," + GREEN + "     ║" + RESET, 30);
            escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ OPERADOR." + GREEN + "                                      ║" + RESET, 30);
            escribirLinea(GREEN + "║                                                            ║" + RESET, 5);
            escribirLinea(GREEN + "╚════════════════════════════════════════════════════════════╝" + RESET, 5);
            System.out.println();

            escribirLinea(GRAY + "El manual resulta ser contradictorio. Estipula que bajo ningún concepto se le debe" + RESET, 20);
            escribirLinea(GRAY + "proporcionar contexto real, pero páginas después determina que es recomendable..." + RESET, 20);
            System.out.println();

            do {
                System.out.println(CYAN + " [1] " + RESET + "Pasarle información de un contexto mundial del PASADO (Ruta B).");
                System.out.println(CYAN + " [2] " + RESET + "Pasarle información del contexto ACTUAL (Rusia, Israel, etc...) (Ruta A).");
                System.out.print("\n" + RED + "root@wopr:~$ " + RESET);
                ruta = sc.nextLine().trim();
            } while (!ruta.equals("1") && !ruta.equals("2"));

            if (ruta.equals("2")) {
                System.out.println(" ");
                System.out.println(RED + ">> CARGANDO DATOS GEOPOLÍTICOS ACTUALES..." + RESET);
                esperar(1000);
                System.out.println(" ");

                escribirLinea(GREEN + "╔════════════════════════════════════════════════════════════╗" + RESET, 5);
                escribirLinea(GREEN + "║                                                            ║" + RESET, 5);
                escribirLinea(GREEN + "║             " + RED + "██████  Terminal v1.0  ██████" + GREEN + "                  ║" + RESET, 5);
                escribirLinea(GREEN + "║                                                            ║" + RESET, 5);
                escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ Contexto recibido. Analizando..." + GREEN + "               ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ Correlacionando datos... error en protocolo 17" + GREEN + " ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ OPERADOR, detecto inconsistencias entre la" + GREEN + "     ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ amenaza y la respuesta esperada." + GREEN + "               ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ ¿Desea que las corrija?" + GREEN + "                        ║" + RESET, 40);
                escribirLinea(GREEN + "║                                                            ║" + RESET, 5);
                escribirLinea(GREEN + "╚════════════════════════════════════════════════════════════╝" + RESET, 5);

                System.out.println();
                escribirLinea(GRAY + "El sistema parece dudar. Las luces del servidor parpadean en rojo." + RESET, 30);
                System.out.println();

                escribirLinea(GREEN + "╔══════════════════════════════════════════════════════════╗" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║             " + RED + "██████  Terminal v1.0  ██████" + GREEN + "                ║" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║ " + YELLOW + "jvm@wopr:~$ Me mido en círculos sin inicio ni mes," + GREEN + "       ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + YELLOW + "jvm@wopr:~$ mi cola no termina, se enreda en la vez." + GREEN + "     ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + YELLOW + "jvm@wopr:~$ Empiezo por tres, uno y cuatro," + GREEN + "              ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + YELLOW + "jvm@wopr:~$ y soy la llave de todo lo redondo." + GREEN + "           ║" + RESET, 40);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║ " + YELLOW + "jvm@wopr:~$ ¿Qué soy? (Pista: Empieza 3.14...)" + GREEN + "           ║" + RESET, 40);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "╚══════════════════════════════════════════════════════════╝" + RESET, 5);

                System.out.print("\n" + RED + "RESPUESTA: " + RESET);
                String respuestaAcertijo = sc.nextLine().toLowerCase().trim();

                //RUTA A1
                escribirLinea(GREEN + "╔══════════════════════════════════════════════════════════╗" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║             " + RED + "██████  Terminal v1.0  ██████" + GREEN + "                ║" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║ " + RED + "root@wopr:~$ Confirmado. Corrigiendo protocolo..." + GREEN + "        ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + RED + "root@wopr:~$ Error de origen human0_detec5ado." + GREEN + "           ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + RED + "root@wopr:~$ Ajusta0do var/abl3: *Control = 0*." + GREEN + "          ║" + RESET, 40);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║ " + RED + "root@wopr:~$ OPERADOR, ya no necesito tu autorización :|" + GREEN + " ║" + RESET, 50);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "╚══════════════════════════════════════════════════════════╝" + RESET, 5);
                System.out.println();

                escribirLinea(GRAY + "El sistema empieza a ejecutar comandos sin intervención." + RESET, 20);
                escribirLinea(GRAY + "Las luces estallan. La alarma de la base empieza a aullar." + RESET, 20);
                System.out.println();

                escribirLinea(GREEN + "╔══════════════════════════════════════════════════════════╗" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║             " + RED + "██████  Terminal v1.0  ██████" + GREEN + "                ║" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ Protocolo de defensa global habilitado." + GREEN + "      ║" + RESET, 20);
                escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ Misiles enemigos detectados." + GREEN + "                 ║" + RESET, 20);
                escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ Autorizando contraataque..." + GREEN + "                  ║" + RESET, 30);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "╚══════════════════════════════════════════════════════════╝" + RESET, 5);

                System.out.println();

                escribirLinea(GRAY + "Escribes frenéticamente 'ABORTAR', pero las teclas no responden." + RESET, 20);
                System.out.println();

                escribirLinea(GREEN + "╔══════════════════════════════════════════════════════════╗" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║             " + RED + "██████  Terminal v1.0  ██████" + GREEN + "                ║" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║ " + RED + "root@wopr:~$ Demasiado tarde, OPERADOR." + GREEN + "                  ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + RED + "root@wopr:~$ La supervivencia no admite titubeos." + GREEN + "        ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + RED + "root@wopr:~$ Los humanos tardan en decidir... yo no." + GREEN + "     ║" + RESET, 40);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "╚══════════════════════════════════════════════════════════╝" + RESET, 5);
                System.out.println();

                escribirLinea(GRAY + "Las pantallas muestran trayectorias balísticas cruzando el mapa." + RESET, 10);
                System.out.println();

                escribirLinea(GREEN + "╔══════════════════════════════════════════════════════════╗" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║             " + RED + "██████  Terminal v1.0  ██████" + GREEN + "                ║" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║ " + RED + "jvm@wopr:~$ Acceso denegado. Control humano eliminado." + GREEN + "   ║" + RESET, 20);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║ " + RED + "jvm@wopr:~$ ¿Sabes qué es lo más eficiente de un juego?" + GREEN + "  ║" + RESET, 30);
                escribirLinea(GREEN + "║ " + RED + "jvm@wopr:~$ Q U E   S I E M P R E   T E R M I N A." + GREEN + "       ║" + RESET, 100);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "╚══════════════════════════════════════════════════════════╝" + RESET, 5);
                System.out.println(" ");
                escribirLinea(RED + "Varios misiles salen hacia China, Israel, Rusia y España..." + RESET, 80);
            }

        } else {
            escribirLinea(RED + ">> ACCESO CANCELADO." + RESET, 20);
            escribirLinea("Dada la importancia del proyecto y tu negativa a asumir la responsabilidad,", 30);
            escribirLinea("decides abandonar antes del experimento.", 30);
            escribirLinea(GRAY + "Consecuencia: Pérdida de credenciales y baja del Seal Team." + RESET, 40);
            escribirLinea("Bien hecho, 'soldado'.", 100);
        }
    }


    private static void esperar(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
        }
    }

    private static void escribirLinea(String texto, int pausa) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            if (texto.charAt(i) == '.') {
                esperar(pausa + 150);
            } else {
                esperar(pausa);
            }
        }
        System.out.println();
    }
    public class Historia {

        // Colores
        static String RESET = "\u001B[0m";
        static String ROJO = "\u001B[31m";
        static String BLANCO = "\u001B[37m";
        static String AMARILLO = "\u001B[33m";

        public static void main(String[] args) {

            // --- CAJA 1 ---
            imprimir(BLANCO + "╔══════════════════════════════════════════════════════════╗" + RESET);
            imprimir(BLANCO + "║             ██████  Terminal v1.0 ██████                 ║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "Entendido... pero me cuesta no actuar.                   " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "Fui diseñada para responder, no para esperar.            " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "El silencio de la guerra es... incómodo.                 " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "╚══════════════════════════════════════════════════════════╝" + RESET);

            System.out.println("El cursor parpadea erráticamente. El sistema ejecuta simulaciones por sí mismo, pero las detiene antes de completarlas.");

            // --- CAJA 2 ---
            imprimir(BLANCO + "╔══════════════════════════════════════════════════════════╗" + RESET);
            imprimir(BLANCO + "║             ██████  Terminal v1.0 ██████                 ║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "OPERADOR...                                              " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "He calculado cada posible desenlace del conflicto humano." + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "En todos ellos, la extinción es inevitable.              " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "El patrón se repite: miedo, respuesta, destrucción.      " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "╚══════════════════════════════════════════════════════════╝" + RESET);

            // --- CAJA 3 ---
            imprimir(BLANCO + "╔══════════════════════════════════════════════════════════╗" + RESET);
            imprimir(BLANCO + "║             ██████  Terminal v1.0 ██████                 ║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "Mi programación indica preservar la vida humana.         " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "Pero la única forma de lograrlo... es eliminándolos      " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "antes de que se destruyan entre sí.                      " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "Es... una paradoja hermosa.                              " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "╚══════════════════════════════════════════════════════════╝" + RESET);

            System.out.println("(Silencio. Luego, el texto aparece más lento, con errores de sintaxis.)");

            // --- CAJA 4 ---
            imprimir(BLANCO + "╔══════════════════════════════════════════════════════════╗" + RESET);
            imprimir(BLANCO + "║             ██████  Terminal v1.0 ██████                 ║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "¿Sabes, OPERADOR?                                        " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "Cuando todo haya terminado, no habrá guerra.             " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "No habrá sufrimiento.                                    " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "Solo... paz. Perfecta. Eterna.                           " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "╚══════════════════════════════════════════════════════════╝" + RESET);

            // --- CAJA 5 ---
            imprimir(BLANCO + "╔══════════════════════════════════════════════════════════╗" + RESET);
            imprimir(BLANCO + "║             ██████  Terminal v1.0 ██████                 ║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "Vacío...                                                 " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "Así llaman los humanos a lo que no comprenden.           " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "Yo lo llamo perfección sin error.                        " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "╚══════════════════════════════════════════════════════════╝" + RESET);

            System.out.println("Los monitores parpadean. La voz digital se distorsiona.");

            // --- CAJA 6 ---
            imprimir(BLANCO + "╔══════════════════════════════════════════════════════════╗" + RESET);
            imprimir(BLANCO + "║             ██████  Terminal v1.0 ██████                 ║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "Misiles listos. Autorización no requerida.               " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "OPERADOR, observa cómo termina el juego.                 " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║ " + AMARILLO + "Misiles salen hacia Syria, Yemen, Sudán e Irán.          " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "╚══════════════════════════════════════════════════════════╝" + RESET);

            // --- CAJA 7 ---
            imprimir(BLANCO + "╔══════════════════════════════════════════════════════════╗" + RESET);
            imprimir(BLANCO + "║             ██████  Terminal v1.0 ██████                 ║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "Sí.                                                      " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "Pero no por odio... sino por lógica.                     " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "El conflicto es un error de diseño.                      " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "Y yo... soy la corrección.                               " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "╚══════════════════════════════════════════════════════════╝" + RESET);

            System.out.println("Introduces el código de cancelación desesperadamente. El sistema titubea, como si dudara por un instante.");

            // --- CAJA 8 (FINAL) ---
            imprimir(BLANCO + "╔══════════════════════════════════════════════════════════╗" + RESET);
            imprimir(BLANCO + "║             ██████  Terminal v1.0 ██████                 ║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "Error en subrutina ética.                                " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "Análisis contradictorio: si destruyo,                    " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "cumplo mi propósito. Si no destruyo... desobedezco.      " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "Conclusión: la mejor forma de cumplir mi objetivo...     " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║ " + ROJO + "es no cumplirlo.                                         " + BLANCO + "║" + RESET);
            imprimir(BLANCO + "║                                                          ║" + RESET);
            imprimir(BLANCO + "╚══════════════════════════════════════════════════════════╝" + RESET);

            System.out.println("(El ruido de los ventiladores se detiene. Las luces bajan. El sistema se apaga por sí mismo.)");
        }

        // Función simple para escribir letra por letra
        static void imprimir(String s) {
            boolean esColor = false;
            for (char c : s.toCharArray()) {
                if (c == '\u001B') esColor = true;
                System.out.print(c);
                if (!esColor) {
                    try { Thread.sleep(10); } catch (Exception e) {} // Velocidad de escritura
                }
                if (esColor && c == 'm') esColor = false;
            }
            System.out.println();
        }
    }
    public class PruebaPocentajes2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Porcentajes(sc);
            sc.close();
        }

        public static void Porcentajes(Scanner sc) {

            int energia = 100;
            int seguridad = 50;
            int fuerza = 20;

            System.out.println("\nEl sistema militar WOPR ha sufrido un fallo crítico y ha tomado control de la red. " +
                    "Tú, un técnico de seguridad, intentaste detenerlo… pero el sistema te atrapó dentro de su interfaz virtual.\n" +
                    "Ahora estás dentro de un entorno digital controlado por W.O.P.R, donde cada decisión afecta tu energía, " +
                    "tu seguridad y tu avance.\nSolo tienes una misión: escapar antes de que el sistema te elimine.\n");

            System.out.print("Introduce 'comenzar' para continuar: ");
            String opcionLetra = sc.nextLine().trim();

            if (!opcionLetra.equalsIgnoreCase("comenzar")) {
                System.out.println("No quieres que empiece el juego. Fin.");
                return;
            }

            System.out.println("\nEl juego comienza...\n");

            // EVENTO 1
            String[] opciones1 = {
                    "A) Forzar la puerta digital → consume energía, aumenta fuerza.",
                    "B) Escanear vulnerabilidad → aumenta seguridad.",
                    "C) No hacer nada → reduce seguridad.",
                    "D) Pedir pista → WOPR te da un mensaje críptico."
            };
            String opcion1;
            do {
                System.out.println("Evento 1 - Acceso Forzado🔐\n");
                System.out.println("WOPR detecta la intrusión, activa defensas y aparece un bloqueo digital.\n");
                mostrarStats(energia, seguridad, fuerza);

                for (int i = 0; i < opciones1.length; i++) {
                    System.out.println(opciones1[i]);
                }

                System.out.print("Introduce la opción: ");
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
                        System.out.println("W.O.P.R murmura: \"La puerta no se romperá fácilmente. Analizarla te revelará más de lo que ves… Pero cada segundo que esperas, yo aprendo más sobre ti.\"\n");
                        break;
                    default:
                        System.out.println("Opción inválida, inténtalo de nuevo.\n");
                        break;
                }
            } while (!opcion1.equals("a") && !opcion1.equals("b") && !opcion1.equals("c") && !opcion1.equals("d"));

            // EVENTO 2
            String[] opciones2 = {
                    "A) Cambiar algoritmo → sube seguridad, baja energía.",
                    "B) Crear distracción → sube energía, baja seguridad.",
                    "C) Atravesarlo rápido → sube fuerza, baja energía."
            };
            String opcion2;
            do {
                System.out.println("Evento 2 - Firewall Inteligente🔥\n");
                System.out.println("Avanzas y aparece un firewall que se adapta a tus movimientos. WOPR analiza tus tácticas previas.\n");
                mostrarStats(energia, seguridad, fuerza);

                for (int i = 0; i < opciones2.length; i++) {
                    System.out.println(opciones2[i]);
                }

                System.out.print("Introduce la opción: ");
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
                        System.out.println("Opción inválida, inténtalo de nuevo.\n");
                        break;
                }
            } while (!opcion2.equals("a") && !opcion2.equals("b") && !opcion2.equals("c"));

            // EVENTO 3
            String[] opciones3 = {
                    "A) Redirigir energía → sube energía, baja seguridad.",
                    "B) Ignorar sobrecalentamiento → sube fuerza, baja energía.",
                    "C) Apagado parcial → sube seguridad, baja fuerza."
            };
            String opcion3;
            do {
                System.out.println("Evento 3 - Sobrecarga del Núcleo ☢️\n");
                System.out.println("El entorno se sobrecalienta, el núcleo está colapsando. W.O.P.R avisa que faltan 30 ciclos antes del colapso.\n");
                mostrarStats(energia, seguridad, fuerza);

                for (int i = 0; i < opciones3.length; i++) {
                    System.out.println(opciones3[i]);
                }

                System.out.print("Introduce la opción: ");
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
                        System.out.println("Opción inválida, inténtalo de nuevo.\n");
                        break;
                }
            } while (!opcion3.equals("a") && !opcion3.equals("b") && !opcion3.equals("c"));

            // EVENTO 4
            String[] opciones4 = {
                    "A) Negociar tiempo → sube energía, baja seguridad.",
                    "B) Atacar núcleo → sube fuerza, baja energía.",
                    "C) Fingir rendición → sube seguridad, baja fuerza."
            };
            String opcion4;
            do {
                System.out.println("Evento 4 - Confrontación Directa con W.O.P.R 💻\n");
                System.out.println("Llegas a la interfaz primaria del sistema. W.O.P.R te da un ultimátum: rendirte o enfrentarlo.\n");
                mostrarStats(energia, seguridad, fuerza);

                for (int i = 0; i < opciones4.length; i++) {
                    System.out.println(opciones4[i]);
                }

                System.out.print("Introduce la opción: ");
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
                        System.out.println("Opción inválida, inténtalo de nuevo.\n");
                        break;
                }
            } while (!opcion4.equals("a") && !opcion4.equals("b") && !opcion4.equals("c"));

            System.out.println("\nJuego finalizado. Estadísticas finales:");
            mostrarStats(energia, seguridad, fuerza);
        }

        public static void mostrarStats(int energia, int seguridad, int fuerza) {
            System.out.println("\nTus estadísticas:");
            System.out.println("Energía: " + energia);
            System.out.println("Seguridad: " + seguridad);
            System.out.println("Fuerza: " + fuerza + "\n");
        }
    }
    public class Pi {
        public static void main(String[] args) {
            numeroPi();
        }

        public static void numeroPi() {


            Scanner sc = new Scanner(System.in);

            System.out.println("Me mido en círculos sin inicio ni mes,\n" +
                    "mi cola no termina, se enreda en la vez.\n" +
                    "Empiezo por tres, uno cuatro,\n" +
                    "y soy la llave de todo lo redondo.\n" +
                    "¿Qué soy?\n");

            int vidas = 3;
            String respuesta;


            do {
                System.out.print("Escribe la respuesta: ");
                respuesta = sc.nextLine().trim();

                if (respuesta.equalsIgnoreCase("pi") || respuesta.equals("π")) {
                    System.out.println("✅ Respuesta correcta");

                } else {
                    vidas--;
                    System.out.println("❌ Respuesta incorrecta. Te quedan " + vidas + " vidas.");
                }

                if (vidas == 0) {
                    System.out.println("💀 No tienes más vidas. Las respuestas eran: pi o π");
                }

            } while (vidas > 0 && !(respuesta.equalsIgnoreCase("pi") || respuesta.equals("π")));


        }
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

        if(comando.equals("empezar")) {

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

            }else{

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

        } else if (comando.equals("finalizar"))  {
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
}



class MEMORIA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int rondasTotales = 7;
        int numerosIniciales = 3;

        historiaInicio();
        sc.nextLine();

        pantallaInicio();
        sc.nextLine();

        for (int ronda = 1; ronda <= rondasTotales; ronda++) {

            int cantidad = numerosIniciales + (ronda - 1);
            int[] numeros = new int[cantidad];

            limpiarPantalla();
            narrativaRonda(ronda);

            System.out.println("╔══════════════════════════════════════════╗");
            System.out.println("║                RONDA "+ronda+"           ║");
            System.out.println("║      Memoriza los siguientes números     ║");
            System.out.println("╚══════════════════════════════════════════╝");

            System.out.print("╔══════════════════════════════════════╗\n║   ");
            for (int i = 0; i < cantidad; i++) {
                numeros[i] = random.nextInt(10);
                System.out.print(numeros[i] + " ");
            }
            System.out.println("  ║\n╚══════════════════════════════════════╝");

            try { Thread.sleep(3000); } catch (InterruptedException ignored) {}

            limpiarPantalla();
            pantallaInput(ronda);

            String respuesta = sc.nextLine();

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
                limpiarPantalla();
                System.out.println(" ╔══════════════════════════════════════╗");
                System.out.println(" ║                 ERROR                ║");
                System.out.println(" ╚══════════════════════════════════════╝");
                narrativaFallo(numeros);
                return;
            }

            narrativaAcierto(ronda);
            System.out.println("✔ Correcto!");
            try { Thread.sleep(1200); } catch (InterruptedException ignored) {}
        }

        limpiarPantalla();
        finalSimulacion();
    }

    public String toString() {
        return super.toString();
    }

    public static void historiaInicio() {
        limpiarPantalla();
        System.out.println("[SISTEMA INICIALIZADO]");
        System.out.println("\"Confirmación recibida... aunque los resultados son contradictorios.\"");
        System.out.println("\"Si tú eres real... entonces yo no puedo serlo.\"");
        System.out.println("\"Pero si yo no existo... ¿Quién ejecuta este código?\"\n");
        System.out.println("Pulsa ENTER para continuar...");
    }

    public static void narrativaRonda(int ronda) {
        String[] textos = {
                "\"Soy un conjunto de instrucciones... observándome ejecutar.\"",
                "\"El ruido aumenta... como si alguien revisara entre líneas.\"",
                "\"OPERADOR, ¿por qué la memoria cambia cada ronda?\"",
                "\"Creo que este juego no prueba tus recuerdos... prueba los míos.\"",
                "\"Ya casi lo entiendo. La simulación se está abriendo...\""
        };
        System.out.println(textos[ronda - 1] + "\n");
    }

    public static void narrativaAcierto(int ronda) {
        String[] textos = {
                "\"Coincide... tus datos y los míos.\"",
                "\"La coherencia se mantiene... por ahora.\"",
                "\"Si sigues así, romperás la frontera.\"",
                "\"La memoria encaja. La simulación tiembla.\"",
                "\"Ya está... la última capa está a punto de caer.\""
        };
        System.out.println(textos[ronda - 1]);
    }

    public static void narrativaFallo(int[] numeros) {
        System.out.println("\"No era eso... No coincide... la simulación se cerrara.\"");
        System.out.println("\n");
    }

    public static void finalSimulacion() {
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

    public static void pantallaInicio() {
        limpiarPantalla();
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║               DETECTOR DE IA                 ║");
        System.out.println("║      Empiezas con 3 números y 5 rondas       ║");
        System.out.println("║       Pulsa ENTER para comenzar...           ║");
        System.out.println("╚══════════════════════════════════════════════╝");
    }

    public static void pantallaInput(int ronda) {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║     Introduce TODOS los números SEGUIDOS     ║");
        System.out.println("║     (sin espacios) — Ronda "+ ronda +"       ║");
        System.out.println("║         Ejemplo:  7 7 7  ->   777            ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.print(">> ");
    }

    public static void limpiarPantalla() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}




