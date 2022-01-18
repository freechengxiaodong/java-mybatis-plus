package com.example.demo;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@MapperScan("com.example.demo.mapper")
@SpringBootTest
public class TestMybatisPlusApplication {
    @Autowired
    private UserService userService;

    //手动填充
//    @Test
//    public void testUpdate() {
//        User user = new User();
//        user.setName("cxd").setAge(22).setEmail("cxd@163.com");
//        // 手动添加数据
//        user.setCreateTime(new Date()).setUpdateTime(new Date());
//        if (userService.save(user)) {
//            userService.list().forEach(System.out::println);
//        } else {
//            System.out.println("添加数据失败");
//        }
//    }

    //自动填充
//    @Test
//    public void testAutoFill() {
//        User user = new User();
//        user.setName("tom").setAge(20).setEmail("tom@163.com");
//        if (userService.save(user)) {
//            userService.list().forEach(System.out::println);
//        } else {
//            System.out.println("添加数据失败");
//        }
//    }

    //逻辑删除
//    @Test
//    public void testDelete() {
//        if (userService.removeById(1481565004302266370L)) {
//            System.out.println("删除数据成功");
//            userService.list().forEach(System.out::println);
//        } else {
//            System.out.println("删除数据失败");
//        }
//    }

//    //配置分页类
//    @Test
//    public void testPage() {
//        // Step1：创建一个 Page 对象
//        Page<User> page = new Page<>();
//        // Page<User> page = new Page<>(2, 5);
//        // Step2：调用 mybatis-plus 提供的分页查询方法
//        userService.page(page, null);
//        // Step3：获取分页数据
//        System.out.println(page.getCurrent()); // 获取当前页
//        System.out.println(page.getTotal()); // 获取总记录数
//        System.out.println(page.getSize()); // 获取每页的条数
//        System.out.println(page.getRecords()); // 获取每页数据的集合
//        System.out.println(page.getPages()); // 获取总页数
//        System.out.println(page.hasNext()); // 是否存在下一页
//        System.out.println(page.hasPrevious()); // 是否存在上一页
//    }

    //实现基于版本号的乐观锁
//    @Test
//    public void testVersion() {
//        User user = new User();
//        user.setName("tom").setAge(20).setEmail("tom@163.com");
//        userService.save(user);
//        userService.list().forEach(System.out::println);
//        user.setName("jarry");
//        userService.update(user, null);
//        userService.list().forEach(System.out::println);
//    }

    //查询构造器
//    @Test
//    public void testQueryWrapper() {
//        // Step1：创建一个 QueryWrapper 对象
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//
//        // Step2： 构造查询条件
//        queryWrapper
//                .select("id", "name", "age")
//                .eq("age", 20)
//                .like("name", "j");
//
//        // Step3：执行查询
//        userService
//                .list(queryWrapper)
//                .forEach(System.out::println);
//    }

    //自定义方法xxxMapper.xml
    @Test
    public void selectByUserid() {
        Long id = 1481565004302266370L;
        //List<User> users = userService.selectByUserid(id);
        List<User> users = userService.getAll();
        //List<User> users = userService.getAll2();
        System.out.println(users);
    }

}