package com.sankan.habbcenter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sankan.habbcenter.model.User;

// 集成BaseMapper可以直接使用MyBatis中实现的增删改查接口
public interface UserMapper extends BaseMapper<User> {

}