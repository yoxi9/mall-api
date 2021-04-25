package xzxxn.ls.mall.api.controller.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户修改param * @author mqxu
 */
@Data
public class MallUserUpdateParam implements Serializable {
    @ApiModelProperty("用户昵称")
    private String nickName;
    @ApiModelProperty("用户密码(需要MD5加密)")
    private String passwordMd5;
    @ApiModelProperty("个性签名")
    private String introduceSign;
}
