package hello.advanced.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubClassLogic1 extends AbstractTemplate {
    //abstract method override
    @Override
    protected void call() {
        log.info("business logic1 start");
    }
}
