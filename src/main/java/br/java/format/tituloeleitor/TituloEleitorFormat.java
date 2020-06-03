package br.java.format.tituloeleitor;

import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class TituloEleitorFormat {
	
	/* Validação Titulo Eleitor */
	
	static void validarTituloEleitor(Validator<String> validador, String documento) {
		try {			
			validador.assertValid(documento);
			System.out.println("Titulo de Eleitor válido");
		}catch (InvalidStateException ie) {
			System.out.println("Titulo de Eleitor inválido");
		}		
	}
	
	/* Formatação Titulo Eleitor */
	
	static void adicionarMascaraFormtacaoTituloEleitor(Formatter formatador, String documento) {
		try {			
			String tituloEleitorMascara = formatador.format(documento);
			System.out.println("Titulo de Eleitor com mascara " + tituloEleitorMascara);
		}catch (IllegalArgumentException ia) {
			System.out.println("Titulo de Eleitor inválido");
		}		
	}
	
	static void removerMascaraFormtacaoTituloEleitor(Formatter formatador, String documento) {
		try {			
			String tituloEleitorNotMascara = formatador.unformat(documento);
			System.out.println("Titulo de Eleitor sem mascara " + tituloEleitorNotMascara);
		}catch (IllegalArgumentException ia) {
			System.out.println("Titulo de Eleitor inválido");
		}		
	}
	
	public static void main(String[] args) {
		
		/* Validação Titulo Eleitor */
		
		String tituloEleitorValido = "107443060167";
		String tituloEleitorInvalido = "107443060169";		
		validarTituloEleitor(new TituloEleitoralValidator(), tituloEleitorValido);
		
		/* Formatação Titulo Eleitor */
		
		String tituloEleitorMascara = "1425174301/75";
		String tituloEleitorNotMascara = "142517430175";
		
		removerMascaraFormtacaoTituloEleitor(new TituloEleitoralFormatter(), tituloEleitorMascara);
		adicionarMascaraFormtacaoTituloEleitor(new TituloEleitoralFormatter(), tituloEleitorNotMascara);

	}

}
