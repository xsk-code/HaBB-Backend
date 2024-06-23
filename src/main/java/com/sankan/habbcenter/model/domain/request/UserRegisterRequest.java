package com.sankan.habbcenter.model.domain.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author XSK
 */
@Data
public class UserRegisterRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L; // 防止序列化过程中出现冲突

    private String userAccount;
    private String userPassword;
    private String checkPassword;
}
