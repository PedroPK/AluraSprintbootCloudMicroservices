package microloja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import microloja.models.dto.CompraDTO;
import microloja.models.dto.InfoFornecedorDTO;

@Service
public class CompraService {
	
	@Autowired
	private RestTemplate client;
	
	public void realizarCompra(CompraDTO compra) {
		
		ResponseEntity<InfoFornecedorDTO> exchange = 
			this.client.exchange("http://fornecedor/info/" + compra.getEndereco().getEstado(),		// URI of Resource to be accessed
				HttpMethod.GET,																	// HTTP Method 
				null,																			// Entity to write in Request, as Header or Body 
				InfoFornecedorDTO.class);														// Type returned by this Method()
			
		System.out.println(exchange.getBody().getEndereco());
	}
}
