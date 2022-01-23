package com.atguigu.gulimall.product.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Catalog2VO implements Serializable {
    //父分类id
    private String catalog1Id; // 父类一级id

    private String id; // 当前二级分类id

    private String name;

    private List<Catalog3VO> catalog3List;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Catalog3VO implements Serializable {
        private String catalog2Id; // 父类二级id
        private String id; // 当前三类分类id
        private String name;
    }
}
