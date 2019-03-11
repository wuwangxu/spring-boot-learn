package com.wangxu.springbootjdbc.dao;

import com.wangxu.springbootjdbc.entity.Account;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author WangXu
 * @version V1.0
 * @Package com.wangxu.springbootjdbc.repository
 * @Description: TODO (用一句话描述该文件做什么)
 * @date 2019/3/11 13:54
 */
public interface IAccountDAO {
    int add(Account account);
    int update(Account account);
    int delete(int id);
    Account findAccountById(int id);
    List<Account> findAccountList();
}
