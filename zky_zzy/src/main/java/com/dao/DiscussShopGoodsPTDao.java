package com.dao;

import com.entity.DiscussShopGoodsPTEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussShopGoodsPTVO;
import com.entity.view.DiscussShopGoodsPTView;


/**
 * 拼团商品评论表
 * 
 * @author 
 * @email 
 * @date 2023-05-03 10:18:13
 */
public interface DiscussShopGoodsPTDao extends BaseMapper<DiscussShopGoodsPTEntity> {
	
	List<DiscussShopGoodsPTVO> selectListVO(@Param("ew") Wrapper<DiscussShopGoodsPTEntity> wrapper);
	
	DiscussShopGoodsPTVO selectVO(@Param("ew") Wrapper<DiscussShopGoodsPTEntity> wrapper);
	
	List<DiscussShopGoodsPTView> selectListView(@Param("ew") Wrapper<DiscussShopGoodsPTEntity> wrapper);

	List<DiscussShopGoodsPTView> selectListView(Pagination page, @Param("ew") Wrapper<DiscussShopGoodsPTEntity> wrapper);
	
	DiscussShopGoodsPTView selectView(@Param("ew") Wrapper<DiscussShopGoodsPTEntity> wrapper);
	

}
