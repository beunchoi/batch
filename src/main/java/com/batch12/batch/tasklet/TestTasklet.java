//package com.batch12.batch.tasklet;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.batch.core.StepContribution;
//import org.springframework.batch.core.scope.context.ChunkContext;
//import org.springframework.batch.core.step.tasklet.Tasklet;
//import org.springframework.batch.repeat.RepeatStatus;
//import org.springframework.stereotype.Component;
//
//@RequiredArgsConstructor
//@Component
//@Slf4j
//public class TestTasklet implements Tasklet {
//
//  @Override
//  public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext)
//      throws Exception {
//    log.info("샘플 배치입니다!");
//
//    return RepeatStatus.FINISHED;
//  }
//}
