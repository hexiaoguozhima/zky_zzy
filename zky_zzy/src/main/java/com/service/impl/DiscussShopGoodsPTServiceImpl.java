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


import com.dao.DiscussShopGoodsPTDao;
import com.entity.DiscussShopGoodsPTEntity;
import com.service.DiscussShopGoodsPTService;
import com.entity.vo.DiscussShopGoodsPTVO;
import com.entity.view.DiscussShopGoodsPTView;

@Service("discusspintuanshangpinService")
public class DiscussShopGoodsPTServiceImpl extends ServiceImpl<DiscussShopGoodsPTDao, DiscussShopGoodsPTEntity> implements DiscussShopGoodsPTService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussShopGoodsPTEntity> page = this.selectPage(
                new Query<DiscussShopGoodsPTEntity>(params).getPage(),
                new EntityWrapper<DiscussShopGoodsPTEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussShopGoodsPTEntity> wrapper) {
		  Page<DiscussShopGoodsPTView> page =new Query<DiscussShopGoodsPTView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussShopGoodsPTVO> selectListVO(Wrapper<DiscussShopGoodsPTEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussShopGoodsPTVO selectVO(Wrapper<DiscussShopGoodsPTEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussShopGoodsPTView> selectListView(Wrapper<DiscussShopGoodsPTEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussShopGoodsPTView selectView(Wrapper<DiscussShopGoodsPTEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
