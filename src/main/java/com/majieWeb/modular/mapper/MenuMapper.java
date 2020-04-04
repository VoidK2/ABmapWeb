package com.majieWeb.modular.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.majieWeb.modular.vo.Tree;
import com.majieWeb.modular.pojo.Menu;

/**   
 * @ClassName:  MenuMapper   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: majie
 * @data: 2020年3月31日
 */
public interface MenuMapper {
	/**
	 * 
	 * @Title: selectMenuList   
	 * @Description: 查找所有数据
	 * @author: majie
	 * @return
	 */
	List<Tree> selectMenuList();

	/**
	 * 
	 * @Title: selectMenuById   
	 * @Description: 根据菜单id查找菜单，显示菜单详情
	 * @author: majie
	 * @param menuid
	 * @return
	 */
	List<Menu> selectMenuById(@Param("menuid") String menuid);

	/**
	 * 
	 * @Title: insertMenu   
	 * @Description: 添加数据
	 * @author: majie
	 * @param Menu
	 * @return
	 */
	Integer insertMenu(Menu Menu);

	/**
	 * 
	 * @Title: deleteMenuById   
	 * @Description: 根据id删除数据[修改状态]
	 * @author: majie
	 * @param menuid
	 * @return
	 */
	Integer deleteMenuById(String menuid);

	/**
	 * 
	 * @Title: updateMenuById   
	 * @Description: 根据id修改数据
	 * @author: majie
	 * @param Menu
	 * @return
	 */
	Integer updateMenuById(Menu Menu);
	
	/**
	 * 
	 * @Title: selectMenuIdName
	 * @Description: 根据pid获取所有权限菜单(menuid,menuname)
	 * @return List<Menu>
	 * @author: majie
	 * @data: 2020年3月30日
	 */
	public List<Menu> selectMenuIdName(@Param("pid") String pid);

	/**
	 * 
	 * @Title: selectMenuByUserid
	 * @Description: 根据userid加载对应菜单
	 * @param userid
	 * @return List<Menu>
	 * @author: majie
	 * @data: 2020年3月30日
	 */
	public List<Menu> selectMenuByUserid(@Param("userid") Integer userid);
	
	/**
	 * 
	* @Title: selectMenu 
	* @Description: 查询所有菜单的所有属性 
	* @param pid
	* @return List<Menu>
	* @author: majie
	* @data: 2020年3月30日
	 */
	public List<Menu> selectMenu(@Param("pid") String pid);

}
