package com.airline.service;

import javax.ejb.LocalBean;
//import javax.ejb.Singleton;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class CounterBean
 */
@Stateful
@LocalBean
public class CounterStatefulBean {

	/**
	 * Default constructor.
	 */

	private Integer count = 0;

	public CounterStatefulBean() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	public void addOneToCount() {
		
		this.count += 1;
		
	}

	@Override
	public String toString() {
		return "CounterStatefulBean [count=" + count + "]";
	}
	
	

}
