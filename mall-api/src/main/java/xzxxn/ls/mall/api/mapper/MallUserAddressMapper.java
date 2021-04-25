package xzxxn.ls.mall.api.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import xzxxn.ls.mall.api.entity.MallUserAddress;

import java.util.List;

public interface MallUserAddressMapper extends BaseMapper<MallUserAddress> {
    /**
     * 根据用户id获取默认收货地址
     *
     * @param userId 用户id
     * @return 默认收货地址
     */
    MallUserAddress getMyDefaultAddress(Long userId);

    /**
     * 根据用户id获取用户的收货地址列表
     *
     * @param userId 用户id
     * @return 收货地址列表
     */
    List<MallUserAddress> findMyAddressList(Long userId);
}




