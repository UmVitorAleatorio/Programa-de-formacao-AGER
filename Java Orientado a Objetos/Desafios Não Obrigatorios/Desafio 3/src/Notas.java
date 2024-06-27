//DESAFIO: Crie um programa que realize a média de duas notas decimais e exiba o resultado.
import java.text.DecimalFormat;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner s = new Scanner(System.in);
        double nota1, nota2, result;

        System.out.print("Digite uma nota: ");
        nota1 = s.nextDouble();
        System.out.print("Digite uma nota: ");
        nota2 = s.nextDouble();
        result = (nota1 + nota2) / 2;
        System.out.println("A media das duas notas é: "+df.format(result));
    }
}