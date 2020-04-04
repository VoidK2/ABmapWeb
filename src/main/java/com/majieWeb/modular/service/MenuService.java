/**  
 * @Title:  MenuService.java   
 * @Package com.majieWeb.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: majie
 * @data: 2020年3月31日
 * @version V1.0 
 */
package com.majieWeb.modular.service;

import java.util.List;

import com.majieWeb.modular.vo.GlobalResult;
import com.majieWeb.modular.vo.Tree;
import com.majieWeb.modular.pojo.Menu;

/**   
 * @ClassName:  MenuService   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: majie
 * @data: 2020年3月31日
 */
public interface MenuService {
	
	/**
	 * 
	 * @Title: findMenuList   
	 * @Description: 查找所有数据
	 * @author: majie
	 * @return
	 */
	List<Tree> findMenuList();

	/**
	 * 
	 * @Title: findMenuById   
	 * @Description: 根据菜单id查找菜单，显示菜单详情
	 * @author: majie
	 * @param menuid
	 * @return
	 */
	List<Menu> findMenuById(String menuid);

	/**
	 * 
	 * @Title: addMenu   
	 * @Description: 添加数据
	 * @author: majie
	 * @param Menu
	 * @return
	 */
	GlobalResult addMenu(Menu Menu);
	
	/**
	 * 
	 * @Title: deleteMenuById   
	 * @Description: 根据id删除数据
	 * @author: majie
	 * @param menuid
	 * @return
	 */
	GlobalResult deleteMenuById(String menuid);

	/**
	 * 
	 * @Title: updateMenuById   
	 * @Description: 根据id修改数据
	 * @author: majie
	 * @param Menu
	 * @return
	 */
	GlobalResult updateMenuById(Menu Menu);
	/**
	 * 
	* @Title: findMenuByUserid 
	* @Description: 根据userid加载对应菜单 
	* @param userid
	* @return Menu
	* @author: majie
	* @data: 2020年3月30日
	 */
	Menu findMenuByUserid(Integer userid);
	/**
	 * 
	* @Title: findMenuListByUserid 
	* @Description: 根据userid加载对应菜单无序列表 
	* @param userid
	* @return List<Menu>
	* @author: majie
	* @data: 2020年3月30日
	 */
	List<Menu> findMenuListByUserid(Integer userid);

}
