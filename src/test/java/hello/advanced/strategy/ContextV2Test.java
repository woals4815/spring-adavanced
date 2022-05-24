package hello.advanced.strategy;

import hello.advanced.strategy.code.strategy.ContextV2;
import hello.advanced.strategy.code.strategy.Strategy;
import hello.advanced.strategy.code.strategy.StrategyLogic1;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
public class ContextV2Test {

    @Test
    @DisplayName("ContextV2 Test")
    void strategyV1() {
        ContextV2 contextV2 = new ContextV2();
        contextV2.execute(new StrategyLogic1());
    }

    @Test
    @DisplayName("anonymous inner class")
    void strategyV2() {
        ContextV2 contextV2 = new ContextV2();
        contextV2.execute(new Strategy() {
            @Override
            public void call() {
                log.info("hello logic1");
            }
        });
    }
    @Test
    @DisplayName("lambda case")
    void strategyV3() {
        ContextV2 contextV2 = new ContextV2();
        contextV2.execute(() ->log.info("hello logic1"));
    }
}
