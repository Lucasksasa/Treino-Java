import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = "Lucas";


        System.out.println("Digite sua idade, " + nome + ": ");
        int idade = scanner.nextInt();

        if (idade > 25)
            System.out.println("Essa idade não é a verdadeira, tu sabe");

        else if (idade < 25) {
            System.out.println("Essa idade não é verdadeira, chará");

        }


        while (idade != 25){
            System.out.println("tente novamente, digite sua idade: ");
            idade = scanner.nextInt();
        }

        System.out.println("AAAhhh, agora sim");

    }
}