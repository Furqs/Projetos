package br.com.caelum.jdbc.dao;

import java.util.Calendar;
import java.util.List;

import br.com.caelum.jdbc.modelo.Contato;

public class Teste 
{
	public static void main(String[] args)
	{   
		//fazendo um crud 
		/*Contato contato =new Contato();
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setEndereco("rua xxx");
		*/
		/*ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		contato.setId((long) 4);
		dao.altera(contato);
		contato.setId((long) 3);
		dao.remove(contato);
		
		System.out.println("Gravou");*/
		
		//usando a consulta
		ContatoDao lstContato = new ContatoDao();
		List<Contato> contatos = lstContato.PegaLista();
		for (Contato contato : contatos)
		{
			System.out.println("Nome    : " + contato.getNome());
			System.out.println("Email   : " + contato.getEmail());
			System.out.println("End     : " + contato.getEndereco());
			System.out.println("Dt Nasc : " + contato.getDataNascimento().getTime() + "\n");
		}
				
		
	}
}
