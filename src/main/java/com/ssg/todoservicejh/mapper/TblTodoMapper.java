package com.ssg.todoservicejh.mapper;

import com.ssg.todoservicejh.domain.TblTodoVO;
import com.ssg.todoservicejh.dto.TblTodoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

///mapper는 DAO를 대신한다
@Mapper
public interface TblTodoMapper {
    String getTime();

    void insert(TblTodoVO tblTodoVO);

    List<TblTodoVO> selectAll();

    TblTodoVO selectOne(Long tno);

    void delete(Long tno);

    void update(TblTodoVO tblTodoVO);
}
///@get파라미터 컨트롤러 서비스로부터 전달된다