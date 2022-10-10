package com.idea.guli.product;

import com.idea.guli.product.entity.BrandEntity;
import com.idea.guli.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GuliProductApplicationTests {
    @Autowired
    public BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("");
        brandEntity.setName("小米");

        brandService.save(brandEntity);
        System.out.println("do save success");
    }

}
