package com.blockchain.www.utils;
import com.blockchain.www.utils.ExchangeData;
import com.blockchain.www.dao.btctrade.BtcTradePriceDto;
import net.sf.json.JSONObject;

/**
 * 各交易所得到虚拟币价格信息
 * Created by zhijiansha on 2017-7-6.
 */
public class Exchange {

    public static void main(String args[])throws Exception{
        String data = ExchangeData.getData();
        JSONObject jsonObject = JSONObject.fromObject(data);
        BtcTradePriceDto dto = (BtcTradePriceDto) JSONObject.toBean(jsonObject, BtcTradePriceDto.class);
        System.out.println("比特币交易网 比特币最高价："+dto.getHigh());
        System.out.println("比特币交易网 比特币最低价："+dto.getLow());
        System.out.println("比特币交易网 比特币买价："+dto.getBuy());
        System.out.println("比特币交易网 比特币卖价："+dto.getSell());
        System.out.println("比特币交易网 比特币最新成交价："+dto.getLast());
        System.out.println("比特币交易网 比特币成交量(最近的24小时)："+dto.getVol());
        System.out.println("比特币交易网 比特币返回数据时服务器时间："+dto.getTime());

    }





}
