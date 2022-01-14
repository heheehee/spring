package net.seehope.spring.aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
//Aspect 存放切面方法，实际上就是拦截器
//Advice（切面方法）： 前置通知，环绕通知，后置通知，异常通知，最终通知
//JoinPoint：待处理/增强的方法
//pointcut：所有连接点的集合
@Component
@Aspect
public class MyAspect {
    //AOP Proxy：AOP框架创建的对象，代理就是目标对象的加强。Spring中的AOP代理可以使JDK动态代理，也可以是CGLIB代理，前者基于接口，后者基于子类。
//     @Pointcut格式：@ 注解(value=“表达标签 （ 表达式格式)”)

    @Pointcut("execution(* net.seehope..*.service.impl.*.*(..))")//execution：用于匹配方法执行的连接点；
    public void pointCut() {

    }
//    1.1 @Before： 标识一个前置增强方法，相当于BeforeAdvice的功能.
//    1.2 @After： final增强，不管是抛出异常或者正常退出都会执行.
//    1.3 @AfterReturning： 后置增强，似于AfterReturningAdvice, 方法正常退出时执行.
//    1.4 @AfterThrowing： 异常抛出增强，相当于ThrowsAdvice.
//    1.5 @Around： 环绕增强，相当于MethodInterceptor.

    @Before("pointCut()")
    public Boolean before(JoinPoint jp){
        System.out.println("before AOP");
        return true;
    }
    @Around("pointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object result=pjp.proceed();
        System.out.println("around AOP");
        return result;
    }
    @AfterReturning(pointcut = "pointCut()",returning = "result")
    public void afterReturning(JoinPoint jp,Object result){
        System.out.println("afterReturning AOP ");
    }
    @AfterThrowing(pointcut = "pointCut()",throwing = "e")
    public void afterThrowing(JoinPoint jp, Exception e) {
        System.out.println("afterThrowing AOP ");
    }
    @After("pointCut()")
    public void after(JoinPoint jp) {
        System.out.println("after AOP ");
    }

}
