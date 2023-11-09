package com.runde.signinbackend.common;

import com.runde.signinbackend.constant.CommonConstant;
import lombok.Data;

/**
 * @BelongsProject sign-in-backend
 * @BelongsPackage com.runde.signinbackend.common
 * @Author 最紧要开心
 * @CreateTime 2023/11/1 20:53
 * @Description 分页请求
 * @Version 1.0
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private Long current = 1L;

    /**
     * 页面大小
     */
    private Long pageSize = 10L;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认升序）
     */
    private String sortOrder = CommonConstant.SORT_ORDER_ASC;
}
