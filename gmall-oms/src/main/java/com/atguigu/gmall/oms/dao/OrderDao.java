package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author huwenyong
 * @email 1405656862@qq.com
 * @date 2019-10-29 11:31:38
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
