package com.dao;

import com.entity.JiudianguanliyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiudianguanliyuanVO;
import com.entity.view.JiudianguanliyuanView;


/**
 * 酒店管理员
 * 
 * @author 
 * @email 
 * @date 2021-04-25 11:29:56
 */
public interface JiudianguanliyuanDao extends BaseMapper<JiudianguanliyuanEntity> {
	
	List<JiudianguanliyuanVO> selectListVO(@Param("ew") Wrapper<JiudianguanliyuanEntity> wrapper);
	
	JiudianguanliyuanVO selectVO(@Param("ew") Wrapper<JiudianguanliyuanEntity> wrapper);
	
	List<JiudianguanliyuanView> selectListView(@Param("ew") Wrapper<JiudianguanliyuanEntity> wrapper);

	List<JiudianguanliyuanView> selectListView(Pagination page,@Param("ew") Wrapper<JiudianguanliyuanEntity> wrapper);
	
	JiudianguanliyuanView selectView(@Param("ew") Wrapper<JiudianguanliyuanEntity> wrapper);
	
}
