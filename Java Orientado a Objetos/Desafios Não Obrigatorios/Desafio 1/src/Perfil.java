import java.text.MessageFormat;
import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Olá usuário qual o seu nome?");
        String nome = s.nextLine();
        String ola = MessageFormat.format("Olá {0}!!!", nome);
        System.out.println(ola);
        System.out.println("Tudo bem?");
    }
}

