import java.util.Scanner;

//Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
//A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a
//temperatura em Celsius.
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        int celsius, fahrenheit;
        Scanner lerDados = new Scanner(System.in);

        System.out.printf("Digite a temperatura em Celsius: ");
        celsius = lerDados.nextInt();
        fahrenheit = ((9*celsius)+160)/5;

        System.out.println("O grau " + celsius + "º celsius em Fahrenheit é: " + fahrenheit + "º");
    }
}
