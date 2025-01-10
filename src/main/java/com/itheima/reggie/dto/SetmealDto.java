package com.itheima.reggie.dto;

import com.itheima.reggie.entity.Setmeal;
import com.itheima.reggie.entity.SetmealDish;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

@Data
@ApiModel(value = "套餐DTO", description = "套餐数据传输对象")
public class SetmealDto extends Setmeal {

    @ApiModelProperty(value = "套餐菜品关系")
    private List<SetmealDish> setmealDishes;

    @ApiModelProperty(value = "分类名称")
    private String categoryName;
}
