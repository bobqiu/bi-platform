/**
 * Copyright (c) 2014 Baidu, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * 
 */
package com.baidu.rigel.biplatform.ma.model.exception;

/**
 * HttpUrl处理异常
 * 
 * @author peizhongyi01
 *
 */
public class HttpUrlException extends RuntimeException {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 5802948702936334866L;
    
    /**
     * 
     * @param message
     */
    public HttpUrlException(String message) {
        super(message);
    }
    
    /**
     * 
     * @param message
     * @param e
     */
    public HttpUrlException(String message, Exception e) {
        super(message, e);
    }
    
    /**
     * 
     */
    public HttpUrlException() {
        super();
    }
}