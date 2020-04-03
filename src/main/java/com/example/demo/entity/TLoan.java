package com.example.demo.entity;

    import java.math.BigDecimal;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 工单借据信息表
    * </p>
*
* @author yang
* @since 2020-04-02
*/
    @Data
    @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class TLoan extends Model<TLoan> {

    private static final long serialVersionUID = 1L;

            /**
            * 主键
            */
    private Long id;

            /**
            * 用户ID
            */
    private Long userId;

            /**
            * 客户ID
            */
    private Long custId;

            /**
            * 子账户ID
            */
    private Long subAcctId;

            /**
            * 借据编号
            */
    private String loanNo;

            /**
            * 借款展示状态：10未通过，20待收款，30还款中，40已结清
            */
    private String showStatus;

            /**
            * 借据状态：100待审核，110APP审核中，111APP审核成功，112APP审核失败，200下单成功，201下单失败，300放款中，301放款失败，400还款中，500已逾期，600已结清
            */
    private String loanStatus;

            /**
            * 锁定标识：00无，10主动还款锁定
            */
    private String lockFlag;

            /**
            * 资金机构编号
            */
    private String fundNo;

            /**
            * 产品ID
            */
    private Long productId;

            /**
            * 申请借款金额
            */
    private BigDecimal applyAmt;

            /**
            * 申请借款期限
            */
    private Integer applyPhase;

            /**
            * 申请贷款分期单位：Y年，M月，D日
            */
    private String applyPhaseUnit;

            /**
            * 申请借款时间
            */
    private LocalDateTime applyTime;

            /**
            * 申请借款用途
            */
    private String applyPurpose;

            /**
            * 放款方式
            */
    private String lenderMethod;

            /**
            * 放款成功时间
            */
    private LocalDateTime lenderTime;

            /**
            * 实际放款金额
            */
    private BigDecimal lenderAmt;

            /**
            * 放款卡ID
            */
    private Long lenderCardId;

            /**
            * 还款卡ID
            */
    private Long repayCardId;

            /**
            * 还款方式：1-按月付息到期还款 2-到期一次还本付息 3-等额本息 4-分期等额 5-等额本金 6-等本等息 7按天一次性还本付息 8.利随本清 9到期还本 10先息后本 11约定还款 12其他方式
            */
    private String repayWay;

            /**
            * 合同开始日期
            */
    private LocalDate loanStartDate;

            /**
            * 合同结束日期
            */
    private LocalDate loanEndDate;

            /**
            * 还款开始时间
            */
    private LocalDate repayStartDate;

            /**
            * 还款结束时间
            */
    private LocalDate repayEndDate;

            /**
            * 首次还款额
            */
    private BigDecimal firstRepayAmt;

            /**
            * 首次还款日
            */
    private LocalDate firstRepayDate;

            /**
            * 每月还款日
            */
    private LocalDate mthRepayDate;

            /**
            * 月还款金额
            */
    private BigDecimal mthRepayAmt;

            /**
            * 起息日
            */
    private LocalDate interestCalcDate;

            /**
            * 结清时间
            */
    private LocalDateTime settleTime;

            /**
            * 结清金额
            */
    private BigDecimal settleAmt;

            /**
            * 版本号
            */
    private Integer version;

            /**
            * 创建时间
            */
    private LocalDateTime createTime;

            /**
            * 更新时间
            */
    private LocalDateTime updateTime;

            /**
            * 备注
            */
    private String remark;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
