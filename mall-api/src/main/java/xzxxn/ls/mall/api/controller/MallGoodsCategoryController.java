package xzxxn.ls.mall.api.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xzxxn.ls.mall.api.common.MallException;
import xzxxn.ls.mall.api.common.ServiceResultEnum;
import xzxxn.ls.mall.api.controller.vo.MallIndexCategoryVO;
import xzxxn.ls.mall.api.service.MallGoodsCategoryService;
import xzxxn.ls.mall.api.util.Result;
import xzxxn.ls.mall.api.util.ResultGenerator;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "v1", tags = "4.楼楼商城分类页面接口")
@RequestMapping("/api/v1")
public class MallGoodsCategoryController {
    @Resource
    private MallGoodsCategoryService mallGoodsCategoryService;

    @GetMapping("/categories")
    @ApiOperation(value = "获取分类数据", notes = "分类页面使用")
    public Result getCategories() {
        List<MallIndexCategoryVO> categories = mallGoodsCategoryService.getCategoriesForIndex();
        if (CollectionUtils.isEmpty(categories)) {
            MallException.fail(ServiceResultEnum.DATA_NOT_EXIST.getResult());
        }
        return ResultGenerator.genSuccessResult(categories);
    }
}
