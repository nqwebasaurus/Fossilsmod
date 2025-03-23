package fossils.fossils;

import fossils.fossils.client.ClientProxy;
import fossils.fossils.common.CommonProxy;
import fossils.fossils.init.FossilBlockEntities;
import fossils.fossils.init.FossilBlocks;
import fossils.fossils.init.FossilCreativeTabs;
import fossils.fossils.init.FossilItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FossilMod.MOD_ID)
public class FossilMod {

	public static final String MOD_ID = "fossils";
	@SuppressWarnings("deprecation")
	public static CommonProxy PROXY = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);
	
	public FossilMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		FossilBlocks.REGISTER.register(bus);
		FossilItems.REGISTER.register(bus);
		FossilBlockEntities.REGISTER.register(bus);
		FossilCreativeTabs.REGISTER.register(bus);
		MinecraftForge.EVENT_BUS.register(this);
		
		PROXY.init();
	}
	
}
