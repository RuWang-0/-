package com.bbs.common.base;


import com.bbs.common.dto.BBSResult;

@FunctionalInterface
public interface ResultProcessor {
    BBSResult process();
}
