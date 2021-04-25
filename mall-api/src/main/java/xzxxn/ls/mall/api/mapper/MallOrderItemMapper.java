package xzxxn.ls.mall.api.mapper;

import xzxxn.ls.mall.api.entity.MallOrderItem;

public interface MallOrderItemMapper {
    int deleteByPrimaryKey(Long orderItemId);

    int insert(MallOrderItem record);

    int insertSelective(MallOrderItem record);

    MallOrderItem selectByPrimaryKey(Long orderItemId);

    int updateByPrimaryKeySelective(MallOrderItem record);

    int updateByPrimaryKey(MallOrderItem record);
}