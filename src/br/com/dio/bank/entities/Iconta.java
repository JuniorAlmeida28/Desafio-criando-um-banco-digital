package br.com.dio.bank.entities;

public interface Iconta {

    void depositar(double saldo);

    void sacar(double saldo);

    void transferir(double saldo, Conta contaDestino);

    void extrato();
}
