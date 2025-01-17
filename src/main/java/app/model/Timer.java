package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {
    private final Long nanoTime = System.nanoTime();
    public Long getTime() {
        return nanoTime;
    }
    @Override
    public String toString() {
        return "Timer{" +
               "nanoTime=" + nanoTime +
               '}';
    }
}
