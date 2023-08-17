import entidades.Aluguel;

public class LocacaoVeiculos {
    public static void main(String[] args) {
        Aluguel a = new Aluguel();
        a.iniciarAluguel();
        a.fecharLocacao();
        a.mostrarResumoAluguel();
    }
}