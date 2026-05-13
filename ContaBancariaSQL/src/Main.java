import classe.ContaBancaria;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        boolean repete = true;
        String acao;
        Scanner lerDados = new Scanner(System.in);

        System.out.println("Programa conta bancária");
        ContaBancaria contaBancaria = new ContaBancaria();
        System.out.printf("Ja possui uma conta? S ou N : ");
        acao = lerDados.next();
        if (acao.toUpperCase().equals("N")){
            System.out.printf("Digite o Nome do Titular : ");
            contaBancaria.setTitular(lerDados.next());
            System.out.printf("Digite o Saldo Inicial : ");
            contaBancaria.setSaldo(lerDados.nextDouble());
            System.out.printf("Digite o numero da conta : ");
            contaBancaria.setConta(lerDados.nextLong());
            contaBancaria.abrirConta(contaBancaria);
            System.out.println("Anote sua conta: " + contaBancaria.getConta());
        }
        else {
            System.out.printf("Digite sua conta: ");
            contaBancaria.setConta(Long.valueOf(lerDados.next()));
            contaBancaria.lerConta(contaBancaria);
        }
        while (repete){
            System.out.println(contaBancaria.getTitular() + "\nSeu saldo é = " + contaBancaria.getSaldo());
            System.out.printf("Deseja Sacar ou Depositar? Digite S para Saque ou D para Deposito: ");
            acao = lerDados.next();
            if(acao.toUpperCase().equals("S")){
                System.out.printf("Digite o valor a Sacar: ");
                acao = lerDados.next();
                contaBancaria.sacar(Double.parseDouble(acao));
            }
            if(acao.toUpperCase().equals("D")){
                System.out.printf("Digite o valor a Depositar: ");
                acao = lerDados.next();
                contaBancaria.depositar(Double.parseDouble(acao));
            }
            System.out.printf("Deseja encerrar o programa?  Digite F para finalizar ou C para Continuar: ");
            acao = lerDados.next();
            if(acao.toUpperCase().equals("F")){
                repete = false;
                System.out.println("Encerrando o programa!!!!");
                System.out.println("Saldo final= " + contaBancaria.getSaldo());
                contaBancaria.atualizaSaldo(contaBancaria);
            }
        }
    }
}