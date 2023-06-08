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

import com.entity.ShopGoodsTypeEntity;
import com.entity.view.ShopGoodsTypeView;

import com.service.ShopGoodsTypeService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;

/**
 * 商品类型
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-03 10:18:13
 */
@RestController
@RequestMapping("/shangpinleixing")
public class ShopGoodsTypeController {
    @Autowired
    private ShopGoodsTypeService shangpinleixingService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShopGoodsTypeEntity shangpinleixing,
		HttpServletRequest request){

        EntityWrapper<ShopGoodsTypeEntity> ew = new EntityWrapper<ShopGoodsTypeEntity>();


		PageUtils page = shangpinleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangpinleixing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShopGoodsTypeEntity shangpinleixing,
		HttpServletRequest request){
        EntityWrapper<ShopGoodsTypeEntity> ew = new EntityWrapper<ShopGoodsTypeEntity>();

		PageUtils page = shangpinleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangpinleixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShopGoodsTypeEntity shangpinleixing){
       	EntityWrapper<ShopGoodsTypeEntity> ew = new EntityWrapper<ShopGoodsTypeEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shangpinleixing, "shangpinleixing")); 
        return R.ok().put("data", shangpinleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShopGoodsTypeEntity shangpinleixing){
        EntityWrapper<ShopGoodsTypeEntity> ew = new EntityWrapper<ShopGoodsTypeEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shangpinleixing, "shangpinleixing")); 
		ShopGoodsTypeView shangpinleixingView =  shangpinleixingService.selectView(ew);
		return R.ok("查询商品类型成功").put("data", shangpinleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShopGoodsTypeEntity shangpinleixing = shangpinleixingService.selectById(id);
        return R.ok().put("data", shangpinleixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShopGoodsTypeEntity shangpinleixing = shangpinleixingService.selectById(id);
        return R.ok().put("data", shangpinleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShopGoodsTypeEntity shangpinleixing, HttpServletRequest request){
    	shangpinleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangpinleixing);

        shangpinleixingService.insert(shangpinleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShopGoodsTypeEntity shangpinleixing, HttpServletRequest request){
    	shangpinleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangpinleixing);

        shangpinleixingService.insert(shangpinleixing);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShopGoodsTypeEntity shangpinleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shangpinleixing);
        shangpinleixingService.updateById(shangpinleixing);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shangpinleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
