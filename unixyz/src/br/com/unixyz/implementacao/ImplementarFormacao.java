package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Bacharelado;
import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Formacao;
import br.com.unixyz.modelo.Medio;
import br.com.unixyz.modelo.Tecnologo;
import br.com.unixyz.util.Magica;

public class ImplementarFormacao {

	public static void main(String[] args) {
		Formacao f = new Formacao();
		int resposta = Magica.i("Selecione \n<1> M�dio \n<2> Bacharel \n<3>Tecn�logo");
		if (resposta == 1) {
			f = new Medio(
					Magica.s("Descri��o"),
					Magica.i("Dura��o:"),
					Magica.f("Mensalidade:"),
					Magica.s("Tipo")
					);
		}else if (resposta==2){
			f = new Bacharelado(
					Magica.s("Descri��o"),
					Magica.i("Dura��o:"),
					Magica.f("Mensalidade:"),
					Magica.i("Carga Hor�ria:"),
					Magica.s("TCC:")
					);
		}else if (resposta==3) {
			f = new Tecnologo(
					Magica.s("Descri��o"),
					Magica.i("Dura��o:"),
					Magica.f("Mensalidade:"),
					true
					);
		}
		
		f.calcMensalidade(0.5);
		System.out.println(f.getAll());
		System.out.println(f.retornarMedia(10, 6));
		

	}

}
