package cn.xuxianda.service.impl;

import org.springframework.stereotype.Service;

import cn.xuxianda.entity.Account;
import cn.xuxianda.service.AccountService;

@Service
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService {

	@Override
	public Account login(Account account) {
		return accountMapper.login(account);
	}

	@Override
	public int updateSelectParams(Account account) {
		return accountMapper.updateSelectParams(account);
	}

	@Override
	public Account findAccountByAccountLogin(String accLogin) {
		return accountMapper.findAccountByAccountLogin(accLogin);
	}
	
}
