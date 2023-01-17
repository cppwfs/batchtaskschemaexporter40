package io.spring.batchschema.singlejobwithexitcode;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(TestSingleJobMultiStepExitCodeConfiguration.class)
public class BatchSingleJobMultiStepExitCodeApplication {

}
