package br.com.fiap.cap8.model;

public class Dados extends Pessoa {
    private String numeroConta;
    private String agencia;
    private double saldo;

    public Dados() {}

    public Dados(String nomeTitular, String numeroConta, String agencia, double saldo) {
        super(nomeTitular);
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void adicionarSaldo(double valor) {
        saldo += valor;
        System.out.println("Saldo atualizado: " + saldo);
    }

    public void realizarSaque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado. Saldo restante: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Titular: " + getNome());
        System.out.println("Conta: " + numeroConta + ", Agência: " + agencia);
        System.out.println("Saldo: " + saldo);
    }
}
