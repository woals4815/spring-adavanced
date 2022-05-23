package hello.advanced.template;

import hello.advanced.template.code.AbstractTemplate;
import hello.advanced.template.code.SubClassLogic1;
import hello.advanced.template.code.SubClassLogic2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateMethodTest {

    @Test
    void templateMethodV0() {
        logic1();
        logic2();
    }

    @Test
    @DisplayName("Template method applied")
    void templateMethodV1() {
        AbstractTemplate template1 = new SubClassLogic1();
        template1.excute();

        AbstractTemplate template2 = new SubClassLogic2();
        template2.excute();
    }
    //code duplicate
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
}
