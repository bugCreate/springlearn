package com.learn.jooq.springjooq.dao;

import lombok.*;

import javax.persistence.Column;
import java.sql.Timestamp;

/**
 * @description: ㄟ(▔, ▔)ㄏ
 * @author: pangtoutuo
 * @create: 2019-03-19
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ConfigInfoWithJPAAnnotated {

    @Column
    private String id;
    @Column(name = "name_space_id")
    private String nameSpaceId;
    @Column(name = "config_name")
    private String configName;
    @Column(name = "config_group")
    private String configGroup;
    @Column(name = "app_name")
    private String appName;
    @Column(name = "label")
    private String label;
    @Column(name = "created")
    private Timestamp created;
    @Column(name = "modified")
    private Timestamp modified;
    @Column(name = "value")
    private String value;
    @Column(name = "type")
    private String type;
}
