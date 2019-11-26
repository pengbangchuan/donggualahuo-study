package com.donggualahuo.model.order;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@ToString
@Entity
@Data
@Table(name="tb_order")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class TbOrder implements Serializable{

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "order_number",length = 32)
    private String orderNumber;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "start_addr")
    private String startAddr;

    @Column(name = "end_addr")
    private String endAddr;

    private Double price;

    private Date appointment;

    private String name;

    private String phone;

    private String msg;

    @Column(name = "pay_method")
    private String payMethod;

    private Date createtime;

    private Date updatetime;

}
