package org.gary.webproject.controller;

import com.alibaba.fastjson.JSONObject;
import org.gary.webproject.service.DB1Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: gary kwok
 * @Date: 2019/11/25 11:00
 */
@Controller
@RequestMapping("/")
public class MainController {
    private static Logger logger = LoggerFactory.getLogger(MainController.class);


    @GetMapping("/")
    public String index(Model model){
        return "/pages/main/index";
    }
}
