package com.donggualahuo.api.order;

import com.donggualahuo.common.model.response.ResponseResult;
import com.donggualahuo.model.order.TbOrder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value="订单管理接口",description = "订单的增删改查")
public interface OrderControllerApi {

    @ApiOperation("下单")
    public ResponseResult addOrder(TbOrder tbOrder);

}
