package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.TLoan;
import com.example.demo.mapper.TLoanMapper;
import com.example.demo.service.TLoanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 工单借据信息表 服务实现类
 * </p>
 *
 * @author yang
 * @since 2020-04-02
 */
@Service
public class TLoanServiceImpl extends ServiceImpl<TLoanMapper, TLoan> implements TLoanService {

    @Resource
    private TLoanMapper tLoanMapper;

    public IPage<TLoan> selectUserPage(Page<TLoan> page) {
        // 不进行 count sql 优化，解决 MP 无法自动优化 SQL 问题，这时候你需要自己查询 count 部分
        // page.setOptimizeCountSql(false);
        // 当 total 为小于 0 或者设置 setSearchCount(false) 分页插件不会进行 count 查询
        // 要点!! 分页返回的对象与传入的对象是同一个
        return tLoanMapper.selectPage(page, null);
    }
}
