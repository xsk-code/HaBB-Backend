package com.sankan.habbcenter.model.domain.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author XSK
 */
@Data
public class UserLoginRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L; // 防止序列化过程中出现冲突

    private String userAccount;
    private String userPassword;
}