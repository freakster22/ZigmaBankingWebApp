package com.zigma.services;

import java.util.List;

import com.zigma.entities.Account;
import com.zigma.entities.Beneficiary;

/**
 * @author Arib aka FREAKSTER
 * @creation_date 4th Oct 2019 11:39
 * @creation_date 10th Oct 2019 17:39
 * @version 3.0
 * @copyright Zensar Tech
 * @description It is Product Service Class This is used in Business Layer.
 *
 */
public interface BeneficiaryService {
	List<Beneficiary> findAllBeneficiary();
	
	Beneficiary findBeneficiaryByAccountNo(long beneficiaryAccNo);
	
	void addBeneficiary(Beneficiary beneficiary);
	boolean beneficiaryExists(Beneficiary beneficiary);

}
