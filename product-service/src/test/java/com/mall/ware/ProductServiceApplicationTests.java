package com.mall.ware;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.product.entity.BrandEntity;
import com.mall.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class ProductServiceApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("iPhone");
        brandService.save(brandEntity);
        log.info("################ create is ok ###############");
    }

    @Test
    void testUpdate() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为");
        brandService.updateById(brandEntity);
        log.info("################ update is ok ###############");
    }

    @Test
    void QueryAll() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为");
        List<BrandEntity> brandEntityList = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brandEntityList.forEach(System.out::println);
        log.info("################ query is ok ###############");
    }

}
