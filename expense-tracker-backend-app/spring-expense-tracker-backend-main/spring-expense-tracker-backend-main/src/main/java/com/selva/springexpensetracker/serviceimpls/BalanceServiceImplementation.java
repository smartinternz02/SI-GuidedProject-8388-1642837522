package com.selva.springexpensetracker.serviceimpls;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selva.springexpensetracker.models.Balance;
import com.selva.springexpensetracker.repos.BalanceRepository;
import com.selva.springexpensetracker.services.BalanceService;

@Service
public class BalanceServiceImplementation implements BalanceService {

	@Autowired
	private BalanceRepository balanceRepository;
	
	@Override
	public Balance saveBalance(Balance balance) {
		// TODO Auto-generated method stub
		return balanceRepository.save(balance);
	}

	@Override
	public Balance createBalance() {
		// TODO Auto-generated method stub
		Balance balance = new Balance();
		balance.setAmount(0);
		balance.setCreatedAt(new Date());
		return this.saveBalance(balance);
	}

}
