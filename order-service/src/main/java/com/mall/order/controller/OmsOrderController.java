package com.mall.order.controller;

import java.util.Arrays;
import java.util.Map;

import com.mall.order.entity.OmsOrderEntity;
import com.mall.order.service.OmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mall.common.utils.PageUtils;
import com.mall.common.utils.R;



/**
 * 订单
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 15:31:41
 */
@RestController
@RequestMapping("product/omsorder")
public class OmsOrderController {
    @Autowired
    private OmsOrderService omsOrderService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:omsorder:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = omsOrderService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("product:omsorder:info")
    public R info(@PathVariable("id") Long id){
		OmsOrderEntity omsOrder = omsOrderService.getById(id);

        return R.ok().put("omsOrder", omsOrder);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:omsorder:save")
    public R save(@RequestBody OmsOrderEntity omsOrder){
		omsOrderService.save(omsOrder);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:omsorder:update")
    public R update(@RequestBody OmsOrderEntity omsOrder){
		omsOrderService.updateById(omsOrder);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:omsorder:delete")
    public R delete(@RequestBody Long[] ids){
		omsOrderService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
