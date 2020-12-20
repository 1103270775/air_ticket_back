package com.ctgu.airticket.controller;

import com.ctgu.airticket.entity.CommonResult;
import com.ctgu.airticket.entity.TFlight;
import com.ctgu.airticket.entity.TUser;
import com.ctgu.airticket.repository.TFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import javax.websocket.server.PathParam;
import java.util.List;
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
    public CommonResult<Null> save(@RequestBody TFlight tFlight){
        TFlight save = tFlightRepository.save(tFlight);
        if (save!=null){
            return new CommonResult<>(200, "success", 1, null);
        }else {
            return new CommonResult<>(200, "error", 1, null);
        }
    }
    @DeleteMapping("/deleteById")
    public CommonResult<Null> deleteById(@RequestBody TFlight tFlight){
        tFlightRepository.deleteById(tFlight.getFid());
        return new CommonResult<>(200, "success", 1, null);
    }
    @PutMapping("/update")
    public CommonResult<Null> update(@RequestBody TFlight tFlight){
        TFlight result = tFlightRepository.save(tFlight);
        if(result!= null){
            return new CommonResult<>(200, "success", 1, null);
        }else{
            return new CommonResult<>(200, "error", 1, null);
        }
    }
    @GetMapping("/findById")
    public CommonResult<TFlight> findById(@RequestBody TFlight tFlight){
        Optional<TFlight> result = tFlightRepository.findById(tFlight.getFid());
        if (result!=null) {
            return new CommonResult<>(200, "success", 1, result.get());
        }else {
            return new CommonResult<>(200, "error", 1, null);
        }
    }
    @GetMapping("/findAll")
    public CommonResult<List<TFlight>> findAll(@PathParam("page") Integer page, @PathParam("size") Integer size){
        PageRequest request = PageRequest.of(page-1,size);
        List<TFlight> content = tFlightRepository.findAll(request).getContent();
        int count=(int)tFlightRepository.count();
        return new CommonResult<>(200, "航班信息列表", count, content);
    }

}
