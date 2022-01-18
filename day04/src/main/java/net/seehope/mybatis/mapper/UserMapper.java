package net.seehope.mybatis.mapper;

import net.seehope.mybatis.pojo.Order;
import net.seehope.mybatis.pojo.User;
import net.seehope.mybatis.pojo.vo.UserQueryVo;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getAllUser();
    User getUserById(int id);
    List<User> getUserLikeName(String name);
     int insertUser(User user);
     List<User> queryUserByHashMap(Map<String,String> params);
     List<User> queryUserByVo(UserQueryVo vo);
     int updateUserByVo(UserQueryVo vo);
     int deleteUserByVo(UserQueryVo vo);
     List<User> QueryAllUserAndOrders();
     List<User> QueryAllUserAndOrdersAndOrdersDetails();
     List<User> QueryAllUserAndOrdersAndOrdersDetailsAndItems();
     List<User> queryAllUserLazyLoad();
}
