import java.util.Scanner;

public class Main2 {

    public static void main(String[] args){

        String nome;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: " );
        nome = scanner.nextLine();

        while(!nome.equals("lucas")){
            System.out.println("Esse não é seu nome parceiro, tente novamente: ");
            nome = scanner.nextLine();
        }

        System.out.println("Hmmm, agora sim. Bem vindo " +nome+ " :)");
    }
}
