import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Instâncias de objeto

        Conta conta1 = new Conta("ÁGUA", 115.46);
        CartaoFidelidade cartao1 = new CartaoFidelidade();
        Scanner input = new Scanner(System.in);
        Endereco end1 = new Endereco("Patos", "Centro", "Rua Batista Cardoso", 55);
        Endereco lavajatoEnd = new Endereco("Paulista", "Centro", "Boa Vista", 24);
        Cliente cliente1 = new Cliente("Iago", "Iago12345", 344, cartao1, end1);
        Admin adm1 = new Admin(lavajatoEnd, "admin321", "Kaio", "Minha Jóia", conta1);

        // Utilização dos métodos

        adm1.adicionarCliente();
        adm1.adicionarPontuacao(cliente1);
        adm1.adicionarPontuacao(cliente1);
        adm1.zerarPontuacao(cliente1);

        
    }
}
