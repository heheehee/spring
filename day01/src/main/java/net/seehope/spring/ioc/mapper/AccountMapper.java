package net.seehope.spring.ioc.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountMapper {
    //JdbcTemplate是Spring对JDBC的封装，目的是使JDBC更加易于使用。JdbcTemplate是Spring的一部分。JdbcTemplate处理了资源的建立和释放。
    // 他帮助我们避免一些常见的错误，比如忘了总要关闭连接。
    //execute：可以执行所有SQL语句，一般用于执行DDL语句。
    //update：用于执行INSERT、UPDATE、DELETE等DML语句。
    //queryXxx：用于DQL数据查询语句。
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addMoney(int id,double money){
        return jdbcTemplate.update("update account set money=money + ? where id=?",money,id);

    }
    public int decreaseMoney(int id,double money){
        return jdbcTemplate.update("update account set money=money - ? where id=?",money,id);

    }
}
