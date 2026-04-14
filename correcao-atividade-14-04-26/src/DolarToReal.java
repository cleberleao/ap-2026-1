//Elaborar um algoritmo que efetue a apresentação do valor da conversão em real (R$)
//de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar
//e também a quantidade de dólares disponíveis com o usuário.

import java.util.Scanner;

public class DolarToReal {
    public static void main(String[] args) {
        float dolar, real, cotacao;
        Scanner lerDados = new Scanner(System.in);

        System.out.printf("Digite a quantidade de dolares para converter: ");
        dolar = lerDados.nextFloat();
        System.out.printf("Digit a cotação do dolar do dia: ");
        cotacao = lerDados.nextFloat();

        real = dolar*cotacao;

        System.out.println("Valor da conversão de dolar $ "
                + String.format("%.2f", dolar)
                + " para real R$ " + String.format("%.2f", real) );

    }
}
