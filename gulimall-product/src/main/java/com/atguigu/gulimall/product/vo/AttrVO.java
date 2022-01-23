package com.atguigu.gulimall.product.vo;

import com.atguigu.gulimall.product.entity.AttrEntity;
import lombok.Data;

@Data
public class AttrVO extends AttrEntity {

    // 分组属性
    private Long attrGroupId;
}
