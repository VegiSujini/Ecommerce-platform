package com.ecommerce.e_commerce_platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.e_commerce_platform.entity.Order;
import com.ecommerce.e_commerce_platform.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService OrderService;

    @PostMapping
    public Order saveOrder(@RequestBody Order Order) {
        return OrderService.saveOrders(Order);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return OrderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return OrderService.getOrderById(id);
    }

    @PutMapping("/{id}")
    public Order updateOrderById(@PathVariable Long id, @RequestBody Order Order) {
        Order.setOrderId(id);
        return OrderService.updateOrder(Order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrderById(@PathVariable Long id) {
        OrderService.deleteOrderById(id);
    }
}
