package net.seehope.spring.ioc.service.impl;

import net.seehope.spring.ioc.mapper.AccountMapper;
import net.seehope.spring.ioc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public int transfer(int in, int out, double money) {
        accountMapper.addMoney(in ,money);
        int x=1/0;
        accountMapper.decreaseMoney(out,money);
        return 0;
    }
}
