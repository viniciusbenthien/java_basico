import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] cidades = {"São Paulo", "Rio de Janeiro", "Curitiba", "Porto Alegre"};

        for (String cidade : cidades){
            System.out.println(cidade.toUpperCase());
        }



        input.close();
    }
}
