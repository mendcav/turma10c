package br.com.unixyz.modelo;

public class Tecnologo extends Formacao{
	private boolean planoEstendido;

	public void calcMensalidade(float fator) {
		super.setMensalidade(super.getMensalidade() * 600 * fator);
	}
	
	public String getAll () {
		return
				super.getAll() + "\n" +
				"Plano estendido: " + planoEstendido;
	}
	
	public void setAll(String descricao, int duracao, float mensalidade, boolean planoEstendido) {
		super.setAll(descricao, duracao, mensalidade);
		this.planoEstendido = planoEstendido;
	}

	public Tecnologo() {
		super();
	}

	public Tecnologo(String descricao, int duracao, float mensalidade, boolean planoEstendido) {
		super(descricao, duracao, mensalidade);
		this.planoEstendido = planoEstendido;
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	
	

}
