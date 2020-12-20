package com.ctgu.airticket.controller;

import com.ctgu.airticket.entity.CommonResult;
import com.ctgu.airticket.entity.TCompany;
import com.ctgu.airticket.entity.TFlight;
import com.ctgu.airticket.repository.TCompanyRepository;
import com.ctgu.airticket.repository.TFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/company")
public class TCompanyHandler {
    @Autowired
    TCompanyRepository tCompanyRepository;
    /**
     * 增加一条航空公司信息
     */
    @GetMapping("/save")
    public String save(@RequestBody TCompany tCompany){
        TCompany result = tCompanyRepository.save(tCompany);
        if (result!=null){
            return "success";
        }else {
            return "error";
        }
    }
    @DeleteMapping("/deleteById")
    public String deleteById(@RequestBody TCompany tCompany){
        tCompanyRepository.deleteById(tCompany.getCid());
        return "success";
    }
    @PutMapping("/update")
    public String update(@RequestBody TCompany tCompany){
        TCompany result = tCompanyRepository.save(tCompany);
        if(result!= null){
            return "success";
        }else{
            return "error";
        }
    }
    @GetMapping("/findById")
    public TCompany findById(@RequestBody TCompany tCompany){
        Optional<TCompany> result = tCompanyRepository.findById(tCompany.getCid());
        if (result!=null) {
            return result.get();
        }else {
            return null;
        }
    }
    @GetMapping("/findAll")
    public CommonResult<List<TCompany>> findAll(@RequestParam("page") Integer page, @RequestParam("size") Integer size){
        PageRequest request = PageRequest.of(page-1,size);
        List<TCompany> content = tCompanyRepository.findAll(request).getContent();
        int count = (int)tCompanyRepository.count();
        return new CommonResult<>(200, "公司信息列表",count,content);
    }

}
