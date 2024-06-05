import java.sql.Date;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {

	private String nome;
	private String cpf;
	private LocalDate dataNascimento;

	private static final DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	/*public Cliente(String nome, String cpf, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		try{ 
		this.dataNascimento = LocalDate.parse(dataNascimento, formatar);
		}catch(DateTimeException e){
			throw new IllegalArgumentException();
		}
	}*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
