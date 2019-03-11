package com.wangxu.springbootjpa.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.wangxu.springbootjpa.entity.Account;
import com.wangxu.springbootjpa.repository.AccountRepository;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

/**
 * @author WangXu
 * @version V1.0
 * @Package com.wangxu.springbootjpa.service
 * @Description: TODO (用一句话描述该文件做什么)
 * @date 2019/3/11 15:35
 */
@Service
public class AccountService {
    private static final Logger LOG = LoggerFactory.getLogger(AccountService.class);

    @Autowired
    private AccountRepository repository;

    public Account add(Account account){
        LOG.info("add.........");
        return repository.save(account);
    }

    public Account update(Account account){
        LOG.info("update.....");
        return repository.saveAndFlush(account);
    }

    public boolean delete(int id){
        LOG.info("delete.....");
        repository.deleteById(id);
        return true;
    }

    public Account findOne(int id){
        LOG.info("find......");
        Optional<Account> account = repository.findById(id);
        Assert.assertTrue(account.isPresent());
        return account.get();
    }

    public List<Account> list(){
        LOG.info("list......");
        return repository.findAll();
    }
}
