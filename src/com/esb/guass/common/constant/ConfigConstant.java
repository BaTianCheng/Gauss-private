package com.esb.guass.common.constant;

public class ConfigConstant {
	
	//最佳线程数目 = （（线程等待时间+线程CPU时间）/线程CPU时间 ）* CPU数目
	public static int THREADS_MAX_NUM = 2046;
	
	//请求时如果需要返回结果限时和间隔
	public static int RETURNRESULTDATA_MAXTIME = 60 * 1000;
	public static int RETURNRESULTDATA_INTERVAL = 200;
}
