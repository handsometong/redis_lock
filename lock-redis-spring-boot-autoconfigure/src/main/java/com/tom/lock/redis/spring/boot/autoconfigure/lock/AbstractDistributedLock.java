package com.tom.lock.redis.spring.boot.autoconfigure.lock;

/**
 * AbstractDistributedLock.java 抽象类，实现基本的方法，关键方法由子类去实现
 * @author handsometong
 * @date 2022年4月14日 下午3:10:57
 * @version 1.0.0
 */
public abstract class AbstractDistributedLock implements DistributedLock {

	@Override
	public boolean lock(String key) {
		return lock(key, TIMEOUT_MILLIS, RETRY_TIMES, SLEEP_MILLIS);
	}

	@Override
	public boolean lock(String key, int retryTimes) {
		return lock(key, TIMEOUT_MILLIS, retryTimes, SLEEP_MILLIS);
	}

	@Override
	public boolean lock(String key, int retryTimes, long sleepMillis) {
		return lock(key, TIMEOUT_MILLIS, retryTimes, sleepMillis);
	}

	@Override
	public boolean lock(String key, long expire) {
		return lock(key, expire, RETRY_TIMES, SLEEP_MILLIS);
	}

	@Override
	public boolean lock(String key, long expire, int retryTimes) {
		return lock(key, expire, retryTimes, SLEEP_MILLIS);
	}

}
