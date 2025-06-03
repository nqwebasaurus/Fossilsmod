package fossils.fossils.client.blockentity.model.lesothosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LesothosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart Head;
	private final ModelPart HeadslopeL;
	private final ModelPart HeadslopeL2;
	private final ModelPart BrowL;
	private final ModelPart Jaw;
	private final ModelPart JawslopeL;
	private final ModelPart JawslopeL2;
	private final ModelPart MasseterR;

	public LesothosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.Head = this.neck3.getChild("Head");
		this.HeadslopeL = this.Head.getChild("HeadslopeL");
		this.HeadslopeL2 = this.Head.getChild("HeadslopeL2");
		this.BrowL = this.Head.getChild("BrowL");
		this.Jaw = this.Head.getChild("Jaw");
		this.JawslopeL = this.Jaw.getChild("JawslopeL");
		this.JawslopeL2 = this.Jaw.getChild("JawslopeL2");
		this.MasseterR = this.Jaw.getChild("MasseterR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(24, 29).addBox(-0.5F, -1.0F, -2.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F))
				.texOffs(38, 3).addBox(1.4F, -1.9F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(40, 20).addBox(0.4F, -1.1F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(40, 20).mirror().addBox(-1.4F, -1.1F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 3).mirror().addBox(-2.4F, -1.9F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 50).addBox(0.0F, -2.0F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 36).addBox(0.0F, -2.0F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 50).addBox(0.0F, -2.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, -0.2002F, -0.0531F, -0.6527F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(0.05F, 0.0579F, -1.0203F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.35F, -0.1551F, -0.6609F, -1.0594F, 0.0574F, -0.3497F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.05F, 0.1287F, -0.2215F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-2.35F, -0.1551F, -0.6609F, -1.3386F, 0.0574F, -0.3497F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 18).mirror().addBox(-0.05F, 0.9425F, -1.7631F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(0, 8).mirror().addBox(0.05F, 0.2599F, 2.4173F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-2.35F, -0.1551F, -0.6609F, -0.4311F, 0.0574F, -0.3497F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 32).mirror().addBox(0.05F, -0.5967F, 0.8469F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.35F, -0.1551F, -0.6609F, -0.7452F, 0.0574F, -0.3497F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-0.5F, -1.1F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(19, 0).addBox(3.3F, -1.1F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.9F, -0.4F, -0.4F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(37, 43).mirror().addBox(-0.5F, -0.0226F, -0.0047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(37, 43).addBox(3.3F, -0.0226F, -0.0047F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.9F, -2.2F, -0.4F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(34, 34).mirror().addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(34, 34).addBox(3.5F, -0.3F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0F, -1.7F, -2.6F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(38, 47).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(38, 47).addBox(3.3F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.9F, -2.1F, -1.4F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(16, 18).addBox(-0.95F, 0.9425F, -1.7631F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.31F))
				.texOffs(0, 8).addBox(-1.05F, 0.2599F, 2.4173F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(2.35F, -0.1551F, -0.6609F, -0.4311F, -0.0574F, 0.3497F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(40, 32).addBox(-1.05F, -0.5967F, 0.8469F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.35F, -0.1551F, -0.6609F, -0.7452F, -0.0574F, 0.3497F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(48, 10).addBox(-1.05F, 0.2998F, 0.4651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.35F, -0.1551F, -0.6609F, -1.7052F, -0.0574F, 0.3497F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 18).addBox(-1.05F, 0.0579F, -1.0203F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.35F, -0.1551F, -0.6609F, -1.0594F, -0.0574F, 0.3497F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-1.05F, 0.1287F, -0.2215F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(2.35F, -0.1551F, -0.6609F, -1.3386F, -0.0574F, 0.3497F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(0, 39).addBox(0.0F, -0.6728F, -0.4209F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, -0.6F, -0.6F, -1.1447F, -0.1559F, -0.3136F));

		PartDefinition Femur_r1 = leftLeg.addOrReplaceChild("Femur_r1", CubeListBuilder.create().texOffs(0, 8).addBox(1.4F, -0.0774F, -1.0063F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4F, -0.5954F, 0.5854F, 0.2269F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(22, 36).addBox(-0.3F, -0.0466F, -0.2783F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(27, 36).addBox(-1.4F, -0.0466F, -0.3783F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.5046F, -0.0146F, 2.3289F, 0.1273F, 0.1197F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 9.1229F, 0.5046F, -0.2934F, -0.4623F, 0.1339F));

		PartDefinition Metatarsals_r1 = leftLeg3.addOrReplaceChild("Metatarsals_r1", CubeListBuilder.create().texOffs(9, 0).addBox(1.5F, 10.0767F, 11.2776F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.0F, -15.7F, 0.2F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 2.5F, -2.8F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Pes_r1 = leftLeg4.addOrReplaceChild("Pes_r1", CubeListBuilder.create().texOffs(28, 20).addBox(1.0F, 17.4186F, 2.6358F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -18.7F, 3.6F, -0.576F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-1.0F, -0.6728F, -0.4209F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.6F, -0.6F, -0.5704F, 0.1033F, -0.86F));

		PartDefinition Femur_r2 = rightLeg.addOrReplaceChild("Femur_r2", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-2.4F, -0.0774F, -1.0063F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.4F, -0.5954F, 0.5854F, 0.2269F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(22, 36).mirror().addBox(-1.7F, -0.0466F, -0.2783F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(27, 36).mirror().addBox(-0.6F, -0.0466F, -0.3783F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.5046F, -0.0146F, 1.23F, 0.038F, -0.0215F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.7229F, 0.5046F, -0.9599F, 0.0F, 0.0F));

		PartDefinition Metatarsals_r2 = rightLeg3.addOrReplaceChild("Metatarsals_r2", CubeListBuilder.create().texOffs(9, 0).mirror().addBox(-3.5F, 10.0767F, 11.2776F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(2.0F, -15.4706F, 0.5277F, -0.8727F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 2.7294F, -2.4723F, 2.0071F, 0.0F, 0.0F));

		PartDefinition Pes_r2 = rightLeg4.addOrReplaceChild("Pes_r2", CubeListBuilder.create().texOffs(28, 20).mirror().addBox(-4.0F, 17.4186F, 2.6358F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4F, -18.7F, 3.6F, -0.576F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.008F))
				.texOffs(32, 50).addBox(0.0F, -1.2F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 50).addBox(0.0F, -1.1F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r14 = tail.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(30, 0).addBox(0.0F, 0.622F, 2.7472F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 33).addBox(0.0F, -0.6071F, 1.1662F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 10).addBox(0.0F, -2.0F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, 1.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.257F, -0.0315F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(26, 50).addBox(0.0F, -0.857F, -0.0315F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 50).addBox(0.0F, -0.757F, 1.9685F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 50).addBox(0.0F, -0.657F, 3.9685F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 50).addBox(0.0F, -0.657F, 5.9685F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 5.0F, -0.2241F, 0.261F, 0.021F));

		PartDefinition cube_r15 = tail2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(5, 39).addBox(0.0F, 3.887F, 6.0559F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 8).addBox(0.0F, 5.0819F, 7.6628F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(0.0F, 1.7691F, 4.3855F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -3.5F, 0.6981F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.3007F, -0.0305F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.003F))
				.texOffs(50, 13).addBox(0.0F, -0.6007F, -0.0305F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 49).addBox(0.0F, -0.6007F, 1.9695F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 48).addBox(0.0F, -0.6007F, 3.9695F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 39).addBox(0.0F, -0.6007F, 5.9695F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 13).addBox(0.0F, -0.6007F, 7.9695F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.043F, 7.9685F, -0.2712F, 0.3927F, -0.0036F));

		PartDefinition cube_r16 = tail3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(22, 18).addBox(0.0F, 9.9746F, 13.9948F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 18).addBox(0.0F, 8.716F, 12.4405F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 29).addBox(0.0F, 7.535F, 10.8233F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 27).addBox(0.0F, 6.3541F, 9.2061F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.757F, -11.4685F, 0.6981F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.4453F, -0.044F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1993F, 12.8695F, -0.3342F, 0.566F, -0.0389F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(28, 10).addBox(-0.5F, -0.2989F, -7.8655F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F))
				.texOffs(3, 51).addBox(0.0F, -1.2989F, -7.8655F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 2).addBox(0.0F, -1.2989F, -5.8655F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 51).addBox(0.0F, -1.2989F, -3.8655F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 50).addBox(0.0F, -1.2989F, -1.8655F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -2.9F, -0.1786F, -0.0262F, 0.3043F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(47, 6).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1011F, -1.3655F, 0.1515F, 0.0869F, -0.517F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(17, 44).mirror().addBox(-1.9537F, -0.3007F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1011F, -1.3655F, 0.1186F, 0.1284F, -0.8214F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(44, 4).mirror().addBox(-2.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1011F, -3.3655F, 0.2411F, 0.2549F, -0.798F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(47, 29).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1011F, -3.3655F, 0.3053F, 0.1719F, -0.4971F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(48, 44).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2011F, -5.3655F, 0.3053F, 0.1719F, -0.4971F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(47, 34).mirror().addBox(-3.6736F, -1.29F, -0.4463F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2011F, -5.3655F, 0.1605F, 0.3122F, -1.1562F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(44, 38).mirror().addBox(-2.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2011F, -5.3655F, 0.2411F, 0.2549F, -0.798F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(37, 0).mirror().addBox(-5.6736F, -1.29F, -0.4463F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2011F, -7.3655F, 0.1605F, 0.3122F, -1.1562F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(45, 8).mirror().addBox(-2.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2011F, -7.3655F, 0.2411F, 0.2549F, -0.798F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(49, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2011F, -7.3655F, 0.3053F, 0.1719F, -0.4971F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(47, 6).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1011F, -1.3655F, 0.1515F, -0.0869F, 0.517F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(17, 44).addBox(0.9537F, -0.3007F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1011F, -1.3655F, 0.1186F, -0.1284F, 0.8214F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(47, 29).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1011F, -3.3655F, 0.3053F, -0.1719F, 0.4971F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(44, 4).addBox(0.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1011F, -3.3655F, 0.2411F, -0.2549F, 0.798F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(48, 44).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2011F, -5.3655F, 0.3053F, -0.1719F, 0.4971F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(44, 38).addBox(0.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2011F, -5.3655F, 0.2411F, -0.2549F, 0.798F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(47, 34).addBox(2.6736F, -1.29F, -0.4463F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2011F, -5.3655F, 0.1605F, -0.3122F, 1.1562F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(37, 0).addBox(2.6736F, -1.29F, -0.4463F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2011F, -7.3655F, 0.1605F, -0.3122F, 1.1562F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(45, 8).addBox(0.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2011F, -7.3655F, 0.2411F, -0.2549F, 0.798F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(49, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2011F, -7.3655F, 0.3053F, -0.1719F, 0.4971F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0011F, -7.8655F, 0.0F, -0.2182F, 0.1309F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(8, 8).mirror().addBox(0.0F, -0.9137F, -1.9862F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 3.0768F, -4.2078F, 0.7696F, -0.3931F, -0.3554F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(38, 27).mirror().addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(38, 27).addBox(4.1F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.3F, 1.5271F, -2.2267F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(5, 44).mirror().addBox(-0.5F, -1.0266F, -0.672F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 44).addBox(4.1F, -1.0266F, -0.672F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3F, 1.6271F, -1.5267F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-0.5F, -1.2266F, -0.372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(44, 0).addBox(4.1F, -1.2266F, -0.372F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.3F, 1.6271F, -1.5267F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(8, 8).addBox(-1.0F, -0.9137F, -1.9862F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, 3.0768F, -4.2078F, 0.7696F, 0.3931F, 0.3554F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.7F, -7.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(6, 51).addBox(-0.5F, -0.2F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 51).addBox(-0.5F, -0.1F, -5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 51).addBox(-0.5F, 0.1F, -7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3F, 0.7F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(31, 10).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7F, -1.3F, 0.3838F, 0.2129F, -0.4821F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(42, 43).mirror().addBox(-2.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7F, -1.3F, 0.3052F, 0.3169F, -0.7799F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(16, 29).mirror().addBox(-5.6736F, -1.29F, -0.4463F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7F, -1.3F, 0.1985F, 0.3918F, -1.1431F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(30, 6).mirror().addBox(-4.6736F, -1.29F, -0.4463F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3F, -3.0F, 0.2391F, 0.4709F, -1.1261F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(43, 36).mirror().addBox(-2.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3F, -3.0F, 0.3719F, 0.3775F, -0.7572F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(28, 23).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3F, -3.0F, 0.4636F, 0.2527F, -0.4636F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(8, 21).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0F, -5.0F, 0.6453F, 0.3342F, -0.4109F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(19, 5).mirror().addBox(-2.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.0F, -5.0F, 0.531F, 0.5049F, -0.689F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(8, 21).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0F, -5.0F, 0.6453F, -0.3342F, 0.4109F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(19, 5).addBox(0.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0F, -5.0F, 0.531F, -0.5049F, 0.689F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(28, 23).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3F, -3.0F, 0.4636F, -0.2527F, 0.4636F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(43, 36).addBox(0.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3F, -3.0F, 0.3719F, -0.3775F, 0.7572F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(30, 6).addBox(2.6736F, -1.29F, -0.4463F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3F, -3.0F, 0.2391F, -0.4709F, 1.1261F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(42, 43).addBox(0.9537F, -0.3007F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7F, -1.3F, 0.3052F, -0.3169F, 0.7799F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(16, 29).addBox(2.6736F, -1.29F, -0.4463F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7F, -1.3F, 0.1985F, -0.3918F, 1.1431F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(31, 10).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7F, -1.3F, 0.3838F, -0.2129F, 0.4821F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7F, 4.4F, -3.7F, 0.2182F, 0.2182F, 0.0F));

		PartDefinition Humerus_r1 = leftArm.addOrReplaceChild("Humerus_r1", CubeListBuilder.create().texOffs(19, 10).addBox(0.0F, -0.3F, 0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.4F, -0.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 2.7F, 2.5F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Radio_Ulna_r1 = leftArm2.addOrReplaceChild("Radio_Ulna_r1", CubeListBuilder.create().texOffs(0, 33).addBox(0.0F, -1.6662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(11, 33).addBox(0.0F, -0.6662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4F, 0.1F, 0.8F, 0.8378F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offset(0.6F, 2.5F, -2.3F));

		PartDefinition Manus_r1 = leftArm3.addOrReplaceChild("Manus_r1", CubeListBuilder.create().texOffs(32, 39).addBox(-1.1F, -1.5083F, -1.8051F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.2F, 0.8574F, 0.1855F, 0.21F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7F, 4.4F, -3.7F, -0.6584F, -0.5207F, 0.8684F));

		PartDefinition Humerus_r2 = rightArm.addOrReplaceChild("Humerus_r2", CubeListBuilder.create().texOffs(19, 10).mirror().addBox(-1.0F, -0.3F, 0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.4F, -0.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 2.7F, 2.5F, -0.4363F, 0.0F, -0.6109F));

		PartDefinition Radio_Ulna_r2 = rightArm2.addOrReplaceChild("Radio_Ulna_r2", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-1.0F, -1.6662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(11, 33).mirror().addBox(-1.0F, -0.6662F, -3.8486F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.1F, 0.8F, 0.8378F, 0.0F, 0.0F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offset(-0.6F, 2.5F, -2.3F));

		PartDefinition Manus_r2 = rightArm3.addOrReplaceChild("Manus_r2", CubeListBuilder.create().texOffs(32, 39).mirror().addBox(0.1F, -1.5083F, -1.8051F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.2F, 0.8574F, -0.1855F, -0.21F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 2.1F, -5.0F, -0.3777F, -0.1418F, 0.164F));

		PartDefinition CervicalDistal_r1 = neck.addOrReplaceChild("CervicalDistal_r1", CubeListBuilder.create().texOffs(44, 25).addBox(-0.6F, 0.0269F, -1.8045F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4866F, -0.1095F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1866F, -1.7095F, 0.1464F, -0.3706F, -0.2216F));

		PartDefinition CervicalMedial_r1 = neck2.addOrReplaceChild("CervicalMedial_r1", CubeListBuilder.create().texOffs(30, 0).addBox(-0.6F, -0.3423F, -3.6641F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1405F, -0.1284F, -0.8029F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6405F, -2.6284F, 0.3001F, -0.4294F, -0.2322F));

		PartDefinition CervicalProximal_r1 = neck3.addOrReplaceChild("CervicalProximal_r1", CubeListBuilder.create().texOffs(39, 8).addBox(0.0F, -0.2361F, -3.1094F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.6F, -0.1545F, 0.2842F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Head = neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, -0.2912F, -2.1069F, 0.0084F, 0.0023F, -0.2618F));

		PartDefinition Jugal_r1 = Head.addOrReplaceChild("Jugal_r1", CubeListBuilder.create().texOffs(5, 48).mirror().addBox(-0.8F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(5, 48).addBox(-0.4F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.0306F, -1.8639F, 0.576F, 0.0F, 0.0F));

		PartDefinition Quadratojugal_r1 = Head.addOrReplaceChild("Quadratojugal_r1", CubeListBuilder.create().texOffs(26, 10).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(26, 10).addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.8806F, -0.7696F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r1 = Head.addOrReplaceChild("Premaxillary_r1", CubeListBuilder.create().texOffs(28, 47).mirror().addBox(-0.5F, -0.5215F, -0.7748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(28, 47).addBox(0.1F, -0.5215F, -0.7748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 0.1545F, -2.086F, 0.576F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r2 = Head.addOrReplaceChild("Premaxillary_r2", CubeListBuilder.create().texOffs(23, 47).mirror().addBox(-0.5F, -0.5169F, -0.2248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(23, 47).addBox(0.1F, -0.5169F, -0.2248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, 0.1545F, -2.086F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Squamosal_r1 = Head.addOrReplaceChild("Squamosal_r1", CubeListBuilder.create().texOffs(33, 47).mirror().addBox(-1.0F, -0.0926F, 0.1494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 47).addBox(-0.4F, -0.0926F, 0.1494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0001F)), PartPose.offsetAndRotation(0.7F, -0.5231F, -1.0791F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Squamosal_r2 = Head.addOrReplaceChild("Squamosal_r2", CubeListBuilder.create().texOffs(10, 48).mirror().addBox(-1.0F, -0.5369F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0001F)).mirror(false)
				.texOffs(0, 48).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0002F))
				.texOffs(10, 48).addBox(-0.4F, -0.5369F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0231F, -0.9791F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Squamosal_r3 = Head.addOrReplaceChild("Squamosal_r3", CubeListBuilder.create().texOffs(44, 45).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(44, 45).addBox(0.56F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.03F, 1.1088F, -0.6057F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Squamosal_r4 = Head.addOrReplaceChild("Squamosal_r4", CubeListBuilder.create().texOffs(32, 44).mirror().addBox(-0.5F, -0.7971F, -0.1969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(32, 44).addBox(0.56F, -0.7971F, -0.1969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.03F, 0.1088F, -1.0057F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Squamosal_r5 = Head.addOrReplaceChild("Squamosal_r5", CubeListBuilder.create().texOffs(45, 13).mirror().addBox(-0.5F, -0.8009F, -0.2706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false)
				.texOffs(45, 13).addBox(0.56F, -0.8009F, -0.2706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.03F, 0.7088F, -0.9057F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Squamosal_r6 = Head.addOrReplaceChild("Squamosal_r6", CubeListBuilder.create().texOffs(46, 40).mirror().addBox(-0.5F, -0.2071F, -0.7403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.101F)).mirror(false), PartPose.offsetAndRotation(0.07F, 0.671F, -1.9684F, -0.2007F, -0.2443F, 0.0F));

		PartDefinition Squamosal_r7 = Head.addOrReplaceChild("Squamosal_r7", CubeListBuilder.create().texOffs(47, 22).mirror().addBox(-0.5412F, -0.3134F, -0.6141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1112F, 0.6218F, -1.7077F, 0.4116F, -0.1049F, -0.0511F));

		PartDefinition Squamosal_r8 = Head.addOrReplaceChild("Squamosal_r8", CubeListBuilder.create().texOffs(8, 18).mirror().addBox(-0.5859F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(7, 25).mirror().addBox(-0.4229F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0271F, 0.7011F, -1.9229F, 0.4105F, -0.1259F, -0.0169F));

		PartDefinition Squamosal_r9 = Head.addOrReplaceChild("Squamosal_r9", CubeListBuilder.create().texOffs(46, 19).mirror().addBox(-0.5412F, -0.4356F, -0.3712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.1112F, 0.6218F, -1.7077F, 1.0922F, -0.1049F, -0.0511F));

		PartDefinition Squamosal_r10 = Head.addOrReplaceChild("Squamosal_r10", CubeListBuilder.create().texOffs(46, 31).mirror().addBox(-0.5412F, -0.719F, -0.6094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.101F)).mirror(false), PartPose.offsetAndRotation(0.1112F, 0.6218F, -1.7077F, 0.2632F, -0.1049F, -0.0511F));

		PartDefinition Squamosal_r11 = Head.addOrReplaceChild("Squamosal_r11", CubeListBuilder.create().texOffs(18, 47).mirror().addBox(-0.5F, -0.7326F, -0.8272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.07F, 0.671F, -1.9684F, 0.7679F, -0.2443F, 0.0F));

		PartDefinition Squamosal_r12 = Head.addOrReplaceChild("Squamosal_r12", CubeListBuilder.create().texOffs(11, 39).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.17F, 1.6082F, -2.7139F, 0.0825F, -0.2201F, -0.1033F));

		PartDefinition Squamosal_r13 = Head.addOrReplaceChild("Squamosal_r13", CubeListBuilder.create().texOffs(18, 33).mirror().addBox(-0.1F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.03F, 2.3863F, -3.9687F, 0.5323F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r3 = Head.addOrReplaceChild("Premaxillary_r3", CubeListBuilder.create().texOffs(32, 29).addBox(-0.5F, -0.3808F, -0.1536F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.5F, 2.3572F, -4.2886F, 0.8901F, 0.0F, 0.0F));

		PartDefinition Premaxillary_r4 = Head.addOrReplaceChild("Premaxillary_r4", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -0.4683F, -0.4052F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.5F, 2.4572F, -4.2886F, 0.5061F, 0.0F, 0.0F));

		PartDefinition Squamosal_r14 = Head.addOrReplaceChild("Squamosal_r14", CubeListBuilder.create().texOffs(46, 31).addBox(-0.4588F, -0.719F, -0.6094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(0.8888F, 0.6218F, -1.7077F, 0.2632F, 0.1049F, 0.0511F));

		PartDefinition Squamosal_r15 = Head.addOrReplaceChild("Squamosal_r15", CubeListBuilder.create().texOffs(18, 33).addBox(-0.9F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.03F, 2.3863F, -3.9687F, 0.5323F, 0.0F, 0.0F));

		PartDefinition Squamosal_r16 = Head.addOrReplaceChild("Squamosal_r16", CubeListBuilder.create().texOffs(11, 39).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.83F, 1.6082F, -2.7139F, 0.0825F, 0.2201F, 0.1033F));

		PartDefinition Squamosal_r17 = Head.addOrReplaceChild("Squamosal_r17", CubeListBuilder.create().texOffs(46, 40).addBox(-0.5F, -0.2071F, -0.7403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(0.93F, 0.671F, -1.9684F, -0.2007F, 0.2443F, 0.0F));

		PartDefinition Squamosal_r18 = Head.addOrReplaceChild("Squamosal_r18", CubeListBuilder.create().texOffs(18, 47).addBox(-0.5F, -0.7326F, -0.8272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.93F, 0.671F, -1.9684F, 0.7679F, 0.2443F, 0.0F));

		PartDefinition Squamosal_r19 = Head.addOrReplaceChild("Squamosal_r19", CubeListBuilder.create().texOffs(46, 19).addBox(-0.4588F, -0.4356F, -0.3712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.8888F, 0.6218F, -1.7077F, 1.0922F, 0.1049F, 0.0511F));

		PartDefinition Squamosal_r20 = Head.addOrReplaceChild("Squamosal_r20", CubeListBuilder.create().texOffs(8, 18).addBox(-0.4141F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(7, 25).addBox(-0.5771F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0271F, 0.7011F, -1.9229F, 0.4105F, 0.1259F, 0.0169F));

		PartDefinition Squamosal_r21 = Head.addOrReplaceChild("Squamosal_r21", CubeListBuilder.create().texOffs(47, 22).addBox(-0.4588F, -0.3134F, -0.6141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8888F, 0.6218F, -1.7077F, 0.4116F, 0.1049F, 0.0511F));

		PartDefinition Teeth_r1 = Head.addOrReplaceChild("Teeth_r1", CubeListBuilder.create().texOffs(0, 54).addBox(-0.7F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.6982F, 2.4712F, -4.0765F, 0.4712F, 0.0167F, 0.0055F));

		PartDefinition Teeth_r2 = Head.addOrReplaceChild("Teeth_r2", CubeListBuilder.create().texOffs(14, 39).mirror().addBox(-0.1F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0001F)).mirror(false), PartPose.offsetAndRotation(0.1924F, 1.5633F, -2.295F, 0.4734F, -0.0945F, -0.0452F));

		PartDefinition Teeth_r3 = Head.addOrReplaceChild("Teeth_r3", CubeListBuilder.create().texOffs(14, 39).addBox(0.1F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0001F)), PartPose.offsetAndRotation(0.8076F, 1.5633F, -2.295F, 0.4734F, 0.0945F, 0.0452F));

		PartDefinition HeadslopeL = Head.addOrReplaceChild("HeadslopeL", CubeListBuilder.create(), PartPose.offset(1.0F, 0.5415F, 1.1145F));

		PartDefinition AntiorbitalAirSinus_r1 = HeadslopeL.addOrReplaceChild("AntiorbitalAirSinus_r1", CubeListBuilder.create().texOffs(7, 33).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.7396F, 0.6419F, -3.8468F, 0.7762F, -0.1911F, -0.0862F));

		PartDefinition AntiorbitalAirSinus_r2 = HeadslopeL.addOrReplaceChild("AntiorbitalAirSinus_r2", CubeListBuilder.create().texOffs(39, 39).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.698F, 1.1782F, -3.8222F, 0.3573F, -0.1911F, -0.0862F));

		PartDefinition AntiorbitalAirSinus_r3 = HeadslopeL.addOrReplaceChild("AntiorbitalAirSinus_r3", CubeListBuilder.create().texOffs(7, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.2604F, 0.6419F, -3.8468F, 0.7762F, 0.1911F, 0.0862F));

		PartDefinition AntiorbitalAirSinus_r4 = HeadslopeL.addOrReplaceChild("AntiorbitalAirSinus_r4", CubeListBuilder.create().texOffs(39, 39).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.302F, 1.1782F, -3.8222F, 0.3573F, 0.1911F, 0.0862F));

		PartDefinition HeadslopeL2 = Head.addOrReplaceChild("HeadslopeL2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5415F, 1.1145F));

		PartDefinition BrowL = Head.addOrReplaceChild("BrowL", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0147F, 0.5239F, -2.5201F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Crest_r1 = BrowL.addOrReplaceChild("Crest_r1", CubeListBuilder.create().texOffs(12, 44).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.1778F, 0.2405F, -0.1382F, 0.9254F, -0.2221F, -0.4138F));

		PartDefinition Crest_r2 = BrowL.addOrReplaceChild("Crest_r2", CubeListBuilder.create().texOffs(12, 44).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1483F, 0.2405F, -0.1382F, 0.9254F, 0.2221F, 0.4138F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7415F, -0.0855F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Predentary_r1 = Jaw.addOrReplaceChild("Predentary_r1", CubeListBuilder.create().texOffs(43, 48).addBox(-0.5F, -0.6F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 3.1896F, -2.9453F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Angular_r1 = Jaw.addOrReplaceChild("Angular_r1", CubeListBuilder.create().texOffs(5, 39).mirror().addBox(-0.5F, -0.7293F, -0.4709F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(5, 39).addBox(0.5F, -0.7293F, -0.4709F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.0F, 1.8156F, -0.9069F, 0.5061F, 0.0F, 0.0F));

		PartDefinition Surangular_r1 = Jaw.addOrReplaceChild("Surangular_r1", CubeListBuilder.create().texOffs(28, 20).mirror().addBox(-0.5F, -0.2312F, -0.7667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(28, 20).addBox(0.5F, -0.2312F, -0.7667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.9181F, -0.825F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Squamosal_r22 = Jaw.addOrReplaceChild("Squamosal_r22", CubeListBuilder.create().texOffs(18, 33).mirror().addBox(-0.61F, 0.9F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.03F, 1.6448F, -3.8833F, 0.5323F, 0.0F, 0.0F));

		PartDefinition Surangular_r2 = Jaw.addOrReplaceChild("Surangular_r2", CubeListBuilder.create().texOffs(16, 23).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(16, 23).addBox(0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.0181F, -0.325F, 0.3578F, 0.0F, 0.0F));

		PartDefinition Teeth_r4 = Jaw.addOrReplaceChild("Teeth_r4", CubeListBuilder.create().texOffs(39, 13).addBox(-0.4695F, -0.4F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(0.4695F, 2.2312F, -2.2154F, 0.6383F, 0.0F, 0.0F));

		PartDefinition Squamosal_r23 = Jaw.addOrReplaceChild("Squamosal_r23", CubeListBuilder.create().texOffs(18, 33).addBox(-0.39F, 0.9F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.03F, 1.6448F, -3.8833F, 0.5323F, 0.0F, 0.0F));

		PartDefinition JawslopeL = Jaw.addOrReplaceChild("JawslopeL", CubeListBuilder.create(), PartPose.offset(1.0F, 0.0413F, 1.699F));

		PartDefinition Dentary_r1 = JawslopeL.addOrReplaceChild("Dentary_r1", CubeListBuilder.create().texOffs(16, 18).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6958F, 2.2653F, -3.6814F, 0.6598F, -0.0998F, -0.0982F));

		PartDefinition Dentary_r2 = JawslopeL.addOrReplaceChild("Dentary_r2", CubeListBuilder.create().texOffs(16, 18).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3042F, 2.2653F, -3.6814F, 0.6598F, 0.0998F, 0.0982F));

		PartDefinition JawslopeL2 = Jaw.addOrReplaceChild("JawslopeL2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0413F, 1.699F));

		PartDefinition MasseterR = Jaw.addOrReplaceChild("MasseterR", CubeListBuilder.create(), PartPose.offset(-0.3F, -1.7587F, 2.399F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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