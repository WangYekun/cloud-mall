package com.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mall.product.entity.SmsSkuLadderEntity;
import com.mall.product.service.SmsSkuLadderService;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.R;



/**
 * 商品阶梯价格
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 14:18:31
 */
@RestController
@RequestMapping("product/smsskuladder")
public class SmsSkuLadderController {
    @Autowired
    private SmsSkuLadderService smsSkuLadderService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:smsskuladder:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsSkuLadderService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("product:smsskuladder:info")
    public R info(@PathVariable("id") Long id){
		SmsSkuLadderEntity smsSkuLadder = smsSkuLadderService.getById(id);

        return R.ok().put("smsSkuLadder", smsSkuLadder);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:smsskuladder:save")
    public R save(@RequestBody SmsSkuLadderEntity smsSkuLadder){
		smsSkuLadderService.save(smsSkuLadder);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:smsskuladder:update")
    public R update(@RequestBody SmsSkuLadderEntity smsSkuLadder){
		smsSkuLadderService.updateById(smsSkuLadder);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:smsskuladder:delete")
    public R delete(@RequestBody Long[] ids){
		smsSkuLadderService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
