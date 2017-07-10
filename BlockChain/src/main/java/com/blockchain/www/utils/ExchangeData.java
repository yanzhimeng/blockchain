package com.blockchain.www.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by zhijiansha on 2017-7-7.
 */
public class ExchangeData {

    public static String getData() throws Exception{
        // 创建指定url的url对象
        URL url = new URL("https://api.btctrade.com/api/ticker?coin=btc");
        // 创建http链接对象
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        // 设置请求方式
        con.setRequestMethod("GET");
        // 打开链接,上一步和该步骤作用相同，可以省略
        con.connect();
        // 获取请求返回内容并设置编码为UTF-8
        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
        // 将返回数据拼接为字符串
        StringBuffer sb = new StringBuffer();
        // 临时字符串
        String temp = null;
        // 获取数据
        while ((temp = reader.readLine()) != null) {
            sb.append(temp);
        }
        // 关闭流
        reader.close();
        return sb.toString();
    }



}
