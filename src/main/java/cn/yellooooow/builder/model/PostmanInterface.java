package cn.yellooooow.builder.model;

import lombok.Data;

import java.util.List;

/**
 * @author yellooooow
 * @since 2021/12/10 17:32
 */
@Data
public class PostmanInterface {

    // collection的基础信息
    private Info info;

    //
    private List<PostmanItem> item;

    /*
    * collection的基础信息
    * */
    @Data
    public static class Info {

        // collection标识id -> uuid生成
        private String _postman_id;

        // collection 名称
        private String name;

        // collection 描述
        private String description;

        // 格式校验规范网址 官方: https://schema.getpostman.com/json/collection/v2.1.0/collection.json
        private String schema;

    }

}
