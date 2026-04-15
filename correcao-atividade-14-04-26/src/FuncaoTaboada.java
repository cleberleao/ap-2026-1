//Faça uma função que recebe, por parâmetro um valor N, um valor O e um valor T e
// calcule e escreve a taboada de 1 até T. Mostre a taboada na forma: Onde “N” é o
// valor de calculo da taboada “O” é o operador da Taboada e “T” é o ultimo numero
// que será realizado a conta da Taboada. Exemplo, n = 5, O = “S” e T = 10, irá fazer a
// Taboada de soma do numero 5 até chegar no numero 10.

import java.util.Scanner;

public class FuncaoTaboada {
    public static void main(String[] args) {
        int n, t;
        String o;
        Scanner lerDados= new Scanner(System.in);
        System.out.println("Digite o numero para calcular a Taboada: ");
        n = lerDados.nextInt();
        System.out.println("Digite o numero final da Taboada: ");
        t = lerDados.nextInt();
        System.out.println("Digite + para somar, - para diminuir, * para multiplicar, / para dividir");
        o = lerDados.next();

        extracted(n, t, o);

    }

    private static void extracted(int n, int t, String o) {
        for(int i=1; i<=t; i++){
            if(o.equals("+")){
                float resultado = n + i;
                System.out.println("Taboada da soma " + n + "+" + i + "=" + resultado);
            }
            else if (o.equals("-")){
                float resultado = n - i;
                System.out.println("Taboada da subtração " + n + "-" + i + "=" + resultado);
            }
            else if (o.equals("*")){
                float resultado = n * i;
                System.out.println("Taboada da multiplicação " + n + "*" + i + "=" + resultado);
            }
            else if (o.equals("/")){
                float resultado = n / i;
                System.out.println("Taboada da divisão " + n + "/" + i + "=" + resultado);
            }
            else {
                System.out.println("Você digitou algo errado");
                break;
            }
        }
    }

}
