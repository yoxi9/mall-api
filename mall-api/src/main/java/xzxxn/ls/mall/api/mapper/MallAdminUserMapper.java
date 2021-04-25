package xzxxn.ls.mall.api.mapper;

import xzxxn.ls.mall.api.entity.MallAdminUser;

public interface MallAdminUserMapper {
    int deleteByPrimaryKey(Integer adminUserId);

    int insert(MallAdminUser record);

    int insertSelective(MallAdminUser record);

    MallAdminUser selectByPrimaryKey(Integer adminUserId);

    int updateByPrimaryKeySelective(MallAdminUser record);

    int updateByPrimaryKey(MallAdminUser record);
}