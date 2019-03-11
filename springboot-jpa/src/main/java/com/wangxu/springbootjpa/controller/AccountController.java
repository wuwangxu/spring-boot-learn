package com.wangxu.springbootjpa.controller;

import com.wangxu.springbootjpa.entity.Account;
import com.wangxu.springbootjpa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author WangXu
 * @version V1.0
 * @Package com.wangxu.springbootjpa.controller
 * @Description: TODO (用一句话描述该文件做什么)
 * @date 2019/3/11 16:00
 */

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Account> getAccounts() {
        return service.list();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Account getAccountById(@PathVariable("id") int id) {
        return service.findOne(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateAccount(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
                                @RequestParam(value = "money", required = true) double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        Account account1 = service.update(account);

        return account1.toString();

    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "money") double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        Account account1 = service.add(account);
        return account1.toString();

    }
}
