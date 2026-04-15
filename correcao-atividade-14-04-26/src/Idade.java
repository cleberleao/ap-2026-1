//Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando
//“maior de idade” e “menor de idade” e “idoso”para cada pessoa.Considere a idade a
//partir de 18 anos como maior de idade e idoso a partir de 60 anos.

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        int[] idade = new int[75];
        Scanner lerDados = new Scanner(System.in);
        for(int i = 0; i<75; i++){
            System.out.printf("Digite uma idade: ");
            idade[i] = lerDados.nextInt();
        }
        for (int i = 0; i<idade.length; i++){
            if(idade[i] > 17 & idade[i]<60){
                System.out.println("Maior de idade: " + idade[i]);
            }
            else if (idade[i]>=60){
                System.out.println("Idoso: " + idade[i]);
            }
            else {
                System.out.println("Menor de idade: " + idade[i]);
            }
        }
    }

}
