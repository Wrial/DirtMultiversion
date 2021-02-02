/*
 * Copyright (c) 2020-2021 Dirt Powered
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.dirtpowered.dirtmv.network.versions.Release47To5.chunk;

import com.github.dirtpowered.dirtmv.network.versions.Beta17To14.storage.BlockStorage;

public class DataFixers {

    public static int getCorrectedDataFor(BlockStorage storage, int x, int y, int z, int blockId, int data) {
        if (blockId == 90) {
            if (storage.getBlockAt(x - 1, y, z) == 49 || storage.getBlockAt(x + 1, y, z) == 49) {
                return 1;
            }

            if (storage.getBlockAt(x, y, z - 1) == 49 || storage.getBlockAt(x, y, z + 1) == 49) {
                return 2;
            }

            // default rotation
            if (data == 0) {
                return 1;
            }
        }

        return data;
    }

    public static boolean shouldCache(int blockId) {
        return blockId == 49 || blockId == 90;
    }
}
