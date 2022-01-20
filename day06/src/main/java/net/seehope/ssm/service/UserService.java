package net.seehope.ssm.service;

import net.seehope.ssm.pojo.User;
import net.seehope.ssm.pojo.vo.UserQueryVo;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> getAllUser();
    User getUserById(Integer id);
    List<User> getUserLikeName(String name);
    int insertUser(User user);
    List<User> queryUserByHashMap(Map<String, String> parms);
    List<User> queryUserByVo(UserQueryVo vo);
    int updateUserByVo(UserQueryVo vo);
    int deleteUserByVo(UserQueryVo vo);
}
