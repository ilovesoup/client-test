/*
 *
 * Copyright 2017 PingCAP, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.pingcap.tikv.operation.transformer;

import com.pingcap.tikv.types.DataType;

public class Skip extends NoOp {
    public Skip(DataType type) {
        super(type);
    }

    @Override
    public Object apply(Object obj) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
