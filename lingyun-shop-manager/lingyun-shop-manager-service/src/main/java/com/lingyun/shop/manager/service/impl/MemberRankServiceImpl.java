package com.lingyun.shop.manager.service.impl;

import com.lingyun.shop.manager.common.entity.MemberRank;
import com.lingyun.shop.manager.dao.MemberRankMapper;
import com.lingyun.shop.manager.service.MemberRankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberRankServiceImpl implements MemberRankService {

    @Autowired
    private MemberRankMapper memberRankMapper;

    @Override
    public List<MemberRank> findAll(MemberRank memberRank) {
        return memberRankMapper.findAll(memberRank);
    }

    @Override
    public void deleteMemberRank(Long id) {
        memberRankMapper.deleteByPrimaryKey(id);
    }
}
