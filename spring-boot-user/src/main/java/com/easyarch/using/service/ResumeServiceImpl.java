package com.easyarch.using.service;

import com.easyarch.using.dao.ResumeDao;
import com.easyarch.using.entity.Resume;
import com.easyarch.using.service.im.IResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ResumeServiceImpl implements IResumeService {

    @Autowired
    private ResumeDao resumeDao;
    @Override
    public List<Integer> findByResume(int pid) {
        return resumeDao.findByResume(pid);
    }

    @Override
    public int insertResume(Resume resume) {
        return resumeDao.insertResume(resume);
    }
}
