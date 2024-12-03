package com.tinqin.library.book.api.operations.query;

import com.tinqin.library.book.api.base.ProcessorResult;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor

public class QueryResult implements ProcessorResult {
    private final String queryParam
            ;
}
