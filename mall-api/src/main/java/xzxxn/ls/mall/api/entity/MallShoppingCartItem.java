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
public class MallShoppingCartItem {
    /**
    * 购物项主键id
    */
    private Long cartItemId;

    /**
    * 用户主键id
    */
    private Long userId;

    /**
    * 关联商品id
    */
    private Long goodsId;

    /**
    * 数量(最大为5)
    */
    private Integer goodsCount;

    /**
    * 删除标识字段(0-未删除 1-已删除)
    */
    private Byte isDeleted;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 最新修改时间
    */
    private Date updateTime;
}