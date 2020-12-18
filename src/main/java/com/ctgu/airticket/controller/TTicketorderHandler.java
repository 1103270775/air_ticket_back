package com.ctgu.airticket.controller;

import com.ctgu.airticket.entity.TTicketorder;
import com.ctgu.airticket.repository.TTicketorderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/findAll/{page}/{size}")
    public Page<TTicketorder> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageRequest request = PageRequest.of(page, size);
        return tTicketorderRepository.findAll(request);
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


