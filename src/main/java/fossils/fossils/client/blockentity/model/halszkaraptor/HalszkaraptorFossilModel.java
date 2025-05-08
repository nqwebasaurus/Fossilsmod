package fossils.fossils.client.blockentity.model.halszkaraptor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HalszkaraptorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart halszkaraptor;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftSickleClaw;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightSickleClaw;
	private final ModelPart rightToes;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Body;
	private final ModelPart Chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftFinger;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightFinger;
	private final ModelPart Neck3;
	private final ModelPart Neck2;
	private final ModelPart Neck1;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart Head;
	private final ModelPart Jaw;

	public HalszkaraptorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.halszkaraptor = this.fossil.getChild("halszkaraptor");
		this.bone = this.halszkaraptor.getChild("bone");
		this.bone2 = this.halszkaraptor.getChild("bone2");
		this.leftLeg1 = this.halszkaraptor.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftSickleClaw = this.leftFoot.getChild("leftSickleClaw");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.halszkaraptor.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightSickleClaw = this.rightFoot.getChild("rightSickleClaw");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.Tail1 = this.halszkaraptor.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Body = this.halszkaraptor.getChild("Body");
		this.Chest = this.Body.getChild("Chest");
		this.leftArm1 = this.Chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.leftFinger = this.leftHand.getChild("leftFinger");
		this.rightArm1 = this.Chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.rightFinger = this.rightHand.getChild("rightFinger");
		this.Neck3 = this.Chest.getChild("Neck3");
		this.Neck2 = this.Neck3.getChild("Neck2");
		this.Neck1 = this.Neck2.getChild("Neck1");
		this.neck = this.Neck1.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.Head = this.neck6.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition halszkaraptor = fossil.addOrReplaceChild("halszkaraptor", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -14.509F, 0.9777F, -0.0785F, 0.0F, 0.0F));

		PartDefinition basin_r1 = halszkaraptor.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(33, 31).addBox(-0.6F, -0.5312F, 1.2288F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(22, 27).mirror().addBox(-1.8F, 0.1438F, 0.5288F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 27).addBox(-0.4F, 0.1438F, 0.5288F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 23).addBox(-1.1F, -0.2562F, 1.0288F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.6F, -0.7F, -2.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone = halszkaraptor.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.1F, -0.0223F, 2.2214F));

		PartDefinition basin_r2 = bone.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(17, 42).addBox(-0.525F, -0.8066F, -1.3497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1825F, 0.0845F, 0.0644F));

		PartDefinition basin_r3 = bone.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.375F, -0.275F, -0.2182F, 0.0F, 0.0F));

		PartDefinition basin_r4 = bone.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(30, 62).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, -0.2809F, -3.27F, 0.2313F, 0.0F, 0.0F));

		PartDefinition basin_r5 = bone.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(60, 36).addBox(-0.5F, -0.2268F, -0.791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.875F, -3.2F, 0.5411F, 0.0F, 0.0F));

		PartDefinition basin_r6 = bone.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(5, 61).addBox(-0.5F, -0.7035F, -0.3665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0809F, -2.795F, -0.685F, 0.0F, 0.0F));

		PartDefinition basin_r7 = bone.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(24, 42).addBox(-0.5F, -0.1604F, -1.8444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.525F, 0.0349F, 0.0F, 0.0F));

		PartDefinition basin_r8 = bone.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(61, 6).addBox(-0.5F, -0.6053F, -0.9244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(0, 59).addBox(-0.5F, -1.2803F, -0.4244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(59, 27).addBox(-0.5F, -0.6053F, -0.4244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(35, 60).addBox(-0.5F, -1.2803F, -0.9244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.15F, 0.6682F, -1.8316F, 0.0916F, 0.0F, 0.192F));

		PartDefinition basin_r9 = bone.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(54, 44).addBox(-1.2119F, -0.7932F, -0.6396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(-0.175F, 5.058F, -1.2567F, -0.8552F, -0.0069F, 0.0053F));

		PartDefinition basin_r10 = bone.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(61, 12).addBox(-1.2119F, -1.1399F, -0.6787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(61, 9).addBox(-1.2119F, -0.7399F, -0.6787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1763F, 4.74F, -0.8221F, -0.2531F, -0.0069F, 0.0053F));

		PartDefinition basin_r11 = bone.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(27, 52).addBox(-1.2119F, -1.2097F, -0.6844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F))
				.texOffs(22, 52).addBox(-1.2119F, -0.7097F, -0.6844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(-0.175F, 5.058F, -1.2567F, -0.6502F, -0.0069F, 0.0053F));

		PartDefinition basin_r12 = bone.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(17, 46).addBox(-1.2006F, -0.3165F, -0.2696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.175F, 3.658F, -2.0567F, 0.397F, -0.0059F, 0.0064F));

		PartDefinition basin_r13 = bone.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(27, 48).addBox(-0.8019F, -0.1318F, -0.2027F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.175F, 2.258F, -2.4567F, 0.2632F, -0.239F, 0.2059F));

		PartDefinition basin_r14 = bone.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(59, 24).addBox(-0.5293F, -0.7194F, -1.5093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.175F, 0.758F, -1.4567F, 1.7029F, -0.2123F, 0.2333F));

		PartDefinition basin_r15 = bone.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(15, 56).addBox(-0.5293F, 0.9879F, -1.3903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(55, 36).addBox(-0.5293F, 0.6129F, -1.3903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(55, 33).addBox(-0.5293F, 0.1129F, -1.3903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.175F, 0.758F, -1.4567F, 1.284F, -0.2123F, 0.2333F));

		PartDefinition basin_r16 = bone.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(5, 55).addBox(-0.4073F, -0.3535F, -0.5642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F))
				.texOffs(42, 54).addBox(-0.4073F, 0.1465F, -0.5642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.175F, 0.758F, -1.4567F, 0.3423F, -0.043F, 0.3113F));

		PartDefinition basin_r17 = bone.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(46, 0).addBox(-0.5F, -0.0979F, -0.6321F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.175F, 0.658F, -2.1567F, 0.0536F, -0.2103F, 0.2351F));

		PartDefinition basin_r18 = bone.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(35, 57).addBox(-0.5F, -0.6487F, -0.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F))
				.texOffs(37, 54).addBox(-0.5F, -1.3487F, -0.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.15F, 0.6682F, -1.8316F, -0.3011F, 0.0F, 0.192F));

		PartDefinition bone2 = halszkaraptor.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.1F, -0.0223F, 2.2214F));

		PartDefinition basin_r19 = bone2.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(17, 42).mirror().addBox(-0.475F, -0.8066F, -1.3497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1825F, -0.0845F, -0.0644F));

		PartDefinition basin_r20 = bone2.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.375F, -0.275F, -0.2182F, 0.0F, 0.0F));

		PartDefinition basin_r21 = bone2.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(30, 62).mirror().addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2809F, -3.27F, 0.2313F, 0.0F, 0.0F));

		PartDefinition basin_r22 = bone2.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(60, 36).mirror().addBox(-0.5F, -0.2268F, -0.791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.875F, -3.2F, 0.5411F, 0.0F, 0.0F));

		PartDefinition basin_r23 = bone2.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(5, 61).mirror().addBox(-0.5F, -0.7035F, -0.3665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0809F, -2.795F, -0.685F, 0.0F, 0.0F));

		PartDefinition basin_r24 = bone2.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(24, 42).mirror().addBox(-0.5F, -0.1604F, -1.8444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, -1.525F, 0.0349F, 0.0F, 0.0F));

		PartDefinition basin_r25 = bone2.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(61, 6).mirror().addBox(-0.5F, -0.6053F, -0.9244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(0, 59).mirror().addBox(-0.5F, -1.2803F, -0.4244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(59, 27).mirror().addBox(-0.5F, -0.6053F, -0.4244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(35, 60).mirror().addBox(-0.5F, -1.2803F, -0.9244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.15F, 0.6682F, -1.8316F, 0.0916F, 0.0F, -0.192F));

		PartDefinition basin_r26 = bone2.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(54, 44).mirror().addBox(0.2119F, -0.7932F, -0.6396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(0.175F, 5.058F, -1.2567F, -0.8552F, 0.0069F, -0.0053F));

		PartDefinition basin_r27 = bone2.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(61, 12).mirror().addBox(0.2119F, -1.1399F, -0.6787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(61, 9).mirror().addBox(0.2119F, -0.7399F, -0.6787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.1763F, 4.74F, -0.8221F, -0.2531F, 0.0069F, -0.0053F));

		PartDefinition basin_r28 = bone2.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(27, 52).mirror().addBox(0.2119F, -1.2097F, -0.6844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false)
				.texOffs(22, 52).mirror().addBox(0.2119F, -0.7097F, -0.6844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(0.175F, 5.058F, -1.2567F, -0.6502F, 0.0069F, -0.0053F));

		PartDefinition basin_r29 = bone2.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(17, 46).mirror().addBox(0.2006F, -0.3165F, -0.2696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.175F, 3.658F, -2.0567F, 0.397F, 0.0059F, -0.0064F));

		PartDefinition basin_r30 = bone2.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(27, 48).mirror().addBox(-0.1981F, -0.1318F, -0.2027F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.175F, 2.258F, -2.4567F, 0.2632F, 0.239F, -0.2059F));

		PartDefinition basin_r31 = bone2.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(59, 24).mirror().addBox(-0.4707F, -0.7194F, -1.5093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.175F, 0.758F, -1.4567F, 1.7029F, 0.2123F, -0.2333F));

		PartDefinition basin_r32 = bone2.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(15, 56).mirror().addBox(-0.4707F, 0.9879F, -1.3903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(55, 36).mirror().addBox(-0.4707F, 0.6129F, -1.3903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(55, 33).mirror().addBox(-0.4707F, 0.1129F, -1.3903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.175F, 0.758F, -1.4567F, 1.284F, 0.2123F, -0.2333F));

		PartDefinition basin_r33 = bone2.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(5, 55).mirror().addBox(-0.5927F, -0.3535F, -0.5642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false)
				.texOffs(42, 54).mirror().addBox(-0.5927F, 0.1465F, -0.5642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(0.175F, 0.758F, -1.4567F, 0.3423F, 0.043F, -0.3113F));

		PartDefinition basin_r34 = bone2.addOrReplaceChild("basin_r34", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-0.5F, -0.0979F, -0.6321F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.175F, 0.658F, -2.1567F, 0.0536F, 0.2103F, -0.2351F));

		PartDefinition basin_r35 = bone2.addOrReplaceChild("basin_r35", CubeListBuilder.create().texOffs(35, 57).mirror().addBox(-0.5F, -0.6487F, -0.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(37, 54).mirror().addBox(-0.5F, -1.3487F, -0.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.15F, 0.6682F, -1.8316F, -0.3011F, 0.0F, -0.192F));

		PartDefinition leftLeg1 = halszkaraptor.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9F, 0.1707F, 0.2992F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r1 = leftLeg1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(54, 24).addBox(-0.5F, 1.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 35).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4092F, 0.3896F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r2 = leftLeg1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(25, 55).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1643F, 0.187F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r3 = leftLeg1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(22, 48).addBox(-0.5F, -0.175F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 2.5045F, -0.5429F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r4 = leftLeg1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(60, 59).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 4.1044F, -0.4358F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(0, 29).addBox(-0.7F, -0.0054F, -0.022F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(10, 60).addBox(-0.7F, -0.0054F, -0.422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.7304F, -0.4718F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftLeg2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(5, 29).addBox(-0.6F, -4.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftLeg2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(60, 33).addBox(-1.4F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.7F, 0.8446F, -0.272F, 0.576F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(7, 41).addBox(-0.2F, -0.2066F, -0.6088F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(12, 41).addBox(-0.6F, -0.2066F, -0.6088F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 6.9993F, 0.4279F, -0.7854F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(10, 33).addBox(-1.5F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 4.0559F, -0.1179F, 0.3062F, -0.0082F, 0.0005F));

		PartDefinition leftSickleClaw = leftFoot.addOrReplaceChild("leftSickleClaw", CubeListBuilder.create().texOffs(44, 4).addBox(-0.5244F, -0.5637F, -1.4269F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4449F, -0.2224F, -0.0217F, -0.5859F, 0.2466F, 0.0F));

		PartDefinition cube_r7 = leftSickleClaw.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(44, 16).addBox(0.0F, -1.5F, -1.2F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0244F, -0.0637F, -2.4269F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(33, 27).addBox(-2.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offset(0.5F, 0.0F, -1.5F));

		PartDefinition rightLeg1 = halszkaraptor.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, 0.1707F, 0.2992F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r8 = rightLeg1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(54, 24).mirror().addBox(-0.5F, 1.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(45, 35).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4092F, 0.3896F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r9 = rightLeg1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(25, 55).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1643F, 0.187F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r10 = rightLeg1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 48).mirror().addBox(-0.5F, -0.175F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5045F, -0.5429F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r11 = rightLeg1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(60, 59).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.1044F, -0.4358F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-0.3F, -0.0054F, -0.022F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(10, 60).mirror().addBox(-0.3F, -0.0054F, -0.422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.7304F, -0.4718F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r12 = rightLeg2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(5, 29).mirror().addBox(-0.4F, -4.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r13 = rightLeg2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(60, 33).mirror().addBox(0.4F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.8446F, -0.272F, 0.576F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(7, 41).mirror().addBox(-0.8F, -0.2066F, -0.6088F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(12, 41).mirror().addBox(-0.4F, -0.2066F, -0.6088F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.9993F, 0.4279F, -1.7453F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(10, 33).mirror().addBox(-0.5F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 4.0559F, -0.1179F, 1.3534F, 0.0082F, -0.0005F));

		PartDefinition rightSickleClaw = rightFoot.addOrReplaceChild("rightSickleClaw", CubeListBuilder.create().texOffs(44, 4).mirror().addBox(-0.4756F, -0.5637F, -1.4269F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4449F, -0.2224F, -0.0217F, -0.5859F, -0.2466F, 0.0F));

		PartDefinition cube_r14 = rightSickleClaw.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(44, 16).mirror().addBox(0.0F, -1.5F, -1.2F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0244F, -0.0637F, -2.4269F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(33, 27).mirror().addBox(0.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tail1 = halszkaraptor.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0502F, 2.575F, 0.1685F, -0.3014F, -0.0505F));

		PartDefinition cube_r15 = Tail1.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(66, 3).addBox(0.0F, 0.6F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 0).addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9764F, 1.1525F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Tail1.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(65, 36).addBox(0.0F, -0.7F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 33).addBox(0.0F, -0.7F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 65).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0001F, -0.225F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.4128F, -0.0981F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, 0.6815F, 5.4097F, -0.0293F, -0.1745F, 0.0051F));

		PartDefinition cube_r17 = Tail2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(66, 9).addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3653F, 2.7052F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r18 = Tail2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(10, 66).addBox(0.0F, 3.4F, 4.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0384F, -6.2729F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.1963F, 5.8019F, -0.1864F, -0.2575F, 0.048F));

		PartDefinition cube_r19 = Tail3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -0.5F, 1.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 4.55F, -0.066F, 0.6534F, -0.0401F));

		PartDefinition cube_r20 = Tail4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(26, 21).addBox(-1.0F, 0.0228F, 1.9937F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, -0.7872F, -2.0981F, -0.192F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6723F, 3.547F, -0.1445F, 0.2592F, -0.0373F));

		PartDefinition cube_r21 = Tail5.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(15, 7).addBox(-1.0F, 0.0227F, 1.9937F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7872F, -2.0981F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body = halszkaraptor.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5447F, -1.2965F, 0.0533F, 0.0F, 0.0F));

		PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(20, 61).addBox(-1.0F, -0.1464F, -0.1064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.25F, -0.525F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(15, 65).addBox(-0.5F, -0.4252F, -0.6342F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.125F, -0.7F, -0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(7, 38).addBox(-0.5F, -1.175F, -2.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 14).addBox(-1.0F, -1.0F, -4.65F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.5F, 0.6F, -0.7F, -0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(66, 6).addBox(0.0F, -0.5999F, -0.496F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0404F, -4.8135F, 0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(64, 42).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0751F, -1.1059F, -0.0291F, 0.2528F, -0.7758F));

		PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(64, 27).mirror().addBox(-1.9408F, -0.417F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0751F, -1.1059F, -0.1487F, 0.2352F, -1.2614F));

		PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0751F, -3.1059F, 0.0625F, 0.4019F, -0.5203F));

		PartDefinition cube_r29 = Body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(32, 48).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0751F, -3.1059F, -0.1435F, 0.4076F, -1.0338F));

		PartDefinition cube_r30 = Body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(25, 64).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0751F, -5.1059F, 0.2408F, 0.2962F, -0.2699F));

		PartDefinition cube_r31 = Body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(22, 46).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0751F, -5.1059F, 0.0712F, 0.3958F, -0.7604F));

		PartDefinition cube_r32 = Body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(62, 57).mirror().addBox(-3.306F, -1.8721F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0751F, -5.1059F, -0.1534F, 0.3729F, -1.3447F));

		PartDefinition cube_r33 = Body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(64, 42).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0751F, -1.1059F, -0.0291F, -0.2528F, 0.7758F));

		PartDefinition cube_r34 = Body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(64, 27).addBox(0.9408F, -0.417F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0751F, -1.1059F, -0.1487F, -0.2352F, 1.2614F));

		PartDefinition cube_r35 = Body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 65).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0751F, -3.1059F, 0.0625F, -0.4019F, 0.5203F));

		PartDefinition cube_r36 = Body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(32, 48).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0751F, -3.1059F, -0.1435F, -0.4076F, 1.0338F));

		PartDefinition cube_r37 = Body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(25, 64).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0751F, -5.1059F, 0.2408F, -0.2962F, 0.2699F));

		PartDefinition cube_r38 = Body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(22, 46).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0751F, -5.1059F, 0.0712F, -0.3958F, 0.7604F));

		PartDefinition cube_r39 = Body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(62, 57).addBox(2.306F, -1.8721F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0751F, -5.1059F, -0.1534F, -0.3729F, 1.3447F));

		PartDefinition cube_r40 = Body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(28, 0).addBox(-2.0F, -1.8384F, -0.1608F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 5.9212F, -0.3869F, 0.0916F, 0.0F, 0.0F));

		PartDefinition cube_r41 = Body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(13, 21).addBox(-2.0F, -1.8137F, -0.1394F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 5.5351F, -3.0757F, -0.144F, 0.0F, 0.0F));

		PartDefinition cube_r42 = Body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(11, 27).addBox(-1.5F, -1.8062F, -0.1144F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 4.9106F, -5.7016F, -0.2313F, 0.0F, 0.0F));

		PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.207F, -5.0999F, 0.0532F, 0.1743F, 0.0092F));

		PartDefinition cube_r43 = Chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(66, 12).addBox(-0.5F, -0.9727F, -0.1833F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(-1.0F, -0.7727F, -1.1833F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.8F, -3.675F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r44 = Chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(36, 66).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1535F, -1.3847F, 0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(22, 32).mirror().addBox(-3.575F, 0.0F, -0.425F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8103F, 3.8663F, -1.2627F, 0.2453F, 0.9668F, 0.584F));

		PartDefinition cube_r46 = Chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(50, 64).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.4249F, -3.6059F, 0.2239F, 0.4272F, -0.3894F));

		PartDefinition cube_r47 = Chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(5, 47).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.4249F, -3.6059F, -0.0145F, 0.5028F, -0.9112F));

		PartDefinition cube_r48 = Chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(64, 46).mirror().addBox(-3.306F, -1.8721F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.4249F, -3.6059F, -0.2875F, 0.4186F, -1.51F));

		PartDefinition cube_r49 = Chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-1.125F, -0.9F, -1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 4.7573F, -2.5355F, -0.2896F, -0.0823F, 0.7592F));

		PartDefinition cube_r50 = Chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(37, 21).mirror().addBox(-0.8F, -0.9F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 4.7573F, -2.5355F, -0.291F, 0.1268F, 0.6969F));

		PartDefinition cube_r51 = Chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(40, 31).mirror().addBox(-0.8F, -0.9F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9553F, 4.6702F, -0.8733F, -0.1869F, -0.1279F, 0.6472F));

		PartDefinition cube_r52 = Chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(-0.9F, -0.9F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 5.1173F, -0.9765F, -0.1869F, 0.1294F, 0.5987F));

		PartDefinition cube_r53 = Chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(15, 59).mirror().addBox(-0.0799F, 0.1609F, -0.8392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(57, 53).mirror().addBox(-0.0799F, -0.4391F, -0.8392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1186F, 3.3052F, -4.0556F, 1.15F, 0.008F, 0.0367F));

		PartDefinition cube_r54 = Chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(50, 58).mirror().addBox(-0.3903F, -0.2503F, 1.4613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(37, 5).mirror().addBox(-0.3903F, -0.2503F, -0.1387F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-1.5372F, 0.8437F, -3.5381F, 0.3006F, -0.0896F, 0.1072F));

		PartDefinition cube_r55 = Chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(54, 21).mirror().addBox(-0.3903F, -0.7122F, 0.3358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(57, 56).mirror().addBox(-0.3903F, -0.7122F, -0.2642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7097F, 2.8011F, -3.9615F, 1.8103F, -0.0896F, 0.1072F));

		PartDefinition cube_r56 = Chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(29, 46).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2249F, -1.6059F, 0.1345F, 0.3912F, -0.8466F));

		PartDefinition cube_r57 = Chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(45, 64).mirror().addBox(-3.306F, -1.8721F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2249F, -1.6059F, -0.0981F, 0.4014F, -1.4343F));

		PartDefinition cube_r58 = Chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(64, 44).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2249F, -1.6059F, 0.2923F, 0.2649F, -0.3661F));

		PartDefinition cube_r59 = Chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(17, 38).mirror().addBox(-0.3903F, -0.0503F, -0.3387F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.5179F, 1.6431F, -4.7046F, 0.737F, -0.0896F, 0.1072F));

		PartDefinition cube_r60 = Chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(10, 54).mirror().addBox(-0.5316F, -1.2241F, -0.6162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1186F, 3.3052F, -4.0556F, 0.2634F, -0.1204F, -0.6538F));

		PartDefinition cube_r61 = Chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(53, 41).mirror().addBox(-0.5316F, -0.7919F, -0.2252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(32, 53).mirror().addBox(-0.5316F, -0.2419F, -0.2252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1186F, 3.3052F, -4.0556F, 0.7957F, -0.1204F, -0.6538F));

		PartDefinition cube_r62 = Chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(25, 58).mirror().addBox(-0.5316F, -0.0273F, -0.6202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(20, 58).mirror().addBox(-0.5316F, -0.6273F, -0.6202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.1186F, 3.3052F, -4.0556F, 1.376F, -0.1204F, -0.6538F));

		PartDefinition cube_r63 = Chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(5, 58).mirror().addBox(-0.5316F, -0.6871F, -0.7749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1186F, 3.3052F, -4.0556F, 0.3638F, -0.1204F, -0.6538F));

		PartDefinition cube_r64 = Chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(15, 53).mirror().addBox(-0.5316F, -1.0384F, -0.9226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.1186F, 3.3052F, -4.0556F, -0.042F, -0.1204F, -0.6538F));

		PartDefinition cube_r65 = Chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(37, 25).mirror().addBox(-2.375F, 0.0F, -0.425F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8103F, 3.8663F, -1.2627F, 0.2282F, 0.624F, 0.5409F));

		PartDefinition cube_r66 = Chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(46, 25).mirror().addBox(-1.575F, 0.0F, -0.525F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9702F, 3.8671F, -1.6294F, 0.4549F, -0.0193F, 0.5611F));

		PartDefinition cube_r67 = Chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(64, 46).addBox(2.306F, -1.8721F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.4249F, -3.6059F, -0.2875F, -0.4186F, 1.51F));

		PartDefinition cube_r68 = Chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(5, 47).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.4249F, -3.6059F, -0.0145F, -0.5028F, 0.9112F));

		PartDefinition cube_r69 = Chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(50, 64).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.4249F, -3.6059F, 0.2239F, -0.4272F, 0.3894F));

		PartDefinition cube_r70 = Chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(29, 46).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2249F, -1.6059F, 0.1345F, -0.3912F, 0.8466F));

		PartDefinition cube_r71 = Chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(45, 64).addBox(2.306F, -1.8721F, -0.3859F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2249F, -1.6059F, -0.0981F, -0.4014F, 1.4343F));

		PartDefinition cube_r72 = Chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(64, 44).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2249F, -1.6059F, 0.2923F, -0.2649F, 0.3661F));

		PartDefinition cube_r73 = Chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(50, 58).addBox(-0.6097F, -0.2503F, 1.4613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(37, 5).addBox(-0.6097F, -0.2503F, -0.1387F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(1.5372F, 0.8437F, -3.5381F, 0.3006F, 0.0896F, -0.1072F));

		PartDefinition cube_r74 = Chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(17, 38).addBox(-0.6097F, -0.0503F, -0.3387F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.5179F, 1.6431F, -4.7046F, 0.737F, 0.0896F, -0.1072F));

		PartDefinition cube_r75 = Chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(10, 54).addBox(-0.4684F, -1.2241F, -0.6162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1186F, 3.3052F, -4.0556F, 0.2634F, 0.1204F, 0.6538F));

		PartDefinition cube_r76 = Chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(53, 41).addBox(-0.4684F, -0.7919F, -0.2252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(32, 53).addBox(-0.4684F, -0.2419F, -0.2252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1186F, 3.3052F, -4.0556F, 0.7957F, 0.1204F, 0.6538F));

		PartDefinition cube_r77 = Chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(25, 58).addBox(-0.4684F, -0.0273F, -0.6202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(20, 58).addBox(-0.4684F, -0.6273F, -0.6202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.1186F, 3.3052F, -4.0556F, 1.376F, 0.1204F, 0.6538F));

		PartDefinition cube_r78 = Chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(5, 58).addBox(-0.4684F, -0.6871F, -0.7749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1186F, 3.3052F, -4.0556F, 0.3638F, 0.1204F, 0.6538F));

		PartDefinition cube_r79 = Chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(15, 53).addBox(-0.4684F, -1.0384F, -0.9226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(1.1186F, 3.3052F, -4.0556F, -0.042F, 0.1204F, 0.6538F));

		PartDefinition cube_r80 = Chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(54, 21).addBox(-0.6097F, -0.7122F, 0.3358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(57, 56).addBox(-0.6097F, -0.7122F, -0.2642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7097F, 2.8011F, -3.9615F, 1.8103F, 0.0896F, -0.1072F));

		PartDefinition cube_r81 = Chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(15, 59).addBox(-0.9201F, 0.1609F, -0.8392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(57, 53).addBox(-0.9201F, -0.4391F, -0.8392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1186F, 3.3052F, -4.0556F, 1.15F, -0.008F, -0.0367F));

		PartDefinition cube_r82 = Chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(22, 32).addBox(-0.425F, 0.0F, -0.425F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8103F, 3.8663F, -1.2627F, 0.2453F, -0.9668F, -0.584F));

		PartDefinition cube_r83 = Chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(37, 25).addBox(-0.625F, 0.0F, -0.425F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8103F, 3.8663F, -1.2627F, 0.2282F, -0.624F, -0.5409F));

		PartDefinition cube_r84 = Chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(46, 25).addBox(-0.425F, 0.0F, -0.525F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9702F, 3.8671F, -1.6294F, 0.4549F, 0.0193F, -0.5611F));

		PartDefinition cube_r85 = Chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 38).addBox(0.125F, -0.9F, -1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4F, 4.7573F, -2.5355F, -0.2896F, 0.0823F, -0.7592F));

		PartDefinition cube_r86 = Chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(37, 21).addBox(-0.2F, -0.9F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.4F, 4.7573F, -2.5355F, -0.291F, -0.1268F, -0.6969F));

		PartDefinition cube_r87 = Chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(37, 17).addBox(-0.5F, -0.9F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.7573F, -2.5355F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r88 = Chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(40, 31).addBox(-0.2F, -0.9F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9553F, 4.6702F, -0.8733F, -0.1869F, 0.1279F, -0.6472F));

		PartDefinition cube_r89 = Chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(39, 0).addBox(-0.1F, -0.9F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.3F, 5.1173F, -0.9765F, -0.1869F, -0.1294F, -0.5987F));

		PartDefinition cube_r90 = Chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(38, 36).addBox(-0.5F, -0.9F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 5.1173F, -0.9765F, -0.2269F, 0.0F, 0.0F));

		PartDefinition leftArm1 = Chest.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0936F, 2.8441F, -3.9682F, 1.3052F, 0.3427F, -0.0459F));

		PartDefinition cube_r91 = leftArm1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, -0.575F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0059F, 0.0029F, 0.1845F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftArm1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(40, 57).addBox(-0.5F, -0.025F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(57, 30).addBox(-0.5F, -0.625F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.0059F, 1.8659F, -0.5986F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftArm1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(52, 52).addBox(-0.5F, 0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(43, 44).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.0059F, 0.4353F, -0.1475F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.03F, 2.4282F, -1.155F, -2.5312F, -0.2236F, 0.0135F));

		PartDefinition cube_r94 = leftArm2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(47, 31).addBox(-0.5F, -0.4118F, -0.4188F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(-0.05F, 1.163F, 0.2391F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r95 = leftArm2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(12, 47).addBox(-0.5F, -1.587F, -0.4108F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.05F, 1.163F, 0.2391F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r96 = leftArm2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, -0.325F, -0.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.05F, 1.2977F, -0.072F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r97 = leftArm2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(45, 39).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.05F, 1.2977F, -0.072F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(30, 56).addBox(-1.0F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(30, 56).addBox(-1.0F, 0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(38, 44).addBox(-1.0F, 1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(0.1607F, 2.5598F, 0.2969F, 1.2186F, -0.331F, 0.2542F));

		PartDefinition cube_r98 = leftHand.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(33, 36).addBox(-1.0F, -0.15F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.0F, -0.05F, 0.0F, 0.2916F, 0.0046F, -0.0168F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(44, 21).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.0797F, -0.1647F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightArm1 = Chest.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0936F, 2.8441F, -3.9682F, 1.6979F, -0.3427F, 0.0459F));

		PartDefinition cube_r99 = rightArm1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.5F, -0.575F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 0.0029F, 0.1845F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightArm1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(40, 57).mirror().addBox(-0.5F, -0.025F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(57, 30).mirror().addBox(-0.5F, -0.625F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 1.8659F, -0.5986F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightArm1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(52, 52).mirror().addBox(-0.5F, 0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(43, 44).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 0.4353F, -0.1475F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.03F, 2.4282F, -1.155F, -2.5312F, 0.2236F, -0.0135F));

		PartDefinition cube_r102 = rightArm2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(47, 31).mirror().addBox(-0.5F, -0.4118F, -0.4188F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.163F, 0.2391F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightArm2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(12, 47).mirror().addBox(-0.5F, -1.587F, -0.4108F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.163F, 0.2391F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightArm2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.5F, -0.325F, -0.725F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 1.2977F, -0.072F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightArm2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(45, 39).mirror().addBox(-0.5F, -1.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 1.2977F, -0.072F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(30, 56).mirror().addBox(0.0F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(30, 56).mirror().addBox(0.0F, 0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(38, 44).mirror().addBox(0.0F, 1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.017F)).mirror(false), PartPose.offsetAndRotation(-0.1607F, 2.5598F, 0.2969F, 1.2186F, 0.331F, -0.2542F));

		PartDefinition cube_r106 = rightHand.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(33, 36).mirror().addBox(0.0F, -0.15F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.05F, 0.0F, 0.2916F, -0.0046F, 0.0168F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(44, 21).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0797F, -0.1647F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Neck3 = Chest.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6493F, -4.6507F, -0.0025F, 0.0F, 0.0F));

		PartDefinition cube_r107 = Neck3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(25, 66).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3201F, -0.2473F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r108 = Neck3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(44, 12).mirror().addBox(-0.2996F, -0.5133F, -0.1991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1731F, -0.1631F, -0.6568F, -0.6975F, -0.4485F, 0.1272F));

		PartDefinition cube_r109 = Neck3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(44, 12).addBox(-0.7004F, -0.5133F, -0.1991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1731F, -0.1631F, -0.6568F, -0.6975F, 0.4485F, -0.1272F));

		PartDefinition cube_r110 = Neck3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(44, 8).addBox(-0.5F, -0.9106F, 0.3841F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, -0.2072F, -2.2332F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3721F, -1.3477F, 0.019F, 0.3926F, 0.0073F));

		PartDefinition cube_r111 = Neck2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(64, 65).addBox(0.0F, 0.425F, 2.35F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 65).addBox(0.0F, 0.425F, 0.35F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 10).addBox(-0.5F, 0.6F, 0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.8842F, -2.0138F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r112 = Neck2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(24, 38).mirror().addBox(-0.0124F, -0.5975F, -0.2239F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4992F, -0.2535F, -0.8133F, -0.92F, -0.1535F, 0.071F));

		PartDefinition cube_r113 = Neck2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(37, 9).mirror().addBox(-0.3377F, -0.5905F, -0.2016F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.176F, -1.5196F, -2.3175F, -1.0073F, -0.1535F, 0.071F));

		PartDefinition cube_r114 = Neck2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(24, 38).addBox(-0.9876F, -0.5975F, -0.2239F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4992F, -0.2535F, -0.8133F, -0.92F, 0.1535F, -0.071F));

		PartDefinition cube_r115 = Neck2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(37, 9).addBox(-0.6623F, -0.5905F, -0.2016F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.176F, -1.5196F, -2.3175F, -1.0073F, 0.1535F, -0.071F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6168F, -2.1965F, -0.659F, 0.3391F, 0.0068F));

		PartDefinition cube_r116 = Neck1.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(47, 55).addBox(-0.5F, -0.45F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, -0.2985F, -1.4508F, -0.1658F, 0.0F, 0.0F));

		PartDefinition neck = Neck1.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3316F, -0.759F, -0.3539F, 0.2172F, 0.1967F));

		PartDefinition cube_r117 = neck.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(47, 52).mirror().addBox(-0.21F, -0.4352F, -0.2127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(56, 12).mirror().addBox(-0.21F, -0.4352F, 0.2873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.2497F, -0.4379F, -0.2524F, -0.1535F, 0.071F));

		PartDefinition cube_r118 = neck.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(10, 63).mirror().addBox(-0.21F, -0.4352F, -0.2127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(60, 62).mirror().addBox(-0.21F, -0.4352F, 0.2873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.4497F, -2.1379F, -0.2524F, -0.1535F, 0.071F));

		PartDefinition cube_r119 = neck.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(47, 52).addBox(-0.79F, -0.4352F, -0.2127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(56, 12).addBox(-0.79F, -0.4352F, 0.2873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3F, 0.2497F, -0.4379F, -0.2524F, 0.1535F, -0.071F));

		PartDefinition cube_r120 = neck.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(65, 62).addBox(0.0F, -0.175F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.6F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r121 = neck.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(33, 66).addBox(0.0F, -0.1F, -0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.3F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r122 = neck.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(28, 15).addBox(-0.5F, -0.301F, -2.6918F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0331F, -0.0918F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r123 = neck.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(10, 63).addBox(-0.79F, -0.4352F, -0.2127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 62).addBox(-0.79F, -0.4352F, 0.2873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3F, 0.4497F, -2.1379F, -0.2524F, 0.1535F, -0.071F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3591F, -2.53F, 0.3646F, 0.2865F, 0.1074F));

		PartDefinition cube_r124 = neck4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(58, 65).addBox(0.0F, -0.275F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.3F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r125 = neck4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(10, 37).addBox(-0.5F, -0.301F, -1.6918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, 0.0331F, -0.0919F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r126 = neck4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(56, 3).mirror().addBox(-0.21F, -0.4352F, -0.2127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(56, 0).mirror().addBox(-0.21F, -0.4352F, 0.2873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.4497F, -1.1379F, -0.2524F, -0.1535F, 0.071F));

		PartDefinition cube_r127 = neck4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(56, 3).addBox(-0.79F, -0.4352F, -0.2127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(56, 0).addBox(-0.79F, -0.4352F, 0.2873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3F, 0.4497F, -1.1379F, -0.2524F, 0.1535F, -0.071F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2653F, -1.6061F, -0.0869F, 0.0983F, 0.1228F));

		PartDefinition cube_r128 = neck5.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(65, 59).addBox(0.0F, -0.275F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.3F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r129 = neck5.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(37, 13).addBox(-0.5F, -0.301F, -1.6918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0331F, -0.0919F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r130 = neck5.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(56, 9).mirror().addBox(-0.21F, -0.4352F, -0.2127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(56, 6).mirror().addBox(-0.21F, -0.4352F, 0.2873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.4497F, -1.1379F, -0.2524F, -0.1535F, 0.071F));

		PartDefinition cube_r131 = neck5.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(56, 9).addBox(-0.79F, -0.4352F, -0.2127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(56, 6).addBox(-0.79F, -0.4352F, 0.2873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3F, 0.4497F, -1.1379F, -0.2524F, 0.1535F, -0.071F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2427F, -1.6313F, 0.0226F, 0.0843F, 0.2628F));

		PartDefinition cube_r132 = neck6.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(61, 65).addBox(0.0F, -0.275F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.3F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r133 = neck6.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(28, 5).addBox(-0.5F, -0.301F, -2.6918F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, 0.0331F, -0.0919F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r134 = neck6.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(54, 18).mirror().addBox(-0.21F, -0.4352F, -0.2127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(54, 15).mirror().addBox(-0.21F, -0.4352F, 0.2873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.4497F, -1.1379F, -0.2524F, -0.1535F, 0.071F));

		PartDefinition cube_r135 = neck6.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(54, 18).addBox(-0.79F, -0.4352F, -0.2127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(54, 15).addBox(-0.79F, -0.4352F, 0.2873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3F, 0.4497F, -1.1379F, -0.2524F, 0.1535F, -0.071F));

		PartDefinition Head = neck6.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5751F, -2.2048F, 0.0035F, 0.2305F, 0.3412F));

		PartDefinition cube_r136 = Head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(40, 60).mirror().addBox(-0.4F, -0.275F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false)
				.texOffs(40, 60).mirror().addBox(-0.4F, -0.575F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.5508F, -0.5027F, -0.8097F, 1.6426F, -0.0721F, -0.0156F));

		PartDefinition cube_r137 = Head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(55, 59).mirror().addBox(-0.5797F, -0.4177F, -2.0836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(59, 42).mirror().addBox(-0.5797F, -0.4177F, -1.8836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(30, 59).mirror().addBox(-0.5797F, -0.4177F, -1.6836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.0375F, 0.8578F, -2.3387F, 0.4595F, -0.0166F, -0.0244F));

		PartDefinition cube_r138 = Head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(59, 45).mirror().addBox(-0.6279F, -1.1783F, -0.6203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.404F)).mirror(false), PartPose.offsetAndRotation(-0.0375F, 0.8578F, -2.3387F, 2.0316F, -0.077F, -0.0194F));

		PartDefinition cube_r139 = Head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(59, 18).mirror().addBox(-0.5797F, -1.3334F, -0.6203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(10, 57).mirror().addBox(-0.5797F, -1.5334F, -0.6203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.0375F, 0.8578F, -2.3387F, 2.0304F, -0.0301F, 0.0039F));

		PartDefinition cube_r140 = Head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(64, 15).mirror().addBox(-0.4878F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2722F, 1.0207F, -2.2875F, 2.3023F, -0.0076F, 0.086F));

		PartDefinition cube_r141 = Head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(15, 62).mirror().addBox(-0.325F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.4626F, 0.8219F, -2.0757F, 2.3011F, -0.1176F, -0.2104F));

		PartDefinition cube_r142 = Head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(62, 48).mirror().addBox(-0.597F, 0.3732F, -0.6138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(62, 51).mirror().addBox(-0.497F, -0.0768F, -0.5138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.421F, 0.3196F, -1.2944F, 1.6811F, -0.0737F, 0.0039F));

		PartDefinition cube_r143 = Head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(40, 60).mirror().addBox(-0.597F, -0.3519F, -0.3638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.4731F, 0.1899F, -0.5813F, 1.3757F, -0.0737F, 0.0039F));

		PartDefinition cube_r144 = Head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(51, 6).mirror().addBox(-0.1375F, 0.386F, 0.0406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, -0.5482F, -1.0246F, 0.4712F, -0.1047F, 0.0F));

		PartDefinition cube_r145 = Head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(64, 24).mirror().addBox(-0.597F, -0.4869F, -0.435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(64, 21).mirror().addBox(-0.472F, -0.4869F, -0.435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(62, 54).mirror().addBox(-0.497F, -0.6869F, -0.36F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.421F, 0.3196F, -1.2944F, 0.3721F, -0.0737F, 0.0039F));

		PartDefinition cube_r146 = Head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(20, 55).mirror().addBox(-0.522F, -0.9365F, -0.3222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.421F, 0.3196F, -1.2944F, 2.5713F, -0.0737F, 0.0039F));

		PartDefinition cube_r147 = Head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(55, 62).mirror().addBox(-0.497F, -0.4465F, -0.6554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.421F, 0.3196F, -1.2944F, -0.5005F, -0.0737F, 0.0039F));

		PartDefinition cube_r148 = Head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(64, 18).mirror().addBox(-0.497F, -0.334F, -0.1704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.421F, 0.3196F, -1.2944F, 1.0703F, -0.0737F, 0.0039F));

		PartDefinition cube_r149 = Head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(57, 50).mirror().addBox(-0.497F, -0.1681F, -0.6791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(59, 21).mirror().addBox(-0.497F, -0.2681F, -0.6791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.421F, 0.3196F, -1.2944F, 1.9429F, -0.0737F, 0.0039F));

		PartDefinition cube_r150 = Head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.0719F, -0.7993F, 0.0805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(25, 61).mirror().addBox(-0.0719F, -0.7993F, -0.2195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.6888F, 1.0632F, -1.9666F, 0.3569F, -0.0848F, -0.0109F));

		PartDefinition cube_r151 = Head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(61, 3).mirror().addBox(-0.5305F, -0.1565F, -1.8821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0375F, 0.8578F, -2.3387F, 0.3372F, -0.0163F, -0.0274F));

		PartDefinition cube_r152 = Head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(62, 30).mirror().addBox(-0.5055F, -0.2112F, -1.3803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0375F, 0.8578F, -2.3387F, 0.3809F, -0.0163F, -0.0274F));

		PartDefinition cube_r153 = Head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(5, 64).mirror().addBox(-0.5423F, -0.1947F, -0.8447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0375F, 0.8578F, -2.3387F, 0.3842F, -0.1384F, -0.0277F));

		PartDefinition cube_r154 = Head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(40, 63).mirror().addBox(-0.597F, -0.3132F, -0.6469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0625F, 0.8578F, -2.0637F, 0.4691F, -0.0734F, 0.0588F));

		PartDefinition cube_r155 = Head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(38, 40).mirror().addBox(-0.5797F, -0.2135F, -2.1459F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.399F)).mirror(false), PartPose.offsetAndRotation(-0.0375F, 0.8578F, -2.3387F, 0.3373F, -0.0166F, -0.0244F));

		PartDefinition cube_r156 = Head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(59, 15).mirror().addBox(-0.5797F, -0.4301F, -1.4845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(58, 39).mirror().addBox(-0.5797F, -0.4301F, -1.2845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.0375F, 0.8578F, -2.3387F, 0.4726F, -0.0166F, -0.0244F));

		PartDefinition cube_r157 = Head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(50, 61).mirror().addBox(-0.6229F, -0.3017F, -0.8314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(45, 61).mirror().addBox(-0.6229F, -0.3017F, -0.7064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.0375F, 0.8578F, -2.3387F, 0.4174F, -0.1749F, -0.0857F));

		PartDefinition cube_r158 = Head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(31, 42).mirror().addBox(-0.6229F, -0.4649F, -0.828F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(-0.0375F, 0.8578F, -2.3387F, 0.605F, -0.1749F, -0.0857F));

		PartDefinition cube_r159 = Head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(52, 30).mirror().addBox(-0.5923F, -0.4246F, -1.1079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0375F, 0.8578F, -2.3387F, 0.5457F, -0.1384F, -0.0277F));

		PartDefinition cube_r160 = Head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(63, 39).mirror().addBox(-0.6139F, -0.4699F, -0.6456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.0625F, 0.8578F, -2.0637F, 0.4199F, -0.1101F, 0.0014F));

		PartDefinition cube_r161 = Head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(45, 58).mirror().addBox(-0.5936F, -0.2774F, -1.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0375F, 0.8578F, -2.3387F, 0.3497F, -0.1379F, -0.0315F));

		PartDefinition cube_r162 = Head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(35, 63).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2701F, 0.9091F, -1.6514F, 0.4732F, -0.0865F, -0.0112F));

		PartDefinition cube_r163 = Head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(61, 0).mirror().addBox(-0.6321F, -0.5F, -0.2125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.5335F, 0.3573F, -1.9285F, 0.8342F, 0.1152F, 0.2317F));

		PartDefinition cube_r164 = Head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(42, 27).mirror().addBox(-0.517F, -0.5F, -1.616F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.405F)).mirror(false), PartPose.offsetAndRotation(-0.6035F, 0.1388F, -1.7353F, 0.8679F, -0.2675F, -0.1969F));

		PartDefinition cube_r165 = Head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.6139F, -0.6105F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0625F, 0.8578F, -2.0637F, 0.7297F, -0.1101F, 0.0014F));

		PartDefinition cube_r166 = Head.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(52, 55).mirror().addBox(-0.425F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-0.265F, 0.6614F, -1.9487F, 0.8766F, -0.1598F, -0.2351F));

		PartDefinition cube_r167 = Head.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(20, 64).mirror().addBox(-0.3F, -0.175F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4936F, 0.2277F, -1.9672F, 0.8533F, 0.0227F, -0.0313F));

		PartDefinition cube_r168 = Head.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(54, 47).mirror().addBox(-0.497F, -0.7381F, -0.6793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.421F, 0.3196F, -1.2944F, 1.8731F, -0.0737F, 0.0039F));

		PartDefinition cube_r169 = Head.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(50, 38).mirror().addBox(-0.1375F, 0.0357F, 1.3183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(50, 38).addBox(0.4625F, 0.0357F, 1.3183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6625F, 0.4893F, -2.9377F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r170 = Head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(32, 50).mirror().addBox(-0.1375F, -0.1702F, -0.2107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, -0.5482F, -1.0246F, 0.1134F, -0.1047F, 0.0F));

		PartDefinition cube_r171 = Head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(51, 12).mirror().addBox(-0.9797F, -0.8429F, -0.8514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false)
				.texOffs(51, 12).addBox(-0.3797F, -0.8429F, -0.8514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.1797F, 0.5306F, -0.5268F, 0.3621F, 0.0F, 0.0F));

		PartDefinition cube_r172 = Head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(37, 51).mirror().addBox(-0.1375F, 0.3206F, -0.1536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, -0.5482F, -1.0246F, 0.1221F, -0.1047F, 0.0F));

		PartDefinition cube_r173 = Head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(63, 39).addBox(-0.3861F, -0.4699F, -0.6456F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0625F, 0.8578F, -2.0637F, 0.4199F, 0.1101F, -0.0014F));

		PartDefinition cube_r174 = Head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(31, 42).addBox(-0.3771F, -0.4649F, -0.828F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(0.0375F, 0.8578F, -2.3387F, 0.605F, 0.1749F, 0.0857F));

		PartDefinition cube_r175 = Head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(50, 61).addBox(-0.3771F, -0.3017F, -0.8314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(45, 61).addBox(-0.3771F, -0.3017F, -0.7064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.0375F, 0.8578F, -2.3387F, 0.4174F, 0.1749F, 0.0857F));

		PartDefinition cube_r176 = Head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(52, 30).addBox(-0.4077F, -0.4246F, -1.1079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0375F, 0.8578F, -2.3387F, 0.5457F, 0.1384F, 0.0277F));

		PartDefinition cube_r177 = Head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(45, 58).addBox(-0.4064F, -0.2774F, -1.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0375F, 0.8578F, -2.3387F, 0.3497F, 0.1379F, 0.0315F));

		PartDefinition cube_r178 = Head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(61, 3).addBox(-0.4695F, -0.1565F, -1.8821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0375F, 0.8578F, -2.3387F, 0.3372F, 0.0163F, 0.0274F));

		PartDefinition cube_r179 = Head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(62, 30).addBox(-0.4945F, -0.2112F, -1.3803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0375F, 0.8578F, -2.3387F, 0.3809F, 0.0163F, 0.0274F));

		PartDefinition cube_r180 = Head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(5, 64).addBox(-0.4577F, -0.1947F, -0.8447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0375F, 0.8578F, -2.3387F, 0.3842F, 0.1384F, 0.0277F));

		PartDefinition cube_r181 = Head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(40, 63).addBox(-0.403F, -0.3132F, -0.6469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0625F, 0.8578F, -2.0637F, 0.4691F, 0.0734F, -0.0588F));

		PartDefinition cube_r182 = Head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(35, 63).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2701F, 0.9091F, -1.6514F, 0.4732F, 0.0865F, 0.0112F));

		PartDefinition cube_r183 = Head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(55, 59).addBox(-0.4203F, -0.4177F, -2.0836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(59, 42).addBox(-0.4203F, -0.4177F, -1.8836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(30, 59).addBox(-0.4203F, -0.4177F, -1.6836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0375F, 0.8578F, -2.3387F, 0.4595F, 0.0166F, 0.0244F));

		PartDefinition cube_r184 = Head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(38, 40).addBox(-0.4203F, -0.2135F, -2.1459F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.399F)), PartPose.offsetAndRotation(0.0375F, 0.8578F, -2.3387F, 0.3373F, 0.0166F, 0.0244F));

		PartDefinition cube_r185 = Head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(59, 15).addBox(-0.4203F, -0.4301F, -1.4845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(58, 39).addBox(-0.4203F, -0.4301F, -1.2845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0375F, 0.8578F, -2.3387F, 0.4726F, 0.0166F, 0.0244F));

		PartDefinition cube_r186 = Head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(61, 0).addBox(-0.3679F, -0.5F, -0.2125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.5335F, 0.3573F, -1.9285F, 0.8342F, -0.1152F, -0.2317F));

		PartDefinition cube_r187 = Head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(42, 27).addBox(-0.483F, -0.5F, -1.616F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.405F)), PartPose.offsetAndRotation(0.6035F, 0.1388F, -1.7353F, 0.8679F, 0.2675F, 0.1969F));

		PartDefinition cube_r188 = Head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 56).addBox(-0.3861F, -0.6105F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0625F, 0.8578F, -2.0637F, 0.7297F, 0.1101F, -0.0014F));

		PartDefinition cube_r189 = Head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(52, 55).addBox(-0.575F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(0.265F, 0.6614F, -1.9487F, 0.8766F, 0.1598F, 0.2351F));

		PartDefinition cube_r190 = Head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(20, 64).addBox(-0.7F, -0.175F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4936F, 0.2277F, -1.9672F, 0.8533F, -0.0227F, 0.0313F));

		PartDefinition cube_r191 = Head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(55, 62).addBox(-0.503F, -0.4465F, -0.6554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.421F, 0.3196F, -1.2944F, -0.5005F, 0.0737F, -0.0039F));

		PartDefinition cube_r192 = Head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(64, 24).addBox(-0.403F, -0.4869F, -0.435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(64, 21).addBox(-0.528F, -0.4869F, -0.435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 54).addBox(-0.503F, -0.6869F, -0.36F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.421F, 0.3196F, -1.2944F, 0.3721F, 0.0737F, -0.0039F));

		PartDefinition cube_r193 = Head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(64, 18).addBox(-0.503F, -0.334F, -0.1704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.421F, 0.3196F, -1.2944F, 1.0703F, 0.0737F, -0.0039F));

		PartDefinition cube_r194 = Head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(59, 45).addBox(-0.3721F, -1.1783F, -0.6203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.404F)), PartPose.offsetAndRotation(0.0375F, 0.8578F, -2.3387F, 2.0316F, 0.077F, 0.0194F));

		PartDefinition cube_r195 = Head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(59, 18).addBox(-0.4203F, -1.3334F, -0.6203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(10, 57).addBox(-0.4203F, -1.5334F, -0.6203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0375F, 0.8578F, -2.3387F, 2.0304F, 0.0301F, -0.0039F));

		PartDefinition cube_r196 = Head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(64, 15).addBox(-0.5122F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2722F, 1.0207F, -2.2875F, 2.3023F, 0.0076F, -0.086F));

		PartDefinition cube_r197 = Head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(15, 62).addBox(-0.675F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.4626F, 0.8219F, -2.0757F, 2.3011F, 0.1176F, 0.2104F));

		PartDefinition cube_r198 = Head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(62, 48).addBox(-0.403F, 0.3732F, -0.6138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(62, 51).addBox(-0.503F, -0.0768F, -0.5138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.421F, 0.3196F, -1.2944F, 1.6811F, 0.0737F, -0.0039F));

		PartDefinition cube_r199 = Head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(40, 60).addBox(-0.6F, -0.275F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F))
				.texOffs(40, 60).addBox(-0.6F, -0.575F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.5508F, -0.5027F, -0.8097F, 1.6426F, 0.0721F, 0.0156F));

		PartDefinition cube_r200 = Head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(40, 60).addBox(-0.403F, -0.3519F, -0.3638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.4731F, 0.1899F, -0.5813F, 1.3757F, 0.0737F, -0.0039F));

		PartDefinition cube_r201 = Head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(57, 50).addBox(-0.503F, -0.1681F, -0.6791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(59, 21).addBox(-0.503F, -0.2681F, -0.6791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.421F, 0.3196F, -1.2944F, 1.9429F, 0.0737F, -0.0039F));

		PartDefinition cube_r202 = Head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(20, 55).addBox(-0.478F, -0.9365F, -0.3222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.421F, 0.3196F, -1.2944F, 2.5713F, 0.0737F, -0.0039F));

		PartDefinition cube_r203 = Head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(54, 47).addBox(-0.503F, -0.7381F, -0.6793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.421F, 0.3196F, -1.2944F, 1.8731F, 0.0737F, -0.0039F));

		PartDefinition cube_r204 = Head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(0, 62).addBox(-0.9281F, -0.7993F, 0.0805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(25, 61).addBox(-0.9281F, -0.7993F, -0.2195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.6888F, 1.0632F, -1.9666F, 0.3569F, 0.0848F, 0.0109F));

		PartDefinition cube_r205 = Head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(32, 50).addBox(-0.8625F, -0.1702F, -0.2107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.6625F, -0.5482F, -1.0246F, 0.1134F, 0.1047F, 0.0F));

		PartDefinition cube_r206 = Head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(50, 35).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(50, 35).addBox(0.1901F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3451F, -0.2287F, -0.5768F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r207 = Head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(51, 6).addBox(-0.8625F, 0.386F, 0.0406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6625F, -0.5482F, -1.0246F, 0.4712F, 0.1047F, 0.0F));

		PartDefinition cube_r208 = Head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(42, 51).mirror().addBox(-0.475F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(42, 51).addBox(0.2285F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.3767F, -0.1759F, -0.2755F, 0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r209 = Head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(37, 51).addBox(-0.8625F, 0.3206F, -0.1536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.6625F, -0.5482F, -1.0246F, 0.1221F, 0.1047F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4024F, -0.1939F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r210 = Jaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(49, 49).mirror().addBox(-0.6323F, -0.4745F, -1.0913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(49, 46).mirror().addBox(-0.6323F, -0.4745F, -1.2913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(49, 16).mirror().addBox(-0.5573F, -0.3995F, -1.3413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3477F, -0.1567F, 0.7159F, -0.0431F, -0.0249F));

		PartDefinition cube_r211 = Jaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(10, 51).mirror().addBox(-0.497F, -0.4722F, -0.6735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false)
				.texOffs(51, 9).mirror().addBox(-0.497F, -0.4722F, -0.3735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(-0.3123F, 1.2294F, -1.2497F, 0.6839F, -0.2775F, -0.1293F));

		PartDefinition cube_r212 = Jaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(17, 50).mirror().addBox(-0.497F, -0.4317F, -0.6442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 50).mirror().addBox(-0.497F, -0.4317F, -0.3442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.3123F, 1.2294F, -1.2497F, 0.5442F, -0.2775F, -0.1293F));

		PartDefinition cube_r213 = Jaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-0.5573F, -0.4722F, -1.0632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3477F, -0.1567F, 0.8163F, -0.0431F, -0.0249F));

		PartDefinition cube_r214 = Jaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(51, 3).mirror().addBox(-0.5573F, -0.5802F, -0.7919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3477F, -0.1567F, 1.0562F, -0.0431F, -0.0249F));

		PartDefinition cube_r215 = Jaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(54, 27).mirror().addBox(-0.4105F, -0.268F, -0.6003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.346F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.8477F, -0.9567F, 0.696F, -0.3592F, -0.1767F));

		PartDefinition cube_r216 = Jaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(39, 48).mirror().addBox(-0.497F, -0.5902F, -0.5511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.3123F, 1.2294F, -1.2497F, 0.5748F, -0.2775F, -0.1293F));

		PartDefinition cube_r217 = Jaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(5, 49).mirror().addBox(-0.3875F, -0.475F, 0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(49, 22).mirror().addBox(-0.3625F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(26, 34).mirror().addBox(-0.3625F, -0.325F, -0.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1849F, 1.9453F, -2.6532F, 0.5471F, -0.1053F, -0.0525F));

		PartDefinition cube_r218 = Jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(49, 27).mirror().addBox(-0.2875F, -0.6F, 0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(49, 19).mirror().addBox(-0.2875F, -0.6F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(44, 48).mirror().addBox(-0.2875F, -0.425F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(48, 43).mirror().addBox(-0.2875F, -0.425F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)).mirror(false), PartPose.offsetAndRotation(-0.2424F, 2.2909F, -3.0312F, 0.5444F, -0.0299F, -0.0181F));

		PartDefinition cube_r219 = Jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(5, 52).mirror().addBox(-0.4105F, -0.3914F, -0.6089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 0.8477F, -0.9567F, 0.7179F, -0.3592F, -0.1767F));

		PartDefinition cube_r220 = Jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(19, 34).mirror().addBox(-0.5573F, -0.5224F, -1.2521F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3477F, -0.1567F, 0.7072F, -0.0431F, -0.0249F));

		PartDefinition cube_r221 = Jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(49, 49).addBox(-0.3677F, -0.4745F, -1.0913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(49, 46).addBox(-0.3677F, -0.4745F, -1.2913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(49, 16).addBox(-0.4427F, -0.3995F, -1.3413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5F, 0.3477F, -0.1567F, 0.7159F, 0.0431F, 0.0249F));

		PartDefinition cube_r222 = Jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(51, 0).addBox(-0.4427F, -0.4722F, -1.0632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(0.5F, 0.3477F, -0.1567F, 0.8163F, 0.0431F, 0.0249F));

		PartDefinition cube_r223 = Jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(51, 3).addBox(-0.4427F, -0.5802F, -0.7919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5F, 0.3477F, -0.1567F, 1.0562F, 0.0431F, 0.0249F));

		PartDefinition cube_r224 = Jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(54, 27).addBox(-0.5895F, -0.268F, -0.6003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.346F)), PartPose.offsetAndRotation(0.575F, 0.8477F, -0.9567F, 0.696F, 0.3592F, 0.1767F));

		PartDefinition cube_r225 = Jaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(39, 48).addBox(-0.503F, -0.5902F, -0.5511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.3123F, 1.2294F, -1.2497F, 0.5748F, 0.2775F, 0.1293F));

		PartDefinition cube_r226 = Jaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(5, 49).addBox(-0.6125F, -0.475F, 0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(49, 22).addBox(-0.6375F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(26, 34).addBox(-0.6375F, -0.325F, -0.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1849F, 1.9453F, -2.6532F, 0.5471F, 0.1053F, 0.0525F));

		PartDefinition cube_r227 = Jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(49, 27).addBox(-0.7125F, -0.6F, 0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(49, 19).addBox(-0.7125F, -0.6F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(44, 48).addBox(-0.7125F, -0.425F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(48, 43).addBox(-0.7125F, -0.425F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)), PartPose.offsetAndRotation(0.2424F, 2.2909F, -3.0312F, 0.5444F, 0.0299F, 0.0181F));

		PartDefinition cube_r228 = Jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(17, 50).addBox(-0.503F, -0.4317F, -0.6442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 50).addBox(-0.503F, -0.4317F, -0.3442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3123F, 1.2294F, -1.2497F, 0.5442F, 0.2775F, 0.1293F));

		PartDefinition cube_r229 = Jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(10, 51).addBox(-0.503F, -0.4722F, -0.6735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F))
				.texOffs(51, 9).addBox(-0.503F, -0.4722F, -0.3735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.3123F, 1.2294F, -1.2497F, 0.6839F, 0.2775F, 0.1293F));

		PartDefinition cube_r230 = Jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(5, 52).addBox(-0.5895F, -0.3914F, -0.6089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(0.575F, 0.8477F, -0.9567F, 0.7179F, 0.3592F, 0.1767F));

		PartDefinition cube_r231 = Jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(19, 34).addBox(-0.4427F, -0.5224F, -1.2521F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.5F, 0.3477F, -0.1567F, 0.7072F, 0.0431F, 0.0249F));

		return LayerDefinition.create(meshdefinition, 70, 70);
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