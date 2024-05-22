package com.batch12.batch;

import com.batch12.batch.tasklet.TestTasklet;
import javax.sql.DataSource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Slf4j
@RequiredArgsConstructor
@Configuration
public class SampleBatchConfiguration {

  private final TestTasklet testTasklet;

  @Bean
  public Job sampleBatch(JobRepository jobRepository,
      PlatformTransactionManager transactionManager, DataSource dataSource) {
    return new JobBuilder("sampleBatch", jobRepository)
        .start(Step(null, jobRepository, transactionManager))
        .build();
  }

  @Bean
  @JobScope
  public Step Step(@Value("#{jobParameters[date]}") String date,
      JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    return new StepBuilder("sampleStep", jobRepository)
        .tasklet(testTasklet, transactionManager)
        .build();
  }
}
