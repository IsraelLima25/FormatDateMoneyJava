package br.java.format.cnpj;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class CnpjFormat {

	public static void main(String[] args) {
		 
		/* Validação CNPJ */

		try {

			String cnpjValido = "98506279000184";
			String cnpjInvalido = "98506279000065";

			CNPJValidator cnpjValidator = new CNPJValidator();
			cnpjValidator.assertValid(cnpjInvalido);
			System.out.println("Cnpj válido");

		} catch (InvalidStateException ie) {
			System.out.println("Cpnj Inválido");
		}
		
		/* Formatação CNPJ */
		
		CNPJFormatter cpfFormat = new CNPJFormatter();
		String cnpjFormatado = "69.763.664/0001-09";		
		String cnpjNotFormatter = cpfFormat.unformat(cnpjFormatado);		
		System.out.println("CNPJ sem formatação: " + cnpjNotFormatter);
		
		String novocnpjFormatado = cpfFormat.format(cnpjNotFormatter);		
		System.out.println("CNPJ com formatação: " + novocnpjFormatado);	
		
	}

}
