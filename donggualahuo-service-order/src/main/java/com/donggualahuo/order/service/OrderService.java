package com.donggualahuo.order.service;

import com.donggualahuo.common.model.response.CommonCode;
import com.donggualahuo.common.model.response.ResponseResult;
import com.donggualahuo.model.order.TbOrder;
import com.donggualahuo.order.dao.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public ResponseResult addOrder(TbOrder tbOrder){
        TbOrder order = orderRepository.save(tbOrder);
        return new ResponseResult(CommonCode.SUCCESS);
    }
}
