package com.sankan.habbcenter.service;

import com.sankan.habbcenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

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

    /**
     * 对用户信息进行脱敏
     *
     * @param originUser 脱敏前的用户信息
     * @return 脱敏后的用户信息
     */
    public User getSaftyUser(User originUser);

    /**
     * 根据标签搜索用户 内存查询版
     *
     * @param tagNameList 用户需要拥有的标签列表
     * @return
     */
    public List<User> searchUserByTagsByMem(List<String> tagNameList);
}
