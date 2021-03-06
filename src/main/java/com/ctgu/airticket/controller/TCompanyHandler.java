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

import javax.validation.constraints.Null;
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
     * @param tCompany
     * @return
     */
    @PostMapping("/save")
    public CommonResult<Null> save(@RequestBody TCompany tCompany){
        TCompany result = tCompanyRepository.save(tCompany);
        if (result!=null){
            return new CommonResult<>(200, "success", 1, null);
        }else {
            return new CommonResult<>(200, "error", 1, null);
        }
    }

    /**
     * 根据cid删除一条航空公司信息
     * @param tCompany
     * @return
     */
    @DeleteMapping("/deleteById")
    public CommonResult<Null> deleteById(@RequestBody TCompany tCompany){
        tCompanyRepository.deleteById(tCompany.getCid());
        return new CommonResult<>(200, "success", 1, null);
    }

    /**
     * 更新航空公司信息
     * @param tCompany
     * @return
     */
    @PutMapping("/update")
    public CommonResult<Null> update(@RequestBody TCompany tCompany){
        TCompany result = tCompanyRepository.save(tCompany);
        if(result!= null){
            return new CommonResult<>(200, "success", 1, null);
        }else{
            return new CommonResult<>(200, "error", 1, null);
        }
    }

    /**
     * 根据cid查看航空公司信息
     * @param tCompany
     * @return
     */
    @GetMapping("/findById")
    public CommonResult<TCompany> findById(@RequestBody TCompany tCompany){
        Optional<TCompany> result =  tCompanyRepository.findById(tCompany.getCid());
        if (result!=null) {
            return new CommonResult<>(200, "success", 1, result.get());
        }else {
            return new CommonResult<>(200, "error", 1, null);
        }
    }

    /**
     * 分页查询航空公司信息
     * @param page
     * @param size
     * @return
     */
    @GetMapping("/findAll")
    public CommonResult<List<TCompany>> findAll(@RequestParam("page") Integer page, @RequestParam("size") Integer size){
        PageRequest request = PageRequest.of(page-1,size);
        List<TCompany> content = tCompanyRepository.findAll(request).getContent();
        int count = (int)tCompanyRepository.count();
        return new CommonResult<>(200, "公司信息列表",count,content);
    }

}
