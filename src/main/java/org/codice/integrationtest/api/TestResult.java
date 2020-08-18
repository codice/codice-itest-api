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
 * This interface describes the result of each test.
 */
public interface TestResult {
    /**
     * @return the classname of the test.
     */
    String getTestName();

    /**
     * @return Return the start time of the test
     */
    Instant getStartTime();

    /**
     * @return Returns the duration of the test measured in milliseconds
     */
    long getDuration();

    /**
     * @return Return the end time of the test
     */
    Instant getEndTime();

    /**
     * @return A status indicating whether test passed, failed or errored-out.
     */
    TestStatus getTestStatus();
}
