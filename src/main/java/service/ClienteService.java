package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import identity.Cliente;
import jakarta.persistence.EntityNotFoundException;
import repository.ClienteRepository;


@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> listCliente(){
		return clienteRepository.findAll();
	}


 public Cliente creatCliente(Cliente cliente) {
	 return clienteRepository.save(cliente);
 }

public void deleteClient ( Long idCliente ) {
	clienteRepository.deleteById(idCliente);
	
}


public Cliente findClienteById (Long idCliente) {
	
	return clienteRepository.findById(idCliente)
	.orElseThrow(()-> new EntityNotFoundException("usuario não encontrado"));		
}

public Cliente updateCliente (Long idCliente ,Cliente updatedCliente) {
	
			Cliente cliente = findClienteById(idCliente);
		    cliente.setNome(updatedCliente.getNome());
			cliente.setDateRegistro(updatedCliente.getDateRegistro());
			cliente.setEmail(updatedCliente.getEmail());
			cliente.setSenha(updatedCliente.getSenha());
			cliente.setTelefone(updatedCliente.getTelefone());
			return clienteRepository.save(cliente);
	
	        
}


public List<Cliente> getAllClients(){
	return clienteRepository.findAll();
}


public Optional<Cliente> getClienteById(Long id){
	return clienteRepository.findById(id);
}




}
