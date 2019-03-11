package com.wangxu.springbootjpa.repository;

import com.wangxu.springbootjpa.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author WangXu
 * @version V1.0
 * @Package com.wangxu.springbootjpa.repository
 * @Description: TODO (用一句话描述该文件做什么)
 * @date 2019/3/11 15:33
 */
@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {
}
