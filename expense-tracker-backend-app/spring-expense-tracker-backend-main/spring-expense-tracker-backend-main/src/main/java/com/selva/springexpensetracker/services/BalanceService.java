package com.selva.springexpensetracker.services;

import com.selva.springexpensetracker.models.Balance;

public interface BalanceService {
	public Balance saveBalance(Balance balance);
	public Balance createBalance();
}
