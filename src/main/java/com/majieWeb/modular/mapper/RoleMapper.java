package com.majieWeb.modular.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.majieWeb.modular.pojo.Role;

/**
 * @ClassName: RoleMapper
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: majie
 * @data: 2020年3月31日
 */
public interface RoleMapper {
	/**
	 * 
	 * @Title: selectRoleByPage
	 * @Description: 根据条件查询所有角色
	 * @param role
	 * @return List<Role>
	 * @author: majie
	 * @data: 2020年3月30日
	 */
	public List<Role> selectRolelistByPage(Role role);

	/**
	 * 
	 * @Title: selectAllRole
	 * @Description: 查询所有角色
	 * @param role
	 * @return List<Role>
	 * @author: majie
	 * @data: 2020年3月30日
	 */
	public List<Role> selectRoleList();
	/**
	 * 
	 * @Title: selectRoleName   
	 * @Description: 查询角色，自动补全   
	 * @param name
	 * @return
	 */
	public List<Role> selectRoleName(@Param("name")String name);

	/**
	 * 
	 * @Title: selectRoleMenuidByRoleid
	 * @Description: 根据角色id获取对应的权限菜单id
	 * @param roleuuid
	 * @return List<Integer>
	 * @author: majie
	 * @data: 2020年3月30日
	 */
	public List<String> selectRoleMenuidByRoleid(@Param("roleuuid") Integer roleuuid);

	/**
	 * 
	 * @Title: selectUseridByRoleuuid
	 * @Description: 根据角色id获取对应的用户id
	 * @param roleuuid
	 * @return List<Integer>
	 * @author: majie
	 * @data: 2020年3月30日
	 */
	public List<Integer> selectUseridByRoleuuid(@Param("roleuuid") Integer roleuuid);

	/**
	 * 
	 * @Title: updateRole
	 * @Description: 更新角色信息
	 * @param role
	 * @return Integer
	 * @author: majie
	 * @data: 2020年3月30日
	 */
	public Integer updateRole(Role role);

	/**
	 * 
	 * @Title: insertRole
	 * @Description: 添加角色
	 * @param role
	 * @return Integer
	 * @author: majie
	 * @data: 2020年3月30日
	 */
	public Integer insertRole(Role role);
	
	/**
	 * 
	 * @Title: insertRolemenu
	 * @Description: 新增角色权限菜单关系
	 * @param menuuuid
	 * @param roleuuid void
	 * @author: majie
	 * @data: 2020年3月30日
	 */
	public void insertRolemenu(@Param("menuuuid") String menuuuid, @Param("roleuuid") Integer roleuuid);
	
	/**
	 * 
	 * @Title: deleteRoleByid   
	 * @Description: 根据id删除对应角色
	 * @param uuid
	 * @return
	 */
	public Integer deleteRoleById(@Param("uuid") Integer uuid);
	
	/**
	 * 
	 * @Title: deleteMenuidByRoleid
	 * @Description: 根据roleuuid删除拥有的角色信息
	 * @param roleuuid void
	 * @author: majie
	 * @data: 2020年3月30日
	 */
	public void deleteMenuidByRoleid(@Param("roleuuid") Integer roleuuid);

}
