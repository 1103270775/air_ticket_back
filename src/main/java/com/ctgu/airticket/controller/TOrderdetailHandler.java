package com.ctgu.airticket.controller;


import com.ctgu.airticket.entity.CommonResult;
import com.ctgu.airticket.entity.TOrderdetail;
import com.ctgu.airticket.entity.TTicketorder;
import com.ctgu.airticket.repository.TOrderdetailRepository;
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
 * @since 2020-12-18 20:25
 */
@RestController
@RequestMapping("/orderdetail")
public class TOrderdetailHandler {
    @Autowired
    private TOrderdetailRepository tOrderdetailRepository;

    @GetMapping("/findAll")
    public CommonResult<List<TOrderdetail>> findAll(@RequestParam("page") Integer page, @RequestParam("size") Integer size) {
        PageRequest request = PageRequest.of(page-1, size);
        List<TOrderdetail> content = tOrderdetailRepository.findAll(request).getContent();
        int count = (int)tOrderdetailRepository.count();
        return new CommonResult<>(200,"订单详情表",count,content);
    }

    @GetMapping("/findById")
    public TOrderdetail findById(@RequestBody TOrderdetail tOrderdetail) {
        return tOrderdetailRepository.findById(tOrderdetail.getDetailid()).get();
    }

    @PostMapping("/save")
    public String save(@RequestBody TOrderdetail tOrderdetail) {
        TOrderdetail result = tOrderdetailRepository.save(tOrderdetail);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    @PutMapping("/update")
    public String update(@RequestBody TOrderdetail tOrderdetail){
        TOrderdetail result = tOrderdetailRepository.save(tOrderdetail);
        if(result != null){
            return "success";
        }else{
            return "error";
        }
    }
    @DeleteMapping("/deleteById")
    public void deleteById(@RequestBody TOrderdetail tOrderdetail){
        tOrderdetailRepository.deleteById(tOrderdetail.getDetailid());
    }
}
