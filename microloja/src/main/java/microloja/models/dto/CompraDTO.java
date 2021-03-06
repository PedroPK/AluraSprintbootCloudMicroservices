package microloja.models.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class CompraDTO {
	
private List<ItemDaCompraDTO> itens;
	
	private EnderecoDTO endereco;

	public List<ItemDaCompraDTO> getItens() {
		return itens;
	}

	public void setItens(List<ItemDaCompraDTO> itens) {
		this.itens = itens;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}
	
	/*
	 * public String toString() { String result = "CompraDTO:" + "\n";
	 * 
	 * if ( this.itens != null && !this.itens.isEmpty() ) { for (ItemDaCompraDTO
	 * item: itens) { result = result + item.toString() + "\n"; } }
	 * 
	 * if ( this.endereco != null ) { result = result + this.endereco.toString() +
	 * "\n"; }
	 * 
	 * return result; }
	 */
	
}