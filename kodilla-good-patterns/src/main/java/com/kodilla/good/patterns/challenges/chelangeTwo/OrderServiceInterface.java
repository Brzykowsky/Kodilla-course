package com.kodilla.good.patterns.challenges.chelangeTwo;

import java.time.LocalDateTime;

public interface OrderServiceInterface {

    boolean order(User user, LocalDateTime timeOfOrder, String product, int quantity);

}
