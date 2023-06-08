package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussShopGoodsPTEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussShopGoodsPTVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussShopGoodsPTView;


/**
 * 拼团商品评论表
 *
 * @author 
 * @email 
 * @date 2023-05-03 10:18:13
 */
public interface DiscussShopGoodsPTService extends IService<DiscussShopGoodsPTEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussShopGoodsPTVO> selectListVO(Wrapper<DiscussShopGoodsPTEntity> wrapper);
   	
   	DiscussShopGoodsPTVO selectVO(@Param("ew") Wrapper<DiscussShopGoodsPTEntity> wrapper);
   	
   	List<DiscussShopGoodsPTView> selectListView(Wrapper<DiscussShopGoodsPTEntity> wrapper);
   	
   	DiscussShopGoodsPTView selectView(@Param("ew") Wrapper<DiscussShopGoodsPTEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussShopGoodsPTEntity> wrapper);
   	

}

