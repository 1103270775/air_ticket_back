package com.ctgu.airticket.controller;

import com.ctgu.airticket.entity.TUser;
import com.ctgu.airticket.repository.TUserRepository;
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
@RequestMapping("/tuser")
public class TUserHandler {
    @Autowired
    private TUserRepository tUserRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<TUser> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request = PageRequest.of(page,size);
        return tUserRepository.findAll(request);
    }
    @GetMapping("/findById/{userid}")
    public TUser findById(@PathVariable("userid") Integer id){
        return tUserRepository.findById(id).get();
    }

    @PostMapping("/save")
    public String save(@RequestBody TUser tUser){
        TUser result = tUserRepository.save(tUser);
        if(result != null){
            return "success";
        }else{
            return "error";
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
//    @PostMapping("/login")
//    public boolean login(@RequestParam(value = "username")String username,@RequestParam(value = "password")String password){
//        TUser result = tUserRepository.findByUsernameAndPassword(username,password);
//        if(result!=null){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
    @PostMapping("/login")
    public boolean login(@RequestBody TUser tUser){
        TUser result = tUserRepository.findByUsernameAndPassword(tUser.getUsername(),tUser.getPassword());
        if(result!=null){
            return true;
        }else{
            return false;
        }
    }
    @DeleteMapping("/deleteById/{userid}")
    public void deleteById(@PathVariable("userid") Integer id){
        tUserRepository.deleteById(id);
    }

}
