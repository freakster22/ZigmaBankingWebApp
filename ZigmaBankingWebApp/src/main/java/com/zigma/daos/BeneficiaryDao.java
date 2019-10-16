package com.zigma.daos;

import java.util.List;

import com.zigma.entities.Beneficiary;
public interface BeneficiaryDao 
{

List<Beneficiary> getAll();
	
	Beneficiary getById(int CRN);
	
	void insert(Beneficiary beneficiary);
	
	void update(Beneficiary beneficiary);
	
	void delete(Beneficiary beneficiary);
}
