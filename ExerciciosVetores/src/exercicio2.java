import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] v = {19, 15, 75, 9, 18, 58, 70};

        System.out.println("Primeiro: " + v[0]);
        System.out.println("Ùltimo: " + v[v.length - 1]);
        System.out.println("Central: " + v[v.length / 2]);



        input.close();
    }
}
