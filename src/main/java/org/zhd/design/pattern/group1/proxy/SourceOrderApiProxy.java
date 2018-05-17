package org.zhd.design.pattern.group1.proxy;

import org.zhd.design.pattern.group1.SourceOrderApi;
import org.zhd.design.pattern.group1.SourceOrderApiImpl;

/**
 * 原接口增加权限认证功能，代理模式
 * 
 * @author hdzhou
 * @date 2018年5月17日 下午3:31:13
 */
public class SourceOrderApiProxy implements SourceOrderApi {

	public static final String ADMIN = "admin";

	private SourceOrderApi api;

	public SourceOrderApiProxy() {
		this.api = new SourceOrderApiImpl();
	}

	@Override
	public void updateDate(String orderId, String date, String client) {
		// 进行判断，如果是admin则更新否则让其输入账号密码
		if (ADMIN.equals(client)) {
			api.updateDate(orderId, date, client);
		} else {
			System.out.println("账号不是admin，没有查询权限，请输入以admin操作");
		}
	}

}
