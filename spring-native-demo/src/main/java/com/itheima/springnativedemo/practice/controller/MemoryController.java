package com.itheima.springnativedemo.practice.controller;

import com.itheima.springnativedemo.practice.entity.User;
import com.itheima.springnativedemo.practice.entity.UserDetails;
import com.itheima.springnativedemo.practice.service.UserService;
import com.itheima.springnativedemo.practice.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/memory")
public class MemoryController {

    private List list = new ArrayList();

    @GetMapping
    public List<UserVO> memory() throws InterruptedException {
        while (true){
            list.add(new byte[1024 * 1024 * 100]);
            Thread.sleep(1000L);
        }
    }

}
