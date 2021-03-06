package com.nekomaster1000.infernalexp.world.biome;

import com.nekomaster1000.infernalexp.InfernalExpansion;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;

public class BiomeHelper {
    public static int calcSkyColor(float f) {
        float g = f / 3.0F;
        g = MathHelper.clamp(g, -1.0F, 1.0F);
        return MathHelper.hsvToRGB(0.62222224F - g * 0.05F, 0.5F + g * 0.1F, 1.0F);
    }

    public static ConfiguredSurfaceBuilder<?> newConfiguredSurfaceBuilder(String id, ConfiguredSurfaceBuilder<?> configuredSurfaceBuilder) {
        Registry.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER, new ResourceLocation(InfernalExpansion.MOD_ID, id), configuredSurfaceBuilder);
        return configuredSurfaceBuilder;
    }

    public static <T extends IPlacementConfig, G extends Placement<T>> G newDecorator(String id, G decorator) {
        return decorator;
    }
}
