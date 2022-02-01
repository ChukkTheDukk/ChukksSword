package net.chukkthedukk.chukksmod;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;

public class TeleportationItem extends SwordItem {
    public TeleportationItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getMainHandStack();

        if (player.getEntityWorld().isClient) {
            Vec3d lookPos = Vec3d.ofCenter(raycast(world, player, RaycastContext.FluidHandling.NONE).getBlockPos());
            player.setPosition(lookPos.x, lookPos.y, lookPos.z);
        }
        stack.setDamage(stack.getDamage()+ 10);
        player.getItemCooldownManager().set(this, 100);
        return super.use(world, player, hand);
    }
    protected static BlockHitResult raycast(World world, PlayerEntity player, RaycastContext.FluidHandling fluidHandling) {
        double range = 100;
        float f = player.getPitch();
        float g = player.getYaw();
        Vec3d vec3d = player.getEyePos();
        float h = MathHelper.cos(-g * ((float) Math.PI / 180F) - (float) Math.PI);
        float i = MathHelper.sin(-g * ((float) Math.PI / 180F) - (float) Math.PI);
        float j = -MathHelper.cos(-f * ((float) Math.PI / 180F));
        float k = MathHelper.sin(-f * ((float) Math.PI / 180F));
        float l = i * j;
        float n = h * j;
        double d = 5.0D;
        Vec3d vec3d2 = vec3d.add((double) l * range, (double) k * range, (double) n * range);
        return world.raycast(new RaycastContext(vec3d, vec3d2, RaycastContext.ShapeType.OUTLINE, fluidHandling, player));
    }
}
