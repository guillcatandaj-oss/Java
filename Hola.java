import java.util.Scanner;
import java.util.Random;

public class Hola {

    public static int generarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(200) + 1; }
         // Genera un número aleatorio entre 1 y 200 

    public static void main(String[] args) {
        
        System.out.println("Hola, Vale :)");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre completo: ");
        scanner.nextLine(); 
        System.out.println("Ingresa tu apodo: ");
        scanner.nextLine(); 
        System.out.println("Ingresa tu lugar de nacimiento: ");
        scanner.nextLine();
        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingresa tu sexo: ");
        String sexo = scanner.nextLine();

        if (sexo.equalsIgnoreCase("masculino")) {
            System.out.println("Sexo masculino");
        } else if (sexo.equalsIgnoreCase("femenino")) {
            System.out.println("Sexo femenino");
        } else {
            System.out.println("Sexo no especificado");
        }

        System.out.println("Ingresa tu estatura (ej: 1.75): ");
        double estatura = scanner.nextDouble();
        scanner.nextLine();

        if (estatura >= 1.80) {
            System.out.println("Contextura alta");
        } else if (estatura <= 1.55) {
            System.out.println("Contextura baja");
        } else {
            System.out.println("Contextura media");
        }

        System.out.println("Elija un hobby:");
        System.out.println("A) Gym");
        System.out.println("B) Soccer");
        System.out.println("C) Pilates");
        System.out.println("D) Swimming");

        String hobby = scanner.nextLine();
        switch (hobby.toUpperCase()) {
            case "A":
                System.out.println("Gym");
                break;
            case "B":
                System.out.println("Soccer");
                break;
            case "C":
                System.out.println("Pilates");
                break;
            case "D":
                System.out.println("Swimming");
                break;
            default:
                System.out.println("Hobby no válido");
        }
            System.out.println("Valor de renta: ");         
            double renta = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Sueldo: ");
            double sueldo = scanner.nextDouble();
            scanner.nextLine();

            double diferencia = sueldo - renta;
            System.out.println("Valor de diferencia: " + diferencia);

            System.out.println("Ingresa un numero del 1 al 200: ");
            int numeroIngresado = scanner.nextInt();
            int numeroAleatorio = generarNumeroAleatorio();
            System.out.println("Número aleatorio generado: " + numeroAleatorio);

            if (numeroIngresado == numeroAleatorio) {
                System.out.println("¡Felicidades! Has acertado :D");
                } else if (numeroIngresado < numeroAleatorio) {
                    System.out.println("Muy cerca :c");
                } else if (numeroIngresado > numeroAleatorio) {
                    System.out.println("Muy lejos :c");
                } else {
                    System.out.println("Número no válido");
                }
{
        scanner.close();
    }

}

}

              
