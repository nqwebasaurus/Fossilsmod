package fossils.fossils;

import java.util.concurrent.CompletableFuture;

import fossils.fossils.client.ClientProxy;
import fossils.fossils.common.CommonProxy;
import fossils.fossils.datagen.FossilDataGenerator;
import fossils.fossils.init.FossilBlockEntities;
import fossils.fossils.init.FossilBlocks;
import fossils.fossils.init.FossilCreativeTabs;
import fossils.fossils.init.FossilItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.data.event.GatherDataEvent;
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
		FossilItems.SLAB_REGISTER.register(bus);
		FossilItems.BLOCK_REGISTER.register(bus);
		FossilItems.ADVREGISTER.register(bus);
		FossilItems.SKELETON_REGISTER.register(bus);
		FossilBlockEntities.REGISTER.register(bus);
		FossilCreativeTabs.REGISTER.register(bus);
		MinecraftForge.EVENT_BUS.register(this);

		bus.addListener(this::gatherData);

		PROXY.init();
	}
	
	public void gatherData(GatherDataEvent event) {
		DataGenerator dataGenerator = event.getGenerator();
		PackOutput packOutput = dataGenerator.getPackOutput();
		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
		boolean server = event.includeServer();
		dataGenerator.addProvider(server, new FossilDataGenerator(packOutput, lookupProvider));
	}
	
}
