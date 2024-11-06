import java.util.*;

public class saludo{
    static boolean saludo(String paramNombre){
        
    }

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        boolean salir = false;


        while (!salir){
            System.out.println("¡como te llamas?:");
            String nombre = entrada.nextLine();

            salir = saludo(nombre);
        }
    }
}