package com.easyarch.using.service.im;

import com.easyarch.using.entity.Resume;

import java.util.List;

public interface IResumeService {
    public List<Integer> findByResume(int pid);
    public int insertResume(Resume resume);
}
