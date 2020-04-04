package com.majieWeb.modular.service;

import java.sql.SQLException;
import java.util.List;

import com.majieWeb.modular.vo.EasyUIDataGridResult;
import com.majieWeb.modular.pojo.Log;

/**
 * 日志Service
 * 
 * @author: majie
 *
 */
public interface LogService {
    /**
     * 增加日志
     * @param log
     * @return
     * @throws SQLException
     */
    public boolean addLog(Log log) throws SQLException;

	/**   
	 * @Title: findLoglistByPage   
	 * @Description: 查询日志
	 * @author: majie
	 * @param page
	 * @param rows
	 * @param log
	 * @return      
	 */
	public EasyUIDataGridResult findLoglistByPage(Integer page, Integer rows, Log log);

	/**   
	 * @Title: findLogOperateor   
	 * @Description: 模糊查询用户名
	 * @author: majie
	 * @param q
	 * @return      
	 */
	public List<Log> findLogOperateor(String q);
}