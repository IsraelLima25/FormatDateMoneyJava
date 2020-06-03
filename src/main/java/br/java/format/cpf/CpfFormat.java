package br.java.format.cpf;

import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class CpfFormat {

	public static void main(String[] args) {
		
		/* Valida��o CPF */

		String cpfValido = "07829739064";
		String cpfInvalido = "07829739000";
		try {
			CPFValidator validadorCPF = new CPFValidator();
			validadorCPF.assertValid(cpfValido);
			System.out.println("Cpf v�lido.");
		} catch (InvalidStateException ie) {
			System.out.println("Cpf inv�lido.");
		}
		
		/* Formata��o CPF */
		
		CPFFormatter cpfFormat = new CPFFormatter();
		String cpfFormatado = "078.297.390-64";		
		String cpfNotFormatter = cpfFormat.unformat(cpfFormatado);		
		System.out.println("CPF sem formata��o: " + cpfNotFormatter);
		
		String novoCpfFormatado = cpfFormat.format(cpfNotFormatter);		
		System.out.println("CPF com formata��o: " + novoCpfFormatado);	

	}

}
