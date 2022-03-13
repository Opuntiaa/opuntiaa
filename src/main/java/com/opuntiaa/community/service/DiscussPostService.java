package com.opuntiaa.community.service;

import com.opuntiaa.community.dao.DiscussPostMapper;
import com.opuntiaa.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {
    @Autowired
    private DiscussPostMapper discussPostMapper;
    public List<DiscussPost> findDiscussPosts(int userId,int offset,int limint){
        return discussPostMapper.selectDiscussPosts(userId,offset,limint);
    }
    public int findDiscussPostRows(int userId){
        return discussPostMapper.selectDiscussPostRows(userId);
    }
}
