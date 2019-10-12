package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entity.Usuario;
import validator.ValidatorException;

public class UsuarioTest {

	@Test
	public void CadastrarUsuarioTest() throws ValidatorException {
		String nome = "Gabriel Silva";
		String login = "gabriel.silva";
		String senha = "password";
		boolean RetornoEsperado = true;
		
		boolean respostaTest = Usuario.ExecutaUsuario(nome, login, senha);
		
		System.out.println(respostaTest);
		
		if(respostaTest == true)
		{
			System.out.println("Usuário Cadastrado com Sucesso!!");
		}else {
			throw new ValidatorException("Erro!! Campo vazio");
		}
		
		assertEquals(RetornoEsperado, respostaTest);
	}

}
