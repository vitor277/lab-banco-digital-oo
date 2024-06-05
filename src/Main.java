
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(50);
		try{ 
			cc.transferir(100, poupanca);
		}catch(SaldoInsuficiente ex){
			System.out.println("O valor para saque/transferência é insuficiente");
		}
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
