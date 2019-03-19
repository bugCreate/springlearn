package com.learn.jooq.springjooq.dao;

import lombok.*;

import java.sql.Timestamp;

/**
 * @description: ㄟ(▔, ▔)ㄏ
 * @author: pangtoutuo
 * @create: 2019-03-15
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ConfigInfoDao {

    private String id;
    private String name_space_id;
    private String config_name;
    private String config_group;
    private String app_name;
    private String label;
    private Timestamp created;
    private Timestamp modified;
    private String value;
    private String type;

}
