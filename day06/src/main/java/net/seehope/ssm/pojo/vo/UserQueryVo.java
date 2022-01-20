package net.seehope.ssm.pojo.vo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.seehope.ssm.pojo.User;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserQueryVo {
    private User user;
    private List<Integer> ids;
}
