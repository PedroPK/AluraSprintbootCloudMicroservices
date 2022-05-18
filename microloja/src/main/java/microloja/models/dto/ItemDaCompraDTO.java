package microloja.models.dto;

import lombok.ToString;

//@Getter
//@Setter
@ToString
public class ItemDaCompraDTO {
	
private long id;
	
	private int quantidade;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
