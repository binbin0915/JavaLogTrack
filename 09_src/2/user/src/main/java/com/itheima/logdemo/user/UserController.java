package com.itheima.logdemo.user;

import com.itheima.logdemo.utils.LogBean;
import com.itheima.logdemo.utils.LogInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger("kafka");
    @LogInfo
    @RequestMapping("/info")
    public String info(){

        LogBean logBean = LogBean.logBeanThreadLocal.get();
        logBean.setMessage("I am user.UserController");
        logger.info(logBean.toString());
        return "zhangsan";
    }

    @LogInfo
    @RequestMapping("/check")
    public boolean check(@RequestParam("username") String username , @RequestParam("password") String password){

        //check username and password

        LogBean logBean = LogBean.logBeanThreadLocal.get();
        logBean.setMessage("correct user");
        logger.info(logBean.toString());

        return true;
    }
}
