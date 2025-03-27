package fossils.fossils.client.blockentity.model.dimetrodongrandis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DimetrodonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Neckbase;
	private final ModelPart Neckend;
	private final ModelPart Head;
	private final ModelPart Lowerjawback;
	private final ModelPart Lowerjawmiddle;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerfrontteeth;
	private final ModelPart Lowerfrontteeth2;
	private final ModelPart Lowerjawslope;
	private final ModelPart Rightlowerteeth;
	private final ModelPart Rightlowerteeth2;
	private final ModelPart Upperjawback;
	private final ModelPart Upperjawmiddle;
	private final ModelPart Nosebridge;
	private final ModelPart Upperjawfront;
	private final ModelPart Upperfrontteeth;
	private final ModelPart Rightupperteethback;
	private final ModelPart Rightupperteethback2;
	private final ModelPart Forehead;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
	private final ModelPart Sailmiddlefront;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Righthindfoot;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Lefthindfoot;

	public DimetrodonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Neckbase = this.Bodyfront.getChild("Neckbase");
		this.Neckend = this.Neckbase.getChild("Neckend");
		this.Head = this.Neckend.getChild("Head");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
		this.Lowerjawmiddle = this.Lowerjawback.getChild("Lowerjawmiddle");
		this.Lowerjawfront = this.Lowerjawmiddle.getChild("Lowerjawfront");
		this.Lowerfrontteeth = this.Lowerjawfront.getChild("Lowerfrontteeth");
		this.Lowerfrontteeth2 = this.Lowerjawfront.getChild("Lowerfrontteeth2");
		this.Lowerjawslope = this.Lowerjawback.getChild("Lowerjawslope");
		this.Rightlowerteeth = this.Lowerjawslope.getChild("Rightlowerteeth");
		this.Rightlowerteeth2 = this.Lowerjawslope.getChild("Rightlowerteeth2");
		this.Upperjawback = this.Head.getChild("Upperjawback");
		this.Upperjawmiddle = this.Upperjawback.getChild("Upperjawmiddle");
		this.Nosebridge = this.Upperjawmiddle.getChild("Nosebridge");
		this.Upperjawfront = this.Upperjawmiddle.getChild("Upperjawfront");
		this.Upperfrontteeth = this.Upperjawfront.getChild("Upperfrontteeth");
		this.Rightupperteethback = this.Upperjawback.getChild("Rightupperteethback");
		this.Rightupperteethback2 = this.Upperjawback.getChild("Rightupperteethback2");
		this.Forehead = this.Head.getChild("Forehead");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
		this.Sailmiddlefront = this.Bodyfront.getChild("Sailmiddlefront");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddleend = this.Tailmiddlebase.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Righthindfoot = this.Rightshin.getChild("Righthindfoot");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Lefthindfoot = this.Leftshin.getChild("Lefthindfoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -23.8F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.8F, 10.0F, -0.4245F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(59, 3).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7639F, 0.3583F, 2.3353F, 0.0087F, 0.0F, 0.0524F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(18, 39).mirror().addBox(-0.8F, 0.024F, -2.4202F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 53).mirror().addBox(-0.8F, 1.024F, -2.3202F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 67).mirror().addBox(-0.8F, 3.024F, 0.6798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8679F, 1.797F, 0.3578F, 0.0F, 0.0524F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(18, 16).mirror().addBox(-0.8F, 3.3714F, -4.1329F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8679F, 1.797F, 0.4014F, 0.0F, 0.0524F));

		PartDefinition Hips_r4 = Hips.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(57, 26).mirror().addBox(-0.8F, 3.8136F, -1.1185F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8679F, 1.797F, 0.7505F, 0.0F, 0.0524F));

		PartDefinition Hips_r5 = Hips.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(67, 12).mirror().addBox(-0.8F, 4.5235F, -0.7201F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.8679F, 1.797F, 0.8727F, 0.0F, 0.0524F));

		PartDefinition Hips_r6 = Hips.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(18, 16).addBox(-0.2F, 3.3714F, -4.1329F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0F, -0.8679F, 1.797F, 0.4014F, 0.0F, -0.0524F));

		PartDefinition Hips_r7 = Hips.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(67, 12).addBox(-0.2F, 4.5235F, -0.7201F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8679F, 1.797F, 0.8727F, 0.0F, -0.0524F));

		PartDefinition Hips_r8 = Hips.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(57, 26).addBox(-0.2F, 3.8136F, -1.1185F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.0F, -0.8679F, 1.797F, 0.7505F, 0.0F, -0.0524F));

		PartDefinition Hips_r9 = Hips.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(64, 67).addBox(-0.2F, 3.024F, 0.6798F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F))
				.texOffs(24, 53).addBox(-0.2F, 1.024F, -2.3202F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 39).addBox(-0.2F, 0.024F, -2.4202F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8679F, 1.797F, 0.3578F, 0.0F, -0.0524F));

		PartDefinition Hips_r10 = Hips.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(59, 3).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7639F, 0.3583F, 2.3353F, 0.0087F, 0.0F, -0.0524F));

		PartDefinition Hips_r11 = Hips.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(9, 20).addBox(0.0F, -0.0085F, -0.0117F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1241F, -2.8952F, -0.2007F, 0.0F, 0.0F));

		PartDefinition Hips_r12 = Hips.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(48, 48).addBox(0.0F, 0.807F, 0.2026F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -1.829F, -7.1295F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Neckbase_r1 = Hips.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(33, 24).addBox(0.0F, -3.086F, 1.2247F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 72).addBox(0.0F, -1.586F, -0.3753F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6021F, 0.1027F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Neckbase_r2 = Hips.addOrReplaceChild("Neckbase_r2", CubeListBuilder.create().texOffs(18, 39).addBox(-0.01F, -2.6861F, -0.1975F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0021F, 1.1027F, -0.9948F, 0.0F, 0.0F));

		PartDefinition Neckbase_r3 = Hips.addOrReplaceChild("Neckbase_r3", CubeListBuilder.create().texOffs(37, 45).addBox(0.0F, -2.586F, -0.3753F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0021F, -1.8973F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Neckbase_r4 = Hips.addOrReplaceChild("Neckbase_r4", CubeListBuilder.create().texOffs(52, 70).addBox(-0.01F, -3.9573F, -0.0789F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2021F, -0.4973F, -1.0821F, 0.0F, 0.0F));

		PartDefinition Neckbase_r5 = Hips.addOrReplaceChild("Neckbase_r5", CubeListBuilder.create().texOffs(46, 71).addBox(0.0F, -3.586F, -0.3753F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1021F, -3.6973F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Neckbase_r6 = Hips.addOrReplaceChild("Neckbase_r6", CubeListBuilder.create().texOffs(12, 69).addBox(-0.01F, -4.9776F, -0.1032F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0021F, -1.6973F, -1.0123F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = Hips.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(72, 33).mirror().addBox(-3.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7746F, -5.6105F, 0.0198F, 0.305F, -1.2017F));

		PartDefinition Bodyfront_r2 = Hips.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(71, 49).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7746F, -5.6105F, 0.1379F, 0.2736F, -0.793F));

		PartDefinition Bodyfront_r3 = Hips.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(71, 29).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6746F, -3.6105F, 0.0024F, 0.1348F, -0.9079F));

		PartDefinition Bodyfront_r4 = Hips.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(71, 27).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5746F, -1.6105F, -0.1458F, -0.0257F, -0.9858F));

		PartDefinition Bodyfront_r5 = Hips.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(72, 11).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5746F, -1.6105F, -0.1531F, -0.0161F, -0.6368F));

		PartDefinition Bodyfront_r6 = Hips.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(22, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6746F, -3.6105F, 0.0408F, 0.0842F, -0.5603F));

		PartDefinition Bodyfront_r7 = Hips.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(27, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7746F, -5.6105F, 0.214F, 0.17F, -0.451F));

		PartDefinition Bodyfront_r8 = Hips.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(71, 27).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5746F, -1.6105F, -0.1458F, 0.0257F, 0.9858F));

		PartDefinition Bodyfront_r9 = Hips.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(72, 11).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5746F, -1.6105F, -0.1531F, 0.0161F, 0.6368F));

		PartDefinition Bodyfront_r10 = Hips.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(71, 29).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6746F, -3.6105F, 0.0024F, -0.1348F, 0.9079F));

		PartDefinition Bodyfront_r11 = Hips.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(22, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6746F, -3.6105F, 0.0408F, -0.0842F, 0.5603F));

		PartDefinition Bodyfront_r12 = Hips.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(27, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7746F, -5.6105F, 0.214F, -0.17F, 0.451F));

		PartDefinition Bodyfront_r13 = Hips.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(71, 49).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7746F, -5.6105F, 0.1379F, -0.2736F, 0.793F));

		PartDefinition Bodyfront_r14 = Hips.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(72, 33).addBox(2.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7746F, -5.6105F, 0.0198F, -0.305F, 1.2017F));

		PartDefinition Neckbase_r7 = Hips.addOrReplaceChild("Neckbase_r7", CubeListBuilder.create().texOffs(33, 68).addBox(-0.01F, -5.9044F, 0.1531F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0021F, -2.7973F, -0.9425F, 0.0F, 0.0F));

		PartDefinition Neckbase_r8 = Hips.addOrReplaceChild("Neckbase_r8", CubeListBuilder.create().texOffs(15, 70).addBox(0.0F, -4.586F, -0.3753F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1021F, -5.3973F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6234F, -6.7758F, 0.3834F, 0.081F, 0.0326F));

		PartDefinition Neckbase_r9 = Bodymiddle.addOrReplaceChild("Neckbase_r9", CubeListBuilder.create().texOffs(61, 37).addBox(0.0F, -4.586F, -0.3753F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0317F, -0.203F, -0.9512F, 0.0F, 0.0F));

		PartDefinition Neckbase_r10 = Bodymiddle.addOrReplaceChild("Neckbase_r10", CubeListBuilder.create().texOffs(0, 55).addBox(-0.01F, -14.403F, -1.1632F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0317F, -0.203F, -1.1257F, 0.0F, 0.0F));

		PartDefinition Neckbase_r11 = Bodymiddle.addOrReplaceChild("Neckbase_r11", CubeListBuilder.create().texOffs(3, 45).addBox(-0.01F, -16.403F, -1.1632F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0317F, -1.703F, -0.9861F, 0.0F, 0.0F));

		PartDefinition Neckbase_r12 = Bodymiddle.addOrReplaceChild("Neckbase_r12", CubeListBuilder.create().texOffs(68, 16).addBox(0.0F, -4.586F, -0.3753F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0317F, -1.703F, -0.8116F, 0.0F, 0.0F));

		PartDefinition Neckbase_r13 = Bodymiddle.addOrReplaceChild("Neckbase_r13", CubeListBuilder.create().texOffs(37, 53).addBox(-0.01F, -18.403F, -1.6632F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0317F, -3.203F, -0.9163F, 0.0F, 0.0F));

		PartDefinition Neckbase_r14 = Bodymiddle.addOrReplaceChild("Neckbase_r14", CubeListBuilder.create().texOffs(15, 60).addBox(0.0F, -7.586F, -0.3753F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0317F, -3.203F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Neckbase_r15 = Bodymiddle.addOrReplaceChild("Neckbase_r15", CubeListBuilder.create().texOffs(6, 41).addBox(-0.01F, -20.2603F, -1.8034F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0317F, -4.303F, -0.7941F, 0.0F, 0.0F));

		PartDefinition Neckbase_r16 = Bodymiddle.addOrReplaceChild("Neckbase_r16", CubeListBuilder.create().texOffs(64, 37).addBox(0.0F, -7.4698F, -0.5381F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0317F, -4.303F, -0.6196F, 0.0F, 0.0F));

		PartDefinition Neckbase_r17 = Bodymiddle.addOrReplaceChild("Neckbase_r17", CubeListBuilder.create().texOffs(18, 52).addBox(-0.01F, -12.1063F, -0.1971F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.1317F, -0.903F, -0.6894F, 0.0F, 0.0F));

		PartDefinition Neckbase_r18 = Bodymiddle.addOrReplaceChild("Neckbase_r18", CubeListBuilder.create().texOffs(33, 56).addBox(0.0F, -9.5729F, -0.2514F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0317F, -5.803F, -0.5498F, 0.0F, 0.0F));

		PartDefinition Neckbase_r19 = Bodymiddle.addOrReplaceChild("Neckbase_r19", CubeListBuilder.create().texOffs(31, 41).addBox(-0.01F, -13.0914F, 0.0297F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.7317F, -2.803F, -0.6021F, 0.0F, 0.0F));

		PartDefinition Neckbase_r20 = Bodymiddle.addOrReplaceChild("Neckbase_r20", CubeListBuilder.create().texOffs(58, 53).addBox(0.0F, -9.7067F, -0.283F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0317F, -6.903F, -0.48F, 0.0F, 0.0F));

		PartDefinition Neckbase_r21 = Bodymiddle.addOrReplaceChild("Neckbase_r21", CubeListBuilder.create().texOffs(34, 41).addBox(-0.01F, -13.141F, -0.0105F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.1317F, -3.503F, -0.4974F, 0.0F, 0.0F));

		PartDefinition Neckbase_r22 = Bodymiddle.addOrReplaceChild("Neckbase_r22", CubeListBuilder.create().texOffs(21, 52).addBox(0.0F, -11.1083F, -0.4775F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0317F, -7.803F, -0.4451F, 0.0F, 0.0F));

		PartDefinition Neckbase_r23 = Bodymiddle.addOrReplaceChild("Neckbase_r23", CubeListBuilder.create().texOffs(12, 36).addBox(-0.01F, -16.0896F, -0.0809F, 0.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0317F, -6.303F, -0.4102F, 0.0F, 0.0F));

		PartDefinition Neckbase_r24 = Bodymiddle.addOrReplaceChild("Neckbase_r24", CubeListBuilder.create().texOffs(53, 59).addBox(0.0F, -8.9969F, -0.5286F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4683F, -9.003F, -0.3578F, 0.0F, 0.0F));

		PartDefinition Neckbase_r25 = Bodymiddle.addOrReplaceChild("Neckbase_r25", CubeListBuilder.create().texOffs(9, 36).addBox(-0.01F, -17.0487F, 0.0359F, 0.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.5317F, -8.303F, -0.3578F, 0.0F, 0.0F));

		PartDefinition Neckbase_r26 = Bodymiddle.addOrReplaceChild("Neckbase_r26", CubeListBuilder.create().texOffs(3, 59).addBox(0.0F, -9.2377F, -0.378F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4683F, -10.203F, -0.2531F, 0.0F, 0.0F));

		PartDefinition Neckbase_r27 = Bodymiddle.addOrReplaceChild("Neckbase_r27", CubeListBuilder.create().texOffs(15, 36).addBox(-0.01F, -16.0656F, -0.1031F, 0.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.8317F, -9.803F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Neckbase_r28 = Bodymiddle.addOrReplaceChild("Neckbase_r28", CubeListBuilder.create().texOffs(47, 59).addBox(0.0F, -9.5191F, -0.2089F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4683F, -11.503F, -0.192F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(31, 25).addBox(-1.0F, -0.1045F, 0.0098F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1586F, -5.7352F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(32, 10).addBox(-1.0F, -0.1406F, -0.1354F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.6414F, -11.5352F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r15 = Bodymiddle.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(46, 19).mirror().addBox(-9.586F, -1.4386F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7957F, -10.9162F, 0.0608F, 0.4024F, -1.1875F));

		PartDefinition Bodyfront_r16 = Bodymiddle.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(71, 25).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7957F, -10.9162F, 0.216F, 0.3474F, -0.7691F));

		PartDefinition Bodyfront_r17 = Bodymiddle.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(48, 33).mirror().addBox(-8.586F, -1.4386F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4957F, -8.9162F, 0.0538F, 0.3862F, -1.1902F));

		PartDefinition Bodyfront_r18 = Bodymiddle.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(71, 20).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4957F, -8.9162F, 0.2027F, 0.3352F, -0.7736F));

		PartDefinition Bodyfront_r19 = Bodymiddle.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(47, 15).mirror().addBox(-8.586F, -1.4386F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1957F, -6.9162F, 0.0331F, 0.3375F, -1.1975F));

		PartDefinition Bodyfront_r20 = Bodymiddle.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(71, 18).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1957F, -6.9162F, 0.1635F, 0.2984F, -0.7858F));

		PartDefinition Bodyfront_r21 = Bodymiddle.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(34, 8).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0957F, -4.9162F, 0.0132F, 0.2887F, -1.2036F));

		PartDefinition Bodyfront_r22 = Bodymiddle.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(71, 16).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0957F, -4.9162F, 0.1252F, 0.2612F, -0.7964F));

		PartDefinition Bodyfront_r23 = Bodymiddle.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(71, 8).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0957F, -2.9162F, 0.0753F, 0.211F, -0.8081F));

		PartDefinition Bodyfront_r24 = Bodymiddle.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(67, 45).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0957F, -2.9162F, -0.0124F, 0.2235F, -1.2101F));

		PartDefinition Bodyfront_r25 = Bodymiddle.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(70, 70).mirror().addBox(-4.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0957F, -0.9162F, -0.0374F, 0.1581F, -1.2149F));

		PartDefinition Bodyfront_r26 = Bodymiddle.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0957F, -0.9162F, 0.0265F, 0.1603F, -0.8171F));

		PartDefinition Bodyfront_r27 = Bodymiddle.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(71, 51).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0957F, -0.9162F, 0.072F, 0.1001F, -0.4702F));

		PartDefinition Bodyfront_r28 = Bodymiddle.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(71, 57).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0957F, -2.9162F, 0.1348F, 0.1315F, -0.463F));

		PartDefinition Bodyfront_r29 = Bodymiddle.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(71, 62).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0957F, -4.9162F, 0.1981F, 0.1624F, -0.4537F));

		PartDefinition Bodyfront_r30 = Bodymiddle.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(64, 71).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1957F, -6.9162F, 0.2459F, 0.1852F, -0.4454F));

		PartDefinition Bodyfront_r31 = Bodymiddle.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(72, 2).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4957F, -8.9162F, 0.2942F, 0.2075F, -0.436F));

		PartDefinition Bodyfront_r32 = Bodymiddle.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(72, 4).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7957F, -10.9162F, 0.3104F, 0.2149F, -0.4326F));

		PartDefinition Bodyfront_r33 = Bodymiddle.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(71, 51).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0957F, -0.9162F, 0.072F, -0.1001F, 0.4702F));

		PartDefinition Bodyfront_r34 = Bodymiddle.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(70, 0).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0957F, -0.9162F, 0.0265F, -0.1603F, 0.8171F));

		PartDefinition Bodyfront_r35 = Bodymiddle.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(70, 70).addBox(2.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0957F, -0.9162F, -0.0374F, -0.1581F, 1.2149F));

		PartDefinition Bodyfront_r36 = Bodymiddle.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(71, 57).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0957F, -2.9162F, 0.1348F, -0.1315F, 0.463F));

		PartDefinition Bodyfront_r37 = Bodymiddle.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(71, 8).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0957F, -2.9162F, 0.0753F, -0.211F, 0.8081F));

		PartDefinition Bodyfront_r38 = Bodymiddle.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(67, 45).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0957F, -2.9162F, -0.0124F, -0.2235F, 1.2101F));

		PartDefinition Bodyfront_r39 = Bodymiddle.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(71, 62).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0957F, -4.9162F, 0.1981F, -0.1624F, 0.4537F));

		PartDefinition Bodyfront_r40 = Bodymiddle.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(71, 16).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0957F, -4.9162F, 0.1252F, -0.2612F, 0.7964F));

		PartDefinition Bodyfront_r41 = Bodymiddle.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(34, 8).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0957F, -4.9162F, 0.0132F, -0.2887F, 1.2036F));

		PartDefinition Bodyfront_r42 = Bodymiddle.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(64, 71).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1957F, -6.9162F, 0.2459F, -0.1852F, 0.4454F));

		PartDefinition Bodyfront_r43 = Bodymiddle.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(71, 18).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1957F, -6.9162F, 0.1635F, -0.2984F, 0.7858F));

		PartDefinition Bodyfront_r44 = Bodymiddle.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(47, 15).addBox(2.586F, -1.4386F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1957F, -6.9162F, 0.0331F, -0.3375F, 1.1975F));

		PartDefinition Bodyfront_r45 = Bodymiddle.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(72, 2).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4957F, -8.9162F, 0.2942F, -0.2075F, 0.436F));

		PartDefinition Bodyfront_r46 = Bodymiddle.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(71, 20).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4957F, -8.9162F, 0.2027F, -0.3352F, 0.7736F));

		PartDefinition Bodyfront_r47 = Bodymiddle.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(48, 33).addBox(2.586F, -1.4386F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4957F, -8.9162F, 0.0538F, -0.3862F, 1.1902F));

		PartDefinition Bodyfront_r48 = Bodymiddle.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(72, 4).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7957F, -10.9162F, 0.3104F, -0.2149F, 0.4326F));

		PartDefinition Bodyfront_r49 = Bodymiddle.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(71, 25).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7957F, -10.9162F, 0.216F, -0.3474F, 0.7691F));

		PartDefinition Bodyfront_r50 = Bodymiddle.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(46, 19).addBox(2.586F, -1.4386F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7957F, -10.9162F, 0.0608F, -0.4024F, 1.1875F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7782F, -11.4708F, 0.1065F, 0.0868F, 0.0093F));

		PartDefinition Bodyfront_r51 = Bodyfront.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(46, 17).mirror().addBox(-9.586F, -1.4386F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3853F, -5.2874F, 0.0434F, 0.3619F, -1.194F));

		PartDefinition Bodyfront_r52 = Bodyfront.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(68, 6).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3853F, -5.2874F, 0.183F, 0.3169F, -0.7799F));

		PartDefinition Bodyfront_r53 = Bodyfront.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(40, 29).mirror().addBox(-9.586F, -1.4386F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0853F, -3.2874F, 0.0434F, 0.3619F, -1.1765F));

		PartDefinition Bodyfront_r54 = Bodyfront.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0853F, -3.2874F, 0.183F, 0.3169F, -0.7624F));

		PartDefinition Bodyfront_r55 = Bodyfront.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-9.586F, -1.4386F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1147F, -1.2874F, 0.1452F, 0.32F, -1.1424F));

		PartDefinition Bodyfront_r56 = Bodyfront.addOrReplaceChild("Bodyfront_r56", CubeListBuilder.create().texOffs(44, 48).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1147F, -1.2874F, 0.2574F, 0.2404F, -0.742F));

		PartDefinition Bodyfront_r57 = Bodyfront.addOrReplaceChild("Bodyfront_r57", CubeListBuilder.create().texOffs(18, 20).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1147F, -1.2874F, 0.3132F, 0.1008F, -0.417F));

		PartDefinition Bodyfront_r58 = Bodyfront.addOrReplaceChild("Bodyfront_r58", CubeListBuilder.create().texOffs(27, 35).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0853F, -3.2874F, 0.27F, 0.1964F, -0.4234F));

		PartDefinition Bodyfront_r59 = Bodyfront.addOrReplaceChild("Bodyfront_r59", CubeListBuilder.create().texOffs(26, 41).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3853F, -5.2874F, 0.27F, 0.1964F, -0.4408F));

		PartDefinition Bodyfront_r60 = Bodyfront.addOrReplaceChild("Bodyfront_r60", CubeListBuilder.create().texOffs(18, 20).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1147F, -1.2874F, 0.27F, -0.1964F, 0.4234F));

		PartDefinition Bodyfront_r61 = Bodyfront.addOrReplaceChild("Bodyfront_r61", CubeListBuilder.create().texOffs(44, 48).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1147F, -1.2874F, 0.183F, -0.3169F, 0.7624F));

		PartDefinition Bodyfront_r62 = Bodyfront.addOrReplaceChild("Bodyfront_r62", CubeListBuilder.create().texOffs(36, 0).addBox(2.586F, -1.4386F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1147F, -1.2874F, 0.0434F, -0.3619F, 1.1765F));

		PartDefinition Bodyfront_r63 = Bodyfront.addOrReplaceChild("Bodyfront_r63", CubeListBuilder.create().texOffs(27, 35).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0853F, -3.2874F, 0.27F, -0.1964F, 0.4234F));

		PartDefinition Bodyfront_r64 = Bodyfront.addOrReplaceChild("Bodyfront_r64", CubeListBuilder.create().texOffs(60, 0).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0853F, -3.2874F, 0.183F, -0.3169F, 0.7624F));

		PartDefinition Bodyfront_r65 = Bodyfront.addOrReplaceChild("Bodyfront_r65", CubeListBuilder.create().texOffs(40, 29).addBox(2.586F, -1.4386F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0853F, -3.2874F, 0.0434F, -0.3619F, 1.1765F));

		PartDefinition Bodyfront_r66 = Bodyfront.addOrReplaceChild("Bodyfront_r66", CubeListBuilder.create().texOffs(46, 17).addBox(2.586F, -1.4386F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3853F, -5.2874F, 0.0434F, -0.3619F, 1.194F));

		PartDefinition Bodyfront_r67 = Bodyfront.addOrReplaceChild("Bodyfront_r67", CubeListBuilder.create().texOffs(68, 6).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3853F, -5.2874F, 0.183F, -0.3169F, 0.7799F));

		PartDefinition Bodyfront_r68 = Bodyfront.addOrReplaceChild("Bodyfront_r68", CubeListBuilder.create().texOffs(26, 41).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3853F, -5.2874F, 0.27F, -0.1964F, 0.4408F));

		PartDefinition Bodyfront_r69 = Bodyfront.addOrReplaceChild("Bodyfront_r69", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.1F, -2.2F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).addBox(5.5F, -2.1F, -2.2F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 4.6457F, -6.512F, 0.8203F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r70 = Bodyfront.addOrReplaceChild("Bodyfront_r70", CubeListBuilder.create().texOffs(40, 53).mirror().addBox(-0.5F, -2.8309F, -0.4315F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(40, 53).addBox(5.5F, -2.8309F, -0.4315F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.0F, 1.6583F, -6.5448F, -0.4887F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r71 = Bodyfront.addOrReplaceChild("Bodyfront_r71", CubeListBuilder.create().texOffs(27, 16).mirror().addBox(-0.5F, -2.4456F, -0.0367F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 16).addBox(5.5F, -2.4456F, -0.0367F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.6583F, -7.2448F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r72 = Bodyfront.addOrReplaceChild("Bodyfront_r72", CubeListBuilder.create().texOffs(13, 0).addBox(-1.0F, 0.0616F, 0.0212F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.8162F, -6.9638F, 1.3439F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r73 = Bodyfront.addOrReplaceChild("Bodyfront_r73", CubeListBuilder.create().texOffs(18, 46).addBox(-2.5F, -4.0F, 0.1F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.9162F, -6.9638F, 0.9076F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r74 = Bodyfront.addOrReplaceChild("Bodyfront_r74", CubeListBuilder.create().texOffs(27, 33).addBox(-0.5F, 0.0389F, 0.029F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9847F, -5.7468F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Neckbase_r29 = Bodyfront.addOrReplaceChild("Neckbase_r29", CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -24.6825F, -0.8282F, 0.0F, 25.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2128F, -0.5742F, -0.2531F, 0.0F, 0.0F));

		PartDefinition Neckbase_r30 = Bodyfront.addOrReplaceChild("Neckbase_r30", CubeListBuilder.create().texOffs(6, 20).addBox(0.0F, -18.7006F, -0.3965F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6128F, -3.0742F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Neckbase_r31 = Bodyfront.addOrReplaceChild("Neckbase_r31", CubeListBuilder.create().texOffs(3, 20).addBox(0.0F, -22.5191F, -0.4814F, 0.0F, 23.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6128F, -1.9742F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Neckbase_r32 = Bodyfront.addOrReplaceChild("Neckbase_r32", CubeListBuilder.create().texOffs(50, 59).addBox(0.0F, -9.7466F, -0.6903F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6128F, -4.8742F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neckbase_r33 = Bodyfront.addOrReplaceChild("Neckbase_r33", CubeListBuilder.create().texOffs(0, 39).addBox(0.0F, -13.6917F, -0.2882F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6128F, -4.1742F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create().texOffs(6, 60).addBox(-0.5F, -0.1985F, -3.0721F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.7431F, -5.6146F, -0.1061F, 0.0F, 0.0F));

		PartDefinition Neckbase_r34 = Neckbase.addOrReplaceChild("Neckbase_r34", CubeListBuilder.create().texOffs(36, 66).addBox(0.0F, -5.2828F, 0.0112F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1985F, -1.0721F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Neckbase_r35 = Neckbase.addOrReplaceChild("Neckbase_r35", CubeListBuilder.create().texOffs(0, 67).addBox(0.0F, -3.3F, -0.6F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3176F, -1.724F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Neckbase_r36 = Neckbase.addOrReplaceChild("Neckbase_r36", CubeListBuilder.create().texOffs(61, 68).addBox(0.0F, -5.0F, -0.7F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1985F, -2.5721F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r75 = Neckbase.addOrReplaceChild("Bodyfront_r75", CubeListBuilder.create().texOffs(46, 31).mirror().addBox(-8.586F, -1.4386F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3559F, -1.6531F, 0.1172F, 0.5232F, -1.2495F));

		PartDefinition Bodyfront_r76 = Neckbase.addOrReplaceChild("Bodyfront_r76", CubeListBuilder.create().texOffs(69, 67).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3559F, -1.6531F, 0.3197F, 0.4366F, -0.8167F));

		PartDefinition Bodyfront_r77 = Neckbase.addOrReplaceChild("Bodyfront_r77", CubeListBuilder.create().texOffs(61, 47).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3559F, -1.6531F, 0.4336F, 0.268F, -0.4903F));

		PartDefinition Bodyfront_r78 = Neckbase.addOrReplaceChild("Bodyfront_r78", CubeListBuilder.create().texOffs(46, 31).addBox(2.586F, -1.4386F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3559F, -1.6531F, 0.1172F, -0.5232F, 1.2495F));

		PartDefinition Bodyfront_r79 = Neckbase.addOrReplaceChild("Bodyfront_r79", CubeListBuilder.create().texOffs(69, 67).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3559F, -1.6531F, 0.3197F, -0.4366F, 0.8167F));

		PartDefinition Bodyfront_r80 = Neckbase.addOrReplaceChild("Bodyfront_r80", CubeListBuilder.create().texOffs(61, 47).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3559F, -1.6531F, 0.4336F, -0.268F, 0.4903F));

		PartDefinition Neckend = Neckbase.addOrReplaceChild("Neckend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.237F, -3.031F, 0.0647F, -0.1742F, -0.0112F));

		PartDefinition Neckend_r1 = Neckend.addOrReplaceChild("Neckend_r1", CubeListBuilder.create().texOffs(9, 20).addBox(0.0F, -3.7F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(24, 60).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2945F, -1.5494F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Neckbase_r37 = Neckend.addOrReplaceChild("Neckbase_r37", CubeListBuilder.create().texOffs(69, 47).mirror().addBox(-2.9239F, -0.3827F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0683F, -2.2784F, 0.4146F, 0.5221F, -1.1095F));

		PartDefinition Neckbase_r38 = Neckend.addOrReplaceChild("Neckbase_r38", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-3.9239F, -0.3827F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0683F, -0.4784F, 0.3819F, 0.4891F, -0.9944F));

		PartDefinition Neckbase_r39 = Neckend.addOrReplaceChild("Neckbase_r39", CubeListBuilder.create().texOffs(50, 21).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0683F, -0.4784F, 0.5334F, 0.3133F, -0.6119F));

		PartDefinition Neckbase_r40 = Neckend.addOrReplaceChild("Neckbase_r40", CubeListBuilder.create().texOffs(55, 26).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0683F, -2.2784F, 0.5744F, 0.3332F, -0.7298F));

		PartDefinition Neckbase_r41 = Neckend.addOrReplaceChild("Neckbase_r41", CubeListBuilder.create().texOffs(0, 8).addBox(0.9239F, -0.3827F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0683F, -0.4784F, 0.3819F, -0.4891F, 0.9944F));

		PartDefinition Neckbase_r42 = Neckend.addOrReplaceChild("Neckbase_r42", CubeListBuilder.create().texOffs(50, 21).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0683F, -0.4784F, 0.5334F, -0.3133F, 0.6119F));

		PartDefinition Neckbase_r43 = Neckend.addOrReplaceChild("Neckbase_r43", CubeListBuilder.create().texOffs(55, 26).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0683F, -2.2784F, 0.5744F, -0.3332F, 0.7298F));

		PartDefinition Neckbase_r44 = Neckend.addOrReplaceChild("Neckbase_r44", CubeListBuilder.create().texOffs(69, 47).addBox(0.9239F, -0.3827F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0683F, -2.2784F, 0.4146F, -0.5221F, 1.1095F));

		PartDefinition Head = Neckend.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(3, 12).addBox(-2.5F, -1.1139F, -4.8427F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.2167F, -2.6779F, 0.243F, 0.4994F, 0.1312F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(19, 9).addBox(-2.5F, -0.0092F, -2.0104F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.1797F, -1.1012F, -0.4189F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(66, 29).mirror().addBox(-1.84F, 3.1F, -6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
				.texOffs(67, 35).mirror().addBox(-2.73F, 0.3F, 0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 57).mirror().addBox(-2.95F, 0.3F, 0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(66, 52).mirror().addBox(-2.86F, 0.3F, 0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
				.texOffs(66, 29).addBox(0.82F, 3.1F, -6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
				.texOffs(66, 52).addBox(1.84F, 0.3F, 0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
				.texOffs(66, 57).addBox(1.93F, 0.3F, 0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(67, 35).addBox(1.71F, 0.3F, 0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(40, 24).addBox(-2.52F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.02F, -3.1139F, -4.8427F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(66, 62).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 62).addBox(3.94F, -0.8F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.21F, -1.3433F, -1.6309F, -0.4451F, 0.0F, 0.0F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create().texOffs(37, 46).addBox(1.51F, 0.4F, -3.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(37, 46).mirror().addBox(-2.49F, 0.4F, -3.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2861F, -1.1427F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle = Lowerjawback.addOrReplaceChild("Lowerjawmiddle", CubeListBuilder.create().texOffs(50, 6).addBox(0.51F, 0.5F, -3.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F))
				.texOffs(50, 6).mirror().addBox(-1.49F, 0.5F, -3.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.65F, -3.0F, 0.1911F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddle.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create().texOffs(6, 55).addBox(-1.0F, -2.0F, -2.45F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -4.0F, -0.2335F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r1 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r1", CubeListBuilder.create().texOffs(53, 41).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(47, 54).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, 0.05F, 0.4014F, 0.0F, 0.0F));

		PartDefinition Lowerfrontteeth = Lowerjawfront.addOrReplaceChild("Lowerfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.7006F, 0.0F, 0.0F));

		PartDefinition Lowerfrontteeth_r1 = Lowerfrontteeth.addOrReplaceChild("Lowerfrontteeth_r1", CubeListBuilder.create().texOffs(49, 71).addBox(0.8F, -1.7F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 1.2F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Lowerfrontteeth2 = Lowerjawfront.addOrReplaceChild("Lowerfrontteeth2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.02F, 0.0F, -2.0F, 0.7006F, 0.0F, 0.0F));

		PartDefinition Lowerfrontteeth_r2 = Lowerfrontteeth2.addOrReplaceChild("Lowerfrontteeth_r2", CubeListBuilder.create().texOffs(49, 71).mirror().addBox(-0.8F, -1.7F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9F, 1.2F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope = Lowerjawback.addOrReplaceChild("Lowerjawslope", CubeListBuilder.create().texOffs(49, 35).addBox(0.62F, 0.0F, -3.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F))
				.texOffs(49, 35).mirror().addBox(-1.58F, 0.0F, -3.75F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(30, 6).addBox(0.62F, 0.5F, -1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.01F, -0.1F, -3.0F, 0.3768F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope_r1 = Lowerjawslope.addOrReplaceChild("Lowerjawslope_r1", CubeListBuilder.create().texOffs(60, 32).mirror().addBox(-1.62F, -0.5F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(60, 32).addBox(2.38F, -0.5F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.86F, 1.1257F, 2.342F, -0.7592F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope_r2 = Lowerjawslope.addOrReplaceChild("Lowerjawslope_r2", CubeListBuilder.create().texOffs(67, 40).mirror().addBox(-1.62F, -1.0F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(67, 40).addBox(2.38F, -1.0F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.86F, 0.9485F, 0.7606F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Rightlowerteeth = Lowerjawslope.addOrReplaceChild("Rightlowerteeth", CubeListBuilder.create().texOffs(47, 41).addBox(0.0F, -0.8F, -5.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.6F, 0.0F, -0.0637F, 0.1698F, 0.0F));

		PartDefinition Rightlowerteeth2 = Lowerjawslope.addOrReplaceChild("Rightlowerteeth2", CubeListBuilder.create().texOffs(47, 41).mirror().addBox(0.0F, -0.8F, -5.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.46F, 0.6F, 0.0F, -0.0637F, -0.1698F, 0.0F));

		PartDefinition Upperjawback = Head.addOrReplaceChild("Upperjawback", CubeListBuilder.create().texOffs(36, 33).addBox(-2.0F, 0.1F, -2.4F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9639F, -5.1427F, 0.4245F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle = Upperjawback.addOrReplaceChild("Upperjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -4.0F, -0.5943F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle_r1 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r1", CubeListBuilder.create().texOffs(53, 21).addBox(-1.5F, -1.9598F, -1.9362F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.6F, 0.192F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle_r2 = Upperjawmiddle.addOrReplaceChild("Upperjawmiddle_r2", CubeListBuilder.create().texOffs(51, 0).addBox(-1.5F, -2.9F, -1.9F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 1.3F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Nosebridge = Upperjawmiddle.addOrReplaceChild("Nosebridge", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.4F, -1.25F, 0.9976F, 0.0F, 0.0F));

		PartDefinition Nosebridge_r1 = Nosebridge.addOrReplaceChild("Nosebridge_r1", CubeListBuilder.create().texOffs(5, 70).addBox(-1.0F, -0.0248F, -1.5851F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 22).addBox(-1.0F, -0.0248F, -0.9851F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -3.7F, 0.7156F, 0.0F, 0.0F));

		PartDefinition Nosebridge_r2 = Nosebridge.addOrReplaceChild("Nosebridge_r2", CubeListBuilder.create().texOffs(39, 70).addBox(-1.0F, -0.0549F, -1.0044F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -2.7F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Nosebridge_r3 = Nosebridge.addOrReplaceChild("Nosebridge_r3", CubeListBuilder.create().texOffs(41, 8).addBox(-1.0F, -0.0665F, -0.1663F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -2.6F, -0.2531F, 0.0F, 0.0F));

		PartDefinition Upperjawfront = Upperjawmiddle.addOrReplaceChild("Upperjawfront", CubeListBuilder.create().texOffs(64, 8).addBox(-1.0F, 0.6237F, -1.5163F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -2.0F, -2.8F, 0.9128F, 0.0F, 0.0F));

		PartDefinition Upperfrontteeth = Upperjawfront.addOrReplaceChild("Upperfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -1.5F, -0.1227F, 0.0F, 0.0F));

		PartDefinition Rightupperteethback = Upperjawback.addOrReplaceChild("Rightupperteethback", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, 1.7F, 1.17F, -0.1061F, 0.0213F, 0.0F));

		PartDefinition Rightupperteethback_r1 = Rightupperteethback.addOrReplaceChild("Rightupperteethback_r1", CubeListBuilder.create().texOffs(14, 54).addBox(-0.5F, -1.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2499F, 0.338F, -7.0714F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Rightupperteethback_r2 = Rightupperteethback.addOrReplaceChild("Rightupperteethback_r2", CubeListBuilder.create().texOffs(57, 7).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2499F, -0.2266F, -5.922F, -0.48F, 0.0F, 0.0F));

		PartDefinition Rightupperteethback_r3 = Rightupperteethback.addOrReplaceChild("Rightupperteethback_r3", CubeListBuilder.create().texOffs(56, 35).addBox(0.0F, -1.3F, -1.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 60).addBox(0.0F, -0.9F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2499F, 1.2369F, -4.4027F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Rightupperteethback_r4 = Rightupperteethback.addOrReplaceChild("Rightupperteethback_r4", CubeListBuilder.create().texOffs(27, 31).addBox(0.0F, -0.3F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2499F, 0.5006F, -2.0053F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Rightupperteethback2 = Upperjawback.addOrReplaceChild("Rightupperteethback2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.78F, 1.7F, 1.17F, -0.1061F, -0.0213F, 0.0F));

		PartDefinition Leftupperteethback_r1 = Rightupperteethback2.addOrReplaceChild("Leftupperteethback_r1", CubeListBuilder.create().texOffs(14, 54).mirror().addBox(0.5F, -1.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2499F, 0.338F, -7.0714F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Leftupperteethback_r2 = Rightupperteethback2.addOrReplaceChild("Leftupperteethback_r2", CubeListBuilder.create().texOffs(57, 7).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2499F, -0.2266F, -5.922F, -0.48F, 0.0F, 0.0F));

		PartDefinition Leftupperteethback_r3 = Rightupperteethback2.addOrReplaceChild("Leftupperteethback_r3", CubeListBuilder.create().texOffs(56, 35).mirror().addBox(0.0F, -1.3F, -1.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 60).mirror().addBox(0.0F, -0.9F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2499F, 1.2369F, -4.4027F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Leftupperteethback_r4 = Rightupperteethback2.addOrReplaceChild("Leftupperteethback_r4", CubeListBuilder.create().texOffs(27, 31).mirror().addBox(0.0F, -0.3F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2499F, 0.5006F, -2.0053F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -2.9639F, -5.6427F, 0.3183F, 0.0F, 0.0F));

		PartDefinition Forehead_r1 = Forehead.addOrReplaceChild("Forehead_r1", CubeListBuilder.create().texOffs(39, 39).addBox(-1.5F, 0.0F, -0.1F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.6F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(65, 0).addBox(0.101F, 1.2702F, -0.8446F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(58, 9).addBox(0.101F, -0.7298F, -1.2446F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 5.3616F, -5.9681F, -0.2784F, 0.1061F, -0.2122F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(18, 66).addBox(-0.3997F, 0.0016F, -0.5154F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 65).addBox(-0.3997F, 0.0016F, -1.7154F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.573F, 4.4027F, 0.5233F, -0.6344F, 0.0637F, 0.2122F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create().texOffs(36, 2).addBox(-2.0F, 0.0F, -3.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4F, -0.5F, 0.8491F, 0.0F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(64, 23).addBox(-1.101F, 1.2702F, -0.8446F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(55, 46).addBox(-1.101F, -0.7298F, -1.2446F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 5.3616F, -5.9681F, 0.6954F, -0.2487F, 0.3801F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(28, 65).addBox(-0.6003F, 0.0016F, -0.5154F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 65).addBox(-0.6003F, 0.0016F, -1.7154F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.573F, 4.4027F, 0.5233F, -0.8312F, -0.0742F, -0.3972F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create().texOffs(33, 18).addBox(-2.0F, 0.0F, -3.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4F, -0.5F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Sailmiddlefront = Bodyfront.addOrReplaceChild("Sailmiddlefront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -2.4397F, -6.6063F, -0.0637F, 0.0F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0495F, 3.5908F, 0.1988F, -0.1712F, -0.0343F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(23, 0).addBox(0.0F, -1.0F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1397F, 3.3434F, 0.6632F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(18, 30).addBox(0.0F, -1.7F, 3.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 18).addBox(0.0F, -1.8F, 1.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 28).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2482F, -0.9619F, 0.096F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5499F, 4.722F, -0.1356F, -0.173F, 0.0235F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(18, 31).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1835F, -0.0899F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tailmiddlebase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(36, 33).addBox(0.0F, -1.4F, 9.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 41).addBox(0.0F, -1.6F, 7.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 52).addBox(0.0F, -1.7F, 5.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8165F, -5.7899F, 0.096F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tailmiddlebase.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(54, 12).addBox(0.0F, 1.9F, 5.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 54).addBox(0.0F, 0.9F, 3.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 54).addBox(0.0F, 0.2F, 1.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7079F, -1.4847F, 0.6632F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddlebase.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, -0.3115F, -0.0256F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.7741F, 5.5583F, 0.1444F, -0.2614F, -0.0148F));

		PartDefinition Tailbase_r5 = Tailmiddleend.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.1F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 0).addBox(0.0F, -0.2F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 31).addBox(0.0F, -0.3F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 10).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4767F, 0.732F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0255F, 6.9651F, 0.0723F, -0.3047F, -0.0217F));

		PartDefinition Tailend_r1 = Tailend.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1915F, -0.0707F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(6, 65).addBox(-0.3136F, -0.6328F, -1.0681F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 28).addBox(-0.3136F, 1.3672F, -0.6681F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 2.2387F, 2.205F, -0.7236F, -0.1664F, -0.295F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(63, 15).addBox(-0.5981F, -0.0109F, -0.934F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(40, 62).addBox(-0.5534F, 0.0765F, 0.4063F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4882F, 4.1774F, -0.2708F, 1.3043F, -0.1274F, 0.0848F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create().texOffs(20, 25).addBox(-2.0F, 0.0F, -3.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0365F, 5.642F, 0.5809F, -0.0636F, 0.0028F, 0.0648F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(64, 47).addBox(-0.6864F, -0.6328F, -1.0681F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(3, 12).addBox(-0.6864F, 1.3672F, -0.6681F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3F, 2.2387F, 2.205F, 0.9281F, 0.0223F, 0.1867F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(61, 60).addBox(-0.4019F, -0.0109F, -0.934F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(61, 52).addBox(-0.4466F, 0.0765F, 0.4063F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4882F, 4.1774F, -0.2708F, 0.9552F, 0.1274F, -0.0848F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create().texOffs(23, 0).addBox(-2.0F, 0.0F, -3.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0365F, 5.642F, 0.5809F, -0.0636F, -0.0028F, -0.0648F));

		return LayerDefinition.create(meshdefinition, 80, 80);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}