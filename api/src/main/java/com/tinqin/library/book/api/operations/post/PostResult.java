package com.tinqin.library.book.api.operations.post;

import com.tinqin.library.book.api.base.ProcessorResult;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;
@Getter
@Builder
@AllArgsConstructor

public class PostResult implements ProcessorResult {
    private final String message;
}
