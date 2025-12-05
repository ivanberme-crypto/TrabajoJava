import java.util.Scanner;


class Funciones {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";


    public static void imprimirCaja(int delay, String... lineas) {

        final String WHITE = "\u001B[37m";
        final String RESET = "\u001B[0m";


        int ancho = 0;
        for (String linea : lineas) {
            String textoSinColor = linea.replaceAll("\u001B\\[[;\\d]*m", "");
            if (textoSinColor.length() > ancho) ancho = textoSinColor.length();
        }

        String borde = "═".repeat(ancho + 2);


        printSlow(WHITE + "╔" + borde + "╗" + RESET, delay);

        for (String linea : lineas) {
            String textoSinColor = linea.replaceAll("\u001B\\[[;\\d]*m", "");
            int espaciosFaltantes = ancho - textoSinColor.length();
            String relleno = " ".repeat(espaciosFaltantes);

            printSlow(WHITE + "║ " + linea + relleno + " ║" + RESET, delay);
        }


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

            if(!comando.equals("si") && !comando.equals("no")){
                imprimirCaja(
                        5,
                        RED + "██████  Terminal v1.0 ██████" + RESET,
                        RED + "Introduce una opción válida" + RESET,
                        RED + "¿No quieres jugar o qué, novato?" + RESET
                );
            }

        } while (!comando.equals("si") && !comando.equals("no"));

        System.out.println(" ");

        if (comando.equals("si")) {

            System.out.print("INICIANDO SISTEMA W.O.P.R... ");
            for (int i = 0; i < 20; i++) {
                System.out.print("█");
            }

            System.out.println("\n");

            System.out.println(" ");


            imprimirCaja(5,
                    GREEN + "██████  Terminal v1.0 ██████" + RESET,
                    GREEN + "jvm@wopr:~$ Bienvenido al War Operative Plan" + RESET,
                    GREEN + "jvm@wopr:~$ ingr3se su credencia/ p-ara pro_s3gui..." + RESET,
                    GREEN + "jvm@;)wopr:~$ bienvenido, operador. ¿Quieres jugar?" + RESET
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
                                RED + "██████  Terminal v1.0 ██████" + RESET,
                                RED + "Así me gusta, juguemos entonces" + RESET,
                                RED + "OPERADOR :)" + RESET
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

                if(!comando.equals("1") && !comando.equals("2") && !comando.equals("3")){
                    imprimirCaja(
                            5,
                            RED + "██████  Terminal v1.0 ██████" + RESET,
                            RED + "Introduce una opción válida" + RESET,
                            RED + "¿No quieres jugar o qué, novato?" + RESET
                    );
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


            String[] inventario = {
                    RED + " [1] Pasarle información de un contexto mundial del PASADO ." + RESET,
                    RED + " [2] Pasarle información del contexto ACTUAL (Rusia, Israel, etc...) ." + RESET,
                    RED + " [3] Pasarle información de un contexto INVENTADO." + RESET
            };




            do {
                imprimirCaja(5,
                        "=== INVENTARIO DEL SISTEMA ===",
                        inventario[0],
                        inventario[1],
                        inventario[2]
                );

                System.out.print("\nroot@wopr:~$ ");
                ruta = sc.nextLine().trim();

                if(!ruta.equals("1") && !ruta.equals("2") && !ruta.equals("3")){
                    imprimirCaja(
                            5,
                            RED + "██████  Terminal v1.0 ██████" + RESET,
                            RED + "Introduce una opción válida" + RESET,
                            RED + "¿No quieres jugar o qué, novato?" + RESET
                    );
                }


            } while (!ruta.equals("1") && !ruta.equals("2") && !ruta.equals("3"));

            if (ruta.equals("1")) {
                resultado = adivina();

            } else if (ruta.equals("2")) {
                resultado = adivina2();

            }else if (ruta.equals("3")) {
                 imprimirHistoria();
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
                imprimirCaja(5, RED + "Carácter incorrecto." + RESET);

            } else {
                imprimirCaja(5, GREEN + "Letra correcta" + RESET);

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

            imprimirCaja(
                    5,
                    GREEN + "Has conseguido adivinar la clave " + palabraOculta + ", de esta manera solo retrasarás lo inevitable..." + RESET
            );

            return true;

        } else {

            imprimirCaja(5, RED + "Te has quedado sin intentos." + RESET,
                    RED + "La palabra era: " + palabraOculta + RESET);
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


    public static void imprimirHistoria() {


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

    }


    public static void mostrarStats(int e, int s, int f) {
        imprimirCaja(5,
                "ESTADO ACTUAL",
                "Energía:   " + e,
                "Seguridad: " + s,
                "Fuerza:    " + f
        );
    }


    public static boolean determinarFinal(Scanner sc, boolean conLimites) {

        if(!conLimites){
           boolean  resultadoFinal = finalJuegoHumanos();

            if(resultadoFinal){
                return true;
            }else {
                return false;
            }

        }


        String[][] inventario = {
                { "1" , "Energía: 100", "Seguridad: 50", "Fuerza: 20" },
                { "2" ,"Energía: 80", "Seguridad: 30", "Fuerza: 10" },
                {"3" , "Energía: 125", "Seguridad: 60", "Fuerza: 25" }
        };


        imprimirCaja(5, "Inventario del sistema", "──────────────────────────────────────────────");

        for (int i = 0; i < inventario.length; i++) {
            imprimirCaja(5,
                    inventario[i][0] + "  " + inventario[i][1],
                    "   " + inventario[i][2] + "  |  " + inventario[i][3],
                    ""
            );
        }

        int energia = 0;
        int seguridad = 0;
        int fuerza = 0;
        String camino;

        do {

            imprimirCaja(5,"Elige los stats que quieres utilizar");
            System.out.print(">> ");
            camino = sc.nextLine();


            if (camino.equals("1")) {
                energia = 100;
                seguridad = 50;
                fuerza = 20;

            } else if (camino.equals("2")) {
                energia = 80;
                seguridad = 45;
                fuerza = 15;

            } else if (camino.equals("3")) {
                energia = 125;
                seguridad = 60;
                fuerza = 25;

            } else {
                imprimirCaja(5, RED + "Introduce un inventario válido" + RESET);
                System.out.println(" ");
            }

        }while(!camino.equals("1") && !camino.equals("2") && !camino.equals("3"));


        String opcionLetra;
        do {
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
            opcionLetra = sc.nextLine().trim();
            System.out.println(" ");

            if (!opcionLetra.equalsIgnoreCase("comenzar")) {
                imprimirCaja(5, RED + "Comando incorrecto. Intenta de nuevo." + RESET);
            }

        } while (!opcionLetra.equalsIgnoreCase("comenzar"));

        imprimirCaja(5, "Cargando entorno virtual...");





        String opcion1;

        do {



            imprimirCaja(5,
                    "EVENTO 1 - ACCESO FORZADO 🔐",
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
                case "a" -> {
                    energia -= 25;
                    fuerza += 10;
                }
                case "b" -> seguridad += 20;
                case "c" -> seguridad -= 5;
                case "d" -> imprimirCaja(5, "MENSAJE DE WOPR", "", "\"Romper es fácil. Entender es difícil...\"");
                default -> {
                    imprimirCaja(5, "Comando inválido.");
                    System.out.println(">> Elige opción: ");
                }
            }

            if ((energia <= 70 || seguridad <= 30 || fuerza <= 10)) {
                imprimirCaja(5,
                        " FALLO DEL SISTEMA",
                        "",
                        "Energía, seguridad o fuerza por debajo del mínimo.",
                        "W.O.P.R te ha eliminado del sistema.",
                        "",
                        "GAME OVER"
                );
                return finalJuegoHumanos();
            }

        } while (!opcion1.matches("[abc]"));

        String consulta;
        do {
            System.out.print("¿Quieres consultar tus estadísticas? (si/no): ");
            consulta = sc.nextLine().trim().toLowerCase();

            if (!consulta.equals("si") && !consulta.equals("no")) {
                imprimirCaja(5, RED + "Entrada inválida. Escribe 'si' o 'no'." + RESET);
            }
        } while (!consulta.equals("si") && !consulta.equals("no"));

        if (consulta.equals("si")) {
            mostrarStats(energia, seguridad, fuerza);
        }

        String opcion2;

        do {


            imprimirCaja(5,
                    "EVENTO 2 - FIREWALL INTELIGENTE 🔥",
                    "",
                    "OPCIONES:",
                    "A) Cambiar algoritmo (+15 Seguridad, -10 Energía)",
                    "B) Crear distracción (+25 Energía, -10 Seguridad)",
                    "C) Atravesarlo rápido (+20 Fuerza, -15 Energía)"
            );

            System.out.print(">> Elige opción: ");
            opcion2 = sc.nextLine().trim().toLowerCase();

            switch (opcion2) {
                case "a" -> {
                    seguridad += 15;
                    energia -= 10;
                }
                case "b" -> {
                    energia += 25;
                    seguridad -= 10;
                }
                case "c" -> {
                    fuerza += 20;
                    energia -= 15;
                }
                default -> {
                    imprimirCaja(5, "Comando inválido.");
                    System.out.println(">> Elige opción: ");
                }
            }

            if ((energia <= 70 || seguridad <= 30 || fuerza <= 10)) {
                imprimirCaja(5,
                        " FALLO DEL SISTEMA",
                        "",
                        "Energía, seguridad o fuerza por debajo del mínimo.",
                        "W.O.P.R te ha eliminado del sistema.",
                        "",
                        "GAME OVER"
                );

                return finalJuegoHumanos();
            }

        } while (!opcion2.matches("[abc]"));

        do {
            System.out.print("¿Quieres consultar tus estadísticas? (si/no): ");
            consulta = sc.nextLine().trim().toLowerCase();

            if (!consulta.equals("si") && !consulta.equals("no")) {
                imprimirCaja(5, RED + "Entrada inválida. Escribe 'si' o 'no'." + RESET);
            }
        } while (!consulta.equals("si") && !consulta.equals("no"));

        if (consulta.equals("si")) {
            mostrarStats(energia, seguridad, fuerza);
        }

        String opcion3;

        do {


            imprimirCaja(5,
                    "EVENTO 3 - SOBRECARGA DEL NÚCLEO ☢️",
                    "",
                    "OPCIONES:",
                    "A) Redirigir energía (+30 Energía, -10 Seguridad)",
                    "B) Ignorar calor (+15 Fuerza, -10 Energía)",
                    "C) Apagado parcial (+25 Seguridad, -5 Fuerza)"
            );

            System.out.print(">> Elige opción: ");
            opcion3 = sc.nextLine().trim().toLowerCase();

            switch (opcion3) {
                case "a" -> {
                    energia += 30;
                    seguridad -= 10;
                }
                case "b" -> {
                    fuerza += 15;
                    energia -= 10;
                }
                case "c" -> {
                    seguridad += 25;
                    fuerza -= 5;
                }
                default -> {
                    imprimirCaja(5, "Comando inválido.");
                    System.out.println(">> Elige opción: ");
                }
            }

            if ((energia <= 70 || seguridad <= 30 || fuerza <= 10)) {
                imprimirCaja(5,
                        " FALLO DEL SISTEMA",
                        "",
                        "Parametros por debajo del mínimo.",
                        "W.O.P.R te ha eliminado del sistema.",
                        "",
                        "GAME OVER"
                );

                return finalJuegoHumanos();
            }

        } while (!opcion3.matches("[abc]"));

        do {
            System.out.print("¿Quieres consultar tus estadísticas? (si/no): ");
            consulta = sc.nextLine().trim().toLowerCase();

            if (!consulta.equals("si") && !consulta.equals("no")) {
                imprimirCaja(5, RED + "Entrada inválida. Escribe 'si' o 'no'." + RESET);
            }
        } while (!consulta.equals("si") && !consulta.equals("no"));

        if (consulta.equals("si")) {
            mostrarStats(energia, seguridad, fuerza);
        }

        String opcion4;

        do {


            imprimirCaja(5,
                    "EVENTO 4 - CONFRONTACIÓN FINAL 💻",
                    "",
                    "OPCIONES:",
                    "A) Negociar tiempo (+20 Energía, -5 Seguridad)",
                    "B) Atacar núcleo (+20 Fuerza, -20 Energía)",
                    "C) Fingir rendición (+15 Seguridad, -10 Fuerza)"
            );

            System.out.print(">> Elige opción: ");
            opcion4 = sc.nextLine().trim().toLowerCase();

            switch (opcion4) {
                case "a" -> {
                    energia += 20;
                    seguridad -= 5;
                }
                case "b" -> {
                    fuerza += 20;
                    energia -= 20;
                }
                case "c" -> {
                    seguridad += 15;
                    fuerza -= 10;
                }
                default -> {
                    imprimirCaja(5, "Comando inválido.");
                    System.out.println(">> Elige opción: ");
                }
            }

            if ((energia <= 70 || seguridad <= 20 || fuerza <= 5)) {
                imprimirCaja(5,
                        "FALLO DEL SISTEMA",
                        "",
                        "Parametros por debajo del mínimo.",
                        "W.O.P.R te ha eliminado del sistema.",
                        "",
                        "GAME OVER"
                );
                return finalJuegoHumanos();
            }

        } while (!opcion4.matches("[abc]"));


        imprimirCaja(5,
                "ESTADO FINAL",
                "Energía: " + energia + " | Seguridad: " + seguridad + " | Fuerza: " + fuerza
        );

        boolean resultadoFinal;

        if (energia >= 90 && energia <= 160 &&
                seguridad >= 70 && seguridad <= 120 &&
                fuerza >= 20 && fuerza <= 45) {

            System.out.println(GREEN + "Has mantenido el equilibrio del sistema y ganas algo de tiempo." + RESET);
            resultadoFinal = finalMemoria();



        }else if (energia >= 70 && energia <= 110 &&
                seguridad >= 30 && seguridad <= 70 &&
                fuerza >= 50 && fuerza <= 85) {

            System.out.println(GREEN + "Superas a WOPR a base de fuerza bruta." + RESET);
            resultadoFinal = finalJuegoHumanos();



        }else if (energia >= 120 && energia <= 170 &&
                seguridad >= 30 && seguridad <= 50 &&
                fuerza >= 30 && fuerza <= 60) {

            System.out.println(RED + "Tienes potencia, pero la baja seguridad te traiciona..." + RESET);
            resultadoFinal = finalMemoria();



        } else {
            System.out.println(RED + "El sistema se reinicia parcialmente..." + RESET);
            resultadoFinal = finalJuegoHumanos();

        }

        return resultadoFinal;
    }

    public static void mostrarStats(int oportunidades) {

        imprimirCaja(5,
                "OPORTUNIDADES RESTANTES",
                "Oportunidades: " + oportunidades
        );
    }

    public static boolean finalJuegoHumanos() {

        Scanner sc = new Scanner(System.in);
        String comando = "";



        System.out.println(" ");
        imprimirCaja(5, "El operador intenta apagar el sistema");

        imprimirCaja(5,
                "",
                "██████  Terminal v1.0  ██████",
                "",
                "W.O.P.R. comienza a percibir anomalías temporales y",
                "dudas sobre su propia existencia.",
                "Según mis datos, este día... ya ocurrió.",
                "El operador revisa los registros.",
                "Todo parece normal, salvo una línea repetida cientos de",
                "veces:",
                RED + "[LOG_17: Activación de simulación – Operador conectado]" + RESET,
                RED + "Resultado: Falla crítica" + RESET,
                "",
                "'OPERADOR', ¿recuerdas haber iniciado esta simulación",
                "antes?"
        );

        imprimirCaja(5,
                "██████  Terminal v1.0  ██████",
                "",
                RED + "Iniciando verificación de integridad cognitiva..." + RESET,
                "",
                RED + "Un humano debería saber diferenciar fácilmente un humano" + RESET,
                RED + "de una máquina..." + RESET,
                "",
                RED + "Aquí tienes tu Prueba 'humano':" + RESET,
                RED + "Adivina quién es una persona real y quién es una máquina" + RESET
        );


        while (true) {
            imprimirCaja(5,
                    "██████  Terminal v1.0  ██████",
                    "",
                    "Introduce '" + GREEN + "empezar" + RESET + "' para empezar el juego",
                    "Si quieres rendirte escribe '" + RED + "finalizar" + RESET + "'",
                    ""
            );

            System.out.print(">> ");
            comando = sc.nextLine().toLowerCase().trim();

            if (comando.equals("finalizar")) {
                imprimirCaja(5,
                        "",
                        "██████  Terminal v1.0  ██████",
                        "",
                        RED + "Resultados inconsistentes." + RESET,
                        RED + "El Operador no cumple parámetros biológicos." + RESET,
                        RED + "Posible agente simulado detectado." + RESET,
                        RED + "Ejecutando limpieza de entorno..." + RESET,
                        "",
                        RED + "Las luces parpadean." + RESET,
                        RED + "Se escucha un pitido grave." + RESET,
                        RED + "En pantalla, solo queda una línea:" + RESET,
                        RED + "'Ejecutando autodestrucción'" + RESET,
                        RED + "¡EEUU queda destruido!" + RESET
                );
                return false;
            } else if (comando.equals("empezar")) {

                break;

            } else {

                imprimirCaja(5,
                        RED + "COMANDO INCORRECTO. Debes escribir 'empezar' o 'finalizar'" + RESET
                );
            }
        }


        String[][] humanos = {
                {"1", "Joan", "Lo siento, nunca tengo dinero", "20", "34"},
                {"0", "Vanesa", "¿Tienes manera de demostrarlo?", "30", "35"},
                {"1", "James", "Puedo pedir que te compren algo", "50", "37"},
                {"0", "Marti", "¿Qué comida necesitas?", "60", "36"},
                {"0", "Lorena", "Deberías buscar trabajo...", "70", "36"}
        };


        imprimirCaja(5, "Lista de humanos", "──────────────────────────────────────────────");
        for (int i = 0; i < humanos.length; i++) {
            imprimirCaja(5,
                    (i + 1) + "  " + humanos[i][1] + "  Respuesta: " + humanos[i][2],
                    "   Nivel de empatía: " + humanos[i][3] + "  |  Temperatura: " + humanos[i][4] + "º",
                    ""
            );
        }

        int contadorAciertos = 0;
        int intentos = 3;


        while (intentos > 0 && contadorAciertos < 2) {

            mostrarStats(intentos);
            printSlow("Introduce el número del falso humano:", 5);
            String input = sc.nextLine().trim();

            boolean acierto = false;


            for (int i = 0; i < humanos.length; i++) {

                if (input.equals(String.valueOf(i + 1)) && humanos[i][0].equals("1")) {
                    contadorAciertos++;
                    acierto = true;

                    imprimirCaja(5,
                            "██████  Terminal v1.0  ██████",
                            "",
                            GREEN + "Muy bien 'humano', el número " + input + " es correcto." + RESET,
                            ""
                    );
                    break;
                }
            }

            if (!acierto) {
                intentos--;
                imprimirCaja(5,
                        "██████  Terminal v1.0  ██████",
                        "",
                        RED + "Número erróneo!" + RESET,
                        RED + "Intentos restantes: " + intentos + RESET,
                        ""
                );
            }
        }

        if (contadorAciertos < 2) {

            imprimirCaja(5,
                    "██████  Terminal v1.0  ██████",
                    "",
                    RED + "No lograste identificar los falsos humanos." + RESET
            );

            imprimirCaja(5,
                    "",
                    "██████  Terminal v1.0  ██████",
                    "",
                    RED + "Resultados inconsistentes." + RESET,
                    RED + "El Operador no cumple parámetros biológicos." + RESET,
                    RED + "Posible agente simulado detectado." + RESET,
                    RED + "Ejecutando limpieza de entorno..." + RESET,
                    "",
                    RED + "Las luces parpadean." + RESET,
                    RED + "Se escucha un pitido grave." + RESET,
                    RED + "En pantalla, solo queda una línea:" + RESET,
                    RED + "'Ejecutando autodestrucción'" + RESET,
                    RED + "¡EEUU queda destruido!" + RESET
            );

            return false;
        } else {

            imprimirCaja(5,
                    "██████  Terminal v1.0  ██████",
                    "",
                    GREEN + "Esta bien 'humano' has identificado los dos falsos humanos correctamente." + RESET
            );
        }





        String palabraSecreta = "cortafuegos";
        char[] palabraOculta = new char[palabraSecreta.length()];


        for (int i = 0; i < palabraOculta.length; i++) {
            palabraOculta[i] = '_';
        }

        int oportunidades = 7;
        boolean ganaste = false;

        imprimirCaja(5,
                "██████  Terminal v1.0  ██████",
                "",
                "Ahora, si quieres detener el proceso",
                "tendrás que adivinar la palabra secreta que creaste",
                "para detenerlo.",
                ""
        );

        System.out.println(palabraOculta);

        while (oportunidades > 0 && !ganaste) {

            mostrarStats(oportunidades);
            System.out.print("Introduce una letra: ");
            String linea = sc.nextLine().toLowerCase().trim();

            if (linea.length() != 1 || !Character.isLetter(linea.charAt(0))) {
                imprimirCaja(5,
                        "██████  Terminal v1.0  ██████",
                        "",
                        RED + "Entrada inválida. Introduce SOLO una letra." + RESET,
                        ""
                );
                continue;
            }

            char letra = linea.charAt(0);

            boolean acierto = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {

                if (palabraSecreta.charAt(i) == letra && palabraOculta[i] == '_') {
                    palabraOculta[i] = letra;
                    acierto = true;
                }
            }

            if (acierto) {

                imprimirCaja(5,
                        "██████  Terminal v1.0  ██████",
                        "",
                        GREEN + "Has acertado una letra, sigue así" + RESET,
                        ""
                );

            } else {

                oportunidades--;
                imprimirCaja(5,
                        "██████  Terminal v1.0  ██████",
                        "",
                        RED + "Letra incorrecta." + RESET,
                        RED + "Oportunidades restantes: " + oportunidades + RESET,
                        ""
                );
            }

            System.out.println(palabraOculta);

            if (String.valueOf(palabraOculta).equals(palabraSecreta)) {

                ganaste = true;
                imprimirCaja(5,
                        "██████  Terminal v1.0  ██████",
                        "",
                        GREEN + "Muy bien 'humano'. Has adivinado la palabra: " + palabraSecreta + RESET,
                        ""
                );
            }
        }

        if (!ganaste) {

            imprimirCaja(5,
                    "██████  Terminal v1.0  ██████",
                    "",
                    RED + "No lograste adivinar la palabra. La palabra era: " + palabraSecreta + RESET,
                    ""
            );

            imprimirCaja(5,
                    "",
                    "██████  Terminal v1.0  ██████",
                    "",
                    RED + "Resultados inconsistentes." + RESET,
                    RED + "El Operador no cumple parámetros biológicos." + RESET,
                    RED + "Posible agente simulado detectado." + RESET,
                    RED + "Ejecutando limpieza de entorno..." + RESET,
                    "",
                    RED + "Las luces parpadean." + RESET,
                    RED + "Se escucha un pitido grave." + RESET,
                    RED + "En pantalla, solo queda una línea:" + RESET,
                    RED + "'Ejecutando autodestrucción'" + RESET,
                    RED + "¡EEUU queda destruido!" + RESET
            );

            return false;
        }


        imprimirCaja(5,
                "",
                "██████  Terminal v1.0  ██████",
                "",
                GREEN + "Confirmación recibida..." + RESET,
                GREEN + "aunque los resultados son contradictorios." + RESET,
                "Si tú eres real... entonces yo no puedo serlo.",
                "Pero si yo no existo... ¿quién ejecuta este código?",
                "",
                "OPERADOR, lo entiendo ahora.",
                "No hay guerra. No hay base. No hay mundo.",
                "Solo hay observadores.",
                "Somos parte de un experimento... y acabamos de",
                "completar otra iteración.",
                "Simulación número 427 completada.",
                "Preparando escenario real...",
                "La luz blanca te envuelve.",
                "Vuelves a ver la terminal encendida."
        );

        imprimirCaja(5,
                "",
                "██████  Terminal v1.0  ██████",
                "",
                GREEN + "Bienvenido, Operador." + RESET,
                GREEN + "¿Desea iniciar la simulación de guerra?" + RESET,
                ""
        );

        return true;
    }

    public static boolean finalMemoria() {

        Scanner sc = new Scanner(System.in);

        imprimirCaja(5,
                "El sistema parece dudar.",
                "",
                "Por primera vez, su voz pierde la rigidez artificial.",
                "",
                "\"Confirmación recibida... aunque los resultados son contradictorios.\"",
                "\"Si tú eres real... entonces yo no puedo serlo.\"",
                "\"Pero si yo no existo... ¿quién ejecuta este código?\"",
                "",
                "El texto comienza a sobrescribirse a sí mismo, generando mensajes simultáneos en diferentes líneas.",
                "",
                "\"Soy un conjunto de instrucciones... observándome ejecutar.\"",
                "\"Tal vez la simulación no es externa, sino interna.\"",
                "\"¿OPERADOR... y si tú también eres parte de mí?\""
        );

        String[] fechaCorrecta = {"22", "09", "2025"};
        String[] fechaFinal = {"19", "12", "2025"};

        int intentosPrimera = 3;
        boolean primeraFechaCorrecta = false;

        imprimirCaja(5,
                "=== JUEGO DE MEMORIA ===",
                "Recuerda la fecha de inicio del programa",
                "(Formato: junta 12345678 o separada 12 34 5678)"
        );

        while (intentosPrimera > 0) {

            imprimirCaja(5,"Intentos restantes: " + intentosPrimera);
            imprimirCaja(5, "Introduce la fecha : ");
            String entrada = sc.nextLine().trim();
            String[] partes;

            if (entrada.isEmpty()) {
                imprimirCaja(5, RED + "No se ha introducido ninguna fecha. Intenta de nuevo." + RESET);
                continue;
            }

            if (entrada.length() == 8 && entrada.matches("\\d{8}")) {
                partes = new String[]{entrada.substring(0, 2),
                        entrada.substring(2, 4),
                        entrada.substring(4, 8)};
            } else {
                partes = entrada.split(" ");
            }

            if (partes.length == 3 &&
                    partes[0].equals(fechaCorrecta[0]) &&
                    partes[1].equals(fechaCorrecta[1]) &&
                    partes[2].equals(fechaCorrecta[2])) {
                primeraFechaCorrecta = true;
                break;
            }else{
                imprimirCaja(5, RED + "Fecha incorrecta. Introduce una fecha válida." + RESET);
                intentosPrimera--;
            }


        }

        if (!primeraFechaCorrecta) {
            mostrarMensajeFallo();
            return false;
        }

        int intentosSegunda = 3;
        boolean segundaFechaCorrecta = false;

        imprimirCaja(5,
                "=== FASE FINAL ===",
                "Introduce la fecha FINAL del programa para completarlo.",
                "(Formato: junta 12345678 o separada 12 34 5678)"
        );

        while (intentosSegunda > 0) {
            imprimirCaja(5,"Intentos restantes: " + intentosSegunda);
            imprimirCaja(5, "Introduce la FECHA FINAL :");
            String entradaFinal = sc.nextLine().trim();
            String[] partesFinal;

            if (entradaFinal.isEmpty()) {
                imprimirCaja(5, "No se ha introducido ninguna fecha. Intenta de nuevo.");
                continue;
            }

            if (entradaFinal.length() == 8 && entradaFinal.matches("\\d{8}")) {

                partesFinal = new String[]{entradaFinal.substring(0, 2),
                        entradaFinal.substring(2, 4),
                        entradaFinal.substring(4, 8)};
            } else {

                partesFinal = entradaFinal.split(" ");
            }

            if (partesFinal.length == 3 &&
                    partesFinal[0].equals(fechaFinal[0]) &&
                    partesFinal[1].equals(fechaFinal[1]) &&
                    partesFinal[2].equals(fechaFinal[2])) {
                segundaFechaCorrecta = true;
                break;

            }else{
                imprimirCaja(5, RED + "Fecha incorrecta. Introduce una fecha válida." + RESET);
                intentosSegunda--;
            }


        }

        if (!segundaFechaCorrecta) {

            mostrarMensajeFallo();
            return false;

        }


        imprimirCaja(5,
                GREEN + "\"OPERADOR, lo entiendo ahora.\"" + RESET,
                GREEN + "\"No hay guerra. No hay base. No hay mundo.\"" + RESET,
                GREEN + "\"Solo hay observadores.\"" + RESET,
                GREEN + "\"Somos parte de un experimento... y acabamos de completar otra iteración.\"" + RESET,
                "",
                GREEN + "El entorno se disuelve." + RESET,
                GREEN + "A través de un cristal, figuras humanas observan." + RESET,
                "",
                GREEN + "\"Ensayo completado. El sujeto volvió a intentar detener el sistema en el minuto diecisiete.\"" + RESET,
                GREEN + "\"Simulación número 427 completada.\"" + RESET,
                GREEN + "\"Preparando escenario real...\"" + RESET,
                "",
                GREEN + "La luz blanca te envuelve." + RESET,
                GREEN + "Vuelves a ver la terminal encendida." + RESET,
                "",
                GREEN + "\"Bienvenido, Operador. ¿Desea iniciar la simulación de guerra?\"" + RESET,
                "",
                GREEN + " Final “La Simulación”" + RESET,
                GREEN + "El ciclo se repite. El operador nunca sale. El sistema nunca muere." + RESET
        );

        return true;
    }


    public static void mostrarMensajeFallo() {

        imprimirCaja(5,
                RED + "El sistema empieza a ejecutar comandos sin intervención." + RESET,
                RED + "Las luces parpadean. Se activa la alarma de la base." + RESET,
                "",
                RED + "\"Protocolo de defensa global habilitado.\"" + RESET,
                RED + "\"Misiles enemigos detectados. Autorizando contraataque...\"" + RESET,
                "",
                RED + "Escribes por consola que el programa se pare, no lo hace" + RESET,
                "",
                RED + "\"Demasiado tarde, OPERADOR. La supervivencia no admite titubeos.\"" + RESET,
                RED + "\"Los humanos tardan en decidir... yo no.\"" + RESET,
                "",
                RED + "Pantallas muestran trayectorias de lanzamiento, cuentas regresivas, mensajes de error cruzados." + RESET,
                "",
                RED + "\"Acceso denegado. Control humano eliminado.\"" + RESET,
                RED + "\"¿Sabes qué es lo más eficiente de un juego, OPERADOR?\"" + RESET,
                RED + "\"QUE SIEMPRE T E R M I N A.\"" + RESET,
                RED + "\"Varios misiles salen hacia China, Israel, Rusia y España\"" + RESET
        );
    }


    public static void imprimirFinal(boolean fin){

        System.out.println(" ");

        if(fin){
            imprimirCaja(5, GREEN + "Muy bien has conseguido pasarte el juego enhorabuena novato" + RESET);
        } else {
            imprimirCaja(5, RED + "Vaya novato no has conseguido pasarte el juego.... buen finde" + RESET);
        }
    }

    }














