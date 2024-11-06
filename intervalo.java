import java.util.*;
   public class intervalo {

    static void imprimeNumeros(int paramN1, int paramN2){
        int menor = paramN1 < paramN2 ? paramN1: paramN2;
        int mayor = paramN1 > paramN2 ? paramN1: paramN2; 
        for (int i = menor; i   <= mayor; i++){
            System.out.println(i);
        }
    }
    public static void main (String[]args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un numero:");
        int num1 = entrada.nextInt();

        System.out.println("introduce otro número");
        int num2 = entrada.nextInt();

        imprimeNumeros(num1, num2);
    }
   }