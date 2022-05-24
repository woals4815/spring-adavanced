package hello.advanced.strategy.code.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * store strategy in field
 */
@Slf4j
public class ContextV1 {

    private Strategy strategy;

    public ContextV1(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        long startTime = System.currentTimeMillis();

        //business logic start
        strategy.call();
        //logic end

        long endTime = System.currentTimeMillis();
        long resultTime = (endTime - startTime);

        log.info("resultTime={}", resultTime);
    }
}
