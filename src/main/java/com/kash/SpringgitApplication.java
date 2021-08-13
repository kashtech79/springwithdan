package com.kash;

import com.kash.domain.Comment;
import com.kash.domain.Link;
import com.kash.repository.CommentRepository;
import com.kash.repository.LinkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import javax.swing.*;

@SpringBootApplication
public class SpringgitApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringgitApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringgitApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
        return args -> {
//            log.error("CommandLineRunner.run();");
//            log.warn("CommandLineRunner.run();");
//            log.info("CommandLineRunner.run();");
//            log.debug("CommandLineRunner.run();");
//            log.trace("CommandLineRunner.run();");
//

            Link link = new Link("Get started with spring 2", "https://therealdanvega.com/spring-boot-2");
            linkRepository.save(link);

            Comment comment = new Comment("This Spring Boot 2 link is awesome!", link);
            commentRepository.save(comment);
            link.addComment(comment);

            System.out.println("We just inserted a link and comment");
            System.out.println("===================================");

//        };
        };

    }
}
//}
