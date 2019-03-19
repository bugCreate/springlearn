package com.learn.jooq.springjooq.record;

import org.jooq.Field;
import org.jooq.Table;

import java.sql.Timestamp;

import static org.jooq.impl.DSL.*;
import static org.jooq.impl.SQLDataType.TIMESTAMP;
import static org.jooq.impl.SQLDataType.VARCHAR;

/**
 * @description: ㄟ(▔, ▔)ㄏ
 * @author: pangtoutuo
 * @create: 2019-03-19
 **/
public interface ConfigInfoFields {
    Table<?> TABLE_T = table("\"config_info\"");

    Field<String> ID_FIELD = field(name("id"), VARCHAR(36));
    Field<String> NAME__SPACE__ID_FIELD = field(name("name_space_id"), VARCHAR(36));
    Field<String> CONFIG__NAME_FIELD = field(name("config_name"), VARCHAR(128));
    Field<String> CONFIG__GROUP_FIELD = field(name("config_group"), VARCHAR(128));
    Field<String> APP__NAME_FIELD = field(name("app_name"), VARCHAR(128));
    Field<String> LABEL_FIELD = field(name("label"), VARCHAR(128));
    Field<Timestamp> CREATED_FIELD = field(name("created"), TIMESTAMP);
    Field<Timestamp> MODIFIED_FIELD = field(name("modified"), TIMESTAMP);
    Field<String> VALUE_FIELD = field(name("value"), String.class);
    Field<String> TYPE_FIELD = field(name("type"), VARCHAR(64));

}
