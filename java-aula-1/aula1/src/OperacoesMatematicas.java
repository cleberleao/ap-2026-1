//Escreva um Algoritmo para demonstrar as operações matemáticas básicas e mostre
// o resultado para cada operador.

import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        float num1, num2, resultado;
//        num1 = 5.0f;
//        num2 = 7.0f;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num1 = Float.parseFloat(leia.next());
        System.out.println("Digite outro numero: ");
        num2 = leia.nextFloat();
        resultado = num1 + num2;
        System.out.println("A soma dos numeros é: "+ resultado);

        resultado = num1 - num2;
        System.out.println("A subtração dos numeros é: "+ resultado);

        resultado = num1 * num2;
        System.out.println("A multiplicação dos numeros é: "+ resultado);

        resultado = num1 / num2;
        System.out.println("A divisão dos numeros é: "+ resultado);
    }
}
