package com.ssg.todoservicejh.service;

import com.ssg.todoservicejh.domain.TblTodoVO;
import com.ssg.todoservicejh.dto.TblTodoDTO;
import com.ssg.todoservicejh.mapper.TblTodoMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor

public class TblTodoServiceImpl implements TblTodoService{

    private final TblTodoMapper tblTodoMapper;

    private final ModelMapper modelMapper;
    @Override
    public void register(TblTodoDTO tblTodoDTO) {
        log.info(modelMapper);

        TblTodoVO tblTodoVO = modelMapper.map(tblTodoDTO,TblTodoVO.class);
        log.info(tblTodoVO);
        tblTodoMapper.insert(tblTodoVO);
    }

    @Override
    public TblTodoDTO getOne(Long tno) {
        TblTodoVO tblTodoVO = tblTodoMapper.selectOne(tno);
        TblTodoDTO tblTodoDTO = modelMapper.map(tblTodoVO,TblTodoDTO.class);
        return tblTodoDTO;
    }

    @Override
    public List<TblTodoDTO> getAll() {
        List<TblTodoDTO>dtoList = tblTodoMapper.selectAll().stream()
                .map(vo->modelMapper.map(vo,TblTodoDTO.class))
                .collect(Collectors.toList());

        return dtoList;
    }

    @Override
    public void remove(Long tno) {
        tblTodoMapper.delete(tno);///deleteOne이 아니라 delete인데 책상엔 오류나면 확인
    }

    @Override
    public void modify(TblTodoDTO tblTodoDTO) {
        TblTodoVO tblTodoVO = modelMapper.map(tblTodoDTO,TblTodoVO.class);
        tblTodoMapper.update(tblTodoVO);
    }
}
