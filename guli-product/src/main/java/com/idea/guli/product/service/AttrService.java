package com.idea.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.idea.common.utils.PageUtils;
import com.idea.guli.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author lts
 * @email j2568095536@gmail.com
 * @date 2022-10-09 15:49:10
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

