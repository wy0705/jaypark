package com.easyarch.using.service.im;

import com.easyarch.using.entity.Company;

public interface ICompanyService {
    public Company findByCompany(int eid);
    public int insertCompany(Company company);
}
