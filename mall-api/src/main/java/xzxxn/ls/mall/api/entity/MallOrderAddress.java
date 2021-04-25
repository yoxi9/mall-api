package xzxxn.ls.mall.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 订单收货地址关联表
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MallOrderAddress {
    private Long orderId;

    /**
    * 收货人姓名
    */
    private String userName;

    /**
    * 收货人手机号
    */
    private String userPhone;

    /**
    * 省
    */
    private String provinceName;

    /**
    * 城
    */
    private String cityName;

    /**
    * 区
    */
    private String regionName;

    /**
    * 收件详细地址(街道/楼宇/单元)
    */
    private String detailAddress;
}