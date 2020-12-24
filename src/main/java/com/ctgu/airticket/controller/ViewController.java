package com.ctgu.airticket.controller;

import com.ctgu.airticket.entity.TFlight;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.websocket.server.PathParam;

/**
 * @Author:Mr.zhou
 * @Package:com.ctgu.airticket.controller
 * @Date:2020/12/24
 * @Description:
 * @Version 1.0
 */
@Controller
public class ViewController {
    @RequestMapping("/index")
    public String toIndex(){
        return "user_index";
    }
    @RequestMapping("/toSearch.do")
    public String toSearch(@PathParam("fromcity") String fromcity, @PathParam("tocity") String tocity, @PathParam("date") String date, Model model){
        TFlight tFlight=new TFlight();
        tFlight.setFromcity(fromcity);
        tFlight.setTocity(tocity);
        model.addAttribute("tflight",tFlight);
        model.addAttribute("fromdate", date);
        return "user_search_test";
    }
}
