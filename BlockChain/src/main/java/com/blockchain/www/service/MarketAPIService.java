package com.blockchain.www.service;

import org.apache.http.HttpException;

import java.io.IOException;

/**
 * 交易所行情API
 * Created by zhijiansha on 2017-7-6.
 */
public interface MarketAPIService {

    /**
     * 行情
     * type 交易所类型 见ExchangeConstants
     * @param symbol btc:比特币    ltc:莱特币
     */
    public String ticker(String symbol, Integer type) throws HttpException, IOException;

    /**
     * 市场深度
     * type 交易所类型
     * @param symbol btc:比特币    ltc:莱特币
     */
    public String depth(String symbol, Integer type) throws HttpException, IOException;

    /**
     * 现货历史交易信息
     * type 交易所类型
     * @param symbol btc:比特币    ltc:莱特币
     * @param since 不加since参数时，返回最近的60笔交易
     */
    public String trades(String symbol, String since, Integer type) throws HttpException, IOException;

}
