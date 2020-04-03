package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.TLoan;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 工单借据信息表 服务类
 * </p>
 *
 * @author yang
 * @since 2020-04-02
 */
public interface TLoanService extends IService<TLoan> {
    IPage<TLoan> selectUserPage(Page<TLoan> page);
}
