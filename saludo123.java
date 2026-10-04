import java.util.Scanner;
  
  public class saludo123 {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); 

System.out.println ("Hola");

System.out.println ("Como te llamas?");
String nombre= sc.nextLine(); 

System.out.println ("Como estas?"); 
String estado= sc.nextLine();

System.out.println ("Cual es tu edad?");
int edad = sc.nextInt();

if (edad >=18) {
    System.out.println ("Mayor de edad");
    }
    else if (edad < 18) {
            System.out.println("Menor de edad");
        }


System.out.println ("Cual es tu altura?"); 
double altura= sc.nextDouble();

if (altura > 1.50){
    System.out.println ("Enanito");
    }
    else if (altura < 1.50){
        System.out.println ("Muy alto");
    }

   }
}