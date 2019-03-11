package com.wangxu.springbootjdbc.service;

import com.wangxu.springbootjdbc.entity.Account;

import java.util.List;

/**
 * @author WangXu
 * @version V1.0
 * @Package com.wangxu.springbootjdbc.service
 * @Description: TODO (用一句话描述该文件做什么)
 * @date 2019/3/11 14:09
 */
public interface IAccountService {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();

}

