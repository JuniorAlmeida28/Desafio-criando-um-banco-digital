package br.com.dio.bank.entities;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println();
        System.out.println("=== Extrato Conta Poupança ===");
        super.extrato();
    }
}
