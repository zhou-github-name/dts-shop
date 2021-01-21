package com.qiguliuxing.dts.core.system;

import com.qiguliuxing.dts.core.consts.CommConsts;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.qiguliuxing.dts.core.util.SystemInfoPrinter;

/**
 * 系统启动服务，用于检查系统状态及打印系统信息
 */

@Component
public class SystemInistService {

	@Autowired
	private Environment environment;

	@PostConstruct
	private void inist() {
		try {
			SystemInfoPrinter.printInfo("dts 项目初始化信息", getSystemInfo());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Map<String, String> getSystemInfo() {

		Map<String, String> infos = new LinkedHashMap<>();

		infos.put(SystemInfoPrinter.CREATE_PART_COPPER + 0, "系统信息");
		// 测试获取application-db.yml配置信息
		infos.put("本商场名称        ", SystemConfig.getMallName());
		infos.put("服务器端口        ", environment.getProperty(CommConsts.SERVER_PORT));
		infos.put("数据库地址        ", environment.getProperty(CommConsts.SPRING_DATASOURCE_DRUID_URL));
		infos.put("数据库用户        ", environment.getProperty(CommConsts.SPRING_DATASOURCE_DRUID_USERNAME));
		//infos.put("调试级别", environment.getProperty("logging.level.com.qiguliuxing.dts.wx"));

		// 测试获取application-core.yml配置信息
		infos.put(SystemInfoPrinter.CREATE_PART_COPPER + 1, "模块状态");
		infos.put("激活邮件          ", environment.getProperty(CommConsts.DTS_NOTIFY_MAIL_ENABLE));
		infos.put("激活短信          ", environment.getProperty(CommConsts.DTS_NOTIFY_SMS_ENABLE));
		infos.put("模版消息          ", environment.getProperty(CommConsts.DTS_NOTIFY_WX_ENABLE));
		infos.put("快递信息          ", environment.getProperty(CommConsts.DTS_EXPRESS_ENABLE));
		infos.put("快递鸟码          ", environment.getProperty(CommConsts.DTS_EXPRESS_APPID));
		infos.put("对象存储          ", environment.getProperty(CommConsts.DTS_STORAGE_ACTIVE));
		infos.put("本地对象存储路径   ", environment.getProperty(CommConsts.DTS_STORAGE_LOCAL_STORAGEPATH));
		// 微信相关信息,屏蔽打印控制台
		if(CommConsts.SERVER_PORT_WX.equals(environment.getProperty(CommConsts.SERVER_PORT))) {
			infos.put(SystemInfoPrinter.CREATE_PART_COPPER + 2, "微信相关");
			infos.put("微信APP KEY      ", environment.getProperty(CommConsts.DTS_WX_APP_ID));
			infos.put("微信APP-SECRET   ", environment.getProperty(CommConsts.DTS_WX_APP_SECRET));
			infos.put("微信支付MCH-ID    ", environment.getProperty(CommConsts.DTS_WX_MCH_ID));
			infos.put("微信支付MCH-KEY   ", environment.getProperty(CommConsts.DTS_WX_MCH_KEY));
			infos.put("微信支付通知地址   ", environment.getProperty(CommConsts.DTS_WX_NOTIFY_URL));
		}

		// 测试获取System表配置信息
		infos.put(SystemInfoPrinter.CREATE_PART_COPPER + 3, "系统设置");
		infos.put("自动创建朋友圈分享图", Boolean.toString(SystemConfig.isAutoCreateShareImage()));
		infos.put("首页显示记录数：NEW | HOT | BRAND | TOPIC | CatlogList | CatlogMore",
				"\n"+"                  "+SystemConfig.getNewLimit() + "  | " + SystemConfig.getHotLimit() + "  |   " + SystemConfig.getBrandLimit() + "   |   "
						+ SystemConfig.getTopicLimit() + "   |      " + SystemConfig.getCatlogListLimit() + "     |     "
						+ SystemConfig.getCatlogMoreLimit());

		infos.put(SystemInfoPrinter.CREATE_PART_COPPER + 4, "访问地址");
		if(CommConsts.SERVER_PORT_WX.equals(environment.getProperty(CommConsts.SERVER_PORT))) {
			infos.put("本地微信访问地址   ", environment.getProperty(CommConsts.DTS_STORAGE_LOCAL_WX_ADDRESS));
		}else{
			infos.put("本地后台请求地址   ", environment.getProperty(CommConsts.DTS_STORAGE_LOCAL_ADMIN_ADDRESS));
		}

		return infos;
	}
}
