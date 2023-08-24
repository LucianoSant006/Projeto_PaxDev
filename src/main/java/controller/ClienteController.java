package controller;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import identity.Cliente;
import service.ClienteService;

@RestController
	@RequestMapping("/client")
	public class ClienteController {
		
		private ClienteService clienteService;
		
		@Autowired
		public ClienteController(ClienteService clienteService) {
			this.clienteService = clienteService;
		}
		
		@GetMapping("/all")
		public List<Cliente> getAllClients(){
			return clienteService.getAllClients();
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<Cliente> getClientById(@PathVariable Long id){
			java.util.Optional<Cliente> cliente = clienteService.getClienteById(id);
			return cliente.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
		}
		
		@PostMapping
		public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente){
			Cliente createCliente = clienteService.creatCliente(cliente);
			return new ResponseEntity<>(createCliente, HttpStatus.CREATED);	
		}
}
		
		
	

