//Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
import java.text.DecimalFormat;
import java.util.Random;

public class DolarToReal {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Random r = new Random();
        double dolar, real = 4.94;
        dolar = r.nextDouble()*50;
        real *= dolar;
        System.out.println("A conversão de U$"+df.format(dolar)+" Para real fica: R$"+df.format(real));
    }
}
