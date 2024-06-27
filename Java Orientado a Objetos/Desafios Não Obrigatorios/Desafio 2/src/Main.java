import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius");
        double tCelcius = s.nextDouble(), tFahrenheit;
        tFahrenheit = tCelcius * 1.8 + 32;
        System.out.println("A temperatura em Fahrenheit: " + (int)tFahrenheit);
    }
}
