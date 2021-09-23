package com.xiexin.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiexin.bean.TBusiness;
import com.xiexin.service.TBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TBusinessController {

    @Autowired
    private TBusinessService tBusinessService;


    @RequestMapping("/selectTwoTable")
    //没这个注解，不返回前端的json数据
    @ResponseBody
    public Map selectTwoTable(){

        List<Map> maps = tBusinessService.seelctTwoTable();

        Map codemap=new HashMap();

        codemap.put("code",0);
        codemap.put("data",maps);

        return  codemap;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Map insert( @RequestBody TBusiness tBusiness){

        Map codeMap =new HashMap();


        int i = tBusinessService.insertSelective(tBusiness);
        if (i == 1) {
            codeMap.put("code",0);
            codeMap.put("msg","添加成功");



        }else{
            codeMap.put("code",400);
            codeMap.put("msg","添加失败");
        }


return codeMap;
    }

    //分页
    @ResponseBody
    @RequestMapping("/delectBypage")
    public Map delectBypage (@RequestParam(defaultValue = "1",required = true,name="page") Integer page, @RequestParam(defaultValue = "3",required = true,name="pageSize")Integer pageSize ){

        //该分页可以多表查询
        //分页的第一种方法 仅限于mybaits
        //使用的是pageHelper 分页 基于aop拦截器
        //page 是当行页，默认值是1
        PageHelper.startPage(page,pageSize);
        List<TBusiness> tBusinesses = tBusinessService.selectByExample(null);
        PageInfo<TBusiness> tBusinessPageInfo = new PageInfo<>(tBusinesses);
        long total = tBusinessPageInfo.getTotal();

        Map codeMap=new HashMap();
        codeMap.put("code",0);
        codeMap.put("data",tBusinessPageInfo);
        codeMap.put("total",total);
        return codeMap;

    }
}
