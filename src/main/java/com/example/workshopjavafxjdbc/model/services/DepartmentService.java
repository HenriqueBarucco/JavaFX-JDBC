package com.example.workshopjavafxjdbc.model.services;

import com.example.workshopjavafxjdbc.model.dao.DaoFactory;
import com.example.workshopjavafxjdbc.model.dao.DepartmentDao;
import com.example.workshopjavafxjdbc.model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdate(Department obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        } else {
            dao.update(obj);
        }
    }

    public void remove(Department obj) {
        dao.deleteById(obj.getId());
    }
}
