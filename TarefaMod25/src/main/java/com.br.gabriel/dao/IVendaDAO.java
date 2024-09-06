/**
 * 
 */
package src.main.java.br.com.gabriel.dao;

import br.com.gabriel.dao.generic.IGenericDAO;
import br.com.gabriel.domain.Venda;
import br.com.gabriel.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author gabriel
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
