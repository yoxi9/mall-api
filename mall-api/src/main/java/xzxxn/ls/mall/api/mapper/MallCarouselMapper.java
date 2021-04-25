package xzxxn.ls.mall.api.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import xzxxn.ls.mall.api.entity.MallCarousel;

import java.util.List;

public interface MallCarouselMapper extends BaseMapper<MallCarousel> {
    /**
     * 查询number个轮播图数据
     *
     * @param number 数量
     * @return 轮播图
     */
    List<MallCarousel> findCarouselsByNum(@Param("number") int number);
}




