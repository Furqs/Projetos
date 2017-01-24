package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Contato;

public class ContatoDao
{
	private Connection connection;
	
	public ContatoDao(Connection con)
	{
		this.connection = con;
		
	}
	
	public void adiciona(Contato contato)
	{
		String sql = "Insert into contatos(nome,email,endereco,dataNascimento)" + 
					 " values (?,?,?,?)";
		
		try
		{
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, contato.getNome());
			stmt.setString(2,contato.getEmail());
			stmt.setString(3,contato.getEndereco());
			stmt.setDate(4,new Date(contato.getDataNascimento().getTimeInMillis()));
			
			stmt.execute();
			stmt.close();
			
		}
		catch(SQLException e)
		{
			throw new RuntimeException(e);
		}
				
					
	}
	
	public void altera(Contato contato)
	{
		String sql = "update contatos set nome = ?,email=?,endereco=?,dataNascimento=?" + 
					 " where id=?";
		
		try
		{
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, contato.getNome());
			stmt.setString(2,contato.getEmail());
			stmt.setString(3,contato.getEndereco());
			stmt.setDate(4,new Date(contato.getDataNascimento().getTimeInMillis()));
			stmt.setLong(5, contato.getId());
			stmt.execute();
			stmt.close();
			
		}
		catch(SQLException e)
		{
			throw new RuntimeException(e);
		}
				
					
	}
	public void remove(Contato contato)
	{
		String sql = "delete from contatos where id=?";
		
		try
		{
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setLong(1, contato.getId());
			stmt.execute();
			stmt.close();
			
		}
		catch(SQLException e)
		{
			throw new RuntimeException(e);
		}
				
					
	}
	
	public List<Contato> PegaLista()
	{
		String sql = "select * from contatos ";
		List<Contato> lista = new ArrayList<>();
		try
		{
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			Calendar calendario =  Calendar.getInstance();
			ResultSet rs =  stmt.executeQuery();
			while(rs.next())
			{
				Contato c = new Contato();
				calendario.setTime(rs.getDate("dataNascimento"));
				c.setDataNascimento(calendario);
				c.setEmail(rs.getString("email"));
				c.setEndereco(rs.getString("endereco"));
				c.setNome(rs.getString("nome"));
				c.setId(rs.getLong("id"));
				lista.add(c);
			}
			stmt.close();
			return lista;
		}
		catch(SQLException e)
		{
			throw new RuntimeException(e);
		}
		
	}
}
