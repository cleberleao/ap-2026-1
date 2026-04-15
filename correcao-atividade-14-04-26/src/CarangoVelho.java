//A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com
//desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser
//pago pelo cliente de vários carros. O desconto deverá ser calculado de acordo com o
//ano do veículo. Até 2010 - 12% e acima de 2010 - 7%. O sistema deverá perguntar se
//deseja continuar calculando desconto até que a resposta digite: “(N) Não” . Informar
//total de carros com ano até 2010 e total geral.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class CarangoVelho {
    public static void main(String[] args) {

        float carrosAte2010[] = new float[10], carros2011EmDiante[] = new float[10];
        String encerrar;
        float valor = 0, totalGeral= 0;
        int ano, i = 0, j = 0;
        boolean repetir;
        Scanner lerdados = new Scanner(System.in);

        repetir = true;
        totalGeral = 0.0f;

        while (repetir){
            System.out.printf("Digite o ano do veículo: ");
            ano = lerdados.nextInt();
            if (ano <= 2010){
                System.out.printf("Digite o Valor do Veículo: ");
                ano = lerdados.nextInt();
                carrosAte2010[i] = (valor * 0.12f) - valor;
                System.out.printf("Continar cadastrando? S ou N: ");
                encerrar = lerdados.next();
                if (encerrar.toUpperCase() == "N"){
                    repetir = false;
                }
                i = i+1;
            }
            else {
                System.out.printf("Digite o Valor do Veículo: ");
                valor = lerdados.nextFloat();
                carros2011EmDiante[j] = (valor * 0.7f) - valor;
                System.out.printf("Continar cadastrando? S ou N: ");
                encerrar = lerdados.next();
                if (encerrar.toUpperCase() == "N"){
                    repetir = false;
                }
                j = j+1;
            }
        }
        for(i=0;i<carrosAte2010.length;i++){
            totalGeral = carrosAte2010[i]+ totalGeral;
        }
        for(j=0;j<carros2011EmDiante.length;j++){
            totalGeral = carros2011EmDiante[j]+ totalGeral;
        }
        System.out.println("Informar total de carros com ano até 2010: "+ carrosAte2010.length);
        System.out.println("Total Geral com descontos aplicados: "+ totalGeral);

    }
}
