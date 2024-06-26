package projeto.james.lojavirtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.james.lojavirtual.model.Acesso;
import projeto.james.lojavirtual.repository.AcessoRepository;

@Service
public class AcessoService {

	@Autowired
	private AcessoRepository acessoRepository;
	
	public Acesso save(Acesso acesso) {
		
		/*qualquer tipo de validação*/
		return acessoRepository.save(acesso);
	}
}
