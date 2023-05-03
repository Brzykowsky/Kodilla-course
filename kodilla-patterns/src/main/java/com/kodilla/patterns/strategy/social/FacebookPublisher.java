package com.kodilla.patterns.strategy.social;

public final class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "User just published post on Facebook";
    }
}
