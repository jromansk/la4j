/*
 * Copyright 2011-2014, by Vladimir Kostyukov and Contributors.
 *
 * This file is part of la4j project (http://la4j.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributor(s): -
 *
 */

package org.la4j.matrix.sparse;

import org.la4j.factory.Factory;
import org.la4j.iterator.MatrixIterator;
import org.la4j.matrix.operation.MatrixOperation;

public abstract class ColumnMajorSparseMatrix extends SparseMatrix {

    protected ColumnMajorSparseMatrix(Factory factory, int rows, int columns) {
        super(factory, rows, columns);
    }

    @Override
    public MatrixIterator iterator() {
        return columnMajorIterator();
    }

    @Override
    public MatrixIterator nonZeroIterator() {
        return nonZeroColumnMajorIterator();
    }

    @Override
    public <T> T apply(MatrixOperation<T> operation) {
        return operation.apply(this);
    }
}