package fossils.fossils.common.item;

import java.util.List;

import javax.annotation.Nullable;

import fossils.fossils.init.FossilItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class FossilItem extends BlockItem {

	public FossilItem(Block p_40565_, Properties p_40566_) {
		super(p_40565_, p_40566_);
	}
	
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		if (stack.getItem() == FossilItems.CARCHARODONTOSAURUS.get()) {
			tooltip.add(Component.translatable("Awarded to user Olo as second prize for Guess-A-Ton Season 1, December 2024"));
		}
		if (stack.getItem() == FossilItems.HUAXIAZHOULONG.get()) {
			tooltip.add(Component.translatable("Awarded to user Defind as first prize for Guess-A-Ton Season 1, December 2024"));
		}
		if (stack.getItem() == FossilItems.PRAEMEGACEROSCAZIOTI.get()) {
			tooltip.add(Component.translatable("Awarded to user Ario203ITA as first prize for Guess-A-Ton Season 2, April 2025"));
		}
		if (stack.getItem() == FossilItems.ANTEOPHTHALMOSUCHUS.get()) {
			tooltip.add(Component.translatable("Awarded to user TrixyLover as second prize for Guess-A-Ton Season 2, April 2025"));
		}
		if (stack.getItem() == FossilItems.AUSTRALOPITHECUSAFRICANUS.get()) {
			tooltip.add(Component.translatable("Awarded to users Aquamarine and Antirrhopus as second prize for Guess-A-Ton Season 3, June 2025"));
		}
		if (stack.getItem() == FossilItems.RUGARHYNCHOS.get()) {
			tooltip.add(Component.translatable("Awarded to user Defind as first prize for Guess-A-Ton Season 3, June 2025"));
		}
	}
	
}
