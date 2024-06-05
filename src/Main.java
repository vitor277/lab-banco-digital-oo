import Exceptions.SaldoInsuficiente;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Joao", "155.155.155-58", "01/03/2002");
		
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(50);
		try{ 
			cc.transferir(100, poupanca);
		}catch(SaldoInsuficiente ex){
			System.out.println("O valor para saque/transferência é insuficiente");
		}

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		try{ 
			poupanca.transferir(100, cc);
		}catch(SaldoInsuficiente ex){
			System.out.println("O valor para saque/transferência é insuficiente");
		}
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
