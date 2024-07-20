/*
package com.holografix.dogtricks;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.holografix.dogtricks.model.DogTrick;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DogTricksApplicationTests {

    @Autowired
    private List<DogTrick> dogTricks;

    @Test
    void contextLoads() {
        assertThat(dogTricks).isNotNull();
        assertThat(dogTricks).isNotEmpty();
    }

    @Test
    void testLoadDogTricks() throws IOException {
        Resource resource = new ClassPathResource("dogtricks.json");
        byte[] data = FileCopyUtils.copyToByteArray(resource.getInputStream());
        ObjectMapper objectMapper = new ObjectMapper();
        List<DogTrick> expectedDogTricks = objectMapper.readValue(new String(data, StandardCharsets.UTF_8), objectMapper.getTypeFactory().constructCollectionType(List.class, DogTrick.class));

        assertThat(dogTricks).hasSize(expectedDogTricks.size());
        assertThat(dogTricks).containsAll(expectedDogTricks);
    }
}
 */