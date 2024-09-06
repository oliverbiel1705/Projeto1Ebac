package src.main.java.br.com.gabriel.services;

import br.com.gabriel.dao.IProdutoDAO;
import br.com.gabriel.domain.Produto;
import br.com.gabriel.services.generic.GenericService;

/**
 * @author gabriel
 *
 */

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}