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
public class MallGoodsInfo {
    /**
    * 商品表主键id
    */
    private Long goodsId;

    /**
    * 商品名
    */
    private String goodsName;

    /**
    * 商品简介
    */
    private String goodsIntro;

    /**
    * 关联分类id
    */
    private Long goodsCategoryId;

    /**
    * 商品主图
    */
    private String goodsCoverImg;

    /**
    * 商品轮播图
    */
    private String goodsCarousel;

    /**
    * 商品详情
    */
    private String goodsDetailContent;

    /**
    * 商品价格
    */
    private Integer originalPrice;

    /**
    * 商品实际售价
    */
    private Integer sellingPrice;

    /**
    * 商品库存数量
    */
    private Integer stockNum;

    /**
    * 商品标签
    */
    private String tag;

    /**
    * 商品上架状态 0-下架 1-上架
    */
    private Byte goodsSellStatus;

    /**
    * 添加者主键id
    */
    private Integer createUser;

    /**
    * 商品添加时间
    */
    private Date createTime;

    /**
    * 修改者主键id
    */
    private Integer updateUser;

    /**
    * 商品修改时间
    */
    private Date updateTime;
}