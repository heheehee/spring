package net.seehope.spring.ioc.service;

import net.seehope.spring.ioc.mapper.AccountMapper;
import org.springframework.stereotype.Service;


public interface AccountService {
   int transfer(int in,int out,double money);

}
