package org.zhd.design.pattern.group1;

import org.junit.Test;
import org.zhd.design.pattern.group1.adapter.AppOrderApi;
import org.zhd.design.pattern.group1.adapter.AppOrderApiClassAdapterImpl;
import org.zhd.design.pattern.group1.adapter.AppOrderApiObjectAdapterImpl;
import org.zhd.design.pattern.group1.proxy.SourceOrderApiProxy;

/**
 * 
 * @author hdzhou
 * @date 2018年5月17日 下午2:50:00
 */
public class SourceOrderApiTest {
	@Test
	public void sourceOrderApiTest() {
		SourceOrderApi api = new SourceOrderApiImpl();
		api.updateDate("123456", "2014-10-15", "user");
	}

	@Test
	public void appOrderApiClassAdapterImplTest() {
		AppOrderApi app = new AppOrderApiObjectAdapterImpl();
		app.updateDate("123456", "app");
	}

	@Test
	public void appOrderApiClassAdapterImplTest2() {
		SourceOrderApi source = new SourceOrderApiImpl();
		AppOrderApi app = new AppOrderApiObjectAdapterImpl(source);
		app.updateDate("123456", "app");
	}

	@Test
	public void appOrderApiObjectAdapterImplTest() {
		AppOrderApi app = new AppOrderApiClassAdapterImpl();
		app.updateDate("123456", "app");
	}

	@Test
	public void sourceOrderApiProxyTest() {
		SourceOrderApi api = new SourceOrderApiProxy();
		api.updateDate("123456", "2014-10-15", "user");
		api.updateDate("123456", "2014-10-15", "admin");
	}
}
