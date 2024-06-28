import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double mediaAvaliacao = 0, nota;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme  ");
            nota = s.nextDouble();
            mediaAvaliacao += nota;
        }
        mediaAvaliacao /= 3;
        System.out.println("Média de avaliações: "+mediaAvaliacao);

    }
}
