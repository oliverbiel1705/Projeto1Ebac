/**
 * 
 */
package src.main.java.br.com.gabriel.services;

import br.com.gabriel.domain.Cliente;
import br.com.gabriel.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author gabriel
 *
 */
public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
