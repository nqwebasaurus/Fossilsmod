package fossils.fossils.client.blockentity.render;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import fossils.fossils.FossilMod;
import fossils.fossils.client.ClientEvents;
import fossils.fossils.client.blockentity.model.adeopapposaurus.AdeopapposaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.adeopapposaurus.AdeopapposaurusFossilModel;
import fossils.fossils.client.blockentity.model.anhanguera.AnhangueraFossilFrameModel;
import fossils.fossils.client.blockentity.model.anhanguera.AnhangueraFossilModel;
import fossils.fossils.client.blockentity.model.anteophthalmosuchus.AnteophthalmosuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.anteophthalmosuchus.AnteophthalmosuchusFossilModel;
import fossils.fossils.client.blockentity.model.anthracosaurus.AnthracosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.anthracosaurus.AnthracosaurusFossilModel;
import fossils.fossils.client.blockentity.model.arizonasaurus.ArizonasaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.arizonasaurus.ArizonasaurusFossilModel;
import fossils.fossils.client.blockentity.model.asiatyrannus.AsiatyrannusFossilFrameModel;
import fossils.fossils.client.blockentity.model.asiatyrannus.AsiatyrannusFossilModel;
import fossils.fossils.client.blockentity.model.atopodentatus.AtopodentatusFossilFrameModel;
import fossils.fossils.client.blockentity.model.atopodentatus.AtopodentatusFossilModel;
import fossils.fossils.client.blockentity.model.australopithecusafricanus.AustralopithecusafricanusFossilFrameModel;
import fossils.fossils.client.blockentity.model.australopithecusafricanus.AustralopithecusafricanusFossilModel;
import fossils.fossils.client.blockentity.model.australovenator.AustralovenatorFossilFrameModel;
import fossils.fossils.client.blockentity.model.australovenator.AustralovenatorFossilModel;
import fossils.fossils.client.blockentity.model.barbosania.BarbosaniaFossilFrameModel;
import fossils.fossils.client.blockentity.model.barbosania.BarbosaniaFossilModel;
import fossils.fossils.client.blockentity.model.barylambda.BarylambdaFossilFrameModel;
import fossils.fossils.client.blockentity.model.barylambda.BarylambdaFossilModel;
import fossils.fossils.client.blockentity.model.beipiaosaurus.BeipiaosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.beipiaosaurus.BeipiaosaurusFossilModel;
import fossils.fossils.client.blockentity.model.bobosaurus.BobosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.bobosaurus.BobosaurusFossilModel;
import fossils.fossils.client.blockentity.model.bunostegos.BunostegosFossilFrameModel;
import fossils.fossils.client.blockentity.model.bunostegos.BunostegosFossilModel;
import fossils.fossils.client.blockentity.model.champsosaurus.ChampsosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.champsosaurus.ChampsosaurusFossilModel;
import fossils.fossils.client.blockentity.model.chilesaurus.ChilesaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.chilesaurus.ChilesaurusFossilModel;
import fossils.fossils.client.blockentity.model.chungkingosaurus.ChungkingosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.chungkingosaurus.ChungkingosaurusFossilModel;
import fossils.fossils.client.blockentity.model.coelophysis.CoelophysisFossilFrameModel;
import fossils.fossils.client.blockentity.model.coelophysis.CoelophysisFossilModel;
import fossils.fossils.client.blockentity.model.comptonatus.ComptonatusFossilFrameModel;
import fossils.fossils.client.blockentity.model.comptonatus.ComptonatusFossilModel;
import fossils.fossils.client.blockentity.model.crassigyrinus.CrassigyrinusFossilFrameModel;
import fossils.fossils.client.blockentity.model.crassigyrinus.CrassigyrinusFossilModel;
import fossils.fossils.client.blockentity.model.criocephalosaurus.CriocephalosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.criocephalosaurus.CriocephalosaurusFossilModel;
import fossils.fossils.client.blockentity.model.cryptoclidus.CryptoclidusFossilFrameModel;
import fossils.fossils.client.blockentity.model.cryptoclidus.CryptoclidusFossilModel;
import fossils.fossils.client.blockentity.model.ctenochasma.CtenochasmaFossilFrameModel;
import fossils.fossils.client.blockentity.model.ctenochasma.CtenochasmaFossilModel;
import fossils.fossils.client.blockentity.model.ctenospondylus.CtenospondylusFossilFrameModel;
import fossils.fossils.client.blockentity.model.ctenospondylus.CtenospondylusFossilModel;
import fossils.fossils.client.blockentity.model.cynognathus.CynognathusFossilFrameModel;
import fossils.fossils.client.blockentity.model.cynognathus.CynognathusFossilModel;
import fossils.fossils.client.blockentity.model.damadama.DamadamaFossilFrameModel;
import fossils.fossils.client.blockentity.model.damadama.DamadamaFossilModel;
import fossils.fossils.client.blockentity.model.daurlong.DaurlongFossilFrameModel;
import fossils.fossils.client.blockentity.model.daurlong.DaurlongFossilModel;
import fossils.fossils.client.blockentity.model.dearc.DearcFossilFrameModel;
import fossils.fossils.client.blockentity.model.dearc.DearcFossilModel;
import fossils.fossils.client.blockentity.model.deuterosaurus.DeuterosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.deuterosaurus.DeuterosaurusFossilModel;
import fossils.fossils.client.blockentity.model.diabloceratops.DiabloceratopsFossilFrameModel;
import fossils.fossils.client.blockentity.model.diabloceratops.DiabloceratopsFossilModel;
import fossils.fossils.client.blockentity.model.diadectes.DiadectesFossilFrameModel;
import fossils.fossils.client.blockentity.model.diadectes.DiadectesFossilModel;
import fossils.fossils.client.blockentity.model.dimetrodongrandis.DimetrodonFossilFrameModel;
import fossils.fossils.client.blockentity.model.dimetrodongrandis.DimetrodonFossilModel;
import fossils.fossils.client.blockentity.model.dinocrocuta.DinocrocutaFossilFrameModel;
import fossils.fossils.client.blockentity.model.dinocrocuta.DinocrocutaFossilModel;
import fossils.fossils.client.blockentity.model.dodo.DodoFossilFrameModel;
import fossils.fossils.client.blockentity.model.dodo.DodoFossilModel;
import fossils.fossils.client.blockentity.model.dorudon.DorudonFossilFrameModel;
import fossils.fossils.client.blockentity.model.dorudon.DorudonFossilModel;
import fossils.fossils.client.blockentity.model.dryosaurus.DryosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.dryosaurus.DryosaurusFossilModel;
import fossils.fossils.client.blockentity.model.dsungaripterus.DsungaripterusFossilFrameModel;
import fossils.fossils.client.blockentity.model.dsungaripterus.DsungaripterusFossilModel;
import fossils.fossils.client.blockentity.model.dunkleosteus.DunkleosteusFossilFrameModel;
import fossils.fossils.client.blockentity.model.dunkleosteus.DunkleosteusFossilModel;
import fossils.fossils.client.blockentity.model.edaphosaurus.EdaphosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.edaphosaurus.EdaphosaurusFossilModel;
import fossils.fossils.client.blockentity.model.einiosaurus.EiniosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.einiosaurus.EiniosaurusFossilModel;
import fossils.fossils.client.blockentity.model.endothiodonbathystoma.EndothiodonbathystomaFossilFrameModel;
import fossils.fossils.client.blockentity.model.endothiodonbathystoma.EndothiodonbathystomaFossilModel;
import fossils.fossils.client.blockentity.model.eorhynchochelys.EorhynchochelysFossilFrameModel;
import fossils.fossils.client.blockentity.model.eorhynchochelys.EorhynchochelysFossilModel;
import fossils.fossils.client.blockentity.model.eryops.EryopsFossilFrameModel;
import fossils.fossils.client.blockentity.model.eryops.EryopsFossilModel;
import fossils.fossils.client.blockentity.model.europasaurus.EuropasaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.europasaurus.EuropasaurusFossilModel;
import fossils.fossils.client.blockentity.model.europelta.EuropeltaFossilFrameModel;
import fossils.fossils.client.blockentity.model.europelta.EuropeltaFossilModel;
import fossils.fossils.client.blockentity.model.eustreptospondylus.EustreptospondylusFossilFrameModel;
import fossils.fossils.client.blockentity.model.eustreptospondylus.EustreptospondylusFossilModel;
import fossils.fossils.client.blockentity.model.falcarius.FalcariusFossilFrameModel;
import fossils.fossils.client.blockentity.model.falcarius.FalcariusFossilModel;
import fossils.fossils.client.blockentity.model.fukuisaurus.FukuisaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.fukuisaurus.FukuisaurusFossilModel;
import fossils.fossils.client.blockentity.model.gastonia.GastoniaFossilFrameModel;
import fossils.fossils.client.blockentity.model.gastonia.GastoniaFossilModel;
import fossils.fossils.client.blockentity.model.gastornis.GastornisFossilFrameModel;
import fossils.fossils.client.blockentity.model.gastornis.GastornisFossilModel;
import fossils.fossils.client.blockentity.model.gigantspinosaurus.GigantspinosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.gigantspinosaurus.GigantspinosaurusFossilModel;
import fossils.fossils.client.blockentity.model.guanlong.GuanlongFossilFrameModel;
import fossils.fossils.client.blockentity.model.guanlong.GuanlongFossilModel;
import fossils.fossils.client.blockentity.model.haliskia.HaliskiaFossilFrameModel;
import fossils.fossils.client.blockentity.model.haliskia.HaliskiaFossilModel;
import fossils.fossils.client.blockentity.model.hamipterus.HamipterusFossilFrameModel;
import fossils.fossils.client.blockentity.model.hamipterus.HamipterusFossilModel;
import fossils.fossils.client.blockentity.model.hippidion.HippidionFossilFrameModel;
import fossils.fossils.client.blockentity.model.hippidion.HippidionFossilModel;
import fossils.fossils.client.blockentity.model.huayangosaurus.HuayangosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.huayangosaurus.HuayangosaurusFossilModel;
import fossils.fossils.client.blockentity.model.hypselospinus.HypselospinusFossilFrameModel;
import fossils.fossils.client.blockentity.model.hypselospinus.HypselospinusFossilModel;
import fossils.fossils.client.blockentity.model.hypsilophodon.HypsilophodonFossilFrameModel;
import fossils.fossils.client.blockentity.model.hypsilophodon.HypsilophodonFossilModel;
import fossils.fossils.client.blockentity.model.ichthyosaurus.IchthyosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.ichthyosaurus.IchthyosaurusFossilModel;
import fossils.fossils.client.blockentity.model.jinyunpelta.JinyunpeltaFossilFrameModel;
import fossils.fossils.client.blockentity.model.jinyunpelta.JinyunpeltaFossilModel;
import fossils.fossils.client.blockentity.model.jinzhousaurus.JinzhousaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.jinzhousaurus.JinzhousaurusFossilModel;
import fossils.fossils.client.blockentity.model.kannemeyeria.KannemeyeriaFossilFrameModel;
import fossils.fossils.client.blockentity.model.kannemeyeria.KannemeyeriaFossilModel;
import fossils.fossils.client.blockentity.model.kentrosaurus.KentrosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.kentrosaurus.KentrosaurusFossilModel;
import fossils.fossils.client.blockentity.model.kunbarrasaurus.KunbarrasaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.kunbarrasaurus.KunbarrasaurusFossilModel;
import fossils.fossils.client.blockentity.model.kutchicetus.KutchicetusFossilFrameModel;
import fossils.fossils.client.blockentity.model.kutchicetus.KutchicetusFossilModel;
import fossils.fossils.client.blockentity.model.lajasvenator.LajasvenatorFossilFrameModel;
import fossils.fossils.client.blockentity.model.lajasvenator.LajasvenatorFossilModel;
import fossils.fossils.client.blockentity.model.leaellynasaura.LeaellynasauraFossilFrameModel;
import fossils.fossils.client.blockentity.model.leaellynasaura.LeaellynasauraFossilModel;
import fossils.fossils.client.blockentity.model.leptocleidus.LeptocleidusFossilFrameModel;
import fossils.fossils.client.blockentity.model.leptocleidus.LeptocleidusFossilModel;
import fossils.fossils.client.blockentity.model.limnoscelis.LimnoscelisFossilFrameModel;
import fossils.fossils.client.blockentity.model.limnoscelis.LimnoscelisFossilModel;
import fossils.fossils.client.blockentity.model.limusaurus.LimusaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.limusaurus.LimusaurusFossilModel;
import fossils.fossils.client.blockentity.model.litocranius.LitocraniusFossilFrameModel;
import fossils.fossils.client.blockentity.model.litocranius.LitocraniusFossilModel;
import fossils.fossils.client.blockentity.model.lotosaurus.LotosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.lotosaurus.LotosaurusFossilModel;
import fossils.fossils.client.blockentity.model.ludodactylus.LudodactylusFossilFrameModel;
import fossils.fossils.client.blockentity.model.ludodactylus.LudodactylusFossilModel;
import fossils.fossils.client.blockentity.model.lufengosaurus.LufengosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.lufengosaurus.LufengosaurusFossilModel;
import fossils.fossils.client.blockentity.model.lystrosaurusmaccaigi.LystrosaurusmaccaigiFossilFrameModel;
import fossils.fossils.client.blockentity.model.lystrosaurusmaccaigi.LystrosaurusmaccaigiFossilModel;
import fossils.fossils.client.blockentity.model.megalocephalus.MegalocephalusFossilFrameModel;
import fossils.fossils.client.blockentity.model.megalocephalus.MegalocephalusFossilModel;
import fossils.fossils.client.blockentity.model.minqaria.MinqariaFossilFrameModel;
import fossils.fossils.client.blockentity.model.minqaria.MinqariaFossilModel;
import fossils.fossils.client.blockentity.model.monachus.MonachusFossilFrameModel;
import fossils.fossils.client.blockentity.model.monachus.MonachusFossilModel;
import fossils.fossils.client.blockentity.model.montanoceratops.MontanoceratopsFossilFrameModel;
import fossils.fossils.client.blockentity.model.montanoceratops.MontanoceratopsFossilModel;
import fossils.fossils.client.blockentity.model.moschops.MoschopsFossilFrameModel;
import fossils.fossils.client.blockentity.model.moschops.MoschopsFossilModel;
import fossils.fossils.client.blockentity.model.mymoorapelta.MymoorapeltaFossilFrameModel;
import fossils.fossils.client.blockentity.model.mymoorapelta.MymoorapeltaFossilModel;
import fossils.fossils.client.blockentity.model.nannopterygius.NannopterygiusFossilFrameModel;
import fossils.fossils.client.blockentity.model.nannopterygius.NannopterygiusFossilModel;
import fossils.fossils.client.blockentity.model.nasutoceratops.NasutoceratopsFossilFrameModel;
import fossils.fossils.client.blockentity.model.nasutoceratops.NasutoceratopsFossilModel;
import fossils.fossils.client.blockentity.model.nicrosaurus.NicrosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.nicrosaurus.NicrosaurusFossilModel;
import fossils.fossils.client.blockentity.model.nigerpeton.NigerpetonFossilFrameModel;
import fossils.fossils.client.blockentity.model.nigerpeton.NigerpetonFossilModel;
import fossils.fossils.client.blockentity.model.obdurodon.ObdurodonFossilFrameModel;
import fossils.fossils.client.blockentity.model.obdurodon.ObdurodonFossilModel;
import fossils.fossils.client.blockentity.model.odobenocetops.OdobenocetopsFossilFrameModel;
import fossils.fossils.client.blockentity.model.odobenocetops.OdobenocetopsFossilModel;
import fossils.fossils.client.blockentity.model.ophiacodon.OphiacodonFossilFrameModel;
import fossils.fossils.client.blockentity.model.ophiacodon.OphiacodonFossilModel;
import fossils.fossils.client.blockentity.model.ophthalmosaurus.OphthalmosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.ophthalmosaurus.OphthalmosaurusFossilModel;
import fossils.fossils.client.blockentity.model.ornatops.OrnatopsFossilFrameModel;
import fossils.fossils.client.blockentity.model.ornatops.OrnatopsFossilModel;
import fossils.fossils.client.blockentity.model.ornitholestes.OrnitholestesFossilFrameModel;
import fossils.fossils.client.blockentity.model.ornitholestes.OrnitholestesFossilModel;
import fossils.fossils.client.blockentity.model.oxydactylus.OxydactylusFossilFrameModel;
import fossils.fossils.client.blockentity.model.oxydactylus.OxydactylusFossilModel;
import fossils.fossils.client.blockentity.model.pezosiren.PezosirenFossilFrameModel;
import fossils.fossils.client.blockentity.model.pezosiren.PezosirenFossilModel;
import fossils.fossils.client.blockentity.model.piatnitzkysaurus.PiatnitzkysaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.piatnitzkysaurus.PiatnitzkysaurusFossilModel;
import fossils.fossils.client.blockentity.model.placerias.PlaceriasFossilFrameModel;
import fossils.fossils.client.blockentity.model.placerias.PlaceriasFossilModel;
import fossils.fossils.client.blockentity.model.placodus.PlacodusFossilFrameModel;
import fossils.fossils.client.blockentity.model.placodus.PlacodusFossilModel;
import fossils.fossils.client.blockentity.model.plesiosaurus.PlesiosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.plesiosaurus.PlesiosaurusFossilModel;
import fossils.fossils.client.blockentity.model.polacanthus.PolacanthusFossilFrameModel;
import fossils.fossils.client.blockentity.model.polacanthus.PolacanthusFossilModel;
import fossils.fossils.client.blockentity.model.poposaurus.PoposaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.poposaurus.PoposaurusFossilModel;
import fossils.fossils.client.blockentity.model.praemegaceroscazioti.PraemegaceroscaziotiFossilFrameModel;
import fossils.fossils.client.blockentity.model.praemegaceroscazioti.PraemegaceroscaziotiFossilModel;
import fossils.fossils.client.blockentity.model.prenocephale.PrenocephaleFossilFrameModel;
import fossils.fossils.client.blockentity.model.prenocephale.PrenocephaleFossilModel;
import fossils.fossils.client.blockentity.model.proa.ProaFossilFrameModel;
import fossils.fossils.client.blockentity.model.proa.ProaFossilModel;
import fossils.fossils.client.blockentity.model.proceratosaurus.ProceratosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.proceratosaurus.ProceratosaurusFossilModel;
import fossils.fossils.client.blockentity.model.prodinoceras.ProdinocerasFossilFrameModel;
import fossils.fossils.client.blockentity.model.prodinoceras.ProdinocerasFossilModel;
import fossils.fossils.client.blockentity.model.protoceratopsandrewsi.ProtoceratopsandrewsiFossilFrameModel;
import fossils.fossils.client.blockentity.model.protoceratopsandrewsi.ProtoceratopsandrewsiFossilModel;
import fossils.fossils.client.blockentity.model.psittacosaurussibiricus.PsittacosaurussibiricusFossilFrameModel;
import fossils.fossils.client.blockentity.model.psittacosaurussibiricus.PsittacosaurussibiricusFossilModel;
import fossils.fossils.client.blockentity.model.pterodaustro.PterodaustroFossilFrameModel;
import fossils.fossils.client.blockentity.model.pterodaustro.PterodaustroFossilModel;
import fossils.fossils.client.blockentity.model.qianosuchus.QianosuchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.qianosuchus.QianosuchusFossilModel;
import fossils.fossils.client.blockentity.model.rabidosaurus.RabidosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.rabidosaurus.RabidosaurusFossilModel;
import fossils.fossils.client.blockentity.model.rangifer.RangiferFossilFrameModel;
import fossils.fossils.client.blockentity.model.rangifer.RangiferFossilModel;
import fossils.fossils.client.blockentity.model.rechnisaurus.RechnisaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.rechnisaurus.RechnisaurusFossilModel;
import fossils.fossils.client.blockentity.model.rhamphorhynchus.RhamphorhynchusFossilFrameModel;
import fossils.fossils.client.blockentity.model.rhamphorhynchus.RhamphorhynchusFossilModel;
import fossils.fossils.client.blockentity.model.rugarhynchos.RugarhynchosFossilFrameModel;
import fossils.fossils.client.blockentity.model.rugarhynchos.RugarhynchosFossilModel;
import fossils.fossils.client.blockentity.model.ruhuhucerberus.RuhuhucerberusFossilFrameModel;
import fossils.fossils.client.blockentity.model.ruhuhucerberus.RuhuhucerberusFossilModel;
import fossils.fossils.client.blockentity.model.scelidosaurus.ScelidosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.scelidosaurus.ScelidosaurusFossilModel;
import fossils.fossils.client.blockentity.model.secodontosaurus.SecodontosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.secodontosaurus.SecodontosaurusFossilModel;
import fossils.fossils.client.blockentity.model.shringasaurus.ShringasaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.shringasaurus.ShringasaurusFossilModel;
import fossils.fossils.client.blockentity.model.simolestes.SimolestesFossilFrameModel;
import fossils.fossils.client.blockentity.model.simolestes.SimolestesFossilModel;
import fossils.fossils.client.blockentity.model.simosthenurus.SimosthenurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.simosthenurus.SimosthenurusFossilModel;
import fossils.fossils.client.blockentity.model.sinclairomeryx.SinclairomeryxFossilFrameModel;
import fossils.fossils.client.blockentity.model.sinclairomeryx.SinclairomeryxFossilModel;
import fossils.fossils.client.blockentity.model.sinosaurussinensis.SinosaurussinensisFossilFrameModel;
import fossils.fossils.client.blockentity.model.sinosaurussinensis.SinosaurussinensisFossilModel;
import fossils.fossils.client.blockentity.model.skorpiovenator.SkorpiovenatorFossilFrameModel;
import fossils.fossils.client.blockentity.model.skorpiovenator.SkorpiovenatorFossilModel;
import fossils.fossils.client.blockentity.model.spectrovenator.SpectrovenatorFossilFrameModel;
import fossils.fossils.client.blockentity.model.spectrovenator.SpectrovenatorFossilModel;
import fossils.fossils.client.blockentity.model.stagonolepis.StagonolepisFossilFrameModel;
import fossils.fossils.client.blockentity.model.stagonolepis.StagonolepisFossilModel;
import fossils.fossils.client.blockentity.model.stahleckeria.StahleckeriaFossilFrameModel;
import fossils.fossils.client.blockentity.model.stahleckeria.StahleckeriaFossilModel;
import fossils.fossils.client.blockentity.model.stanocephalosaurus.StanocephalosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.stanocephalosaurus.StanocephalosaurusFossilModel;
import fossils.fossils.client.blockentity.model.struthiomimus.StruthiomimusFossilFrameModel;
import fossils.fossils.client.blockentity.model.struthiomimus.StruthiomimusFossilModel;
import fossils.fossils.client.blockentity.model.synthetoceras.SynthetocerasFossilFrameModel;
import fossils.fossils.client.blockentity.model.synthetoceras.SynthetocerasFossilModel;
import fossils.fossils.client.blockentity.model.tanycolagreus.TanycolagreusFossilFrameModel;
import fossils.fossils.client.blockentity.model.tanycolagreus.TanycolagreusFossilModel;
import fossils.fossils.client.blockentity.model.teleocrater.TeleocraterFossilFrameModel;
import fossils.fossils.client.blockentity.model.teleocrater.TeleocraterFossilModel;
import fossils.fossils.client.blockentity.model.thecodontosaurus.ThecodontosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.thecodontosaurus.ThecodontosaurusFossilModel;
import fossils.fossils.client.blockentity.model.theropithecus.TheropithecusFossilFrameModel;
import fossils.fossils.client.blockentity.model.theropithecus.TheropithecusFossilModel;
import fossils.fossils.client.blockentity.model.thylacoleo.ThylacoleoFossilFrameModel;
import fossils.fossils.client.blockentity.model.thylacoleo.ThylacoleoFossilModel;
import fossils.fossils.client.blockentity.model.trilophosaurus.TrilophosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.trilophosaurus.TrilophosaurusFossilModel;
import fossils.fossils.client.blockentity.model.tupandactylusnavigans.TupandactylusnavigansFossilFrameModel;
import fossils.fossils.client.blockentity.model.tupandactylusnavigans.TupandactylusnavigansFossilModel;
import fossils.fossils.client.blockentity.model.vancleavea.VancleaveaFossilFrameModel;
import fossils.fossils.client.blockentity.model.vancleavea.VancleaveaFossilModel;
import fossils.fossils.client.blockentity.model.vivaxosaurus.VivaxosaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.vivaxosaurus.VivaxosaurusFossilModel;
import fossils.fossils.client.blockentity.model.yunguisaurus.YunguisaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.yunguisaurus.YunguisaurusFossilModel;
import fossils.fossils.client.blockentity.model.yuxisaurus.YuxisaurusFossilFrameModel;
import fossils.fossils.client.blockentity.model.yuxisaurus.YuxisaurusFossilModel;
import fossils.fossils.client.blockentity.model.zanabazar.ZanabazarFossilFrameModel;
import fossils.fossils.client.blockentity.model.zanabazar.ZanabazarFossilModel;
import fossils.fossils.client.blockentity.model.zhenyuanlong.ZhenyuanlongFossilFrameModel;
import fossils.fossils.client.blockentity.model.zhenyuanlong.ZhenyuanlongFossilModel;
import fossils.fossils.common.block.FossilSkeletonTenPieceBlock;
import fossils.fossils.common.entity.block.FossilSkeletonTenPieceBlockEntity;
import net.minecraft.Util;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.RotationSegment;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FossilSkeletonTenPieceRenderer implements BlockEntityRenderer<FossilSkeletonTenPieceBlockEntity> {
    private final Map<FossilSkeletonTenPieceBlock.Type, SkullModelBase> skeletonModelByType;
    private final Map<FossilSkeletonTenPieceBlock.Type, SkullModelBase> frameModelByType;
    public static final Map<FossilSkeletonTenPieceBlock.Type, ResourceLocation> SKIN_BY_TYPE = Util.make(Maps.newHashMap(), (type) -> {
        type.put(FossilSkeletonTenPieceBlock.Types.KENTROSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kentrosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.NASUTOCERATOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nasutoceratops/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SYNTHETOCERAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/synthetoceras/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ENDOTHIODONBATHYSTOMA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/endothiodonbathystoma/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.NIGERPETON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nigerpeton/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PLACERIAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/placerias/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ARIZONASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/arizonasaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.POPOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/poposaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.STAHLECKERIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stahleckeria/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.STAGONOLEPIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stagonolepis/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.GUANLONG, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/guanlong/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ICHTHYOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ichthyosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SCELIDOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/scelidosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PIATNITZKYSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/piatnitzkysaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DEARC, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dearc/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.TUPANDACTYLUSNAVIGANS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tupandactylusnavigans/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SKORPIOVENATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/skorpiovenator/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PROTOCERATOPSANDREWSI, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/protoceratopsandrewsi/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.STRUTHIOMIMUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/struthiomimus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.MONTANOCERATOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/montanoceratops/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DORUDON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dorudon/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.GASTORNIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/gastornis/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.KUTCHICETUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/gastornis/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PRODINOCERAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/prodinoceras/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.THYLACOLEO, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/thylacoleo/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SINCLAIROMERYX, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sinclairomeryx/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DINOCROCUTA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dinocrocuta/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.COELOPHYSIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/coelophysis/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LITOCRANIUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/litocranius/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.THEROPITHECUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/theropithecus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DODO, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dodo/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DIABLOCERATOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diabloceratops/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.BARYLAMBDA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/barylambda/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ODOBENOCETOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/odobenocetops/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.MONACHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/monachus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.CRASSIGYRINUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/crassigyrinus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ATOPODENTATUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/atopodentatus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LUDODACTYLUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ludodactylus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DUNKLEOSTEUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dunkleosteus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ANTEOPHTHALMOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/anteophthalmosuchus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PRAEMEGACEROSCAZIOTI, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/praemegaceroscazioti/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.CHAMPSOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/champsosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.OXYDACTYLUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/oxydactylus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.HIPPIDION, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hippidion/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.EDAPHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/edaphosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ANTHRACOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/anthracosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.BEIPIAOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/beipiaosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.NANNOPTERYGIUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nannopterygius/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.RECHNISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rechnisaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PTERODAUSTRO, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pterodaustro/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SIMOLESTES, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/simolestes/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.GASTONIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/gastonia/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LOTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lotosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SIMOSTHENURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/simosthenurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.TRILOPHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/trilophosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LEPTOCLEIDUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/leptocleidus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.HYPSELOSPINUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hypselospinus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.EINIOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/einiosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ORNATOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ornatops/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.RANGIFER, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rangifer/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DAURLONG, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/daurlong/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PROCERATOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/proceratosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.CHUNGKINGOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/chungkingosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SINOSAURUSSINENSIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sinosaurussinensis/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.AUSTRALOVENATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/australovenator/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.FALCARIUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/falcarius/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.EUROPELTA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/europelta/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.KUNBARRASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kunbarrasaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.KANNEMEYERIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kannemeyeria/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.RABIDOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rabidosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.JINZHOUSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/jinzhousaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LUFENGOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lufengosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LEAELLYNASAURA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/leaellynasaura/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LIMNOSCELIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/limnoscelis/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.NICROSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nicrosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.CTENOCHASMA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ctenochasma/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ASIATYRANNUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/asiatyrannus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PSITTACOSAURUSSIBIRICUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/psittacosaurussibiricus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.HYPSILOPHODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hypsilophodon/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.HAMIPTERUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hamipterus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SECODONTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/secodontosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.HALISKIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/haliskia/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.QIANOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/qianosuchus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.POLACANTHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/polacanthus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.OBDURODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/obdurodon/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.BARBOSANIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/barbosania/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ANHANGUERA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/anhanguera/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DSUNGARIPTERUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dsungaripterus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LAJASVENATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lajasvenator/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DAMADAMA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/damadama/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.RUHUHUCERBERUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ruhuhucerberus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.COMPTONATUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/comptonatus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.FUKUISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/fukuisaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.JINYUNPELTA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/jinyunpelta/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SPECTROVENATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/spectrovenator/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PROA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/proa/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ZHENYUANLONG, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/zhenyuanlong/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.EUSTREPTOSPONDYLUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eustreptospondylus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ORNITHOLESTES, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ornitholestes/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.OPHIACODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ophiacodon/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.CRIOCEPHALOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/criocephalosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DRYOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dryosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.CHILESAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/chilesaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DEUTEROSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/deuterosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.RHAMPHORHYNCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rhamphorhynchus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PLACODUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/placodus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.OPHTHALMOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ophthalmosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LYSTROSAURUSMACCAIGI, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lystrosaurusmaccaigi/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PLESIOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/plesiosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.VIVAXOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/vivaxosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.EUROPASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/europasaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.HUAYANGOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/huayangosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ERYOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eryops/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.MEGALOCEPHALUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/megalocephalus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PEZOSIREN, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pezosiren/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SHRINGASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/shringasaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.BUNOSTEGOS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bunostegos/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.GIGANTSPINOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/gigantspinosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.YUNGUISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yunguisaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.BOBOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bobosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.CRYPTOCLIDUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/cryptoclidus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ZANABAZAR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/zanabazar/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.YUXISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yuxisaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.TELEOCRATER, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/teleocrater/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LIMUSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/limusaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DIADECTES, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diadectes/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ADEOPAPPOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/adeopapposaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.CTENOSPONDYLUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ctenospondylus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.VANCLEAVEA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/vancleavea/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.AUSTRALOPITHECUSAFRICANUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/australopithecusafricanus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.RUGARHYNCHOS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rugarhynchos/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.TANYCOLAGREUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tanycolagreus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.EORHYNCHOCHELYS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eorhynchochelys/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.MYMOORAPELTA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/mymoorapelta/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.STANOCEPHALOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stanocephalosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.CYNOGNATHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/cynognathus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.THECODONTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/thecodontosaurus/stage_0.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.MINQARIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/minqaria/stage_0.png"));

    });
    public static final Map<FossilSkeletonTenPieceBlock.Type, ResourceLocation> FRAME_BY_TYPE = Util.make(Maps.newHashMap(), (type) -> {
        type.put(FossilSkeletonTenPieceBlock.Types.KENTROSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kentrosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.NASUTOCERATOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nasutoceratops/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SYNTHETOCERAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/synthetoceras/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ENDOTHIODONBATHYSTOMA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/endothiodonbathystoma/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.NIGERPETON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nigerpeton/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PLACERIAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/placerias/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ARIZONASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/arizonasaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.POPOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/poposaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.STAHLECKERIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stahleckeria/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.STAGONOLEPIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stagonolepis/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.GUANLONG, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/guanlong/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ICHTHYOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ichthyosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SCELIDOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/scelidosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PIATNITZKYSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/piatnitzkysaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DEARC, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dearc/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.TUPANDACTYLUSNAVIGANS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tupandactylusnavigans/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SKORPIOVENATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/skorpiovenator/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PROTOCERATOPSANDREWSI, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/protoceratopsandrewsi/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.STRUTHIOMIMUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/struthiomimus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.MONTANOCERATOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/montanoceratops/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DORUDON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dorudon/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.GASTORNIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/gastornis/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.KUTCHICETUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kutchicetus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PRODINOCERAS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/prodinoceras/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.THYLACOLEO, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/thylacoleo/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SINCLAIROMERYX, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sinclairomeryx/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DINOCROCUTA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dinocrocuta/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.COELOPHYSIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/coelophysis/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LITOCRANIUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/litocranius/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.THEROPITHECUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/theropithecus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DODO, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dodo/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DIABLOCERATOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diabloceratops/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.BARYLAMBDA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/barylambda/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ODOBENOCETOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/odobenocetops/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.MONACHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/monachus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.CRASSIGYRINUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/crassigyrinus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ATOPODENTATUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/atopodentatus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LUDODACTYLUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ludodactylus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DUNKLEOSTEUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dunkleosteus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ANTEOPHTHALMOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/anteophthalmosuchus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PRAEMEGACEROSCAZIOTI, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/praemegaceroscazioti/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.CHAMPSOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/champsosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.OXYDACTYLUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/oxydactylus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.HIPPIDION, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hippidion/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.EDAPHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/edaphosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ANTHRACOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/anthracosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.BEIPIAOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/beipiaosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.NANNOPTERYGIUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nannopterygius/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PRENOCEPHALE, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/prenocephale/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.RECHNISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rechnisaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PTERODAUSTRO, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pterodaustro/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SIMOLESTES, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/simolestes/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.GASTONIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/gastonia/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LOTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lotosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SIMOSTHENURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/simosthenurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.TRILOPHOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/trilophosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LEPTOCLEIDUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/leptocleidus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.HYPSELOSPINUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hypselospinus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.EINIOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/einiosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ORNATOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ornatops/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.RANGIFER, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rangifer/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DAURLONG, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/daurlong/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PROCERATOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/proceratosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.CHUNGKINGOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/chungkingosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SINOSAURUSSINENSIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sinosaurussinensis/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.AUSTRALOVENATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/australovenator/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.FALCARIUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/falcarius/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.EUROPELTA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/europelta/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.KUNBARRASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kunbarrasaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.KANNEMEYERIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kannemeyeria/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.RABIDOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rabidosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.JINZHOUSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/jinzhousaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LUFENGOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lufengosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LEAELLYNASAURA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/leaellynasaura/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LIMNOSCELIS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/limnoscelis/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.NICROSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nicrosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.CTENOCHASMA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ctenochasma/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ASIATYRANNUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/asiatyrannus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PSITTACOSAURUSSIBIRICUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/psittacosaurussibiricus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.HYPSILOPHODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hypsilophodon/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.HAMIPTERUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hamipterus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SECODONTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/secodontosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.HALISKIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/haliskia/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.QIANOSUCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/qianosuchus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.POLACANTHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/polacanthus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.OBDURODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/obdurodon/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.BARBOSANIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/barbosania/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ANHANGUERA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/anhanguera/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DSUNGARIPTERUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dsungaripterus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LAJASVENATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lajasvenator/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DAMADAMA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/damadama/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.RUHUHUCERBERUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ruhuhucerberus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.COMPTONATUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/comptonatus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.FUKUISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/fukuisaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.JINYUNPELTA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/jinyunpelta/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SPECTROVENATOR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/spectrovenator/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PROA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/proa/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ZHENYUANLONG, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/zhenyuanlong/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.EUSTREPTOSPONDYLUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eustreptospondylus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ORNITHOLESTES, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ornitholestes/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.OPHIACODON, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ophiacodon/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.CRIOCEPHALOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/criocephalosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DRYOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dryosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.CHILESAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/chilesaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DEUTEROSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/deuterosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.RHAMPHORHYNCHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rhamphorhynchus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PLACODUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/placodus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.OPHTHALMOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ophthalmosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LYSTROSAURUSMACCAIGI, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lystrosaurusmaccaigi/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PLESIOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/plesiosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.VIVAXOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/vivaxosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.EUROPASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/europasaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.HUAYANGOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/huayangosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ERYOPS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eryops/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.MEGALOCEPHALUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/megalocephalus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.PEZOSIREN, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pezosiren/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.SHRINGASAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/shringasaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.BUNOSTEGOS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bunostegos/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.GIGANTSPINOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/gigantspinosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.YUNGUISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yunguisaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.BOBOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bobosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.CRYPTOCLIDUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/cryptoclidus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ZANABAZAR, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/zanabazar/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.YUXISAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yuxisaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.TELEOCRATER, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/teleocrater/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.LIMUSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/limusaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.DIADECTES, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diadectes/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.ADEOPAPPOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/adeopapposaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.CTENOSPONDYLUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ctenospondylus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.VANCLEAVEA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/vancleavea/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.AUSTRALOPITHECUSAFRICANUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/australopithecusafricanus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.RUGARHYNCHOS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rugarhynchos/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.TANYCOLAGREUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tanycolagreus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.EORHYNCHOCHELYS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eorhynchochelys/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.MYMOORAPELTA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/mymoorapelta/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.STANOCEPHALOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stanocephalosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.CYNOGNATHUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/cynognathus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.THECODONTOSAURUS, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/thecodontosaurus/frame.png"));
        type.put(FossilSkeletonTenPieceBlock.Types.MINQARIA, new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/minqaria/frame.png"));


    });

    public static Map<FossilSkeletonTenPieceBlock.Type, SkullModelBase> createFossilRenderers(EntityModelSet p_173662_) {
        ImmutableMap.Builder<FossilSkeletonTenPieceBlock.Type, SkullModelBase> builder = ImmutableMap.builder();
        builder.put(FossilSkeletonTenPieceBlock.Types.KENTROSAURUS, new KentrosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.KENTROSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.NASUTOCERATOPS, new NasutoceratopsFossilModel(p_173662_.bakeLayer(ClientEvents.NASUTOCERATOPS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SYNTHETOCERAS, new SynthetocerasFossilModel(p_173662_.bakeLayer(ClientEvents.SYNTHETOCERAS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ENDOTHIODONBATHYSTOMA, new EndothiodonbathystomaFossilModel(p_173662_.bakeLayer(ClientEvents.ENDOTHIODONBATHYSTOMA)));
        builder.put(FossilSkeletonTenPieceBlock.Types.NIGERPETON, new NigerpetonFossilModel(p_173662_.bakeLayer(ClientEvents.NIGERPETON)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PLACERIAS, new PlaceriasFossilModel(p_173662_.bakeLayer(ClientEvents.PLACERIAS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ARIZONASAURUS, new ArizonasaurusFossilModel(p_173662_.bakeLayer(ClientEvents.ARIZONASAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.POPOSAURUS, new PoposaurusFossilModel(p_173662_.bakeLayer(ClientEvents.POPOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.STAHLECKERIA, new StahleckeriaFossilModel(p_173662_.bakeLayer(ClientEvents.STAHLECKERIA)));
        builder.put(FossilSkeletonTenPieceBlock.Types.STAGONOLEPIS, new StagonolepisFossilModel(p_173662_.bakeLayer(ClientEvents.STAGONOLEPIS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.GUANLONG, new GuanlongFossilModel(p_173662_.bakeLayer(ClientEvents.GUANLONG)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ICHTHYOSAURUS, new IchthyosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.ICHTHYOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SCELIDOSAURUS, new ScelidosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.SCELIDOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PIATNITZKYSAURUS, new PiatnitzkysaurusFossilModel(p_173662_.bakeLayer(ClientEvents.PIATNITZKYSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DEARC, new DearcFossilModel(p_173662_.bakeLayer(ClientEvents.DEARC)));
        builder.put(FossilSkeletonTenPieceBlock.Types.TUPANDACTYLUSNAVIGANS, new TupandactylusnavigansFossilModel(p_173662_.bakeLayer(ClientEvents.TUPANDACTYLUSNAVIGANS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SKORPIOVENATOR, new SkorpiovenatorFossilModel(p_173662_.bakeLayer(ClientEvents.SKORPIOVENATOR)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PROTOCERATOPSANDREWSI, new ProtoceratopsandrewsiFossilModel(p_173662_.bakeLayer(ClientEvents.PROTOCERATOPSANDREWSI)));
        builder.put(FossilSkeletonTenPieceBlock.Types.STRUTHIOMIMUS, new StruthiomimusFossilModel(p_173662_.bakeLayer(ClientEvents.STRUTHIOMIMUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.MONTANOCERATOPS, new MontanoceratopsFossilModel(p_173662_.bakeLayer(ClientEvents.MONTANOCERATOPS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DORUDON, new DorudonFossilModel(p_173662_.bakeLayer(ClientEvents.DORUDON)));
        builder.put(FossilSkeletonTenPieceBlock.Types.GASTORNIS, new GastornisFossilModel(p_173662_.bakeLayer(ClientEvents.GASTORNIS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.KUTCHICETUS, new KutchicetusFossilModel(p_173662_.bakeLayer(ClientEvents.KUTCHICETUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PRODINOCERAS, new ProdinocerasFossilModel(p_173662_.bakeLayer(ClientEvents.PRODINOCERAS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.THYLACOLEO, new ThylacoleoFossilModel(p_173662_.bakeLayer(ClientEvents.THYLACOLEO)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SINCLAIROMERYX, new SinclairomeryxFossilModel(p_173662_.bakeLayer(ClientEvents.SINCLAIROMERYX)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DINOCROCUTA, new DinocrocutaFossilModel(p_173662_.bakeLayer(ClientEvents.DINOCROCUTA)));
        builder.put(FossilSkeletonTenPieceBlock.Types.COELOPHYSIS, new CoelophysisFossilModel(p_173662_.bakeLayer(ClientEvents.COELOPHYSIS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LITOCRANIUS, new LitocraniusFossilModel(p_173662_.bakeLayer(ClientEvents.LITOCRANIUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.THEROPITHECUS, new TheropithecusFossilModel(p_173662_.bakeLayer(ClientEvents.THEROPITHECUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DODO, new DodoFossilModel(p_173662_.bakeLayer(ClientEvents.DODO)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DIABLOCERATOPS, new DiabloceratopsFossilModel(p_173662_.bakeLayer(ClientEvents.DIABLOCERATOPS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.BARYLAMBDA, new BarylambdaFossilModel(p_173662_.bakeLayer(ClientEvents.BARYLAMBDA)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ODOBENOCETOPS, new OdobenocetopsFossilModel(p_173662_.bakeLayer(ClientEvents.ODOBENOCETOPS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.MONACHUS, new MonachusFossilModel(p_173662_.bakeLayer(ClientEvents.MONACHUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.CRASSIGYRINUS, new CrassigyrinusFossilModel(p_173662_.bakeLayer(ClientEvents.CRASSIGYRINUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ATOPODENTATUS, new AtopodentatusFossilModel(p_173662_.bakeLayer(ClientEvents.ATOPODENTATUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LUDODACTYLUS, new LudodactylusFossilModel(p_173662_.bakeLayer(ClientEvents.LUDODACTYLUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DUNKLEOSTEUS, new DunkleosteusFossilModel(p_173662_.bakeLayer(ClientEvents.DUNKLEOSTEUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ANTEOPHTHALMOSUCHUS, new AnteophthalmosuchusFossilModel(p_173662_.bakeLayer(ClientEvents.ANTEOPHTHALMOSUCHUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PRAEMEGACEROSCAZIOTI, new PraemegaceroscaziotiFossilModel(p_173662_.bakeLayer(ClientEvents.PRAEMEGACEROSCAZIOTI)));
        builder.put(FossilSkeletonTenPieceBlock.Types.CHAMPSOSAURUS, new ChampsosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.CHAMPSOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.OXYDACTYLUS, new OxydactylusFossilModel(p_173662_.bakeLayer(ClientEvents.OXYDACTYLUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.HIPPIDION, new HippidionFossilModel(p_173662_.bakeLayer(ClientEvents.HIPPIDION)));
        builder.put(FossilSkeletonTenPieceBlock.Types.EDAPHOSAURUS, new EdaphosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.EDAPHOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ANTHRACOSAURUS, new AnthracosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.ANTHRACOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.BEIPIAOSAURUS, new BeipiaosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.BEIPIAOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.NANNOPTERYGIUS, new NannopterygiusFossilModel(p_173662_.bakeLayer(ClientEvents.NANNOPTERYGIUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PRENOCEPHALE, new PrenocephaleFossilModel(p_173662_.bakeLayer(ClientEvents.PRENOCEPHALE)));
        builder.put(FossilSkeletonTenPieceBlock.Types.RECHNISAURUS, new RechnisaurusFossilModel(p_173662_.bakeLayer(ClientEvents.RECHNISAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PTERODAUSTRO, new PterodaustroFossilModel(p_173662_.bakeLayer(ClientEvents.PTERODAUSTRO)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SIMOLESTES, new SimolestesFossilModel(p_173662_.bakeLayer(ClientEvents.SIMOLESTES)));
        builder.put(FossilSkeletonTenPieceBlock.Types.GASTONIA, new GastoniaFossilModel(p_173662_.bakeLayer(ClientEvents.GASTONIA)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LOTOSAURUS, new LotosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.LOTOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SIMOSTHENURUS, new SimosthenurusFossilModel(p_173662_.bakeLayer(ClientEvents.SIMOSTHENURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.TRILOPHOSAURUS, new TrilophosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.TRILOPHOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LEPTOCLEIDUS, new LeptocleidusFossilModel(p_173662_.bakeLayer(ClientEvents.LEPTOCLEIDUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.HYPSELOSPINUS, new HypselospinusFossilModel(p_173662_.bakeLayer(ClientEvents.HYPSELOSPINUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.EINIOSAURUS, new EiniosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.EINIOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ORNATOPS, new OrnatopsFossilModel(p_173662_.bakeLayer(ClientEvents.ORNATOPS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.RANGIFER, new RangiferFossilModel(p_173662_.bakeLayer(ClientEvents.RANGIFER)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DAURLONG, new DaurlongFossilModel(p_173662_.bakeLayer(ClientEvents.DAURLONG)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PROCERATOSAURUS, new ProceratosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.PROCERATOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.CHUNGKINGOSAURUS, new ChungkingosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.CHUNGKINGOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SINOSAURUSSINENSIS, new SinosaurussinensisFossilModel(p_173662_.bakeLayer(ClientEvents.SINOSAURUSSINENSIS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.AUSTRALOVENATOR, new AustralovenatorFossilModel(p_173662_.bakeLayer(ClientEvents.AUSTRALOVENATOR)));
        builder.put(FossilSkeletonTenPieceBlock.Types.FALCARIUS, new FalcariusFossilModel(p_173662_.bakeLayer(ClientEvents.FALCARIUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.EUROPELTA, new EuropeltaFossilModel(p_173662_.bakeLayer(ClientEvents.EUROPELTA)));
        builder.put(FossilSkeletonTenPieceBlock.Types.KUNBARRASAURUS, new KunbarrasaurusFossilModel(p_173662_.bakeLayer(ClientEvents.KUNBARRASAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.KANNEMEYERIA, new KannemeyeriaFossilModel(p_173662_.bakeLayer(ClientEvents.KANNEMEYERIA)));
        builder.put(FossilSkeletonTenPieceBlock.Types.RABIDOSAURUS, new RabidosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.RABIDOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.JINZHOUSAURUS, new JinzhousaurusFossilModel(p_173662_.bakeLayer(ClientEvents.JINZHOUSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LUFENGOSAURUS, new LufengosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.LUFENGOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LEAELLYNASAURA, new LeaellynasauraFossilModel(p_173662_.bakeLayer(ClientEvents.LEAELLYNASAURA)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LIMNOSCELIS, new LimnoscelisFossilModel(p_173662_.bakeLayer(ClientEvents.LIMNOSCELIS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.NICROSAURUS, new NicrosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.NICROSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.CTENOCHASMA, new CtenochasmaFossilModel(p_173662_.bakeLayer(ClientEvents.CTENOCHASMA)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ASIATYRANNUS, new AsiatyrannusFossilModel(p_173662_.bakeLayer(ClientEvents.ASIATYRANNUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PSITTACOSAURUSSIBIRICUS, new PsittacosaurussibiricusFossilModel(p_173662_.bakeLayer(ClientEvents.PSITTACOSAURUSSIBIRICUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.HYPSILOPHODON, new HypsilophodonFossilModel(p_173662_.bakeLayer(ClientEvents.HYPSILOPHODON)));
        builder.put(FossilSkeletonTenPieceBlock.Types.HAMIPTERUS, new HamipterusFossilModel(p_173662_.bakeLayer(ClientEvents.HAMIPTERUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SECODONTOSAURUS, new SecodontosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.SECODONTOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.HALISKIA, new HaliskiaFossilModel(p_173662_.bakeLayer(ClientEvents.HALISKIA)));
        builder.put(FossilSkeletonTenPieceBlock.Types.QIANOSUCHUS, new QianosuchusFossilModel(p_173662_.bakeLayer(ClientEvents.QIANOSUCHUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.POLACANTHUS, new PolacanthusFossilModel(p_173662_.bakeLayer(ClientEvents.POLACANTHUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.OBDURODON, new ObdurodonFossilModel(p_173662_.bakeLayer(ClientEvents.OBDURODON)));
        builder.put(FossilSkeletonTenPieceBlock.Types.BARBOSANIA, new BarbosaniaFossilModel(p_173662_.bakeLayer(ClientEvents.BARBOSANIA)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ANHANGUERA, new AnhangueraFossilModel(p_173662_.bakeLayer(ClientEvents.ANHANGUERA)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DSUNGARIPTERUS, new DsungaripterusFossilModel(p_173662_.bakeLayer(ClientEvents.DSUNGARIPTERUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LAJASVENATOR, new LajasvenatorFossilModel(p_173662_.bakeLayer(ClientEvents.LAJASVENATOR)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DAMADAMA, new DamadamaFossilModel(p_173662_.bakeLayer(ClientEvents.DAMADAMA)));
        builder.put(FossilSkeletonTenPieceBlock.Types.RUHUHUCERBERUS, new RuhuhucerberusFossilModel(p_173662_.bakeLayer(ClientEvents.RUHUHUCERBERUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.COMPTONATUS, new ComptonatusFossilModel(p_173662_.bakeLayer(ClientEvents.COMPTONATUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.FUKUISAURUS, new FukuisaurusFossilModel(p_173662_.bakeLayer(ClientEvents.FUKUISAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.JINYUNPELTA, new JinyunpeltaFossilModel(p_173662_.bakeLayer(ClientEvents.JINYUNPELTA)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SPECTROVENATOR, new SpectrovenatorFossilModel(p_173662_.bakeLayer(ClientEvents.SPECTROVENATOR)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PROA, new ProaFossilModel(p_173662_.bakeLayer(ClientEvents.PROA)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ZHENYUANLONG, new ZhenyuanlongFossilModel(p_173662_.bakeLayer(ClientEvents.ZHENYUANLONG)));
        builder.put(FossilSkeletonTenPieceBlock.Types.EUSTREPTOSPONDYLUS, new EustreptospondylusFossilModel(p_173662_.bakeLayer(ClientEvents.EUSTREPTOSPONDYLUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ORNITHOLESTES, new OrnitholestesFossilModel(p_173662_.bakeLayer(ClientEvents.ORNITHOLESTES)));
        builder.put(FossilSkeletonTenPieceBlock.Types.OPHIACODON, new OphiacodonFossilModel(p_173662_.bakeLayer(ClientEvents.OPHIACODON)));
        builder.put(FossilSkeletonTenPieceBlock.Types.CRIOCEPHALOSAURUS, new CriocephalosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.CRIOCEPHALOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DRYOSAURUS, new DryosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.DRYOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.CHILESAURUS, new ChilesaurusFossilModel(p_173662_.bakeLayer(ClientEvents.CHILESAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DEUTEROSAURUS, new DeuterosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.DEUTEROSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.RHAMPHORHYNCHUS, new RhamphorhynchusFossilModel(p_173662_.bakeLayer(ClientEvents.RHAMPHORHYNCHUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PLACODUS, new PlacodusFossilModel(p_173662_.bakeLayer(ClientEvents.PLACODUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.OPHTHALMOSAURUS, new OphthalmosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.OPHTHALMOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LYSTROSAURUSMACCAIGI, new LystrosaurusmaccaigiFossilModel(p_173662_.bakeLayer(ClientEvents.LYSTROSAURUSMACCAIGI)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PLESIOSAURUS, new PlesiosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.PLESIOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.VIVAXOSAURUS, new VivaxosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.VIVAXOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.EUROPASAURUS, new EuropasaurusFossilModel(p_173662_.bakeLayer(ClientEvents.EUROPASAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.HUAYANGOSAURUS, new HuayangosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.HUAYANGOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ERYOPS, new EryopsFossilModel(p_173662_.bakeLayer(ClientEvents.ERYOPS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.MEGALOCEPHALUS, new MegalocephalusFossilModel(p_173662_.bakeLayer(ClientEvents.MEGALOCEPHALUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PEZOSIREN, new PezosirenFossilModel(p_173662_.bakeLayer(ClientEvents.PEZOSIREN)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SHRINGASAURUS, new ShringasaurusFossilModel(p_173662_.bakeLayer(ClientEvents.SHRINGASAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.BUNOSTEGOS, new BunostegosFossilModel(p_173662_.bakeLayer(ClientEvents.BUNOSTEGOS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.GIGANTSPINOSAURUS, new GigantspinosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.GIGANTSPINOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.YUNGUISAURUS, new YunguisaurusFossilModel(p_173662_.bakeLayer(ClientEvents.YUNGUISAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.BOBOSAURUS, new BobosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.BOBOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.CRYPTOCLIDUS, new CryptoclidusFossilModel(p_173662_.bakeLayer(ClientEvents.CRYPTOCLIDUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ZANABAZAR, new ZanabazarFossilModel(p_173662_.bakeLayer(ClientEvents.ZANABAZAR)));
        builder.put(FossilSkeletonTenPieceBlock.Types.YUXISAURUS, new YuxisaurusFossilModel(p_173662_.bakeLayer(ClientEvents.YUXISAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.TELEOCRATER, new TeleocraterFossilModel(p_173662_.bakeLayer(ClientEvents.TELEOCRATER)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LIMUSAURUS, new LimusaurusFossilModel(p_173662_.bakeLayer(ClientEvents.LIMUSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DIADECTES, new DiadectesFossilModel(p_173662_.bakeLayer(ClientEvents.DIADECTES)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ADEOPAPPOSAURUS, new AdeopapposaurusFossilModel(p_173662_.bakeLayer(ClientEvents.ADEOPAPPOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.CTENOSPONDYLUS, new CtenospondylusFossilModel(p_173662_.bakeLayer(ClientEvents.CTENOSPONDYLUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.VANCLEAVEA, new VancleaveaFossilModel(p_173662_.bakeLayer(ClientEvents.VANCLEAVEA)));
        builder.put(FossilSkeletonTenPieceBlock.Types.AUSTRALOPITHECUSAFRICANUS, new AustralopithecusafricanusFossilModel(p_173662_.bakeLayer(ClientEvents.AUSTRALOPITHECUSAFRICANUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.RUGARHYNCHOS, new RugarhynchosFossilModel(p_173662_.bakeLayer(ClientEvents.RUGARHYNCHOS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.TANYCOLAGREUS, new TanycolagreusFossilModel(p_173662_.bakeLayer(ClientEvents.TANYCOLAGREUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.EORHYNCHOCHELYS, new EorhynchochelysFossilModel(p_173662_.bakeLayer(ClientEvents.EORHYNCHOCHELYS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.MYMOORAPELTA, new MymoorapeltaFossilModel(p_173662_.bakeLayer(ClientEvents.MYMOORAPELTA)));
        builder.put(FossilSkeletonTenPieceBlock.Types.STANOCEPHALOSAURUS, new StanocephalosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.STANOCEPHALOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.CYNOGNATHUS, new CynognathusFossilModel(p_173662_.bakeLayer(ClientEvents.CYNOGNATHUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.THECODONTOSAURUS, new ThecodontosaurusFossilModel(p_173662_.bakeLayer(ClientEvents.THECODONTOSAURUS)));
        builder.put(FossilSkeletonTenPieceBlock.Types.MINQARIA, new MinqariaFossilModel(p_173662_.bakeLayer(ClientEvents.MINQARIA)));
        return builder.build();
    }

    public static Map<FossilSkeletonTenPieceBlock.Type, SkullModelBase> createFossilFrameRenderers(EntityModelSet p_173662_) {
        ImmutableMap.Builder<FossilSkeletonTenPieceBlock.Type, SkullModelBase> builder = ImmutableMap.builder();
        builder.put(FossilSkeletonTenPieceBlock.Types.KENTROSAURUS, new KentrosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.KENTROSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.NASUTOCERATOPS, new NasutoceratopsFossilFrameModel(p_173662_.bakeLayer(ClientEvents.NASUTOCERATOPS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SYNTHETOCERAS, new SynthetocerasFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SYNTHETOCERAS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ENDOTHIODONBATHYSTOMA, new EndothiodonbathystomaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ENDOTHIODONBATHYSTOMA_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.NIGERPETON, new NigerpetonFossilFrameModel(p_173662_.bakeLayer(ClientEvents.NIGERPETON_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PLACERIAS, new PlaceriasFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PLACERIAS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ARIZONASAURUS, new ArizonasaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ARIZONASAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.POPOSAURUS, new PoposaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.POPOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.STAHLECKERIA, new StahleckeriaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.STAHLECKERIA_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.STAGONOLEPIS, new StagonolepisFossilFrameModel(p_173662_.bakeLayer(ClientEvents.STAGONOLEPIS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.GUANLONG, new GuanlongFossilFrameModel(p_173662_.bakeLayer(ClientEvents.GUANLONG_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ICHTHYOSAURUS, new IchthyosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ICHTHYOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SCELIDOSAURUS, new ScelidosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SCELIDOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PIATNITZKYSAURUS, new PiatnitzkysaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PIATNITZKYSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DEARC, new DearcFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DEARC_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.TUPANDACTYLUSNAVIGANS, new TupandactylusnavigansFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TUPANDACTYLUSNAVIGANS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SKORPIOVENATOR, new SkorpiovenatorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SKORPIOVENATOR_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PROTOCERATOPSANDREWSI, new ProtoceratopsandrewsiFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PROTOCERATOPSANDREWSI_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.STRUTHIOMIMUS, new StruthiomimusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.STRUTHIOMIMUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.MONTANOCERATOPS, new MontanoceratopsFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MONTANOCERATOPS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DORUDON, new DorudonFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DORUDON_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.GASTORNIS, new GastornisFossilFrameModel(p_173662_.bakeLayer(ClientEvents.GASTORNIS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.KUTCHICETUS, new KutchicetusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.KUTCHICETUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PRODINOCERAS, new ProdinocerasFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PRODINOCERAS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.THYLACOLEO, new ThylacoleoFossilFrameModel(p_173662_.bakeLayer(ClientEvents.THYLACOLEO_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SINCLAIROMERYX, new SinclairomeryxFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SINCLAIROMERYX_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DINOCROCUTA, new DinocrocutaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DINOCROCUTA_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.COELOPHYSIS, new CoelophysisFossilFrameModel(p_173662_.bakeLayer(ClientEvents.COELOPHYSIS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LITOCRANIUS, new LitocraniusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LITOCRANIUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.THEROPITHECUS, new TheropithecusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.THEROPITHECUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DODO, new DodoFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DODO_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DIABLOCERATOPS, new DiabloceratopsFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DIABLOCERATOPS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.BARYLAMBDA, new BarylambdaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BARYLAMBDA_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ODOBENOCETOPS, new OdobenocetopsFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ODOBENOCETOPS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.MONACHUS, new MonachusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MONACHUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.CRASSIGYRINUS, new CrassigyrinusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CRASSIGYRINUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ATOPODENTATUS, new AtopodentatusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ATOPODENTATUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LUDODACTYLUS, new LudodactylusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LUDODACTYLUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DUNKLEOSTEUS, new DunkleosteusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DUNKLEOSTEUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ANTEOPHTHALMOSUCHUS, new AnteophthalmosuchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ANTEOPHTHALMOSUCHUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PRAEMEGACEROSCAZIOTI, new PraemegaceroscaziotiFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PRAEMEGACEROSCAZIOTI_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.CHAMPSOSAURUS, new ChampsosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CHAMPSOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.OXYDACTYLUS, new OxydactylusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.OXYDACTYLUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.HIPPIDION, new HippidionFossilFrameModel(p_173662_.bakeLayer(ClientEvents.HIPPIDION_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.EDAPHOSAURUS, new EdaphosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.EDAPHOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ANTHRACOSAURUS, new AnthracosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ANTHRACOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.BEIPIAOSAURUS, new BeipiaosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BEIPIAOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.NANNOPTERYGIUS, new NannopterygiusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.NANNOPTERYGIUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PRENOCEPHALE, new PrenocephaleFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PRENOCEPHALE_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.RECHNISAURUS, new RechnisaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.RECHNISAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PTERODAUSTRO, new PterodaustroFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PTERODAUSTRO_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SIMOLESTES, new SimolestesFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SIMOLESTES_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.GASTONIA, new GastoniaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.GASTONIA_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LOTOSAURUS, new LotosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LOTOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SIMOSTHENURUS, new SimosthenurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SIMOSTHENURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.TRILOPHOSAURUS, new TrilophosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TRILOPHOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LEPTOCLEIDUS, new LeptocleidusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LEPTOCLEIDUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.HYPSELOSPINUS, new HypselospinusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.HYPSELOSPINUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.EINIOSAURUS, new EiniosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.EINIOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ORNATOPS, new OrnatopsFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ORNATOPS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.RANGIFER, new RangiferFossilFrameModel(p_173662_.bakeLayer(ClientEvents.RANGIFER_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DAURLONG, new DaurlongFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DAURLONG_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PROCERATOSAURUS, new ProceratosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PROCERATOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.CHUNGKINGOSAURUS, new ChungkingosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CHUNGKINGOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SINOSAURUSSINENSIS, new SinosaurussinensisFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SINOSAURUSSINENSIS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.AUSTRALOVENATOR, new AustralovenatorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.AUSTRALOVENATOR_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.FALCARIUS, new FalcariusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.FALCARIUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.EUROPELTA, new EuropeltaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.EUROPELTA_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.KUNBARRASAURUS, new KunbarrasaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.KUNBARRASAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.KANNEMEYERIA, new KannemeyeriaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.KANNEMEYERIA_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.RABIDOSAURUS, new RabidosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.RABIDOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.JINZHOUSAURUS, new JinzhousaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.JINZHOUSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LUFENGOSAURUS, new LufengosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LUFENGOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LEAELLYNASAURA, new LeaellynasauraFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LEAELLYNASAURA_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LIMNOSCELIS, new LimnoscelisFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LIMNOSCELIS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.NICROSAURUS, new NicrosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.NICROSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.CTENOCHASMA, new CtenochasmaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CTENOCHASMA_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ASIATYRANNUS, new AsiatyrannusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ASIATYRANNUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PSITTACOSAURUSSIBIRICUS, new PsittacosaurussibiricusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PSITTACOSAURUSSIBIRICUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.HYPSILOPHODON, new HypsilophodonFossilFrameModel(p_173662_.bakeLayer(ClientEvents.HYPSILOPHODON_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.HAMIPTERUS, new HamipterusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.HAMIPTERUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SECODONTOSAURUS, new SecodontosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SECODONTOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.HALISKIA, new HaliskiaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.HALISKIA_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.QIANOSUCHUS, new QianosuchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.QIANOSUCHUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.POLACANTHUS, new PolacanthusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.POLACANTHUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.OBDURODON, new ObdurodonFossilFrameModel(p_173662_.bakeLayer(ClientEvents.OBDURODON_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.BARBOSANIA, new BarbosaniaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BARBOSANIA_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ANHANGUERA, new AnhangueraFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ANHANGUERA_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DSUNGARIPTERUS, new DsungaripterusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DSUNGARIPTERUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LAJASVENATOR, new LajasvenatorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LAJASVENATOR_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DAMADAMA, new DamadamaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DAMADAMA_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.RUHUHUCERBERUS, new RuhuhucerberusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.RUHUHUCERBERUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.COMPTONATUS, new ComptonatusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.COMPTONATUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.FUKUISAURUS, new FukuisaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.FUKUISAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.JINYUNPELTA, new JinyunpeltaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.JINYUNPELTA_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SPECTROVENATOR, new SpectrovenatorFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SPECTROVENATOR_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PROA, new ProaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PROA_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ZHENYUANLONG, new ZhenyuanlongFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ZHENYUANLONG_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.EUSTREPTOSPONDYLUS, new EustreptospondylusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.EUSTREPTOSPONDYLUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ORNITHOLESTES, new OrnitholestesFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ORNITHOLESTES_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.OPHIACODON, new OphiacodonFossilFrameModel(p_173662_.bakeLayer(ClientEvents.OPHIACODON_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.CRIOCEPHALOSAURUS, new CriocephalosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CRIOCEPHALOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DRYOSAURUS, new DryosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DRYOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.CHILESAURUS, new ChilesaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CHILESAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DEUTEROSAURUS, new DeuterosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DEUTEROSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.RHAMPHORHYNCHUS, new RhamphorhynchusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.RHAMPHORHYNCHUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PLACODUS, new PlacodusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PLACODUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.OPHTHALMOSAURUS, new OphthalmosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.OPHTHALMOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LYSTROSAURUSMACCAIGI, new LystrosaurusmaccaigiFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LYSTROSAURUSMACCAIGI_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PLESIOSAURUS, new PlesiosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PLESIOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.VIVAXOSAURUS, new VivaxosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.VIVAXOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.EUROPASAURUS, new EuropasaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.EUROPASAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.HUAYANGOSAURUS, new HuayangosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.HUAYANGOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ERYOPS, new EryopsFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ERYOPS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.MEGALOCEPHALUS, new MegalocephalusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MEGALOCEPHALUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.PEZOSIREN, new PezosirenFossilFrameModel(p_173662_.bakeLayer(ClientEvents.PEZOSIREN_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.SHRINGASAURUS, new ShringasaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.SHRINGASAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.BUNOSTEGOS, new BunostegosFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BUNOSTEGOS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.GIGANTSPINOSAURUS, new GigantspinosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.GIGANTSPINOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.YUNGUISAURUS, new YunguisaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.YUNGUISAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.BOBOSAURUS, new BobosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.BOBOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.CRYPTOCLIDUS, new CryptoclidusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CRYPTOCLIDUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ZANABAZAR, new ZanabazarFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ZANABAZAR_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.YUXISAURUS, new YuxisaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.YUXISAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.TELEOCRATER, new TeleocraterFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TELEOCRATER_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.LIMUSAURUS, new LimusaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.LIMUSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.DIADECTES, new DiadectesFossilFrameModel(p_173662_.bakeLayer(ClientEvents.DIADECTES_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.ADEOPAPPOSAURUS, new AdeopapposaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.ADEOPAPPOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.CTENOSPONDYLUS, new CtenospondylusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CTENOSPONDYLUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.VANCLEAVEA, new VancleaveaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.VANCLEAVEA_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.AUSTRALOPITHECUSAFRICANUS, new AustralopithecusafricanusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.AUSTRALOPITHECUSAFRICANUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.RUGARHYNCHOS, new RugarhynchosFossilFrameModel(p_173662_.bakeLayer(ClientEvents.RUGARHYNCHOS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.TANYCOLAGREUS, new TanycolagreusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.TANYCOLAGREUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.EORHYNCHOCHELYS, new EorhynchochelysFossilFrameModel(p_173662_.bakeLayer(ClientEvents.EORHYNCHOCHELYS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.MYMOORAPELTA, new MymoorapeltaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MYMOORAPELTA_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.STANOCEPHALOSAURUS, new StanocephalosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.STANOCEPHALOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.CYNOGNATHUS, new CynognathusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.CYNOGNATHUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.THECODONTOSAURUS, new ThecodontosaurusFossilFrameModel(p_173662_.bakeLayer(ClientEvents.THECODONTOSAURUS_FRAME)));
        builder.put(FossilSkeletonTenPieceBlock.Types.MINQARIA, new MinqariaFossilFrameModel(p_173662_.bakeLayer(ClientEvents.MINQARIA_FRAME)));
        return builder.build();
    }

    public FossilSkeletonTenPieceRenderer(BlockEntityRendererProvider.Context p_173660_) {
        this.skeletonModelByType = createFossilRenderers(p_173660_.getModelSet());
        this.frameModelByType = createFossilFrameRenderers(p_173660_.getModelSet());
    }

    public void render(FossilSkeletonTenPieceBlockEntity p_112534_, float p_112535_, PoseStack p_112536_, MultiBufferSource p_112537_, int p_112538_, int p_112539_) {
        float f = 0;
        BlockState blocktate = p_112534_.getBlockState();
        int i = blocktate.getValue(FossilSkeletonTenPieceBlock.ROTATION);
        float f1 = RotationSegment.convertToDegrees(i);
        FossilSkeletonTenPieceBlock.Type skullblock$type = ((FossilSkeletonTenPieceBlock) blocktate.getBlock()).getType();
        SkullModelBase skullmodelbase = this.skeletonModelByType.get(skullblock$type);
        SkullModelBase frameBase = this.frameModelByType.get(skullblock$type);
        int fossilLevel = blocktate.getValue(FossilSkeletonTenPieceBlock.FOSSIL_LEVEL);
        RenderType rendertype = getSkeletonRenderType(skullblock$type, fossilLevel);
        RenderType frameRendertype = getFrameRenderType(skullblock$type);
        if (blocktate.getValue(FossilSkeletonTenPieceBlock.FRAME)) {
            renderFossilSkeleton(blocktate, f1, f, p_112536_, p_112537_, p_112538_, frameBase, frameRendertype);
        }
        renderFossilSkeleton(blocktate, f1, f, p_112536_, p_112537_, p_112538_, skullmodelbase, rendertype);
    }

    public static void renderFossilSkeleton(BlockState p_112534_, float p_173665_, float p_173666_, PoseStack pose, MultiBufferSource p_173668_, int p_173669_, SkullModelBase p_173670_, RenderType p_173671_) {
        pose.pushPose();
        FossilSkeletonTenPieceBlock.Type FossilSkeletonTenPieceBlock$type = ((FossilSkeletonTenPieceBlock) p_112534_.getBlock()).getType();
        pose.translate(0.5F, 1.0F, 0.5F);
        if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.KENTROSAURUS) {
            float scale = 0.8F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.26F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.NASUTOCERATOPS) {
            float scale = 0.8F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.26F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.SYNTHETOCERAS) {
            float scale = 0.64F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.07F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.ENDOTHIODONBATHYSTOMA) {
            float scale = 0.715F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.1F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.NIGERPETON) {
            float scale = 0.88F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.36F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.PLACERIAS) {
            float scale = 0.7F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.07F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.ARIZONASAURUS) {
            float scale = 0.615F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.13F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.POPOSAURUS) {
            float scale = 0.785F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.225F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.STAHLECKERIA) {
            float scale = 0.65F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.05F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.STAGONOLEPIS) {
            float scale = 0.7F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.06F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.GUANLONG) {
            float scale = 0.68F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.03F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.ICHTHYOSAURUS) {
            float scale = 0.695F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.SCELIDOSAURUS) {
            float scale = 0.71F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.09F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.PIATNITZKYSAURUS) {
            float scale = 0.7F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.05F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.DEARC) {
            float scale = 0.48F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.TUPANDACTYLUSNAVIGANS) {
            float scale = 0.42F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.SKORPIOVENATOR) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.PROTOCERATOPSANDREWSI) {
            float scale = 0.51F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.44F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.STRUTHIOMIMUS) {
            float scale = 0.76F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.2F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.MONTANOCERATOPS) {
            float scale = 0.81F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.25F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.DORUDON) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.25F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.GASTORNIS) {
            float scale = 0.64F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.055F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.KUTCHICETUS) {
            float scale = 0.8F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.32F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.PRODINOCERAS) {
            float scale = 0.87F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.35F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.THYLACOLEO) {
            float scale = 0.4F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 1F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.SINCLAIROMERYX) {
            float scale = 0.7F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.07F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.DINOCROCUTA) {
            float scale = 0.64F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.05F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.COELOPHYSIS) {
            float scale = 0.495F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.5F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.LITOCRANIUS) {
            float scale = 0.512F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.5F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.THEROPITHECUS) {
            float scale = 0.36F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 1.27F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.DODO) {
            float scale = 0.21F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 3.27F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.DIABLOCERATOPS) {
            float scale = 0.81F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.27F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.BARYLAMBDA) {
            float scale = 0.88F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.36F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.ODOBENOCETOPS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.52F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.MONACHUS) {
            float scale = 0.76F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -1.2F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.CRASSIGYRINUS) {
            float scale = 0.465F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.ATOPODENTATUS) {
            float scale = 0.367F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 1.27F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.LUDODACTYLUS) {
            float scale = 0.5F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.5F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.DUNKLEOSTEUS) {
            float scale = 0.83F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.3F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.ANTEOPHTHALMOSUCHUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.49F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.PRAEMEGACEROSCAZIOTI) {
            float scale = 0.6F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.16F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.CHAMPSOSAURUS) {
            float scale = 0.81F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.4F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.OXYDACTYLUS) {
            float scale = 0.58F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.23F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.HIPPIDION) {
            float scale = 0.7F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.EDAPHOSAURUS) {
            float scale = 0.62F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.12F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.ANTHRACOSAURUS) {
            float scale = 0.49F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.12F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.BEIPIAOSAURUS) {
            float scale = 0.7F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.08F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.NANNOPTERYGIUS) {
            float scale = 0.76F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.PRENOCEPHALE) {
            float scale = 0.58F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.23F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.RECHNISAURUS) {
            float scale = 0.57F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.27F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.PTERODAUSTRO) {
            float scale = 0.62F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.13F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.SIMOLESTES) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.6F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.GASTONIA) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.LOTOSAURUS) {
            float scale = 0.9F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.38F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.SIMOSTHENURUS) {
            float scale = 0.53F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.4F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.TRILOPHOSAURUS) {
            float scale = 0.59F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.2F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.LEPTOCLEIDUS) {
            float scale = 0.68F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.HYPSELOSPINUS) {
            float scale = 0.9F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.4F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.EINIOSAURUS) {
            float scale = 0.8F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.23F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.ORNATOPS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.52F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.RANGIFER) {
            float scale = 0.7F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.09F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.DAURLONG) {
            float scale = 0.4F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 1F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.PROCERATOSAURUS) {
            float scale = 0.463F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.67F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.CHUNGKINGOSAURUS) {
            float scale = 0.64F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.1F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.SINOSAURUSSINENSIS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.48F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.AUSTRALOVENATOR) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.48F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.FALCARIUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.48F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.EUROPELTA) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.KUNBARRASAURUS) {
            float scale = 0.59F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.2F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.KANNEMEYERIA) {
            float scale = 0.51F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.45F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.RABIDOSAURUS) {
            float scale = 0.6F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.18F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.JINZHOUSAURUS) {
            float scale = 0.79F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.23F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.LUFENGOSAURUS) {
            float scale = 0.7272F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.08F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.LEAELLYNASAURA) {
            float scale = 0.43F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.85F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.LIMNOSCELIS) {
            float scale = 0.37F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 1.2F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.NICROSAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.CTENOCHASMA) {
            float scale = 0.56F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.ASIATYRANNUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.PSITTACOSAURUSSIBIRICUS) {
            float scale = 0.5F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.53F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.HYPSILOPHODON) {
            float scale = 0.5F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.53F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.HAMIPTERUS) {
            float scale = 0.72F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.1F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.SECODONTOSAURUS) {
            float scale = 0.2F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 3.52F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.HALISKIA) {
            float scale = 0.64F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -1.84F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.QIANOSUCHUS) {
            float scale = 0.67F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.0F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.POLACANTHUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.OBDURODON) {
            float scale = 0.3F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 1.4F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.BARBOSANIA) {
            float scale = 0.47F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.65F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.ANHANGUERA) {
            float scale = 0.64F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.3F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.DSUNGARIPTERUS) {
            float scale = 0.47F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.3F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.LAJASVENATOR) {
            float scale = 1.06F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.55F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.DAMADAMA) {
            float scale = 0.52F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.42F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.RUHUHUCERBERUS) {
            float scale = 0.63F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.08F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.COMPTONATUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.FUKUISAURUS) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.JINYUNPELTA) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.52F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.SPECTROVENATOR) {
            float scale = 0.66F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.02F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.PROA) {
            float scale = 1F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.5F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.ZHENYUANLONG) {
            float scale = 0.42F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.86F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.EUSTREPTOSPONDYLUS) {
            float scale = 0.8F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.2F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.ORNITHOLESTES) {
            float scale = 0.52F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.43F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.OPHIACODON) {
            float scale = 0.4F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 1.F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.CRIOCEPHALOSAURUS) {
            float scale = 0.46F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.67F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.DRYOSAURUS) {
            float scale = 0.57F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.26F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.CHILESAURUS) {
            float scale = 0.55F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.33F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.DEUTEROSAURUS) {
            float scale = 0.59F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.2F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.RHAMPHORHYNCHUS) {
            float scale = 0.46F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.68F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.PLACODUS) {
            float scale = 0.54F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.3F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.OPHTHALMOSAURUS) {
            float scale = 0.64F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -2F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.LYSTROSAURUSMACCAIGI) {
            float scale = 0.61F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.13F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.PLESIOSAURUS) {
            float scale = 0.61F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.1F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.VIVAXOSAURUS) {
            float scale = 0.44F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.77F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.EUROPASAURUS) {
            float scale = 0.8F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.24F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.HUAYANGOSAURUS) {
            float scale = 0.8F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.25F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.ERYOPS) {
            float scale = 0.62F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.13F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.MEGALOCEPHALUS) {
            float scale = 0.28F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.3F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.PEZOSIREN) {
            float scale = 0.51F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.48F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.SHRINGASAURUS) {
            float scale = 0.58F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.23F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.BUNOSTEGOS) {
            float scale = 0.64F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.07F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.GIGANTSPINOSAURUS) {
            float scale = 1.03F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.53F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.YUNGUISAURUS) {
            float scale = 0.58F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -1.55F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.BOBOSAURUS) {
            float scale = 0.6F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.53F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.CRYPTOCLIDUS) {
            float scale = 0.62F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.53F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.ZANABAZAR) {
            float scale = 0.48F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.6F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.YUXISAURUS) {
            float scale = 0.69F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, -0.05F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.TELEOCRATER) {
            float scale = 0.26F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 2.34F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.LIMUSAURUS) {
            float scale = 0.3F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 1.85F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.DIADECTES) {
            float scale = 0.5F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.48F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.ADEOPAPPOSAURUS) {
            float scale = 0.41F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.93F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.CTENOSPONDYLUS) {
            float scale = 0.21F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 3.26F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.VANCLEAVEA) {
            float scale = 0.57F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.63F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.AUSTRALOPITHECUSAFRICANUS) {
            float scale = 0.35F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 1.37F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.RUGARHYNCHOS) {
            float scale = 0.18F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 4.07F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.TANYCOLAGREUS) {
            float scale = 0.42F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.88F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.EORHYNCHOCHELYS) {
            float scale = 0.26F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 2.3F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.MYMOORAPELTA) {
            float scale = 0.56F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 0.3F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.STANOCEPHALOSAURUS) {
            float scale = 0.3F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 1.83F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.CYNOGNATHUS) {
            float scale = 0.36F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 1.3F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.THECODONTOSAURUS) {
            float scale = 0.29F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 1.95F, 0F);
        } else if (FossilSkeletonTenPieceBlock$type == FossilSkeletonTenPieceBlock.Types.MINQARIA) {
            float scale = 0.38F;
            pose.scale(-scale, -scale, scale);
            pose.translate(0F, 1.13F, 0F);
        } else {
            float scale = 1.0F;
            pose.scale(-scale, -scale, scale);
        }
        VertexConsumer vertexconsumer = p_173668_.getBuffer(p_173671_);
        p_173670_.setupAnim(p_173666_, p_173665_, 0.0F);
        p_173670_.renderToBuffer(pose, vertexconsumer, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        pose.popPose();
    }

    public static RenderType getSkeletonRenderType(FossilSkeletonTenPieceBlock.Type type, int fossilLevel) {
        ResourceLocation resourceLocation;
        if (type == FossilSkeletonTenPieceBlock.Types.KENTROSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kentrosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.NASUTOCERATOPS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nasutoceratops/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.SYNTHETOCERAS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/synthetoceras/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.ENDOTHIODONBATHYSTOMA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/endothiodonbathystoma/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.NIGERPETON) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nigerpeton/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.PLACERIAS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/placerias/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.ARIZONASAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/arizonasaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.POPOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/poposaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.STAHLECKERIA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stahleckeria/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.STAGONOLEPIS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stagonolepis/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.GUANLONG) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/guanlong/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.ICHTHYOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ichthyosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.SCELIDOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/scelidosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.PIATNITZKYSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/piatnitzkysaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.DEARC) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dearc/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.TUPANDACTYLUSNAVIGANS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tupandactylusnavigans/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.SKORPIOVENATOR) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/skorpiovenator/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.PROTOCERATOPSANDREWSI) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/protoceratopsandrewsi/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.STRUTHIOMIMUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/struthiomimus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.MONTANOCERATOPS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/montanoceratops/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.DORUDON) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dorudon/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.GASTORNIS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/gastornis/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.KUTCHICETUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kutchicetus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.PRODINOCERAS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/prodinoceras/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.THYLACOLEO) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/thylacoleo/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.SINCLAIROMERYX) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sinclairomeryx/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.DINOCROCUTA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dinocrocuta/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.COELOPHYSIS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/coelophysis/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.LITOCRANIUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/litocranius/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.THEROPITHECUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/theropithecus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.DODO) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dodo/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.DIABLOCERATOPS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diabloceratops/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.BARYLAMBDA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/barylambda/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.ODOBENOCETOPS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/odobenocetops/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.MONACHUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/monachus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.CRASSIGYRINUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/crassigyrinus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.ATOPODENTATUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/atopodentatus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.LUDODACTYLUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ludodactylus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.DUNKLEOSTEUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dunkleosteus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.ANTEOPHTHALMOSUCHUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/anteophthalmosuchus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.PRAEMEGACEROSCAZIOTI) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/praemegaceroscazioti/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.CHAMPSOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/champsosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.OXYDACTYLUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/oxydactylus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.HIPPIDION) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hippidion/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.EDAPHOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/edaphosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.ANTHRACOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/anthracosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.BEIPIAOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/beipiaosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.NANNOPTERYGIUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nannopterygius/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.PRENOCEPHALE) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/prenocephale/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.RECHNISAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rechnisaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.PTERODAUSTRO) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pterodaustro/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.SIMOLESTES) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/simolestes/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.GASTONIA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/gastonia/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.LOTOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lotosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.SIMOSTHENURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/simosthenurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.TRILOPHOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/trilophosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.LEPTOCLEIDUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/leptocleidus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.HYPSELOSPINUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hypselospinus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.EINIOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/einiosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.ORNATOPS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ornatops/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.RANGIFER) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rangifer/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.DAURLONG) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/daurlong/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.PROCERATOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/proceratosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.CHUNGKINGOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/chungkingosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.SINOSAURUSSINENSIS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/sinosaurussinensis/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.AUSTRALOVENATOR) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/australovenator/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.FALCARIUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/falcarius/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.EUROPELTA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/europelta/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.KUNBARRASAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kunbarrasaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.KANNEMEYERIA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/kannemeyeria/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.RABIDOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rabidosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.JINZHOUSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/jinzhousaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.LUFENGOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lufengosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.LEAELLYNASAURA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/leaellynasaura/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.LIMNOSCELIS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/limnoscelis/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.NICROSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/nicrosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.CTENOCHASMA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ctenochasma/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.ASIATYRANNUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/asiatyrannus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.PSITTACOSAURUSSIBIRICUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/psittacosaurussibiricus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.HYPSILOPHODON) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hypsilophodon/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.HAMIPTERUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/hamipterus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.SECODONTOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/secodontosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.HALISKIA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/haliskia/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.QIANOSUCHUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/qianosuchus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.POLACANTHUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/polacanthus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.OBDURODON) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/obdurodon/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.BARBOSANIA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/barbosania/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.ANHANGUERA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/anhanguera/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.DSUNGARIPTERUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dsungaripterus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.LAJASVENATOR) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lajasvenator/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.DAMADAMA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/damadama/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.RUHUHUCERBERUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ruhuhucerberus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.COMPTONATUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/comptonatus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.FUKUISAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/fukuisaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.JINYUNPELTA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/jinyunpelta/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.SPECTROVENATOR) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/spectrovenator/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.PROA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/proa/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.ZHENYUANLONG) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/zhenyuanlong/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.EUSTREPTOSPONDYLUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eustreptospondylus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.ORNITHOLESTES) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ornitholestes/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.OPHIACODON) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ophiacodon/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.CRIOCEPHALOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/criocephalosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.DRYOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/dryosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.CHILESAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/chilesaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.DEUTEROSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/deuterosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.RHAMPHORHYNCHUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rhamphorhynchus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.PLACODUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/placodus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.OPHTHALMOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ophthalmosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.LYSTROSAURUSMACCAIGI) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/lystrosaurusmaccaigi/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.PLESIOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/plesiosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.VIVAXOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/vivaxosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.EUROPASAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/europasaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.HUAYANGOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/huayangosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.ERYOPS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eryops/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.MEGALOCEPHALUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/megalocephalus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.PEZOSIREN) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/pezosiren/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.SHRINGASAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/shringasaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.BUNOSTEGOS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bunostegos/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.GIGANTSPINOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/gigantspinosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.YUNGUISAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yunguisaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.BOBOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/bobosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.CRYPTOCLIDUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/cryptoclidus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.ZANABAZAR) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/zanabazar/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.YUXISAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/yuxisaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.TELEOCRATER) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/teleocrater/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.LIMUSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/limusaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.DIADECTES) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/diadectes/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.ADEOPAPPOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/adeopapposaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.CTENOSPONDYLUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/ctenospondylus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.VANCLEAVEA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/vancleavea/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.AUSTRALOPITHECUSAFRICANUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/australopithecusafricanus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.RUGARHYNCHOS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/rugarhynchos/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.TANYCOLAGREUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/tanycolagreus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.EORHYNCHOCHELYS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/eorhynchochelys/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.MYMOORAPELTA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/mymoorapelta/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.STANOCEPHALOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/stanocephalosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.CYNOGNATHUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/cynognathus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.THECODONTOSAURUS) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/thecodontosaurus/stage_" + fossilLevel + ".png");
        } else if (type == FossilSkeletonTenPieceBlock.Types.MINQARIA) {
            resourceLocation = new ResourceLocation(FossilMod.MOD_ID, "textures/block/skeletons/minqaria/stage_" + fossilLevel + ".png");
        } else resourceLocation = SKIN_BY_TYPE.get(type);
        return RenderType.entityCutoutNoCullZOffset(resourceLocation);
    }

    public static RenderType getFrameRenderType(FossilSkeletonTenPieceBlock.Type p_112524_) {
        ResourceLocation resourcelocation = FRAME_BY_TYPE.get(p_112524_);
        return RenderType.entityCutoutNoCullZOffset(resourcelocation);
    }

}
