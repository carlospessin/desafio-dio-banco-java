
public class Main {

	public static void main(String[] args) {
		Cliente carlos = new Cliente();
		carlos.setNome("Carlos");
		
		Conta corrente = new ContaCorrente(carlos);
		corrente.depositar(100);
		
		Conta poupanca = new ContaPoupanca(carlos);
		corrente.transferir(100, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
