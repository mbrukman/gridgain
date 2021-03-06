/* 
 Copyright (C) GridGain Systems. All Rights Reserved.
 
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */
package org.gridgain.testsuites;

import junit.framework.*;
import org.gridgain.grid.kernal.processors.cache.*;

/**
 * Test suite that contains all tests for {@link GridCacheWriteBehindStore}.
 */
public class GridCacheWriteBehindTestSuite extends TestSuite {
    /**
     * @return GridGain Bamboo in-memory data grid test suite.
     * @throws Exception Thrown in case of the failure.
     */
    public static TestSuite suite() throws Exception {
        TestSuite suite = new TestSuite("Gridgain Write-Behind Store Test Suite");

        // Write-behind tests.
        suite.addTest(new TestSuite(GridCacheWriteBehindStoreSelfTest.class));
        suite.addTest(new TestSuite(GridCacheWriteBehindStoreMultithreadedSelfTest.class));
        suite.addTest(new TestSuite(GridCacheWriteBehindStoreLocalTest.class));
        suite.addTest(new TestSuite(GridCacheWriteBehindStoreReplicatedTest.class));
        suite.addTest(new TestSuite(GridCacheWriteBehindStorePartitionedTest.class));
        suite.addTest(new TestSuite(GridCacheWriteBehindStorePartitionedMultiNodeSelfTest.class));
        suite.addTest(new TestSuite(GridCachePartitionedWritesTest.class));

        return suite;
    }
}
