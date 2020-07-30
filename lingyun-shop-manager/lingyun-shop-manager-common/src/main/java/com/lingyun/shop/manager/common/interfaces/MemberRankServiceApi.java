package com.lingyun.shop.manager.common.interfaces;

import com.lingyun.shop.manager.common.entity.MemberRank;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface MemberRankServiceApi {

    @RequestMapping(value = "/findAll", method = RequestMethod.POST)
    public List<MemberRank> findAll(@RequestBody MemberRank memberRank);

    @RequestMapping(value = "/deleteMemberRank", method = RequestMethod.POST)
    public void deleteMemberRank(@RequestParam(value = "id") Long id);
}
