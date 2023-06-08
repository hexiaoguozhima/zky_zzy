package com.controller;

import java.util.Arrays;
import java.util.Map;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussShopGoodsPTEntity;
import com.entity.view.DiscussShopGoodsPTView;

import com.service.DiscussShopGoodsPTService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;

/**
 * 拼团商品评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-03 10:18:13
 */
@RestController
@RequestMapping("/discusspintuanshangpin")
public class DiscussShopGoodsPTController {
    @Autowired
    private DiscussShopGoodsPTService discusspintuanshangpinService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussShopGoodsPTEntity discusspintuanshangpin,
		HttpServletRequest request){

        EntityWrapper<DiscussShopGoodsPTEntity> ew = new EntityWrapper<DiscussShopGoodsPTEntity>();


		PageUtils page = discusspintuanshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusspintuanshangpin), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussShopGoodsPTEntity discusspintuanshangpin,
		HttpServletRequest request){
        EntityWrapper<DiscussShopGoodsPTEntity> ew = new EntityWrapper<DiscussShopGoodsPTEntity>();

		PageUtils page = discusspintuanshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusspintuanshangpin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussShopGoodsPTEntity discusspintuanshangpin){
       	EntityWrapper<DiscussShopGoodsPTEntity> ew = new EntityWrapper<DiscussShopGoodsPTEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusspintuanshangpin, "discusspintuanshangpin")); 
        return R.ok().put("data", discusspintuanshangpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussShopGoodsPTEntity discusspintuanshangpin){
        EntityWrapper<DiscussShopGoodsPTEntity> ew = new EntityWrapper<DiscussShopGoodsPTEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusspintuanshangpin, "discusspintuanshangpin")); 
		DiscussShopGoodsPTView discusspintuanshangpinView =  discusspintuanshangpinService.selectView(ew);
		return R.ok("查询拼团商品评论表成功").put("data", discusspintuanshangpinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussShopGoodsPTEntity discusspintuanshangpin = discusspintuanshangpinService.selectById(id);
        return R.ok().put("data", discusspintuanshangpin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussShopGoodsPTEntity discusspintuanshangpin = discusspintuanshangpinService.selectById(id);
        return R.ok().put("data", discusspintuanshangpin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussShopGoodsPTEntity discusspintuanshangpin, HttpServletRequest request){
    	discusspintuanshangpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusspintuanshangpin);

        discusspintuanshangpinService.insert(discusspintuanshangpin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussShopGoodsPTEntity discusspintuanshangpin, HttpServletRequest request){
    	discusspintuanshangpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusspintuanshangpin);

        discusspintuanshangpinService.insert(discusspintuanshangpin);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DiscussShopGoodsPTEntity discusspintuanshangpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusspintuanshangpin);
        discusspintuanshangpinService.updateById(discusspintuanshangpin);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusspintuanshangpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
