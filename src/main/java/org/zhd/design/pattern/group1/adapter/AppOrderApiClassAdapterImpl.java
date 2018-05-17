package org.zhd.design.pattern.group1.adapter;

import org.zhd.design.pattern.group1.SourceOrderApiImpl;

/**
 * app调用接口实现类,类的适配。 继承接口类不合适，相当于又要写一次实现。继承抽象类比较好。
 * 继承了SourceOrderApiImpl，这里实现类中没有其他方法，可以放心继承。实际项目里应该是一个抽象类。
 * 
 * 
 * @author hdzhou
 * @date 2018年5月17日 下午3:02:36
 */
public class AppOrderApiClassAdapterImpl extends SourceOrderApiImpl implements AppOrderApi {

	@Override
	public void updateDate(String orderId, String client) {
		this.updateDate(orderId, "9999-12-31", client);
	}

}
