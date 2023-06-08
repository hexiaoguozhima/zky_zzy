package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShopGoodsPTEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShopGoodsPTVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShopGoodsPTView;


/**
 * 拼团商品
 *
 * @author 
 * @email 
 * @date 2023-05-03 10:18:13
 */
public interface PintuanshangpinService extends IService<ShopGoodsPTEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShopGoodsPTVO> selectListVO(Wrapper<ShopGoodsPTEntity> wrapper);
   	
   	ShopGoodsPTVO selectVO(@Param("ew") Wrapper<ShopGoodsPTEntity> wrapper);
   	
   	List<ShopGoodsPTView> selectListView(Wrapper<ShopGoodsPTEntity> wrapper);
   	
   	ShopGoodsPTView selectView(@Param("ew") Wrapper<ShopGoodsPTEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShopGoodsPTEntity> wrapper);
   	

}

