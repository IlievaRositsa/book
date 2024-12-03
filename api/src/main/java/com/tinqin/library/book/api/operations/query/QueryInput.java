package com.tinqin.library.book.api.operations.query;

import com.tinqin.library.book.api.base.ProcessorInput;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@AllArgsConstructor
@ToString
public class QueryInput implements ProcessorInput {
    private final String queryParam;

}
