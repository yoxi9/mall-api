package xzxxn.ls.mall.api.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MallOrderItem {
    /**
    * 订单关联购物项主键id
    */
    private Long orderItemId;

    /**
    * 订单主键id
    */
    private Long orderId;

    /**
    * 关联商品id
    */
    private Long goodsId;

    /**
    * 下单时商品的名称(订单快照)
    */
    private String goodsName;

    /**
    * 下单时商品的主图(订单快照)
    */
    private String goodsCoverImg;

    /**
    * 下单时商品的价格(订单快照)
    */
    private Integer sellingPrice;

    /**
    * 数量(订单快照)
    */
    private Integer goodsCount;

    /**
    * 创建时间
    */
    private Date createTime;
}