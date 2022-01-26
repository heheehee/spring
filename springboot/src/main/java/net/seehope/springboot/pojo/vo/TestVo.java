package net.seehope.springboot.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TestVo implements Serializable {
    private Integer x;
    private Integer y;
    private String z;
}
