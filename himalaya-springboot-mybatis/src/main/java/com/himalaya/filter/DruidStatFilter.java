package com.himalaya.filter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import com.alibaba.druid.support.http.WebStatFilter;

/**
 * Druid的StatFilter
 *
 * @author   fredxuqu
 * @create    2018年1月17日
 */
//@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",
//    initParams={
//        @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico, /druid/*")
//})
//public class DruidStatFilter extends WebStatFilter {
//}
