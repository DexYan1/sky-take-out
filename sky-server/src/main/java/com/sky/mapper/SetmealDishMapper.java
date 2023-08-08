package com.sky.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Date: 2023/8/8 - 16:34
 * @Description: com.sky.mapper
 * @version: 1.0
 */
@Mapper
public interface SetmealDishMapper extends BaseMapper<SetmealDish> {

    /**
     * 根据菜品id查询对应的套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
