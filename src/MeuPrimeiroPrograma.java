import java.util.Scanner;

public class MeuPrimeiroPrograma {

    public static void main(String[] args){

        sum();
        logar();


    }

    static void sum() {


        System.out.println(50 + 40);
    }

    static void logar(){

        String nome;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu usuário: ");
        nome = scanner.nextLine();

        System.out.println("Olá: " + nome);
    }
}
