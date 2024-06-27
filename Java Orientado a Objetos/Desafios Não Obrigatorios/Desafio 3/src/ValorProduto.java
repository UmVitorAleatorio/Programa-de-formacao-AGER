//Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
import java.text.DecimalFormat;
import java.util.Random;

public class ValorProduto {
    public static void main(String[] args) {
        Random r = new Random();
        DecimalFormat df = new DecimalFormat("0.00");
        double precoProduto = r.nextDouble()*10;
        int quantidadeProduto = r.nextInt(10)+1;
        double precoFinal = precoProduto*quantidadeProduto;
        System.out.println(df.format(precoProduto)+" * "+ quantidadeProduto +" = "+df.format(precoFinal));
    }
}