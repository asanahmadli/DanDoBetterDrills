package com.zipcodewilmington.danny_do_better_exercises;

import com.zipcodewilmington.danny_do_better_exercises.mathutilities.TestMathUtilities;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by leon on 2/5/18.
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestPredicateUtilities.class,
        TestMathUtilities.class,
        TestStringUtilities.class,
})
public class TestSuite {

}
