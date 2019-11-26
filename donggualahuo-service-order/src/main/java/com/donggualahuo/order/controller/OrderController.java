package com.donggualahuo.order.controller;

import com.donggualahuo.api.order.OrderControllerApi;
import com.donggualahuo.common.model.response.ResponseResult;
import com.donggualahuo.model.order.TbOrder;
import com.donggualahuo.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController implements OrderControllerApi {

    @Autowired
    private OrderService orderService;


    @Override
    @PostMapping("/addOeder")
    public ResponseResult addOrder(@RequestBody TbOrder tbOrder){
        return orderService.addOrder(tbOrder);
    }
}
