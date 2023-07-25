package com.springtest.demo.controller

import org.junit.jupiter.api.Assertions
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class EmployeeControllerSpec extends Specification{
    def 'Test'() {
        given:
        int a = 10;
        expect:
        Assertions.assertEquals(10, a)
    }


        def 'Test1'(){
            given:
            int a = 10;
            expect:
            Assertions.assertEquals(10, a )

        }

        def 'Test2'(){
            given:
            int a = 10;
            expect:
            Assertions.assertEquals(20, a )

        }
}
