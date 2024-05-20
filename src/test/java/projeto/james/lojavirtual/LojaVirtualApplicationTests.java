package projeto.james.lojavirtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import projeto.james.lojavirtual.controller.AcessoController;
import projeto.james.lojavirtual.model.Acesso;
import projeto.james.lojavirtual.repository.AcessoRepository;
import projeto.james.lojavirtual.service.AcessoService;

@SpringBootTest(classes = LojaVirtualApplication.class)
public class LojaVirtualApplicationTests {
	
	
	@Autowired
	private AcessoController acessoController;
	
	@Test
	public void testCadastraAcesso() {
		
		Acesso acesso = new Acesso();
		acesso.setDescricao("ROLE_ADMIN");

		acessoController.salvarAcesso(acesso);
	}

}
