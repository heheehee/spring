package net.seehope.mybatis.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.seehope.mybatis.pojo.User;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserQueryVo {
    private User user;
    private List<Integer> ids;
}
