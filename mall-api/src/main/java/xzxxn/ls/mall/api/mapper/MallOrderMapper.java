package xzxxn.ls.mall.api.mapper;

import xzxxn.ls.mall.api.entity.MallOrder;

public interface MallOrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(MallOrder record);

    int insertSelective(MallOrder record);

    MallOrder selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(MallOrder record);

    int updateByPrimaryKey(MallOrder record);
}