package pers.hai.simple.aop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-20 10:58
 * Last Modify: 2019-06-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
@RestController
@RequestMapping(value = "/aop/hello")
public class HelloController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String say(@RequestParam String name) {
        return String.format("Hello %s", name);
    }

    @RequestMapping(value = "/s1", method = RequestMethod.GET)
    public String say2() {
        return String.format("[%d] hello", System.currentTimeMillis());
    }
}
