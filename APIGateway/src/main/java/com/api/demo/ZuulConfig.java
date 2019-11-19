package com.api.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.api.filter.PostFilter;
import com.api.filter.PreFilter;

@Configuration
public class ZuulConfig {
	@Bean
	public PreFilter makePre() {
		return new PreFilter();
	}
	@Bean
	public PostFilter makePost() {
		return new PostFilter();
	}
}
