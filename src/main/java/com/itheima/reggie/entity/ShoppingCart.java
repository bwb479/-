package com.itheima.reggie.entity;

import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 购物车
 */
@Data
@ApiModel(value = "购物车对象", description = "购物车信息")
public class ShoppingCart implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "菜品id")
    private Long dishId;

    @ApiModelProperty(value = "套餐id")
    private Long setmealId;

    @ApiModelProperty(value = "口味")
    private String dishFlavor;

    @ApiModelProperty(value = "数量")
    private Integer number;

    @ApiModelProperty(value = "金额")
    private BigDecimal amount;

    @ApiModelProperty(value = "图片")
    private String image;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;
}
