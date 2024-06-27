import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano De Lancamento: "+anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //Média calculada pelas 3 notas da jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println(df.format(media));
        String sinopse;
        sinopse = """
        Filme Top Gun
        Filme de ação com galã dos anos 80
        Muito bom!
        Ano de Lançamento
        """+anoDeLancamento;
        System.out.println(sinopse);
        int classificacao = (int) media/2;
        System.out.println(classificacao);
    }
}