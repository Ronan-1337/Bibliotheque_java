package fr.ronan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import lombok.extern.log4j.Log4j;

@Log4j
public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);

		JDBCEnboisRepository jdbcEnboisRepository = (JDBCEnboisRepository) ctx.getBean("JDBCEnBoisRepository");

		int id = 0;
		Enbois enbois = new Enbois(1, 1, 1, "metal");
		
		log.info("selection du enbois a l'id "+id);
		System.out.println(jdbcEnboisRepository.selectById(id));

		log.info("ajout de l'enbois");
		System.out.println(jdbcEnboisRepository.save(enbois));
	}
}