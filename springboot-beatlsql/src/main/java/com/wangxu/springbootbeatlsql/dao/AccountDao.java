package com.wangxu.springbootbeatlsql.dao;

import com.wangxu.springbootbeatlsql.entity.Account;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public interface AccountDao extends BaseMapper<Account> {

//    接口继承BaseMapper，就能获取单表查询的一些性质，当你需要自定义sql的时候，只需要在resouses/sql/account.md文件下书写文件
    @SqlStatement(params = "name")
    Account selectAccountByName(String name);
}
