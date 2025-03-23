package fossils.fossils.client;

import fossils.fossils.FossilMod;
import fossils.fossils.common.CommonProxy;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = FossilMod.MOD_ID, value = Dist.CLIENT)
public class ClientProxy extends CommonProxy {

	public static void setupBlockRenders() {
		
	}
	
	public void init() {
	}
	
}
