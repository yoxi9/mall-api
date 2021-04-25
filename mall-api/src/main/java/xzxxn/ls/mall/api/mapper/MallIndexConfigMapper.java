package xzxxn.ls.mall.api.mapper;

import xzxxn.ls.mall.api.entity.MallIndexConfig;

public interface MallIndexConfigMapper {
    int deleteByPrimaryKey(Long configId);

    int insert(MallIndexConfig record);

    int insertSelective(MallIndexConfig record);

    MallIndexConfig selectByPrimaryKey(Long configId);

    int updateByPrimaryKeySelective(MallIndexConfig record);

    int updateByPrimaryKey(MallIndexConfig record);
}