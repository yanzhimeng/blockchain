package com.blockchain.www.service.impl;

import com.blockchain.www.service.MarketPriceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zhijiansha on 2017-7-12.
 */
@Service
@Transactional(rollbackFor =Exception.class)
public class MarketPriceServiceImpl implements MarketPriceService {

    public String testMethod(String s1) {

        return s1+"测试";
    }


}
