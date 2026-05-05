package exercicio3;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria() {
    }
    public double depositar(double valor){
        saldo = saldo + valor;
        return saldo;
    }
    public double sacar(double valor){
        saldo = saldo - valor;
        return saldo;
    }

    public void mostrarSaldo(){
        System.out.printf("Seu saldo é: " + saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
