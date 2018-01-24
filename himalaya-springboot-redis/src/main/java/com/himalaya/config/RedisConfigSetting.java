package com.himalaya.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2018年1月24日 下午3:30:33 Description
 */
@Component
@ConfigurationProperties(prefix = "spring.redis")
@PropertySource("classpath:redis-config.properties")
public class RedisConfigSetting {

	private int database;
	private String host;
	private int port;
	private String password;
	private int maxActive;
	private int maxWait;
	private int maxIdle;
	private int minIdle;
	private int timeout;
	private String sentinelMaster;
	private String sentinelNodes;
	
	public int getDatabase() {
		return database;
	}
	public void setDatabase(int database) {
		this.database = database;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMaxActive() {
		return maxActive;
	}
	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}
	public int getMaxWait() {
		return maxWait;
	}
	public void setMaxWait(int maxWait) {
		this.maxWait = maxWait;
	}
	public int getMaxIdle() {
		return maxIdle;
	}
	public void setMaxIdle(int maxIdle) {
		this.maxIdle = maxIdle;
	}
	public int getMinIdle() {
		return minIdle;
	}
	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
	public String getSentinelMaster() {
		return sentinelMaster;
	}
	public void setSentinelMaster(String sentinelMaster) {
		this.sentinelMaster = sentinelMaster;
	}
	public String getSentinelNodes() {
		return sentinelNodes;
	}
	public void setSentinelNodes(String sentinelNodes) {
		this.sentinelNodes = sentinelNodes;
	}
}
