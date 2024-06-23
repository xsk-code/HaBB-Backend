package com.sankan.habbcenter.service;

import com.sankan.habbcenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
 * 用户服务
 *
* @author XSK
* @description 针对表【user(用户表)】的数据库操作Service
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    public long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request 用于从session中读写信息
     * @return 脱敏后的用户信息
     */
    public User userLogin(String userAccount, String userPassword, HttpServletRequest request);
}
