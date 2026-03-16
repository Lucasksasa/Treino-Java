import java.util.Scanner;

public class EmpresasCuriosas {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá empresa curiosa, tudo bem?: " );
        String resposta = scanner.nextLine();

        while(!resposta.equals("sim") && !resposta.equals("nao") && !resposta.equals("não")){
            System.out.println("você precisa escrever \"sim\" ou \"não\" pra eu entender rsrs...");
            resposta = scanner.nextLine();
        }

        if(resposta.equals("sim")){
            System.out.println("Que ótimo ouvir isso :) " +
                    " Espero que meu trabalho chame sua atenção" +
                    " de alguma forma ");
        }

        else if(resposta.equals("não")){
            System.out.println("Poxa... que pena :( Desejo que seu" +
                    " dia seja iluminado");

        }

        else if(resposta.equals("nao")){
            System.out.println("Poxa... que pena :( Desejo que seu" +
                    " dia seja iluminado");

        }

    }
}
