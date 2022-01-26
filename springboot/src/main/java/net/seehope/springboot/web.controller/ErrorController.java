package net.seehope.springboot.web.controller;

import net.seehope.springboot.util.JsonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ErrorController {
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public JsonResult handleException(Exception e){
        return JsonResult.errorException(e.getLocalizedMessage());
    }
    @ResponseBody
    @ExceptionHandler(ArithmeticException.class)
    public JsonResult handleException(ArithmeticException e){
        return JsonResult.errorMsg("算数异常",701);
    }
}
