import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int[] numeros = {32, 55, 18, 41, 11};

        for(int i = 0; i < numeros.length; i++)
        {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }


        input.close();
    }
}