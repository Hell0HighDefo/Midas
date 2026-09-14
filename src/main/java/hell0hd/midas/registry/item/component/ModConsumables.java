package hell0hd.midas.registry.item.component;

import hell0hd.midas.MidasConfig;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

import java.util.List;



public class ModConsumables {
    public static final Consumable GOLDEN_HEAD = Consumables.defaultFood()
            .consumeSeconds(MidasConfig.goldenHeadConsumeSeconds)
            .onConsume(
                    new ApplyStatusEffectsConsumeEffect(
                            List.of(
                                    new MobEffectInstance(MobEffects.REGENERATION, 100, 2),
                                    new MobEffectInstance(MobEffects.ABSORPTION, 2400, 1),
                                    new MobEffectInstance(MobEffects.SPEED, 280, 1)
                            )
                    )
            )
            .build();
    public static final Consumable GOLDEN_ZOMBIE_HEAD = Consumables.defaultFood()
            .consumeSeconds(MidasConfig.goldenHeadConsumeSeconds)
            .onConsume(
                    new ApplyStatusEffectsConsumeEffect(
                            List.of(
                                    new MobEffectInstance(MobEffects.REGENERATION, 100, 2),
                                    new MobEffectInstance(MobEffects.ABSORPTION, 2400, 1),
                                    new MobEffectInstance(MobEffects.SATURATION, 14, 0)
                            )
                    )
            )
            .build();
    public static final Consumable GOLDEN_PIGLIN_HEAD = Consumables.defaultFood()
            .consumeSeconds(MidasConfig.goldenHeadConsumeSeconds)
            .onConsume(
                    new ApplyStatusEffectsConsumeEffect(
                            List.of(
                                    new MobEffectInstance(MobEffects.REGENERATION, 100, 2),
                                    new MobEffectInstance(MobEffects.ABSORPTION, 2400, 1),
                                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1800, 0)
                            )
                    )
            )
            .build();
    public static final Consumable GOLDEN_CREEPER_HEAD = Consumables.defaultFood()
            .consumeSeconds(MidasConfig.goldenHeadConsumeSeconds)
            .onConsume(
                    new ApplyStatusEffectsConsumeEffect(
                            List.of(
                                    new MobEffectInstance(MobEffects.REGENERATION, 100, 2),
                                    new MobEffectInstance(MobEffects.ABSORPTION, 2400, 1),
                                    new MobEffectInstance(MobEffects.HASTE, 600, 1)
                            )
                    )
            )
            .build();
    public static final Consumable GOLDEN_DRAGON_HEAD = Consumables.defaultFood()
            .consumeSeconds(MidasConfig.goldenHeadConsumeSeconds)
            .onConsume(
                    new ApplyStatusEffectsConsumeEffect(
                            List.of(
                                    new MobEffectInstance(MobEffects.REGENERATION, 100, 2),
                                    new MobEffectInstance(MobEffects.ABSORPTION, 2400, 1),
                                    new MobEffectInstance(MobEffects.RESISTANCE, 200, 2)
                            )
                    )
            )
            .build();

    public static final Consumable GOLDEN_WITHER_SKELETON_SKULL = Consumables.defaultFood()
            .consumeSeconds(MidasConfig.goldenHeadConsumeSeconds)
            .onConsume(
                    new ApplyStatusEffectsConsumeEffect(
                            List.of(
                                    new MobEffectInstance(MobEffects.REGENERATION, 100, 2),
                                    new MobEffectInstance(MobEffects.ABSORPTION, 2400, 1),
                                    new MobEffectInstance(MobEffects.STRENGTH, 200, 1)
                            )
                    )
            )
            .build();
    public static final Consumable GOLDEN_SKULL = Consumables.defaultFood()
            .consumeSeconds(MidasConfig.goldenHeadConsumeSeconds)
            .onConsume(
                    new ApplyStatusEffectsConsumeEffect(
                            List.of(
                                    new MobEffectInstance(MobEffects.REGENERATION, 100, 2),
                                    new MobEffectInstance(MobEffects.ABSORPTION, 2400, 1),
                                    new MobEffectInstance(MobEffects.NIGHT_VISION, 2100, 0)
                            )
                    )
            )
            .build();
}
