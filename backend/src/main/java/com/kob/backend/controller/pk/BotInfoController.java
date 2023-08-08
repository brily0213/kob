package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

/* @Auther: uvcode
 * @Date: 2023/08/08/9:17 PM
 * @Description:
 */
@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
    public List<String> getBotInfo(){
        List<String>list =new LinkedList<>();
        list.add("sword");
        list.add("yyw");
        return list;
    }

}
