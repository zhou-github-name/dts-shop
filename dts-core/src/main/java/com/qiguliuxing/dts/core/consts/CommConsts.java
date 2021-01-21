package com.qiguliuxing.dts.core.consts;

/**
 * 一些常用的参数定义
 * 
 * @author CHENBO
 * @since 1.0.0
 * @QQ: 623659388
 */
public class CommConsts {
	
	public static final String DEFAULT_AVATAR = "https://avatar.csdnimg.cn/8/A/0/2_qiguliuxing.jpg";

	public static final String DEFAULT_ORDER_FIX = "聚惠星小程序订单：";

	public static final String MISS_PARAMS = "缺少必要参数";

	/**
	 *设置缓存 6小时，有效期单位 ： 分钟
	 **/
	public static final Long CACHE_EXPIRE_MINUTES = 60 * 6L;


	/**
	 * 系统信息
	 **/
	public static final String SERVER_PORT_ADMIN = "8083";
	public static final String SERVER_PORT_WX = "8080";
	public static final String SERVER_PORT = "server.port";
	public static final String SPRING_DATASOURCE_DRUID_URL = "spring.datasource.druid.url";
	public static final String SPRING_DATASOURCE_DRUID_USERNAME = "spring.datasource.druid.username";
	/**
	 * 模块状态
	 **/
	public static final String DTS_NOTIFY_MAIL_ENABLE = "dts.notify.mail.enable";
	public static final String DTS_NOTIFY_SMS_ENABLE = "dts.notify.sms.enable";
	public static final String DTS_NOTIFY_WX_ENABLE = "dts.notify.wx.enable";
	public static final String DTS_EXPRESS_ENABLE = "dts.express.enable";
	public static final String DTS_EXPRESS_APPID = "dts.express.appId";
	public static final String DTS_STORAGE_ACTIVE = "dts.storage.active";
	public static final String DTS_STORAGE_LOCAL_STORAGEPATH = "dts.storage.local.storagePath";

	/**
	 * 微信相关
	 **/
	public static final String DTS_WX_APP_ID = "dts.wx.app-id";
	public static final String DTS_WX_APP_SECRET = "dts.wx.app-secret";
	public static final String DTS_WX_MCH_ID = "dts.wx.mch-id";
	public static final String DTS_WX_MCH_KEY = "dts.wx.mch-key";
	public static final String DTS_WX_NOTIFY_URL = "dts.wx.notify-url";

	/**
	 * 访问地址
	 **/
	public static final String DTS_STORAGE_LOCAL_WX_ADDRESS = "dts.storage.local.wx.address";
	public static final String DTS_STORAGE_LOCAL_ADMIN_ADDRESS = "dts.storage.local.admin.address";

}
