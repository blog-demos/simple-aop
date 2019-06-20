package pers.hai.simple.aop.log;

import java.lang.annotation.*;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-20 11:10
 * Last Modify: 2019-06-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface Log {
    String operateType(); // 记录日志的操作类型
}
