package com.example.springbootcicdcdexample;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class SpringbootCiCdCdExampleApplicationTests {

    @Autowired
    private VideoRepository videoRepository;

    @Test
    public void checkNumberOfElements() {
        Video video = new Video();
        videoRepository.save(video);
        Assert.assertEquals(1,videoRepository.findAll().size());
    }

}
