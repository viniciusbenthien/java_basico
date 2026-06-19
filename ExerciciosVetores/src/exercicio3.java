import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int[] numeros = new int[5];

       for (int i = 0; i < numeros.length; i++){
           numeros[i] = i * i;
       }

       for (int i = 0; i < numeros.length; i++){
           System.out.print(numeros[i] + " ");
       }


        input.close();
    }
}
