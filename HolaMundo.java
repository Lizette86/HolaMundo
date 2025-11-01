import java.util.Scanner;
public class HolaMundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¡Hola Mundo!");
        System.out.print("¿Cómo te llamas? ");
        String nombre = sc.nextLine();
        
        System.out.println("Encantado de conocerte, " + nombre + "!");
        System.out.println("Espero que tengas un gran día programando en Java :)");
        
        sc.close();
    }
}

