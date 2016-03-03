import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SuperHeroicConfiguration {

    @Bean
    SuperAbilities abilitie1(){
        return new SuperAbilities("spider sense", "passive");
    }

    @Bean
    SuperAbilities abilitie2(){
        return new SuperAbilities("regeneration", "passive");
    }

    @Bean
    Superheroes superhero1(){
        return new Superheroes("Spider-man", 15, abilitie1());
    }

    @Bean
    Superheroes superhero2(){
        return new Superheroes("Deadpool", 37, abilitie2());
    }
}
