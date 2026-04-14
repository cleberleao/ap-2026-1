import java.util.Scanner;

//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
//percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos sobre o
//custo de fábrica, e depois a percentagem do distribuidor sobre o resultado). Supondo
//que a percentagem do distribuidor seja de 28% e os impostos 45%. Escrever um
//algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
//mesmo.
public class CustoDoCarro {
    public static void main(String[] args) {
        float valorDeFabrica, valorConsumidorFinal;
        Scanner lerDados = new Scanner(System.in);

        System.out.printf("Digite o custo de fabricação do veículo: ");
        valorDeFabrica = lerDados.nextFloat();
        valorConsumidorFinal = (valorDeFabrica * 0.28f) + (valorDeFabrica + 0.45f) + valorDeFabrica;

        System.out.println("O custo da fabrica para o carro é : " + valorDeFabrica);
        System.out.println("Valor final Somados os impostos e comissão da conssessionária é: "+ valorConsumidorFinal);

    }

}
