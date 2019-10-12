package junit;

import static org.junit.Assert.assertEquals;

import javax.swing.JOptionPane;

import org.junit.Test;

import entity.Represa;

public class RepresaTest {

	@Test
	public void CadastrarRepresaTest() {
		String nomeRepresa = "Billings";
		String sistemaPertence = "Cantareira";
		int volumeUtil = 102030;
		int volumeResrvTec = 3012;
		boolean RetornoEsperado = true;
		
		boolean respostaTest = Represa.ExecutaRepresa(nomeRepresa, sistemaPertence, volumeUtil, volumeResrvTec);
		
		System.out.println(respostaTest);
		
		if(respostaTest == true)
		{
			JOptionPane.showMessageDialog(null,"Represa Cadastrada com Sucesso!!");
		}else {
			JOptionPane.showMessageDialog(null,"ERRO" + "\n" + "Represa não Cadastrada");
		}
		
		assertEquals(RetornoEsperado, respostaTest);
	}	


}
