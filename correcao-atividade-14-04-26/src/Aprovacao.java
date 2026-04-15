//Escrever um algoritmo que leia o nome e as três notas obtidas por um aluno de 0 a 10
//durante o semestre. Calcular a soma das notas e sua média (aritmética), informar o
//nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação
//(média entre 5.1 a 6.9).

import java.util.Scanner;

public class Aprovacao {
    public static void main(String[] args) {
        float nota1, nota2, nota3, resultado;
        Scanner lerDados = new Scanner(System.in);
        System.out.printf("Digite a primeira nota: ");
        nota1 = lerDados.nextFloat();
        System.out.printf("Digite a segunda nota: ");
        nota2 = lerDados.nextFloat();
        System.out.printf("Digite a terceira nota: ");
        nota3 = lerDados.nextFloat();

        resultado = (nota1+nota2+nota3)/3;

        if(resultado>=7.0f & resultado<=10.0f){
            System.out.println("Você foi aprovado com a média: "+ resultado);
        }
        else if (resultado<=5.0f & resultado>=0.0f){
            System.out.println("Você foi reprovado com a média: "+ resultado);
        }
        else if( resultado > 5.0f & resultado < 7.0f){
            System.out.println("Você está em recuperaçao com a média: "+ resultado);
        }else {
            System.out.println("Dados invalidos");
        }
    }
}
