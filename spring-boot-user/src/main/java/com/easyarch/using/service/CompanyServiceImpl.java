package com.easyarch.using.service;

import com.easyarch.using.dao.CompanyDao;
import com.easyarch.using.entity.Company;
import com.easyarch.using.service.im.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements ICompanyService {
    @Autowired
    private CompanyDao companyDao;
    @Override
    public Company findByCompany(int eid) {
        return companyDao.findByCompany(eid);
    }

    @Override
    public int insertCompany(Company company) {
        return companyDao.insertCompany(company);
    }
}
