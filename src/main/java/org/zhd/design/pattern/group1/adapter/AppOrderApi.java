package org.zhd.design.pattern.group1.adapter;

/**
 * app调用接口类
 * 
 * @author hdzhou
 * @date 2018年5月17日 下午2:40:30
 */
public interface AppOrderApi {
	/**
	 * 不传入时间
	 * @param orderId
	 * @param client
	 */
	void updateDate(String orderId, String client);
}
