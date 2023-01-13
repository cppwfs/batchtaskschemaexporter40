package io.spring.batchschema.singlejobmultistepwithjobparam;

import io.spring.batchschema.AbstractBatchExport;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SingleJobSingleStepJobParamTest extends AbstractBatchExport {

    @ParameterizedTest
    @CsvFileSource(resources = "/batchexportconfig.csv")
    void testJobExecution(String prefix, String databaseType, long sequenceStartVal) throws Exception {
        generateImportFile(BatchSingleWithJobParamApplication.class, "singleJobSingleStepJobParam.load", prefix, databaseType, true, sequenceStartVal);
    }

}
