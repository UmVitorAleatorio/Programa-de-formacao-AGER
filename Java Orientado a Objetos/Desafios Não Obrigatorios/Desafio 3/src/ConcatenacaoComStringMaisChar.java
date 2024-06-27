//Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.

import java.util.Scanner;

public class ConcatenacaoComStringMaisChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Java é a melhor linguagem? [S/N]");
        char letra = s.next().charAt(0);
        String frase = "Você escolheu a opção " + letra;
        if(letra == 'n'|| letra == 'N') {
            System.out.println(frase + " fechando o programa");
        }else if(letra == 's' || letra == 'S'){
            System.out.println(frase+" Muito bem pequeno gafanhoto!");
        }else{
            System.out.println("Pilantrinha burlador de código `-´ ");
        }
    }
}
