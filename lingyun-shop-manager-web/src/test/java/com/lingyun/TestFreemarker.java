package com.lingyun;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

public class TestFreemarker {
    public static void main(String[] args) throws IOException, TemplateException {
        //1.创建配置类
        Configuration configuration = new Configuration(Configuration.getVersion());
        //2.设置模板所在的目录
        configuration.setDirectoryForTemplateLoading(new File("D:\\IdeaProjects\\lingyunshop\\lingyun-shop-manager-web\\src\\main\\resources\\templates\\admin"));
        //3.设置字符集
        configuration.setDefaultEncoding("utf-8");
        //4.加载模板
        Template template = configuration.getTemplate("test.ftl");
        //5.创建数据模型
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "上官飞燕");
        map.put("message", "来自电视剧《少年包青天》");
        map.put("success", true);

        List goodsList = new ArrayList();
        Map map1 = new HashMap();
        map1.put("name", "苹果");
        map1.put("price", "10");
        Map map2 = new HashMap();
        map2.put("name", "香蕉");
        map2.put("price", "12");
        Map map3 = new HashMap();
        map3.put("name", "无花果");
        map3.put("price", "20");
        goodsList.add(map1);
        goodsList.add(map2);
        goodsList.add(map3);
        map.put("goodsList", goodsList);
        map.put("today", new Date());
        map.put("point", 102920122);
        map.put("bbbb", "123456");


        //6.创建Writer对象
        Writer writer = new FileWriter(new File("D:\\template\\test.html"));
        //7.输出
        template.process(map, writer);
        writer.close();
    }
}
