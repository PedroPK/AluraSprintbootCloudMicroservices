package microloja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import microloja.models.dto.CompraDTO;
import microloja.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	/**
	 * To test this Endpoint:
	 *  - URI: http://localhost:8080/compra
	 *  - Method: POST
	 *  - Body: RAW
	 *  - Content-type: JSON
	 *  - Body content:
	 {
    "itens": [
        {
            "id": 1,
            "quantidade": 5
        },
        {
            "id": 2,
            "quantidade": 1
        }
    ],
    "endereco": {
        "rua": "Rua da Maria",
        "numero": 123,
        "estado": "GO"
    }
}
	 * 
	 * 
	 * @param pCompra
	 */
	@RequestMapping(method = RequestMethod.POST)
	public void realizarCompra(@RequestBody CompraDTO pCompra) {
		this.compraService.realizarCompra(pCompra);
		
		//System.out.println(pCompra.toString());
	}
	
}
