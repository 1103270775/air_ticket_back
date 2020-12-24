package com.ctgu.airticket.controller;

import com.ctgu.airticket.entity.TFlight;
import com.ctgu.airticket.entity.TUser;
import com.ctgu.airticket.repository.TUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

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
    @Autowired
    TUserHandler tUserHandler;
    @Autowired
    TUserRepository tUserRepository;
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
    @RequestMapping("/search")
    public String toSearch(@RequestParam("fromcity") String fromcity, @RequestParam("tocity") String tocity, @RequestParam("fromdate") String fromdate, Model model){
        List<TFlight> tflights = tFlightHandler.findByCityandDate(fromcity, tocity, fromdate);
        model.addAttribute("tFlightList", tflights);
        return "user_search_in";
    }

    @RequestMapping("/myInfo")
    public String toMyInfo(HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        int userName = (int)session.getAttribute("userId");
        Optional<TUser> optional = tUserRepository.findById(userName);
        TUser tUser = optional.get();
        model.addAttribute("myInfo", tUser);
        return "user_my_message";
    }

    
}
