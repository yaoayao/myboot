package com.test.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by yaoyao on 2016/12/1.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String test(Model model){
        return "index";
    }
    @RequestMapping("/save")
    @ResponseBody
    public String save(Model model,String select,String result) throws IOException {
        File file =new File("C:\\Users\\yaoyao\\Desktop\\test.txt");
        String data = "";
        if (select.equals("address")){
            data = "你的地址是:"+result;
        }else if (select.equals("phone")){
            data = "你的电话是:"+result;

        }else if (select.equals("date")){
            data = "你的生日是:"+result;

        }else if (select.equals("sex")){
            data = "你的性别是:"+result;

        }
        //if file doesnt exists, then create it
        if(!file.exists()){
            file.createNewFile();
        }

        //true = append file
        FileWriter fileWritter = new FileWriter(file.getAbsoluteFile(),true);
        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
        bufferWritter.write(data);
        bufferWritter.newLine();
        bufferWritter.close();
        return "{\"result\":\"success\"}";
    }
}
