package com.entity.view;

import com.entity.ShopGoodsPTEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 拼团商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-03 10:18:13
 */
@TableName("pintuanshangpin")
public class ShopGoodsPTView extends ShopGoodsPTEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShopGoodsPTView(){
	}
 
 	public ShopGoodsPTView(ShopGoodsPTEntity pintuanshangpinEntity){
 	try {
			BeanUtils.copyProperties(this, pintuanshangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
