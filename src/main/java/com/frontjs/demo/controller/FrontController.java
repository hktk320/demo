package com.frontjs.demo.controller;

import com.frontjs.demo.object.UserDTO;
import com.frontjs.demo.object.req.FirstReq;
import com.frontjs.demo.service.FrontService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author: xianghansen
 * @create: 2022/9/7 21:17
 */
@RestController
@RequestMapping("/text")
public class FrontController {
    @Autowired
    FrontService frontService;

    @PostMapping("/hello")
    public List<UserDTO> getFirstText(@RequestBody FirstReq firstReq){
        List<UserDTO> userDTOS = frontService.getUse(firstReq.getNum());
        return userDTOS;
    }
}
