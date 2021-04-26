package xzxxn.ls.mall.api.controller.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class MallUserVO implements Serializable {

    @ApiModelProperty("用户昵称")
    private String nickName;

    @ApiModelProperty("用户登录名")
    private String loginName;

    @ApiModelProperty("个性签名")
    private String introduceSign;

    @ApiModelProperty("个人头像")
    private String avatar;
}
