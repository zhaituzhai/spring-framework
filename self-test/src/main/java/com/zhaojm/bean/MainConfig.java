package com.zhaojm.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>类名：</pre>
 * <pre>描述：</pre>
 * <pre>版权: 深圳航天信息</pre>
 * <pre>日期: 2020-10-12 11:01</pre>
 *
 * @author zhaojm
 */
@Configuration
@ComponentScan("com.zhaojm.bean")
public class MainConfig {
	/**
	 * 工厂方法
	 * @return
	 */
	@Bean
	public IMath math() {
		IMath math = new MathImpl();
		return math;
	}
}
