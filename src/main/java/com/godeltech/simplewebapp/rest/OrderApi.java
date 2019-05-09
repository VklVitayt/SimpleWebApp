package com.godeltech.simplewebapp.rest;

import com.godeltech.simplewebapp.domain.Card;
import com.godeltech.simplewebapp.domain.Order;
import com.godeltech.simplewebapp.service.CardService;
import com.godeltech.simplewebapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/order")
@CrossOrigin
public class OrderApi {
    @Autowired
    private OrderService orderService;

    @GetMapping("/getAllOrder")
    private List<Order> getAllOrder(){
        return orderService.getAllOrder();
    }

    @PostMapping("/postCard")
    private void postOrder(@RequestBody Order order ){
        orderService.save(order);
    }
}
