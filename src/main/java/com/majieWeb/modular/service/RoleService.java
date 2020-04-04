/**  
 * @Title:  RoleService.java   
 * @Package com.majieWeb.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: majie
 * @data: 2020年3月31日
 * @version V1.0 
 */
package com.majieWeb.modular.service;

import java.util.List;

import com.majieWeb.modular.vo.EasyUIDataGridResult;
import com.majieWeb.modular.vo.EasyUIOptionalTreeNode;
import com.majieWeb.modular.vo.GlobalResult;
import com.majieWeb.modular.pojo.Role;


/**
 * 
 * @ClassName: RoleService 
 * @Description: 处理角色相关业务
 * @author: majie
 * @data: 2020年3月31日
 */
public interface RoleService {
	/**
	 * 
	* @Title: findRoleByPage 
	* @Description: 根据查询条件所有角色 
	* @param page
	* @param rows
	* @param role
	* @return EasyUIDataGridResult
	* @author: majie
	* @data: 2020年3月30日
	 */
	public EasyUIDataGridResult findRolelistByPage(Integer page, Integer rows,Role role);
	/**
	 * 
	* @Title: findRoleByEnble 
	* @Description: 查询所有可用的角色 
	* @return EasyUIDataGridResult
	* @author: majie
	* @data: 2020年3月30日
	 */
	public EasyUIDataGridResult findRoleList();
	
	/**
	 * 
	 * @Title: findUserName   
	 * @Description: like查询角色名
	 * @param q 角色名
	 * @return
	 */
	public List<Role> findRoleName(String q);
	
	/**
	 * 
	* @Title: updateRole 
	* @Description: 更新角色的名称或者状态 
	* @param role
	* @return ManagerResult
	* @author: majie
	* @data: 2020年3月30日
	 */
	public GlobalResult updateRole(Role role);
	/**
	 * 
	* @Title: addRole 
	* @Description: 添加角色 
	* @param role
	* @return ManagerResult
	* @author: majie
	* @data: 2020年3月30日
	 */
	public GlobalResult addRole(Role role);
	/**
	 * 
	 * @Title: deleteRoleById   
	 * @Description: 根据uuid删除角色
	 * @param uuid
	 * @return
	 */
	public GlobalResult deleteRoleById(Integer uuid);
	
	/**
	 * 
	* @Title: findRoleMenu 
	* @Description: 获取角色菜单权限 
		-- 1.根据角色id获取对应的权限菜单id,比如角色id roleuuid=1
		select role_menu.menuuuid from role,role_menu WHERE role_menu.roleuuid=1;
		-- 2.获取所有权限菜单(menuid,menuname)
		SELECT menuid,menuname FROM menu;
	* @param roleuuid
	* @return List<EasyUIOptionalTreeNode>
	* @author: majie
	* @data: 2020年3月30日
	 */
	public List<EasyUIOptionalTreeNode> findRoleMenuByRoleid(Integer roleuuid);
	/**
	 * 
	* @Title: updateRoleMenu
	* @Description: 更新角色权限菜单 
	* @param roleuuid
	* @param checkedIds
	* @return ManagerResult
	* @author: majie
	* @data: 2020年3月30日
	 */
	public GlobalResult updateRoleMenu(Integer roleuuid, String checkedIds);
}
