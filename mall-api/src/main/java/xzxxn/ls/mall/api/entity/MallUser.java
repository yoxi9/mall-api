package xzxxn.ls.mall.api.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MallUser {
    /**
    * 用户主键id
    */
    private Long userId;

    /**
    * 用户昵称
    */
    private String nickName;

    /**
    * 登陆名称(默认为手机号)
    */
    private String loginName;

    /**
    * MD5加密后的密码
    */
    private String passwordMd5;

    /**
    * 个性签名
    */
    private String introduceSign;

    private String address;

    /**
    * 注销标识字段(0-正常 1-已注销)
    */
    private Byte isDeleted;

    /**
    * 锁定标识字段(0-未锁定 1-已锁定)
    */
    private Byte lockedFlag;

    /**
    * 注册时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
}