package org.heng.myblog.dao.category;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CateGoryDao {

	private static final Logger logger = LoggerFactory.getLogger(CateGoryDao.class);
	
	@Resource(name="myblogJdbcTemplate")
	private JdbcTemplate myblogJdbcTemplate;
	
	@Resource(name="myblogDatasource")
	private DataSource myblogDatasource;
	
	public List<Map<String, Object>> selectAll(){
		
		return myblogJdbcTemplate.queryForList("select * from category");
		
//		try{
//			myblogDatasource.getConnection().createStatement().executeQuery("select 1 from dual");
//			System.out.println("----");
//		}catch(final Exception e){
//			e.printStackTrace();
//		}
//		
//		return null;
	}
}
