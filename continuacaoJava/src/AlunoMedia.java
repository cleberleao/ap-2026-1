//Escrever um algoritmo que leia o nome de um aluno e as notas das //três provas que ele obteve no semestre. No final informar o nome do //aluno e a sua média


import java.util.Scanner;

public class AlunoMedia {
    public static void main(String[] args) {
        String nome;
        float nota1, nota2, nota3, media;

        System.out.printf("Digite o nome do aluno: ");
        Scanner entradaDados = new Scanner(System.in);
        nome = entradaDados.next();
        System.out.printf("Digite a primeira nota: ");
        nota1 =Float.parseFloat(entradaDados.next());
        System.out.printf("Digite a segunda nota: ");
        nota2 = entradaDados.nextFloat();
        System.out.printf("Digite a terceira nota: ");
        nota3 = entradaDados.nextFloat();
        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Nome do aluno: "+ nome);
        System.out.println("A media do aluno é: "+ String.format("%.2f", media));
    }
}
