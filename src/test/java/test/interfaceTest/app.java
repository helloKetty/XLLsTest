package test.interfaceTest;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class app {
    List<Operation> operationList= Arrays.asList(new Operation() {
        @Override
        public String description() {
            return null;
        }

        @Override
        public void commnd() {

        }
    });
}
