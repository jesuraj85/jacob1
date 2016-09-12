package com.travelsky.zhaoyb.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 打包测试
 * 把你所有的测试类打包一起运行
 * */
@RunWith(Suite.class)
@Suite.SuiteClasses({MathDemoTest.class,ParameterizedWordDeal4DBTest.class,WordDeal4DBTest.class})
public class PacketJunitSuiteTest {
}
