package com.entity.view;

import com.entity.ShopGoodsTypeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-03 10:18:13
 */
@TableName("shangpinleixing")
public class ShopGoodsTypeView extends ShopGoodsTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShopGoodsTypeView(){
	}
 
 	public ShopGoodsTypeView(ShopGoodsTypeEntity shangpinleixingEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
