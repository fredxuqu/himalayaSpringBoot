package com.himalaya.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2019年9月5日 下午3:19:19
* Description
*/
@Configuration
@MapperScan(basePackages = "com.himalaya.solr.mapper", sqlSessionTemplateRef = "solrSqlSessionTemplate")
public class DataSourceSolrConfig {

	@Bean
    @ConfigurationProperties(prefix = "spring.datasource.solr")
    @Primary
    public DataSource solrDataSource() {
        return DataSourceBuilder.create().build();
    }
 
    @Bean
    @Primary
    public SqlSessionFactory solrSqlSessionFactory(@Qualifier("solrDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:com/himalaya/solr/*.xml"));
        return bean.getObject();
    }
 
    @Bean
    @Primary
    public DataSourceTransactionManager solrTransactionManager(@Qualifier("solrDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
 
    @Bean
    @Primary
    public SqlSessionTemplate solrSqlSessionTemplate(@Qualifier("solrSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}