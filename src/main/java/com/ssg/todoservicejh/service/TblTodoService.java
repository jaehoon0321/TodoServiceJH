package com.ssg.todoservicejh.service;

import com.ssg.todoservicejh.dto.TblTodoDTO;

import java.util.List;

public interface TblTodoService {

    void register(TblTodoDTO tblTodoDTO);

    List<TblTodoDTO> getAll();

    TblTodoDTO getOne(Long tno);

    void remove(Long tno);

    void modify(TblTodoDTO tblTodoDTO);
}
