package com.sanchezih.di.spring;

import com.sanchezih.di.spring.service.Converter;
import com.sanchezih.di.spring.service.impl.ARSToUSDConverter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		double cantidad = 100;
		BeanFactory context = new ClassPathXmlApplicationContext("context.xml");
		Converter c = (Converter) context.getBean("ARSToGBPConverter");
		System.out.println(c.convert(cantidad));

	}
}
