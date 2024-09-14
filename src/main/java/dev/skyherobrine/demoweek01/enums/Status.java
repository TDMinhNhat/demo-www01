package dev.skyherobrine.demoweek01.enums;

public enum Status {
    ACTIVE(1), DEACTIVE(0), DELETED(-1);

    private int value;

    Status(int value) {
        this.value = value;
    }
}
