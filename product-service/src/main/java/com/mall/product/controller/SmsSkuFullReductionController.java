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

import com.mall.product.entity.SmsSkuFullReductionEntity;
import com.mall.product.service.SmsSkuFullReductionService;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.R;



/**
 * 商品满减信息
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 14:18:32
 */
@RestController
@RequestMapping("product/smsskufullreduction")
public class SmsSkuFullReductionController {
    @Autowired
    private SmsSkuFullReductionService smsSkuFullReductionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:smsskufullreduction:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsSkuFullReductionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("product:smsskufullreduction:info")
    public R info(@PathVariable("id") Long id){
		SmsSkuFullReductionEntity smsSkuFullReduction = smsSkuFullReductionService.getById(id);

        return R.ok().put("smsSkuFullReduction", smsSkuFullReduction);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:smsskufullreduction:save")
    public R save(@RequestBody SmsSkuFullReductionEntity smsSkuFullReduction){
		smsSkuFullReductionService.save(smsSkuFullReduction);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:smsskufullreduction:update")
    public R update(@RequestBody SmsSkuFullReductionEntity smsSkuFullReduction){
		smsSkuFullReductionService.updateById(smsSkuFullReduction);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:smsskufullreduction:delete")
    public R delete(@RequestBody Long[] ids){
		smsSkuFullReductionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
