import exercicio3.ContaBancaria;

import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {
        boolean repete = true;
        boolean continua = true;
        String acao;
        Scanner lerDados = new Scanner(System.in);
        System.out.println("Programa conta bancária");
        ContaBancaria contaBancaria = new ContaBancaria();
        while (repete){
            if (continua){
                System.out.printf("Digite seu nome: ");
                contaBancaria.setTitular(lerDados.next());
            }
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
            }
            else {
                continua = false;
            }
        }
    }
}
