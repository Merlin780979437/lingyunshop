<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>测试模板</title>
</head>
<body>
<#-- 测试模板输出信息 -->
${name}, 你好，信息为：${message}

<#assign linkman="周先生">
联系人：${linkman}
<br/>
<#assign info={"mobile":"17819022897","address":"山西洪洞大槐树"}>
电话：${info.mobile}, 地址：${info.address}

<br/>
<#include "head.ftl">

<br>

<#if success=true>
你已经通过实名认证

<#else>
你未通过实名认证
</#if>
<br>

<#list goodsList as goods>
${goods_index + 1} 商品名称：${goods.name} 价格： ${goods.price}<br>
</#list>

共 ${goodsList?size} 条信息

<br>
<#assign text="{'bank':'工商银行','account':'10101920201920212'}" />

<#assign data=text?eval>

银行：${data.bank}, 账户：${data.account}
<br>
当前日期：${today?date}<br>
当前时间：${today?time}<br>
当前时间和日期：${today?datetime}<br>
时间格式化:${today?string("yyyy年MM月")}

<br>
积分累计：${point?c}

<br>
<#if aaa??>
aaa变量存在
<#else>
aaa变量不存在
</#if>

<br>
默认展示: ${bbbb!'-'}

</body>
</html>