package com.weibo.newbie.rpc;

import java.net.MalformedURLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caucho.hessian.client.HessianProxyFactory;


public class Client {

	public static void main(String []args) {
		//使用hessiian提供的客户端
			String url = "http://localhost:8080/rpc/remoting/HessianRemoting";  
	        HessianProxyFactory factory = new HessianProxyFactory();  
			UserService service = null;
			try {
				service = (UserService) factory.create(UserService.class, url);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			System.out.println(service.getUser(112).getName());
		
		//使用spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("remoting-client.xml");
		UserService userService = (UserService) context.getBean("myServiceClient");
		String s = userService.getUser(123).getName();
		System.out.println("name:" + s);
		
		}
}
