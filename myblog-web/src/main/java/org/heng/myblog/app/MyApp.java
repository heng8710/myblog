package org.heng.myblog.app;

import org.glassfish.jersey.server.ResourceConfig;
import org.heng.myblog.controller.CategoryController;
import org.springframework.web.filter.RequestContextFilter;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("blog")
public class MyApp extends ResourceConfig {
	/**
     * Register JAX-RS application components.
     */
    public MyApp() {
    	
    	//packages("resource");
        
        //referer filter
        
        //cache headers
    	
        //register(RequestContextFilter.class);
        
       // register(CategoryController.class);
//        register(SpringSingletonResource.class);
//        register(SpringRequestResource.class);
//        register(CustomExceptionMapper.class);
    }
}
