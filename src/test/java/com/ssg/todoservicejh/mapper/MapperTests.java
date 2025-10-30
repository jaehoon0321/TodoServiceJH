package com.ssg.todoservicejh.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations= "file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class MapperTests {
    @Autowired(required =false)
    private TblTodoMapper tblTodoMapper;

    @Test
    public void testGetTime(){
        log.info("getTime");
    }

}
