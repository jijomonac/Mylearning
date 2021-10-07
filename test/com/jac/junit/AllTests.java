package com.jac.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        CalServiceTest.class,
        ParameterizedTestFields.class })

public class AllTests {

}