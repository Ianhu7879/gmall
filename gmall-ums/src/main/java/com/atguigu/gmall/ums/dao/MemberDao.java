package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author huwenyong
 * @email 1405656862@qq.com
 * @date 2019-10-29 13:01:45
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
