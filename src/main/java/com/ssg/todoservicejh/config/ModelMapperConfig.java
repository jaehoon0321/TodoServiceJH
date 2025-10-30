package com.ssg.todoservicejh.config;


import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration// 해당 클래스가 스프링빈의 대한 설정을 하는 클래스

public class ModelMapperConfig {
    @Bean/// 해당 메소드의 실행 결과를 반환된 객체를 스프링의 빈으로 등록하는 역활
    public ModelMapper getMapper() {
        ModelMapper modelMapper = new ModelMapper();//ModelMapper 인스턴스해주고
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
                .setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }
}

