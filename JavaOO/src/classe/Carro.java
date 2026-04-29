package classe;

import java.time.LocalDate;

public class Carro {
    private String marca;
    private String modelo;
    private Integer ano;
    private String cor;
    private LocalDate localDate;

    public Carro() {
    }

    public void exibeCarro(Carro carro){
        System.out.println("Marca: " + carro.marca);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Cor: " + carro.cor);
        System.out.println("Data do Cadastro: "
                + carro.localDate.getDayOfMonth() +
                "/"+ carro.localDate.getMonth() +
                "/" + carro.localDate.getYear()
        );
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
