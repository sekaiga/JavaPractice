package org.zhd.design.pattern.group1.adapter;

import org.zhd.design.pattern.group1.SourceOrderApi;
import org.zhd.design.pattern.group1.SourceOrderApiImpl;

/**
 * app调用接口实现类,对象的适配
 * 
 * @author hdzhou
 * @date 2018年5月17日 下午2:42:44
 */
public class AppOrderApiObjectAdapterImpl implements AppOrderApi {

	private SourceOrderApi api;

	/**
	 * 适配器模式
	 */
	public AppOrderApiObjectAdapterImpl() {
		this.api = new SourceOrderApiImpl();
	}

	/**
	 * 用途解释上来说也是适配器模式，形式上和装饰、代理有点像
	 * @param api
	 */
	public AppOrderApiObjectAdapterImpl(SourceOrderApi api) {
		this.api = api;
	}

	@Override
	public void updateDate(String orderId, String client) {
		api.updateDate(orderId, "9999-12-31", client);
	}

}
