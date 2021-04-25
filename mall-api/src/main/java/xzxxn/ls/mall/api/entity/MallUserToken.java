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
public class MallUserToken {
    /**
    * 用户主键id
    */
    private Long userId;

    /**
    * token值(32位字符串)
    */
    private String token;

    /**
    * 修改时间
    */
    private Date updateTime;

    /**
    * token过期时间
    */
    private Date expireTime;
}