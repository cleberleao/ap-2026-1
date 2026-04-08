import java.util.Scanner;

// Escrever um algoritmo que leia dois valores distintos inteiros e informe qual é o
// maior e diga se este número maior está no intervalo entre 1 a 99 100 e 199 ou maior que 200.
public class IntervaloDoisValores {
    public static void main(String[] args) {
        int num1, num2, numMaior;
        Scanner lerInteiro = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro: ");
        num1 = lerInteiro.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        num2 = lerInteiro.nextInt();

        if (num1 > num2){
            System.out.println("o primeiro numero digitado é maior");
            numMaior = num1;
        }
        else if(num2 > num1){
            System.out.println("o segundo numero digitado é maior");
            numMaior = num2;
        }
        else {
            System.out.println("Os numeros são iguais");
            numMaior = num1;
        }
        if (numMaior < 100 && numMaior > 0 ){
            System.out.println("O numero está no intervalo de 0 a 99");
            System.out.println("o numero é: " + numMaior);
        }
        else if (numMaior > 99 && numMaior < 200){
            System.out.println("O numero está no intervalo de 100 a 199");
            System.out.println("o numero é: " + numMaior);
        }
        else {
            System.out.println("O numero está no intervalo acima de 200");
            System.out.println("o numero é: " + numMaior);
        }
    }
}
