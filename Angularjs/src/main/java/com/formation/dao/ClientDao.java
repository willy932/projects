package com.formation.dao;

import java.util.List;

import com.formation.entity.Client;

public interface ClientDao {
	
	public boolean InsertClient(Client c);

	public List<Client> getListCLient();
}
