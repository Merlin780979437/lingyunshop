package com.lingyun.shop.manager.service;

import com.lingyun.shop.manager.common.entity.MemberRank;

import java.util.List;

public interface MemberRankService {

    /**
     * 查询所有会员等级
     *
     * @param memberRank
     * @return
     */
    public List<MemberRank> findAll(MemberRank memberRank);

    /**
     * 删除会员等级
     *
     * @param id
     */
    public void deleteMemberRank(Long id);
}
