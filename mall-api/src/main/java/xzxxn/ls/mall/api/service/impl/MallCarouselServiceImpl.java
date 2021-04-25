package xzxxn.ls.mall.api.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import xzxxn.ls.mall.api.controller.vo.MallIndexCarouselVO;
import xzxxn.ls.mall.api.entity.MallCarousel;
import xzxxn.ls.mall.api.mapper.MallCarouselMapper;
import xzxxn.ls.mall.api.service.MallCarouselService;
import xzxxn.ls.mall.api.util.BaseBeanUtil;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class MallCarouselServiceImpl  implements MallCarouselService {
    @Resource
    private MallCarouselMapper mallCarouselMapper;

    @Override
    public List<MallIndexCarouselVO> getCarouselsForIndex(int number) {
        List<MallIndexCarouselVO> list = new ArrayList<>(number);
        List<MallCarousel> carousels = mallCarouselMapper.findCarouselsByNum(number);
        if (!CollectionUtils.isEmpty(carousels)) {
            list = BaseBeanUtil.copyList(carousels, MallIndexCarouselVO.class);
        }
        return list;
    }
}
