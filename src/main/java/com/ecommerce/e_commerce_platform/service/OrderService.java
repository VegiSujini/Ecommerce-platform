package com.ecommerce.e_commerce_platform.service;

import java.util.List;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.e_commerce_platform.entity.Order;
import com.ecommerce.e_commerce_platform.repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order saveOrders(Order order){
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order getOrderById(Long orderId){
        return orderRepository.findById(orderId).get();
    }

    public Order updateOrder(Order order){
        Order upadatedOrder = orderRepository.findById(order.getOrderId()).get();
        upadatedOrder.setOrderDate(order.getOrderDate());
        upadatedOrder.setTotalAmount(order.getTotalAmount());
        upadatedOrder.setStatus(order.isStatus());
        upadatedOrder.setCustomers(order.getCustomers());
        return orderRepository.save(upadatedOrder);
    }

}
