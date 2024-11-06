import java.util.*;
   public class eco {
      
    static void eco (String paramCadena, int paraNum){
           
       for ( int i = 1; i<=paraNum; i++){
        System.out.println(paramCadena);
       }

        }
    public static void main (String[]args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce una cadena");
        String cadena =entrada.nextLine();

        System.out.println("introduce un número");
        int num = entrada.nextInt();

        eco(cadena, num);
        System.out.println("número de veces tras la llamada es:" + " " + num);
      }
    }
