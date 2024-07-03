import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaUsuario {
    Scanner s = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    private String nome, tipoConta;
    private double saldoInicial = 0, saldo = 0;
    private boolean saldoInicialDefinido = false;

    public void criarConta() {
        int auxS;

        System.out.print("Criação da sua conta\nDigite seu nome: ");
        nome = s.nextLine();
        do {
            System.out.print("Escolha o tipo de conta:\n1 - Corrente\n2 - Poupança\nDigite o número da opção desejada aqui: ");
            auxS = s.nextInt();
            switch(auxS){
                case 1:
                    tipoConta = "Corrente";
                    break;
                case 2:
                    tipoConta = "Poupança";
                    break;
                default:
                    System.out.println("Opção invalida Digite o número da opção desejada");
                    break;
            }
        }while (auxS != 1 && auxS != 2);

        do {
            System.out.print("Deseja fazer um primeiro deposito?\n1 - Sim\n2 - Não\nResponda aqui: ");
            auxS = s.nextInt();
            switch(auxS){
                case 1:
                    setReceber();
                    break;
                case 2:
                    System.out.println("O primeiro deposito não será realizado");
                    saldoInicialDefinido = true;
                    break;
                default:
                    System.out.println("Opção invalida Digite o número da opção desejada");
                    break;
            }
        }while (auxS != 1 && auxS != 2);
    }

    public String getNome() {
        return nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setReceber(){

        System.out.print("Digite o valor que será transferido para sua conta: R$ ");
        double valor = s.nextDouble();
        if (valor > 0) {
            saldo += valor;
            if (!saldoInicialDefinido) {
                saldoInicial = valor; // Define o saldo inicial apenas uma vez
                saldoInicialDefinido = true; // Marca que o saldo inicial foi definido
            }
            System.out.println("O valor depositado foi R$ " + df.format(valor) + " essa ação foi realizada com sucesso");
        }else{
            System.out.println("Valor inválido. O depósito deve ser maior que zero.");
            setReceber();
        }
    }

    public void setTransferencia(){

        if (saldo != 0) {
            System.out.print("Digite o valor que você deseja transferir: R$ ");
            double valor = s.nextDouble();
            if (valor > 0 && saldo >= valor) {
                saldo -= valor;
                System.out.println("O valor transferido foi R$ " + df.format(valor) + " essa ação foi realizada com sucesso");
            } else if (saldo < valor) {
                System.out.println("Você não tem saldo o suficiente para realizar esta transferência.\nO seu saldo atual é R$ " + df.format(saldo) + " e você inseriu o valor de R$ " + df.format(valor));
                setTransferencia();
            } else {
                System.out.println("Valor inválido. O valor da transferência deve ser maior que zero.");
                setTransferencia();
            }
        }else {
            System.out.println("Você não tem dinheiro o suficiente para utilizar essa ação.\nSaldo Atual: R$ " + df.format(saldo));
            String resp;
            do {
                System.out.println("Digite [S] para confirmar a leitura.");
                resp = s.nextLine();
            } while (!resp.equalsIgnoreCase("S"));
        }
    }
}
