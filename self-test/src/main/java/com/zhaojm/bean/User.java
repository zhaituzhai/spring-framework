package com.zhaojm.bean;

import org.springframework.stereotype.Component;

/**
 * <pre>类名：</pre>
 * <pre>描述：</pre>
 * <pre>版权: 深圳航天信息</pre>
 * <pre>日期: 2020-10-15 9:01</pre>
 *
 * @author zhaojm
 */
@Component
public class User {
	private String username;
	private int age;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
