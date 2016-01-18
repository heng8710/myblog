package org.heng.myblog.app;

import org.glassfish.jersey.server.ResourceConfig;
import org.heng.myblog.controller.CategoryController;
import org.springframework.web.filter.RequestContextFilter;

public class MyApp extends ResourceConfig {
	/**
     * Register JAX-RS application components.
     */
    public MyApp() {
        register(RequestContextFilter.class);
        
        register(CategoryController.class);
//        register(SpringSingletonResource.class);
//        register(SpringRequestResource.class);
//        register(CustomExceptionMapper.class);
    }
}
