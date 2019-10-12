package entity;

public class Usuario {
	private String nome;
	private String login;
	private String senha;
	
	/* CONSTRUTOR */
	public Usuario(String nome, String login, String senha) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	
	/* NOME */
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/* LOGIN */
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	/* SENHA */
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	/* METODO */	
	public static boolean ExecutaUsuario(String nome, String login, String senha) {
		boolean resposta;
		System.out.println("Nome: " + nome);
		System.out.println("Login: " + login);
		System.out.println("Senha: " + senha);
		if(nome.isEmpty() || login.isEmpty() || senha.isEmpty())
		{
			resposta = false;
		}else {
			resposta = true;
		}
		return resposta;
	}
	
}
