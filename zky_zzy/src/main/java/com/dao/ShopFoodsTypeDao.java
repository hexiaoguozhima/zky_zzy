package com.dao;

import com.entity.ShopGoodsTypeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShopGoodsTypeVO;
import com.entity.view.ShopGoodsTypeView;


/**
 * 商品类型
 * 
 * @author 
 * @email 
 * @date 2023-05-03 10:18:13
 */
public interface ShopFoodsTypeDao extends BaseMapper<ShopGoodsTypeEntity> {
	
	List<ShopGoodsTypeVO> selectListVO(@Param("ew") Wrapper<ShopGoodsTypeEntity> wrapper);
	
	ShopGoodsTypeVO selectVO(@Param("ew") Wrapper<ShopGoodsTypeEntity> wrapper);
	
	List<ShopGoodsTypeView> selectListView(@Param("ew") Wrapper<ShopGoodsTypeEntity> wrapper);

	List<ShopGoodsTypeView> selectListView(Pagination page, @Param("ew") Wrapper<ShopGoodsTypeEntity> wrapper);
	
	ShopGoodsTypeView selectView(@Param("ew") Wrapper<ShopGoodsTypeEntity> wrapper);
	

}
