package com.kodilla.good.patterns.challenges.chelangeTwo;

import java.time.LocalDateTime;

public interface OrderRepositoryInterface {

    void createOrder(User user, LocalDateTime localDateTime,String product, int quantity);
}
