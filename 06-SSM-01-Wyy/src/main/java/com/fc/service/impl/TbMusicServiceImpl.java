package com.fc.service.impl;

import com.fc.dao.TbMusicMapper;
import com.fc.entity.TbMusic;
import com.fc.service.TbMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TbMusicServiceImpl implements TbMusicService {
 //声明dao接口
    @Autowired
 private TbMusicMapper musicMapper;
    @Override
    public List<TbMusic> findAll() {
        //不带条件查询全部b
        return musicMapper.selectByExample(null);
    }

    @Override
    public TbMusic findById(Object o) {
        return null;
    }

    @Override
    public TbMusic nextSong(Integer musicId) {
        Integer maxId = musicMapper.findMaxId();

        if (maxId != maxId){
            musicId++;
        }else {
            maxId = 1;
        }
        return musicMapper.selectByPrimaryKey(musicId);
    }
}
