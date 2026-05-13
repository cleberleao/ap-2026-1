package classe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private Long conta;

    private String url = "jdbc:mariadb://cleberleao.com:3306/cleberleao_ap-2026?useSSL=false&serverTimezone=UTC";
    private String usuario = "cleberleao_faseh"; // ou outro usuário
    private String senha = "Configs11@";

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

    public ContaBancaria abrirConta(ContaBancaria cliente) throws SQLException {

        String sql = "INSERT INTO ContaBancaria (titular, saldo, conta) VALUES (?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, usuario, senha);
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, cliente.titular);
            ps.setDouble(2, cliente.saldo);
            ps.setLong(3, cliente.conta);
            ps.executeUpdate();

            System.out.println("Conta gravada com sucesso!");
            con.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return cliente;
    }

    public void atualizaSaldo(ContaBancaria conta){
        String sql = "tem que codar";
        try (Connection con = DriverManager.getConnection(url, usuario, senha);
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            //tem que codar
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ContaBancaria lerConta(ContaBancaria exiteConta){
        String sql = "SELECT * FROM ContaBancaria WHERE id=" + exiteConta.getConta();
        try (Connection con = DriverManager.getConnection(url, usuario, senha);
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            System.out.println("=== Conta Conrrente existente ===");
            while (rs.next()) {
                exiteConta.titular = rs.getString("titular");
                exiteConta.saldo = rs.getDouble("saldo");
                exiteConta.conta = rs.getLong("conta"); // como String para simplificar
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return exiteConta;
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

    public Long getConta() {
        return conta;
    }

    public void setConta(Long conta) {
        this.conta = conta;
    }
}
