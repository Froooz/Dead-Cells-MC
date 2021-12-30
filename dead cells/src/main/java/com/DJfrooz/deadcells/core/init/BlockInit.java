package com.DJfrooz.deadcells.core.init;

import com.DJfrooz.deadcells.DeadCells;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class BlockInit {
	
	private BlockInit() {
	}

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			DeadCells.MODID);
	
	public static final RegistryObject<Block> Mouldy_Bricks = BLOCKS.register("mouldy_bricks", () ->
	new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).strength(3.0f, 7.0f).requiresCorrectToolForDrops()))));
}
