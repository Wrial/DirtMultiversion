/*
 * Copyright (c) 2020 Dirt Powered
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

package com.github.dirtpowered.dirtmv.network.packet;

import com.github.dirtpowered.dirtmv.network.packet.protocol.data.B1_3.V1_3BProtocol;
import com.github.dirtpowered.dirtmv.network.packet.protocol.data.B1_8.V1_8BProtocol;
import com.github.dirtpowered.dirtmv.network.packet.protocol.data.R1_0.V1_0RProtocol;
import com.github.dirtpowered.dirtmv.network.packet.protocol.data.R1_2_1.V1_2_1RProtocol;
import com.github.dirtpowered.dirtmv.network.packet.protocol.data.R1_3_1.V1_3_1RProtocol;
import com.github.dirtpowered.dirtmv.network.packet.protocol.data.R1_4_6.V1_4_6RProtocol;
import com.github.dirtpowered.dirtmv.network.packet.protocol.data.objects.BlockLocation;
import com.github.dirtpowered.dirtmv.network.packet.protocol.data.objects.ItemStack;
import com.github.dirtpowered.dirtmv.network.packet.protocol.data.objects.Motion;
import com.github.dirtpowered.dirtmv.network.packet.protocol.data.objects.V1_2Chunk;
import com.github.dirtpowered.dirtmv.network.packet.protocol.data.objects.V1_2MultiBlockArray;
import com.github.dirtpowered.dirtmv.network.packet.protocol.data.objects.V1_3BChunk;
import com.github.dirtpowered.dirtmv.network.packet.protocol.data.objects.V1_3BMultiBlockArray;
import com.github.dirtpowered.dirtmv.network.packet.protocol.data.objects.V1_3_4ChunkBulk;
import com.github.dirtpowered.dirtmv.network.packet.protocol.data.objects.WatchableObject;
import com.mojang.nbt.CompoundTag;
import io.netty.buffer.ByteBuf;

import java.io.IOException;

public class Type {
    public static final TypeObject<Byte> BYTE = new TypeObject<>(Byte.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            Protocol.BYTE.write(holder, buffer);
        }
    });

    public static final TypeObject<Short> UNSIGNED_BYTE = new TypeObject<>(Short.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            Protocol.UNSIGNED_BYTE.write(holder, buffer);
        }
    });

    public static final TypeObject<Double> DOUBLE = new TypeObject<>(Double.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            Protocol.DOUBLE.write(holder, buffer);
        }
    });

    public static final TypeObject<Float> FLOAT = new TypeObject<>(Float.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            Protocol.FLOAT.write(holder, buffer);
        }
    });

    public static final TypeObject<Integer> INT = new TypeObject<>(Integer.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            Protocol.INT.write(holder, buffer);
        }
    });

    public static final TypeObject<Long> LONG = new TypeObject<>(Long.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            Protocol.LONG.write(holder, buffer);
        }
    });

    public static final TypeObject<Short> SHORT = new TypeObject<>(Short.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            Protocol.SHORT.write(holder, buffer);
        }
    });

    public static final TypeObject<String> STRING = new TypeObject<>(String.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            Protocol.STRING.write(holder, buffer);
        }
    });

    public static final TypeObject<String> UTF8_STRING = new TypeObject<>(String.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            Protocol.UTF8_STRING.write(holder, buffer);
        }
    });

    public static final TypeObject<Boolean> BOOLEAN = new TypeObject<>(Boolean.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            Protocol.BOOLEAN.write(holder, buffer);
        }
    });

    public static final TypeObject<byte[]> BYTE_BYTE_ARRAY = new TypeObject<>(byte[].class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            Protocol.BYTE_BYTE_ARRAY.write(holder, buffer);
        }
    });

    public static final TypeObject<byte[]> SHORT_BYTE_ARRAY = new TypeObject<>(byte[].class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            Protocol.SHORT_BYTE_ARRAY.write(holder, buffer);
        }
    });

    public static final TypeObject<byte[]> UNSIGNED_SHORT_BYTE_ARRAY = new TypeObject<>(byte[].class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            Protocol.UNSIGNED_SHORT_BYTE_ARRAY.write(holder, buffer);
        }
    });

    public static final TypeObject<byte[]> INT_BYTE_ARRAY = new TypeObject<>(byte[].class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            Protocol.INT_BYTE_ARRAY.write(holder, buffer);
        }
    });

    public static final TypeObject<int[]> BYTE_INT_ARRAY = new TypeObject<>(int[].class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            Protocol.BYTE_INT_ARRAY.write(holder, buffer);
        }
    });

    public static final TypeObject<BlockLocation[]> POSITION_ARRAY = new TypeObject<>(BlockLocation[].class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            V1_3BProtocol.POSITION_ARRAY.write(holder, buffer);
        }
    });

    public static final TypeObject<V1_3BMultiBlockArray> V1_3BMULTIBLOCK_ARRAY = new TypeObject<>(V1_3BMultiBlockArray.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            V1_3BProtocol.MULTIBLOCK_ARRAY.write(holder, buffer);
        }
    });

    public static final TypeObject<V1_2MultiBlockArray> V1_2MULTIBLOCK_ARRAY = new TypeObject<>(V1_2MultiBlockArray.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            V1_2_1RProtocol.MULTIBLOCK_ARRAY.write(holder, buffer);
        }
    });

    public static final TypeObject<ItemStack[]> V1_3B_ITEM_ARRAY = new TypeObject<>(ItemStack[].class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            V1_3BProtocol.ITEM_ARRAY.write(holder, buffer);
        }
    });

    public static final TypeObject<ItemStack[]> V1_0R_ITEM_ARRAY = new TypeObject<>(ItemStack[].class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            V1_0RProtocol.ITEM_ARRAY.write(holder, buffer);
        }
    });

    public static final TypeObject<ItemStack[]> V1_3R_ITEM_ARRAY = new TypeObject<>(ItemStack[].class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            V1_3_1RProtocol.ITEM_ARRAY.write(holder, buffer);
        }
    });

    public static final TypeObject<V1_3BChunk> V1_3B_CHUNK = new TypeObject<>(V1_3BChunk.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            V1_3BProtocol.CHUNK.write(holder, buffer);
        }
    });

    public static final TypeObject<V1_2Chunk> V1_2_CHUNK = new TypeObject<>(V1_2Chunk.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            V1_2_1RProtocol.CHUNK.write(holder, buffer);
        }
    });

    public static final TypeObject<V1_2Chunk> V1_3_CHUNK = new TypeObject<>(V1_2Chunk.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            V1_3_1RProtocol.CHUNK.write(holder, buffer);
        }
    });

    public static final TypeObject<V1_3_4ChunkBulk> V1_3CHUNK_BULK = new TypeObject<>(V1_3_4ChunkBulk.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            V1_3_1RProtocol.CHUNK_BULK.write(holder, buffer);
        }
    });

    public static final TypeObject<V1_3_4ChunkBulk> V1_4CHUNK_BULK = new TypeObject<>(V1_3_4ChunkBulk.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            V1_4_6RProtocol.CHUNK_BULK.write(holder, buffer);
        }
    });

    public static final TypeObject<ItemStack> V1_3B_ITEM = new TypeObject<>(ItemStack.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            V1_3BProtocol.ITEM.write(holder, buffer);
        }
    });

    public static final TypeObject<ItemStack> V1_8B_ITEM = new TypeObject<>(ItemStack.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            V1_8BProtocol.ITEM.write(holder, buffer);
        }
    });

    public static final TypeObject<ItemStack> V1_0R_ITEM = new TypeObject<>(ItemStack.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            V1_0RProtocol.ITEM.write(holder, buffer);
        }
    });
    public static final TypeObject<ItemStack> V1_3R_ITEM = new TypeObject<>(ItemStack.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            V1_3_1RProtocol.ITEM.write(holder, buffer);
        }
    });

    public static final TypeObject<WatchableObject> V1_3B_METADATA = new TypeObject<>(WatchableObject.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            V1_3BProtocol.METADATA.write(holder, buffer);
        }
    });

    public static final TypeObject<WatchableObject> V1_4R_METADATA = new TypeObject<>(WatchableObject.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            V1_4_6RProtocol.METADATA.write(holder, buffer);
        }
    });

    public static final TypeObject<Motion> MOTION = new TypeObject<>(Motion.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            V1_3BProtocol.MOTION.write(holder, buffer);
        }
    });

    public static final TypeObject<CompoundTag> COMPOUND_TAG = new TypeObject<>(CompoundTag.class, new TypeHandler() {
        @Override
        public void handle(TypeHolder holder, ByteBuf buffer) throws IOException {
            Protocol.COMPOUND_TAG.write(holder, buffer);
        }
    });
}
