import Exceptions.SaldoInsuficiente;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public boolean sacar(double valor) throws SaldoInsuficiente {
		if(saldo >= (valor)){
			saldo -= valor;
			return true;
		}else{
			throw new SaldoInsuficiente();
		}
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
