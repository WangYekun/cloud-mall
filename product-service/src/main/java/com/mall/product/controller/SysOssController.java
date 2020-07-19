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

import com.mall.product.entity.SysOssEntity;
import com.mall.product.service.SysOssService;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.R;



/**
 * 文件上传
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 14:18:35
 */
@RestController
@RequestMapping("product/sysoss")
public class SysOssController {
    @Autowired
    private SysOssService sysOssService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:sysoss:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sysOssService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("product:sysoss:info")
    public R info(@PathVariable("id") Long id){
		SysOssEntity sysOss = sysOssService.getById(id);

        return R.ok().put("sysOss", sysOss);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:sysoss:save")
    public R save(@RequestBody SysOssEntity sysOss){
		sysOssService.save(sysOss);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:sysoss:update")
    public R update(@RequestBody SysOssEntity sysOss){
		sysOssService.updateById(sysOss);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:sysoss:delete")
    public R delete(@RequestBody Long[] ids){
		sysOssService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
