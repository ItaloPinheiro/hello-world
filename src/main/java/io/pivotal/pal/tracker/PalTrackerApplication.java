package io.pivotal.pal.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class PalTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PalTrackerApplication.class, args);
    }

    @Bean
    public TimeEntryRepository createBeanTimeEntryRepository(DataSource datasource){
        //InMemoryTimeEntryRepository inMemoryTimeEntryRepository = new InMemoryTimeEntryRepository();
        //return inMemoryTimeEntryRepository;
        JdbcTimeEntryRepository jdbcTimeEntryRepository = new JdbcTimeEntryRepository(datasource);
        return jdbcTimeEntryRepository;
    }

}
