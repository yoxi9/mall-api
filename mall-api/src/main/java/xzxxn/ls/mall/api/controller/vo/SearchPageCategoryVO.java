package xzxxn.ls.mall.api.controller.vo;


import lombok.Data;
import xzxxn.ls.mall.api.entity.MallGoodsCategory;

import java.io.Serializable;
import java.util.List;

@Data
public class SearchPageCategoryVO implements Serializable {

    private String firstLevelCategoryName;

    private List<MallGoodsCategory> secondLevelCategoryList;

    private String secondLevelCategoryName;

    private List<MallGoodsCategory> thirdLevelCategoryList;

    private String currentCategoryName;

}
