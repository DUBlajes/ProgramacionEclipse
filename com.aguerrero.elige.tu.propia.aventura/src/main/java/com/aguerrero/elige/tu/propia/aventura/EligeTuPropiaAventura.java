package com.aguerrero.elige.tu.propia.aventura;

import java.util.Scanner;

public class EligeTuPropiaAventura {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String respuesta = "";
        /*
         * while(!respuesta.equals("h")&&(!respuesta.equals("m"))&&(!respuesta.equals(
         * "n"))) {}
         */
        System.out.println("Escribe H si eres hombre, M si eres mujer o N si eres de género neutro");
        respuesta = scan.nextLine();
        // }
        char genero = 'x';
        switch (respuesta) {
            case "h":
                genero = 'h';
                break;
            case "m":
                genero = 'm';
                break;
            case "n":
                genero = 'n';
                break;
            default:
                genero = '@';
                break;
        }

        /*
         * char genero;
         * genero =scan.nextLine().charAt(0);
         * if (genero=='h'||genero=='H'){
         * genero='o';
         * }else if (genero=='m'||genero=='M'){
         * genero='a';
         * }else if(genero=='n'||genero=='N'){
         * genero='e';
         * }
         * /* boolean esHombre=true; /Cambiar por un char género;
         * Misión para jueves: Pedir el género y esperar que os pongan H - hombre, M -
         * Mujer o N - Neutro
         * En la opción 2, si ha elegido hombre, que le diga "payaso", mujer "payasa" o
         * neutro "payase"
         * if(scan.nextLine().equalsIgnoreCase("m")){
         * esHombre=false;
         */
        System.out.print("Dime el número de alumnos de tu aula.\n");
        byte nAlumnos = Byte.parseByte(scan.nextLine());
        System.out.println("Cenec, 24 de octubre, " + nAlumnos
                + " estudiantes están en el aula 2 aguantando el sopor de la clase de programación. De repente, cae un ornitorrinco con metralletas del tragaluz. ¿Qué haces?"
                + "\n\t1 - Le tiras tu monitor a la cabeza."
                + "\n\t2 - Le dices \"Juan Carlos, ¿dónde te has metido?\""
                + "\n\t3 - Te escondes.");

        byte opcion = Byte.parseByte(scan.nextLine());
        if (opcion == 1) {
            System.out.println("Le da una patada ninja mortal y te lo devuelve. ¿Qué haces?."
                    + "\n\t1 - Se lo tiras otra vez"
                    + "\n\t2 - Te quitas la camiseta, te tiras al suelo a cuatro patas e intentas seducir al ornitorrinco.");
            byte eleccion = Byte.parseByte(scan.nextLine());
            switch (eleccion) {
                case 1:
                    System.out.println(
                            "Coges el monitor y lo lanzas de nuevo. El ornitorrinco lo esquiva, va hacia ti y te mete tres tiros en la tráquea. Enhorabuena. Has muerto.");
                    break;
                case 2:
                    System.out.println(
                            "Decides usar tus dotes de seducción para evitar que el ornitorrinco te ataque. Sin embargo, más pronto que tarde, te das cuenta de que el ornitorrinco está castrado y tus intentos son inútiles. El ornitorrinco te acribilla a balazos. Enhorabuena. Has muerto.");
                    break;
            }
        } else if (opcion == 2) {
            /*
             * System.out.
             * print("Te pega un tiro y te dice: \"Me llamo Jose Carlos, so payas");
             * if(esHombre==true){
             * System.out.print("o.");
             * } else{
             * System.out.print("a.");
             * }
             * System.out.println("\" Enhorabuena. Has muerto.");
             */
            System.out.print("Te pega un tiro y te dice: \"Me llamo Jose Carlos, so payas"
                    + (genero == 'h' ? "o" : genero == 'm' ? "a" : genero == 'n' ? "e" : "@")
                    + "\". Enhorabuena. Has muerto");

        } else if (opcion == 3) {
            System.out.println("Se lía a tiros. A ti no te mata, porque te has escondido, pero se carga a "
                    + ((nAlumnos * 60) / 100) + " compañeros. ¿Qué haces?"
                    + "\n\t1 - Rezas a Cthulhu el sagrado para que el ornitorrinco se marche."
                    + "\n\t2 - Te armas de valor, sales a pecho descubierto y decides liarte a puños con el ornitorrinco.");

            byte decision = Byte.parseByte(scan.nextLine());
            if (decision == 1) {
                System.out.println("Optas por el camino de la fe. Juntas tus manos y rezas."
                        + "\n\t\"Ph´nglui mglw´nafh Cthulhu R´lyeh wgah´nagl fhtagn...\""
                        + "\n\t\"Ph´nglui mglw´nafh Cthulhu R´lyeh wgah´nagl fhtagn...\""
                        + "\n\t\"Ph´nglui mglw´nafh Cthulhu R´lyeh wgah´nagl fhtagn...\""
                        + "\n\t De repente, se abre un enorme agujero en el suelo y de él emerge el Primigenio Cthulhu. Con una simple rugido, el ornitorrinco se desintegra. Después mira hacia donde te encuentras. Te coge con su gigantesca garra. El olor a mar inunda tu nariz. Moviendo los tentáculos y emitiendo un gruñido gutural, aprieta su garra y acaba con tu vida, esparciendo tus vísceras. Enhorabuena. Has muerto.");
            } else {
                System.out.println(
                        "Decides intentar acabar con el ornitorrinco con tus propias manos. Parece que has olvidado que tiene dos metralletas. En cuanto das dos pasos, el ornitorrinco te acribilla. Enhorabuena. Has muerto.");
            }

        } else {
            System.out.println(
                    "Tenías que poner un número entre 1 y 3. El ornitorrinco te mata. Enhorabuena. Has muerto. Por tonto.");
        }
    }
}
