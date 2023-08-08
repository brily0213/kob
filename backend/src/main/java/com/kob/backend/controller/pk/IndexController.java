package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/* @Auther: uvcode
 * @Date: 2023/08/08/9:10 PM
 * @Description:
 */
@Controller
@RequestMapping("/pk/")
public class IndexController {

    @RequestMapping("index/")
    public String index() {
        return "pk/index.html";
    }
}
