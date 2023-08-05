package com.sky.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sky.entity.Setmeal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Date: 2023/8/5 - 16:00
 * @Description: com.sky.mapper
 * @version: 1.0
 */
@Mapper
public interface SetmealMapper  extends BaseMapper<Setmeal> {
    @Select("select count(id) from setmeal where id = #{id};")
    Integer countByCategoryId(Long id);
}
