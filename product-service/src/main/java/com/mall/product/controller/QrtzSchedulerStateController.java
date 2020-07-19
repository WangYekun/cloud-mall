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

import com.mall.product.entity.QrtzSchedulerStateEntity;
import com.mall.product.service.QrtzSchedulerStateService;
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
@RequestMapping("product/qrtzschedulerstate")
public class QrtzSchedulerStateController {
    @Autowired
    private QrtzSchedulerStateService qrtzSchedulerStateService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:qrtzschedulerstate:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrtzSchedulerStateService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schedName}")
    // @RequiresPermissions("product:qrtzschedulerstate:info")
    public R info(@PathVariable("schedName") String schedName){
		QrtzSchedulerStateEntity qrtzSchedulerState = qrtzSchedulerStateService.getById(schedName);

        return R.ok().put("qrtzSchedulerState", qrtzSchedulerState);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:qrtzschedulerstate:save")
    public R save(@RequestBody QrtzSchedulerStateEntity qrtzSchedulerState){
		qrtzSchedulerStateService.save(qrtzSchedulerState);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:qrtzschedulerstate:update")
    public R update(@RequestBody QrtzSchedulerStateEntity qrtzSchedulerState){
		qrtzSchedulerStateService.updateById(qrtzSchedulerState);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:qrtzschedulerstate:delete")
    public R delete(@RequestBody String[] schedNames){
		qrtzSchedulerStateService.removeByIds(Arrays.asList(schedNames));

        return R.ok();
    }

}
