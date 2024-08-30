package br.com.fiap.cap8.view;

import br.com.fiap.cap8.model.Dados;
import br.com.fiap.cap8.model.Avaliacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  dados bancários
        System.out.println("=== Cadastro de Dados Bancários ===");
        System.out.print("Nome do Titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Número da Conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Saldo Inicial: ");
        double saldoInicial = scanner.nextDouble();

        Dados conta = new Dados(nomeTitular, numeroConta, agencia, saldoInicial);
        conta.exibirInformacoes();

        //  informações para adicionar saldo
        System.out.print("Valor para Adicionar ao Saldo: ");
        double valorAdicionar = scanner.nextDouble();
        conta.adicionarSaldo(valorAdicionar);

        //  informações para realizar saque
        System.out.print("Valor para Saque: ");
        double valorSaque = scanner.nextDouble();
        conta.realizarSaque(valorSaque);

        scanner.nextLine();

        //  avaliação do aplicativo
        System.out.println("\n=== Avaliação do Aplicativo ===");
        System.out.print("Nome do Usuário: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Nota (1 a 5): ");
        int nota = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Comentário: ");
        String comentario = scanner.nextLine();

        System.out.print("Data da Avaliação: ");
        String dataAvaliacao = scanner.nextLine();

        Avaliacao avaliacao = new Avaliacao(nomeUsuario, nota, comentario, dataAvaliacao);
        avaliacao.registrarAvaliacao();
        avaliacao.exibirAvaliacao();

        scanner.close();
    }
}
