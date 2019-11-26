package org.gary.webproject.service;

import com.alibaba.fastjson.JSONObject;
import org.gary.webproject.mapper.db1.DB1Table1Mapper;
import org.gary.webproject.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @Author: gary kwok
 * @Date: 2019/11/25 11:09
 */
@Service
public class DB1Service {
    private static Logger logger = LoggerFactory.getLogger(DB1Service.class);

    @Resource
    DB1Table1Mapper db1Table1Mapper;

    public JSONObject queryTable1(String id){
        return db1Table1Mapper.queryTable1(id);
    }

    public List<JSONObject> queryTable1List(JSONObject params){
        return db1Table1Mapper.queryTable1List(params);
    }

    @Transactional(transactionManager = "db1TransactionManager")
    public void testTransaction(){
        UUID uuid = UUID.randomUUID();
        String uuidStr = uuid.toString();
        logger.info("uuid:"+uuidStr);
        JSONObject params1 = new JSONObject();
        params1.put("pwd",uuidStr);
        params1.put("name","user1");
        db1Table1Mapper.testTransaction(params1);
        logger.info("update 1");
        // Trigger exception and rollback
        JSONObject params2 = new JSONObject();
        params2.put("pwd", uuidStr.concat(DateUtils.getDate("yyyyMMddhhmmssS")));
        params2.put("name","user2");
        db1Table1Mapper.testTransaction(params2);
        logger.info("update 2");
    }
}
