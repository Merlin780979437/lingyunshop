package com.lingyun.shop.manager.service;

import com.lingyun.shop.manager.common.interfaces.MemberRankServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "lingyun-shop-manager-service")
public interface MemberRankService extends MemberRankServiceApi {

}
