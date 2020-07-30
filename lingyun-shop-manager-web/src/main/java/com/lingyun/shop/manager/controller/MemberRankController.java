package com.lingyun.shop.manager.controller;

import com.lingyun.shop.manager.common.entity.MemberRank;
import com.lingyun.shop.manager.common.pojo.Result;
import com.lingyun.shop.manager.service.MemberRankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/memberRank")
public class MemberRankController {

    @Autowired
    private MemberRankService memberRankService;

    @RequestMapping("/findAll")
    public List<MemberRank> findAll(MemberRank memberRank) {
        return memberRankService.findAll(memberRank);
    }

    @RequestMapping("/deleteMemberRank")
    public Result deleteMemberRank(Long id) {
        try {
            memberRankService.deleteMemberRank(id);
            return new Result(true, "删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败！");
        }
    }

}
