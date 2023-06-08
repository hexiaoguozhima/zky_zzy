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


import com.dao.GoodsPTDao;
import com.entity.ShopGoodsPTEntity;
import com.service.PintuanshangpinService;
import com.entity.vo.ShopGoodsPTVO;
import com.entity.view.ShopGoodsPTView;

@Service("pintuanshangpinService")
public class ShopGoodsPTServiceImpl extends ServiceImpl<GoodsPTDao, ShopGoodsPTEntity> implements PintuanshangpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShopGoodsPTEntity> page = this.selectPage(
                new Query<ShopGoodsPTEntity>(params).getPage(),
                new EntityWrapper<ShopGoodsPTEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShopGoodsPTEntity> wrapper) {
		  Page<ShopGoodsPTView> page =new Query<ShopGoodsPTView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShopGoodsPTVO> selectListVO(Wrapper<ShopGoodsPTEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShopGoodsPTVO selectVO(Wrapper<ShopGoodsPTEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShopGoodsPTView> selectListView(Wrapper<ShopGoodsPTEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShopGoodsPTView selectView(Wrapper<ShopGoodsPTEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
