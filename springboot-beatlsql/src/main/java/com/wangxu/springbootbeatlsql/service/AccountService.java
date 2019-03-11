package com.wangxu.springbootbeatlsql.service;

import com.wangxu.springbootbeatlsql.dao.AccountDao;
import com.wangxu.springbootbeatlsql.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author WangXu
 * @version V1.0
 * @Package com.wangxu.springbootbeatlsql.service
 * @Description: TODO (用一句话描述该文件做什么)
 * @date 2019/3/11 16:50
 */
public class AccountService {

    @Autowired
    private AccountDao dao;

    public Account findAccountByName(String name){
        return dao.selectAccountByName(name);
    }
}
