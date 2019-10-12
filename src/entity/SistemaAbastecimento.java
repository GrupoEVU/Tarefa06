package entity;

import java.io.Serializable;

public class SistemaAbastecimento implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer idSistema ;
	private String nomeDoSistemaAbastecimento;
	private Double totalLitros;
	private String local;
	private String regiao;

	public SistemaAbastecimento() {
	}

	public SistemaAbastecimento(Integer idSistema, String nomeDoSistemaAbastecimento, Double totalLitros, String local,
			String regiao) {
		super();
		this.idSistema = idSistema;
		this.nomeDoSistemaAbastecimento = nomeDoSistemaAbastecimento;
		this.totalLitros = totalLitros;
		this.local = local;
		this.regiao = regiao;
	}

	public Integer getIdSistema() {
		return idSistema;
	}

	public void setIdSistema(Integer idSistema) {
		this.idSistema = idSistema;
	}

	public String getNomeDoSistemaAbastecimento() {
		return nomeDoSistemaAbastecimento;
	}

	public void setNomeDoSistemaAbastecimento(String nomeDoSistemaAbastecimento) {
		this.nomeDoSistemaAbastecimento = nomeDoSistemaAbastecimento;
	}
	public Double getTotalLitros() {
		return totalLitros;
	}

	public void setTotalLitros(Double totalLitros) {
		this.totalLitros = totalLitros;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public SistemaAbastecimento cadastrarSistemaAbastecimento() {
		SistemaAbastecimento sb = new SistemaAbastecimento();
		if(getIdSistema() == null) {
			sb.setIdSistema(1);
			sb.setNomeDoSistemaAbastecimento("Igor");
			sb.setTotalLitros(44.00);
			sb.setLocal("Diferente");
			sb.setRegiao("Leste");
		}
		return sb;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idSistema == null) ? 0 : idSistema.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SistemaAbastecimento other = (SistemaAbastecimento) obj;
		if (idSistema == null) {
			if (other.idSistema != null)
				return false;
		} else if (!idSistema.equals(other.idSistema))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SistemaAbastecimento [idSistema=" + idSistema + ", nomeDoSistemaAbastecimento="
				+ nomeDoSistemaAbastecimento + ", totalLitros=" + totalLitros + ", local=" + local + ", regiao="
				+ regiao + "]";
	}

}
