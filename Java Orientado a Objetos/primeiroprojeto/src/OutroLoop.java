import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double mediaAvaliacao = 0, nota = 0;
        int totalDeNotas = 0;

        while(nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar ");
            nota = s.nextDouble();
            if(nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }
        mediaAvaliacao /= totalDeNotas;
        System.out.println("Média de avaliações: "+mediaAvaliacao);
    }
}
