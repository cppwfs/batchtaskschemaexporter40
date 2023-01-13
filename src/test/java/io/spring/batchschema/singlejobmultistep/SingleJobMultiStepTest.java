package io.spring.batchschema.singlejobmultistep;

import io.spring.batchschema.AbstractBatchExport;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SingleJobMultiStepTest extends AbstractBatchExport {

    @ParameterizedTest
    @CsvFileSource(resources = "/batchexportconfig.csv")
    void testJobExecution(String prefix, String databaseType, long sequenceStartVal) throws Exception {
        generateImportFile(BatchSingleJobMultiStepApplication.class, "singleJobMultiStep.load", prefix, databaseType, sequenceStartVal);
    }
}
