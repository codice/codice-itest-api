/**
 * Copyright 2020 Connexta, LLC
 *
 * Unlimited Government Rights (FAR Subpart 27.4) Government right to use, disclose, reproduce,
 * prepare derivative works, distribute copies to the public, and perform and display publicly, in
 * any manner and for any purpose, and to have or permit others to do so.
 **/
package org.codice.integrationtest.api;

import java.time.Instant;

/**
 * A factory interface for creating TestResult objects. integrationtest-framework provides a default implementation
 * of this interface but it's included here so that its behavior can be customized.
 */
public interface TestResultFactory {

    /**
     * @param testName - the name of the test that passed.
     * @param startTime - the start time of the test
     * @return an appropriate TestResult object.
     */
    TestResult pass(String testName, Instant startTime, Instant endTime);

    /**
     * @param testName - the name of the test that failed.
     * @param exceptionMessage - a description of the failure.
     * @param startTime - the start time of the test
     * @return an appropriate TestResult object.
     */
    TestResult fail(String testName, String exceptionMessage, Instant startTime, Instant endTime);

    /**
     * @param testName - the name of the test that failed.
     * @param throwable - the exception or error that was raised.
     * @param startTime - the start time of the test
     * @return an appropriate TestResult object.
     */
    TestResult error(String testName, Throwable throwable, Instant startTime, Instant endTime);
}
