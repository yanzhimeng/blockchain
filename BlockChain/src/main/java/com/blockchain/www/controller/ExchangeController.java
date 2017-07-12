package com.blockchain.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhijiansha on 2017-7-7.
 */

@Controller
@RequestMapping("/exchange")
public class ExchangeController {

    @RequestMapping("/toBitCoin")
    public String toBitCoin(Model model)throws Exception{
        model.addAttribute("name","yanzhimeng");
        return "exchange";
    }




}
