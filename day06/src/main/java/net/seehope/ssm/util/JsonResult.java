package net.seehope.ssm.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonResult implements Serializable {
    private Integer status;
    private Object data;
    private String msg;

    public static JsonResult isOk(Object data){
        return new JsonResult(200,data,"success");
    }
    public static JsonResult isError(Integer status,String msg){
        return new JsonResult(status,null,msg);
    }

}
