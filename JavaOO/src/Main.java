import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import classe.Carro;

public class Main {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        Carro carro = new Carro();
        boolean repete = true;
        ArrayList<Carro> carros = new ArrayList<>();


        System.out.println("Programa de cadastro de Veículos");
        do{
            LocalDate localDate = LocalDate.now();
            System.out.printf("Digite a marca do Veículo: ");
            carro.setMarca(lerDados.next());
            System.out.printf("Digite o modelo do Veículo: ");
            carro.setModelo(lerDados.next());
            System.out.printf("Digite o ano do Veículo: ");
            carro.setAno(lerDados.nextInt());
            System.out.printf("Digite a cor do Veículo: ");
            carro.setCor(lerDados.next());
            System.out.printf("Dseja continuar cadastrando? S ou N: ");
            String continua = lerDados.next().toUpperCase();
            carro.setLocalDate(localDate);
            if(continua.equals("S")) {
                repete = true;
            }
            else if (continua.equals("N")){
                repete = false;
            }
            carros.add(carro);
            carro = new Carro();
        } while (repete);

        for(int i= 0; i < carros.size(); i++){
            System.out.println("classe.Carro numero " + i);
            carro.exibeCarro(carros.get(i));
        }

        }
}