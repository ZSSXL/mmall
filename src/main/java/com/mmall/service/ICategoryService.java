package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

public interface ICategoryService {

    /**
     * 添加品类
     * @param categoryName
     * @param parendId
     * @return
     */
    ServerResponse addCategory(String categoryName, Integer parendId);

    /**
     * 更新品类名字
     * @param categoryId
     * @param categoryName
     * @return
     */
    ServerResponse updateCategroyName(Integer categoryId, String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    /**
     * 递归查询本届点的id及孩子几点的id
     * @param categoryId
     * @return
     */
    ServerResponse<List<Integer>> selectCategoryAndChildById(Integer categoryId);
}
