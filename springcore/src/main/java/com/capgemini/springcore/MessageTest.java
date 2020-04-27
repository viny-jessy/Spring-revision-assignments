package com.capgemini.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.springcore.bean.MessageBean;

public class MessageTest {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		MessageBean messageBean = (MessageBean) context.getBean("msg");
		System.out.println("Message1  = " +messageBean.getMessage());
		
		//MessageBean messageBean2 = (MessageBean) context.getBean("msg2");
	
		System.out.println("Message1  = " +messageBean.getMessage());
		//System.out.println("Message2  = " +messageBean2.getMessage());
		
		
	}// End of main()

}//End of class
