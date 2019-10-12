package entity;

import java.util.ArrayList;
import java.util.List;

import validator.ValidatorException;

public class Regiao {

	private String nome;
	private Long areaTotal;
	private Long qtdHabiantes;
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getAreaTotal() {
		return areaTotal;
	}
	public void setAreaTotal(Long areaTotal) {
		this.areaTotal = areaTotal;
	}
	public Long getQtdHabiantes() {
		return qtdHabiantes;
	}
	public void setQtdHabiantes(Long qtdHabiantes) {
		this.qtdHabiantes = qtdHabiantes;
	}
	
	public List<Regiao> listarRegioes(ArrayList<Regiao> listReg) throws ValidatorException
	{
		if (listReg == null) {
			throw new ValidatorException("Nenhuma regiao encontrada");
		}

		return listarRegioes(listReg);
	}
	
	public Regiao() {
		// TODO Auto-generated constructor stub
	}
	public Regiao(String nome, Long areaTotal, Long qtdHabiantes) {
		this.nome = nome;
		this.areaTotal = areaTotal;
		this.qtdHabiantes = qtdHabiantes;
	}
	
}