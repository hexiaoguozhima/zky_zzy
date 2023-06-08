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


import com.dao.CustomerDao;
import com.entity.YonghuEntity;
import com.service.YonghuService;
import com.entity.vo.CustomerVO;
import com.entity.view.CustomerView;

@Service("yonghuService")
public class CustomerServiceImpl extends ServiceImpl<CustomerDao, YonghuEntity> implements YonghuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuEntity> page = this.selectPage(
                new Query<YonghuEntity>(params).getPage(),
                new EntityWrapper<YonghuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuEntity> wrapper) {
		  Page<CustomerView> page =new Query<CustomerView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CustomerVO> selectListVO(Wrapper<YonghuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CustomerVO selectVO(Wrapper<YonghuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CustomerView> selectListView(Wrapper<YonghuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CustomerView selectView(Wrapper<YonghuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
