package com.frontjs.demo.service;

import com.frontjs.demo.object.UserDTO;

import java.util.List;

/**
 * @author: xianghansen
 * @create: 2022/9/7 22:03
 */
public interface FrontService {
  public List<UserDTO> getUse(Integer num);
}
