package hello.advanced.strategy;

import hello.advanced.strategy.template.Callback;
import hello.advanced.strategy.template.TimeLogTemplate;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateCallbackTest {

    @Test
    @DisplayName("template callback pattern, anonymous innter class")
    void callbackV1() {
        TimeLogTemplate template = new TimeLogTemplate();
        template.execute(new Callback() {
            @Override
            public void call() {
                log.info("business logic 1 start");
            }
        });
    }
    @Test
    @DisplayName("template callback pattern, lambda")
    void callbackV2() {
        TimeLogTemplate template = new TimeLogTemplate();
        template.execute(() -> log.info("business logic 1 start"));
    }
}
