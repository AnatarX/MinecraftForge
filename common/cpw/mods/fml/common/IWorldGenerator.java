/*
 * The FML Forge Mod Loader suite.
 * Copyright (C) 2012 cpw
 *
 * This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this library; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */
package cpw.mods.fml.common;

import java.util.Random;

import cpw.mods.fml.server.FMLServerHandler;

/**
 * This is called back during world generation. The {@link #generate(Random, int, int, Object...)} method passes in some additional data that 
 * can be cast into minecraft objects.
 * 
 * @author cpw
 *
 */
public interface IWorldGenerator
{
    /**
     * Generate some world
     * 
     * @param random the chunk specific {@link Random} as built in {@link FMLServerHandler#onChunkPopulate(net.minecraft.src.IChunkProvider, int, int, net.minecraft.src.World, net.minecraft.src.IChunkProvider)}.
     * @param chunkX the block X coordinate of this chunk.
     * @param chunkZ the block Z coordinate of this chunk.
     * @param world : additionalData[0] The minecraft {@link net.minecraft.src.World} we're generating for.
     * @param generator : additionalData[1] The {@link net.minecraft.src.IChunkProvider} that is generating.
     * @param chunkProvider : additionalData[2] {@link net.minecraft.src.IChunkProvider} that is requesting the world generation.
     * 
     */
    public void generate(Random random, int chunkX, int chunkZ, Object...additionalData);
}
