package com.mall.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.mall.member.entity.UmsMemberCollectSpuEntity;
import com.mall.member.service.UmsMemberCollectSpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mall.common.utils.PageUtils;
import com.mall.common.utils.R;



/**
 * 会员收藏的商品
 *
 * @author mark
 * @email Wyl@gmail.com
 * @date 2020-07-19 15:31:09
 */
@RestController
@RequestMapping("product/umsmembercollectspu")
public class UmsMemberCollectSpuController {
    @Autowired
    private UmsMemberCollectSpuService umsMemberCollectSpuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:umsmembercollectspu:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsMemberCollectSpuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("product:umsmembercollectspu:info")
    public R info(@PathVariable("id") Long id){
		UmsMemberCollectSpuEntity umsMemberCollectSpu = umsMemberCollectSpuService.getById(id);

        return R.ok().put("umsMemberCollectSpu", umsMemberCollectSpu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:umsmembercollectspu:save")
    public R save(@RequestBody UmsMemberCollectSpuEntity umsMemberCollectSpu){
		umsMemberCollectSpuService.save(umsMemberCollectSpu);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:umsmembercollectspu:update")
    public R update(@RequestBody UmsMemberCollectSpuEntity umsMemberCollectSpu){
		umsMemberCollectSpuService.updateById(umsMemberCollectSpu);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:umsmembercollectspu:delete")
    public R delete(@RequestBody Long[] ids){
		umsMemberCollectSpuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
