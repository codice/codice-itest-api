/**
 * Copyright 2020 Connexta, LLC
 *
 * Unlimited Government Rights (FAR Subpart 27.4) Government right to use, disclose, reproduce,
 * prepare derivative works, distribute copies to the public, and perform and display publicly, in
 * any manner and for any purpose, and to have or permit others to do so.
 **/
package org.codice.integrationtest.api;

/**
 * integrationtest-framework will execute any instances of this interface in the application
 * context. Methods are called in the following order: setup(), test(), cleanup().
 */
public interface IntegrationTest {

    /**
     * @return A name to uniquely identify the test
     */
    default String getName() {
        return this.getClass()
                .toString();
    }

    /**
     * This method is used to set up any test pre-conditions. The default implementation does
     * nothing.
     *
     * @throws Exception which is caught by the DiagnosticTestService.
     */
    default void setup() throws Exception {
    };

    /**
     * Defines the test steps.
     *
     * @throws Exception which is caught by the DiagnosticTestService.
     */
    void test() throws Exception;

    /**
     * This method is used to clean up any used resources or restore the system state after a test.
     * It is guaranteed to be called before the system exits. The default implementation does
     * nothing.
     *
     * @throws Exception which is caught by the DiagnosticTestService.
     */
    default void cleanup() throws Exception {
    };
}
