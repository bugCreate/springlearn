package com.learn.jooq.springjooq.repo;

import com.learn.jooq.springjooq.dao.ConfigInfoDao;
import com.learn.jooq.springjooq.dao.ConfigInfoWithJPAAnnotated;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.learn.jooq.springjooq.record.ConfigInfoFields.*;

/**
 * @description: ㄟ(▔, ▔)ㄏ
 * @author: pangtoutuo
 * @create: 2019-03-19
 **/
@Service
public class ConfigInfoRepo {
    @Autowired
    DSLContext dsl;

    /**
     * 可以选择字段
     */
    public void insertWithMap(ConfigInfoDao configInfoDao) {
        Map values = new HashMap<>();
        values.put(ID_FIELD, configInfoDao.getId());
        values.put(NAME__SPACE__ID_FIELD, configInfoDao.getName_space_id());
        values.put(CONFIG__GROUP_FIELD, configInfoDao.getConfig_group());
        values.put(CONFIG__NAME_FIELD, configInfoDao.getConfig_name());
        values.put(APP__NAME_FIELD, configInfoDao.getApp_name());
        values.put(LABEL_FIELD, configInfoDao.getLabel());
        values.put(CREATED_FIELD, configInfoDao.getCreated());
        values.put(MODIFIED_FIELD, configInfoDao.getModified());
        values.put(VALUE_FIELD, configInfoDao.getValue());
        values.put(TYPE_FIELD, configInfoDao.getType());

        dsl.insertInto(TABLE_T).set(values).execute();

    }

    public ConfigInfoDao query(String group, String name, String appname, String label) {

        ArrayList<Condition> conditions = new ArrayList<>();
        conditions.add(CONFIG__GROUP_FIELD.eq(group));
        conditions.add(CONFIG__NAME_FIELD.eq(name));
        conditions.add(APP__NAME_FIELD.eq(appname));
        conditions.add(LABEL_FIELD.eq(label));
        return dsl.select(VALUE_FIELD).from(TABLE_T).where(conditions).fetchAny().into(ConfigInfoDao.class);

    }

    public ConfigInfoWithJPAAnnotated query2(String group, String name, String appname, String label) {

        ArrayList<Condition> conditions = new ArrayList<>();
        conditions.add(CONFIG__GROUP_FIELD.eq(group));
        conditions.add(CONFIG__NAME_FIELD.eq(name));
        conditions.add(APP__NAME_FIELD.eq(appname));
        conditions.add(LABEL_FIELD.eq(label));
        return dsl.select(VALUE_FIELD).from(TABLE_T).where(conditions).fetchAny().into(ConfigInfoWithJPAAnnotated.class);

    }

}
