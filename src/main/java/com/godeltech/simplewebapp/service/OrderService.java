package com.godeltech.simplewebapp.service;

import com.godeltech.simplewebapp.domain.Order;
import com.godeltech.simplewebapp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    public void save(Order order){ orderRepository.save(order);
    }
}
