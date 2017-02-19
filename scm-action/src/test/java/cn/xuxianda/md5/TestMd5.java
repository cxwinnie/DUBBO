package cn.xuxianda.md5;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;

public class TestMd5 {
	
	@Test
	public void test01(){
		//原始密码：
		String source = "admin";

		//盐
		String salt = "qwerty";

		//散列次数
		int hashIterations = 1;
		
		Md5Hash hash = new Md5Hash(source,salt,hashIterations);
		
		System.out.println(hash.toString());
		
	}
	
}
