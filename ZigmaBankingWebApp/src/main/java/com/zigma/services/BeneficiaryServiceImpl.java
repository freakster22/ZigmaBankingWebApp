package com.zigma.services;

import java.util.List;

import com.zigma.daos.BeneficiaryDao;
import com.zigma.entities.Beneficiary;
import com.zigma.daos.BeneficiaryDaoImpl;

public class BeneficiaryServiceImpl implements BeneficiaryService
{


	private BeneficiaryDao  beneficiaryDao;
	public BeneficiaryServiceImpl() 
	{
		beneficiaryDao = new BeneficiaryDaoImpl();
	}


@Override
public List<Beneficiary> findAllBeneficiary() {
	return beneficiaryDao.getAll();
}

@Override
public Beneficiary findBeneficiaryById(int CRN) {
	Beneficiary beneficiary= beneficiaryDao.getById(CRN);
	return beneficiary;
}

@Override
public void addBeneficiary(Beneficiary beneficiary) {
	beneficiaryDao.insert(beneficiary);
}

@Override
public void updateBeneficiary(Beneficiary beneficiary) {
	beneficiaryDao.update(beneficiary);

}

@Override
public void removeBeneficiary(Beneficiary beneficiary) {
	beneficiaryDao.delete(beneficiary);

}

}
