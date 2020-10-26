package br.com.unixyz.modelo;

public class Bacharelado extends Formacao{
	private int cargaHorariaEstagio;
	private String trabalhoConclusao;
	
	
	public void calcMensalidade(float fator) {
		super.setMensalidade((super.getMensalidade() * 600 * fator)+(cargaHorariaEstagio*40));
	}
	
	public String getAll () {
		return
				super.getAll() + "\n" +
				"Carga hor�ria est�gio: " + cargaHorariaEstagio + "\n"+
				"Trabalho conclus�o: " + trabalhoConclusao;
	}
	
	public void settAll(String descricao, int duracao, float mensalidade, int cargaHorariaEstagio,
			String trabalhoConclusao) {
		super.setAll(descricao, duracao, mensalidade);
		this.cargaHorariaEstagio = cargaHorariaEstagio;
		this.trabalhoConclusao = trabalhoConclusao;
	}
	public Bacharelado() {
		super();
	}
	public Bacharelado(String descricao, int duracao, float mensalidade, int cargaHorariaEstagio,
			String trabalhoConclusao) {
		super(descricao, duracao, mensalidade);
		this.cargaHorariaEstagio = cargaHorariaEstagio;
		this.trabalhoConclusao = trabalhoConclusao;
	}
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	public String getTrabalhoConclusao() {
		return trabalhoConclusao;
	}
	public void setTrabalhoConclusao(String trabalhoConclusao) {
		this.trabalhoConclusao = trabalhoConclusao;
	}

	
}
