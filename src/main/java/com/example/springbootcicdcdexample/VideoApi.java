package com.example.springbootcicdcdexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoApi {
    private VideoRepository videoRepository;

    @Autowired
    public VideoApi(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @GetMapping
    public List<Video> getVideos(){
        return videoRepository.findAll();
    }

    @PostMapping
    public Video postVideo(@RequestBody Video video) {
        return videoRepository.save(video);
    }
}
