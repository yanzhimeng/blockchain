package com.blockchain.www.service.impl;

import com.blockchain.www.service.MarketAPIService;
import org.apache.http.HttpException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * Created by zhijiansha on 2017-7-6.
 */
@Service("marketAPIService")
public class MarketAPIServiceImpl implements MarketAPIService {


    private String secret_key;

    private String api_key;

    private String url_prex;

    public MarketAPIServiceImpl(String url_prex,String api_key,String secret_key){
        this.api_key = api_key;
        this.secret_key = secret_key;
        this.url_prex = url_prex;
    }

    public MarketAPIServiceImpl(String url_prex){
        this.url_prex = url_prex;
    }

    public String ticker(String symbol, Integer type) throws HttpException, IOException {

        return null;
    }

    public String depth(String symbol, Integer type) throws HttpException, IOException {
        return null;
    }

    public String trades(String symbol, String since, Integer type) throws HttpException, IOException {
        return null;
    }
}
