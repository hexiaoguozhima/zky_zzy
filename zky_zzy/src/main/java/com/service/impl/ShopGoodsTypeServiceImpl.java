package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShopFoodsTypeDao;
import com.entity.ShopGoodsTypeEntity;
import com.service.ShopGoodsTypeService;
import com.entity.vo.ShopGoodsTypeVO;
import com.entity.view.ShopGoodsTypeView;

@Service("shangpinleixingService")
public class ShopGoodsTypeServiceImpl extends ServiceImpl<ShopFoodsTypeDao, ShopGoodsTypeEntity> implements ShopGoodsTypeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShopGoodsTypeEntity> page = this.selectPage(
                new Query<ShopGoodsTypeEntity>(params).getPage(),
                new EntityWrapper<ShopGoodsTypeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShopGoodsTypeEntity> wrapper) {
		  Page<ShopGoodsTypeView> page =new Query<ShopGoodsTypeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShopGoodsTypeVO> selectListVO(Wrapper<ShopGoodsTypeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShopGoodsTypeVO selectVO(Wrapper<ShopGoodsTypeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShopGoodsTypeView> selectListView(Wrapper<ShopGoodsTypeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShopGoodsTypeView selectView(Wrapper<ShopGoodsTypeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
