package com.zhaojm.bean;

import com.zhaojm.bean.IMath;

/**
 * <pre>类名：</pre>
 * <pre>描述：</pre>
 * <pre>版权: 深圳航天信息</pre>
 * <pre>日期: 2020-10-12 11:04</pre>
 *
 * @author zhaojm
 */
public class MathImpl implements IMath {
	@Override
	public int add(int a, int b) {
		return a + b;
	}
}
