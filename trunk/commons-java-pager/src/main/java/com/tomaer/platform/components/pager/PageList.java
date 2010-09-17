/**
 * commons-java-pager - common pager components for Java Web Develop - http://code.google.com/p/common-java-pager/
 * Copyright (C) 2008-2010 <a href="http://tomaer.com">tomaer</a>
 * 
 * == BEGIN LICENSE ==
 * 
 * Licensed under the terms of any of the following licenses at your choice:
 * 
 *  - Apache License, Version 2.0
 *    http://http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  - Creative Commons 3.0 BY-SA
 *    http://http://creativecommons.org/licenses/by-sa/3.0/
 * 
 * == END LICENSE ==
 */
package com.tomaer.platform.components.pager;

import java.io.Serializable;
import java.util.List;


/**
 * @version $Id: PageList.java 2010-09-17 13:53:23Z tomaer $
 */
public final class PageList<T> implements Serializable {

	private static final long serialVersionUID = 7636400405542683379L;
	
	private List<T> datas;
	
	private Page page;
	
	public List<T> getDatas() {
		return datas;
	}
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
}
