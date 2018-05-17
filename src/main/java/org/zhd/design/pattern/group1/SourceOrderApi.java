package org.zhd.design.pattern.group1;

/**
 * 原接口
 * 
 * @author hdzhou
 * @date 2018年5月17日 下午2:33:44
 */
public interface SourceOrderApi {
	/**
	 * 需要传入orderId，时间
	 * 
	 * @param orderId
	 * @param date
	 * @param client
	 */
	void updateDate(String orderId, String date, String client);
}
