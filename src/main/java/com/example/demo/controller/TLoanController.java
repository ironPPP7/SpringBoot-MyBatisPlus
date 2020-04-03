package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.TLoan;
import com.example.demo.mapper.TLoanMapper;
import com.example.demo.service.TLoanService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

/**
 * <p>
 * 工单借据信息表 前端控制器
 * </p>
 *
 * @author yang
 * @since 2020-04-02
 */
@RestController
@RequestMapping("/t-loan")
public class TLoanController {

    @Resource
    private TLoanMapper tLoanMapper;
    @Resource
    private TLoanService tLoanService;

    @GetMapping("hello")
    public TLoan hello(){
        QueryWrapper<TLoan> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", "649692808882348032");
        return tLoanMapper.selectOne(queryWrapper);
    }

    /**
     * 分页 PAGE
     */
    @GetMapping("/test")
    public IPage<TLoan> test() {
        return tLoanService.selectUserPage(new Page(0, 12));
    }
}
