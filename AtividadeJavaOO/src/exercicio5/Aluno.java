package exercicio5;

public class Aluno {
    private String nome;
    private float nota1, nota2, media;

    public Aluno() {
    }

    public float calcularMedia(float nota1, float nota2){
        media = (nota1 + nota2) / 2;
        return media;
    }

    public void verificarSituacao(Aluno aluno){
        if(aluno.media < 7.0 && aluno.media >= 5.0){
            System.out.println(aluno.nome + " você foi reprovado sua media foi: " + media);
        }
        else if( aluno.media >= 7.0 && aluno.media <= 10){
            System.out.println(aluno.nome + " você foi aprovado sua media foi: " + media);
        }
        else if (aluno.media < 5.0 && aluno.media >= 0) {
            System.out.println(aluno.nome + " você foi reprovado sua media foi: " + media);
        }
        else {
            System.out.println("Dados Inválidos");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
}
