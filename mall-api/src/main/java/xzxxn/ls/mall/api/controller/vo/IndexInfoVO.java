package xzxxn.ls.mall.api.controller.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class IndexInfoVO implements Serializable {
    @ApiModelProperty("轮播图(列表)")
    private List<MallIndexCarouselVO> carousels;

    @ApiModelProperty("首页热销商品(列表)")
    private List<MallIndexGoodsVO> hotGoods;

    @ApiModelProperty("首页新品推荐(列表)")
    private List<MallIndexGoodsVO> newGoods;

    @ApiModelProperty("首页推荐商品(列表)")
    private List<MallIndexGoodsVO> recommendGoods;
}
