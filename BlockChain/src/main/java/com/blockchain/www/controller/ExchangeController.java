package com.blockchain.www.controller;

import com.blockchain.www.service.MarketAPIService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by zhijiansha on 2017-7-7.
 */

@Controller
@RequestMapping("/exchange")
public class ExchangeController {

    @Resource
    private MarketAPIService marketAPIService;


    @RequestMapping("/toBitCoin")
    public String toBitCoin(Model model)throws Exception{
        model.addAttribute("name","yanzhimeng");
        return "exchange";
    }

    @RequestMapping("/detail")
    public String toBitCoin(Model model,String s1,String s2)throws Exception{
        model.addAttribute("s1",s1);
        model.addAttribute("s2",s2);
        return "detail";
    }



}
