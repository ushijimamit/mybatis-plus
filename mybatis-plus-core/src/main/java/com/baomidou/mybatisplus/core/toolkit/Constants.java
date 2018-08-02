/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baomidou.mybatisplus.core.toolkit;

/**
 * <p>
 * mybatis_plus 自用常量集中管理
 * </p>
 *
 * @author miemie
 * @since 2018-07-22
 */
public interface Constants {

    /**
     * UTF-8
     */
    String UTF8 = "UTF-8";
    /**
     * MD5
     */
    String MD5 = "MD5";
    /**
     * 一个点
     */
    String SPOT = ".";
    /**
     * 实体类
     */
    String ENTITY = "et";
    /**
     * 实体类 带后缀 ==> .
     */
    String ENTITY_SPOT = ENTITY + SPOT;
    /**
     * wrapper类
     */
    String WRAPPER = "ew";
    /**
     * wrapper类 带后缀 ==> .
     */
    String WRAPPER_SPOT = WRAPPER + SPOT;
    /**
     * columnMap
     */
    String COLUMN_MAP = "cm";
    /**
     * collection
     */
    String COLLECTION = "coll";
}
