package org.heng.myblog.controller;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.heng.myblog.dao.category.CateGoryDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@Path("category")
public class CategoryController {

	@Resource
	private CateGoryDao cateGoryDao;
	
	@Resource(name="myblogJdbcTemplate")
	private JdbcTemplate myblogJdbcTemplate;
	
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
        String s = cateGoryDao.selectAll().toString();
//		return "nihaoa   ---";
        System.out.println(s);
        return s;
    }
	
	
}
