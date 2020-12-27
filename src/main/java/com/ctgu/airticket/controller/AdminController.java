package com.ctgu.airticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author:Mr.zhou
 * @Package:com.ctgu.airticket.controller
 * @Date:2020/12/25
 * @Description:
 * @Version 1.0
 */
@Controller
public class AdminController {
    /**
     * 管理员登录页面跳转控制
     * @return
     */
    @GetMapping("/adminLogin")
    public String toAdminLogin(){
        return "admin_login";
    }

}
