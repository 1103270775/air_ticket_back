package com.ctgu.airticket.controller;

import com.ctgu.airticket.entity.CommonResult;
import com.ctgu.airticket.entity.TTicketorder;
import com.ctgu.airticket.repository.TTicketorderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 *
 * @author xzh
 * @since 2020-12-18 18:50
 */
@RestController
@RequestMapping("/ticketorder")
public class TTicketorderHandler {
    @Autowired
    private TTicketorderRepository tTicketorderRepository;

    @GetMapping("/findAll")
    public CommonResult<List<TTicketorder>> findAll(@RequestParam("page") Integer page, @RequestParam("size") Integer size) {
        PageRequest request = PageRequest.of(page-1, size);
        List<TTicketorder> content = tTicketorderRepository.findAll(request).getContent();
        int count = (int)tTicketorderRepository.count();
        return new CommonResult<>(200,"订单表显示",count,content);
    }

    @GetMapping("/findById")
    public TTicketorder findById(@RequestBody TTicketorder tTicketorder) {
        return tTicketorderRepository.findById(tTicketorder.getOrderid()).get();
    }

    @PostMapping("/save")
    public String save(@RequestBody TTicketorder tTicketorder) {
        TTicketorder result = tTicketorderRepository.save(tTicketorder);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    @PutMapping("/update")
    public String update(@RequestBody TTicketorder tTicketorder){
        TTicketorder result = tTicketorderRepository.save(tTicketorder);
        if(result != null){
            return "success";
        }else{
            return "error";
        }
    }
    @DeleteMapping("/deleteById")
    public void deleteById(@RequestBody TTicketorder tTicketorder){
        tTicketorderRepository.deleteById(tTicketorder.getOrderid());
    }

}


