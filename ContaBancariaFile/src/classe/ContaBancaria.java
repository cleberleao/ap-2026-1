package classe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private Long conta;

    public ContaBancaria() {
    }
    public double depositar(double valor){
        saldo = saldo + valor;
        return saldo;
    }
    public double sacar(double valor){
        saldo = saldo - valor;
        return saldo;
    }

    public ContaBancaria abrirConta(ContaBancaria conta){
        try {
            File minhaConta = new File(conta.getConta().toString() + ".txt");
            if (minhaConta.createNewFile()) {
                System.out.println("Conta criada: " + minhaConta.getName());
                FileWriter myWriter = new FileWriter(minhaConta.getName());
                myWriter.write(conta.getTitular()+ "\n");
                myWriter.write(String.valueOf(conta.getConta()));
                myWriter.write("\n");
                myWriter.write(String.valueOf(conta.getSaldo()));
                myWriter.close();
            } else {
                System.out.println("Conta ja existe.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); // Print error details
        }
        return conta;
    }

    public void atualizaSaldo(ContaBancaria conta){
        try {
            FileWriter myWriter = new FileWriter(conta.getConta().toString() + ".txt");
            myWriter.write(conta.getTitular() + "\n");
            myWriter.write(String.valueOf(conta.getConta()));
            myWriter.write("\n");
            myWriter.write(String.valueOf(conta.getSaldo()));
            myWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ContaBancaria lerConta(ContaBancaria exiteConta){
        File myObj = new File(String.valueOf(exiteConta.conta)+".txt");
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                exiteConta.setTitular(myReader.nextLine());
                exiteConta.setConta(Long.valueOf(myReader.nextLine()));
                exiteConta.setSaldo(Double.valueOf(myReader.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return exiteConta;
    }

    public void mostrarSaldo(){
        System.out.printf("Seu saldo é: " + saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Long getConta() {
        return conta;
    }

    public void setConta(Long conta) {
        this.conta = conta;
    }
}
