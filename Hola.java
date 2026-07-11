import java.util.Scanner;

public class Hola {
    public static void main(String[] args) {
        System.out.println("Hola, Vale :)");
        Scanner scanner = new Scanner(System.in);
        String nombreCompleto = scanner.nextLine();
        System.out.println("Ingresa tu nombre completo: ");
        String apodo = scanner.nextLine();
        System.out.println("Ingresa tu apodo: ");
        String lugarDeNacimiento = scanner.nextLine();
        System.out.println("Ingresa tu lugar de nacimiento: ");
        int edad = scanner.nextInt();
        System.out.println("Ingresa tu edad: ");
        String sexo = scanner.nextLine();
        System.out.println("Ingresa tu sexo: ");
        if (sexo.equalsIgnoreCase("masculino")) {
            System.out.println("Sexo masculino");
        } else if (sexo.equalsIgnoreCase("femenino")) {
            System.out.println("Sexo femenino");
        } else {
            System.out.println("Sexo no especificado");
        }
        int estatura = scanner.nextInt();
        if (estatura >= 1.80) {
            System.out.println("Contextura alta");
        } else if (estatura >= 1.55) {
            System.out.println("Contextura baja");
        } else {
            System.out.println("Contextura media");
        System.out.println("Elija un hobby:");
        System.out.println("A ) Gym");
        System.out.println("B ) Soccer");
        System.out.println("C ) Pilates");
        System.out.println("D ) Swimming");
        System.out.println("E ) Running");
        System.out.println("F ) Yoga");
        


        }
    }
}
