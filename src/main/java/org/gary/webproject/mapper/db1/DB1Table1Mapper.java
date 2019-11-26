package org.gary.webproject.mapper.db1;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author: gary kwok
 * @Date: 2019/11/25 11:02
 */
@Mapper
public interface DB1Table1Mapper {
    @Select("select * from table1 where id=#{id}")
    JSONObject queryTable1(String id);

    List<JSONObject> queryTable1List(JSONObject params);

    @Update("update table1 set pwd=#{pwd} where name=#{name}")
    void testTransaction(JSONObject params);
}
