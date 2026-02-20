package fossils.fossils.init;

import fossils.fossils.FossilMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FossilSoundEvents {
	public static final DeferredRegister<SoundEvent> REGISTER = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FossilMod.MOD_ID);
	
	public static final RegistryObject<SoundEvent> MUSIC_DISC_DRIFT_AND_FALL = REGISTER.register("music_disc_drift_and_fall", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(FossilMod.MOD_ID, "music_disc.drift_and_fall")));
	public static final RegistryObject<SoundEvent> MUSIC_DISC_EURYPTERIDS_LAMENT = REGISTER.register("music_disceurypterids_lament", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(FossilMod.MOD_ID, "music_disc.eurypterids_lament")));
}