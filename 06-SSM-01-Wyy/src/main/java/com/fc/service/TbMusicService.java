package com.fc.service;

import com.fc.entity.TbMusic;

import java.util.List;

public interface TbMusicService {
     List<TbMusic> findAll();

     TbMusic findById(Object o);

     TbMusic nextSong(Integer musicId);
}
