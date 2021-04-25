package xzxxn.ls.mall.api.mapper;

import xzxxn.ls.mall.api.entity.MallUserToken;

public interface MallUserTokenMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(MallUserToken record);

    int insertSelective(MallUserToken record);

    MallUserToken selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(MallUserToken record);

    int updateByPrimaryKey(MallUserToken record);

    MallUserToken selectByToken(String token);
}