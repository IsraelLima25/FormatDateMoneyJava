package br.java.format.cpf;

import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class CpfFormat {

	public static void main(String[] args) {
		
		/* Validação CPF */

		String cpfValido = "07829739064";
		String cpfInvalido = "07829739000";
		try {
			CPFValidator validadorCPF = new CPFValidator();
			validadorCPF.assertValid(cpfValido);
			System.out.println("Cpf válido.");
		} catch (InvalidStateException ie) {
			System.out.println("Cpf inválido.");
		}
		
		/* Formatação CPF */
		
		CPFFormatter cpfFormat = new CPFFormatter();
		String cpfFormatado = "078.297.390-64";		
		String cpfNotFormatter = cpfFormat.unformat(cpfFormatado);		
		System.out.println("CPF sem formatação: " + cpfNotFormatter);
		
		String novoCpfFormatado = cpfFormat.format(cpfNotFormatter);		
		System.out.println("CPF com formatação: " + novoCpfFormatado);	

	}

}
