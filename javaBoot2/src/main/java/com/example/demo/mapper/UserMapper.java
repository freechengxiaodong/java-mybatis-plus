package com.example.demo.mapper;

import com.example.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cxd
 * @since 2022-01-13
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    List<User> selectByUserid(@Param("userid") Long userid);

    @Select("SELECT u.id as cid,u.name,h.uid,h.adress FROM test_mybatis_plus_user as u join home as h where u.id = h.uid")
    List<User> getAll();

    List<User> getAll2();
}
