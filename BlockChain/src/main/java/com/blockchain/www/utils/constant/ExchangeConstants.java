package com.blockchain.www.utils.constant;

/**
 * Created by zhijiansha on 2017-7-6.
 */
public class ExchangeConstants {

    /** 企业类型 */
    public static final int ENTP_TYPE_OPERATION_HEAD = 0; // 运营总公司
    public static final int ENTP_TYPE_OPERATION_BRANCH = 1; // 运营分公司
    public static final int ENTP_TYPE_OPERATION_AGENCY = 2; // 招标代理机构
    public static final int ENTP_TYPE_BID_PRODUCT = 6; // 投标企业-生产企业
    public static final int ENTP_TYPE_BID_DEALER = 7; // 投标企业-经销商
    public static final int ENTP_TYPE_BID_PRODUCT_DEALER = 8; // 投标企业-生产企业与经销商
    public static final int ENTP_TYPE_MEDICAL = 9; // 医疗机构
    public static final int ENTP_TYPE_HOSPITAL = 10; // 医院
    public static final int ENTP_TYPE_SUPERVION = 12; // 监管机构
    public static final int ENTP_TYPE_TRADE = 13;  //交易中心

    /** 投标方类型 */
    public static final String ENTP_TYPE_PRODUCT = "生产厂家";
    public static final String ENTP_TYPE_DEALER = "经销商";
    public static final String ENTP_TYPE_PRODUCT_DEALER = "生产厂家与经销商";

    /** 市场认证 */
    public static final int MARKET_NOT_CERTIFICATED = 0; // 未认证
    public static final int MARKET_CERTIFICATED = 1; // 已认证

    /** 账号状态 */
    public static final int ENTP_STATE_FORBID = 0; // 禁用
    public static final int ENTP_STATE_START = 1; // 启用

    /** 上传文件状态 */
    public static final int FILE_NOTUPLOAD = 0; // 未上传
    public static final int FILE_UPLOADED = 1; // 已上传

    /** 下载文件状态 */
    public static final int FILE_NOTDOWNLOAD = 1; // 未下载
    public static final int FILE_DOWNLOADYET = 2; // 已下载

    /** 是否解密文件 */
    public static final int FILE_DECODE_YET = 1; // 未解密
    public static final int FILE_NOT_DECODE = 2; // 已解密

    /** 发送文件状态 */
    public static final int FILE_STATELESS = 0; // 无状态
    public static final int FILE_NOT_SEND = 1; // 未发送
    public static final int FILE_SEND_SUCCEED = 2; // 发送成功

    /** bids_notice 类型 */
    public static final int PRETRIAL_TENDER_NOTICE = 1; // 预审/招标公告
    public static final int TENDER_INVITATION = 2; // 投标邀请书
    public static final int QUALIFICATION_PRETRIAL_FILE = 3; // 资审通知书

    /** 回执件 */
    public static final int FILE_NOT_CONFIRM = 0; // 未确认
    public static final int FILE_CONFIRM_ATTEND = 1; // 参加
    public static final int FILE_CONFIRM_NOTATTEND = 2; // 不参加

    /** 填写信息类型（表project_bids_write_info的type） */
    public static final int INVITATION_AFFIRM_MESSAGE = 1; // 邀请书确认信息
    public static final int PRETRIAL_AFFIRM_MESSAGE = 2; // 资审文件填写信息
    public static final int CONFESS_BIDDER_MESSAGE = 3; // 招标文件填写信息

    /** 是否支付费用 */
    public static final int WAIT_FOR_CHECK = 0; // 待审核
    public static final int NOT_PAY_COST = 1; // 未支付
    public static final int PAY_COST_YET = 2; // 已支付

    /** 中标状态 */
    public static final int NOT_SET_BIDDER = 0; // 待确认
    public static final int SET_BIDDER_CANDIDATE = 1; // 设为中标候选人
    public static final int WIN_THE_BIDDING = 2; // 中标

    /** 审核状态 */
    public static final int AUDIT_COMPLETE = 1; // 完成
    public static final int AUDIT_UNFINISHED = 2; // 未完成

    /** 投标状态(project_bids_enterprise[bids_status]) */
    public static final int NOT_OPEN_TENDER = 1; // 未开标
    public static final int DECODE_QUALIFICATION_FILE = 2; // 资审文件已解密
    public static final int DECODE_BIDDER_FILE = 3; // 投标文件已解密

    /** 资源类型 */
    public static final int RESOURCE_TYPE_PRODUCTION_LICENSE = 1; // 生产许可证 (OSS)
    public static final int RESOURCE_TYPE_BUSINESS_CERTIFICATE = 2; // 经营许可证 (OSS)
    public static final int RESOURCE_TYPE_BUSINESS_LICENSE = 3; // 营业执照 (OSS)
    public static final int RESOURCE_TYPE_BUSINESS_SCOPE = 4; // 经营范围 (OSS)
    public static final int RESOURCE_TYPE_LOGO = 5; // 公司LOGO (OSS)
    public static final int RESOURCE_TYPE_ENTERPRIES_CREDENTIAL = 6; // 公司资质上传 (OSS)
    public static final int RESOURCE_TYPE_AGENT_IDCARD = 7; // 经办人身份证 (OSS)
    public static final int RESOURCE_TYPE_TRADEMARK_REGISTRATION_CERTIFICATE = 8; // 商标注册证 (OSS)
    public static final int RESOURCE_TYPE_ENTERPRISE_DESCRIPTION = 9; // 公司介绍 (OSS)
//    public static final int RESOURCE_TYPE_BRAND_LICENSING = 10; // 品牌授权书 (OSS)
    public static final int RESOURCE_TYPE_GSP_IMAGE = 10; // GSP认证图片 (OSS)
    public static final int RESOURCE_TYPE_ENTERPSIE_IMAGE = 11; // 企业图片, 医院图片 (OSS)
    public static final int RESOURCE_TYPE_GMP_IMAGE = 12; // GMP认证图片 (OSS)
    public static final int RESOURCE_TYPE_DESCRIPTION = 13; // 简介 (OSS)
    public static final int RESOURCE_TYPE_PRODUCTION_IMAGE = 14; // 产品图片路径 (OSS)
    public static final int RESOURCE_TYPE_PROJECT_DESCRIPTION = 15; // 项目说明 (OSS)
    public static final int RESOURCE_TYPE_PROJECT_ANNOUNCEMENT = 16; // 项目公告 (OSS)
    public static final int RESOURCE_TYPE_PROJECT_TENDER = 17; // 项目标书(OSS)
    public static final int RESOURCE_TYPE_BUSINESS_GMP_IMAGE = 18; // 项目标书(OSS)
    public static final int RESOURCE_TYPE_PROJECT_NOTICE = 19; // 招标/预审公告附件(OSS)
    public static final int RESOURCE_TYPE_PROJECT_CHANGENOTICE = 20; // 变更公告附件(OSS)
    public static final int RESOURCE_TYPE_PROJECT_INVITATION = 21; // 投标邀请书附件(OSS)
    public static final int RESOURCE_TYPE_PROJECT_PREFILE = 22; // 资格预审文件(OSS)
    public static final int RESOURCE_TYPE_PROJECT_APPLY_PREFILE = 23; // 资格预审申请文件(OSS)
    public static final int RESOURCE_TYPE_BIDDER_LIST = 24; // 投标报名登记表(OSS)
    public static final int RESOURCE_TYPE_PRETRIAL_REPORT = 25; // 资格预审报告(OSS)
    public static final int RESOURCE_TYPE_QUESTION = 28; // 提问文档(OSS)
    public static final int RESOURCE_TYPE_PASS_NOTICE = 26; // 资审通过通知书(OSS)
    public static final int RESOURCE_TYPE_RESULT_NOTICE = 27; // 资审结果通知书(OSS)
    public static final int RESOURCE_TYPE_ANSWER = 29; // 回复文档(OSS)
    public static final int RESOURCE_TYPE_PAYORDER = 30; // 上传资审支付凭证(OSS)
    public static final int RESOURCE_TYPE_CONFESS = 31; // 上传招标支付凭证(OSS)
    public static final int RESOURCE_TYPE_CONFESS_BIDDER = 32; // 招标文件附件(OSS)
    public static final int CLEAR_PRE = 33; // 资审文件澄清附件(OSS)
    public static final int CLEAR_PR0 = 34; // 招标文件澄清附件(OSS)
    public static final int CASH_FILE = 35; // 保证金缴纳凭证附件(OSS)
    public static final int BID_RESULT = 36; // 招标结果公告附件
    public static final int BIDDING_NOTICE = 37; // 中标通知书
    public static final int BID_RESULT_NOTICE = 38; // 招标结果通知书
    public static final int BID_EVALUATION_REPORT = 39; // 评标报告
    public static final int BID_REVIEW_REPORT = 40; // 评审报告
    public static final int RESOURCE_TYPE_PROJECT_BIDFILE = 42; // 投标文件(OSS)
    public static final int INSTITUTIONAL_QUALIFICATION = 43; // 机构资质

    /** sys_role 类型 */
    public static final int PLATFORM_SYSTEM_MANAGER = 1; // 平台系统管理员
    public static final int PLATFORM_BUSINESS_MANAGER = 2; // 平台业务管理员
    public static final int FILIALE_SYSTEM_MANAGER = 3; // 分公司系统管理员
    public static final int FILIALE_BUSINESS_MANAGER = 4; // 分公司业务管理员
    public static final int AGENCY_SYSTEM_MANAGER = 5; // 代理机构系统管理员
    public static final int AGENCY_BUSINESS_MANAGER = 6; //代理机构业务管理员
    public static final int BIDDER_SYSTEM_MANAGER = 7; // 投标企业系统管理员
    public static final int BIDDER_BUSINESS_MANAGER = 8; // 投标企业业务管理员
    public static final int HOSPITAL_SYSTEM_MANAGER = 9; // 医院系统管理员账号
    public static final int HOSPITAL_BUSINESS_MANAGER = 10; // 医院业务操作员账号
    public static final int SUPERVISE_ORGANIZATION = 11; // 监督机构账号
    public static final int TRADING_CENTER = 12; //交易中心账号
    public static final int PROFESSOR_ROLE = 13; //专家

}
