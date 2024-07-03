import java.util.Scanner;

public class Operacoes {
    public void menu(ContaUsuario conta) {
        Scanner s = new Scanner(System.in);
        String resp;
        int auxS;

        do {
            System.out.print("**************************\n" + "Dados iniciais do cliente:\n" + "\n" + "Nome: " + conta.getNome() + "\n" + "Tipo conta: " + conta.getTipoConta() + "\n" + "Saldo inicial: R$ " + conta.df.format(conta.getSaldoInicial()) + "\n" + "**************************\n" + "\n" + "Operações\n" + "\n" + "1- Consultar saldos\n" + "2- Receber valor\n" + "3- Transferir valor\n" + "4- Sair\n" + "\n" + "Digite a opção desejada: ");
            auxS = s.nextInt();
            switch (auxS) {
                case 1:
                    System.out.println("O saldo atual é: R$ " + conta.df.format(conta.getSaldo()));
                    break;
                case 2:
                   conta.setReceber();
                    break;
                case 3:
                    conta.setTransferencia();
                    break;
                case 4:
                    System.out.println("Deseja realmente encerrar o sistema? (S/N)");
                    s.nextLine();
                    resp = s.nextLine();
                    if (resp.equalsIgnoreCase("S")) {
                        System.out.println("Encerrando o sistema...");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Opção invalida. Por favor insira um valor entre 1 e 4.");
                    auxS = 1;
                    break;
            }
        } while (auxS == 1 || auxS == 2 || auxS == 3 || auxS == 4);
    }
}