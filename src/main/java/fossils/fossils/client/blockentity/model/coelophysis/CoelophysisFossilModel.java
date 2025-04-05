package fossils.fossils.client.blockentity.model.coelophysis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CoelophysisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Neckbase;
	private final ModelPart neck;
	private final ModelPart Neckmiddle;
	private final ModelPart neck2;
	private final ModelPart Neckend;
	private final ModelPart Head;
	private final ModelPart Lowerjawbase;
	private final ModelPart Lowerjawmiddle;
	private final ModelPart Lowerjawfront;
	private final ModelPart Upperjawbase;
	private final ModelPart Upperjawend;
	private final ModelPart Snout;
	private final ModelPart Leftupperfrontteeth;
	private final ModelPart Rightupperfrontteeth;
	private final ModelPart Headslope;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Righthand;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Lefthand;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Tailend2;
	private final ModelPart Tailend3;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Rightankle;
	private final ModelPart Rightfoot;
	private final ModelPart Rightfoot2;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Leftankle;
	private final ModelPart Leftfoot;
	private final ModelPart Leftfoot2;

	public CoelophysisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Neckbase = this.Bodyfront.getChild("Neckbase");
		this.neck = this.Neckbase.getChild("neck");
		this.Neckmiddle = this.neck.getChild("Neckmiddle");
		this.neck2 = this.Neckmiddle.getChild("neck2");
		this.Neckend = this.neck2.getChild("Neckend");
		this.Head = this.Neckend.getChild("Head");
		this.Lowerjawbase = this.Head.getChild("Lowerjawbase");
		this.Lowerjawmiddle = this.Lowerjawbase.getChild("Lowerjawmiddle");
		this.Lowerjawfront = this.Lowerjawmiddle.getChild("Lowerjawfront");
		this.Upperjawbase = this.Head.getChild("Upperjawbase");
		this.Upperjawend = this.Upperjawbase.getChild("Upperjawend");
		this.Snout = this.Upperjawend.getChild("Snout");
		this.Leftupperfrontteeth = this.Upperjawend.getChild("Leftupperfrontteeth");
		this.Rightupperfrontteeth = this.Upperjawend.getChild("Rightupperfrontteeth");
		this.Headslope = this.Upperjawbase.getChild("Headslope");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Righthand = this.Rightlowerarm.getChild("Righthand");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Lefthand = this.Leftlowerarm.getChild("Lefthand");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddleend = this.Tailmiddlebase.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Tailend2 = this.Tailend.getChild("Tailend2");
		this.Tailend3 = this.Tailend2.getChild("Tailend3");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Rightankle = this.Rightshin.getChild("Rightankle");
		this.Rightfoot = this.Rightankle.getChild("Rightfoot");
		this.Rightfoot2 = this.Rightfoot.getChild("Rightfoot2");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Leftankle = this.Leftshin.getChild("Leftankle");
		this.Leftfoot = this.Leftankle.getChild("Leftfoot");
		this.Leftfoot2 = this.Leftfoot.getChild("Leftfoot2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -20.6F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.099F, -0.5318F, -0.0986F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(40, 84).addBox(0.0F, -3.8F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 84).addBox(0.0F, -3.8F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 84).addBox(0.0F, -3.8F, -3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 44).mirror().addBox(-1.5F, -2.6F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 44).addBox(0.5F, -2.6F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 37).addBox(-0.5F, -2.8F, -4.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.9702F, 0.4353F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Basin_r1 = Hips.addOrReplaceChild("Basin_r1", CubeListBuilder.create().texOffs(78, 22).mirror().addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false)
				.texOffs(78, 19).mirror().addBox(-0.5F, -0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.1191F, 4.5251F, 3.3943F, -2.481F, 0.211F, -0.2442F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 67).mirror().addBox(-3.0F, -0.5F, 1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(7, 67).addBox(0.0F, -0.5F, 1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, -0.899F, -1.9682F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(66, 22).mirror().addBox(-0.5F, -0.0682F, -0.0816F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5589F, -1.6841F, -0.2044F, 0.0F, 0.0349F, 0.0F));

		PartDefinition Basin_r2 = Hips.addOrReplaceChild("Basin_r2", CubeListBuilder.create().texOffs(70, 55).mirror().addBox(-0.5F, -2.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(70, 55).addBox(2.5F, -2.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5F, 1.2405F, -2.0869F, -1.405F, 0.0F, 0.0F));

		PartDefinition Basin_r3 = Hips.addOrReplaceChild("Basin_r3", CubeListBuilder.create().texOffs(37, 65).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5607F, 4.6303F, -5.5751F, -0.4779F, 0.0367F, -0.1328F));

		PartDefinition Basin_r4 = Hips.addOrReplaceChild("Basin_r4", CubeListBuilder.create().texOffs(24, 75).mirror().addBox(-0.2098F, 2.2605F, -0.8743F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.8324F, -2.7032F, -0.6886F, -0.0076F, -0.218F));

		PartDefinition Basin_r5 = Hips.addOrReplaceChild("Basin_r5", CubeListBuilder.create().texOffs(73, 4).mirror().addBox(-0.5F, -1.3607F, -0.3588F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.8324F, -2.8032F, -1.405F, 0.0F, -0.3927F));

		PartDefinition Basin_r6 = Hips.addOrReplaceChild("Basin_r6", CubeListBuilder.create().texOffs(23, 68).mirror().addBox(-0.5383F, -0.1372F, -0.6077F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.8324F, -2.7032F, -0.7915F, -0.0134F, -0.3925F));

		PartDefinition Basin_r7 = Hips.addOrReplaceChild("Basin_r7", CubeListBuilder.create().texOffs(73, 16).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.4653F, 1.7808F, 0.3925F, -2.0874F, 0.2601F, -0.1908F));

		PartDefinition Basin_r8 = Hips.addOrReplaceChild("Basin_r8", CubeListBuilder.create().texOffs(68, 72).mirror().addBox(-0.5339F, -4.1421F, -0.3666F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(68, 4).mirror().addBox(-0.5339F, -2.5421F, -0.3666F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.4033F, 0.4998F, -2.4112F, 0.211F, -0.2442F));

		PartDefinition Basin_r9 = Hips.addOrReplaceChild("Basin_r9", CubeListBuilder.create().texOffs(10, 77).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 77).addBox(2.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.8407F, -0.0099F, 0.2356F, 0.0F, 0.0F));

		PartDefinition Basin_r10 = Hips.addOrReplaceChild("Basin_r10", CubeListBuilder.create().texOffs(73, 60).mirror().addBox(-0.5F, -1.5F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(73, 60).addBox(2.5F, -1.5F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5F, 1.457F, -2.58F, -0.7767F, 0.0F, 0.0F));

		PartDefinition Basin_r11 = Hips.addOrReplaceChild("Basin_r11", CubeListBuilder.create().texOffs(62, 35).mirror().addBox(-0.5F, -2.0084F, 0.3452F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 35).addBox(2.5F, -2.0084F, 0.3452F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.8324F, -2.8032F, -0.4102F, 0.0F, 0.0F));

		PartDefinition Basin_r12 = Hips.addOrReplaceChild("Basin_r12", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.5F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(0, 62).addBox(2.5F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.5F, -0.1817F, -0.5575F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(66, 18).mirror().addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.1113F, -0.9127F, -2.8033F, 0.1047F, 0.2094F, 0.0F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(59, 79).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(54, 79).mirror().addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0207F, -1.1777F, -2.3772F, 0.3491F, 0.2094F, 0.0F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(16, 66).mirror().addBox(-0.5F, -0.0682F, -2.2816F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4965F, -1.6841F, 0.0891F, 0.0F, 0.2094F, 0.0F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(34, 80).mirror().addBox(-0.5F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 80).addBox(2.5F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0685F, 2.0652F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.9F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(0, 67).addBox(2.1F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.1F, -1.0037F, 0.0291F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Basin_r13 = Hips.addOrReplaceChild("Basin_r13", CubeListBuilder.create().texOffs(68, 4).addBox(-0.4661F, -2.5421F, -0.3666F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(68, 72).addBox(-0.4661F, -4.1421F, -0.3666F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, 1.4033F, 0.4998F, -2.4112F, -0.211F, 0.2442F));

		PartDefinition Basin_r14 = Hips.addOrReplaceChild("Basin_r14", CubeListBuilder.create().texOffs(78, 22).addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F))
				.texOffs(78, 19).addBox(-0.5F, -0.2F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.1191F, 4.5251F, 3.3943F, -2.481F, -0.211F, 0.2442F));

		PartDefinition Basin_r15 = Hips.addOrReplaceChild("Basin_r15", CubeListBuilder.create().texOffs(73, 16).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.4653F, 1.7808F, 0.3925F, -2.0874F, -0.2601F, 0.1908F));

		PartDefinition Basin_r16 = Hips.addOrReplaceChild("Basin_r16", CubeListBuilder.create().texOffs(23, 68).addBox(-0.4617F, -0.1372F, -0.6077F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, 1.8324F, -2.7032F, -0.7915F, 0.0134F, 0.3925F));

		PartDefinition Basin_r17 = Hips.addOrReplaceChild("Basin_r17", CubeListBuilder.create().texOffs(73, 4).addBox(-0.5F, -1.3607F, -0.3588F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.5F, 1.8324F, -2.8032F, -1.405F, 0.0F, 0.3927F));

		PartDefinition Basin_r18 = Hips.addOrReplaceChild("Basin_r18", CubeListBuilder.create().texOffs(24, 75).addBox(-0.7902F, 2.2605F, -0.8743F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.5F, 1.8324F, -2.7032F, -0.6886F, 0.0076F, 0.218F));

		PartDefinition Basin_r19 = Hips.addOrReplaceChild("Basin_r19", CubeListBuilder.create().texOffs(37, 65).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5607F, 4.6303F, -5.5751F, -0.4779F, -0.0367F, 0.1328F));

		PartDefinition cube_r8 = Hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(66, 22).addBox(-0.5F, -0.0682F, -0.0816F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5589F, -1.6841F, -0.2044F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r9 = Hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(16, 66).addBox(-0.5F, -0.0682F, -2.2816F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4965F, -1.6841F, 0.0891F, 0.0F, -0.2094F, 0.0F));

		PartDefinition cube_r10 = Hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(66, 18).addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.1113F, -0.9127F, -2.8033F, 0.1047F, -0.2094F, 0.0F));

		PartDefinition cube_r11 = Hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(59, 79).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(54, 79).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0207F, -1.1777F, -2.3772F, 0.3491F, -0.2094F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(21, 82).addBox(0.01F, -1.545F, -3.3509F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 83).addBox(0.01F, -1.4553F, -1.3458F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -0.4172F, -3.5662F, 0.0427F, -0.2616F, -0.0111F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(17, 37).addBox(-2.49F, -1.9511F, -0.0172F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.4675F, -8.1727F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Bodymiddle.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(44, 82).mirror().addBox(-1.8817F, -0.4515F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0568F, -0.8079F, 0.012F, 0.1541F, -1.237F));

		PartDefinition cube_r13 = Bodymiddle.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(39, 82).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0568F, -0.8079F, 0.075F, 0.1081F, -0.7638F));

		PartDefinition cube_r14 = Bodymiddle.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(74, 52).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0568F, -2.8079F, 0.1231F, 0.2676F, -1.0915F));

		PartDefinition cube_r15 = Bodymiddle.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(29, 82).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0568F, -2.8079F, 0.2247F, 0.1598F, -0.6216F));

		PartDefinition cube_r16 = Bodymiddle.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(24, 82).mirror().addBox(-3.2375F, -1.8712F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.0432F, -4.8079F, -0.0081F, 0.411F, -1.54F));

		PartDefinition cube_r17 = Bodymiddle.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(81, 37).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.0432F, -4.8079F, 0.3427F, 0.1977F, -0.4959F));

		PartDefinition cube_r18 = Bodymiddle.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(74, 50).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.0432F, -4.8079F, 0.2142F, 0.3536F, -0.9589F));

		PartDefinition cube_r19 = Bodymiddle.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(42, 74).mirror().addBox(-4.2375F, -1.8712F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.1432F, -6.8079F, 0.0231F, 0.53F, -1.491F));

		PartDefinition cube_r20 = Bodymiddle.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(35, 74).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.1432F, -6.8079F, 0.3112F, 0.4368F, -0.8866F));

		PartDefinition cube_r21 = Bodymiddle.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(80, 70).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.1432F, -6.8079F, 0.4625F, 0.2328F, -0.4353F));

		PartDefinition cube_r22 = Bodymiddle.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(53, 42).mirror().addBox(-6.2375F, -1.8712F, -0.5598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2432F, -8.8079F, 0.0429F, 0.5978F, -1.4105F));

		PartDefinition cube_r23 = Bodymiddle.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(73, 32).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2432F, -8.8079F, 0.37F, 0.4827F, -0.7907F));

		PartDefinition cube_r24 = Bodymiddle.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(30, 44).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2432F, -8.8079F, 0.5318F, 0.2514F, -0.3489F));

		PartDefinition cube_r25 = Bodymiddle.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(39, 82).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0568F, -0.8079F, 0.075F, -0.1081F, 0.7638F));

		PartDefinition cube_r26 = Bodymiddle.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(44, 82).addBox(0.8817F, -0.4515F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0568F, -0.8079F, 0.012F, -0.1541F, 1.237F));

		PartDefinition cube_r27 = Bodymiddle.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(29, 82).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0568F, -2.8079F, 0.2247F, -0.1598F, 0.6216F));

		PartDefinition cube_r28 = Bodymiddle.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(74, 52).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0568F, -2.8079F, 0.1231F, -0.2676F, 1.0915F));

		PartDefinition cube_r29 = Bodymiddle.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(74, 50).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.0432F, -4.8079F, 0.2142F, -0.3536F, 0.9589F));

		PartDefinition cube_r30 = Bodymiddle.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(81, 37).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.0432F, -4.8079F, 0.3427F, -0.1977F, 0.4959F));

		PartDefinition cube_r31 = Bodymiddle.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(24, 82).addBox(2.2375F, -1.8712F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.0432F, -4.8079F, -0.0081F, -0.411F, 1.54F));

		PartDefinition cube_r32 = Bodymiddle.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(80, 70).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.1432F, -6.8079F, 0.4625F, -0.2328F, 0.4353F));

		PartDefinition cube_r33 = Bodymiddle.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(35, 74).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.1432F, -6.8079F, 0.3112F, -0.4368F, 0.8866F));

		PartDefinition cube_r34 = Bodymiddle.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(42, 74).addBox(2.2375F, -1.8712F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.1432F, -6.8079F, 0.0231F, -0.53F, 1.491F));

		PartDefinition cube_r35 = Bodymiddle.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(30, 44).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2432F, -8.8079F, 0.5318F, -0.2514F, 0.3489F));

		PartDefinition cube_r36 = Bodymiddle.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(73, 32).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2432F, -8.8079F, 0.37F, -0.4827F, 0.7907F));

		PartDefinition cube_r37 = Bodymiddle.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(53, 42).addBox(2.2375F, -1.8712F, -0.5598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2432F, -8.8079F, 0.0429F, -0.5978F, 1.4105F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(21, 15).addBox(-0.49F, -2.5F, -3.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1892F, -5.8242F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = Bodymiddle.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(18, 82).addBox(0.01F, -1.1513F, 0.0078F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2888F, -5.3589F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodymiddle.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(15, 82).addBox(0.01F, -1.65F, 2.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 8).addBox(0.01F, -1.45F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3392F, -9.7242F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1892F, -9.3242F, 0.0935F, -0.1661F, -0.1028F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(8, 83).addBox(0.01F, -1.65F, -1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 83).addBox(0.01F, -1.55F, -3.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 71).addBox(0.01F, -1.45F, -5.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 10).addBox(-0.49F, -0.75F, -6.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4128F, -0.1452F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r38 = Bodyfront.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(48, 8).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8298F, 5.3816F, -3.2246F, -0.187F, 1.1952F, -0.2026F));

		PartDefinition cube_r39 = Bodyfront.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(29, 79).mirror().addBox(-0.5F, 0.0368F, -0.9458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(29, 79).addBox(4.5F, 0.0368F, -0.9458F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.49F, 0.8105F, -4.6148F, 1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r40 = Bodyfront.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(24, 79).mirror().addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 79).addBox(4.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.49F, 0.6354F, -3.7096F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r41 = Bodyfront.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(78, 72).mirror().addBox(-0.5F, -1.048F, -0.9677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 72).addBox(4.5F, -1.048F, -0.9677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.49F, -0.5904F, -3.308F, 1.693F, 0.0F, 0.0F));

		PartDefinition cube_r42 = Bodyfront.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(78, 64).mirror().addBox(-0.5F, -0.9535F, -0.969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 64).addBox(4.5F, -0.9535F, -0.969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.49F, -0.4656F, -2.4111F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r43 = Bodyfront.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(78, 61).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 61).addBox(4.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.49F, 0.026F, -2.7248F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r44 = Bodyfront.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(12, 75).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8298F, 5.3816F, -3.2246F, 0.5161F, 1.0818F, 0.5736F));

		PartDefinition cube_r45 = Bodyfront.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(14, 70).mirror().addBox(-0.4961F, -0.2265F, 0.0815F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7184F, 5.1556F, -5.8063F, 1.1673F, -0.0017F, 0.0376F));

		PartDefinition cube_r46 = Bodyfront.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(61, 46).mirror().addBox(-0.1F, -0.6F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3612F, 3.5888F, -5.5776F, 0.2235F, -0.5324F, -0.4949F));

		PartDefinition cube_r47 = Bodyfront.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(78, 28).mirror().addBox(-1.3903F, 0.0935F, 3.1522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 28).addBox(3.6097F, 0.0935F, 3.1522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5997F, 2.9212F, -6.028F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Bodyfront.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(57, 30).mirror().addBox(-1.3903F, 0.4976F, 0.1233F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(57, 30).addBox(3.6097F, 0.4976F, 0.1233F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5997F, 2.9212F, -6.028F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Bodyfront.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(53, 44).mirror().addBox(-6.2375F, -1.8712F, -0.5599F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.354F, -5.4837F, 0.0815F, 0.8023F, -1.6491F));

		PartDefinition cube_r50 = Bodyfront.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(75, 2).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.354F, -5.4837F, 0.5437F, 0.6275F, -0.9622F));

		PartDefinition cube_r51 = Bodyfront.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(59, 82).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.354F, -5.4837F, 0.7342F, 0.3224F, -0.5549F));

		PartDefinition cube_r52 = Bodyfront.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(48, 6).mirror().addBox(-7.2375F, -1.8712F, -0.5599F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.254F, -3.4837F, 0.0643F, 0.6831F, -1.4503F));

		PartDefinition cube_r53 = Bodyfront.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.254F, -3.4837F, 0.4436F, 0.5415F, -0.807F));

		PartDefinition cube_r54 = Bodyfront.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(54, 82).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.254F, -3.4837F, 0.6178F, 0.2776F, -0.3789F));

		PartDefinition cube_r55 = Bodyfront.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(49, 82).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -1.4838F, 0.5315F, 0.2525F, -0.3315F));

		PartDefinition cube_r56 = Bodyfront.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(42, 34).mirror().addBox(-7.2375F, -1.8712F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -1.4838F, 0.0415F, 0.598F, -1.3939F));

		PartDefinition cube_r57 = Bodyfront.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(59, 74).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -1.4838F, 0.369F, 0.4836F, -0.7736F));

		PartDefinition Neckend_r1 = Bodyfront.addOrReplaceChild("Neckend_r1", CubeListBuilder.create().texOffs(31, 52).mirror().addBox(-0.0232F, -0.6272F, -0.0189F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 1.349F, -6.5996F, -0.6333F, -0.5736F, 0.1876F));

		PartDefinition cube_r58 = Bodyfront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(59, 82).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.354F, -5.4837F, 0.7342F, -0.3224F, 0.5549F));

		PartDefinition cube_r59 = Bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(75, 2).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.354F, -5.4837F, 0.5437F, -0.6275F, 0.9622F));

		PartDefinition cube_r60 = Bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(53, 44).addBox(2.2375F, -1.8712F, -0.5599F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.354F, -5.4837F, 0.0815F, -0.8023F, 1.6491F));

		PartDefinition cube_r61 = Bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(54, 82).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.254F, -3.4837F, 0.6178F, -0.2776F, 0.3789F));

		PartDefinition cube_r62 = Bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(75, 0).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.254F, -3.4837F, 0.4436F, -0.5415F, 0.807F));

		PartDefinition cube_r63 = Bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(48, 6).addBox(2.2375F, -1.8712F, -0.5599F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.254F, -3.4837F, 0.0643F, -0.6831F, 1.4503F));

		PartDefinition cube_r64 = Bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(49, 82).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -1.4838F, 0.5315F, -0.2525F, 0.3315F));

		PartDefinition cube_r65 = Bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(42, 34).addBox(2.2375F, -1.8712F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -1.4838F, 0.0415F, -0.598F, 1.3939F));

		PartDefinition cube_r66 = Bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(59, 74).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -1.4838F, 0.369F, -0.4836F, 0.7736F));

		PartDefinition cube_r67 = Bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(61, 46).addBox(-0.9F, -0.6F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3812F, 3.5888F, -5.5776F, 0.2235F, 0.5324F, 0.4949F));

		PartDefinition cube_r68 = Bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(14, 70).addBox(-0.5039F, -0.2265F, 0.0815F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7384F, 5.1556F, -5.8063F, 1.1673F, 0.0017F, -0.0376F));

		PartDefinition cube_r69 = Bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(48, 8).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8498F, 5.3816F, -3.2246F, -0.187F, -1.1952F, 0.2026F));

		PartDefinition cube_r70 = Bodyfront.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(12, 75).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8498F, 5.3816F, -3.2246F, 0.5161F, -1.0818F, -0.5736F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(42, 29).addBox(-1.99F, -1.15F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 7.4926F, 0.4261F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Neckend_r2 = Bodyfront.addOrReplaceChild("Neckend_r2", CubeListBuilder.create().texOffs(31, 52).addBox(0.0232F, -0.6272F, -0.0189F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 1.349F, -6.5996F, -0.6333F, 0.5736F, -0.1876F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6012F, -7.0133F, -0.2694F, -0.2711F, -0.1466F));

		PartDefinition Neckbase_r1 = Neckbase.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(27, 84).addBox(0.01F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8614F, -0.059F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Neckbase_r2 = Neckbase.addOrReplaceChild("Neckbase_r2", CubeListBuilder.create().texOffs(24, 84).addBox(0.01F, -1.4987F, 0.4368F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-0.49F, -1.0987F, -0.5632F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0924F, -3.1767F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Neckend_r3 = Neckbase.addOrReplaceChild("Neckend_r3", CubeListBuilder.create().texOffs(57, 19).mirror().addBox(-0.0026F, -0.4313F, -0.0253F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0064F, -0.3895F, -0.2892F, -0.298F, 0.0385F));

		PartDefinition Neckend_r4 = Neckbase.addOrReplaceChild("Neckend_r4", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.0026F, -0.4313F, -0.0253F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.3059F, -2.5621F, -0.3687F, -0.1793F, 0.0076F));

		PartDefinition Neckend_r5 = Neckbase.addOrReplaceChild("Neckend_r5", CubeListBuilder.create().texOffs(57, 19).addBox(0.0026F, -0.4313F, -0.0253F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0064F, -0.3895F, -0.2892F, 0.298F, -0.0385F));

		PartDefinition Neckend_r6 = Neckbase.addOrReplaceChild("Neckend_r6", CubeListBuilder.create().texOffs(0, 56).addBox(0.0026F, -0.4313F, -0.0253F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.3059F, -2.5621F, -0.3687F, 0.1793F, -0.0076F));

		PartDefinition neck = Neckbase.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7848F, -3.5897F, -0.1822F, -0.2518F, -0.033F));

		PartDefinition Neckmiddle_r1 = neck.addOrReplaceChild("Neckmiddle_r1", CubeListBuilder.create().texOffs(0, 84).addBox(0.01F, -0.982F, -1.2524F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(82, 83).addBox(0.01F, -0.982F, -3.2524F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(41, 46).addBox(-0.49F, -0.682F, -4.2524F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1828F, 0.3121F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Neckend_r7 = neck.addOrReplaceChild("Neckend_r7", CubeListBuilder.create().texOffs(53, 36).mirror().addBox(-0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.3149F, -0.8967F, -0.0167F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r8 = neck.addOrReplaceChild("Neckend_r8", CubeListBuilder.create().texOffs(49, 52).mirror().addBox(-0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2964F, -2.8816F, -0.0865F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r9 = neck.addOrReplaceChild("Neckend_r9", CubeListBuilder.create().texOffs(53, 36).addBox(0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.3149F, -0.8967F, -0.0167F, 0.1304F, 0.0115F));

		PartDefinition Neckend_r10 = neck.addOrReplaceChild("Neckend_r10", CubeListBuilder.create().texOffs(49, 52).addBox(0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2964F, -2.8816F, -0.0865F, 0.1304F, 0.0115F));

		PartDefinition Neckmiddle = neck.addOrReplaceChild("Neckmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0499F, -3.9271F, 0.1172F, -0.4184F, -0.2966F));

		PartDefinition Neckmiddle_r2 = Neckmiddle.addOrReplaceChild("Neckmiddle_r2", CubeListBuilder.create().texOffs(83, 72).addBox(0.01F, -0.9828F, -0.4025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(83, 63).addBox(0.01F, -0.9828F, -2.4025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 50).addBox(-0.49F, -0.6828F, -3.4025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.485F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Neckend_r11 = Neckmiddle.addOrReplaceChild("Neckend_r11", CubeListBuilder.create().texOffs(52, 46).mirror().addBox(-0.0008F, -0.3781F, -0.0004F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.404F, -0.8745F, -0.0516F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r12 = Neckmiddle.addOrReplaceChild("Neckend_r12", CubeListBuilder.create().texOffs(40, 52).mirror().addBox(-0.0189F, -0.3958F, -0.1395F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.6443F, -2.6072F, 0.0182F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r13 = Neckmiddle.addOrReplaceChild("Neckend_r13", CubeListBuilder.create().texOffs(52, 46).addBox(0.0008F, -0.3781F, -0.0004F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.404F, -0.8745F, -0.0516F, 0.1304F, 0.0115F));

		PartDefinition Neckend_r14 = Neckmiddle.addOrReplaceChild("Neckend_r14", CubeListBuilder.create().texOffs(40, 52).addBox(0.0189F, -0.3958F, -0.1395F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.6443F, -2.6072F, 0.0182F, 0.1304F, 0.0115F));

		PartDefinition neck2 = Neckmiddle.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6184F, -3.7389F, 0.0646F, -0.5572F, -0.2927F));

		PartDefinition cube_r71 = neck2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(73, 84).addBox(0.01F, -0.9F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 60).addBox(0.01F, -0.9F, -2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 0).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Neckend_r15 = neck2.addOrReplaceChild("Neckend_r15", CubeListBuilder.create().texOffs(61, 5).mirror().addBox(-0.0008F, -0.3542F, -0.0055F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.5171F, -0.9125F, 0.1927F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r16 = neck2.addOrReplaceChild("Neckend_r16", CubeListBuilder.create().texOffs(16, 61).mirror().addBox(-0.0008F, -0.3542F, -0.0055F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 1.2723F, -2.4872F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r17 = neck2.addOrReplaceChild("Neckend_r17", CubeListBuilder.create().texOffs(61, 5).addBox(0.0008F, -0.3542F, -0.0055F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.5171F, -0.9125F, 0.1927F, 0.1304F, 0.0115F));

		PartDefinition Neckend_r18 = neck2.addOrReplaceChild("Neckend_r18", CubeListBuilder.create().texOffs(16, 61).addBox(0.0008F, -0.3542F, -0.0055F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 1.2723F, -2.4872F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition Neckend = neck2.addOrReplaceChild("Neckend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 1.0315F, -2.5258F, 0.4308F, -0.3878F, 0.0989F));

		PartDefinition Neckend_r19 = Neckend.addOrReplaceChild("Neckend_r19", CubeListBuilder.create().texOffs(83, 57).addBox(0.0F, -0.7987F, 0.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(57, 25).addBox(-0.5F, -0.5987F, -0.1332F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.9871F, -2.6603F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Neckend_r20 = Neckend.addOrReplaceChild("Neckend_r20", CubeListBuilder.create().texOffs(23, 63).mirror().addBox(0.0F, -0.4097F, 0.0006F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.825F, -1.8022F, 0.088F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r21 = Neckend.addOrReplaceChild("Neckend_r21", CubeListBuilder.create().texOffs(23, 63).addBox(0.0F, -0.4097F, 0.0006F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.825F, -1.8022F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition Head = Neckend.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.56F, -2.5029F, 0.4569F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(78, 7).mirror().addBox(-0.5F, -0.1604F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(78, 10).mirror().addBox(-0.5F, -0.1604F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(78, 10).addBox(0.5F, -0.1604F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(78, 7).addBox(0.5F, -0.1604F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(69, 37).addBox(-0.5F, 0.0F, 0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(69, 34).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.9F, -2.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(79, 78).mirror().addBox(0.09F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(10, 80).mirror().addBox(0.09F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(80, 54).mirror().addBox(0.09F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(79, 78).addBox(0.61F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(10, 80).addBox(0.61F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(80, 54).addBox(0.61F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.85F, 1.064F, -6.7805F, -1.1868F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(44, 76).mirror().addBox(-0.4F, -0.5359F, -0.4624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(44, 76).addBox(0.5F, -0.5359F, -0.4624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.55F, 0.3252F, -3.2597F, -1.85F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(79, 75).mirror().addBox(-0.4F, -0.2172F, -0.3216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(78, 4).mirror().addBox(-0.4F, 0.9624F, -0.7507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(73, 8).mirror().addBox(-0.4F, -0.6376F, -0.7507F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(79, 75).addBox(0.5F, -0.2172F, -0.3216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(78, 4).addBox(0.5F, 0.9624F, -0.7507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(73, 8).addBox(0.5F, -0.6376F, -0.7507F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.55F, 0.3252F, -3.2597F, -1.0996F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(34, 76).mirror().addBox(-0.4F, 0.1788F, -0.1333F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(34, 76).addBox(0.5F, 0.1788F, -0.1333F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.55F, 0.3252F, -3.2597F, -1.4661F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(74, 79).mirror().addBox(-0.28F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(74, 79).addBox(0.98F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.85F, 0.4029F, -1.9944F, -1.8151F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(64, 76).mirror().addBox(-0.28F, -0.6882F, -0.9693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(54, 76).mirror().addBox(-0.28F, -0.7882F, -1.2693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(54, 76).addBox(0.98F, -0.7882F, -1.2693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(64, 76).addBox(0.98F, -0.6882F, -0.9693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-0.85F, 0.5029F, -2.7944F, -2.7227F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(49, 76).mirror().addBox(-0.28F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(49, 76).addBox(0.98F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.85F, -0.1604F, -1.721F, -1.6581F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.28F, -0.1015F, -0.8651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(0, 78).addBox(0.98F, -0.1015F, -0.8651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-0.85F, -0.1604F, -1.321F, -0.8552F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(75, 47).mirror().addBox(-0.28F, -0.2432F, -0.2421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(75, 47).addBox(0.98F, -0.2432F, -0.2421F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.85F, -0.3861F, -2.401F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(76, 37).mirror().addBox(-0.44F, -0.4681F, -0.4753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(39, 76).mirror().addBox(-0.64F, -0.4681F, -0.4753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(39, 76).addBox(0.9F, -0.4681F, -0.4753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(76, 37).addBox(0.7F, -0.4681F, -0.4753F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-0.63F, 0.0876F, -2.0188F, -1.5359F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(49, 79).mirror().addBox(-0.37F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(39, 79).mirror().addBox(-0.37F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(44, 79).mirror().addBox(-0.37F, -0.4F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(76, 34).mirror().addBox(-0.37F, -0.7F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(76, 34).addBox(1.07F, -0.7F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(49, 79).addBox(1.07F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(44, 79).addBox(1.07F, -0.4F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(39, 79).addBox(1.07F, -0.4F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.85F, 0.3252F, -0.7597F, -1.7977F, 0.0F, 0.0F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(59, 76).mirror().addBox(-1.5F, 0.5839F, -0.703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(59, 76).addBox(-0.1F, 0.5839F, -0.703F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(68, 69).addBox(-1.3F, -0.0161F, -0.903F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.8F, -0.4F, 0.5061F, 0.0F, 0.0F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-1.5F, -1.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(5, 76).addBox(-0.1F, -1.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(0.3F, 1.0086F, -0.2781F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(66, 30).addBox(-1.5F, -1.9961F, -1.0246F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 1.4F, -1.3F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(28, 72).addBox(-1.5F, 0.3123F, -0.9932F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(71, 40).addBox(-1.5F, 0.0123F, -0.9932F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 0.2F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(42, 71).addBox(-1.0F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.7F, -2.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create().texOffs(0, 81).addBox(0.1F, -0.346F, -2.3759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(81, 34).addBox(0.1F, -0.346F, -2.9759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(0, 81).mirror().addBox(-1.1F, -0.346F, -2.3759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(81, 34).mirror().addBox(-1.1F, -0.346F, -2.9759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1333F, -0.0924F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r72 = Lowerjawbase.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(59, 63).mirror().addBox(-0.632F, -0.2829F, 0.9191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9975F, -1.9731F, 0.153F, -0.0547F, 0.0188F));

		PartDefinition cube_r73 = Lowerjawbase.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-0.3222F, -0.6741F, -0.3642F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.9975F, -1.9731F, -0.1535F, -0.3134F, -0.0227F));

		PartDefinition Lowerjawbase_r1 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r1", CubeListBuilder.create().texOffs(78, 25).mirror().addBox(-0.52F, -1.026F, -1.3462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 14).mirror().addBox(-0.5F, -0.826F, -1.7462F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(78, 25).addBox(0.72F, -1.026F, -1.3462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(66, 14).addBox(0.7F, -0.826F, -1.7462F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 0.8926F, -1.1597F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r2 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r2", CubeListBuilder.create().texOffs(69, 79).mirror().addBox(-0.5F, -0.7799F, -0.1734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(69, 79).addBox(0.7F, -0.7799F, -0.1734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 0.5926F, 0.4403F, 0.6458F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r3 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r3", CubeListBuilder.create().texOffs(64, 79).mirror().addBox(-0.5F, -0.2279F, -0.8674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(64, 79).addBox(0.7F, -0.2279F, -0.8674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 0.1836F, -0.3488F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r4 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r4", CubeListBuilder.create().texOffs(80, 67).mirror().addBox(-0.5F, -0.2451F, -0.8352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(80, 67).addBox(0.7F, -0.2451F, -0.8352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.6F, -0.0164F, -0.9488F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r5 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r5", CubeListBuilder.create().texOffs(67, 51).mirror().addBox(-0.5F, -0.7799F, -1.7734F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(67, 51).addBox(0.7F, -0.7799F, -1.7734F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.6F, 0.5926F, 0.4403F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r74 = Lowerjawbase.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(68, 0).addBox(-0.6778F, -0.6741F, -0.3642F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.9975F, -1.9731F, -0.1535F, 0.3134F, 0.0227F));

		PartDefinition cube_r75 = Lowerjawbase.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(59, 63).addBox(-0.368F, -0.2829F, 0.9191F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.9975F, -1.9731F, 0.153F, 0.0547F, -0.0188F));

		PartDefinition Lowerjawmiddle = Lowerjawbase.addOrReplaceChild("Lowerjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.9926F, -2.2597F, -0.0637F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle_r1 = Lowerjawmiddle.addOrReplaceChild("Lowerjawmiddle_r1", CubeListBuilder.create().texOffs(49, 67).mirror().addBox(-1.0F, -0.2734F, -0.1847F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(49, 67).addBox(-0.58F, -0.2734F, -0.1847F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.28F, -0.9F, -2.5F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle_r2 = Lowerjawmiddle.addOrReplaceChild("Lowerjawmiddle_r2", CubeListBuilder.create().texOffs(45, 63).mirror().addBox(-1.0F, -0.3528F, -0.2343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(63, 57).mirror().addBox(-1.0F, -0.1528F, -0.2343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(52, 63).mirror().addBox(-1.2F, -0.1528F, 0.7657F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(45, 63).addBox(-0.58F, -0.3528F, -0.2343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(63, 57).addBox(-0.58F, -0.1528F, -0.2343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F))
				.texOffs(52, 63).addBox(-0.38F, -0.1528F, 0.7657F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.28F, -0.5F, -4.0F, 0.2094F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle_r3 = Lowerjawmiddle.addOrReplaceChild("Lowerjawmiddle_r3", CubeListBuilder.create().texOffs(54, 58).mirror().addBox(-1.0F, -0.7558F, -3.7335F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(45, 58).mirror().addBox(-1.2F, -0.7558F, -2.7335F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(54, 58).addBox(-0.58F, -0.7558F, -3.7335F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F))
				.texOffs(45, 58).addBox(-0.38F, -0.7558F, -2.7335F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.28F, -0.1316F, -0.4252F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle_r4 = Lowerjawmiddle.addOrReplaceChild("Lowerjawmiddle_r4", CubeListBuilder.create().texOffs(78, 16).mirror().addBox(-1.0F, -0.1835F, 0.1164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(78, 13).mirror().addBox(-1.0F, -0.1835F, -0.1836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(78, 16).addBox(-0.18F, -0.1835F, 0.1164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(78, 13).addBox(-0.18F, -0.1835F, -0.1836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.08F, -1.0F, -1.5F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddle.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -5.0F, 0.0424F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r1 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r1", CubeListBuilder.create().texOffs(30, 65).mirror().addBox(-0.5F, -0.3754F, -1.738F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(66, 10).mirror().addBox(-0.5F, -0.1754F, -1.738F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.02F, 0.5519F, 0.9766F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Upperjawbase = Head.addOrReplaceChild("Upperjawbase", CubeListBuilder.create().texOffs(58, 52).addBox(-0.3F, -0.7F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(58, 52).mirror().addBox(-0.7F, -0.7F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -3.83F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r1 = Upperjawbase.addOrReplaceChild("Upperjawbase_r1", CubeListBuilder.create().texOffs(78, 58).mirror().addBox(-0.4F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.4069F, -3.9883F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r2 = Upperjawbase.addOrReplaceChild("Upperjawbase_r2", CubeListBuilder.create().texOffs(78, 40).mirror().addBox(-0.4F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3858F, -3.083F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Upperjawbase_r3 = Upperjawbase.addOrReplaceChild("Upperjawbase_r3", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-0.2F, -0.2F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(80, 31).mirror().addBox(-0.4F, -0.3F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(42, 67).mirror().addBox(-0.4F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(80, 31).addBox(0.0F, -0.3F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(42, 67).addBox(0.0F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3F, 0.0F, 1.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Upperjawend = Upperjawbase.addOrReplaceChild("Upperjawend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -5.0F, -0.1274F, 0.0F, 0.0F));

		PartDefinition Upperjawend_r1 = Upperjawend.addOrReplaceChild("Upperjawend_r1", CubeListBuilder.create().texOffs(80, 43).mirror().addBox(0.1F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(80, 46).mirror().addBox(0.1F, -0.4F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(80, 46).addBox(0.3F, -0.4F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(80, 43).addBox(0.3F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7F, -1.1475F, 1.3681F, 0.096F, 0.0F, 0.0F));

		PartDefinition Upperjawend_r2 = Upperjawend.addOrReplaceChild("Upperjawend_r2", CubeListBuilder.create().texOffs(66, 26).mirror().addBox(0.1F, -1.1F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(66, 26).addBox(0.3F, -1.1F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.7F, -0.8F, 2.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition Snout = Upperjawend.addOrReplaceChild("Snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7F, -0.2F, 0.3183F, 0.0F, 0.0F));

		PartDefinition Leftupperfrontteeth = Upperjawend.addOrReplaceChild("Leftupperfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.5F, -0.0424F, -0.2335F, 0.1485F));

		PartDefinition Rightupperfrontteeth = Upperjawend.addOrReplaceChild("Rightupperfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -0.5F, 0.5F, -0.0424F, 0.2335F, -0.1485F));

		PartDefinition Headslope = Upperjawbase.addOrReplaceChild("Headslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.85F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Headslope_r1 = Headslope.addOrReplaceChild("Headslope_r1", CubeListBuilder.create().texOffs(56, 67).mirror().addBox(-0.9F, -0.9569F, -0.1325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(56, 67).addBox(-0.7F, -0.9569F, -0.1325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3F, 2.3F, -2.6F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Headslope_r2 = Headslope.addOrReplaceChild("Headslope_r2", CubeListBuilder.create().texOffs(66, 61).mirror().addBox(-0.9F, -0.0962F, -1.9696F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(66, 61).addBox(-0.7F, -0.0962F, -1.9696F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.3F, 0.8F, -1.1F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Headslope_r3 = Headslope.addOrReplaceChild("Headslope_r3", CubeListBuilder.create().texOffs(66, 65).mirror().addBox(-0.7F, -0.0626F, 0.0553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(66, 65).addBox(-0.3F, -0.0626F, 0.0553F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.9F, -1.2F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r76 = Headslope.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(30, 46).mirror().addBox(-0.797F, -0.4989F, -3.4639F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5142F, 0.584F, 0.8491F, 0.2361F, -0.146F, -0.0468F));

		PartDefinition cube_r77 = Headslope.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(64, 40).mirror().addBox(-0.8142F, -0.5248F, -0.5054F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5142F, 0.584F, 0.8491F, 0.2316F, 0.5987F, 0.1511F));

		PartDefinition cube_r78 = Headslope.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(30, 46).addBox(-0.203F, -0.4989F, -3.4639F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5142F, 0.584F, 0.8491F, 0.2361F, 0.146F, 0.0468F));

		PartDefinition cube_r79 = Headslope.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(64, 40).addBox(-0.1858F, -0.5248F, -0.5054F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5142F, 0.584F, 0.8491F, 0.2316F, -0.5987F, -0.1511F));

		PartDefinition Headslope_r4 = Headslope.addOrReplaceChild("Headslope_r4", CubeListBuilder.create().texOffs(68, 44).addBox(-1.0F, 0.0339F, -1.3673F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(59, 16).addBox(-1.0F, 0.0339F, -0.9673F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.2094F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(73, 12).addBox(-0.5F, -0.3353F, -0.4912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7639F, 4.6955F, -4.8779F, 0.6392F, 0.1859F, -0.2438F));

		PartDefinition Rightupperarm_r1 = Rightupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(69, 76).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4071F, 0.7634F, -0.5061F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = Rightupperarm.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(19, 73).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.6647F, -0.4912F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7205F, 4.3794F, 0.0748F, -0.8436F, 0.2398F, 0.1911F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(63, 69).addBox(-0.5F, -1.5F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(49, 71).addBox(-0.5F, -1.5F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create().texOffs(31, 58).addBox(-0.9F, 0.1F, -1.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8819F, 2.7246F, 0.0444F, 0.078F, 0.0103F, 0.3153F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(73, 20).addBox(-0.5F, -0.3353F, -0.4912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7439F, 4.6955F, -4.8779F, 0.8573F, -0.1859F, 0.2438F));

		PartDefinition Leftupperarm_r1 = Leftupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(74, 76).addBox(-0.5F, 0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4071F, 0.7634F, -0.5061F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = Leftupperarm.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(73, 24).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.6647F, -0.4912F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7205F, 4.3794F, 0.0748F, -0.8436F, -0.2398F, -0.1911F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(7, 71).addBox(-0.5F, -1.5F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(54, 71).addBox(-0.5F, -1.5F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.3F, 0.0F, 0.0F, -3.1416F, 0.0F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create().texOffs(38, 58).addBox(-0.1F, 0.1F, -1.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8819F, 2.7246F, 0.0444F, 0.078F, -0.0103F, -0.3153F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5F, -0.6302F, -0.0406F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(64, 82).addBox(0.4F, -0.1302F, -0.0406F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 82).addBox(0.3F, -0.1302F, 1.9594F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 82).addBox(0.2F, -0.1302F, 3.9594F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 81).addBox(0.1F, -0.1302F, 5.9594F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 82).mirror().addBox(-1.4F, -0.1302F, -0.0406F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 82).mirror().addBox(-1.3F, -0.1302F, 1.9594F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 82).mirror().addBox(-1.2F, -0.1302F, 3.9594F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 81).mirror().addBox(-1.1F, -0.1302F, 5.9594F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2062F, 2.9334F, 0.1575F, 0.1724F, 0.0272F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(21, 77).addBox(0.0F, 3.8899F, 4.1101F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 77).addBox(0.0F, 1.9899F, 2.1101F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 77).addBox(0.0F, 0.3449F, 0.8051F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 4).addBox(0.0F, -1.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8698F, 1.4594F, 0.829F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = Tailbase.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(83, 14).addBox(0.0F, 0.0F, 8.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 84).addBox(0.0F, -0.2F, 6.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 84).addBox(0.0F, -0.4F, 2.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 11).addBox(0.0F, -0.3F, 4.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1581F, -2.7435F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2569F, 7.8363F, 0.2573F, 0.1689F, 0.0442F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1038F, 0.9873F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r6 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(83, 23).addBox(0.0F, 0.3F, 17.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 17).addBox(0.0F, 0.3F, 15.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 70).addBox(0.0F, 0.2F, 13.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0241F, -13.6156F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(49, 84).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7618F, 12.577F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r8 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(46, 84).addBox(0.0F, -0.6F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 26).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4178F, 8.5905F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r9 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(83, 20).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4004F, 6.5906F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tailmiddlebase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(34, 83).addBox(0.0F, 14.3986F, 14.0028F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 0).addBox(0.0F, 12.4911F, 12.4762F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 46).addBox(0.0F, 11.0836F, 10.9496F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 81).addBox(0.0F, 9.9762F, 9.423F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 49).addBox(0.0F, 8.6687F, 7.8964F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0038F, -9.4127F, 0.829F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddlebase.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4655F, 12.9912F, 0.1667F, 0.3751F, -0.1044F));

		PartDefinition Tailmiddleend_r1 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(58, 84).addBox(0.0F, -0.8F, 6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 84).addBox(0.0F, -0.8F, 4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 84).addBox(0.0F, -0.8F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 49).addBox(0.0F, -0.8F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 26).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0037F, 0.5038F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tailmiddleend.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(67, 84).addBox(0.0F, 20.2004F, 20.5493F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 84).addBox(0.0F, 18.5004F, 18.5493F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 39).addBox(0.0F, 16.9938F, 17.0351F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3963F, -21.8962F, 0.829F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tailmiddleend.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(64, 84).addBox(0.0F, 15.9752F, 15.8571F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4693F, -22.4039F, 0.829F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5101F, 8.8559F, 0.2344F, 0.3698F, -0.0399F));

		PartDefinition Tailend_r1 = Tailend.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3392F, 8.921F, -0.445F, 0.1396F, -0.1138F));

		PartDefinition Tailend_r2 = Tailend2.addOrReplaceChild("Tailend_r2", CubeListBuilder.create().texOffs(21, 26).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2675F, 8.9066F, -0.3341F, 0.2895F, -0.0988F));

		PartDefinition Tailend_r3 = Tailend3.addOrReplaceChild("Tailend_r3", CubeListBuilder.create().texOffs(36, 37).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 0.7994F, -0.8146F, -0.5556F, 0.0594F, 0.1167F));

		PartDefinition Leftthigh_r1 = Rightthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(68, 47).addBox(-1.3F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6637F, 0.6192F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Rightthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(73, 64).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 2.4939F, -0.6654F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r3 = Rightthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(73, 28).addBox(-0.5F, -1.9F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.395F, -0.6506F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r4 = Rightthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(0, 71).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.2268F, 0.1789F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r5 = Rightthigh.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(75, 54).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.4844F, -0.5787F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(21, 50).addBox(-1.0F, -0.8712F, -0.217F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.2283F, 1.9698F, 1.2081F, 0.0F, 0.0F));

		PartDefinition Leftshin_r1 = Rightshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(11, 50).addBox(3.2F, -0.3F, -0.6F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.0F, -0.5712F, 0.483F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Leftshin_r2 = Rightshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(29, 75).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.9049F, -0.0932F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create().texOffs(59, 10).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 8.0916F, -0.049F, -1.0684F, -0.1149F, -0.0629F));

		PartDefinition Rightfoot = Rightankle.addOrReplaceChild("Rightfoot", CubeListBuilder.create().texOffs(29, 10).addBox(-1.9F, -0.4F, -1.7F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0995F, 0.2951F, 0.539F, 0.0F, 0.0F));

		PartDefinition Rightfoot2 = Rightfoot.addOrReplaceChild("Rightfoot2", CubeListBuilder.create().texOffs(42, 19).addBox(-1.9F, -0.4F, -2.9F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0118F, -1.4031F, -0.0021F, 0.0F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 0.7994F, -0.8146F, -0.0784F, -0.0103F, -0.1305F));

		PartDefinition Rightthigh_r1 = Leftthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(28, 69).addBox(-0.7F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6637F, 0.6192F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Leftthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(0, 74).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 2.4939F, -0.6654F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r3 = Leftthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(73, 72).addBox(-0.5F, -1.9F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.395F, -0.6506F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r4 = Leftthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(35, 71).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.2268F, 0.1789F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r5 = Leftthigh.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(75, 68).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.4844F, -0.5787F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(26, 52).addBox(0.0F, -0.8712F, -0.217F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.2283F, 1.9698F, 1.2081F, 0.0F, 0.0F));

		PartDefinition Rightshin_r1 = Leftshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(16, 50).addBox(-4.2F, -0.3F, -0.6F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0F, -0.5712F, 0.483F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Rightshin_r2 = Leftshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(75, 43).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.9049F, -0.0932F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create().texOffs(9, 61).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 8.0916F, -0.049F, -0.8933F, 0.1022F, 0.0819F));

		PartDefinition Leftfoot = Leftankle.addOrReplaceChild("Leftfoot", CubeListBuilder.create().texOffs(0, 46).addBox(-2.1F, -0.4F, -1.7F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0995F, 0.2951F, 0.4953F, 0.0F, 0.0F));

		PartDefinition Leftfoot2 = Leftfoot.addOrReplaceChild("Leftfoot2", CubeListBuilder.create().texOffs(42, 24).addBox(-2.1F, -0.4F, -2.9F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0118F, -1.4031F, -0.4384F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 87, 87);
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