package fr.ronan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan({ "fr.ronan" })
public class AppConfiguration {
	@Bean
	public DriverManagerDataSource provideSource() {
		DriverManagerDataSource dataSource = new org.springframework.jdbc.datasource.DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUsername("guillaume");
		dataSource.setPassword("guillaume");
		dataSource.setUrl("jdbc:mysql://localhost:3308/bddjdbctmplt?useSSL=false&serverTimezone=UTC");
		return dataSource;
	}

	@Bean(name = "applicationJdbcTemplate")
	public JdbcTemplate applicationDataConnection() {
		return new JdbcTemplate(provideSource());
	}
}
