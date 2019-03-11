package com.wangxu.springbootjdbc.dao.impl;

import com.wangxu.springbootjdbc.dao.IAccountDAO;
import com.wangxu.springbootjdbc.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author WangXu
 * @version V1.0
 * @Package com.wangxu.springbootjdbc.repository.impl
 * @Description: TODO (用一句话描述该文件做什么)
 * @date 2019/3/11 14:02
 */
@Repository
public class AccountDaoImpl implements IAccountDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Account account) {
        return jdbcTemplate.update("insert into account(name, money) values(?, ?)",
                account.getName(),account.getMoney());
    }

    @Override
    public int update(Account account) {
        return jdbcTemplate.update("UPDATE account SET NAME=? ,money=? WHERE id=?",
                account.getName(),account.getMoney(),account.getId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("delete from TABLE account where id=?",id);
    }

    @Override
    public Account findAccountById(int id) {
        List<Account> list = jdbcTemplate.query("select * from account where id = ?", new Object[]{id}, new BeanPropertyRowMapper(Account.class));
        if(list!=null && list.size()>0){
            Account account = list.get(0);
            return account;
        }else{
            return null;
        }
    }

    @Override
    public List<Account> findAccountList() {
        List<Account> list = jdbcTemplate.query("select * from account", new Object[]{}, new BeanPropertyRowMapper(Account.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
    }
}
