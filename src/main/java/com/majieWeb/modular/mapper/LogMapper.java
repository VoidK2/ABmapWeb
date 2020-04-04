package com.majieWeb.modular.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.majieWeb.modular.pojo.Log;

/**   
 * @ClassName:  LogMapper   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: majie
 * @data: 2020年3月31日
 */
public interface LogMapper {

	/**   
	 * @Title: insertLog   
	 * @Description: 向数据库添加日志
	 * @author: majie
	 * @param log
	 * @return      
	 */
	int insertLog(Log log);
	/**
	 * 
	 * @Title: selectUserlistByPage   
	 * @Description: 查询
	 * @author: majie
	 * @param log
	 * @return
	 */
	public List<Log> selectLoglistByPage(Log log);
	/**
	 * 
	 * @Title: selectLogOperateor   
	 * @Description: 模糊查询操作人
	 * @author: majie
	 * @param operateor
	 * @return
	 */
	public List<Log> selectLogOperateor(@Param("operateor")String operateor);
	
}
