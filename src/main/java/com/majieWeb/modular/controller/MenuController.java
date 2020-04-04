/**  
 * @Title:  MenuController.java   
 * @Package com.majieWeb.controller
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: majie
 * @data: 2020年3月31日
 * @version V1.0 
 */
package com.majieWeb.modular.controller;

import java.util.List;

import com.majieWeb.core.annotation.LogAnno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.majieWeb.modular.vo.GlobalResult;
import com.majieWeb.modular.vo.Tree;
import com.majieWeb.core.util.UserUtils;
import com.majieWeb.modular.pojo.Menu;
import com.majieWeb.modular.pojo.User;
import com.majieWeb.modular.service.MenuService;

/**   
 * @ClassName:  MenuController   
 * @Description:菜单管理
 * @author: majie
 * @data: 2020年3月31日
 */
@Controller
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	/**
	 * 查找所有
	 * @author: majie
	 * @data: 2020年3月30日
	 * @return
	 */
	@RequestMapping(value="/menu/menulist")
	@ResponseBody
	public List<Tree> findAll() {
		return menuService.findMenuList(); 
	}
	
	/**
	 * 根据菜单id查找菜单，显示菜单详情
	 * @author: majie
	 * @data: 2020年3月30日
	 * @param menuid 主键
	 * @return
	 */
	@RequestMapping("/menu/menufindById")
	@ResponseBody
	public List<Menu> findById(String menuid) {
		return menuService.findMenuById(menuid);
	}
	/**
	 * 添加数据
	 * @author: majie
	 * @data: 2020年3月30日
	 * @param menu 菜单对象
	 * @return
	 */
	@LogAnno(operateType = "添加权限菜单")
	@RequestMapping(value="/menu/menuadd")
	@ResponseBody
	public GlobalResult insert(Menu menu) {
		return menuService.addMenu(menu);
	}
	
	/**
	 * 根据id删除数据[修改状态]
	 * @author: majie
	 * @data: 2020年3月30日
	 * @param menuid 主键
	 * @return
	 */
	@LogAnno(operateType = "修改权限菜单")
	@RequestMapping(value="/menu/menudelete")
	@ResponseBody
	public GlobalResult deleteById(String menuid) {
		return menuService.deleteMenuById(menuid);
	}
	
	/**
	 * 根据id修改数据
	 * @author: majie
	 * @data: 2020年3月30日
	 * @param menu 菜单对象
	 * @return
	 */
	@LogAnno(operateType = "更新权限菜单")
	@RequestMapping(value="/menu/menuupdate")
	@ResponseBody
	public GlobalResult updateById(Menu menu) {
		return menuService.updateMenuById(menu);
	}
	
	
	/**
	 * 
	* @Title: loadMenu 
	* @Description: 根据session中的user_id加载菜单
	* @return Menu
	* @author: majie
	* @data: 2020年3月30日
	 */
	@RequestMapping(value="/menu/loadMenus")
	@ResponseBody
	public Menu loadMenus() {
		User user = UserUtils.getSubjectUser();
		Menu menus = null;
		if(user!=null) {
			menus = menuService.findMenuByUserid(user.getUser_id());
		}
		return menus;
	}
}
