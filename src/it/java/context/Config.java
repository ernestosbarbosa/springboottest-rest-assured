package context;

import br.com.ernestobarbosa.springboottestrestassured.service.AvailabilityService;
import br.com.ernestobarbosa.springboottestrestassured.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

    @Bean
    public BookService getBookService(){
        return new BookService();
    }

    @Bean
    public AvailabilityService getAvailabilityService(){
        return new AvailabilityService();
    }

    @Bean
    public RestTemplate getRestTemplate (){
        return new RestTemplate();
    }
}
