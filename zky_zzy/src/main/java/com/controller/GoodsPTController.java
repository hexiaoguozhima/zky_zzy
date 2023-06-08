package com.controller;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShopGoodsPTEntity;
import com.entity.view.ShopGoodsPTView;

import com.service.PintuanshangpinService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.service.StoreupService;

/**
 * 拼团商品
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-03 10:18:13
 */
@RestController
@RequestMapping("/pintuanshangpin")
public class GoodsPTController {
    @Autowired
    private PintuanshangpinService pintuanshangpinService;



    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShopGoodsPTEntity pintuanshangpin,
		HttpServletRequest request){

        EntityWrapper<ShopGoodsPTEntity> ew = new EntityWrapper<ShopGoodsPTEntity>();


		PageUtils page = pintuanshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, pintuanshangpin), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShopGoodsPTEntity pintuanshangpin,
		HttpServletRequest request){
        EntityWrapper<ShopGoodsPTEntity> ew = new EntityWrapper<ShopGoodsPTEntity>();

		PageUtils page = pintuanshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, pintuanshangpin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShopGoodsPTEntity pintuanshangpin){
       	EntityWrapper<ShopGoodsPTEntity> ew = new EntityWrapper<ShopGoodsPTEntity>();
      	ew.allEq(MPUtil.allEQMapPre( pintuanshangpin, "pintuanshangpin")); 
        return R.ok().put("data", pintuanshangpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShopGoodsPTEntity pintuanshangpin){
        EntityWrapper<ShopGoodsPTEntity> ew = new EntityWrapper<ShopGoodsPTEntity>();
 		ew.allEq(MPUtil.allEQMapPre( pintuanshangpin, "pintuanshangpin")); 
		ShopGoodsPTView pintuanshangpinView =  pintuanshangpinService.selectView(ew);
		return R.ok("查询拼团商品成功").put("data", pintuanshangpinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShopGoodsPTEntity pintuanshangpin = pintuanshangpinService.selectById(id);
		pintuanshangpin.setClicknum(pintuanshangpin.getClicknum()+1);
		pintuanshangpin.setClicktime(new Date());
		pintuanshangpinService.updateById(pintuanshangpin);
        return R.ok().put("data", pintuanshangpin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShopGoodsPTEntity pintuanshangpin = pintuanshangpinService.selectById(id);
		pintuanshangpin.setClicknum(pintuanshangpin.getClicknum()+1);
		pintuanshangpin.setClicktime(new Date());
		pintuanshangpinService.updateById(pintuanshangpin);
        return R.ok().put("data", pintuanshangpin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShopGoodsPTEntity pintuanshangpin, HttpServletRequest request){
    	pintuanshangpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(pintuanshangpin);

        pintuanshangpinService.insert(pintuanshangpin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShopGoodsPTEntity pintuanshangpin, HttpServletRequest request){
    	pintuanshangpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(pintuanshangpin);

        pintuanshangpinService.insert(pintuanshangpin);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShopGoodsPTEntity pintuanshangpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(pintuanshangpin);
        pintuanshangpinService.updateById(pintuanshangpin);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        pintuanshangpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params, ShopGoodsPTEntity pintuanshangpin, HttpServletRequest request, String pre){
        EntityWrapper<ShopGoodsPTEntity> ew = new EntityWrapper<ShopGoodsPTEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = pintuanshangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, pintuanshangpin), params), params));
        return R.ok().put("data", page);
    }









}
