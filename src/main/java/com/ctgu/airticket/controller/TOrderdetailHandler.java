package com.ctgu.airticket.controller;


import com.ctgu.airticket.entity.TOrderdetail;
import com.ctgu.airticket.entity.TTicketorder;
import com.ctgu.airticket.repository.TOrderdetailRepository;
import com.ctgu.airticket.repository.TTicketorderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

/**
 *
 *
 * @author xzh
 * @since 2020-12-18 20:25
 */
@RestController
@RequestMapping("/torderdetail")
public class TOrderdetailHandler {
    @Autowired
    private TOrderdetailRepository tOrderdetailRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<TOrderdetail> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageRequest request = PageRequest.of(page, size);
        return tOrderdetailRepository.findAll(request);
    }

    @GetMapping("/findById/{detailid}")
    public TOrderdetail findById(@PathVariable("detailid") Integer id) {
        return tOrderdetailRepository.findById(id).get();
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
    @DeleteMapping("/deleteById/{detailid}")
    public void deleteById(@PathVariable("detailid") Integer id){
        tOrderdetailRepository.deleteById(id);
    }
}
