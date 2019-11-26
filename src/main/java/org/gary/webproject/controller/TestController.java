package org.gary.webproject.controller;

import com.alibaba.fastjson.JSONObject;
import org.gary.webproject.service.DB1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: gary kwok
 * @Date: 2019/11/25 17:00
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    DB1Service db1Service;


    @RequestMapping(value = "/querylist", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String queryList(@RequestBody(required = false) JSONObject params) {
        JSONObject resJson = new JSONObject();
        List<JSONObject> list= db1Service.queryTable1List(params);
        resJson.put("items",list);
        return resJson.toJSONString();
    }


    @RequestMapping(value = "/testtransaction", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String testTransaction(@RequestBody(required = false) JSONObject params) {
        JSONObject resJson = new JSONObject();
        db1Service.testTransaction();
        return resJson.toJSONString();
    }



}
