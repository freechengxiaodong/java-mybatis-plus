package com.example.demo.service;

import com.example.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigInteger;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cxd
 * @since 2022-01-13
 */
public interface UserService extends IService<User> {
    public List<User> selectByUserid(Long userid);

    public List<User> getAll();
    public List<User> getAll2();
}
