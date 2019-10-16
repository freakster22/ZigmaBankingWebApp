package com.zigma.services;

import java.util.List;

import com.zigma.entities.Beneficiary;

public interface BeneficiaryService
{
List<Beneficiary> findAllBeneficiary();
	
Beneficiary findBeneficiaryById(int CRN);
	
	void addBeneficiary(Beneficiary beneficiary);
	
	void updateBeneficiary(Beneficiary beneficiary);
	
	void removeBeneficiary(Beneficiary beneficiary);
}
