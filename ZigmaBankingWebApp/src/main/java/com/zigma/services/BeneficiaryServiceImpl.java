package com.zigma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.zigma.daos.BeneficiaryDao;
import com.zigma.entities.Beneficiary;
import com.zigma.daos.BeneficiaryDaoImpl;

public class BeneficiaryServiceImpl implements BeneficiaryService
{

@Autowired
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
