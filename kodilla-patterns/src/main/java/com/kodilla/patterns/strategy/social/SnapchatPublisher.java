package com.kodilla.patterns.strategy.social;

public final class SnapchatPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "User just published post on Snapchat";
    }
}
