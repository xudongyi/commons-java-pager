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


/**
 * @version $Id: PageAttribute.java 2010-09-17 13:53:23Z tomaer $
 */
public final class PageAttribute implements Serializable {

	private static final long serialVersionUID = -5623534037111390821L;

	/** defualt current page no */
	private final static int DEFAULT_PAGE_NO = 1;

	/** default page size */
	private int DEFAULT_PAGE_SIZE;

	/** current page no */
	private int pageNo;

	/** page size */
	private int pageSize;

	/** start from index */
	private int startIndex;

	/** default constructor */
	public PageAttribute() {
	}

	/** call this constructor method get instance */
	public PageAttribute(int pn, int psize, int definePageSize) {
		this.DEFAULT_PAGE_SIZE = pageSize;
		this.pageNo = this.getPageNo(pn);
		this.pageSize = this.getPageSize(psize);
		this.startIndex = (this.pageNo - 1) * this.pageSize;
	}

	/**
	 * call this method can get current page number
	 */
	protected int getPageNo(int pn) {
		return (pn > 0) ? pn : DEFAULT_PAGE_NO;
	}

	/**
	 * call this method can get page size
	 */
	protected int getPageSize(int psize) {
		return (psize > 0) ? psize : DEFAULT_PAGE_SIZE;
	}

	/** property pageNo getter method */
	public int getPageNo() {
		return pageNo;
	}

	/** property pageNo setter method */
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	/** property pageSize getter method */
	public int getPageSize() {
		return pageSize;
	}

	/** property pageSize setter method */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/** property startIndex getter method */
	public int getStartIndex() {
		return startIndex;
	}

	/** property startIndex setter method */
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
}
