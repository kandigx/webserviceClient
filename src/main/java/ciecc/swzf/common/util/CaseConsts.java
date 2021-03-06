package ciecc.swzf.common.util;

/**
 * @author kandigx
 * @create 2017-09-15 8:53
 */
public class CaseConsts {

    //操作类型(案件来源)0:执法检查，1:投诉举报，2:接转案件
    public static final String TR_TYPE_INSPECTION = "0"; //执法检查
    public static final String TR_TYPE_REPORT = "1"; //投诉举报
    public static final String TR_TYPE_RECEIVE = "2"; //接转案件

    //检查结果检查结果（1是合规，2是违规，3是整改，4是未检查成功）
    public static final String CHECK_RESULT_COMPLIANCE = "1";
    public static final String CHECK_RESULT_ILLEGAL = "2";
    public static final String CHECK_RESULT_RECTIFY = "3";
    public static final String CHECK_RESULT_UNSUCCESSFUL = "4";

    //适用类型（3简易程序;4一般程序；5移交）
    public static final String STAGE_SIMPLY_PROCEDURE = "3"; //3简易程序
    public static final String STAGE_ORDINARY_PROCEDURE = "4"; //4一般程序
    public static final String STAGE_TRANSFER = "5"; //5移交

    //被检查/被举报方单位（人）检查项目/案件类型：
    public static final String CHECK_ITEM_WINE_CIRCULATION = "2"; //2:酒类流通
    public static final String CHECK_ITEM_SPECIAL_BUSINESS = "3"; //3:商业特许经营
    public static final String CHECK_ITEM_RETAILER_PROMOTION = "4"; //4:零售商促销
    public static final String CHECK_ITEM_RETAILER_SUPPLIER_RELATIONSHIP = "5"; //5:零供关系
    public static final String CHECK_ITEM_SCRAP_CARS = "6"; //6:报废汽车回收拆解
    public static final String CHECK_ITEM_TECH_IMPORTS_AND_EXPORTS = "8"; //8:技术进出口
    public static final String CHECK_ITEM_FOREIGN_LABOUR  = "9"; //9:对外劳务合作
    public static final String CHECK_ITEM_FOREIGN_CONTRACT_PROJECTS = "10"; //10:对外承包工程
    public static final String CHECK_ITEM_CONCENTRATION_OF_UNDERTAKINGS_ANTI_MONOPOLY_CONTROL = "13"; //13:经营者集中反垄断控制
    public static final String CHECK_ITEM_RENEWABLE_RESOURCES_RECYCLING = "14"; //14:再生资源回收
    public static final String CHECK_ITEM_AUCTION = "16"; //16:拍卖
    public static final String CHECK_ITEM_PAWN = "17"; //17:典当
    public static final String CHECK_ITEM_LAUNDRY_AND_DYEING_INDUSTRY = "18"; //18:洗染业
    public static final String CHECK_ITEM_SINGLE_PURPOSE_COMMERCIAL_PREPAID_CARD = "20"; //20:单用途商业预付卡
    public static final String CHECK_ITEM_PRODUCT_OIL_MARKET = "21"; //21:成品油市场
    public static final String CHECK_ITEM_SPOT_MARKET = "25"; //25:商品现货市场
    public static final String CHECK_ITEM_OLD_APPLIANCES_CIRCULATION = "26"; //26:旧电器电子产品流通
    public static final String CHECK_ITEM_CRUDE_OIL_MARKET = "27"; //27:原油市场
    public static final String CHECK_ITEM_NECESSARIES_EMERGENCY = "28"; //28:生活必需品市场供应应急
    public static final String CHECK_ITEM_DOMESTIC_SERVICE = "29"; //29:家庭服务业
    public static final String CHECK_ITEM_CATERING_INDUSTRY = "30"; //30:餐饮业
    public static final String CHECK_ITEM_COSMETOLOGY_INDUSTRY = "31"; //31:美容美发业
    public static final String CHECK_ITEM_APPLIANCE_REPAIR_SERVICE = "32"; //32:家电维修服务业
    public static final String CHECK_ITEM_POISON_CHEMICAL_CONTROL = "33"; //33:易制毒化学品进出口管理
    public static final String CHECK_ITEM_NUCLEAR_RELATED_CONTROL = "34"; //34:核两用品及相关技术出口管制
    public static final String CHECK_ITEM_NUCLEAR_EXPORTS_CONTROL = "35"; //35:核出口管制
    public static final String CHECK_ITEM_MISSILE_RELATED_CONTROL = "36"; //36:导弹及相关物项和技术出口管制
    public static final String CHECK_ITEM_BIOLOGY_RELATED_CONTROL = "37"; //37:生物两用品及相关设备和技术出口管制
    public static final String CHECK_ITEM_CHEMICAL_RELATED_CONTROL = "38"; //38:有关化学品及相关设备和技术出口管制
    public static final String CHECK_ITEM_INTERNET_THIRD_PARTY_TRADING_RULES = "39"; //39:网络零售第三方平台交易规则
    public static final String CHECK_ITEM_OTHER = "15"; //15:其他

    //被检查/被举报方类型 0:个人 ,1:企业
    public static final String TUNIT_TYPE_INDIVIDUAL = "0"; //0:个人
    public static final String TUNIT_TYPE_BUSINESS = "1"; //1:企业

    //处罚类型选项
    public static final String PUNISH_TYPE_CHECK_FALSE = "false";
    public static final String PUNISH_TYPE_CHECK_TRUE = "true";

}
