package org.automon.aspects;

/**
 * Test class that is advised to see if aspects are working properly
 *
 * Created by stevesouza on 3/3/15.
 */
public class HelloWorld {

        public static final RuntimeException  TEST_RUNTIME_EXCEPTION = new RuntimeException("testing throwing exceptions");
        public static final String RETURN_VALUE = "any string";

        private String planet;
        public void hello() {

        }

        public void world() {

        }

        public String getString() {
            return RETURN_VALUE;
        }

        protected void iAmHiding() {

        }

        public void throwException() {
            throw TEST_RUNTIME_EXCEPTION;
        }

        protected void throwOtherException() {
            throw TEST_RUNTIME_EXCEPTION;
        }

        protected String getPlanet() {
            return planet;
        }

        protected void setPlanet(String planet) {
            this.planet = planet;
        }

}
