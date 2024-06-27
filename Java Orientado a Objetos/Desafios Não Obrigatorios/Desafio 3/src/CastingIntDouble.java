//DESAFIO: Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
import java.util.Random;

public class CastingIntDouble {
    public static void main(String[] args) {
        Random r = new Random();
        double numRandomDouble = r.nextDouble()*10;
        System.out.println("Este é o numero aleatorio antes de se tornar um inteiro: "+numRandomDouble+"\nEste é ele após o casting para inteiro: "+(int)numRandomDouble);
    }
}
