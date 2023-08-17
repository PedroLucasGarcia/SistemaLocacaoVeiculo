package entidades;

import javax.swing.JOptionPane;

public class Carro {
    private String modelo;
    private String marca;
    private double valorPorKm;

    public void cadastrarCarro() {
        modelo = JOptionPane.showInputDialog("Modelo do carro:");
        marca = JOptionPane.showInputDialog("Marca do carro:");
        valorPorKm = Double.parseDouble(JOptionPane.showInputDialog("Valor por Km do carro:"));
    }
    public double getValorPorKm() {
        return valorPorKm;
    }
    

    public String mostrarDadosCarro() {
        return "Modelo: " + modelo + "\nMarca: " + marca + "\nValor por Km: " + valorPorKm;
    }
}
