package com.donggualahuo.order.dao;

import com.donggualahuo.model.order.TbOrder;
import org.hibernate.criterion.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<TbOrder,String> {

}
