//Faça um algoritmo que receba um valor que foi depositado e exiba o valor com
//rendimento após um mês. ● Considere fixo o juro da poupança em 0,70% a. m.


import java.util.Scanner;

public class CalculoPoupanca {
    public static void main(String[] args) {
        float deposito, rendimentoMensal;
        Scanner lerDados = new Scanner(System.in);
        System.out.printf("Digite o valor do depósito: ");
        deposito = lerDados.nextFloat();
        rendimentoMensal = (deposito * 0.07f) + deposito;

        System.out.println("O valor depositado após um mês com rendimento 0,70% é: " + rendimentoMensal);
    }


}
