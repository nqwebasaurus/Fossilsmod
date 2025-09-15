package fossils.fossils.client.blockentity.model.pezosiren;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PezosirenFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart neck2;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;

	public PezosirenFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.neck2 = this.chest.getChild("neck2");
		this.leftarm = this.neck2.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightarm = this.neck2.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.bone2 = this.neck2.getChild("bone2");
		this.bone4 = this.neck2.getChild("bone4");
		this.neck = this.neck2.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -12.789F, 15.9842F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(15, 17).addBox(0.0F, -1.6986F, 0.0389F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 65).mirror().addBox(-1.8F, 0.4014F, 4.0389F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 32).mirror().addBox(-2.0F, 0.4014F, 2.0389F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 64).mirror().addBox(-2.5F, 0.4014F, 0.0389F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 65).addBox(-0.2F, 0.4014F, 4.0389F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 32).addBox(0.0F, 0.4014F, 2.0389F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 64).addBox(0.5F, 0.4014F, 0.0389F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.0986F, -0.9611F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.1F, -3.5F, -0.4451F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6868F, 0.8785F, -1.4244F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 43).addBox(-2.7288F, -1.3062F, -0.1814F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7F, 1.2048F, 0.4984F, -0.3548F, -0.6561F, 0.0401F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(43, 10).addBox(-1.5585F, -0.35F, -0.7653F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6296F, 0.0803F, -0.62F, -0.6F, -0.3096F, -0.0709F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(18, 55).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1049F, -2.1505F, -0.9671F, 0.1717F, 0.8414F, 1.91F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(39, 23).addBox(-0.5F, -0.575F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6526F, -1.6957F, -0.4492F, 0.2939F, 0.8414F, 1.91F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 56).addBox(-1.3F, -0.5F, -0.875F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0785F, -3.0208F, -2.2403F, -0.8005F, 0.5616F, -0.2196F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(57, 4).addBox(-0.4054F, -0.4592F, -0.6527F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0655F, -3.1959F, -2.024F, -1.1F, 0.8208F, -0.6807F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(7, 57).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.2443F, -2.9319F, -1.8247F, -1.6186F, 0.9171F, -1.3486F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(41, 16).addBox(-1.2804F, -0.4592F, -0.8277F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0655F, -3.1959F, -2.024F, -1.6752F, 0.9137F, -1.42F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(39, 13).addBox(-1.5F, -0.325F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9459F, 0.1037F, 0.4846F, 2.8537F, 1.1551F, -1.7054F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(59, 42).addBox(-0.7997F, -0.5F, -0.7481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6336F, 0.5979F, 1.5084F, 1.9249F, 1.1912F, -2.2311F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(42, 55).addBox(-0.8516F, -0.5F, -0.6155F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6336F, 0.5979F, 1.5084F, 1.8184F, 1.2042F, -2.3455F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(28, 23).addBox(-1.5F, -0.4F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4298F, -0.9022F, 0.3856F, -1.6762F, 0.7153F, -1.4254F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6868F, 0.8785F, -1.4244F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.2712F, -1.3062F, -0.1814F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 1.2048F, 0.4984F, -0.3548F, 0.6561F, -0.0401F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(43, 10).mirror().addBox(-1.4415F, -0.35F, -0.7653F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6296F, 0.0803F, -0.62F, -0.6F, 0.3096F, 0.0709F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(18, 55).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1049F, -2.1505F, -0.9671F, 0.1717F, -0.8414F, -1.91F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(39, 23).mirror().addBox(-0.5F, -0.575F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6526F, -1.6957F, -0.4492F, 0.2939F, -0.8414F, -1.91F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.7F, -0.5F, -0.875F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0785F, -3.0208F, -2.2403F, -0.8005F, -0.5616F, 0.2196F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(57, 4).mirror().addBox(-1.5946F, -0.4592F, -0.6527F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0655F, -3.1959F, -2.024F, -1.1F, -0.8208F, 0.6807F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(7, 57).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.2443F, -2.9319F, -1.8247F, -1.6186F, -0.9171F, 1.3486F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(41, 16).mirror().addBox(-1.7196F, -0.4592F, -0.8277F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0655F, -3.1959F, -2.024F, -1.6752F, -0.9137F, 1.42F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(39, 13).mirror().addBox(-1.5F, -0.325F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9459F, 0.1037F, 0.4846F, 2.8537F, -1.1551F, 1.7054F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(59, 42).mirror().addBox(-1.2003F, -0.5F, -0.7481F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6336F, 0.5979F, 1.5084F, 1.9249F, -1.1912F, 2.2311F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(42, 55).mirror().addBox(-1.1484F, -0.5F, -0.6155F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6336F, 0.5979F, 1.5084F, 1.8184F, -1.2042F, 2.3455F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(28, 23).mirror().addBox(-1.5F, -0.4F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4298F, -0.9022F, 0.3856F, -1.6762F, -0.7153F, 1.4254F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4F, 0.8556F, -1.4264F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftLeg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(15, 72).addBox(-1.0F, -1.625F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(71, 54).addBox(-1.0F, -0.825F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.5F, 4.1385F, -0.253F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftLeg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(71, 51).addBox(-1.0F, -0.125F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.5F, 3.5116F, -0.623F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftLeg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(59, 55).addBox(-0.5F, -1.1903F, -0.9119F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.3046F, 0.0312F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(12, 62).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0F, 0.9292F, -0.1513F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9689F, -0.6455F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftLeg2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(62, 69).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -0.1023F, 0.2332F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftLeg2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(58, 66).addBox(-1.0F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.0255F, 0.7001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r33 = leftLeg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(67, 59).addBox(-1.0F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.427F, 0.2014F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(49, 55).addBox(-1.5F, -1.7F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, 3.4131F, -0.2404F, -0.1484F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 4.5865F, -0.1836F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftLeg3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(62, 26).addBox(-0.7F, -1.6857F, -1.4115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.5414F, 1.1936F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftLeg3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(43, 64).addBox(-0.8F, 0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.3295F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2012F, 2.5026F, 0.4469F, -0.4702F, 0.1001F, 0.1942F));

		PartDefinition cube_r37 = leftLeg4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(5, 70).addBox(-0.5F, -0.8546F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.2965F, -0.1356F, 0.0606F, 0.4269F, -0.4376F, -0.6421F));

		PartDefinition cube_r38 = leftLeg4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(42, 68).addBox(-0.5F, -0.142F, -0.4429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.2965F, -0.1356F, 0.0606F, 0.0604F, -0.4376F, -0.6421F));

		PartDefinition cube_r39 = leftLeg4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 70).addBox(0.0F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.7965F, 0.09F, -0.0997F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r40 = leftLeg4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(47, 69).addBox(0.0F, -4.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-0.7965F, 3.9751F, -0.4396F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4F, 0.8556F, -1.4264F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r41 = rightLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(72, 26).addBox(0.0F, -1.625F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 72).addBox(0.0F, -0.825F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.5F, 4.1385F, -0.253F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r42 = rightLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(20, 72).addBox(0.0F, -0.125F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5F, 3.5116F, -0.623F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(7, 60).addBox(-0.5F, -1.1903F, -0.9119F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.3046F, 0.0312F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(17, 62).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0F, 0.9292F, -0.1513F, -0.0698F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9689F, -0.6455F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r45 = rightLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(67, 69).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -0.1023F, 0.2332F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(63, 66).addBox(0.0F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.0255F, 0.7001F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightLeg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(27, 69).addBox(0.0F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.427F, 0.2014F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightLeg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(54, 55).addBox(0.5F, -1.7F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, 3.4131F, -0.2404F, -0.1484F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 4.5865F, -0.1836F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightLeg3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(62, 36).addBox(-0.3F, -1.6857F, -1.4115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.5414F, 1.1936F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(27, 65).addBox(-0.2F, 0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.3295F, 0.122F, 0.2793F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2012F, 2.5026F, 0.4469F, -0.4702F, -0.1001F, -0.1942F));

		PartDefinition cube_r51 = rightLeg4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(71, 0).addBox(-0.5F, -0.8546F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.2965F, -0.1356F, 0.0606F, 0.4269F, 0.4376F, 0.6421F));

		PartDefinition cube_r52 = rightLeg4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(69, 29).addBox(-0.5F, -0.142F, -0.4429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-0.2965F, -0.1356F, 0.0606F, 0.0604F, 0.4376F, 0.6421F));

		PartDefinition cube_r53 = rightLeg4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(37, 70).addBox(-1.0F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.7965F, 0.09F, -0.0997F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r54 = rightLeg4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(57, 69).addBox(-1.0F, -4.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.7965F, 3.9751F, -0.4396F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.3096F, -4.4992F, -0.2024F, 0.1283F, -0.0262F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(72, 47).addBox(0.0F, -1.9354F, -0.1789F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4648F, -0.6549F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(73, 65).mirror().addBox(-0.5F, -2.4589F, 3.0958F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 73).mirror().addBox(-0.5F, -2.4589F, 1.0958F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 73).mirror().addBox(-0.5F, -2.1589F, -0.9042F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1648F, -3.8549F, 0.0F, -0.1833F, -1.5708F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(73, 65).addBox(0.5F, -2.4589F, 3.0958F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 73).addBox(0.5F, -2.4589F, 1.0958F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 73).addBox(0.5F, -2.1589F, -0.9042F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1648F, -3.8549F, 0.0F, 0.1833F, 1.5708F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(12, 73).addBox(0.0F, -1.7589F, -0.9042F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1648F, -3.8549F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(3, 73).addBox(0.0F, -0.3F, 2.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8648F, -4.9549F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -0.1513F, 8.7474F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0337F, -13.316F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2701F, -4.7786F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 73).addBox(0.0F, -1.8408F, 0.0224F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.696F, -2.157F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(59, 72).addBox(0.0F, -1.6594F, -0.0812F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.696F, -4.057F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(62, 30).mirror().addBox(-5.1951F, -4.4018F, -0.5058F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4859F, -0.592F, -1.5752F, 0.1865F, 0.4325F, -1.2123F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(53, 40).mirror().addBox(-5.1421F, -1.7731F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4859F, -0.592F, -1.5752F, 0.401F, 0.2494F, -0.5916F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(48, 64).mirror().addBox(-2.7806F, 0.0186F, -0.5058F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4859F, -0.592F, -1.5752F, 0.4657F, -0.0541F, 0.0428F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(53, 38).mirror().addBox(-2.7806F, 0.0186F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0141F, -0.292F, -3.5752F, 0.4832F, -0.0549F, 0.0418F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(9, 48).mirror().addBox(-5.1421F, -1.7731F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0141F, -0.292F, -3.5752F, 0.416F, 0.2591F, -0.5878F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(23, 47).mirror().addBox(-6.1951F, -4.4018F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0141F, -0.292F, -3.5752F, 0.1933F, 0.4488F, -1.2094F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(48, 64).addBox(0.7806F, 0.0186F, -0.5058F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4859F, -0.592F, -1.5752F, 0.4657F, 0.0541F, -0.0428F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(53, 40).addBox(2.142F, -1.7731F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4859F, -0.592F, -1.5752F, 0.401F, -0.2494F, 0.5916F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(62, 30).addBox(3.1951F, -4.4018F, -0.5058F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4859F, -0.592F, -1.5752F, 0.1865F, -0.4325F, 1.2123F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(23, 47).addBox(3.1951F, -4.4018F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0141F, -0.292F, -3.5752F, 0.1933F, -0.4488F, 1.2094F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(9, 48).addBox(2.1421F, -1.7731F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0141F, -0.292F, -3.5752F, 0.416F, -0.2591F, 0.5878F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(53, 38).addBox(-0.2194F, 0.0186F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0141F, -0.292F, -3.5752F, 0.4832F, 0.0549F, -0.0418F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(26, 26).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -5.0F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(53, 36).mirror().addBox(-2.7806F, 0.0186F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3141F, -0.292F, -0.3752F, 0.553F, -0.0577F, 0.0379F));

		PartDefinition cube_r77 = body3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-5.1421F, -1.7731F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3141F, -0.292F, -0.3752F, 0.4767F, 0.2973F, -0.5711F));

		PartDefinition cube_r78 = body3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-6.1951F, -4.4018F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3141F, -0.292F, -0.3752F, 0.2216F, 0.514F, -1.1963F));

		PartDefinition cube_r79 = body3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(72, 38).mirror().addBox(-5.316F, -6.2552F, -0.5058F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3141F, -0.292F, -0.3752F, 0.0138F, 0.5556F, -1.5999F));

		PartDefinition cube_r80 = body3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(64, 21).mirror().addBox(-6.316F, -6.2552F, -0.5058F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.208F, -2.3752F, 0.0132F, 0.573F, -1.6002F));

		PartDefinition cube_r81 = body3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-6.1951F, -4.4018F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.208F, -2.3752F, 0.229F, 0.5302F, -1.1926F));

		PartDefinition cube_r82 = body3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(34, 53).mirror().addBox(-5.1421F, -1.7731F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.208F, -2.3752F, 0.4921F, 0.3067F, -0.5665F));

		PartDefinition cube_r83 = body3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(25, 53).mirror().addBox(-2.7806F, 0.0186F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.208F, -2.3752F, 0.5705F, -0.0583F, 0.0369F));

		PartDefinition cube_r84 = body3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(16, 53).mirror().addBox(-2.9801F, 0.0311F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.908F, -4.3752F, 0.588F, -0.0589F, 0.0359F));

		PartDefinition cube_r85 = body3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(52, 10).mirror().addBox(-5.3029F, -1.8918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.908F, -4.3752F, 0.5076F, 0.316F, -0.5618F));

		PartDefinition cube_r86 = body3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-6.2588F, -4.5913F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.908F, -4.3752F, 0.2365F, 0.5464F, -1.1887F));

		PartDefinition cube_r87 = body3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(64, 12).mirror().addBox(-6.3111F, -6.455F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.908F, -4.3752F, 0.0125F, 0.5905F, -1.6005F));

		PartDefinition cube_r88 = body3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(72, 38).addBox(4.316F, -6.2552F, -0.5058F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3141F, -0.292F, -0.3752F, 0.0138F, -0.5556F, 1.5999F));

		PartDefinition cube_r89 = body3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 48).addBox(3.1951F, -4.4018F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3141F, -0.292F, -0.3752F, 0.2216F, -0.514F, 1.1963F));

		PartDefinition cube_r90 = body3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(50, 0).addBox(2.142F, -1.7731F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3141F, -0.292F, -0.3752F, 0.4767F, -0.2973F, 0.5711F));

		PartDefinition cube_r91 = body3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(53, 36).addBox(-0.2194F, 0.0186F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3141F, -0.292F, -0.3752F, 0.553F, 0.0577F, -0.0379F));

		PartDefinition cube_r92 = body3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(25, 53).addBox(-0.2194F, 0.0186F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, 0.208F, -2.3752F, 0.5705F, 0.0583F, -0.0369F));

		PartDefinition cube_r93 = body3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(34, 53).addBox(2.1421F, -1.7731F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, 0.208F, -2.3752F, 0.4921F, -0.3067F, 0.5665F));

		PartDefinition cube_r94 = body3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 50).addBox(3.1951F, -4.4018F, -0.5058F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, 0.208F, -2.3752F, 0.229F, -0.5302F, 1.1926F));

		PartDefinition cube_r95 = body3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(64, 21).addBox(4.316F, -6.2552F, -0.5058F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, 0.208F, -2.3752F, 0.0132F, -0.573F, 1.6002F));

		PartDefinition cube_r96 = body3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(64, 12).addBox(4.3111F, -6.455F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, 0.908F, -4.3752F, 0.0125F, -0.5905F, 1.6005F));

		PartDefinition cube_r97 = body3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 52).addBox(3.2588F, -4.5913F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, 0.908F, -4.3752F, 0.2365F, -0.5464F, 1.1887F));

		PartDefinition cube_r98 = body3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(52, 10).addBox(2.3029F, -1.8918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, 0.908F, -4.3752F, 0.5076F, -0.316F, 0.5618F));

		PartDefinition cube_r99 = body3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(16, 53).addBox(-0.0199F, 0.0311F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, 0.908F, -4.3752F, 0.588F, 0.0589F, -0.0359F));

		PartDefinition cube_r100 = body3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, 0.0148F, -6.0846F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r101 = body3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(68, 72).addBox(0.0F, -1.8611F, -0.1182F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.496F, -0.857F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r102 = body3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(65, 72).addBox(0.0F, -1.9088F, 0.0394F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.004F, -2.957F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(50, 72).addBox(0.0F, -1.8032F, 0.0915F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.604F, -5.057F, 0.2356F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.4311F, -5.9471F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2732F, -5.7281F, 0.3853F, 0.0809F, 0.0328F));

		PartDefinition cube_r104 = body4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(9, 73).addBox(0.0F, -1.8745F, 0.0098F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4311F, -0.9471F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(6, 73).addBox(0.0F, -1.8501F, 0.0278F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4311F, -2.9471F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(53, 72).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4311F, -4.9471F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(62, 40).mirror().addBox(-6.3111F, -6.455F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.0348F, -0.4471F, 0.023F, 0.2415F, -1.5962F));

		PartDefinition cube_r108 = body4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(50, 51).mirror().addBox(-6.2588F, -4.5913F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.0348F, -0.4471F, 0.1055F, 0.2189F, -1.2384F));

		PartDefinition cube_r109 = body4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(41, 51).mirror().addBox(-5.3029F, -1.8918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.0348F, -0.4471F, 0.2118F, 0.1192F, -0.6264F));

		PartDefinition cube_r110 = body4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(51, 34).mirror().addBox(-2.9801F, 0.0311F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.0348F, -0.4471F, 0.2388F, -0.0431F, 0.0539F));

		PartDefinition cube_r111 = body4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(51, 32).mirror().addBox(-7.3111F, -6.455F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, -0.0652F, -2.4471F, 0.0226F, 0.259F, -1.5964F));

		PartDefinition cube_r112 = body4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(32, 51).mirror().addBox(-6.2588F, -4.5913F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, -0.0652F, -2.4471F, 0.1114F, 0.2354F, -1.237F));

		PartDefinition cube_r113 = body4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(50, 45).mirror().addBox(-5.3029F, -1.8918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, -0.0652F, -2.4471F, 0.2261F, 0.1294F, -0.6246F));

		PartDefinition cube_r114 = body4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(50, 43).mirror().addBox(-2.9801F, 0.0311F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, -0.0652F, -2.4471F, 0.2563F, -0.0441F, 0.0531F));

		PartDefinition cube_r115 = body4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(50, 19).mirror().addBox(-7.3111F, -6.455F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, -0.0652F, -4.4471F, 0.0226F, 0.259F, -1.5964F));

		PartDefinition cube_r116 = body4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(50, 17).mirror().addBox(-6.2588F, -4.5913F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, -0.0652F, -4.4471F, 0.1114F, 0.2354F, -1.237F));

		PartDefinition cube_r117 = body4.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(50, 15).mirror().addBox(-5.3029F, -1.8918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, -0.0652F, -4.4471F, 0.2261F, 0.1294F, -0.6246F));

		PartDefinition cube_r118 = body4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(50, 8).mirror().addBox(-2.9801F, 0.0311F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, -0.0652F, -4.4471F, 0.2563F, -0.0441F, 0.0531F));

		PartDefinition cube_r119 = body4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(51, 34).addBox(-0.0199F, 0.0311F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, 0.0348F, -0.4471F, 0.2388F, 0.0431F, -0.0539F));

		PartDefinition cube_r120 = body4.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(41, 51).addBox(2.3029F, -1.8918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, 0.0348F, -0.4471F, 0.2118F, -0.1192F, 0.6264F));

		PartDefinition cube_r121 = body4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(50, 51).addBox(3.2588F, -4.5913F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, 0.0348F, -0.4471F, 0.1055F, -0.2189F, 1.2384F));

		PartDefinition cube_r122 = body4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(62, 40).addBox(4.3111F, -6.455F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, 0.0348F, -0.4471F, 0.023F, -0.2415F, 1.5962F));

		PartDefinition cube_r123 = body4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(50, 43).addBox(-0.0199F, 0.0311F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, -0.0652F, -2.4471F, 0.2563F, 0.0441F, -0.0531F));

		PartDefinition cube_r124 = body4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(50, 45).addBox(2.3029F, -1.8918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, -0.0652F, -2.4471F, 0.2261F, -0.1294F, 0.6246F));

		PartDefinition cube_r125 = body4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(32, 51).addBox(3.2588F, -4.5913F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, -0.0652F, -2.4471F, 0.1114F, -0.2354F, 1.237F));

		PartDefinition cube_r126 = body4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(51, 32).addBox(4.3111F, -6.455F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, -0.0652F, -2.4471F, 0.0226F, -0.259F, 1.5964F));

		PartDefinition cube_r127 = body4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(50, 19).addBox(4.3111F, -6.455F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, -0.0652F, -4.4471F, 0.0226F, -0.259F, 1.5964F));

		PartDefinition cube_r128 = body4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(50, 17).addBox(3.2588F, -4.5913F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, -0.0652F, -4.4471F, 0.1114F, -0.2354F, 1.237F));

		PartDefinition cube_r129 = body4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(50, 15).addBox(2.3029F, -1.8918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, -0.0652F, -4.4471F, 0.2261F, -0.1294F, 0.6246F));

		PartDefinition cube_r130 = body4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(50, 8).addBox(-0.0199F, 0.0311F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, -0.0652F, -4.4471F, 0.2563F, 0.0441F, -0.0531F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0617F, -5.8465F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(71, 73).addBox(0.0F, -2.2226F, -0.0168F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2508F, -1.0096F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(72, 69).addBox(0.0F, -2.0222F, -0.0133F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6508F, -2.9096F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(47, 72).addBox(0.0F, -2.0352F, -0.2076F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4508F, -4.6096F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(64, 57).mirror().addBox(-6.3234F, -5.9554F, -0.5145F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2142F, 1.573F, -4.2006F, 0.0144F, 0.5381F, -1.5996F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(50, 2).mirror().addBox(-4.9007F, -1.5951F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2142F, 1.573F, -4.2006F, 0.4614F, 0.2878F, -0.5755F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(48, 22).mirror().addBox(-6.0996F, -4.1175F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2142F, 1.573F, -4.2006F, 0.2143F, 0.4977F, -1.1998F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(9, 55).mirror().addBox(-2.4813F, -0.0001F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2142F, 1.573F, -4.2006F, 0.5356F, -0.057F, 0.0389F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(64, 55).mirror().addBox(-6.3234F, -5.9554F, -0.5145F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7141F, 0.773F, -2.3006F, 0.0166F, 0.4683F, -1.5985F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-4.9007F, -1.5951F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7141F, 0.773F, -2.3006F, 0.401F, 0.2494F, -0.5916F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(48, 13).mirror().addBox(-6.0996F, -4.1175F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7141F, 0.773F, -2.3006F, 0.1865F, 0.4325F, -1.2123F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(52, 53).mirror().addBox(-2.4813F, -0.0001F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7141F, 0.773F, -2.3006F, 0.4657F, -0.0541F, 0.0428F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(55, 64).mirror().addBox(-6.3111F, -6.455F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.073F, -0.5006F, 0.0177F, 0.4335F, -1.598F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(53, 49).mirror().addBox(-6.2588F, -4.5913F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.073F, -0.5006F, 0.1732F, 0.3998F, -1.2177F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(53, 47).mirror().addBox(-5.3029F, -1.8918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.073F, -0.5006F, 0.3713F, 0.2298F, -0.5986F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(43, 53).mirror().addBox(-2.9801F, 0.0311F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.073F, -0.5006F, 0.4308F, -0.0526F, 0.0446F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(9, 55).addBox(-0.5187F, -0.0001F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2142F, 1.573F, -4.2006F, 0.5356F, 0.057F, -0.0389F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(48, 22).addBox(3.0996F, -4.1175F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2142F, 1.573F, -4.2006F, 0.2143F, -0.4977F, 1.1998F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(50, 2).addBox(1.9007F, -1.5951F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2142F, 1.573F, -4.2006F, 0.4614F, -0.2878F, 0.5755F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(64, 57).addBox(4.3234F, -5.9554F, -0.5145F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2142F, 1.573F, -4.2006F, 0.0144F, -0.5381F, 1.5996F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(52, 53).addBox(-0.5187F, -0.0001F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7141F, 0.773F, -2.3006F, 0.4657F, 0.0541F, -0.0428F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(48, 13).addBox(3.0996F, -4.1175F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7141F, 0.773F, -2.3006F, 0.1865F, -0.4325F, 1.2123F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 54).addBox(1.9007F, -1.5951F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7141F, 0.773F, -2.3006F, 0.401F, -0.2494F, 0.5916F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(64, 55).addBox(4.3234F, -5.9554F, -0.5145F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7141F, 0.773F, -2.3006F, 0.0166F, -0.4683F, 1.5985F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(43, 53).addBox(-0.0199F, 0.0311F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, 0.073F, -0.5006F, 0.4308F, 0.0526F, -0.0446F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(53, 47).addBox(2.3029F, -1.8918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, 0.073F, -0.5006F, 0.3713F, -0.2298F, 0.5986F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(53, 49).addBox(3.2588F, -4.5913F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, 0.073F, -0.5006F, 0.1732F, -0.3998F, 1.2177F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(55, 64).addBox(4.3111F, -6.455F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5141F, 0.073F, -0.5006F, 0.0177F, -0.4335F, 1.598F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -1.908F, 4.84F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.9508F, -9.7096F, 0.3403F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0258F, -5.4096F, 0.7437F, 0.0643F, 0.059F));

		PartDefinition cube_r159 = neck2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(72, 43).addBox(0.0F, -1.0489F, -1.9609F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 39).addBox(0.0F, -1.4489F, 0.0391F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6185F, -1.0478F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r160 = neck2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(32, 6).mirror().addBox(-6.0996F, -4.1175F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9859F, -0.2528F, -2.591F, -0.0155F, -0.1366F, -1.2434F));

		PartDefinition cube_r161 = neck2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(61, 10).mirror().addBox(-2.4813F, -0.0001F, -0.5145F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9859F, -0.2528F, -2.591F, -0.1359F, -0.0204F, 0.0659F));

		PartDefinition cube_r162 = neck2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(44, 37).mirror().addBox(-4.9007F, -1.5951F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9859F, -0.2528F, -2.591F, -0.0913F, -0.1029F, -0.6289F));

		PartDefinition cube_r163 = neck2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(62, 24).mirror().addBox(-2.4813F, -0.0001F, -0.5145F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1858F, -0.0528F, -0.591F, -0.1359F, -0.0204F, 0.0659F));

		PartDefinition cube_r164 = neck2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-6.0996F, -4.1175F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1858F, -0.0528F, -0.591F, -0.0155F, -0.1366F, -1.2434F));

		PartDefinition cube_r165 = neck2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(44, 41).mirror().addBox(-4.9007F, -1.5951F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1858F, -0.0528F, -0.591F, -0.0913F, -0.1029F, -0.6289F));

		PartDefinition cube_r166 = neck2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(71, 57).mirror().addBox(-5.3234F, -5.9554F, -0.5145F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1858F, -0.0528F, -0.591F, 0.0324F, -0.1336F, -1.5957F));

		PartDefinition cube_r167 = neck2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(44, 37).addBox(1.9007F, -1.5951F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9859F, -0.2528F, -2.591F, -0.0913F, 0.1029F, 0.6289F));

		PartDefinition cube_r168 = neck2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(61, 10).addBox(0.4813F, -0.0001F, -0.5145F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9859F, -0.2528F, -2.591F, -0.1359F, 0.0204F, -0.0659F));

		PartDefinition cube_r169 = neck2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(32, 6).addBox(3.0996F, -4.1175F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9859F, -0.2528F, -2.591F, -0.0155F, 0.1366F, 1.2434F));

		PartDefinition cube_r170 = neck2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(71, 57).addBox(4.3234F, -5.9554F, -0.5145F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1858F, -0.0528F, -0.591F, 0.0324F, 0.1336F, 1.5957F));

		PartDefinition cube_r171 = neck2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(44, 41).addBox(1.9007F, -1.5951F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1858F, -0.0528F, -0.591F, -0.0913F, 0.1029F, 0.6289F));

		PartDefinition cube_r172 = neck2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 46).addBox(3.0996F, -4.1175F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1858F, -0.0528F, -0.591F, -0.0155F, 0.1366F, 1.2434F));

		PartDefinition cube_r173 = neck2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(62, 24).addBox(0.4813F, -0.0001F, -0.5145F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1858F, -0.0528F, -0.591F, -0.1359F, 0.0204F, -0.0659F));

		PartDefinition cube_r174 = neck2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5F, -0.2F, 1.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0131F, -5.7998F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftarm = neck2.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6F, 2.4283F, -5.4794F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r175 = leftarm.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(62, 47).addBox(-1.0F, -0.175F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4897F, -0.1231F, 0.9712F, 0.1832F, 0.0014F, -0.001F));

		PartDefinition cube_r176 = leftarm.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(32, 47).addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0104F, 0.367F, 0.5131F, -0.2881F, 0.0014F, -0.001F));

		PartDefinition cube_r177 = leftarm.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(28, 61).addBox(-0.01F, -1.0076F, 0.0046F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.5673F, 0.0378F, 0.5671F, 0.0014F, -0.001F));

		PartDefinition cube_r178 = leftarm.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(68, 66).addBox(-1.0F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 3.1217F, 1.3971F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r179 = leftarm.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, -1.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 2.4381F, 1.3788F, 0.5149F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 3.7481F, 1.8633F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r180 = leftarm2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(67, 37).addBox(-0.5F, 0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2236F, 0.6123F, -0.2441F, 1.5708F, 0.8988F, -1.5708F));

		PartDefinition cube_r181 = leftarm2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(66, 18).addBox(-0.6F, -0.875F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1764F, 0.3539F, 0.6201F, 1.5708F, -0.3665F, -1.5708F));

		PartDefinition cube_r182 = leftarm2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(23, 44).addBox(-0.9006F, -0.0799F, -0.9596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.136F, 3.0829F, 0.7783F, 1.5708F, -1.0472F, -1.5708F));

		PartDefinition cube_r183 = leftarm2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(66, 7).addBox(-0.1006F, 1.1201F, -0.9596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(47, 60).addBox(-0.1006F, -0.2799F, -0.9596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.136F, 2.0576F, -0.236F, 1.5708F, -1.3788F, -1.5708F));

		PartDefinition cube_r184 = leftarm2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(60, 32).addBox(-0.9256F, -0.3799F, -0.9596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.136F, 0.3059F, 0.4435F, 1.5708F, -1.501F, -1.5708F));

		PartDefinition cube_r185 = leftarm2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(32, 55).addBox(-0.5429F, -1.0715F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.7764F, 1.2922F, -0.3512F, 1.5708F, -1.3963F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 4.1969F, 0.4286F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r186 = leftArm3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(71, 15).addBox(0.2F, -0.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6775F, 0.8301F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r187 = leftArm3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(39, 47).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9522F, -0.3133F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r188 = leftArm4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(55, 24).addBox(0.0F, -1.2F, 0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, -0.1399F, -1.0907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7507F, -1.4271F, -0.0349F, 0.0F, 0.0F));

		PartDefinition rightarm = neck2.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6F, 2.4283F, -5.4794F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r189 = rightarm.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(62, 60).addBox(0.0F, -0.175F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4897F, -0.1231F, 0.9712F, 0.1832F, -0.0014F, 0.001F));

		PartDefinition cube_r190 = rightarm.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(48, 24).addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0104F, 0.367F, 0.5131F, -0.2881F, -0.0014F, 0.001F));

		PartDefinition cube_r191 = rightarm.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(33, 61).addBox(-0.99F, -1.0076F, 0.0046F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.5673F, 0.0378F, 0.5671F, -0.0014F, 0.001F));

		PartDefinition cube_r192 = rightarm.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(32, 69).addBox(0.0F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 3.1217F, 1.3971F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r193 = rightarm.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(66, 14).addBox(0.0F, -1.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.4381F, 1.3788F, 0.5149F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 3.7481F, 1.8633F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r194 = rightarm2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(67, 48).addBox(-0.5F, 0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2236F, 0.6123F, -0.2441F, 1.5708F, -0.8988F, 1.5708F));

		PartDefinition cube_r195 = rightarm2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(22, 66).addBox(-0.4F, -0.875F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1764F, 0.3539F, 0.6201F, 1.5708F, 0.3665F, 1.5708F));

		PartDefinition cube_r196 = rightarm2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(66, 0).addBox(-0.0994F, -0.0799F, -0.9596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.136F, 3.0829F, 0.7783F, 1.5708F, 1.0472F, 1.5708F));

		PartDefinition cube_r197 = rightarm2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(17, 66).addBox(-0.8994F, 1.1201F, -0.9596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(57, 60).addBox(-0.8994F, -0.2799F, -0.9596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.136F, 2.0576F, -0.236F, 1.5708F, 1.3788F, 1.5708F));

		PartDefinition cube_r198 = rightarm2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(52, 60).addBox(-0.0744F, -0.3799F, -0.9596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.136F, 0.3059F, 0.4435F, 1.5708F, 1.501F, 1.5708F));

		PartDefinition cube_r199 = rightarm2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(37, 55).addBox(-0.4571F, -1.0715F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7764F, 1.2922F, -0.3512F, 1.5708F, 1.3963F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 4.1969F, 0.4286F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r200 = rightArm3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(71, 18).addBox(-1.2F, -0.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6775F, 0.8301F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r201 = rightArm3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(48, 28).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9522F, -0.3133F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r202 = rightArm4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(25, 55).addBox(-2.0F, -1.2F, 0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0F, -0.1399F, -1.0907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7507F, -1.4271F, -0.0349F, 0.0F, 0.0F));

		PartDefinition bone2 = neck2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.178F, 0.8534F, -1.1951F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r203 = bone2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(25, 49).addBox(-0.5F, -0.225F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.6233F, -0.9095F, -0.7482F, 0.3095F, 0.169F, -0.3803F));

		PartDefinition cube_r204 = bone2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(46, 47).addBox(-1.5272F, -0.1447F, -1.9633F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0232F, -2.3318F, -0.4959F, 0.7633F, 0.169F, -0.3803F));

		PartDefinition cube_r205 = bone2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(30, 8).addBox(-1.6F, 0.0F, -2.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5698F, -0.4149F, -1.7751F, 0.9142F, -0.2656F, -0.2024F));

		PartDefinition cube_r206 = bone2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(37, 67).addBox(-0.5F, -1.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(38, 63).addBox(-0.5F, -0.7F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.4107F, 0.2756F, -2.1692F, 2.9275F, 0.169F, -0.3803F));

		PartDefinition cube_r207 = bone2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.3421F, 0.828F, -2.9975F, 0.9117F, 0.169F, -0.3803F));

		PartDefinition cube_r208 = bone2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(43, 5).addBox(-1.5272F, -1.2507F, 1.2063F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.2643F, 0.169F, -0.3803F));

		PartDefinition cube_r209 = bone2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(18, 49).addBox(-1.5272F, -2.3715F, 0.3727F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.252F, 0.169F, -0.3803F));

		PartDefinition bone4 = neck2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.178F, 0.8534F, -1.1951F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r210 = bone4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(25, 49).mirror().addBox(-0.5F, -0.225F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.6233F, -0.9095F, -0.7482F, 0.3095F, -0.169F, 0.3803F));

		PartDefinition cube_r211 = bone4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(46, 47).mirror().addBox(0.5272F, -0.1447F, -1.9633F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0232F, -2.3318F, -0.4959F, 0.7633F, -0.169F, 0.3803F));

		PartDefinition cube_r212 = bone4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(30, 8).mirror().addBox(-0.4F, 0.0F, -2.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5698F, -0.4149F, -1.7751F, 0.9142F, 0.2656F, 0.2024F));

		PartDefinition cube_r213 = bone4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(37, 67).mirror().addBox(-0.5F, -1.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(38, 63).mirror().addBox(-0.5F, -0.7F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.4107F, 0.2756F, -2.1692F, 2.9275F, -0.169F, 0.3803F));

		PartDefinition cube_r214 = bone4.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.3421F, 0.828F, -2.9975F, 0.9117F, -0.169F, 0.3803F));

		PartDefinition cube_r215 = bone4.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(43, 5).mirror().addBox(0.5272F, -1.2507F, 1.2063F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.2643F, -0.169F, 0.3803F));

		PartDefinition cube_r216 = bone4.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(18, 49).mirror().addBox(0.5272F, -2.3715F, 0.3727F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.252F, -0.169F, 0.3803F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2504F, -3.8694F, -0.5078F, 0.0763F, -0.0424F));

		PartDefinition cube_r217 = neck.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(56, 72).addBox(0.0F, -1.0828F, -0.0159F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6196F, -1.173F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r218 = neck.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(59, 45).mirror().addBox(-5.0996F, -4.1175F, -0.5145F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4858F, -0.1023F, -0.6216F, 0.1571F, 0.3588F, -1.2236F));

		PartDefinition cube_r219 = neck.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(71, 21).mirror().addBox(-2.4813F, -0.0001F, -0.5145F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4858F, -0.1023F, -0.6216F, 0.3871F, -0.0506F, 0.0469F));

		PartDefinition cube_r220 = neck.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(44, 39).mirror().addBox(-4.9007F, -1.5951F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4858F, -0.1023F, -0.6216F, 0.3344F, 0.2051F, -0.6066F));

		PartDefinition cube_r221 = neck.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(44, 39).addBox(1.9007F, -1.5951F, -0.5145F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4858F, -0.1023F, -0.6216F, 0.3344F, -0.2051F, 0.6066F));

		PartDefinition cube_r222 = neck.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(59, 45).addBox(3.0996F, -4.1175F, -0.5145F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4858F, -0.1023F, -0.6216F, 0.1571F, -0.3588F, 1.2236F));

		PartDefinition cube_r223 = neck.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(71, 21).addBox(1.4813F, -0.0001F, -0.5145F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4858F, -0.1023F, -0.6216F, 0.3871F, 0.0506F, -0.0469F));

		PartDefinition cube_r224 = neck.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(50, 4).addBox(-0.5F, -0.6166F, -0.4594F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0305F, -1.6993F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(13, 26).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0852F, -1.9688F, -0.0538F, 0.0787F, -0.0376F));

		PartDefinition cube_r225 = neck3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(62, 72).addBox(0.0F, -1.519F, -0.0353F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6244F, -0.9688F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r226 = neck3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(42, 58).addBox(0.0F, -1.6041F, -2.2284F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9244F, -1.7688F, 0.288F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3354F, -5.669F, -0.4955F, 0.2358F, 0.0715F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(41, 19).addBox(-1.5F, -0.425F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9926F, 0.7538F, 2.4435F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(33, 38).addBox(-2.5F, -2.7712F, 0.1919F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5F, 5.5681F, -0.4495F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(52, 69).mirror().addBox(-0.5F, -0.4549F, -0.7577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.02F, 2.561F, -2.2449F, 1.3186F, -0.0218F, -0.0845F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(52, 69).addBox(-0.5F, -0.4549F, -0.7577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.02F, 2.561F, -2.2449F, 1.3186F, 0.0218F, 0.0845F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(59, 18).addBox(-1.0F, 0.025F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 2.5826F, -1.7714F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(0, 38).addBox(-1.5F, -0.275F, 0.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 5.3705F, -3.1598F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(39, 28).mirror().addBox(-0.8F, -1.0F, -0.075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(39, 28).addBox(-0.05F, -1.0F, -0.075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.075F, 5.5099F, -2.0944F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(71, 6).mirror().addBox(-0.7F, -1.3F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(71, 6).addBox(-0.15F, -1.3F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.075F, 7.6983F, -2.4698F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(10, 70).mirror().addBox(-0.475F, -0.075F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(10, 70).addBox(0.075F, -0.075F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3F, 6.6947F, -2.9922F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, -0.4696F, -1.2506F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(57, 21).addBox(-1.0F, -1.0696F, -1.2506F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 6.358F, -2.571F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(59, 15).addBox(-1.0F, -0.0946F, 0.6994F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(14, 59).addBox(-1.0F, -0.0946F, -0.1006F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, 4.3759F, -3.8222F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(59, 7).addBox(-1.0F, -0.8946F, -0.1006F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 5.1177F, -4.1219F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(59, 0).addBox(-1.0F, -0.8946F, -0.1006F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 5.9099F, -4.0105F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(57, 12).addBox(-1.0F, -0.9696F, -0.8756F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, 6.358F, -2.571F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(21, 59).addBox(-1.0F, -0.0446F, -0.9756F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.1395F, -3.2887F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(69, 62).addBox(-1.0F, 0.0F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.504F, 2.3041F, -3.2028F, 1.2593F, 0.1696F, 0.4607F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(42, 71).addBox(-0.5F, -0.161F, -2.702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(55, 28).addBox(-1.0F, -0.011F, -2.277F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(33, 33).addBox(-1.5F, -0.011F, -1.477F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9595F, -2.701F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(17, 69).addBox(-0.5F, -0.024F, 0.0414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5071F, -2.5251F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(30, 13).addBox(-1.0F, -0.0424F, 0.3844F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(22, 62).addBox(0.0F, -0.0424F, -0.0156F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -1.11F, -1.2677F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(69, 3).addBox(0.0F, 0.0076F, 0.0094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -0.3369F, -1.9549F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(28, 17).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.3182F, -0.6443F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(11, 33).addBox(0.0F, -1.4F, -2.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.0F, -0.1811F, 0.7234F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(43, 0).addBox(0.0F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, -2.1561F, -0.3516F, 0.1745F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.425F, 7.7298F, -5.0083F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(69, 23).addBox(-0.5F, -0.575F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.075F, -4.5116F, 2.2836F, 2.33F, 0.0F, 0.0F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(22, 69).addBox(-0.5F, -0.221F, -1.8928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.075F, -5.2859F, 1.9568F, 1.6319F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.425F, 7.7298F, -5.0083F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(69, 23).mirror().addBox(-0.5F, -0.575F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.075F, -4.5116F, 2.2836F, 2.33F, 0.0F, 0.0F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(22, 69).mirror().addBox(-0.5F, -0.221F, -1.8928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.075F, -5.2859F, 1.9568F, 1.6319F, 0.0F, 0.0F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(0.9F, 1.3795F, -0.2001F));

		PartDefinition cube_r254 = leftOrbit.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(9, 44).addBox(-0.1983F, -0.5F, -0.3888F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.881F, -1.9815F, 0.6096F, 1.3691F, -0.9917F, -1.0077F));

		PartDefinition cube_r255 = leftOrbit.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(53, 66).addBox(-0.5F, -0.425F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6305F, -0.9764F, -0.7108F, 0.9724F, -0.296F, 0.0622F));

		PartDefinition cube_r256 = leftOrbit.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(48, 66).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.4935F, -1.4104F, -0.1738F, 0.7542F, -0.296F, 0.0622F));

		PartDefinition cube_r257 = leftOrbit.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(66, 42).addBox(-0.65F, -0.625F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6249F, -1.5135F, -0.0687F, 0.3616F, -0.296F, 0.0622F));

		PartDefinition cube_r258 = leftOrbit.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(66, 51).addBox(-0.2015F, -0.55F, -0.5625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.881F, -1.9815F, 0.6096F, 0.4709F, -0.5673F, -0.0932F));

		PartDefinition cube_r259 = leftOrbit.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(9, 50).addBox(-0.425F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4493F, -0.081F, -1.0559F, 1.2599F, -0.2347F, 0.2622F));

		PartDefinition cube_r260 = leftOrbit.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(44, 33).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6812F, 1.6141F, -2.7654F, 1.1943F, -0.0561F, -0.0207F));

		PartDefinition cube_r261 = leftOrbit.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(16, 44).addBox(-0.4327F, -0.7393F, -1.5331F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3159F, 1.4445F, -2.4421F, 2.0586F, -0.0034F, 0.2438F));

		PartDefinition cube_r262 = leftOrbit.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(43, 43).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.2207F, 1.9649F, -1.6359F, 1.2391F, -0.1174F, 0.6807F));

		PartDefinition cube_r263 = leftOrbit.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(36, 43).addBox(-0.4569F, -0.381F, -2.0612F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8413F, 1.0668F, -1.3011F, 0.8901F, -0.1174F, 0.6807F));

		PartDefinition cube_r264 = leftOrbit.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(29, 43).addBox(-0.425F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8413F, 1.0668F, -1.3011F, 1.4932F, -0.0346F, 0.7823F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-0.9F, 1.3795F, -0.2001F));

		PartDefinition cube_r265 = rightOrbit.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(9, 44).mirror().addBox(-0.8017F, -0.5F, -0.3888F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.881F, -1.9815F, 0.6096F, 1.3691F, 0.9917F, 1.0077F));

		PartDefinition cube_r266 = rightOrbit.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(53, 66).mirror().addBox(-0.5F, -0.425F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6305F, -0.9764F, -0.7108F, 0.9724F, 0.296F, -0.0622F));

		PartDefinition cube_r267 = rightOrbit.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(48, 66).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.4935F, -1.4104F, -0.1738F, 0.7542F, 0.296F, -0.0622F));

		PartDefinition cube_r268 = rightOrbit.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(66, 42).mirror().addBox(-0.35F, -0.625F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6249F, -1.5135F, -0.0687F, 0.3616F, 0.296F, -0.0622F));

		PartDefinition cube_r269 = rightOrbit.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(66, 51).mirror().addBox(-0.7985F, -0.55F, -0.5625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.881F, -1.9815F, 0.6096F, 0.4709F, 0.5673F, 0.0932F));

		PartDefinition cube_r270 = rightOrbit.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(9, 50).mirror().addBox(-0.575F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4493F, -0.081F, -1.0559F, 1.2599F, 0.2347F, -0.2622F));

		PartDefinition cube_r271 = rightOrbit.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(44, 33).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6812F, 1.6141F, -2.7654F, 1.1943F, 0.0561F, 0.0207F));

		PartDefinition cube_r272 = rightOrbit.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(16, 44).mirror().addBox(-0.5673F, -0.7393F, -1.5331F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3159F, 1.4445F, -2.4421F, 2.0586F, 0.0034F, -0.2438F));

		PartDefinition cube_r273 = rightOrbit.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(43, 43).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.2207F, 1.9649F, -1.6359F, 1.2391F, 0.1174F, -0.6807F));

		PartDefinition cube_r274 = rightOrbit.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(36, 43).mirror().addBox(-0.5431F, -0.381F, -2.0612F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8413F, 1.0668F, -1.3011F, 0.8901F, 0.1174F, -0.6807F));

		PartDefinition cube_r275 = rightOrbit.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(29, 43).mirror().addBox(-0.575F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8413F, 1.0668F, -1.3011F, 1.4932F, 0.0346F, -0.7823F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 0.2309F, -0.4478F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(41, 74).mirror().addBox(-0.1355F, -0.0391F, -0.5606F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3104F, 0.9903F, -4.6311F, -1.5983F, -0.209F, 0.0059F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(71, 40).mirror().addBox(-0.5F, -0.7F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8381F, 1.062F, -6.5213F, -1.3003F, -0.192F, 0.0F));

		PartDefinition cube_r278 = jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(67, 34).mirror().addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.036F, 1.083F, -5.5035F, -1.6676F, -0.1918F, 0.0085F));

		PartDefinition cube_r279 = jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-1.0F, 0.0574F, 0.0022F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 62).addBox(0.0F, 0.0574F, 0.0022F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.6F, 0.8135F, -3.0866F, -1.693F, 0.0F, 0.0F));

		PartDefinition cube_r280 = jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(30, 72).mirror().addBox(-0.667F, -1.1442F, -1.0789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6134F, 1.7345F, -6.8022F, -2.1642F, -0.192F, 0.0F));

		PartDefinition cube_r281 = jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(72, 32).mirror().addBox(-0.5F, -0.3811F, -0.5705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.025F, 1.746F, -5.5707F, -0.5498F, -0.2182F, 0.0F));

		PartDefinition cube_r282 = jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(72, 35).mirror().addBox(-0.5F, -0.5256F, -0.6358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.025F, 1.746F, -5.5707F, -2.4696F, -0.2182F, 0.0F));

		PartDefinition cube_r283 = jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(67, 26).mirror().addBox(-1.0F, -0.9811F, -1.0077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(67, 26).addBox(0.0F, -0.9811F, -1.0077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6F, 2.5433F, -2.2016F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r284 = jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(12, 66).mirror().addBox(-1.0F, -1.9811F, -1.0077F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 66).addBox(0.0F, -1.9811F, -1.0077F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.9419F, -4.109F, -1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r285 = jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(32, 65).mirror().addBox(-1.0F, -0.7561F, -4.2327F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(32, 65).addBox(0.0F, -0.7561F, -4.2327F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6F, 5.1669F, -3.984F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r286 = jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(64, 3).mirror().addBox(-1.0F, -1.9689F, -0.6572F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(64, 3).addBox(1.6F, -1.9689F, -0.6572F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4F, 0.8669F, -1.584F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r287 = jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(61, 51).mirror().addBox(-0.5F, -1.0F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(61, 51).addBox(2.1F, -1.0F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.9F, 1.4775F, -2.2984F, -1.8413F, 0.0F, 0.0F));

		PartDefinition cube_r288 = jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(5, 67).mirror().addBox(-0.5F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 67).addBox(2.1F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 2.7007F, -0.8041F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(67, 45).mirror().addBox(-0.5F, -2.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(67, 45).addBox(2.1F, -2.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.9F, 3.4348F, -1.0584F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(71, 12).mirror().addBox(-1.0F, -1.2266F, -0.4994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(71, 12).addBox(1.6F, -1.2266F, -0.4994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4F, 1.5669F, -1.984F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(71, 9).mirror().addBox(-1.0F, 0.0558F, -0.9928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(71, 9).addBox(1.6F, 0.0558F, -0.9928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4F, 1.7479F, -0.3179F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(44, 74).mirror().addBox(-0.1178F, -1.9634F, -0.557F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3104F, 0.9903F, -4.6311F, -1.7173F, 0.05F, -0.0327F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(44, 74).addBox(0.1178F, -1.9634F, -0.557F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1104F, 0.9903F, -4.6311F, -1.7173F, -0.05F, 0.0327F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(41, 74).addBox(0.1355F, -0.0391F, -0.5606F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1104F, 0.9903F, -4.6311F, -1.5983F, 0.209F, -0.0059F));

		PartDefinition cube_r295 = jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(71, 40).addBox(-0.5F, -0.7F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3619F, 1.062F, -6.5213F, -1.3003F, 0.192F, 0.0F));

		PartDefinition cube_r296 = jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(67, 34).addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.164F, 1.083F, -5.5035F, -1.6676F, 0.1918F, -0.0085F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(30, 72).addBox(-0.333F, -1.1442F, -1.0789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5866F, 1.7345F, -6.8022F, -2.1642F, 0.192F, 0.0F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(72, 32).addBox(-0.5F, -0.3811F, -0.5705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.175F, 1.746F, -5.5707F, -0.5498F, 0.2182F, 0.0F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(72, 35).addBox(-0.5F, -0.5256F, -0.6358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.175F, 1.746F, -5.5707F, -2.4696F, 0.2182F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(20, 39).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(72, 59).addBox(0.0F, -1.2F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5464F, 1.6845F, -0.5886F, -0.1091F, 0.0725F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(11, 39).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F))
				.texOffs(74, 3).addBox(0.0F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 23).addBox(0.0F, -1.1F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.031F, 2.9564F, -0.2991F, -0.1251F, 0.0385F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(22, 33).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(74, 29).addBox(0.0F, -0.9F, 0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0037F, 2.8952F, -0.2214F, -0.1704F, 0.0381F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(15, 9).addBox(-0.5F, -0.3193F, -0.124F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1631F, 3.6807F, 0.2648F, -0.2954F, -0.0788F));

		return LayerDefinition.create(meshdefinition, 77, 77);
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