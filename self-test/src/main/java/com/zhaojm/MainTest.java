package com.zhaojm;

import com.zhaojm.bean.IMath;
import com.zhaojm.bean.MainConfig;
import com.zhaojm.bean.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.LinkedHashMap;

/**
 * <pre>类名：</pre>
 * <pre>描述：</pre>
 * <pre>版权: 深圳航天信息</pre>
 * <pre>日期: 2020-10-12 11:23</pre>
 *
 * @author zhaojm
 */
public class MainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MainConfig.class);
		context.refresh();
		/*
		上三行代码等于（1、准备容器；2、注册配置文件；3：刷新容器）
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		 */
		// IMath math = context.getBean("math", IMath.class);
		// int add = math.add(17, 4);
		// System.out.println("result = " + add);

		//
		User user = context.getBean("user", User.class);
		user.setUsername("hello");
		user.setAge(1);
		System.out.println("user.getUsername() = " + user.getUsername());
	}

}
