package pers.hai.simple.aop.log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-20 18:55
 * Last Modify: 2019-06-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(public * pers.hai.simple.aop.controller.*.*(..))")
    public void postController() { }

    @Before("postController()")
    public void beforePost() {
        System.out.println(String.format("[%d] before post logging.", System.currentTimeMillis()));
    }

    @After("postController()")
    public void afterPost() {
        System.out.println(String.format("[%d] after post logging.", System.currentTimeMillis()));
    }
}
