package com.atguigu.gulimall.product.vo;

import lombok.Data;

@Data
public class AttrRespVO extends AttrVO {


    private String groupName;

    private Long[] catelogPath;

    private String catelogName;
}
