package com.chapter1extendJPA.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlbumService {

    private final AlbumRepository albumRepository;

    public Album createAlbum(Album album) {
        return albumRepository.save(album);
    }

}
