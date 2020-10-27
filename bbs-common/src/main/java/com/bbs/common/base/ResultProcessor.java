package com.bbs.common.base;


import com.bbs.common.dto.bbsResult;

@FunctionalInterface
public interface ResultProcessor {
    bbsResult process();
}
