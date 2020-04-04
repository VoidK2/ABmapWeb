/**  
 * @Title:  Role.java   
 * @Package com.majieWeb.pojo
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: majie
 * @data: 2020年3月31日
 * @version V1.0 
 */
package com.majieWeb.modular.pojo;

/**   
 * @ClassName:  Role   
 * @Description:角色实体类
 * @author: majie
 * @data: 2020年3月31日
 */
public class Role {
	//编号
	private Integer uuid;
	//名称
	private String name;
	/**  
	 * @Title:  getUuid <BR>  
	 * @Description: please write your description <BR>  
	 * @return: Integer <BR>  
	 */
	public Integer getUuid() {
		return uuid;
	}
	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}
	/**  
	 * @Title:  getName <BR>  
	 * @Description: please write your description <BR>  
	 * @return: String <BR>  
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
