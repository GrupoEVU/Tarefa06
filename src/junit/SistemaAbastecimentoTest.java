package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.SistemaAbastecimento;

public class SistemaAbastecimentoTest {

	SistemaAbastecimento sb1 = new SistemaAbastecimento(1, "Guarapiranga", 23132.00, "Mooca", "Leste");
	SistemaAbastecimento sb2 = new SistemaAbastecimento(2, "Billings", 56532.00, "Mooca", "Leste");
	SistemaAbastecimento sb3 = new SistemaAbastecimento(3, "Cantarera", 55532.00, "Mooca", "Leste");
	SistemaAbastecimento sb4 = new SistemaAbastecimento();
	
	@Test
	public void testeDaClasseSistemaAbastecimento() {
		assertEquals("Guarapiranga", sb1, new SistemaAbastecimento(1, "Guarapiranga", 23132.00, "Mooca", "Leste"));
		assertEquals("Billings", sb2, new SistemaAbastecimento(2, "Billings", 56532.00, "Mooca", "Leste"));
		assertEquals("Cantarera", sb3, new SistemaAbastecimento(3, "Cantarera", 55532.00, "Mooca", "Leste"));
	}
	
	@Test
	public void testeCadastrarDaClasseSistemaAbastecimento() {
		assertEquals("Implementando Cadastrar", sb4.cadastrarSistemaAbastecimento(), new SistemaAbastecimento(1, "Guarapiranga", 23132.00, "Mooca", "Leste"));
	}
}
