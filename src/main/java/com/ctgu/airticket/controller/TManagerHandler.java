package com.ctgu.airticket.controller;

import com.ctgu.airticket.entity.CommonResult;
import com.ctgu.airticket.entity.TManager;
import com.ctgu.airticket.entity.TUser;
import com.ctgu.airticket.repository.TManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author xzh
 * @since 2020-12-18 20:49
 */
@RestController
@RequestMapping("/manager")
public class TManagerHandler {

    @Autowired
    private TManagerRepository tManagerRepository;

    /**
     * 分页查询所有管理员信息
     *
     * @param page
     * @param size
     * @return
     */

    @GetMapping("/findAll")
    public CommonResult<List<TManager>> findAll(@RequestParam("page") Integer page, @RequestParam("size") Integer size) {
        PageRequest request = PageRequest.of(page - 1, size);
        List<TManager> content = tManagerRepository.findAll(request).getContent();
        int count = (int) tManagerRepository.count();
        return new CommonResult<>(200, "管理人员表", count, content);
    }

    /**
     * 根据mid查询管理员信息
     *
     * @param tManager
     * @return
     */
    @GetMapping("/findById")
    public TManager findById(@RequestBody TManager tManager) {
        int id = tManager.getMid();
        return tManagerRepository.findById(id).get();
    }

    /**
     * 新增管理员信息
     *
     * @param tManager
     * @return
     */
    @PostMapping("/save")
    public String save(@RequestBody TManager tManager) {
        TManager result = tManagerRepository.save(tManager);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    /**
     * 更新管理员信息
     *
     * @param tManager
     * @return
     */
    @PutMapping("/update")
    public String update(@RequestBody TManager tManager) {

        TManager result = tManagerRepository.save(tManager);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    /**
     * 管理员登录检索管理员账号和密码
     *
     * @param tManager
     * @return
     */
    @PostMapping("/login")
    public boolean login(@RequestBody TManager tManager) {
        TManager result = tManagerRepository.findByUsernameAndPassword(tManager.getUsername(), tManager.getPassword());
        if (result != null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 根据mid删除该管理员信息
     *
     * @param tManager
     */
    @DeleteMapping("/deleteById")
    public void deleteById(@RequestBody TManager tManager) {
        int id = tManager.getMid();
        tManagerRepository.deleteById(id);
    }

}
