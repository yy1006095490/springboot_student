package com.qf.Service.ServiceImp;

import com.qf.Service.IStuService;
import com.qf.dao.StuMapper;
import com.qf.eneity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StuServiceImp implements IStuService {
    @Autowired
    private StuMapper stuMapper;

    @Override
    public List<Student> list() {
        return stuMapper.selectList(null);
    }
}
