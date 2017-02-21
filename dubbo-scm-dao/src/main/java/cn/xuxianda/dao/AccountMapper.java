package cn.xuxianda.dao;

import org.apache.ibatis.annotations.Param;

import cn.xuxianda.entity.Account;

public interface AccountMapper extends BaseMapper<Account> {
    
	public Account login(Account account);
	
	public int updateSelectParams(Account account);

	public Account findAccountByAccountLogin(@Param("accLogin")String accLogin);
	
}