package com.entity.view;

import com.entity.JiudianguanliyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 酒店管理员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-25 11:29:56
 */
@TableName("jiudianguanliyuan")
public class JiudianguanliyuanView  extends JiudianguanliyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiudianguanliyuanView(){
	}
 
 	public JiudianguanliyuanView(JiudianguanliyuanEntity jiudianguanliyuanEntity){
 	try {
			BeanUtils.copyProperties(this, jiudianguanliyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
