package junit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import entity.Regiao;

public class RegiaoTest {

	Regiao regiao;

	@Test
	public void deveLancarVerdadeiroSeListaForVazia() {
		Regiao regiaoList = null;
		assertNull(regiaoList);	
	}
	
	@Test
	public void deveLancarVerdadeiroSeListaNaoForVazia() {	
		Regiao regiao = new Regiao("Sao Paulo", 5L, 3L);
		assertNotNull(regiao);
	}
}