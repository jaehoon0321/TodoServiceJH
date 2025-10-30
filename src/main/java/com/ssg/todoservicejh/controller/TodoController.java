package com.ssg.todoservicejh.controller;


import com.ssg.todoservicejh.dto.TblTodoDTO;
import com.ssg.todoservicejh.service.TblTodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/todo")//RequsetMapping todo를 요청하면 list가 출력
@RequiredArgsConstructor
@Log4j2

public class TodoController {
    /// 프론트 컨트롤러가 요청 1.단계 get을 요청을 함.

    private final TblTodoService tblTodoService;

    /// tblTodoService를 호출해야 getall을 호출 할 수 있음 .


    @RequestMapping("/list")
    public void list(Model model) {
        log.info("to do list........");
        model.addAttribute("dtoList", tblTodoService.getAll());
    }

    @GetMapping("/register")
    public void registerGet() {
        log.info("GET to do register....");
    }

    @PostMapping("/register")
    public String registerPost(TblTodoDTO tblTodoDTO, RedirectAttributes redirectAttributes) {
        log.info("POST to do register....");
        log.info(tblTodoDTO);
        tblTodoService.register(tblTodoDTO);
        return "redirect:/todo/list";
    }

//    @GetMapping("/read")
//    public void read(Long tno, Model model) {
//
//        TblTodoDTO tblTodoDTO = tblTodoService.getOne(tno);
//        log.info(tblTodoDTO);
//
//        model.addAttribute("dto",tblTodoDTO);
//    }

    @GetMapping({"/read", "/modify"})
    public void read(Long tno, Model model) {
        TblTodoDTO tblTodoDTO = tblTodoService.getOne(tno);
        log.info(tblTodoDTO);

        model.addAttribute("dto", tblTodoDTO);

    }

    @PostMapping("/remove")
    public String remove(Long tno, RedirectAttributes redirectAttributes) {
        log.info("---------------------remove--------------------");
        log.info("tno:" + tno);
        tblTodoService.remove(tno);

        return "redirect:/todo/list";
    }

    @PostMapping("/modify")
    public String modify(@Valid TblTodoDTO tblTodoDTO, // TodoDTO -> TblTodoDTO로 변경
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            log.info("has errors.......");
            redirectAttributes.addFlashAttribute("errors", bindingResult.getAllErrors());
            redirectAttributes.addAttribute("tno", tblTodoDTO.getTno());
            return "redirect:/todo/modify";
        }

        log.info("Modify POST requested...");
        log.info(tblTodoDTO);


        tblTodoService.modify(tblTodoDTO);

        return"redirect:/todo/list";
    }
}
