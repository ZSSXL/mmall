package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.vo.OrderVo;

import java.util.Map;

public interface IOrderService {

    /**
     * 支付
     * @param orderNo 订单号
     * @param userId
     * @param path
     * @return
     */
    ServerResponse pay(Long orderNo, Integer userId, String path);

    /**
     * 回调处理
     * @param params
     * @return
     */
    ServerResponse aliCallBack(Map<String,String> params);

    /**
     * 查看订单状态
     * @param userId
     * @param orderNo
     * @return
     */
    ServerResponse queryOrderPayStatus(Integer userId,Long orderNo);


    /**
     * 创建订单
     * @param userId
     * @param shippingId
     * @return
     */
    ServerResponse createOrder(Integer userId,Integer shippingId);

    /**
     * 取校订单
     * @param userId
     * @param orderNo
     * @return
     */
    ServerResponse<String> cancel(Integer userId,Long orderNo);

    /**
     * 获取购物车详情
     * @param userId
     * @return
     */
    ServerResponse getOrderCartProduct(Integer userId);

    /**
     * 获取订单详情
     * @param userId
     * @param orderNo
     * @return
     */
    ServerResponse<OrderVo> getOrderDetail(Integer userId, Long orderNo);

    /**
     * 获取订单列表
     * @param userId
     * @param pageSize
     * @param pageNum
     * @return
     */
    ServerResponse<PageInfo> getOrderList(Integer userId, int pageSize, int pageNum);

    /***********************************   backend  ***************************************/

    /**
     * 管理员订单管理
     * @param pageNum
     * @param pageSize
     * @return
     */
    ServerResponse<PageInfo> manageList(int pageNum,int pageSize);

    /**
     * 管理订单详细
     * @param orderNo
     * @return
     */
    ServerResponse<OrderVo> manageDetail(Long orderNo);

    /**
     * 搜索订单
     * @param orderNo
     * @param pageNum
     * @param pageSize
     * @return
     */
    ServerResponse<PageInfo> manageSearch(Long orderNo,int pageNum,int pageSize);

    /**
     * 发货请求
     * @param orderNo
     * @return
     */
    ServerResponse<String> manageSendGoods(Long orderNo);
}
