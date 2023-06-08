package com.dao;

import com.entity.YonghuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CustomerVO;
import com.entity.view.CustomerView;


/**
 * 用户
 * 
 * @author 
 * @email 
 * @date 2023-05-03 10:18:13
 */
public interface CustomerDao extends BaseMapper<YonghuEntity> {
	
	List<CustomerVO> selectListVO(@Param("ew") Wrapper<YonghuEntity> wrapper);
	
	CustomerVO selectVO(@Param("ew") Wrapper<YonghuEntity> wrapper);
	
	List<CustomerView> selectListView(@Param("ew") Wrapper<YonghuEntity> wrapper);

	List<CustomerView> selectListView(Pagination page, @Param("ew") Wrapper<YonghuEntity> wrapper);
	
	CustomerView selectView(@Param("ew") Wrapper<YonghuEntity> wrapper);
	

}
