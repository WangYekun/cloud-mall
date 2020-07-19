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

import com.mall.product.entity.QrtzSimpleTriggersEntity;
import com.mall.product.service.QrtzSimpleTriggersService;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.R;



/**
 * 
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 14:18:35
 */
@RestController
@RequestMapping("product/qrtzsimpletriggers")
public class QrtzSimpleTriggersController {
    @Autowired
    private QrtzSimpleTriggersService qrtzSimpleTriggersService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:qrtzsimpletriggers:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrtzSimpleTriggersService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schedName}")
    // @RequiresPermissions("product:qrtzsimpletriggers:info")
    public R info(@PathVariable("schedName") String schedName){
		QrtzSimpleTriggersEntity qrtzSimpleTriggers = qrtzSimpleTriggersService.getById(schedName);

        return R.ok().put("qrtzSimpleTriggers", qrtzSimpleTriggers);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:qrtzsimpletriggers:save")
    public R save(@RequestBody QrtzSimpleTriggersEntity qrtzSimpleTriggers){
		qrtzSimpleTriggersService.save(qrtzSimpleTriggers);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:qrtzsimpletriggers:update")
    public R update(@RequestBody QrtzSimpleTriggersEntity qrtzSimpleTriggers){
		qrtzSimpleTriggersService.updateById(qrtzSimpleTriggers);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:qrtzsimpletriggers:delete")
    public R delete(@RequestBody String[] schedNames){
		qrtzSimpleTriggersService.removeByIds(Arrays.asList(schedNames));

        return R.ok();
    }

}
