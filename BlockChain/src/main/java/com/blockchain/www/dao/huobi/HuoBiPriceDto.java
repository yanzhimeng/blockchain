package com.blockchain.www.dao.huobi;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 火币交易网 行情信息
 * Created by zhijiansha on 2017-7-7.
 */
@Setter
@Getter
public class HuoBiPriceDto implements Serializable{

    private Double high; //最高价

    private Double low; //最低价

    private Double buy; //买一价

    private Double sell; //卖一价

    private Double last; //最新成交价

    private Double vol; //成交量(最近的24小时)

    private Long time; //返回数据时服务器时间

}
