package org.zhd.design.pattern.group1;

/**
 * 原本已经存在的实现类
 * 
 * @author hdzhou
 * @date 2018年5月17日 下午2:36:23
 */
public class SourceOrderApiImpl implements SourceOrderApi {

	@Override
	public void updateDate(String orderId, String date, String client) {
		System.out.println(client + "已将订单" + orderId + "的有效期延长至" + date);
	}

}
