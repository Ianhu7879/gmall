package com.atguigu.gmall.sms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品sku积分设置
 * 
 * @author huwenyong
 * @email 1405656862@qq.com
 * @date 2019-10-29 12:00:29
 */
@ApiModel
@Data
@TableName("sms_sku_bounds")
public class SkuBoundsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private Long id;
	/**
	 * 
	 */
	@ApiModelProperty(name = "skuId",value = "")
	private Long skuId;
	/**
	 * 成长积分
	 */
	@ApiModelProperty(name = "growBounds",value = "成长积分")
	private BigDecimal growBounds;
	/**
	 * 购物积分
	 */
	@ApiModelProperty(name = "buyBounds",value = "购物积分")
	private BigDecimal buyBounds;
	/**
	 * 优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]
	 */
	@ApiModelProperty(name = "work",value = "优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]")
	private Integer work;

}
