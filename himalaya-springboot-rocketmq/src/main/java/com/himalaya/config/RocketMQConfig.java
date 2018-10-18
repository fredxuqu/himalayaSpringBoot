package com.himalaya.config;

//@Component
//@ConfigurationProperties(prefix = "spring.rocketmq")
//@PropertySource("classpath:application.properties")
public class RocketMQConfig {
	
	private String nameServerAddress;
	private String consumerID;
	private String producerID;
	private String topic;
	private String tag;
	private int threadNum;
	/**
	 * @return the nameServerAddress
	 */
	public String getNameServerAddress() {
		return nameServerAddress;
	}
	/**
	 * @param nameServerAddress the nameServerAddress to set
	 */
	public void setNameServerAddress(String nameServerAddress) {
		this.nameServerAddress = nameServerAddress;
	}
	/**
	 * @return the consumerID
	 */
	public String getConsumerID() {
		return consumerID;
	}
	/**
	 * @param consumerID the consumerID to set
	 */
	public void setConsumerID(String consumerID) {
		this.consumerID = consumerID;
	}
	/**
	 * @return the producerID
	 */
	public String getProducerID() {
		return producerID;
	}
	/**
	 * @param producerID the producerID to set
	 */
	public void setProducerID(String producerID) {
		this.producerID = producerID;
	}
	/**
	 * @return the topic
	 */
	public String getTopic() {
		return topic;
	}
	/**
	 * @param topic the topic to set
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}
	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}
	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
	/**
	 * @return the threadNum
	 */
	public int getThreadNum() {
		return threadNum;
	}
	/**
	 * @param threadNum the threadNum to set
	 */
	public void setThreadNum(int threadNum) {
		this.threadNum = threadNum;
	}
}