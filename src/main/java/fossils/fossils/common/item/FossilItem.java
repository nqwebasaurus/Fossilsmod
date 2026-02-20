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

	public FossilItem(Block block, Properties props) {
		super(block, props);
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
		if (stack.getItem() == FossilItems.GEMUENDINA.get()) {
			tooltip.add(Component.translatable("Icon texture gently provided by user Aquamarine"));
		}
		if (stack.getItem() == FossilItems.VARANUSPRISCUS.get()) {
			tooltip.add(Component.translatable("Megalania"));
		}
		if (stack.getItem() == FossilItems.MAMMUTHUSCOLUMBI.get()) {
			tooltip.add(Component.translatable("Columbian Mammoth"));
		}
		if (stack.getItem() == FossilItems.BISONLATIFRONS.get()) {
			tooltip.add(Component.translatable("Giant Bison"));
		}
		if (stack.getItem() == FossilItems.SMILODON.get()) {
			tooltip.add(Component.translatable("Saber-Toothed Tiger"));
		}
		if (stack.getItem() == FossilItems.COELODONTA.get()) {
			tooltip.add(Component.translatable("Woolly Rhino"));
		}
		if (stack.getItem() == FossilItems.RANGIFER.get()) {
			tooltip.add(Component.translatable("Reindeer"));
		}
		if (stack.getItem() == FossilItems.DAMADAMA.get()) {
			tooltip.add(Component.translatable("European Fallow Deer"));
		}
		if (stack.getItem() == FossilItems.PANTHERATIGRIS.get()) {
			tooltip.add(Component.translatable("Tiger"));
		}
		if (stack.getItem() == FossilItems.MONACHUS.get()) {
			tooltip.add(Component.translatable("Monk Seal"));
		}
		if (stack.getItem() == FossilItems.TOCKUS.get()) {
			tooltip.add(Component.translatable("Von Decken's Hornbill"));
		}
		if (stack.getItem() == FossilItems.LITOCRANIUS.get()) {
			tooltip.add(Component.translatable("Gerenuk"));
		}
		if (stack.getItem() == FossilItems.DODO.get()) {
			tooltip.add(Component.translatable("Dodo"));
		}
		if (stack.getItem() == FossilItems.PAN.get()) {
			tooltip.add(Component.translatable("Chimpanzee"));
		}
		if (stack.getItem() == FossilItems.THYLACOLEO.get()) {
			tooltip.add(Component.translatable("Marsupial Lion"));
		}
		if (stack.getItem() == FossilItems.EREMOTHERIUM.get()) {
			tooltip.add(Component.translatable("Giant Ground Sloth"));
		}
		if (stack.getItem() == FossilItems.COLUMBA.get()) {
			tooltip.add(Component.translatable("Pigeon"));
		}
		if (stack.getItem() == FossilItems.CERATOTHERIUM.get()) {
			tooltip.add(Component.translatable("White Rhino"));
		}
		if (stack.getItem() == FossilItems.BALAENA.get()) {
			tooltip.add(Component.translatable("Bowhead Whale"));
		}
		if (stack.getItem() == FossilItems.THEROPITHECUS.get()) {
			tooltip.add(Component.translatable("Gelada"));
		}
	}
	
}
