
public class ContaCorrente extends Conta {

	protected double limite=100;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public boolean sacar(double valor) throws SaldoInsuficiente {
		if(saldo <= valor + this.limite){
			saldo -= valor;
			return true;
		}else{
			throw new SaldoInsuficiente();
		}
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
