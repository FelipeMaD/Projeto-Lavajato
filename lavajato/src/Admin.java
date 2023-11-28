public class Admin extends Pessoa{
    private String lavajato;
    private Conta conta;

    public Admin(){}

    public Admin(String lavajato, Conta conta) {
        this.lavajato = lavajato;
        this.conta = conta;
    }

    public Admin(Endereco endereco, String senha, String nome, String lavajato, Conta conta) {
        super(endereco, senha, nome);
        this.lavajato = lavajato;
        this.conta = conta;
    }

    public void status(Admin admin){

    }

    public void verificarGastos(){

    }

    public void verificarLucro(){

    }

    public void adicionarGastos(){

    }

    public void adicionarCliente(){

    }

    public void adicionarPontuacao(Cliente cliente){

        if (cliente.getCartaoFidelidade().getPontuacao() < 7){
            cliente.getCartaoFidelidade().setPontuacao(cliente.getCartaoFidelidade().getPontuacao()+1);
            System.out.println("Você ganhou um ponto no cartão fidelidade!");
            System.out.println("Você tem atualmente: " + cliente.getCartaoFidelidade().getPontuacao() + " pontos.");
        } else{
            System.out.println("O cliente ganhou uma lavagem grátis");
        }

    }

    public void zerarPontuacao(Cliente cliente){
        if(cliente.getCartaoFidelidade().getPontuacao() == 0){
            System.out.println("Seu cartão fidelidade será zerado, volte mais vezes para ganhar novamente sua lavagem grátis.");
        } else {
            cliente.getCartaoFidelidade().setPontuacao(0);
            System.out.println("Você recebeu um novo cartão, obrigado pela lavagem.");

        }
    }
}
