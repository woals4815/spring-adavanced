package hello.advanced.strategy;

import hello.advanced.strategy.code.strategy.ContextV1;
import hello.advanced.strategy.code.strategy.StrategyLogic1;
import hello.advanced.strategy.code.strategy.StrategyLogic2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
public class ContextV1Test {

    @Test
    void strategyV0() {
        logic1();
        logic2();
    }

    private void logic1() {
        long startTime = System.currentTimeMillis();
        //business logic start
        log.info("business logic1 start");
        //logic end
        long endTime = System.currentTimeMillis();
        long resultTime = (endTime - startTime);

        log.info("resultTime={}", resultTime);
    }
    //code duplicate
    private void logic2() {
        long startTime = System.currentTimeMillis();
        //business logic start
        log.info("business logic2 start");

        //logic end
        long endTime = System.currentTimeMillis();
        long resultTime = (endTime - startTime);

        log.info("resultTime={}", resultTime);
    }

    @Test
    @DisplayName("Strategy pattern")
    void strategyV1() {
        StrategyLogic1 strategyLogic1 = new StrategyLogic1();

        ContextV1 contextV1 = new ContextV1(strategyLogic1);
        contextV1.execute();

        StrategyLogic2 strategyLogic2 = new StrategyLogic2();

        ContextV1 contextV2 = new ContextV1(strategyLogic2);
        contextV2.execute();
    }
}
