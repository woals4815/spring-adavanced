package hello.advanced.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractTemplate {

    //excute == template method
    public void excute() {
        long startTime = System.currentTimeMillis();
        //business logic start
        //abstract method start
        call();
        //logic end
        long endTime = System.currentTimeMillis();
        long resultTime = (endTime - startTime);

        log.info("resultTime={}", resultTime);
    }
    protected abstract void call();
}
