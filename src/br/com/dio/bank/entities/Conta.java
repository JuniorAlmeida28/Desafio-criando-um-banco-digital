package br.com.dio.bank.entities;

public abstract class Conta implements Iconta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    @Override
    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    @Override
    public void sacar(double saldo) {
        this.saldo -= saldo;
    }

    @Override
    public void transferir(double saldo, Conta contaDestino) {
        sacar(saldo);
        contaDestino.depositar(saldo);
    }

    @Override
    public void extrato() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta: " + this.conta);
        System.out.println("Saldo: "+ String.format("%.2f", this.saldo));

    }
}
