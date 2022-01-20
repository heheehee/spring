package net.seehope.ssm.service.impl;

import lombok.AllArgsConstructor;
import net.seehope.ssm.mapper.UserMapper;
import net.seehope.ssm.pojo.User;
import net.seehope.ssm.pojo.vo.UserQueryVo;
import net.seehope.ssm.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;


    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getUserLikeName(String name) {
        return userMapper.getUserLikeName(name);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public List<User> queryUserByHashMap(Map<String, String> parms) {
        return userMapper.queryUserByHashMap(parms);
    }

    @Override
    public List<User> queryUserByVo(UserQueryVo vo) {
        return userMapper.queryUserByVo(vo);
    }

    @Override
    public int updateUserByVo(UserQueryVo vo) {
        return userMapper.updateUserByVo(vo);
    }

    @Override
    public int deleteUserByVo(UserQueryVo vo) {
        return userMapper.deleteUserByVo(vo);
    }
}
