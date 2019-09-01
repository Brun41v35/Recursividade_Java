package recursividade;

import java.util.Scanner;

public class Recursividade {

    public static void main(String[] args) {

        //Declaração do Scanner
        Scanner teclado = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Digite um numero: ");
        regresssivo(teclado.nextInt());
 
    }

    public static int regresssivo(int numero) {
        
         if (numero == 0) {
             return 0;
         } else {
             System.out.println(numero);
             return regresssivo(numero - 1);
         }
    }
}
