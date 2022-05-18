package microloja.models.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompraDTO {
	
	private List<ItemDaCompraDTO>	aItens;
	
	private EnderecoDTO				endereco;
	
	public String toString() {
		String result = "CompraDTO:" + "\n";
		
		if ( this.aItens != null && !this.aItens.isEmpty() ) {
			for (ItemDaCompraDTO item: aItens) {
				result = result + item.toString() + "\n";
			}
		}
		
		if ( this.endereco != null ) {
			result = result + this.endereco.toString() + "\n";
		}
		
		return result;
	}
	
}