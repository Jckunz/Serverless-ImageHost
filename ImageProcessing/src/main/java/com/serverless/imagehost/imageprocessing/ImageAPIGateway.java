package com.serverless.imagehost.imageprocessing;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/image")
public class ImageAPIGateway {
    @GetMapping("/{path}")
    public Image GetImage(@PathVariable String id){
        Image image = new Image();

        return image;
    }

    @GetMapping("/{path}")
    public Image PutImage(@PathVariable String id){
        Image image = new Image();

        return image;
    }
}
