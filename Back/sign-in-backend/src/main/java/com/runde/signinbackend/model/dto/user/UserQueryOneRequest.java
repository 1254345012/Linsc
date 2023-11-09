package com.runde.signinbackend.model.dto.user;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @BelongsProject sign-in-backend
 * @BelongsPackage com.runde.signinbackend.model.dto.user
 * @Author 最紧要开心
 * @CreateTime 2023/11/9 10:00
 * @Description 用户查询单个请求
 * @Version 1.0
 */
@Getter
@Setter
public class UserQueryOneRequest implements Serializable {

    /**
     * 微信 UnionId
     */
    private String unionId;

    /**
     * 微信 OpenId
     */
    private String openId;

    /**
     * 账号
     */
    private String account;

    private static final long serialVersionUID = 1L;
}