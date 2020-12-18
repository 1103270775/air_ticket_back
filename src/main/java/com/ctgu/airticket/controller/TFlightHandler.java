package com.ctgu.airticket.controller;

import com.ctgu.airticket.entity.TFlight;
import com.ctgu.airticket.entity.TUser;
import com.ctgu.airticket.repository.TFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

/**
 * @Author:Mr.zhou
 * @Package:com.ctgu.airticket.controller
 * @Date:2020/12/18
 * @Description:
 * @Version 1.0
 */
@RestController
@RequestMapping("/flight")
public class TFlightHandler {
    @Autowired
    TFlightRepository tFlightRepository;
    //增加一条航班信息
    @PostMapping("/save")
    public String save(@RequestBody TFlight tFlight){
        TFlight save = tFlightRepository.save(tFlight);
        if (save!=null){
            return "success";
        }else {
            return "error";
        }
    }
    @DeleteMapping("/deleteById")
    public String deleteById(@RequestBody TFlight tFlight){
        tFlightRepository.deleteById(tFlight.getFid());
        return "success";
    }
    @PutMapping("/update")
    public String update(@RequestBody TFlight tFlight){
        TFlight result = tFlightRepository.save(tFlight);
        if(result!= null){
            return "success";
        }else{
            return "error";
        }
    }
    @GetMapping("/findById")
    public TFlight findById(@RequestBody TFlight tFlight){
        Optional<TFlight> result = tFlightRepository.findById(tFlight.getFid());
        if (result!=null) {
            return result.get();
        }else {
            return null;
        }
    }
    @GetMapping("/findAll/{page}/{size}")
    public Page<TFlight> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request = PageRequest.of(page,size);
        return tFlightRepository.findAll(request);
    }

}
