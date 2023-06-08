package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShopGoodsTypeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShopGoodsTypeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShopGoodsTypeView;


/**
 * 商品类型
 *
 * @author 
 * @email 
 * @date 2023-05-03 10:18:13
 */
public interface ShopGoodsTypeService extends IService<ShopGoodsTypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShopGoodsTypeVO> selectListVO(Wrapper<ShopGoodsTypeEntity> wrapper);
   	
   	ShopGoodsTypeVO selectVO(@Param("ew") Wrapper<ShopGoodsTypeEntity> wrapper);
   	
   	List<ShopGoodsTypeView> selectListView(Wrapper<ShopGoodsTypeEntity> wrapper);
   	
   	ShopGoodsTypeView selectView(@Param("ew") Wrapper<ShopGoodsTypeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShopGoodsTypeEntity> wrapper);
   	

}

