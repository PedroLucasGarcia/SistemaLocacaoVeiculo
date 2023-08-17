package entidades;

import javax.swing.JOptionPane;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;

    public void cadastrarUsuario() {
        nome = JOptionPane.showInputDialog("Nome do usuário:");
        cpf = JOptionPane.showInputDialog("CPF do usuário:");
        telefone = JOptionPane.showInputDialog("Telefone do usuário:");
    }

    public String mostrarDadosUsuario() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone;
    }
}
