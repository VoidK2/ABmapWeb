package com.majieWeb.modular.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import com.majieWeb.modular.vo.EasyUIDataGridResult;
import com.majieWeb.modular.vo.EasyUIOptionalTreeNode;
import com.majieWeb.modular.vo.GlobalResult;
import com.majieWeb.modular.pojo.Role;
import com.majieWeb.modular.pojo.User;

/**
 * 
 * @ClassName:  UserService   
 * @Description:处理用户相关业务  
 * @author: majie
 * @data: 2020年3月31日
 */
public interface UserService {
	/**
	 * 
	 * @Title: findUserByCodeAndPwd   
	 * @Description: 根据账号和密码查找用户
	 * @param user_code 账号
	 * @param user_pwd 密码
	 * @return
	 */
	public User findUserByCodeAndPwd(String user_code, String user_pwd);
	/**
	 * 
	 * @Title: findUserList   
	 * @Description: 查询用户分页信息  
	 * @param page 当前页
	 * @param rows 页面大小
	 * @return
	 */
	public EasyUIDataGridResult findUserlistByPage(User user,Integer page, Integer rows);
	/**
	 * 
	 * @Title: findUserName   
	 * @Description: like查询用户名
	 * @param q 用户名
	 * @return
	 */
	public List<User> findUserName(String q);
	
	/**
	 * @Title: findUserRole
	 * @Description: 查询所有角色，并设置选中的用户角色为true 
	 * 				 -- 1.获取用户对应的角色,例如user_id=221 select uuid
	 *               from user_role,role where user_role.userid=221 and
	 *               user_role.roleuuid = role.uuid and role.enble=1; 
	 *               -- 2.获取所有角色
	 *               select uuid,name from role where role.enble=1; --
	 *               -- 3.封装返回值将用户对应的角色设置为true,uuid、name
	 * @param user_id
	 * @return List<Tree>
	 * @data: 2020年3月30日
	 */
	List<EasyUIOptionalTreeNode> findUserRole(Integer user_id);
	/**
	 * 
	* @Title: findUserRoleByUserid 
	* @Description: 根据用户id查询对应的角色  
	* @param user_id
	* @return List<Role>
	* @data: 2020年3月30日
	 */
	List<Role> findUserRoleByUserid(Integer user_id);
	/**
	 * 
	 * @Title: updateUserRole
	 * @Description: 更新用户对应的角色
	 * @param user_id
	 * @param checkedIds
	 * @return Integer
	 * @data: 2020年3月30日
	 */
	GlobalResult updateUserRole(Integer user_id, String checkedIds);
	
	/**
	 * 
	 * @Title: addUser   
	 * @Description: 添加用户
	 * @param user 用户
	 * @return
	 */
	public GlobalResult addUser(User user);
	/**
	 * 
	 * @Title: updateUser   
	 * @Description: 更新用户信息
	 * @param 用户信息
	 * @return
	 */
	public GlobalResult updateUser(User user);
	/**
	 * 
	 * @Title: updatePwd   
	 * @Description: 更新用户的密码
	 * @author: majie
	 * @param user 当前用户
	 * @param oldPwd 旧密码
	 * @param newPwd 新密码
	 * @return
	 */
	public GlobalResult updatePwd(User user,String oldPwd,String newPwd);
	/**
	 * 
	 * @Title: deleteUser   
	 * @Description: 删除用户   
	 * @param majie
	 * @return
	 */
	public GlobalResult deleteUser(Integer user_id);
	
	/**
	 * 
	 * @Title: export   
	 * @Description: 导出excel
	 * @author: majie
	 * @param os
	 * @param user
	 */
	public void export(OutputStream os, User user);
	
	/**
	 * 
	 * @Title: doImport   
	 * @Description: 导入excel
	 * @author: majie
	 * @param is
	 * @throws IOException
	 */
	public void doImport(InputStream is) throws IOException;
}
