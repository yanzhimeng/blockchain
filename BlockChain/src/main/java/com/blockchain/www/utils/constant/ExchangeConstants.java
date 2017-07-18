package com.blockchain.www.utils.constant;

/**
 * Created by zhijiansha on 2017-7-6.
 */
public class ExchangeConstants {

    /** 货币类型 */
    /**
     * BTC:比特币; ETH; ETC; LTC:莱特币; DOGE; YBC
     */

    /** 交易网 */
    public static final int BTC_TRADE_WEB = 1; // 比特币交易网
    public static final int HUO_BI_WEB = 2; // 火币网
    public static final int YUN_BI_WEB = 3; // 云币网
    public static final int OKCOIN_WEB = 4; // okcoin交易网
    public static final int BTER_WEB = 5; // 比特儿交易网
    public static final int CHBTC_WEB = 6; // 中国比特币交易网


    /** 交易网API公用URL前缀 */
    public static final String PUBLIC_BTC_TRADE_URL = "https://api.btctrade.com/";
    public static final String PUBLIC_HUO_BI_URL1 = "https://be.huobi.com/"; //ETH、ETC
    public static final String PUBLIC_HUO_BI_URL2 = "http://api.huobi.com/"; //BTC、LTC
    public static final String PUBLIC_YUN_BI_URL = "https://yunbi.com//";
    public static final String PUBLIC_OKCOIN_URL = "https://www.okcoin.com/";
    public static final String PUBLIC_BTER_URL = "http://data.bter.com/";
    public static final String PUBLIC_CHBTC_URL = "http://api.chbtc.com/";


}
