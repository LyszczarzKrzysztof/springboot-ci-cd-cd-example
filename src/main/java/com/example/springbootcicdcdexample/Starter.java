package com.example.springbootcicdcdexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Starter {

    private VideoRepository videoRepository;

    @Autowired
    public Starter(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }


    @EventListener(ApplicationReadyEvent.class)
    public void init() {

        Video video1 = new Video("clouds",
                "https://assets.mixkit.co/videos/preview/mixkit-traveling-to-the-dream-world-through-the-clouds-14165-large.mp4",
                "https://images.pexels.com/photos/373543/pexels-photo-373543.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        Video video2 = new Video("flowers",
                "https://assets.mixkit.co/videos/preview/mixkit-watering-a-flower-pot-1780-large.mp4",
                "https://images.pexels.com/photos/577585/pexels-photo-577585.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        Video video3 = new Video("city",
                "https://assets.mixkit.co/videos/preview/mixkit-aerial-view-of-city-traffic-at-night-11-large.mp4",
                "https://images.pexels.com/photos/590022/pexels-photo-590022.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");

        videoRepository.save(video1);
        videoRepository.save(video2);
        videoRepository.save(video3);
    }

}
