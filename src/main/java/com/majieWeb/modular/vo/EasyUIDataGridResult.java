/**  
 * @Title:  RoleService.java   
 * @Package com.majieWeb.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: majie
 * @data: 2020年3月31日
 * @version V1.0 
 */
package com.majieWeb.modular.vo;

import java.io.Serializable;
import java.util.List;
/**
 * 
 * @ClassName:  EasyUIDataGridResult   
 * @Description:easyui分页
 * @author: majie
 * @data: 2020年3月31日
 */
public class EasyUIDataGridResult implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 数据库中总记录数
	 */
	private Integer total;
	/**
	 * 当前页数据
	 */
	private List<?> rows;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
}
