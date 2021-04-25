package xzxxn.ls.mall.api.mapper;

import xzxxn.ls.mall.api.entity.MallCarousel;

public interface MallCarouselMapper {
    int deleteByPrimaryKey(Integer carouselId);

    int insert(MallCarousel record);

    int insertSelective(MallCarousel record);

    MallCarousel selectByPrimaryKey(Integer carouselId);

    int updateByPrimaryKeySelective(MallCarousel record);

    int updateByPrimaryKey(MallCarousel record);
}