package org.demo.spring.config;

import java.sql.DriverManager;

import javax.sql.DataSource;

import org.demo.spring.dao.AppDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("Admin_Aritra");
		ds.setPassword("oracle");

		return ds;
	}

	@Bean(name="DAOBean")
	public AppDAOImpl appDao() {
		return new AppDAOImpl(getDataSource());
	}

}
