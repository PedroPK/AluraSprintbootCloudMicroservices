package microloja.models.dto;

import lombok.ToString;

//@Getter
//@Setter
@ToString
public class InfoFornecedorDTO {
	
	private String endereco;
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}