package com.ctgu.airticket.controller;

import com.ctgu.airticket.entity.TFlight;
import com.ctgu.airticket.entity.TTicketorder;
import com.ctgu.airticket.entity.TUser;
import com.ctgu.airticket.repository.TFlightRepository;
import com.ctgu.airticket.repository.TTicketorderRepository;
import com.ctgu.airticket.repository.TUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    TUserRepository tUserRepository;
    @Autowired
    TFlightRepository tFlightRepository;
    @Autowired
    TTicketorderRepository tTicketorderRepository;

    /**
     * 登录页面跳转控制
     *
     * @return
     */
    @RequestMapping("/login")
    public String toLogin() {
        return "user_login";
    }

    /**
     * 注册页面跳转控制
     *
     * @return
     */
    @RequestMapping("/register")
    public String toRegister() {
        return "user_register";
    }

    /**
     * 主页跳转控制
     *
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String toIndex(Model model) {

        List<TFlight> todayTflights = tFlightHandler.findTodayTflights();
        model.addAttribute("todaytFlightList", todayTflights);
        return "user_index";
    }

    /**
     * 航班搜索页面跳转控制
     *
     * @param fromcity
     * @param tocity
     * @param fromdate
     * @param model
     * @return
     */
    @RequestMapping("/search")
    public String toSearch(@RequestParam("fromcity") String fromcity, @RequestParam("tocity") String tocity, @RequestParam("fromdate") String fromdate, Model model) {
        List<TFlight> tflights = tFlightHandler.findByCityandDate(fromcity, tocity, fromdate);
        model.addAttribute("tFlightList", tflights);
        return "user_search_in";
    }

    /**
     * 个人信息页面跳转控制
     *
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/myInfo")
    public String toMyInfo(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        int userId;
        if (session.getAttribute("userId")==null) {
            return "redirect:/login";
        }else {
            userId =(int)session.getAttribute("userId");
        }

        Optional<TUser> optional = tUserRepository.findById(userId);
        TUser tUser = optional.get();
        model.addAttribute("myInfo", tUser);
        return "user_my_message";
    }

    /**
     * 我的订单页面跳转控制
     *
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/myOrder")
    public String toMyOrder(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        int userId;
        if (session.getAttribute("userId")==null) {
            return "redirect:/login";
        }else {
            userId =(int)session.getAttribute("userId");
        }
        List<TTicketorder> ticketOrderList = tTicketorderRepository.findAllByUid(userId);
        model.addAttribute("orderList", ticketOrderList);
        return "user_myorders";
    }

    /**
     * 更新个人信息方法控制
     *
     * @param tUser
     * @param request
     * @return
     */
    @PostMapping("/updateInfo")
    public String updateInfo(TUser tUser, HttpServletRequest request) {
        HttpSession session = request.getSession();
        int userId = (int) session.getAttribute("userId");
        String userName = (String) session.getAttribute("userName");
        tUser.setUserid(userId);
        tUser.setUsername(userName);
        if (tUser.getNickname().isEmpty()) {
            session.setAttribute("nickName", null);
        } else {
            session.setAttribute("nickName", tUser.getNickname());
        }
        Optional<TUser> user = tUserRepository.findById(userId);
        String passWord = user.get().getPassword();
        tUser.setPassword(passWord);
        TUser result = tUserRepository.save(tUser);
        if (result != null) {
            return "redirect:/myInfo";
        } else {
            return "error";
        }
    }

    /**
     * 订单填写页面逻辑控制
     *
     * @param fid
     * @param spaceType
     * @param model
     * @return
     */
    @GetMapping("/orderFill")
    public String toOrder(@RequestParam("fid") int fid, @RequestParam("spaceType") String spaceType, Model model) {
        Optional<TFlight> opt = tFlightRepository.findById(fid);
        TFlight tFlight = opt.get();
        model.addAttribute("flight", tFlight);
        model.addAttribute("spaceType", spaceType);
        return "user_order_add";
    }
}
