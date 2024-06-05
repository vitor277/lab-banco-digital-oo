package Interfaces;
import Exceptions.SaldoInsuficiente;

public interface IConta {
	
	
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino) throws SaldoInsuficiente;
	
	void imprimirExtrato();
}
