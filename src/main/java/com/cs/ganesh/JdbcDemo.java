package com.cs.ganesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cs.ganesh.dao.HibernateDaoImpl;
import com.cs.ganesh.dao.JdbcDaoImpl;
import com.cs.ganesh.dao.SimpleJdbcDaoImpl;
import com.cs.ganesh.model.Circle;

public class JdbcDemo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		//JdbcDaoImpl dao = ctx.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		
		/*Circle circle = dao.getCircle(1);
		System.out.println(circle.getName());*/

		/*dao.insertCircle(new Circle(5, "Fifth Circle"));
		System.out.println(dao.getCircles().size());
		*/
		//dao.createTriangleTable();
		
		/*SimpleJdbcDaoImpl dao = ctx.getBean("simpleJdbcDaoImpl", SimpleJdbcDaoImpl.class);
		System.out.println(dao.getCircleCount());*/
		
		HibernateDaoImpl dao = ctx.getBean("HibernateDaoImpl", HibernateDaoImpl.class);
		System.out.println(dao.getCircleCount());
		
	}

}