package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cxd
 * @since 2022-01-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    UserMapper userMapper;
    public List<User> selectByUserid(Long userid){
        return userMapper.selectByUserid(userid);
    }

    public List<User> getAll(){return userMapper.getAll();}
    public List<User> getAll2(){return userMapper.getAll2();}
}
