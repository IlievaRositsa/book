package com.tinqin.library.book.core.processors;

import com.tinqin.library.book.api.operations.query.QueryInput;
import com.tinqin.library.book.api.operations.query.QueryResult;

public class Query implements com.tinqin.library.book.api.operations.query.Query {
    @Override
    public QueryResult process(QueryInput input) {
       QueryResult.builder()
               .resultMessage("QueryResult")
               .bulder();
    }
}
