package com.lingyun.shop.manager.controller;

import com.lingyun.shop.manager.common.entity.MemberRank;
import com.lingyun.shop.manager.common.interfaces.MemberRankServiceApi;
import com.lingyun.shop.manager.service.MemberRankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberRankController implements MemberRankServiceApi {

    @Autowired
    private MemberRankService memberRankService;

    @Override
    public List<MemberRank> findAll(MemberRank memberRank) {
        return memberRankService.findAll(memberRank);
    }

    @Override
    public void deleteMemberRank(Long id) {
        memberRankService.deleteMemberRank(id);
    }
}
