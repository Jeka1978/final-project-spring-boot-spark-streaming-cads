import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.github.javafaker.GameOfThrones;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/**
 * @author Evgeny Borisov
 */
public class DataGeneratorScript {
    static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {
        GameOfThrones gameOfThrones = new Faker().gameOfThrones();
        IntStream.range(1, 20).mapToObj(i -> new Hero(i, gameOfThrones.character(), 20+
                ThreadLocalRandom.current().nextInt(50)))
                .map(DataGeneratorScript::getJson).forEach(System.out::println);
    }

    @SneakyThrows
    private static String getJson(Hero hero)  {
        return mapper.writeValueAsString(hero);
    }
    @Data
    @AllArgsConstructor
    static class Hero{
        private int id;
        private String name;
        private int age;
    }
}
