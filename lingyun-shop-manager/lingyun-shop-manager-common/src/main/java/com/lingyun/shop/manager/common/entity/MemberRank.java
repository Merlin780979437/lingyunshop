package com.lingyun.shop.manager.common.entity;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Accessors(chain = true)
@ToString
public class MemberRank implements Serializable {
    private Long id;

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private BigDecimal amount;

    private Boolean isdefault;

    private Boolean isspecial;

    private String name;

    private Double scale;

}