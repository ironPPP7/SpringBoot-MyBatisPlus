package com.example.demo.entity;

    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import java.time.LocalDateTime;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 用户第三方账号绑定表
    * </p>
*
* @author yang
* @since 2020-04-02
*/
    @Data
    @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class TUserBind extends Model<TUserBind> {

    private static final long serialVersionUID = 1L;

            /**
            * 主键id
            */
    private Long id;

            /**
            * 用户id
            */
    private Long userId;

            /**
            * 微信openid
            */
    private String wxOpenId;

            /**
            * 微信union_id
            */
    private String wxUnionId;

            /**
            * 微信绑定时间
            */
    private LocalDateTime wxBindTime;

            /**
            * qq  open_id
            */
    private String qqOpenId;

            /**
            * QQ 绑定时间
            */
    private LocalDateTime qqBindTime;

            /**
            * 新浪微博open_id
            */
    private String sinaOpenId;

            /**
            * 新浪微博绑定时间
            */
    private LocalDateTime sinaBindTime;

            /**
            * 创建时间
            */
    private LocalDateTime createTime;

            /**
            * 更新时间
            */
    private LocalDateTime updateTime;

            /**
            * 版本号
            */
    private Integer version;

            /**
            * 备注
            */
    private String remark;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
