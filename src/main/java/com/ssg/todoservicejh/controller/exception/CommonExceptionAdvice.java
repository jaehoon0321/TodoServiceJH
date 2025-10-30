package com.ssg.todoservicejh.controller.exception;


//컨트롤러에서 에러가 발생할 수 있는것들을 여기에서 처리하겠다
//모든 컨트롤러에서

//Advie는 가로를 친다. 횡단한다라고도 얘기 Point Cut (AOP에 Cut개념)하나를 필터를 쳐놓는다.
//Exception 정상적으로 처리하기 위해
//Advice한다 조언한다 정상적으로 처리하기위해
//AOP 객체지향 방법중에 하나 필수요소는 아니지만 advice를 하면 필요로 하는 것들을,
//꽃아놓는게 아니라 프로세스에 기로로 횡을 넣는것임 그니까 컨트롤러들이 있다면
//횡단으로 컨트롤러들을 뚫어놓는다
//품질 좋은것들을 위해 동작을 한다...

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

/// 스프링 컨트롤러에서 발생하는 예외를 처리하는 일반적인 방법
@ControllerAdvice
@Log4j2
public class CommonExceptionAdvice {

//    @ResponseBody
//    @ExceptionHandler(value = NumberFormatException.class)
//    public String exceptNumber(NumberFormatException numberFormatException) {
//        log.error("numberFormatException: " + numberFormatException.getMessage());
//        return "Number Format Exception!";
//    }

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)/// HTTP상태 404 페이지 수정.
    public String notFound(){
        return "custom 404";
    }
}
