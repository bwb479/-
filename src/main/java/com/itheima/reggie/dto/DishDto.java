package com.itheima.reggie.dto;

import com.itheima.reggie.entity.Dish;
import com.itheima.reggie.entity.DishFlavor;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

@Data
@ApiModel(value = "菜品DTO", description = "菜品数据传输对象")
public class DishDto extends Dish {

    @ApiModelProperty(value = "菜品口味列表")
    private List<DishFlavor> flavors = new ArrayList<>();

    @ApiModelProperty(value = "分类名称")
    private String categoryName;

    @ApiModelProperty(value = "份数")
    private Integer copies;
}
