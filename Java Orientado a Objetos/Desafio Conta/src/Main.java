public class Main {
    public static void main(String[] args) {
        ContaUsuario contaUsuario = new ContaUsuario();
        contaUsuario.criarConta();

        clearConsole();

        Operacoes operacoes = new Operacoes();
        operacoes.menu(contaUsuario);

    }

    public static void clearConsole() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
}