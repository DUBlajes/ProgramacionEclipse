package com.aguerrero.elige.tu.propia.aventura;

import java.util.Scanner;

public class EligeTuPropiaAventura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta = "";
        byte personasQueHanJugado = 0;
        byte hombresQueHanJugado = 0;
        byte mujeresQueHanJugado = 0;
        byte neutrosQueHanJugado = 0;
        byte vecesMuerto=0;
        String volverAJugar = "";
        do {
            personasQueHanJugado++;
            System.out.println("Escribe H si eres hombre, M si eres mujer o N si eres de género neutro");
            respuesta = sc.nextLine();
            // }
            char genero = 'x';
            switch (respuesta) {
                case "h":
                case "H":
                case "hombre":
                case "Hombre":
                    genero = 'h';
                    hombresQueHanJugado++;
                    break;
                case "m":
                case "M":
                case "Mujer":
                case "mujer":
                    genero = 'm';
                    mujeresQueHanJugado++;
                    break;
                case "n":
                case "N":
                case "neutro":
                case "Neutro":
                    genero = 'n';
                    neutrosQueHanJugado++;
                    break;
                default:
                    genero = '@';
                    break;
            }
            System.out.print("Dime el número de alumnos de tu aula.\n");
            byte nAlumnos = Byte.parseByte(sc.nextLine());
            System.out.println("Cenec, 24 de octubre, " + nAlumnos
                    + " estudiantes están en el aula 2 aguantando el sopor de la clase de programación. De repente, cae un ornitorrinco con metralletas del tragaluz. ¿Qué haces?"
                    + "\n\t1 - Le tiras tu monitor a la cabeza."
                    + "\n\t2 - Le dices \"Juan Carlos, ¿dónde te has metido?\""
                    + "\n\t3 - Te escondes.");

            byte opcion = Byte.parseByte(sc.nextLine());
            if (opcion == 1) {
                System.out.println("Le da una patada ninja mortal y te lo devuelve. ¿Qué haces?."
                        + "\n\t1 - Se lo tiras otra vez"
                        + "\n\t2 - Te quitas la camiseta, te tiras al suelo a cuatro patas e intentas seducir al ornitorrinco.");
                byte eleccion = Byte.parseByte(sc.nextLine());
                switch (eleccion) {
                    case 1:
                        vecesMuerto++;
                        System.out.println(
                                "Coges el monitor y lo lanzas de nuevo. El ornitorrinco lo esquiva, va hacia ti y te mete tres tiros en la tráquea. Enhorabuena. Has muerto.");
                        break;
                    case 2:
                        System.out.println(
                                "Decides usar tus dotes de seducción para evitar que el ornitorrinco te ataque. Cuadras tus hombros, pones tu voz más seductora y, como si te hubiese poseído Henry Cavill haciendo de Geralt de Rivia, seduces al ornitorrinco. Éste, sin poder evitarlo, se lanza hacia ti para hacerte su baile del apareamiento. Se avecina una noche de lujuria, vicio y fornicio. Enhorabuena. Has sobrevivido.");
                        break;
                }
            } else if (opcion == 2) {
                vecesMuerto++;
                System.out.print("Te pega un tiro y te dice: \"Me llamo Jose Carlos, so payas"
                        + (genero == 'h' ? "o" : genero == 'm' ? "a" : genero == 'n' ? "e" : "@")
                        + "\". Enhorabuena. Has muerto. ");

            } else if (opcion == 3) {
                System.out.println("Se lía a tiros. A ti no te mata, porque te has escondido, pero se carga a "
                        + ((nAlumnos * 60) / 100) + " compañeros. ¿Qué haces?"
                        + "\n\t1 - Rezas a Cthulhu el sagrado para que el ornitorrinco se marche."
                        + "\n\t2 - Te armas de valor, sales como un espartano y decides liarte a puños con el ornitorrinco.");

                byte decision = Byte.parseByte(sc.nextLine());
                if (decision == 1) {
                    System.out.println("Optas por el camino de la fe. Juntas tus manos y rezas."
                            + "\n\t\"Ph´nglui mglw´nafh Cthulhu R´lyeh wgah´nagl fhtagn...\""
                            + "\n\t\"Ph´nglui mglw´nafh Cthulhu R´lyeh wgah´nagl fhtagn...\""
                            + "\n\t\"Ph´nglui mglw´nafh Cthulhu R´lyeh wgah´nagl fhtagn...\""
                            + "\n\t De repente, se abre un enorme agujero en el suelo y de él emerge el Primigenio Cthulhu. Con una simple rugido, el ornitorrinco se desintegra. El olor a mar inunda tu nariz. Moviendo los tentáculos y emitiendo un gruñido gutural, se dispone a marcharse, pero tú aprovechas para pedirle, ya de paso, que te abra un tarro de pepinillos en escabeche, que llevas meses sin poder abrir esa puñetera tapa. Cthulhu se da la vuelta, abre el tarro y se marcha. Tú te despides de él con lágrimas en los ojos, no solo por haber matado al ornitorrinco, sino por evitar que esta noche te quedases sin cenar. Enhorabuena. Has sobrevivido.");
                } else {
                    vecesMuerto++;
                    System.out.println(
                            "Decides intentar acabar con el ornitorrinco con tus propias manos. Parece que has olvidado que tiene dos metralletas. En cuanto das dos pasos, el ornitorrinco te acribilla. Enhorabuena. Has muerto.");
                }

            } else {
                vecesMuerto++;
                System.out.println(
                        "Tenías que poner un número entre 1 y 3. El ornitorrinco te mata. Enhorabuena. Has muerto. Por tonto.");
            }
            System.out.println("¿Deseas volver a jugar?");
            volverAJugar=sc.nextLine();
        } while (volverAJugar.equalsIgnoreCase("si"));
        
        System.out.println("En esta partida han jugado " + personasQueHanJugado + " personas. De ellas, "
                + hombresQueHanJugado + " han sido hombres, " + mujeresQueHanJugado + " han sido mujeres y "
                + neutrosQueHanJugado + " han sido de género neutro. Además, en esta partida, el ornitorrinco ha acabado con tu vida un total de "+vecesMuerto+" veces.");
    }
}
