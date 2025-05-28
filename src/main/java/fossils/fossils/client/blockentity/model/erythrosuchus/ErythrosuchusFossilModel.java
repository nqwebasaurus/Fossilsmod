package fossils.fossils.client.blockentity.model.erythrosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ErythrosuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart Upperjawback;
	private final ModelPart Upperlipback;
	private final ModelPart UpperteethbackR;
	private final ModelPart Upperjawmiddle;
	private final ModelPart Upperjawfront;
	private final ModelPart Upperfrontteeth;
	private final ModelPart Snoutslope;
	private final ModelPart Upperlipfront;
	private final ModelPart UpperteethmidfrontR;
	private final ModelPart UpperteethmiddleR;
	private final ModelPart UpperteethmiddleR2;
	private final ModelPart Lowerjawback;
	private final ModelPart Lowerjawmiddleback;
	private final ModelPart Lowerjawmiddlefront;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerteethfront;
	private final ModelPart Lowerteethback;
	private final ModelPart Lowerjawslope;
	private final ModelPart Jawparting;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Rightankle;
	private final ModelPart Righttoes;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Leftankle;
	private final ModelPart Lefttoes;

	public ErythrosuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Upperjawback = this.Head.getChild("Upperjawback");
		this.Upperlipback = this.Upperjawback.getChild("Upperlipback");
		this.UpperteethbackR = this.Upperlipback.getChild("UpperteethbackR");
		this.Upperjawmiddle = this.Upperjawback.getChild("Upperjawmiddle");
		this.Upperjawfront = this.Upperjawmiddle.getChild("Upperjawfront");
		this.Upperfrontteeth = this.Upperjawfront.getChild("Upperfrontteeth");
		this.Snoutslope = this.Upperjawmiddle.getChild("Snoutslope");
		this.Upperlipfront = this.Upperjawmiddle.getChild("Upperlipfront");
		this.UpperteethmidfrontR = this.Upperlipfront.getChild("UpperteethmidfrontR");
		this.UpperteethmiddleR = this.Upperjawmiddle.getChild("UpperteethmiddleR");
		this.UpperteethmiddleR2 = this.Upperjawmiddle.getChild("UpperteethmiddleR2");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
		this.Lowerjawmiddleback = this.Lowerjawback.getChild("Lowerjawmiddleback");
		this.Lowerjawmiddlefront = this.Lowerjawmiddleback.getChild("Lowerjawmiddlefront");
		this.Lowerjawfront = this.Lowerjawmiddlefront.getChild("Lowerjawfront");
		this.Lowerteethfront = this.Lowerjawfront.getChild("Lowerteethfront");
		this.Lowerteethback = this.Lowerjawmiddlefront.getChild("Lowerteethback");
		this.Lowerjawslope = this.Lowerjawback.getChild("Lowerjawslope");
		this.Jawparting = this.Lowerjawback.getChild("Jawparting");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
		this.Tailmiddleend = this.Tailmiddle.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Rightankle = this.Rightshin.getChild("Rightankle");
		this.Righttoes = this.Rightankle.getChild("Righttoes");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Leftankle = this.Leftshin.getChild("Leftankle");
		this.Lefttoes = this.Leftankle.getChild("Lefttoes");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 5.4F, 0.8F, -0.2972F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(76, 7).mirror().addBox(0.7F, -1.3842F, 0.3451F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(76, 7).addBox(3.7F, -1.3842F, 0.3451F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-3.7F, -2.5763F, 11.9945F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Basin_r1 = Hips.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(84, 57).mirror().addBox(-0.2648F, -0.2874F, -0.1167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3958F, -3.6823F, 14.6126F, 0.1588F, -0.2838F, 0.1822F));

		PartDefinition Basin_r2 = Hips.addOrReplaceChild("Basin_r2", CubeListBuilder.create().texOffs(21, 34).mirror().addBox(-0.3361F, -0.1178F, -0.1246F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5182F, -3.307F, 10.9355F, 0.4841F, -0.0251F, 0.2231F));

		PartDefinition Basin_r3 = Hips.addOrReplaceChild("Basin_r3", CubeListBuilder.create().texOffs(83, 70).mirror().addBox(-0.1551F, -0.0017F, 0.0009F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5182F, -4.307F, 12.5355F, -0.0395F, -0.0251F, 0.2231F));

		PartDefinition Basin_r4 = Hips.addOrReplaceChild("Basin_r4", CubeListBuilder.create().texOffs(78, 39).mirror().addBox(-0.5156F, -0.9035F, -0.1005F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.5182F, -2.507F, 11.0355F, 0.1525F, -0.0251F, 0.2231F));

		PartDefinition Basin_r5 = Hips.addOrReplaceChild("Basin_r5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.1674F, 2.6639F, -2.9406F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.62F, -0.7937F, 14.2508F, 1.3142F, 0.1993F, -0.1723F));

		PartDefinition Basin_r6 = Hips.addOrReplaceChild("Basin_r6", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.1674F, -1.1209F, -3.6843F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.62F, -0.7937F, 14.2508F, 1.6109F, 0.1993F, -0.1723F));

		PartDefinition Basin_r7 = Hips.addOrReplaceChild("Basin_r7", CubeListBuilder.create().texOffs(32, 86).mirror().addBox(-0.1674F, 1.3248F, -0.472F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.62F, -0.7937F, 14.2508F, 0.9128F, 0.1993F, -0.1723F));

		PartDefinition Basin_r8 = Hips.addOrReplaceChild("Basin_r8", CubeListBuilder.create().texOffs(26, 69).mirror().addBox(-0.1674F, -0.8106F, -3.2313F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.62F, -0.7937F, 14.2508F, 0.7906F, 0.1993F, -0.1723F));

		PartDefinition Basin_r9 = Hips.addOrReplaceChild("Basin_r9", CubeListBuilder.create().texOffs(20, 76).mirror().addBox(-0.3156F, -0.2495F, -3.7645F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.62F, -2.7999F, 14.9959F, 0.0025F, 0.0254F, -0.0834F));

		PartDefinition Basin_r10 = Hips.addOrReplaceChild("Basin_r10", CubeListBuilder.create().texOffs(85, 80).mirror().addBox(-0.2281F, -1.3175F, -0.7915F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.62F, -0.6723F, 11.4641F, -0.4661F, -0.0934F, -0.3471F));

		PartDefinition Basin_r11 = Hips.addOrReplaceChild("Basin_r11", CubeListBuilder.create().texOffs(8, 0).mirror().addBox(-0.2281F, -1.13F, 1.8643F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.62F, -0.6723F, 11.4641F, -1.3388F, -0.0934F, -0.3471F));

		PartDefinition Basin_r12 = Hips.addOrReplaceChild("Basin_r12", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.2281F, 2.3869F, -1.4594F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.62F, -0.6723F, 11.4641F, -0.2043F, -0.0934F, -0.3471F));

		PartDefinition Basin_r13 = Hips.addOrReplaceChild("Basin_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8326F, 2.6639F, -2.9406F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.62F, -0.7937F, 14.2508F, 1.3142F, -0.1993F, 0.1723F));

		PartDefinition Basin_r14 = Hips.addOrReplaceChild("Basin_r14", CubeListBuilder.create().texOffs(0, 84).addBox(-0.8326F, -1.1209F, -3.6843F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.62F, -0.7937F, 14.2508F, 1.6109F, -0.1993F, 0.1723F));

		PartDefinition Basin_r15 = Hips.addOrReplaceChild("Basin_r15", CubeListBuilder.create().texOffs(32, 86).addBox(-0.8326F, 1.3248F, -0.472F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.62F, -0.7937F, 14.2508F, 0.9128F, -0.1993F, 0.1723F));

		PartDefinition Basin_r16 = Hips.addOrReplaceChild("Basin_r16", CubeListBuilder.create().texOffs(26, 69).addBox(-0.8326F, -0.8106F, -3.2313F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.62F, -0.7937F, 14.2508F, 0.7906F, -0.1993F, 0.1723F));

		PartDefinition Basin_r17 = Hips.addOrReplaceChild("Basin_r17", CubeListBuilder.create().texOffs(20, 76).addBox(-0.6844F, -0.2495F, -3.7645F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.62F, -2.7999F, 14.9959F, 0.0025F, -0.0254F, 0.0834F));

		PartDefinition Basin_r18 = Hips.addOrReplaceChild("Basin_r18", CubeListBuilder.create().texOffs(8, 0).addBox(-0.7719F, -1.13F, 1.8643F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.62F, -0.6723F, 11.4641F, -1.3388F, 0.0934F, 0.3471F));

		PartDefinition Basin_r19 = Hips.addOrReplaceChild("Basin_r19", CubeListBuilder.create().texOffs(0, 63).addBox(-0.7719F, 2.3869F, -1.4594F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.62F, -0.6723F, 11.4641F, -0.2043F, 0.0934F, 0.3471F));

		PartDefinition Basin_r20 = Hips.addOrReplaceChild("Basin_r20", CubeListBuilder.create().texOffs(85, 80).addBox(-0.7719F, -1.3175F, -0.7915F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.62F, -0.6723F, 11.4641F, -0.4661F, 0.0934F, 0.3471F));

		PartDefinition Basin_r21 = Hips.addOrReplaceChild("Basin_r21", CubeListBuilder.create().texOffs(84, 57).addBox(-0.7352F, -0.2874F, -0.1167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3958F, -3.6823F, 14.6126F, 0.1588F, 0.2838F, -0.1822F));

		PartDefinition Basin_r22 = Hips.addOrReplaceChild("Basin_r22", CubeListBuilder.create().texOffs(83, 70).addBox(-0.8449F, -0.0017F, 0.0009F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5182F, -4.307F, 12.5355F, -0.0395F, 0.0251F, -0.2231F));

		PartDefinition Basin_r23 = Hips.addOrReplaceChild("Basin_r23", CubeListBuilder.create().texOffs(21, 34).addBox(-0.6639F, -0.1178F, -0.1246F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5182F, -3.307F, 10.9355F, 0.4841F, 0.0251F, -0.2231F));

		PartDefinition Basin_r24 = Hips.addOrReplaceChild("Basin_r24", CubeListBuilder.create().texOffs(78, 39).addBox(-0.4844F, -0.9035F, -0.1005F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.5182F, -2.507F, 11.0355F, 0.1525F, 0.0251F, -0.2231F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(46, 65).addBox(0.0F, -1.2285F, 8.1691F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 69).addBox(0.0F, -1.2285F, 6.1691F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 69).addBox(0.0F, -1.4285F, 4.1691F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 41).addBox(0.0F, -1.5285F, 2.1691F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 21).addBox(0.0F, -1.3285F, 0.1691F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 17).addBox(-1.0F, 0.0715F, -0.8309F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -4.6763F, 7.4945F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Hips.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(57, 65).mirror().addBox(-3.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -3.5061F, 8.9346F, 0.0915F, 0.0782F, -1.1589F));

		PartDefinition Bodymiddle_r2 = Hips.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(32, 63).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -3.5061F, 10.9346F, 0.0137F, -0.0153F, -0.5669F));

		PartDefinition Bodymiddle_r3 = Hips.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(44, 63).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -3.5061F, 8.9346F, 0.1292F, 0.0417F, -0.548F));

		PartDefinition Bodymiddle_r4 = Hips.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(32, 63).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5061F, 10.9346F, 0.0137F, 0.0153F, 0.5669F));

		PartDefinition Bodymiddle_r5 = Hips.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(57, 65).addBox(1.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5061F, 8.9346F, 0.0915F, -0.0782F, 1.1589F));

		PartDefinition Bodymiddle_r6 = Hips.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(44, 63).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5061F, 8.9346F, 0.1292F, -0.0417F, 0.548F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -3.7763F, 7.1945F, 0.2398F, 0.1272F, 0.031F));

		PartDefinition Bodymiddle_r7 = Bodymiddle.addOrReplaceChild("Bodymiddle_r7", CubeListBuilder.create().texOffs(11, 57).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.156F, -0.3444F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r8 = Bodymiddle.addOrReplaceChild("Bodymiddle_r8", CubeListBuilder.create().texOffs(55, 77).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2511F, -2.3521F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r9 = Bodymiddle.addOrReplaceChild("Bodymiddle_r9", CubeListBuilder.create().texOffs(77, 92).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3461F, -4.3598F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r10 = Bodymiddle.addOrReplaceChild("Bodymiddle_r10", CubeListBuilder.create().texOffs(71, 31).addBox(0.0F, -2.8F, 6.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 72).addBox(0.0F, -2.9F, 4.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 86).addBox(0.0F, -3.0F, 2.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 90).addBox(0.0F, -2.9F, 0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 17).addBox(-1.0F, -0.8F, -0.3F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6333F, -13.4687F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r11 = Bodymiddle.addOrReplaceChild("Bodymiddle_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -3.1055F, -0.101F, 10.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.9333F, -13.0687F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r12 = Bodymiddle.addOrReplaceChild("Bodymiddle_r12", CubeListBuilder.create().texOffs(66, 60).mirror().addBox(-9.8133F, -2.5759F, -0.44F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7702F, -12.0599F, 0.0648F, 0.1519F, -1.3855F));

		PartDefinition Bodymiddle_r13 = Bodymiddle.addOrReplaceChild("Bodymiddle_r13", CubeListBuilder.create().texOffs(50, 33).mirror().addBox(-3.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7702F, -12.0599F, 0.123F, 0.1103F, -0.9473F));

		PartDefinition Bodymiddle_r14 = Bodymiddle.addOrReplaceChild("Bodymiddle_r14", CubeListBuilder.create().texOffs(91, 16).mirror().addBox(-3.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5702F, -10.2599F, 0.1047F, 0.091F, -0.9318F));

		PartDefinition Bodymiddle_r15 = Bodymiddle.addOrReplaceChild("Bodymiddle_r15", CubeListBuilder.create().texOffs(63, 39).mirror().addBox(-9.8133F, -2.5759F, -0.44F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5702F, -10.2599F, 0.0564F, 0.1267F, -1.3693F));

		PartDefinition Bodymiddle_r16 = Bodymiddle.addOrReplaceChild("Bodymiddle_r16", CubeListBuilder.create().texOffs(75, 50).mirror().addBox(-8.8133F, -2.5759F, -0.44F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4702F, -8.2599F, 0.0519F, 0.0744F, -1.3694F));

		PartDefinition Bodymiddle_r17 = Bodymiddle.addOrReplaceChild("Bodymiddle_r17", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-3.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4702F, -8.2599F, 0.0785F, 0.0455F, -0.9333F));

		PartDefinition Bodymiddle_r18 = Bodymiddle.addOrReplaceChild("Bodymiddle_r18", CubeListBuilder.create().texOffs(73, 64).mirror().addBox(-8.8133F, -2.5759F, -0.44F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3702F, -6.2599F, 0.0475F, 0.0221F, -1.4045F));

		PartDefinition Bodymiddle_r19 = Bodymiddle.addOrReplaceChild("Bodymiddle_r19", CubeListBuilder.create().texOffs(90, 79).mirror().addBox(-3.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3702F, -6.2599F, 0.0524F, 0.0F, -0.9687F));

		PartDefinition Bodymiddle_r20 = Bodymiddle.addOrReplaceChild("Bodymiddle_r20", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-7.8133F, -2.5759F, -0.44F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3702F, -4.2599F, 0.0475F, 0.0221F, -1.4045F));

		PartDefinition Bodymiddle_r21 = Bodymiddle.addOrReplaceChild("Bodymiddle_r21", CubeListBuilder.create().texOffs(66, 90).mirror().addBox(-3.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3702F, -4.2599F, 0.0524F, 0.0F, -0.9687F));

		PartDefinition Bodymiddle_r22 = Bodymiddle.addOrReplaceChild("Bodymiddle_r22", CubeListBuilder.create().texOffs(14, 44).mirror().addBox(-6.8133F, -2.5759F, -0.44F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3702F, -2.2599F, 0.0475F, 0.0221F, -1.4743F));

		PartDefinition Bodymiddle_r23 = Bodymiddle.addOrReplaceChild("Bodymiddle_r23", CubeListBuilder.create().texOffs(90, 58).mirror().addBox(-3.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3702F, -2.2599F, 0.0524F, 0.0F, -1.0385F));

		PartDefinition Bodymiddle_r24 = Bodymiddle.addOrReplaceChild("Bodymiddle_r24", CubeListBuilder.create().texOffs(91, 41).mirror().addBox(-4.8133F, -2.5759F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3702F, -0.2599F, 0.0417F, -0.0211F, -1.5092F));

		PartDefinition Bodymiddle_r25 = Bodymiddle.addOrReplaceChild("Bodymiddle_r25", CubeListBuilder.create().texOffs(92, 30).mirror().addBox(-3.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3702F, -0.2599F, 0.0289F, -0.0368F, -1.0729F));

		PartDefinition Bodymiddle_r26 = Bodymiddle.addOrReplaceChild("Bodymiddle_r26", CubeListBuilder.create().texOffs(47, 15).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3702F, -0.2599F, 0.012F, -0.0167F, -0.4622F));

		PartDefinition Bodymiddle_r27 = Bodymiddle.addOrReplaceChild("Bodymiddle_r27", CubeListBuilder.create().texOffs(90, 56).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3702F, -2.2599F, 0.0524F, 0.0F, -0.4276F));

		PartDefinition Bodymiddle_r28 = Bodymiddle.addOrReplaceChild("Bodymiddle_r28", CubeListBuilder.create().texOffs(73, 90).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3702F, -4.2599F, 0.0524F, 0.0F, -0.3578F));

		PartDefinition Bodymiddle_r29 = Bodymiddle.addOrReplaceChild("Bodymiddle_r29", CubeListBuilder.create().texOffs(90, 87).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.3702F, -6.2599F, 0.0524F, 0.0F, -0.3578F));

		PartDefinition Bodymiddle_r30 = Bodymiddle.addOrReplaceChild("Bodymiddle_r30", CubeListBuilder.create().texOffs(91, 14).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4702F, -8.2599F, 0.0999F, 0.0223F, -0.3225F));

		PartDefinition Bodymiddle_r31 = Bodymiddle.addOrReplaceChild("Bodymiddle_r31", CubeListBuilder.create().texOffs(91, 28).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5702F, -10.2599F, 0.1475F, 0.0446F, -0.3212F));

		PartDefinition Bodymiddle_r32 = Bodymiddle.addOrReplaceChild("Bodymiddle_r32", CubeListBuilder.create().texOffs(48, 58).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7702F, -12.0599F, 0.1734F, 0.05F, -0.3373F));

		PartDefinition Bodymiddle_r33 = Bodymiddle.addOrReplaceChild("Bodymiddle_r33", CubeListBuilder.create().texOffs(47, 15).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3702F, -0.2599F, 0.012F, 0.0167F, 0.4622F));

		PartDefinition Bodymiddle_r34 = Bodymiddle.addOrReplaceChild("Bodymiddle_r34", CubeListBuilder.create().texOffs(92, 30).addBox(1.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3702F, -0.2599F, 0.0289F, 0.0368F, 1.0729F));

		PartDefinition Bodymiddle_r35 = Bodymiddle.addOrReplaceChild("Bodymiddle_r35", CubeListBuilder.create().texOffs(91, 41).addBox(2.8133F, -2.5759F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3702F, -0.2599F, 0.0417F, 0.0211F, 1.5092F));

		PartDefinition Bodymiddle_r36 = Bodymiddle.addOrReplaceChild("Bodymiddle_r36", CubeListBuilder.create().texOffs(14, 44).addBox(2.8133F, -2.5759F, -0.44F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3702F, -2.2599F, 0.0475F, -0.0221F, 1.4743F));

		PartDefinition Bodymiddle_r37 = Bodymiddle.addOrReplaceChild("Bodymiddle_r37", CubeListBuilder.create().texOffs(90, 58).addBox(1.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3702F, -2.2599F, 0.0524F, 0.0F, 1.0385F));

		PartDefinition Bodymiddle_r38 = Bodymiddle.addOrReplaceChild("Bodymiddle_r38", CubeListBuilder.create().texOffs(90, 56).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3702F, -2.2599F, 0.0524F, 0.0F, 0.4276F));

		PartDefinition Bodymiddle_r39 = Bodymiddle.addOrReplaceChild("Bodymiddle_r39", CubeListBuilder.create().texOffs(73, 90).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3702F, -4.2599F, 0.0524F, 0.0F, 0.3578F));

		PartDefinition Bodymiddle_r40 = Bodymiddle.addOrReplaceChild("Bodymiddle_r40", CubeListBuilder.create().texOffs(66, 90).addBox(1.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3702F, -4.2599F, 0.0524F, 0.0F, 0.9687F));

		PartDefinition Bodymiddle_r41 = Bodymiddle.addOrReplaceChild("Bodymiddle_r41", CubeListBuilder.create().texOffs(0, 11).addBox(2.8133F, -2.5759F, -0.44F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3702F, -4.2599F, 0.0475F, -0.0221F, 1.4045F));

		PartDefinition Bodymiddle_r42 = Bodymiddle.addOrReplaceChild("Bodymiddle_r42", CubeListBuilder.create().texOffs(90, 87).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3702F, -6.2599F, 0.0524F, 0.0F, 0.3578F));

		PartDefinition Bodymiddle_r43 = Bodymiddle.addOrReplaceChild("Bodymiddle_r43", CubeListBuilder.create().texOffs(90, 79).addBox(1.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3702F, -6.2599F, 0.0524F, 0.0F, 0.9687F));

		PartDefinition Bodymiddle_r44 = Bodymiddle.addOrReplaceChild("Bodymiddle_r44", CubeListBuilder.create().texOffs(73, 64).addBox(2.8133F, -2.5759F, -0.44F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3702F, -6.2599F, 0.0475F, -0.0221F, 1.4045F));

		PartDefinition Bodymiddle_r45 = Bodymiddle.addOrReplaceChild("Bodymiddle_r45", CubeListBuilder.create().texOffs(91, 14).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4702F, -8.2599F, 0.0999F, -0.0223F, 0.3225F));

		PartDefinition Bodymiddle_r46 = Bodymiddle.addOrReplaceChild("Bodymiddle_r46", CubeListBuilder.create().texOffs(0, 91).addBox(1.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4702F, -8.2599F, 0.0785F, -0.0455F, 0.9333F));

		PartDefinition Bodymiddle_r47 = Bodymiddle.addOrReplaceChild("Bodymiddle_r47", CubeListBuilder.create().texOffs(75, 50).addBox(2.8133F, -2.5759F, -0.44F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4702F, -8.2599F, 0.0519F, -0.0744F, 1.3694F));

		PartDefinition Bodymiddle_r48 = Bodymiddle.addOrReplaceChild("Bodymiddle_r48", CubeListBuilder.create().texOffs(91, 28).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5702F, -10.2599F, 0.1475F, -0.0446F, 0.3212F));

		PartDefinition Bodymiddle_r49 = Bodymiddle.addOrReplaceChild("Bodymiddle_r49", CubeListBuilder.create().texOffs(91, 16).addBox(1.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5702F, -10.2599F, 0.1047F, -0.091F, 0.9318F));

		PartDefinition Bodymiddle_r50 = Bodymiddle.addOrReplaceChild("Bodymiddle_r50", CubeListBuilder.create().texOffs(63, 39).addBox(2.8133F, -2.5759F, -0.44F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5702F, -10.2599F, 0.0564F, -0.1267F, 1.3693F));

		PartDefinition Bodymiddle_r51 = Bodymiddle.addOrReplaceChild("Bodymiddle_r51", CubeListBuilder.create().texOffs(66, 60).addBox(2.8133F, -2.5759F, -0.44F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7702F, -12.0599F, 0.0648F, -0.1519F, 1.3855F));

		PartDefinition Bodymiddle_r52 = Bodymiddle.addOrReplaceChild("Bodymiddle_r52", CubeListBuilder.create().texOffs(50, 33).addBox(1.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7702F, -12.0599F, 0.123F, -0.1103F, 0.9473F));

		PartDefinition Bodymiddle_r53 = Bodymiddle.addOrReplaceChild("Bodymiddle_r53", CubeListBuilder.create().texOffs(48, 58).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7702F, -12.0599F, 0.1734F, -0.05F, 0.3373F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(12, 58).addBox(-1.0F, -1.0116F, -4.9141F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.7333F, -13.0687F, 0.2132F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(21, 92).addBox(0.0F, -0.9F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0116F, -0.4141F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(49, 92).addBox(0.0F, -0.9F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0116F, -2.4141F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(52, 92).addBox(0.0F, -0.9F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0116F, -4.4141F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Bodyfront.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(83, 29).mirror().addBox(-2.0F, -3.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9722F, 7.0286F, -9.1748F, 0.6656F, 0.084F, 0.4885F));

		PartDefinition cube_r2 = Bodyfront.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(77, 73).mirror().addBox(-0.5F, -2.4F, -1.1F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.853F, 4.6623F, -9.0464F, 0.831F, -0.6695F, -0.0925F));

		PartDefinition cube_r3 = Bodyfront.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.2F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7633F, 2.7009F, -6.2732F, 0.6058F, -0.2877F, 0.41F));

		PartDefinition cube_r4 = Bodyfront.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(15, 66).mirror().addBox(-0.9957F, -2.595F, 1.6781F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.334F, 2.7003F, -5.856F, 0.824F, -0.2877F, 0.41F));

		PartDefinition cube_r5 = Bodyfront.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.2F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7633F, 2.7009F, -6.2732F, 0.6058F, 0.2877F, -0.41F));

		PartDefinition cube_r6 = Bodyfront.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(15, 66).addBox(-0.0043F, -2.595F, 1.6781F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.334F, 2.7003F, -5.856F, 0.824F, 0.2877F, -0.41F));

		PartDefinition cube_r7 = Bodyfront.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(77, 73).addBox(-0.5F, -2.4F, -1.1F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.853F, 4.6623F, -9.0464F, 0.831F, 0.6695F, 0.0925F));

		PartDefinition cube_r8 = Bodyfront.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(83, 29).addBox(-1.0F, -3.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9722F, 7.0286F, -9.1748F, 0.6656F, -0.084F, -0.4885F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(55, 92).addBox(0.0F, -1.1F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8377F, -6.4906F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r54 = Bodyfront.addOrReplaceChild("Bodymiddle_r54", CubeListBuilder.create().texOffs(55, 33).addBox(-3.0F, -1.1025F, -3.1878F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.0F, -2.0F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = Bodyfront.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(58, 92).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5292F, -8.4692F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r6 = Bodyfront.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(68, 92).addBox(0.0F, -1.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4195F, -10.4687F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = Bodyfront.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(48, 48).addBox(-1.0F, -1.4419F, -0.0628F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 1.1592F, -11.6427F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r55 = Bodyfront.addOrReplaceChild("Bodymiddle_r55", CubeListBuilder.create().texOffs(24, 49).mirror().addBox(-4.6383F, -1.1456F, -0.44F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5369F, -10.5912F, 0.3087F, 0.3787F, -1.2509F));

		PartDefinition Bodymiddle_r56 = Bodyfront.addOrReplaceChild("Bodymiddle_r56", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-7.8133F, -2.5759F, -0.44F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2369F, -8.5912F, 0.073F, 0.2124F, -1.4887F));

		PartDefinition Bodymiddle_r57 = Bodyfront.addOrReplaceChild("Bodymiddle_r57", CubeListBuilder.create().texOffs(70, 62).mirror().addBox(-8.8133F, -2.5759F, -0.44F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2369F, -6.5912F, 0.0613F, 0.1259F, -1.4383F));

		PartDefinition Bodymiddle_r58 = Bodyfront.addOrReplaceChild("Bodymiddle_r58", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-3.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2369F, -8.5912F, 0.1564F, 0.1616F, -1.0475F));

		PartDefinition Bodymiddle_r59 = Bodyfront.addOrReplaceChild("Bodymiddle_r59", CubeListBuilder.create().texOffs(26, 77).mirror().addBox(-3.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2369F, -6.5912F, 0.1088F, 0.0883F, -1.0011F));

		PartDefinition Bodymiddle_r60 = Bodyfront.addOrReplaceChild("Bodymiddle_r60", CubeListBuilder.create().texOffs(83, 9).mirror().addBox(-3.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1369F, -4.5912F, 0.0617F, 0.0147F, -0.986F));

		PartDefinition Bodymiddle_r61 = Bodyfront.addOrReplaceChild("Bodymiddle_r61", CubeListBuilder.create().texOffs(35, 52).mirror().addBox(-9.8133F, -2.5759F, -0.44F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1369F, -4.5912F, 0.0498F, 0.0394F, -1.4218F));

		PartDefinition Bodymiddle_r62 = Bodyfront.addOrReplaceChild("Bodymiddle_r62", CubeListBuilder.create().texOffs(85, 62).mirror().addBox(-3.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1369F, -2.5912F, 0.0524F, 0.0F, -0.9687F));

		PartDefinition Bodymiddle_r63 = Bodyfront.addOrReplaceChild("Bodymiddle_r63", CubeListBuilder.create().texOffs(63, 7).mirror().addBox(-9.8133F, -2.5759F, -0.44F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1369F, -2.5912F, 0.0475F, 0.0221F, -1.4045F));

		PartDefinition Bodymiddle_r64 = Bodyfront.addOrReplaceChild("Bodymiddle_r64", CubeListBuilder.create().texOffs(63, 9).mirror().addBox(-9.8133F, -2.5759F, -0.44F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1369F, -0.5912F, 0.0417F, -0.0211F, -1.387F));

		PartDefinition Bodymiddle_r65 = Bodyfront.addOrReplaceChild("Bodymiddle_r65", CubeListBuilder.create().texOffs(90, 48).mirror().addBox(-3.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1369F, -0.5912F, 0.0289F, -0.0368F, -0.9508F));

		PartDefinition Bodymiddle_r66 = Bodyfront.addOrReplaceChild("Bodymiddle_r66", CubeListBuilder.create().texOffs(90, 4).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1369F, -0.5912F, 0.012F, -0.0167F, -0.34F));

		PartDefinition Bodymiddle_r67 = Bodyfront.addOrReplaceChild("Bodymiddle_r67", CubeListBuilder.create().texOffs(89, 70).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1369F, -2.5912F, 0.0524F, 0.0F, -0.3578F));

		PartDefinition Bodymiddle_r68 = Bodyfront.addOrReplaceChild("Bodymiddle_r68", CubeListBuilder.create().texOffs(38, 83).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1369F, -4.5912F, 0.0685F, 0.0067F, -0.3752F));

		PartDefinition Bodymiddle_r69 = Bodyfront.addOrReplaceChild("Bodymiddle_r69", CubeListBuilder.create().texOffs(73, 66).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2369F, -6.5912F, 0.1492F, 0.04F, -0.3908F));

		PartDefinition Bodymiddle_r70 = Bodyfront.addOrReplaceChild("Bodymiddle_r70", CubeListBuilder.create().texOffs(69, 29).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2369F, -8.5912F, 0.23F, 0.0731F, -0.4385F));

		PartDefinition Bodymiddle_r71 = Bodyfront.addOrReplaceChild("Bodymiddle_r71", CubeListBuilder.create().texOffs(12, 66).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5369F, -10.5912F, 0.4757F, 0.1686F, -0.6531F));

		PartDefinition Bodymiddle_r72 = Bodyfront.addOrReplaceChild("Bodymiddle_r72", CubeListBuilder.create().texOffs(24, 49).addBox(1.6383F, -1.1456F, -0.44F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5369F, -10.5912F, 0.3087F, -0.3787F, 1.2509F));

		PartDefinition Bodymiddle_r73 = Bodyfront.addOrReplaceChild("Bodymiddle_r73", CubeListBuilder.create().texOffs(12, 66).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5369F, -10.5912F, 0.4757F, -0.1686F, 0.6531F));

		PartDefinition Bodymiddle_r74 = Bodyfront.addOrReplaceChild("Bodymiddle_r74", CubeListBuilder.create().texOffs(71, 0).addBox(1.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2369F, -8.5912F, 0.1564F, -0.1616F, 1.0475F));

		PartDefinition Bodymiddle_r75 = Bodyfront.addOrReplaceChild("Bodymiddle_r75", CubeListBuilder.create().texOffs(0, 9).addBox(2.8133F, -2.5759F, -0.44F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2369F, -8.5912F, 0.073F, -0.2124F, 1.4887F));

		PartDefinition Bodymiddle_r76 = Bodyfront.addOrReplaceChild("Bodymiddle_r76", CubeListBuilder.create().texOffs(69, 29).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2369F, -8.5912F, 0.23F, -0.0731F, 0.4385F));

		PartDefinition Bodymiddle_r77 = Bodyfront.addOrReplaceChild("Bodymiddle_r77", CubeListBuilder.create().texOffs(26, 77).addBox(1.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2369F, -6.5912F, 0.1088F, -0.0883F, 1.0011F));

		PartDefinition Bodymiddle_r78 = Bodyfront.addOrReplaceChild("Bodymiddle_r78", CubeListBuilder.create().texOffs(70, 62).addBox(2.8133F, -2.5759F, -0.44F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2369F, -6.5912F, 0.0613F, -0.1259F, 1.4383F));

		PartDefinition Bodymiddle_r79 = Bodyfront.addOrReplaceChild("Bodymiddle_r79", CubeListBuilder.create().texOffs(73, 66).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2369F, -6.5912F, 0.1492F, -0.04F, 0.3908F));

		PartDefinition Bodymiddle_r80 = Bodyfront.addOrReplaceChild("Bodymiddle_r80", CubeListBuilder.create().texOffs(38, 83).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1369F, -4.5912F, 0.0685F, -0.0067F, 0.3752F));

		PartDefinition Bodymiddle_r81 = Bodyfront.addOrReplaceChild("Bodymiddle_r81", CubeListBuilder.create().texOffs(83, 9).addBox(1.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1369F, -4.5912F, 0.0617F, -0.0147F, 0.986F));

		PartDefinition Bodymiddle_r82 = Bodyfront.addOrReplaceChild("Bodymiddle_r82", CubeListBuilder.create().texOffs(35, 52).addBox(2.8133F, -2.5759F, -0.44F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1369F, -4.5912F, 0.0498F, -0.0394F, 1.4218F));

		PartDefinition Bodymiddle_r83 = Bodyfront.addOrReplaceChild("Bodymiddle_r83", CubeListBuilder.create().texOffs(89, 70).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1369F, -2.5912F, 0.0524F, 0.0F, 0.3578F));

		PartDefinition Bodymiddle_r84 = Bodyfront.addOrReplaceChild("Bodymiddle_r84", CubeListBuilder.create().texOffs(85, 62).addBox(1.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1369F, -2.5912F, 0.0524F, 0.0F, 0.9687F));

		PartDefinition Bodymiddle_r85 = Bodyfront.addOrReplaceChild("Bodymiddle_r85", CubeListBuilder.create().texOffs(63, 7).addBox(2.8133F, -2.5759F, -0.44F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1369F, -2.5912F, 0.0475F, -0.0221F, 1.4045F));

		PartDefinition Bodymiddle_r86 = Bodyfront.addOrReplaceChild("Bodymiddle_r86", CubeListBuilder.create().texOffs(63, 9).addBox(2.8133F, -2.5759F, -0.44F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1369F, -0.5912F, 0.0417F, 0.0211F, 1.387F));

		PartDefinition Bodymiddle_r87 = Bodyfront.addOrReplaceChild("Bodymiddle_r87", CubeListBuilder.create().texOffs(90, 48).addBox(1.6383F, -1.1456F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1369F, -0.5912F, 0.0289F, 0.0368F, 0.9508F));

		PartDefinition Bodymiddle_r88 = Bodyfront.addOrReplaceChild("Bodymiddle_r88", CubeListBuilder.create().texOffs(90, 4).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1369F, -0.5912F, 0.012F, 0.0167F, 0.34F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4302F, -11.6053F, -0.0006F, 0.3491F, 0.0F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(29, 79).addBox(0.0F, -3.5991F, 1.9394F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 61).addBox(-1.0F, -1.5991F, -2.0606F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7284F, -2.9373F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neck_r2 = Neck.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(0, 55).addBox(0.0F, -1.1F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3187F, -1.8893F, -0.7069F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r89 = Neck.addOrReplaceChild("Bodymiddle_r89", CubeListBuilder.create().texOffs(-1, 97).mirror().addBox(-1.5537F, -0.517F, -2.135F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1062F, 1.0143F, 0.4705F, 0.0909F, -0.6932F));

		PartDefinition Bodymiddle_r90 = Neck.addOrReplaceChild("Bodymiddle_r90", CubeListBuilder.create().texOffs(6, 97).mirror().addBox(-0.4911F, -1.1898F, -3.8404F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1062F, 1.0143F, 0.4757F, 0.1686F, -0.6531F));

		PartDefinition Bodymiddle_r91 = Neck.addOrReplaceChild("Bodymiddle_r91", CubeListBuilder.create().texOffs(6, 97).addBox(-0.5089F, -1.1898F, -3.8404F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(-1, 97).addBox(-0.4463F, -0.517F, -2.135F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1062F, 1.0143F, 0.4757F, -0.1686F, 0.6531F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0527F, -4.0883F, 0.21F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(0.1F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(0, 44).addBox(2.34F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.72F, 0.4732F, -14.0392F, -1.0821F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(88, 50).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(88, 50).addBox(2.94F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.72F, 0.008F, -9.7563F, -1.2566F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(67, 50).mirror().addBox(-0.0014F, -5.9669F, -0.0014F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.8001F, -7.4444F, -0.221F, -0.7201F, 0.1559F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(34, 17).mirror().addBox(-0.2156F, -3.7293F, -0.3278F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.0689F, 1.0457F, -7.1864F, -0.4654F, -0.7201F, 0.1559F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(61, 90).mirror().addBox(-0.52F, -5.3234F, 0.112F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(90, 9).mirror().addBox(-0.53F, -5.3234F, 0.112F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.8001F, -7.4444F, -0.2385F, -0.7201F, 0.1559F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(7, 86).mirror().addBox(-0.4896F, -2.6224F, -0.4855F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.2689F, 0.1457F, -6.3864F, -0.2385F, -0.7201F, 0.1559F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(14, 46).mirror().addBox(-0.5F, -3.5973F, -0.8639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(9, 26).mirror().addBox(-0.5F, -2.9973F, -0.8639F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(14, 46).addBox(6.94F, -3.5973F, -0.8639F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(9, 26).addBox(6.94F, -2.9973F, -0.8639F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.72F, 2.8839F, -1.459F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(24, 51).mirror().addBox(-0.5F, -1.4973F, -0.7639F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false)
				.texOffs(24, 51).addBox(6.94F, -1.4973F, -0.7639F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-3.72F, -0.7161F, -1.559F, 0.3316F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(90, 62).mirror().addBox(-0.5F, -1.7473F, -0.1841F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.201F)).mirror(false)
				.texOffs(90, 62).addBox(6.94F, -1.7473F, -0.1841F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-3.72F, 2.2839F, -3.659F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(78, 82).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(78, 82).addBox(6.94F, -1.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.72F, -1.0207F, -3.1696F, -0.384F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(25, 86).mirror().addBox(-0.5F, -0.216F, -1.7755F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(25, 86).addBox(6.94F, -0.216F, -1.7755F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-3.72F, -1.9207F, -1.9696F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(25, 86).mirror().addBox(-0.4253F, -1.45F, -1.7975F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.47F, -3.3089F, -1.6685F, 0.0F, 0.0349F, 1.5708F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(25, 86).mirror().addBox(-0.4725F, -0.45F, -0.2194F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.47F, -3.3089F, -1.6685F, 0.0F, 0.2269F, 1.5708F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(25, 86).addBox(-0.5275F, -0.45F, -0.2194F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.47F, -3.3089F, -1.6685F, 0.0F, -0.2269F, -1.5708F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(25, 86).addBox(-0.5747F, -1.45F, -1.7975F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.47F, -3.3089F, -1.6685F, 0.0F, -0.0349F, -1.5708F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(0, 34).addBox(-4.0F, 0.0023F, -3.2695F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -3.4771F, -1.8134F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(-3.5F, -0.96F, -2.0038F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 0).addBox(-3.5F, -0.96F, -6.5038F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(87, 0).addBox(2.5F, -0.96F, -2.0038F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.1823F, 0.8573F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(80, 21).mirror().addBox(-3.5F, -4.9555F, -1.9724F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(80, 21).addBox(2.5F, -4.9555F, -1.9724F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 3.1823F, 0.9573F, 0.3578F, 0.0F, 0.0F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(78, 52).mirror().addBox(-3.5F, -4.4F, -1.6F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 52).addBox(2.5F, -4.4F, -1.6F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.2229F, -0.8134F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(90, 9).addBox(-0.47F, -5.3234F, 0.112F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
				.texOffs(61, 90).addBox(-0.48F, -5.3234F, 0.112F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(2.0F, 2.8001F, -7.4444F, -0.2385F, 0.7201F, -0.1559F));

		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(7, 86).addBox(-0.5104F, -2.6224F, -0.4855F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.2689F, 0.1457F, -6.3864F, -0.2385F, 0.7201F, -0.1559F));

		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(34, 17).addBox(-0.7844F, -3.7293F, -0.3278F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.0689F, 1.0457F, -7.1864F, -0.4654F, 0.7201F, -0.1559F));

		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(67, 50).addBox(-1.9986F, -5.9669F, -0.0014F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.8001F, -7.4444F, -0.221F, 0.7201F, -0.1559F));

		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(28, 30).addBox(-4.5F, -4.95F, -0.4507F, 8.0F, 4.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 3.3823F, -5.1427F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Upperjawback = Head.addOrReplaceChild("Upperjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.4677F, -5.0934F, 0.4245F, 0.0F, 0.0F));

		PartDefinition Upperjawback_r1 = Upperjawback.addOrReplaceChild("Upperjawback_r1", CubeListBuilder.create().texOffs(0, 44).addBox(-2.0F, -0.0177F, -4.8148F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.311F, -0.1962F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Upperjawback_r2 = Upperjawback.addOrReplaceChild("Upperjawback_r2", CubeListBuilder.create().texOffs(57, 22).mirror().addBox(-0.8316F, -0.0031F, 0.1244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.529F, -3.7748F, -0.0694F, -0.2096F, 0.0019F));

		PartDefinition Upperjawback_r3 = Upperjawback.addOrReplaceChild("Upperjawback_r3", CubeListBuilder.create().texOffs(86, 75).mirror().addBox(-1.9348F, -0.0542F, 0.8088F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.429F, -2.3748F, -0.1249F, -0.3837F, 0.0129F));

		PartDefinition Upperjawback_r4 = Upperjawback.addOrReplaceChild("Upperjawback_r4", CubeListBuilder.create().texOffs(84, 4).mirror().addBox(-0.5172F, -1.2896F, -0.4137F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.671F, -6.2748F, -0.0353F, -0.157F, 0.0043F));

		PartDefinition Upperjawback_r5 = Upperjawback.addOrReplaceChild("Upperjawback_r5", CubeListBuilder.create().texOffs(90, 33).mirror().addBox(-0.9316F, -0.0031F, 0.3244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.529F, -3.7748F, -0.0718F, -0.3314F, 0.0108F));

		PartDefinition Upperjawback_r6 = Upperjawback.addOrReplaceChild("Upperjawback_r6", CubeListBuilder.create().texOffs(86, 75).addBox(-0.0652F, -0.0542F, 0.8088F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.429F, -2.3748F, -0.1249F, 0.3837F, -0.0129F));

		PartDefinition Upperjawback_r7 = Upperjawback.addOrReplaceChild("Upperjawback_r7", CubeListBuilder.create().texOffs(57, 22).addBox(-0.1684F, -0.0031F, 0.1244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.529F, -3.7748F, -0.0694F, 0.2096F, -0.0019F));

		PartDefinition Upperjawback_r8 = Upperjawback.addOrReplaceChild("Upperjawback_r8", CubeListBuilder.create().texOffs(90, 33).addBox(-0.0684F, -0.0031F, 0.3244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7F, -0.529F, -3.7748F, -0.0718F, 0.3314F, -0.0108F));

		PartDefinition Upperjawback_r9 = Upperjawback.addOrReplaceChild("Upperjawback_r9", CubeListBuilder.create().texOffs(84, 4).addBox(-0.4828F, -1.2896F, -0.4137F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.671F, -6.2748F, -0.0353F, 0.157F, -0.0043F));

		PartDefinition Upperlipback = Upperjawback.addOrReplaceChild("Upperlipback", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 5.65F, -5.9F, -0.2388F, 0.0F, 0.0F));

		PartDefinition Upperlipback_r1 = Upperlipback.addOrReplaceChild("Upperlipback_r1", CubeListBuilder.create().texOffs(53, 58).addBox(-1.99F, -2.0F, 0.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.3F, 0.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition UpperteethbackR = Upperlipback.addOrReplaceChild("UpperteethbackR", CubeListBuilder.create(), PartPose.offsetAndRotation(3.05F, -0.5F, 0.4F, 0.1485F, 0.1061F, 0.0F));

		PartDefinition UpperteethbackR_r1 = UpperteethbackR.addOrReplaceChild("UpperteethbackR_r1", CubeListBuilder.create().texOffs(63, 41).mirror().addBox(1.3F, -0.1F, -1.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 41).addBox(4.78F, -0.1F, -1.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.08F, -0.8F, 1.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Upperjawmiddle = Upperjawback.addOrReplaceChild("Upperjawmiddle", CubeListBuilder.create().texOffs(65, 22).addBox(-2.0F, -4.3F, -3.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 5.73F, -5.6F, -0.2546F, 0.0F, 0.0F));

		PartDefinition Upperjawfront = Upperjawmiddle.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.0F, -4.0F, 0.4245F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r1 = Upperjawfront.addOrReplaceChild("Upperjawfront_r1", CubeListBuilder.create().texOffs(53, 81).addBox(-1.5F, 0.0181F, -2.0726F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -2.7F, 0.672F, 0.0F, 0.0F));

		PartDefinition Upperjawfront_r2 = Upperjawfront.addOrReplaceChild("Upperjawfront_r2", CubeListBuilder.create().texOffs(0, 71).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.2F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Upperfrontteeth = Upperjawfront.addOrReplaceChild("Upperfrontteeth", CubeListBuilder.create().texOffs(92, 18).addBox(-1.5F, -1.0F, 0.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -4.8F, -0.1698F, 0.0F, 0.0F));

		PartDefinition Snoutslope = Upperjawmiddle.addOrReplaceChild("Snoutslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.0F, -4.0F, 0.2175F, 0.0F, 0.0F));

		PartDefinition Snoutslope_r1 = Snoutslope.addOrReplaceChild("Snoutslope_r1", CubeListBuilder.create().texOffs(46, 65).addBox(-1.5F, 0.0F, -3.3F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 3.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Upperlipfront = Upperjawmiddle.addOrReplaceChild("Upperlipfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.0F, -4.0F, -0.1911F, 0.0F, 0.0F));

		PartDefinition Upperlipfront_r1 = Upperlipfront.addOrReplaceChild("Upperlipfront_r1", CubeListBuilder.create().texOffs(36, 56).addBox(-1.5F, 0.1F, -1.3F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(81, 66).addBox(-1.5F, -0.2F, -1.3F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -3.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Upperlipfront_r2 = Upperlipfront.addOrReplaceChild("Upperlipfront_r2", CubeListBuilder.create().texOffs(66, 12).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition UpperteethmidfrontR = Upperlipfront.addOrReplaceChild("UpperteethmidfrontR", CubeListBuilder.create().texOffs(14, 89).addBox(-1.0F, -1.1F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(14, 89).mirror().addBox(-3.1F, -1.1F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.05F, -0.5F, -3.2F, 0.2972F, 0.1274F, 0.0F));

		PartDefinition UpperteethmiddleR = Upperjawmiddle.addOrReplaceChild("UpperteethmiddleR", CubeListBuilder.create().texOffs(29, 79).addBox(-1.2F, -1.4F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(29, 79).mirror().addBox(-4.02F, -1.4F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.6F, -0.9F, -4.0F, 0.0848F, 0.0848F, 0.0F));

		PartDefinition UpperteethmiddleR2 = Upperjawmiddle.addOrReplaceChild("UpperteethmiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.62F, -0.9F, -4.0F, 0.0848F, -0.0848F, 0.0F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create().texOffs(0, 55).addBox(2.0F, -0.1259F, -5.3665F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.0003F))
				.texOffs(0, 78).addBox(2.0F, 0.8741F, -5.3665F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(44, 26).addBox(2.0F, 0.8741F, -3.0665F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 55).mirror().addBox(-4.0F, -0.1259F, -5.3665F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.0003F)).mirror(false)
				.texOffs(0, 78).mirror().addBox(-4.0F, 0.8741F, -5.3665F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(44, 26).mirror().addBox(-4.0F, 0.8741F, -3.0665F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.3323F, 0.4066F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r25 = Lowerjawback.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(46, 7).mirror().addBox(-0.5F, -0.1963F, -0.8058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(46, 7).addBox(6.94F, -0.1963F, -0.8058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.72F, 1.8865F, -4.544F, -1.8588F, 0.0F, 0.0F));

		PartDefinition Head_r26 = Lowerjawback.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(47, 40).mirror().addBox(-0.5F, -0.2669F, -0.8375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false)
				.texOffs(47, 40).addBox(6.94F, -0.2669F, -0.8375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-3.72F, 1.5865F, -3.044F, -1.3526F, 0.0F, 0.0F));

		PartDefinition Head_r27 = Lowerjawback.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-0.5F, -1.7481F, -0.7748F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(34, 0).addBox(6.94F, -1.7481F, -0.7748F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.72F, 1.1865F, -6.544F, -1.9111F, 0.0F, 0.0F));

		PartDefinition Head_r28 = Lowerjawback.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(36, 40).mirror().addBox(-0.5F, -1.5F, -1.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(36, 40).addBox(6.94F, -1.5F, -1.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-3.72F, 1.8865F, -4.344F, -1.6493F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r1 = Lowerjawback.addOrReplaceChild("Lowerjawback_r1", CubeListBuilder.create().texOffs(79, 45).mirror().addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 45).addBox(5.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -0.1259F, -2.3665F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r2 = Lowerjawback.addOrReplaceChild("Lowerjawback_r2", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-1.0F, -0.606F, -4.6808F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 0).addBox(5.0F, -0.606F, -4.6808F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -0.0316F, 1.3705F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r3 = Lowerjawback.addOrReplaceChild("Lowerjawback_r3", CubeListBuilder.create().texOffs(74, 14).mirror().addBox(0.6332F, -0.4929F, -3.8886F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3495F, 0.7157F, 0.3974F, 0.1651F, 0.0569F));

		PartDefinition Lowerjawback_r4 = Lowerjawback.addOrReplaceChild("Lowerjawback_r4", CubeListBuilder.create().texOffs(75, 66).mirror().addBox(-0.6332F, -0.4929F, -3.8886F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3495F, 0.7157F, 0.3974F, -0.1651F, -0.0569F));

		PartDefinition Lowerjawmiddleback = Lowerjawback.addOrReplaceChild("Lowerjawmiddleback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6259F, -5.3665F, 0.1698F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddleback_r1 = Lowerjawmiddleback.addOrReplaceChild("Lowerjawmiddleback_r1", CubeListBuilder.create().texOffs(87, 18).mirror().addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(60, 50).mirror().addBox(-1.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(60, 50).addBox(5.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(87, 18).addBox(4.5F, 0.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.5F, 0.1F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddlefront = Lowerjawmiddleback.addOrReplaceChild("Lowerjawmiddlefront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -3.0F, -0.1061F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddlefront_r1 = Lowerjawmiddlefront.addOrReplaceChild("Lowerjawmiddlefront_r1", CubeListBuilder.create().texOffs(71, 41).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 41).addBox(3.5F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -2.6F, -4.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddlefront.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create().texOffs(42, 82).addBox(1.0F, 0.4F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(42, 82).mirror().addBox(-2.0F, 0.4F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0F, -4.0F, 0.1485F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r1 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r1", CubeListBuilder.create().texOffs(35, 54).addBox(-2.0F, -0.7F, 0.3F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(80, 13).addBox(-2.0F, -0.2F, -0.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.6F, 0.3316F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r2 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r2", CubeListBuilder.create().texOffs(56, 0).mirror().addBox(-0.5F, -0.1F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 0).addBox(2.5F, -0.1F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.5F, -0.5F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Lowerteethfront = Lowerjawfront.addOrReplaceChild("Lowerteethfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.0F, -2.8F, -0.0424F, 0.0F, 0.0F));

		PartDefinition Lowerteethfront_r1 = Lowerteethfront.addOrReplaceChild("Lowerteethfront_r1", CubeListBuilder.create().texOffs(61, 65).addBox(-2.0F, -1.4F, -1.7F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 1.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Lowerteethback = Lowerjawmiddlefront.addOrReplaceChild("Lowerteethback", CubeListBuilder.create().texOffs(34, 7).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -3.6F, -0.0637F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope = Lowerjawback.addOrReplaceChild("Lowerjawslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 3.3741F, -5.3665F, -0.1114F, 0.0F, 0.0F));

		PartDefinition Lowerjawslope_r1 = Lowerjawslope.addOrReplaceChild("Lowerjawslope_r1", CubeListBuilder.create().texOffs(87, 43).mirror().addBox(-0.5F, -2.0F, -3.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(89, 23).mirror().addBox(-1.5F, -2.0F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(87, 43).addBox(4.52F, -2.0F, -3.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(89, 23).addBox(5.52F, -2.0F, -1.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.52F, -0.5F, -0.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Jawparting = Lowerjawback.addOrReplaceChild("Jawparting", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -0.5259F, -3.8665F, -0.2759F, 0.0F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(42, 88).addBox(0.0F, -1.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(34, 76).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(68, 71).addBox(-1.0F, -0.3F, 0.4F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8F, 8.4534F, -8.5172F, 0.8463F, -0.0751F, -0.5434F));

		PartDefinition Leftupperarm_r1 = Leftupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(85, 87).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 2.0F, -2.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(46, 72).addBox(-1.4875F, -0.3496F, -1.2012F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(37, 85).addBox(-0.9881F, -0.3291F, -2.9126F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3194F, 6.5283F, 1.7249F, -0.3082F, 0.2814F, 0.4365F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create().texOffs(19, 40).addBox(-2.5F, -0.5F, -4.5F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4875F, 6.3504F, -2.2012F, -0.3729F, 0.0152F, 0.0623F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(56, 86).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(76, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(19, 17).addBox(-1.0F, -0.3F, 0.4F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.8F, 8.4534F, -8.5172F, -0.0596F, 0.0836F, 0.6744F));

		PartDefinition Rightupperarm_r1 = Rightupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(49, 86).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 2.0F, -2.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(59, 71).addBox(-0.5125F, -0.3496F, -1.2012F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 17).addBox(-0.0119F, -0.3291F, -2.9126F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3194F, 6.5283F, 1.7249F, -0.6572F, -0.2814F, -0.4365F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create().texOffs(34, 17).addBox(-2.5F, -0.5F, -4.5F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4875F, 6.3504F, -2.2012F, 0.5897F, 0.4973F, 0.0809F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -3.8763F, 16.2945F, -0.1482F, 0.1307F, -0.0079F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(92, 37).addBox(0.0F, 1.1113F, 1.9322F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 63).addBox(0.0F, -1.3677F, -1.8281F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 92).addBox(0.0F, 0.0113F, -0.0678F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2023F, 3.9071F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(34, 41).addBox(-1.0F, -0.8F, 0.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1977F, -0.0929F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Neck_r3 = Tailbase.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(83, 92).addBox(0.0F, -1.3472F, 6.0343F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 89).addBox(0.0F, -1.3472F, 4.0343F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 93).addBox(0.0F, -1.3472F, 2.0343F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 92).addBox(0.0F, -1.3472F, 0.0343F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7219F, 1.1815F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(13, 49).addBox(-1.0F, -0.7153F, -0.5964F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.1023F, 7.4071F, -0.0756F, 0.0868F, 0.0086F));

		PartDefinition Tailbase_r3 = Tailmiddlebase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(34, 7).addBox(0.0F, 3.6113F, 5.9322F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 52).addBox(0.0F, 2.4113F, 3.9322F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1847F, -3.4964F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Neck_r4 = Tailmiddlebase.addOrReplaceChild("Neck_r4", CubeListBuilder.create().texOffs(92, 81).addBox(0.0F, -1.3472F, 8.0343F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7395F, -6.222F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(24, 52).addBox(-1.0F, -0.6124F, 0.1106F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0986F, 4.6755F, 0.0364F, 0.1308F, 0.0047F));

		PartDefinition Tailbase_r4 = Tailmiddle.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, 3.7113F, 8.2322F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2876F, -8.1894F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(62, 42).addBox(-0.5F, -0.2914F, -0.4063F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0124F, 5.7106F, 0.2432F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, -0.4945F, 0.074F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2086F, 4.9937F, 0.419F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(37, 63).addBox(-1.0F, -1.9F, -1.8F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -0.0163F, 12.6945F, -0.2343F, 0.1472F, -0.2173F));

		PartDefinition Rightthigh_r1 = Rightthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(85, 35).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, 0.2F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(11, 76).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(71, 81).addBox(-1.0F, 0.0317F, 1.7997F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.08F, -1.1228F, 0.8876F, -0.2295F, 0.167F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create().texOffs(47, 40).addBox(-2.5F, -0.5F, -3.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0035F, 6.9631F, 1.1114F, -0.3704F, 0.0F, 0.0F));

		PartDefinition Righttoes = Rightankle.addOrReplaceChild("Righttoes", CubeListBuilder.create().texOffs(51, 15).addBox(-2.5F, -1.0F, -4.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.49F, -2.8F, 0.0F, 0.0F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -1.9F, -1.8F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -0.0163F, 12.6945F, 0.4639F, -0.1472F, 0.2173F));

		PartDefinition Leftthigh_r1 = Leftthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(18, 85).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, 0.2F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(74, 29).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(64, 81).addBox(-1.0F, 0.0317F, 1.7997F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.08F, -1.1228F, 1.193F, 0.2295F, -0.167F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create().texOffs(47, 7).addBox(-2.5F, -0.5F, -3.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0035F, 6.9631F, 1.1114F, -0.3704F, 0.0F, 0.0F));

		PartDefinition Lefttoes = Leftankle.addOrReplaceChild("Lefttoes", CubeListBuilder.create().texOffs(50, 26).addBox(-2.5F, -1.0F, -4.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.49F, -2.8F, -0.3052F, -0.0131F, -0.0416F));

		return LayerDefinition.create(meshdefinition, 100, 98);
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