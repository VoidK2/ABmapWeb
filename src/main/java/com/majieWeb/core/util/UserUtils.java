/**  
 * @Title:  RoleService.java   
 * @Package com.majieWeb.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: majie
 * @data: 2020年3月31日
 * @version V1.0 
 */
package com.majieWeb.core.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.majieWeb.modular.pojo.User;

/**
 * 
 * @ClassName:  UserUtils   
 * @Description:获取当前登录的用户  
 * @author: majie
 * @data: 2020年3月31日
 */
public class UserUtils {
	/**
	 * 
	 * @Title: getSubjectUser   
	 * @Description: 获取shiro中登录的用户
	 * @return
	 */
	public static User getSubjectUser() {
		User user = (User) SecurityUtils.getSubject().getPrincipal();
		return user;
	}
	/**
	 * 
	 * @Title: removeSubjectUser   
	 * @Description: 从shiro中移除登录的用户
	 * @author: majie
	 */
	public static void removeSubjectUser() {
		SecurityUtils.getSubject().logout();
	}
	/**
	 * 
	 * @Title: getRequest   
	 * @Description: 获取当前的request
	 * @author: majie
	 * @return
	 */
	public static HttpServletRequest getRequest() {
		return  ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
	}
	
	/**
	 * 获取IP地址的方法
	 * 
	 * @return
	 */
	public static String getIpAddress() {
		HttpServletRequest request = getRequest();
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
	/**
	 * 
	 * @Title: getSessionUser   
	 * @Description: 获取session中登录的用户（开启shiro后失效）
	 * @return
	 */
	@Deprecated
	public static User getSessionUser() {
		return (User)getRequest().getSession().getAttribute("user");
	}
	
	/**
	 * 
	 * @Title: setSessionUser   
	 * @Description: 将当前登录的用户信息放入session（开启shiro后失效）
	 * @param user
	 */
	@Deprecated
	public static void setSessionUser(User user) {
		getRequest().getSession().setAttribute("user", user);
	}
	/**
	 * 
	 * @Title: removeSessionUser   
	 * @Description: 从session中移除user（开启shiro后失效）
	 * @author: majie
	 */
	@Deprecated
	public static void removeSessionUser() {
		getRequest().getSession().removeAttribute("user");;
	}
}
