package entity;

public class Represa {
	private String 	nomeRepresa;
	private String 	sistemaPertence;
	private int 	volumeUtil;
	private int 	volumeResrvTec;
	
	public Represa(String nomeRepresa, String sistemaPertence, int volumeUtil, int volumeResrvTec) {
		this.nomeRepresa = nomeRepresa;
		this.sistemaPertence = sistemaPertence;
		this.volumeResrvTec = volumeResrvTec;
		this.volumeUtil = volumeUtil;
	}
	@Override
	public String toString() {
		return "Represa [nomeRepresa=" + nomeRepresa + ", sistemaPertence=" + sistemaPertence + ", volumeUtil="
				+ volumeUtil + ", volumeResrvTec=" + volumeResrvTec + "]";
	}
	
	public String getNomeRepresa() {
		return nomeRepresa;
	}
	public void setNomeRepresa(String nomeRepresa) {
		this.nomeRepresa = nomeRepresa;
	}
	public String getSistemaPertence() {
		return sistemaPertence;
	}
	public void setSistemaPertence(String sistemaPertence) {
		this.sistemaPertence = sistemaPertence;
	}
	public int getVolumeUtil() {
		return volumeUtil;
	}
	public void setVolumeUtil(int volumeUtil) {
		this.volumeUtil = volumeUtil;
	}
	public int getVolumeResrvTec() {
		return volumeResrvTec;
	}
	public void setVolumeResrvTec(int volumeResrvTec) {
		this.volumeResrvTec = volumeResrvTec;
	}
	
	public static boolean ExecutaRepresa(String nomeRepresa, String sistemaPertence, int volumeUtil, int volumeResrvTec) {
		boolean resposta;
		System.out.println("Nome: " + nomeRepresa);
		System.out.println("Sistema De Abastecimento: " + sistemaPertence);
		System.out.println("Volume Util: " + volumeUtil);
		System.out.println("Volume Reservatório Tecnico: " + volumeResrvTec);
		if(nomeRepresa.isEmpty() || sistemaPertence.isEmpty() || volumeUtil == 0 || volumeResrvTec == 0)
		{
			resposta = false;
		}else {
			resposta = true;
		}
		return resposta;
	}
	
	
}