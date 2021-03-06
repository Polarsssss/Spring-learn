package com.hujt.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;

import com.hujt.spring.factory.Car;

public class CarFactoryBean implements FactoryBean<Car>{

	private String brand;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//返回Bean对象
	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car(brand, 500000);
	}
	
	//返回Bean类型
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
