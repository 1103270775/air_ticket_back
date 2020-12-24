package com.ctgu.airticket.controller;

import com.ctgu.airticket.entity.CommonResult;
import com.ctgu.airticket.entity.TUser;
import com.ctgu.airticket.repository.TUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Null;
import java.util.List;

/**
 *
 *
 * @author xzh
 * @since 2020-12-18 18:50
 */
@RestController
@RequestMapping("/user")
public class TUserHandler {
    @Autowired
    private TUserRepository tUserRepository;

    @GetMapping("/findAll")
    public CommonResult<List<TUser>> findAll(@RequestParam("page") Integer page, @RequestParam("size") Integer size){
        PageRequest request = PageRequest.of(page-1,size);
        List<TUser> content = tUserRepository.findAll(request).getContent();
        int count = (int)tUserRepository.count();
        return new CommonResult<>(200, "用户信息列表",count, content);
    }
    @GetMapping("/findById")
    public TUser findById(@RequestBody TUser tUser){
        return tUserRepository.findById(tUser.getUserid()).get();
    }

    @PostMapping("/save")
    public CommonResult<Null> save(@RequestBody TUser tUser){
        TUser result = tUserRepository.save(tUser);
        if(result != null){
            return new CommonResult<>(200, "success", 1, null);
        }else{
            return new CommonResult<>(200, "error", 0, null);
        }
    }
    @PostMapping("/register")
    public CommonResult<Null> register(@RequestBody TUser tUser){
        TUser result = tUserRepository.save(tUser);
        if(result != null){
            return new CommonResult<>(200, "success", 1, null);
        }else{
            return new CommonResult<>(200, "error", 0, null);
        }
    }


    @PutMapping("/update")
    public String update(@RequestBody TUser tUser){

        TUser result = tUserRepository.save(tUser);
        if(result != null){
            return "success";
        }else{
            return "error";
        }
    }

    @PostMapping("/login")
    public boolean login(@RequestBody TUser tUser, HttpServletRequest request){
        TUser result = tUserRepository.findByUsernameAndPassword(tUser.getUsername(),tUser.getPassword());
        if(result!=null){
            HttpSession session = request.getSession();
            session.setAttribute("userid", result.getUserid());
            session.setAttribute("userName", result.getUsername());
            session.setAttribute("nickName", result.getNickname());
            return true;
        }else{
            return false;
        }
    }
    @DeleteMapping("/deleteById")
    public void deleteById(@RequestBody TUser tUser){
        tUserRepository.deleteById(tUser.getUserid());
    }

}
