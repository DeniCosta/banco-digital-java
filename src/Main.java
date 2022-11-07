
public class Main {

	public static void main(String[] args) {
		Cliente denise = new Cliente();
		denise.setNome("Denise Costa");
		
		Conta cc = new ContaCorrente(denise);
		Conta poupanca = new ContaPoupanca(denise);

		cc.depositar(300);
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
