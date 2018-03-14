package com.himalaya.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.core.Ordered;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
//@EnableAsync(
//mode = AdviceMode.PROXY, proxyTargetClass = false,
//order = Ordered.HIGHEST_PRECEDENCE
//)
public class JobServiceB {
	
	private static final Logger logger = LoggerFactory.getLogger(JobServiceB.class);
	
	@Value("${server.port}")
	private int port;
	
	@Value("${server.sessionTimeout}")
	private int sessionTimeout;   
	
	@Value("${cron.tags}")
	private String cron;

    @Scheduled(cron="${cron.tags}")
//    @Async
    public void execute() {
 
        logger.info("JobServiceB.execute() start...");
    }
}
