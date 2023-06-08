package com.dao;

import com.entity.ShopGoodsPTEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShopGoodsPTVO;
import com.entity.view.ShopGoodsPTView;


/**
 * 拼团商品
 * 
 * @author 
 * @email 
 * @date 2023-05-03 10:18:13
 */
public interface GoodsPTDao extends BaseMapper<ShopGoodsPTEntity> {
	
	List<ShopGoodsPTVO> selectListVO(@Param("ew") Wrapper<ShopGoodsPTEntity> wrapper);
	
	ShopGoodsPTVO selectVO(@Param("ew") Wrapper<ShopGoodsPTEntity> wrapper);
	
	List<ShopGoodsPTView> selectListView(@Param("ew") Wrapper<ShopGoodsPTEntity> wrapper);

	List<ShopGoodsPTView> selectListView(Pagination page, @Param("ew") Wrapper<ShopGoodsPTEntity> wrapper);
	
	ShopGoodsPTView selectView(@Param("ew") Wrapper<ShopGoodsPTEntity> wrapper);
	

}
