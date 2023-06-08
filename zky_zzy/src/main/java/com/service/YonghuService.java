package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CustomerVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CustomerView;


/**
 * 用户
 *
 * @author 
 * @email 
 * @date 2023-05-03 10:18:13
 */
public interface YonghuService extends IService<YonghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CustomerVO> selectListVO(Wrapper<YonghuEntity> wrapper);
   	
   	CustomerVO selectVO(@Param("ew") Wrapper<YonghuEntity> wrapper);
   	
   	List<CustomerView> selectListView(Wrapper<YonghuEntity> wrapper);
   	
   	CustomerView selectView(@Param("ew") Wrapper<YonghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuEntity> wrapper);
   	

}

