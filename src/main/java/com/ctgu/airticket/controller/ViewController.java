package com.ctgu.airticket.controller;

import com.ctgu.airticket.entity.TFlight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @Author:Mr.zhou
 * @Package:com.ctgu.airticket.controller
 * @Date:2020/12/24
 * @Description:
 * @Version 1.0
 */
@Controller
public class ViewController {
    @Autowired
    TFlightHandler tFlightHandler;
    @RequestMapping("/login")
    public String toLogin(){
        return "user_login";
    }
    @RequestMapping("/register")
    public String toRegister(){
        return "user_register";
    }
    @RequestMapping("/index")
    public String toIndex(Model model){

        List<TFlight> todayTflights = tFlightHandler.findTodayTflights();
        model.addAttribute("todaytFlightList", todayTflights);
        return "user_index";
    }
    
}
