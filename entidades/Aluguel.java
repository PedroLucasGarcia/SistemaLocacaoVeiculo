package entidades;

import javax.swing.JOptionPane;

public class Aluguel {
    private int quantidadeDias;
    private int kmInicial;
    private int kmFinal;
    private double valorTotalAluguel;
    private Cliente cliente;
    private Carro carro;

    public void iniciarAluguel() {
        this.cliente = new Cliente();
        this.carro = new Carro();

        cliente.cadastrarUsuario();
        carro.cadastrarCarro();
        
        kmInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o Km inicial do veículo:"));
    }

    public void fecharLocacao() {
        kmFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o Km final do veículo:"));
        quantidadeDias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias de aluguel:"));

        double valorPorKm = carro.getValorPorKm() * (kmFinal - kmInicial);
        valorTotalAluguel = quantidadeDias * valorPorKm;

        if (quantidadeDias > 10) {
            valorTotalAluguel *= 0.9; // Desconto de 10%
        } else if (quantidadeDias > 20) {
            valorTotalAluguel *= 0.8; // Desconto de 20%
        }
    }

    public void mostrarResumoAluguel() {
        String mostrarResumo = "Resumo Aluguel\n" +
                "Cliente\n" + cliente.mostrarDadosUsuario() + "\n" +
                "Carro\n" + carro.mostrarDadosCarro() + "\n" +
                "Aluguel\n" +
                "Quantidade de dias: " + quantidadeDias + "\n" +
                "Km Inicial: " + kmInicial + "\n" +
                "Km Final: " + kmFinal + "\n" +
                "Valor Total: R$" + valorTotalAluguel;

        JOptionPane.showMessageDialog(null, mostrarResumo);
    }
}

