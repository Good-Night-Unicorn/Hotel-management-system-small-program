package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiudianguanliyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiudianguanliyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiudianguanliyuanView;


/**
 * 酒店管理员
 *
 * @author 
 * @email 
 * @date 2021-04-25 11:29:56
 */
public interface JiudianguanliyuanService extends IService<JiudianguanliyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiudianguanliyuanVO> selectListVO(Wrapper<JiudianguanliyuanEntity> wrapper);
   	
   	JiudianguanliyuanVO selectVO(@Param("ew") Wrapper<JiudianguanliyuanEntity> wrapper);
   	
   	List<JiudianguanliyuanView> selectListView(Wrapper<JiudianguanliyuanEntity> wrapper);
   	
   	JiudianguanliyuanView selectView(@Param("ew") Wrapper<JiudianguanliyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiudianguanliyuanEntity> wrapper);
   	
}

