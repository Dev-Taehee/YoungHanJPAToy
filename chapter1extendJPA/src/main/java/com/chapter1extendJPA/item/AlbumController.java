package com.chapter1extendJPA.item;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AlbumController {

    private final AlbumService albumService;

    @PostMapping("/album")
    public ResponseEntity postAlbum(@RequestBody Album album) {
        albumService.createAlbum(album);
        return new ResponseEntity(HttpStatus.CREATED);
    }

}
