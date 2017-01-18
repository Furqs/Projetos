package br.com.caelum.jdbc.teste;

import java.sql.Connection;

import br.com.caelum.jdbc.ConnectionFactory;

public class TestaConexao 
{
	public static void main(String[] args)
	{
		try
		{
			Connection connection = new ConnectionFactory().getConnection();
			System.out.println("Conexão Aberta");
			connection.close();	
		}
		catch (Exception e)
		{
			
		}
	}
}
