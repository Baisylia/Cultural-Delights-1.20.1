package com.baisylia.culturaldelights.worldgen.tree;

import com.baisylia.culturaldelights.worldgen.ModFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;

public class AvocadoPitGrower extends AbstractTreeGrower {
   @Nullable
   @Override
   protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature( RandomSource p_222910_, boolean pLargeHive ) {
      return ModFeatures.Configured.AVOCADO_PIT;
   }
}