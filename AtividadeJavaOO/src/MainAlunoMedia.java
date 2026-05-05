import exercicio5.Aluno;

import java.util.Scanner;

public class MainAlunoMedia {
    public static void main(String[] args) {
        boolean repete = true;
        String acao;
        Scanner lerDados = new Scanner(System.in);

        while (repete){
            Aluno aluno = new Aluno();
            System.out.printf("Digite o nome do Aluno: ");
            aluno.setNome(lerDados.next());
            System.out.printf("Digite a 1º Nota: ");
            aluno.setNota1(lerDados.nextFloat());
            System.out.printf("Digite a 2º Nota: ");
            aluno.setNota2(lerDados.nextFloat());
            aluno.calcularMedia(aluno.getNota1(), aluno.getNota2());
            System.out.printf("Deseja saber a situação do aluno? Digite S para Sim ou N para Não: ");
            acao = lerDados.next();
            if(acao.toUpperCase().equals("S")){
                aluno.verificarSituacao(aluno);
            }
            else{
                System.out.printf("Cancelado situação aluno");
            }
            System.out.printf("Deseja encerrar o programa?  Digite F para finalizar ou C para Continuar: ");
            acao = lerDados.next();
            if(acao.toUpperCase().equals("F")){
                repete = false;
                System.out.printf("Encerrando o programa!!!!");
            }
        }
    }
}