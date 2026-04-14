//Escrever um algoritmo para determinar o consumo médio de um automóvel sendo
//fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.

import java.util.Scanner;

public class ConsumoMedio {
    public static void main(String[] args) {
        float distanciaTotal, totalComustivelGasto, resultado;
        Scanner lerDados = new Scanner(System.in);

        System.out.printf("Digite a distancia percorrida: ");
        distanciaTotal = lerDados.nextFloat();
        System.out.printf("Digite o consumo total de combustivel: ");
        totalComustivelGasto = lerDados.nextFloat();

        resultado = distanciaTotal/totalComustivelGasto;

        System.out.println("O consumo médio do veículo é: " + resultado + "Km/l");

    }
}
