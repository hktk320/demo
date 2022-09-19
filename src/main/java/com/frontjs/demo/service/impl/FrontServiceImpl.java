package com.frontjs.demo.service.impl;

import com.frontjs.demo.object.UserDTO;
import com.frontjs.demo.service.FrontService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xianghansen
 * @create: 2022/9/7 22:04
 */
@Service
public class FrontServiceImpl implements FrontService {
    @Override
    public List<UserDTO> getUse(Integer num) {
        ArrayList<UserDTO> userDTOS = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            UserDTO userDTO = new UserDTO();
            userDTO.setUserName("小"+i);
            userDTO.setAge(i+1);
            userDTOS.add(userDTO);
        }
        return userDTOS;
    }
}
