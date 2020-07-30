package com.lingyun.shop.manager.controller;

import com.lingyun.shop.manager.common.entity.MemberRank;
import com.lingyun.shop.manager.service.MemberRankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private MemberRankService memberRankService;

    @RequestMapping("/memberRankList")
    public String memberRankList(MemberRank memberRank, Model model) {

        List<MemberRank> memberRankList = memberRankService.findAll(memberRank);
        model.addAttribute("memberRankList", memberRankList);
        return "admin/member_rank/list";
    }

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "上官飞燕");
        return "admin/index";
    }
}
