package com.dao;

import com.model.Client;

import util.DBInteraction;

public class UserDao {

	
	public int addClient(Client c)
	{
		DBInteraction.connect();
		String sql="insert into client values(null,'"+c.getNom()+"','"+c.getPrenom()+"','"+c.getLog()+"','"+c.getPass()+"','"+c.getRole()+"')";
		int nb=DBInteraction.Maj(sql);
		DBInteraction.disconnect();
		return nb;
	}
	
	public int addClient(String nom, String prenom, String log, String pass, String role)
	{
		DBInteraction.connect();
		String sql="insert into client values(null,'"+nom+"','"+prenom+"','"+log+"','"+pass+"','"+role+"')";

		int nb=DBInteraction.Maj(sql);
		DBInteraction.disconnect();
		return nb;
		
	}
	
	
}
