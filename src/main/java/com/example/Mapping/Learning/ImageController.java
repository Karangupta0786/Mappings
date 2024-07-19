package com.example.Mapping.Learning;

import com.example.Mapping.Learning.entity.Image;
import com.example.Mapping.Learning.repository.ImageRepository;
import com.example.Mapping.Learning.util.ImageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@RestController
public class ImageController {

    @Autowired
    private ImageRepository imageRepository;

    @PostMapping("/image/db")
    public ResponseEntity<?> uploadImage(@RequestParam("file") MultipartFile file) throws Exception{
        try {

            Image image = new Image();
            image.setName(file.getName());
            image.setType(file.getContentType());
            image.setData(ImageUtils.compressImage(file.getBytes()));

            Image savedImage = imageRepository.save(image);
            return ResponseEntity.ok(savedImage);
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @GetMapping("/image/{file}")
    public byte[] downloadImage(@PathVariable String file){
        Optional<Image> image = Optional.ofNullable(imageRepository.findByName(file)
                .orElseThrow(() -> new RuntimeException("not found!")));
        byte[] images = image.get().getData();
        return images;
    }

}
