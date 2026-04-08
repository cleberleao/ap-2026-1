import java.util.Scanner;

// Leia: o nome de um vendedor, o seu salário fixo, o valor total de vendas
// dele no mês e calcule 15% de comissão das vendas. Exibir no final o nome, o
// salário fixo e salário total
public class SalarioComissao {
    public static void main(String[] args) {
        String nomeVendedor;
        float salarioFixo, valorVendas, salarioTotal;
        Scanner receberDados = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        nomeVendedor = receberDados.next();
        System.out.println("Digite o salario mensal: ");
        salarioFixo = Float.parseFloat(receberDados.next());
        System.out.println("Digite o valor das vendas do mês: ");
        valorVendas = Float.parseFloat(receberDados.next());
        salarioTotal = (float) (salarioFixo + (valorVendas * 0.15));

        System.out.println("Nome do Vendedor é: " + nomeVendedor);
        System.out.println("Salario sem comissão é: " + salarioFixo);
        System.out.println("Salário com comissão é: "+ salarioTotal);
    }
}
