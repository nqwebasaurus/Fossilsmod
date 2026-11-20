package fossils.fossils.client.blockentity.model.vampyrum;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class VampyrumFossilModel extends SkullModelBase {
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
	private final ModelPart bone;
	private final ModelPart bone6;
	private final ModelPart body2;
	private final ModelPart body5;
	private final ModelPart body;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body6;
	private final ModelPart chest;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart manus;
	private final ModelPart digit2;
	private final ModelPart digit2phalanx;
	private final ModelPart digit2phalanx2;
	private final ModelPart digit3;
	private final ModelPart digit2phalanx3;
	private final ModelPart digit2phalanx4;
	private final ModelPart digit4;
	private final ModelPart digit2phalanx5;
	private final ModelPart digit2phalanx6;
	private final ModelPart digit;
	private final ModelPart digit5;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart manus2;
	private final ModelPart digit6;
	private final ModelPart digit2phalanx7;
	private final ModelPart digit2phalanx8;
	private final ModelPart digit7;
	private final ModelPart digit2phalanx9;
	private final ModelPart digit2phalanx10;
	private final ModelPart digit8;
	private final ModelPart digit2phalanx11;
	private final ModelPart digit2phalanx12;
	private final ModelPart digit9;
	private final ModelPart digit10;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftCanine;
	private final ModelPart rightCanine;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart bone3;
	private final ModelPart bone2;
	private final ModelPart tail;

	public VampyrumFossilModel(ModelPart root) {
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
		this.bone = this.hips.getChild("bone");
		this.bone6 = this.hips.getChild("bone6");
		this.body2 = this.hips.getChild("body2");
		this.body5 = this.body2.getChild("body5");
		this.body = this.body5.getChild("body");
		this.body4 = this.body.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body6 = this.body3.getChild("body6");
		this.chest = this.body6.getChild("chest");
		this.bone4 = this.chest.getChild("bone4");
		this.bone5 = this.chest.getChild("bone5");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.manus = this.leftarm2.getChild("manus");
		this.digit2 = this.manus.getChild("digit2");
		this.digit2phalanx = this.digit2.getChild("digit2phalanx");
		this.digit2phalanx2 = this.digit2phalanx.getChild("digit2phalanx2");
		this.digit3 = this.manus.getChild("digit3");
		this.digit2phalanx3 = this.digit3.getChild("digit2phalanx3");
		this.digit2phalanx4 = this.digit2phalanx3.getChild("digit2phalanx4");
		this.digit4 = this.manus.getChild("digit4");
		this.digit2phalanx5 = this.digit4.getChild("digit2phalanx5");
		this.digit2phalanx6 = this.digit2phalanx5.getChild("digit2phalanx6");
		this.digit = this.manus.getChild("digit");
		this.digit5 = this.manus.getChild("digit5");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.manus2 = this.rightarm2.getChild("manus2");
		this.digit6 = this.manus2.getChild("digit6");
		this.digit2phalanx7 = this.digit6.getChild("digit2phalanx7");
		this.digit2phalanx8 = this.digit2phalanx7.getChild("digit2phalanx8");
		this.digit7 = this.manus2.getChild("digit7");
		this.digit2phalanx9 = this.digit7.getChild("digit2phalanx9");
		this.digit2phalanx10 = this.digit2phalanx9.getChild("digit2phalanx10");
		this.digit8 = this.manus2.getChild("digit8");
		this.digit2phalanx11 = this.digit8.getChild("digit2phalanx11");
		this.digit2phalanx12 = this.digit2phalanx11.getChild("digit2phalanx12");
		this.digit9 = this.manus2.getChild("digit9");
		this.digit10 = this.manus2.getChild("digit10");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftCanine = this.head.getChild("leftCanine");
		this.rightCanine = this.head.getChild("rightCanine");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.bone3 = this.jaw.getChild("bone3");
		this.bone2 = this.body.getChild("bone2");
		this.tail = this.hips.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2765F, -7.2454F, 6.7007F, -0.6674F, -0.2884F, -0.2704F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(23, 48).addBox(0.0F, -0.4937F, -1.6061F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.8F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(31, 6).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.0828F, -1.3178F, -0.2443F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6414F, 0.129F, -0.1479F, -0.1818F, 0.4397F, -1.7838F));

		PartDefinition cube_r3 = leftLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(73, 26).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2729F, 0.2792F, 0.5084F, -0.0999F, -0.0314F, -0.3039F));

		PartDefinition cube_r4 = leftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(73, 22).addBox(-0.775F, -0.85F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1852F, 0.5182F, -0.1023F, 0.0226F, 0.217F));

		PartDefinition cube_r5 = leftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 62).addBox(0.5F, -4.8653F, -1.0619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 7.9045F, -0.0688F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(68, 59).addBox(0.5F, -1.625F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, 2.7292F, -0.1513F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 78).addBox(4.4F, -0.9F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.9F, 7.7517F, -2.2097F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(78, 62).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 8.2335F, -0.0522F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(45, 80).addBox(-1.0F, 0.9683F, -1.2245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 6.2586F, 0.1035F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(65, 0).addBox(0.0F, -1.5F, -0.525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 6.3768F, -0.3186F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4308F, 8.4157F, -0.1798F, 1.7853F, 0.0638F, -1.5146F));

		PartDefinition cube_r11 = leftLeg2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(11, 29).addBox(-0.6F, -2.8881F, -1.8332F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(31, 25).addBox(-1.2F, -2.8881F, -1.8332F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 3.4657F, 1.291F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftLeg2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(50, 83).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 0.6544F, 0.6664F, -0.9774F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(36, 12).addBox(-2.3F, 0.1246F, -0.4284F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3F, 9.9709F, -0.7907F, -0.0611F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.9606F, -0.315F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftLeg4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 35).addBox(-2.8F, -0.075F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.1F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6414F, 0.129F, -0.1479F, -0.1818F, -0.4397F, 1.7838F));

		PartDefinition cube_r14 = rightLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(73, 26).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2729F, 0.2792F, 0.5084F, -0.0999F, 0.0314F, 0.3039F));

		PartDefinition cube_r15 = rightLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(73, 22).mirror().addBox(-0.225F, -0.85F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1852F, 0.5182F, -0.1023F, -0.0226F, -0.217F));

		PartDefinition cube_r16 = rightLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(14, 62).mirror().addBox(-1.5F, -4.8653F, -1.0619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 7.9045F, -0.0688F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r17 = rightLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(68, 59).mirror().addBox(-1.5F, -1.625F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0F, 2.7292F, -0.1513F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r18 = rightLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(30, 78).mirror().addBox(-5.4F, -0.9F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(4.9F, 7.7517F, -2.2097F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r19 = rightLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(78, 62).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.2335F, -0.0522F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r20 = rightLeg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(45, 80).mirror().addBox(0.0F, 0.9683F, -1.2245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.2586F, 0.1035F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r21 = rightLeg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-1.0F, -1.5F, -0.525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5F, 6.3768F, -0.3186F, -0.2182F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4308F, 8.4157F, -0.1798F, 1.7853F, -0.0638F, 1.5146F));

		PartDefinition cube_r22 = rightLeg2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(11, 29).mirror().addBox(-0.4F, -2.8881F, -1.8332F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(31, 25).mirror().addBox(0.2F, -2.8881F, -1.8332F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 3.4657F, 1.291F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r23 = rightLeg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(50, 83).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6544F, 0.6664F, -0.9774F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(36, 12).mirror().addBox(-1.7F, 0.1246F, -0.4284F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 9.9709F, -0.7907F, -0.0611F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.9606F, -0.315F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r24 = rightLeg4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-1.2F, -0.075F, 0.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2F, -0.1F, 0.1571F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.8281F, -0.7672F, -2.5566F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(50, 30).addBox(-4.6F, -0.7F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(50, 27).addBox(-2.5F, -0.7F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4645F, -0.142F, -0.2373F, -1.6261F, 1.1924F, -1.598F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(45, 83).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5785F, -0.0504F, -0.8106F, 1.6079F, 0.9884F, 1.626F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(45, 47).addBox(-4.6F, -0.7F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.0552F, 0.1758F, 0.6113F, -1.6261F, 1.1924F, -1.598F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(50, 21).addBox(-3.0F, -0.7F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0552F, 0.1758F, 0.6113F, -2.2518F, 1.0761F, -2.2826F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(36, 22).addBox(-1.6F, -0.5F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5203F, 4.0893F, 4.2774F, 2.7935F, -0.8771F, 1.9869F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(50, 24).addBox(-1.0F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7645F, 1.6749F, 2.3632F, 2.4517F, -1.2446F, 2.5113F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(71, 39).addBox(-0.548F, -2.2431F, -1.4692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.8946F, 3.2655F, 2.628F, -0.1552F, -0.1698F, 0.1376F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(36, 32).addBox(0.3F, -0.5634F, -1.4615F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0937F, 3.9803F, 1.9948F, 0.1755F, -0.2973F, -1.3088F));

		PartDefinition bone6 = hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-1.8281F, -0.7672F, -2.5566F));

		PartDefinition cube_r33 = bone6.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(50, 30).mirror().addBox(1.6F, -0.7F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(50, 27).mirror().addBox(-0.5F, -0.7F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4645F, -0.142F, -0.2373F, -1.6261F, -1.1924F, 1.598F));

		PartDefinition cube_r34 = bone6.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(45, 83).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.5785F, -0.0504F, -0.8106F, 1.6079F, -0.9884F, -1.626F));

		PartDefinition cube_r35 = bone6.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(45, 47).mirror().addBox(1.6F, -0.7F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.0552F, 0.1758F, 0.6113F, -1.6261F, -1.1924F, 1.598F));

		PartDefinition cube_r36 = bone6.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(50, 21).mirror().addBox(0.0F, -0.7F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.0552F, 0.1758F, 0.6113F, -2.2518F, -1.0761F, 2.2826F));

		PartDefinition cube_r37 = bone6.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(36, 22).mirror().addBox(0.6F, -0.5F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5203F, 4.0893F, 4.2774F, 2.7935F, 0.8771F, -1.9869F));

		PartDefinition cube_r38 = bone6.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(50, 24).mirror().addBox(-2.0F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7645F, 1.6749F, 2.3632F, 2.4517F, 1.2446F, -2.5113F));

		PartDefinition cube_r39 = bone6.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(71, 39).mirror().addBox(-0.452F, -2.2431F, -1.4692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.8946F, 3.2655F, 2.628F, -0.1552F, 0.1698F, -0.1376F));

		PartDefinition cube_r40 = bone6.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(36, 32).mirror().addBox(-1.3F, -0.5634F, -1.4615F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.0937F, 3.9803F, 1.9948F, 0.1755F, 0.2973F, 1.3088F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5081F, -3.149F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(5, 52).addBox(0.0F, -0.3751F, 1.683F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 43).addBox(0.0F, -0.3751F, -0.317F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -3.8F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(91, 30).mirror().addBox(-0.075F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2584F, -0.0351F, -3.5912F, 3.0581F, -0.0347F, -1.1236F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(91, 30).addBox(0.075F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2584F, -0.0351F, -3.5912F, 3.0581F, 0.0347F, 1.1236F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, 0.1F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.4F, -8.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body5 = body2.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1561F, -4.2713F, 0.3884F, -0.0736F, 0.0641F));

		PartDefinition cube_r45 = body5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(5, 55).addBox(0.0F, -0.593F, -0.2538F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.6F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(91, 36).mirror().addBox(0.2F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 90).mirror().addBox(0.2F, -0.6F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5204F, -0.2527F, -3.2657F, 3.0575F, -0.1217F, -1.1162F));

		PartDefinition cube_r47 = body5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(88, 90).addBox(-0.2F, -0.6F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 36).addBox(-0.2F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5204F, -0.2527F, -3.2657F, 3.0575F, 0.1217F, 1.1162F));

		PartDefinition cube_r48 = body5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(91, 33).addBox(0.0F, -0.3451F, 0.0058F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -3.7F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, -0.9597F, -4.0394F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body5.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6491F, -3.79F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(54, 55).mirror().addBox(-1.668F, 0.0892F, -0.2896F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6836F, 0.5148F, -1.5163F, 0.6467F, 0.0549F, 0.1399F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(90, 52).mirror().addBox(-2.5207F, -0.6911F, -0.2896F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6836F, 0.5148F, -1.5163F, 0.5678F, 0.3326F, -0.2606F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(39, 71).mirror().addBox(-3.7546F, -1.9373F, -0.2896F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6836F, 0.5148F, -1.5163F, 0.3077F, 0.5806F, -0.8331F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(68, 57).mirror().addBox(-4.283F, -3.555F, -0.2896F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6836F, 0.5148F, -1.5163F, -0.0688F, 0.6456F, -1.4723F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(57, 37).mirror().addBox(-4.7021F, -5.2985F, -0.2896F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6836F, 0.5148F, -1.5163F, -0.4343F, 0.4983F, -2.1286F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(45, 19).mirror().addBox(-2.8158F, 6.5012F, -0.2896F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6836F, 0.5148F, -1.5163F, 0.6368F, 0.1334F, 0.0346F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(54, 55).addBox(-1.332F, 0.0892F, -0.2896F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6836F, 0.5148F, -1.5163F, 0.6467F, -0.0549F, -0.1399F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(90, 52).addBox(1.5207F, -0.6911F, -0.2896F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6836F, 0.5148F, -1.5163F, 0.5678F, -0.3326F, 0.2606F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(39, 71).addBox(1.7546F, -1.9373F, -0.2896F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6836F, 0.5148F, -1.5163F, 0.3077F, -0.5806F, 0.8331F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(68, 57).addBox(2.283F, -3.555F, -0.2896F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6836F, 0.5148F, -1.5163F, -0.0688F, -0.6456F, 1.4723F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(57, 37).addBox(1.7021F, -5.2985F, -0.2896F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6836F, 0.5148F, -1.5163F, -0.4343F, -0.4983F, 2.1286F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(45, 19).addBox(-1.1842F, 6.5012F, -0.2896F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6836F, 0.5148F, -1.5163F, 0.6368F, -0.1334F, -0.0346F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(9, 43).addBox(-0.5F, -0.3F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.3F, -0.8F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(15, 71).addBox(0.0F, -0.8769F, -0.678F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -1.2F, 0.1047F, 0.0F, 0.0F));

		PartDefinition body4 = body.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8857F, -2.7264F, 0.3232F, -0.0414F, -0.0139F));

		PartDefinition cube_r64 = body4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(90, 86).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3634F, -0.5402F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(56, 19).mirror().addBox(-1.6774F, 0.1226F, -0.1959F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2836F, 0.0791F, -0.7899F, 0.343F, 0.0944F, 0.1171F));

		PartDefinition cube_r66 = body4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(40, 90).mirror().addBox(-2.5445F, -0.6658F, -0.1959F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2836F, 0.0791F, -0.7899F, 0.264F, 0.2405F, -0.3471F));

		PartDefinition cube_r67 = body4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(19, 68).mirror().addBox(-4.3164F, -3.5644F, -0.1959F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2836F, 0.0791F, -0.7899F, -0.1002F, 0.3414F, -1.4873F));

		PartDefinition cube_r68 = body4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(60, 68).mirror().addBox(-3.7883F, -1.9287F, -0.1959F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2836F, 0.0791F, -0.7899F, 0.0912F, 0.3438F, -0.9306F));

		PartDefinition cube_r69 = body4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(54, 47).mirror().addBox(-3.8819F, -4.7881F, -0.1959F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3613F, 1.0177F, -0.4554F, -0.2699F, 0.2338F, -2.0692F));

		PartDefinition cube_r70 = body4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(45, 17).mirror().addBox(-3.1216F, 4.6354F, -0.1959F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8972F, 1.8726F, -0.2234F, 0.3285F, 0.1376F, -0.0073F));

		PartDefinition cube_r71 = body4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(56, 19).addBox(-1.3226F, 0.1226F, -0.1959F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2836F, 0.0791F, -0.7899F, 0.343F, -0.0944F, -0.1171F));

		PartDefinition cube_r72 = body4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(40, 90).addBox(1.5445F, -0.6658F, -0.1959F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2836F, 0.0791F, -0.7899F, 0.264F, -0.2405F, 0.3471F));

		PartDefinition cube_r73 = body4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(19, 68).addBox(2.3165F, -3.5644F, -0.1959F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2836F, 0.0791F, -0.7899F, -0.1002F, -0.3414F, 1.4873F));

		PartDefinition cube_r74 = body4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(60, 68).addBox(1.7883F, -1.9287F, -0.1959F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2836F, 0.0791F, -0.7899F, 0.0912F, -0.3438F, 0.9306F));

		PartDefinition cube_r75 = body4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(54, 47).addBox(0.8819F, -4.7881F, -0.1959F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3613F, 1.0177F, -0.4554F, -0.2699F, -0.2338F, 2.0692F));

		PartDefinition cube_r76 = body4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(45, 17).addBox(-0.8784F, 4.6354F, -0.1959F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8972F, 1.8726F, -0.2234F, 0.3285F, -0.1376F, 0.0073F));

		PartDefinition cube_r77 = body4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(64, 33).addBox(-0.5F, -0.3F, -4.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -2.0F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(47, 15).mirror().addBox(-3.1216F, 4.6354F, -0.1959F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.381F, 1.6913F, -0.7136F, 0.1524F, 0.1427F, 0.0381F));

		PartDefinition cube_r79 = body3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(51, 9).mirror().addBox(-3.8819F, -4.7881F, -0.1959F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7836F, 0.7791F, -0.7899F, -0.1942F, 0.0762F, -1.9874F));

		PartDefinition cube_r80 = body3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(90, 50).mirror().addBox(-3.3164F, -3.5644F, -0.1959F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7836F, 0.7791F, -0.7899F, -0.1234F, 0.1684F, -1.4232F));

		PartDefinition cube_r81 = body3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(66, 37).mirror().addBox(-3.7883F, -1.9287F, -0.1959F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7836F, 0.7791F, -0.7899F, -0.0218F, 0.2073F, -0.8914F));

		PartDefinition cube_r82 = body3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(30, 90).mirror().addBox(-2.5445F, -0.6658F, -0.1959F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7836F, 0.7791F, -0.7899F, 0.0944F, 0.1861F, -0.3131F));

		PartDefinition cube_r83 = body3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(67, 68).mirror().addBox(-1.6774F, 0.1226F, -0.1959F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7836F, 0.7791F, -0.7899F, 0.1696F, 0.1217F, 0.1684F));

		PartDefinition cube_r84 = body3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(47, 15).addBox(0.1216F, 4.6354F, -0.1959F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.381F, 1.6913F, -0.7136F, 0.1524F, -0.1427F, -0.0381F));

		PartDefinition cube_r85 = body3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(51, 9).addBox(0.8819F, -4.7881F, -0.1959F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7836F, 0.7791F, -0.7899F, -0.1942F, -0.0762F, 1.9874F));

		PartDefinition cube_r86 = body3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(90, 50).addBox(2.3165F, -3.5644F, -0.1959F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7836F, 0.7791F, -0.7899F, -0.1234F, -0.1684F, 1.4232F));

		PartDefinition cube_r87 = body3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(66, 37).addBox(1.7883F, -1.9287F, -0.1959F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7836F, 0.7791F, -0.7899F, -0.0218F, -0.2073F, 0.8914F));

		PartDefinition cube_r88 = body3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(30, 90).addBox(1.5445F, -0.6658F, -0.1959F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7836F, 0.7791F, -0.7899F, 0.0944F, -0.1861F, 0.3131F));

		PartDefinition cube_r89 = body3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(67, 68).addBox(-0.3226F, 0.1226F, -0.1959F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7836F, 0.7791F, -0.7899F, 0.1696F, -0.1217F, -0.1684F));

		PartDefinition cube_r90 = body3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(56, 15).addBox(-0.5F, -0.0978F, -2.0739F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(90, 54).addBox(0.0F, -0.6034F, -0.1405F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -0.9F, 0.0611F, 0.0F, 0.0F));

		PartDefinition body6 = body3.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5086F, 0.7291F, -2.0399F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body6.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-2.6016F, 4.7423F, -0.2123F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0422F, 0.65F, -0.45F, 0.0173F, 0.1373F, 0.0625F));

		PartDefinition cube_r93 = body6.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(53, 68).mirror().addBox(-3.0052F, -4.4974F, -0.2123F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0422F, 0.65F, -0.45F, -0.1298F, -0.048F, -1.9863F));

		PartDefinition cube_r94 = body6.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(20, 90).mirror().addBox(-3.2642F, -3.253F, -0.2123F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0422F, 0.65F, -0.45F, -0.1353F, 0.029F, -1.4242F));

		PartDefinition cube_r95 = body6.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(66, 31).mirror().addBox(-3.5873F, -1.6851F, -0.2123F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0422F, 0.65F, -0.45F, -0.1029F, 0.0926F, -0.9034F));

		PartDefinition cube_r96 = body6.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(25, 90).mirror().addBox(-2.2441F, -0.5683F, -0.2123F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0422F, 0.65F, -0.45F, -0.0369F, 0.1334F, -0.3339F));

		PartDefinition cube_r97 = body6.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(26, 69).mirror().addBox(-1.366F, 0.0704F, -0.2123F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0422F, 0.65F, -0.45F, 0.0292F, 0.1353F, 0.1505F));

		PartDefinition cube_r98 = body6.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 27).addBox(-0.3984F, 4.7423F, -0.2123F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, 0.65F, -0.45F, 0.0173F, -0.1373F, -0.0625F));

		PartDefinition cube_r99 = body6.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(53, 68).addBox(1.0052F, -4.4974F, -0.2123F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, 0.65F, -0.45F, -0.1298F, 0.048F, 1.9863F));

		PartDefinition cube_r100 = body6.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(20, 90).addBox(2.2642F, -3.253F, -0.2123F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, 0.65F, -0.45F, -0.1353F, -0.029F, 1.4242F));

		PartDefinition cube_r101 = body6.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(66, 31).addBox(1.5874F, -1.6851F, -0.2123F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, 0.65F, -0.45F, -0.1029F, -0.0926F, 0.9034F));

		PartDefinition cube_r102 = body6.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(25, 90).addBox(1.2442F, -0.5683F, -0.2123F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, 0.65F, -0.45F, -0.0369F, -0.1334F, 0.3339F));

		PartDefinition cube_r103 = body6.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(26, 69).addBox(-0.634F, 0.0704F, -0.2123F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, 0.65F, -0.45F, 0.0292F, -0.1353F, -0.1505F));

		PartDefinition cube_r104 = body6.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(26, 54).addBox(-0.5F, -0.0978F, -4.0739F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5086F, -0.7291F, 2.0399F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body6.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(85, 90).addBox(0.0F, -0.3507F, -0.2782F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5086F, 0.0709F, -0.6601F, 0.1571F, 0.0F, 0.0F));

		PartDefinition chest = body6.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5086F, 0.8908F, -1.6547F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(71, 16).mirror().addBox(-1.1997F, 0.0578F, -0.0633F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1336F, 0.1592F, -0.9953F, 0.1379F, 0.2508F, 0.1657F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(10, 90).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1715F, -0.0172F, -0.2708F, 0.0036F, 0.2855F, -0.3311F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(89, 45).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0789F, 0.2947F, 0.0108F, -0.1838F, 0.2197F, -1.0501F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(57, 53).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5643F, 1.141F, 0.2288F, -0.2531F, 0.1335F, -1.4395F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(90, 9).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6941F, 2.1236F, 0.3619F, -0.2848F, -0.0211F, -1.9867F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(9, 41).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.291F, 3.0395F, 0.3412F, 0.1796F, 0.2232F, 0.343F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(57, 43).mirror().addBox(0.2F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.0037F, -0.3133F, -0.9425F, 0.6111F, -0.6684F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(57, 49).mirror().addBox(-0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8161F, 2.848F, -0.865F, -1.3309F, 0.8201F, -1.2479F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(9, 41).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.291F, 3.0395F, 0.3412F, 0.1796F, -0.2232F, -0.343F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(90, 9).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6941F, 2.1236F, 0.3619F, -0.2848F, 0.0211F, 1.9867F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(57, 53).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5643F, 1.141F, 0.2288F, -0.2531F, -0.1335F, 1.4395F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(89, 45).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.079F, 0.2947F, 0.0108F, -0.1838F, -0.2197F, 1.0501F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(10, 90).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1716F, -0.0172F, -0.2708F, 0.0036F, -0.2855F, 0.3311F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(71, 16).addBox(0.1997F, 0.0578F, -0.0633F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1336F, 0.1592F, -0.9953F, 0.1379F, -0.2508F, -0.1657F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(20, 25).addBox(-0.5F, -3.7869F, 5.8911F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(25, 13).addBox(-0.5F, -3.7869F, 1.8911F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7805F, -3.1744F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(57, 49).addBox(-0.9F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.8161F, 2.848F, -0.865F, -1.3309F, -0.8201F, 1.2479F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(57, 43).addBox(-1.2F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.0037F, -0.3133F, -0.9425F, -0.6111F, 0.6684F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(79, 79).addBox(-0.5F, -0.95F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.3007F, -1.5606F, -1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(83, 24).addBox(-0.5F, -0.525F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(83, 21).addBox(-0.5F, -0.325F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, 3.367F, -1.4857F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(70, 0).addBox(-0.5F, -0.7F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(69, 45).addBox(-0.5F, -0.7F, -2.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(74, 79).addBox(-0.5F, -0.2F, -1.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(69, 79).addBox(-0.5F, -0.2F, -2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(57, 39).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 4.0037F, -0.3133F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(90, 80).addBox(0.0F, -0.6815F, 0.0953F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(19, 53).addBox(-0.5F, -0.9889F, 3.9677F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4F, -5.4F, 0.3229F, 0.0F, 0.0F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.6754F, 1.1368F, -1.6385F));

		PartDefinition cube_r128 = bone4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(26, 62).addBox(-0.6343F, 1.273F, 1.8197F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.05F, -3.4174F, 2.4301F, 0.6963F, -0.1816F, -1.2502F));

		PartDefinition cube_r129 = bone4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(63, 8).addBox(-0.6343F, 0.2206F, 0.719F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(7, 62).addBox(-0.6343F, 0.6206F, 0.419F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.05F, -3.4174F, 2.4301F, 0.3909F, -0.1816F, -1.2502F));

		PartDefinition cube_r130 = bone4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(19, 57).addBox(-0.6343F, 0.2917F, -0.9354F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.05F, -3.4174F, 2.4301F, -0.0455F, -0.1816F, -1.2502F));

		PartDefinition cube_r131 = bone4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(44, 75).addBox(-0.6375F, -2.743F, -1.1641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.05F, -3.4174F, 2.4301F, 1.5428F, -0.1816F, -1.2502F));

		PartDefinition cube_r132 = bone4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(15, 74).addBox(-0.6375F, -0.8629F, -1.6803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.05F, -3.4174F, 2.4301F, 0.0243F, -0.1816F, -1.2502F));

		PartDefinition cube_r133 = bone4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(14, 67).addBox(-0.6375F, -1.9226F, -0.9384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.05F, -3.4174F, 2.4301F, 0.6788F, -0.1816F, -1.2502F));

		PartDefinition cube_r134 = bone4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(36, 27).addBox(-0.6343F, 0.4004F, -3.7691F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(3.05F, -3.4174F, 2.4301F, -3.1173F, -0.1816F, -1.2502F));

		PartDefinition cube_r135 = bone4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(44, 0).addBox(-0.6343F, -1.2562F, -0.5292F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.05F, -3.4174F, 2.4301F, 1.5079F, -0.1816F, -1.2502F));

		PartDefinition cube_r136 = bone4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(64, 42).addBox(-1.4678F, -0.7077F, 4.8654F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1879F, 1.14F, 0.4709F, 2.2549F, 1.4259F, 1.0553F));

		PartDefinition cube_r137 = bone4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(35, 83).addBox(4.3786F, -0.7077F, 1.5213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1879F, 1.14F, 0.4709F, 0.1331F, 0.5679F, -1.1328F));

		PartDefinition cube_r138 = bone4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(75, 0).addBox(3.5804F, -0.7077F, -3.4548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1879F, 1.14F, 0.4709F, 0.121F, -0.3855F, -1.2504F));

		PartDefinition cube_r139 = bone4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(75, 11).addBox(3.3729F, -0.7077F, -2.9335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1879F, 1.14F, 0.4709F, 0.1159F, -0.2555F, -1.2341F));

		PartDefinition cube_r140 = bone4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(10, 75).addBox(3.2798F, -0.7077F, -2.0954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1879F, 1.14F, 0.4709F, 0.1122F, -0.0387F, -1.2091F));

		PartDefinition cube_r141 = bone4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(36, 47).addBox(1.0076F, -0.7077F, -1.2973F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1879F, 1.14F, 0.4709F, 0.1139F, 0.1781F, -1.1845F));

		PartDefinition cube_r142 = bone4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(63, 16).addBox(-0.29F, -0.7077F, -0.8181F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1879F, 1.14F, 0.4709F, 0.1296F, 0.5246F, -1.1395F));

		PartDefinition cube_r143 = bone4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(73, 73).addBox(-1.5703F, -0.8502F, 0.5547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(4.5547F, -4.5406F, 1.2593F, -2.8911F, -1.1548F, 1.8656F));

		PartDefinition cube_r144 = bone4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(73, 63).addBox(-1.7026F, -0.8502F, -0.6353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.5547F, -4.5406F, 1.2593F, -0.2644F, -1.1774F, -0.801F));

		PartDefinition cube_r145 = bone4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(73, 70).addBox(-1.1845F, -0.8502F, -0.3869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(73, 30).addBox(-0.7845F, -0.8502F, -0.3869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(4.5547F, -4.5406F, 1.2593F, -0.7025F, -1.4151F, -0.3496F));

		PartDefinition cube_r146 = bone4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(74, 43).addBox(-0.325F, -0.5F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(50, 43).addBox(-0.925F, -0.5F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.6404F, -2.7584F, -0.3282F, 2.5555F, -0.7866F, 2.3728F));

		PartDefinition cube_r147 = bone4.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(51, 5).addBox(-0.2049F, -0.5F, -0.4015F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.1821F, -4.3724F, 0.8243F, 0.4631F, -0.9184F, -1.4328F));

		PartDefinition cube_r148 = bone4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(25, 19).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3431F, -3.5224F, 1.7769F, 0.1933F, -0.3531F, -0.9223F));

		PartDefinition cube_r149 = bone4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(33, 55).addBox(-0.6375F, -1.5309F, -2.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.05F, -3.4174F, 2.4301F, 0.9232F, -0.1816F, -1.2502F));

		PartDefinition cube_r150 = bone4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(41, 42).addBox(-0.6375F, 0.1774F, -2.4136F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.05F, -3.4174F, 2.4301F, 0.2163F, -0.1816F, -1.2502F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-0.6754F, 1.1368F, -1.6385F));

		PartDefinition cube_r151 = bone5.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(26, 62).mirror().addBox(-0.3657F, 1.273F, 1.8197F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.05F, -3.4174F, 2.4301F, 0.6963F, 0.1816F, 1.2502F));

		PartDefinition cube_r152 = bone5.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(63, 8).mirror().addBox(-0.3657F, 0.2206F, 0.719F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 62).mirror().addBox(-0.3657F, 0.6206F, 0.419F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.05F, -3.4174F, 2.4301F, 0.3909F, 0.1816F, 1.2502F));

		PartDefinition cube_r153 = bone5.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(19, 57).mirror().addBox(-0.3657F, 0.2917F, -0.9354F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.05F, -3.4174F, 2.4301F, -0.0455F, 0.1816F, 1.2502F));

		PartDefinition cube_r154 = bone5.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(44, 75).mirror().addBox(-0.3625F, -2.743F, -1.1641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.05F, -3.4174F, 2.4301F, 1.5428F, 0.1816F, 1.2502F));

		PartDefinition cube_r155 = bone5.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(15, 74).mirror().addBox(-0.3625F, -0.8629F, -1.6803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.05F, -3.4174F, 2.4301F, 0.0243F, 0.1816F, 1.2502F));

		PartDefinition cube_r156 = bone5.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(14, 67).mirror().addBox(-0.3625F, -1.9226F, -0.9384F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.05F, -3.4174F, 2.4301F, 0.6788F, 0.1816F, 1.2502F));

		PartDefinition cube_r157 = bone5.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(36, 27).mirror().addBox(-0.3657F, 0.4004F, -3.7691F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-3.05F, -3.4174F, 2.4301F, -3.1173F, 0.1816F, 1.2502F));

		PartDefinition cube_r158 = bone5.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-0.3657F, -1.2562F, -0.5292F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.05F, -3.4174F, 2.4301F, 1.5079F, 0.1816F, 1.2502F));

		PartDefinition cube_r159 = bone5.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(64, 42).mirror().addBox(-0.5322F, -0.7077F, 4.8654F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.1879F, 1.14F, 0.4709F, 2.2549F, -1.4259F, -1.0553F));

		PartDefinition cube_r160 = bone5.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(35, 83).mirror().addBox(-5.3786F, -0.7077F, 1.5213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1879F, 1.14F, 0.4709F, 0.1331F, -0.5679F, 1.1328F));

		PartDefinition cube_r161 = bone5.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-4.5804F, -0.7077F, -3.4548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.1879F, 1.14F, 0.4709F, 0.121F, 0.3855F, 1.2504F));

		PartDefinition cube_r162 = bone5.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(75, 11).mirror().addBox(-4.3728F, -0.7077F, -2.9335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1879F, 1.14F, 0.4709F, 0.1159F, 0.2555F, 1.2341F));

		PartDefinition cube_r163 = bone5.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(10, 75).mirror().addBox(-4.2798F, -0.7077F, -2.0954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.1879F, 1.14F, 0.4709F, 0.1122F, 0.0387F, 1.2091F));

		PartDefinition cube_r164 = bone5.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(36, 47).mirror().addBox(-4.0076F, -0.7077F, -1.2973F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1879F, 1.14F, 0.4709F, 0.1139F, -0.1781F, 1.1845F));

		PartDefinition cube_r165 = bone5.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(63, 16).mirror().addBox(-1.71F, -0.7077F, -0.8181F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.1879F, 1.14F, 0.4709F, 0.1296F, -0.5246F, 1.1395F));

		PartDefinition cube_r166 = bone5.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(73, 73).mirror().addBox(0.5703F, -0.8502F, 0.5547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-4.5547F, -4.5406F, 1.2593F, -2.8911F, 1.1548F, -1.8656F));

		PartDefinition cube_r167 = bone5.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(73, 63).mirror().addBox(0.7026F, -0.8502F, -0.6353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.5547F, -4.5406F, 1.2593F, -0.2644F, 1.1774F, 0.801F));

		PartDefinition cube_r168 = bone5.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(73, 70).mirror().addBox(0.1845F, -0.8502F, -0.3869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(73, 30).mirror().addBox(-0.2155F, -0.8502F, -0.3869F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-4.5547F, -4.5406F, 1.2593F, -0.7025F, 1.4151F, 0.3496F));

		PartDefinition cube_r169 = bone5.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(74, 43).mirror().addBox(-0.675F, -0.5F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(50, 43).mirror().addBox(-0.075F, -0.5F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.6404F, -2.7584F, -0.3282F, 2.5555F, 0.7866F, -2.3728F));

		PartDefinition cube_r170 = bone5.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(51, 5).mirror().addBox(-0.7951F, -0.5F, -0.4015F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.1821F, -4.3724F, 0.8243F, 0.4631F, 0.9184F, 1.4328F));

		PartDefinition cube_r171 = bone5.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(25, 19).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3431F, -3.5224F, 1.7769F, 0.1933F, 0.3531F, 0.9223F));

		PartDefinition cube_r172 = bone5.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(33, 55).mirror().addBox(-0.3625F, -1.5309F, -2.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.05F, -3.4174F, 2.4301F, 0.9232F, 0.1816F, 1.2502F));

		PartDefinition cube_r173 = bone5.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(41, 42).mirror().addBox(-0.3625F, 0.1774F, -2.4136F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.05F, -3.4174F, 2.4301F, 0.2163F, 0.1816F, 1.2502F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.8181F, -1.4844F, -0.7101F, 0.1123F, -0.1988F, -1.6996F));

		PartDefinition cube_r174 = leftarm.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(85, 51).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0178F, 11.9319F, 7.2357F, -0.6019F, -0.003F, 0.0006F));

		PartDefinition cube_r175 = leftarm.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(68, 63).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0165F, 10.3558F, 7.1095F, 0.4017F, -0.003F, 0.0006F));

		PartDefinition cube_r176 = leftarm.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(0, 69).addBox(-0.5F, -1.0F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0063F, 0.212F, -0.6323F, 0.4017F, -0.003F, 0.0006F));

		PartDefinition cube_r177 = leftarm.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(18, 43).addBox(-0.5F, -6.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0097F, 5.3343F, 3.8167F, 0.7071F, -0.003F, 0.0006F));

		PartDefinition cube_r178 = leftarm.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0149F, 8.1224F, 5.032F, 0.5762F, -0.003F, 0.0006F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3158F, 12.8557F, 6.4886F, -1.1234F, 0.5813F, -1.4189F));

		PartDefinition cube_r179 = leftarm2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(31, 46).addBox(-0.95F, -0.05F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-0.8871F, 20.0532F, 0.2574F, 0.0F, 0.0F, 0.2094F));

		PartDefinition cube_r180 = leftarm2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(14, 51).addBox(-0.95F, -0.05F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.053F)), PartPose.offsetAndRotation(0.0479F, 15.2433F, 0.2574F, 0.0F, 0.0F, 0.192F));

		PartDefinition cube_r181 = leftarm2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(9, 51).addBox(-0.95F, -0.05F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.5601F, 10.3701F, 0.2574F, 0.0F, 0.0F, 0.1047F));

		PartDefinition cube_r182 = leftarm2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 52).addBox(-0.95F, -0.05F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.053F)), PartPose.offsetAndRotation(0.6456F, 5.4709F, 0.2574F, 0.0F, 0.0F, 0.0175F));

		PartDefinition cube_r183 = leftarm2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(45, 29).addBox(0.1F, -0.5F, -0.55F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-0.6882F, 0.0833F, 0.3074F, 0.0F, 0.0F, -0.0524F));

		PartDefinition cube_r184 = leftarm2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(16, 31).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0544F, 1.7201F, -1.0871F, 0.0698F, 0.003F, 0.0001F));

		PartDefinition cube_r185 = leftarm2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(70, 8).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.101F, 0.3857F, -0.6661F, -0.3054F, 0.0F, 0.0349F));

		PartDefinition cube_r186 = leftarm2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(5, 69).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.073F, 1.1872F, -0.8581F, -0.48F, 0.0F, 0.0349F));

		PartDefinition manus = leftarm2.addOrReplaceChild("manus", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5233F, 25.5996F, -0.4928F, -3.0869F, -0.2924F, -2.0566F));

		PartDefinition cube_r187 = manus.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(54, 57).addBox(-0.4986F, -1.6227F, -1.2299F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0611F, 1.3987F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition digit2 = manus.addOrReplaceChild("digit2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.763F, 1.3526F, -0.7932F, 0.0873F, -0.1309F, -0.192F));

		PartDefinition cube_r188 = digit2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4986F, -0.0227F, -1.2299F, 1.0F, 25.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.8F, 0.0F, 0.0F, -0.1745F));

		PartDefinition digit2phalanx = digit2.addOrReplaceChild("digit2phalanx", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3281F, 24.3205F, -0.2F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition cube_r189 = digit2phalanx.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(21, 31).addBox(-0.4986F, -0.4227F, -1.2299F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.3F, 1.0F, 0.0F, 0.0F, -0.192F));

		PartDefinition digit2phalanx2 = digit2phalanx.addOrReplaceChild("digit2phalanx2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4746F, 9.5893F, -0.1F, 0.2628F, -0.0843F, -0.0226F));

		PartDefinition cube_r190 = digit2phalanx2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(31, 37).addBox(-0.1736F, -0.2227F, -0.7299F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -0.4974F));

		PartDefinition digit3 = manus.addOrReplaceChild("digit3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4892F, 1.1624F, -0.8099F, 0.0436F, -0.3054F, -0.5236F));

		PartDefinition cube_r191 = digit3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(5, 0).addBox(-0.4986F, -0.0227F, -1.2299F, 1.0F, 24.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.9F, 0.0F, 0.0F, -0.1745F));

		PartDefinition digit2phalanx3 = digit3.addOrReplaceChild("digit2phalanx3", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8892F, 23.3388F, -0.2F, 0.1745F, 0.0F, -0.0436F));

		PartDefinition cube_r192 = digit2phalanx3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(20, 13).addBox(-0.4986F, -0.4227F, -1.2299F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.28F, 0.1884F, 1.1F, 0.0F, 0.0F, -0.192F));

		PartDefinition digit2phalanx4 = digit2phalanx3.addOrReplaceChild("digit2phalanx4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7746F, 9.4893F, 0.0F, 0.264F, -0.1264F, -0.0341F));

		PartDefinition cube_r193 = digit2phalanx4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(36, 37).addBox(-0.1736F, -0.2227F, -0.7299F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.02F, -0.0116F, 0.6F, 0.0F, 0.0F, -0.4974F));

		PartDefinition digit4 = manus.addOrReplaceChild("digit4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7448F, 0.942F, -0.5677F, 0.2053F, -0.2595F, -1.2567F));

		PartDefinition cube_r194 = digit4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(15, 0).addBox(-0.2F, -0.3F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7684F, 11.7487F, -0.2299F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r195 = digit4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(15, 15).addBox(-0.4986F, -0.0227F, -1.2299F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.1745F));

		PartDefinition digit2phalanx5 = digit4.addOrReplaceChild("digit2phalanx5", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0904F, 23.4177F, -0.5F, 0.3054F, 0.0F, -0.1309F));

		PartDefinition cube_r196 = digit2phalanx5.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(26, 31).addBox(-0.4986F, -0.4227F, -1.2299F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.28F, 0.1884F, 1.0F, 0.0F, 0.0F, -0.192F));

		PartDefinition digit2phalanx6 = digit2phalanx5.addOrReplaceChild("digit2phalanx6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2072F, 6.3651F, 0.1F, 0.2618F, 0.0F, -0.0873F));

		PartDefinition cube_r197 = digit2phalanx6.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(45, 21).addBox(-0.1736F, -0.2227F, -0.7299F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.02F, 0.1884F, 0.4F, 0.0F, 0.0F, -0.4974F));

		PartDefinition digit = manus.addOrReplaceChild("digit", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0611F, 1.3987F, -1.0F, 0.3054F, 0.0F, -0.0436F));

		PartDefinition cube_r198 = digit.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(10, 0).addBox(-0.0986F, -0.4227F, -1.2299F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5162F, 10.9023F, 1.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r199 = digit.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(10, 16).addBox(-0.4986F, -0.0227F, -1.2299F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition digit5 = manus.addOrReplaceChild("digit5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0291F, 1.1126F, 0.0F, 0.0F, 0.0F, 1.2654F));

		PartDefinition cube_r200 = digit5.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(64, 45).addBox(-0.4986F, -0.0227F, -1.2299F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.8181F, -1.4844F, -0.7101F, 0.121F, 0.1937F, 1.7438F));

		PartDefinition cube_r201 = rightarm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(85, 51).mirror().addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0178F, 11.9319F, 7.2357F, -0.6019F, 0.003F, -0.0006F));

		PartDefinition cube_r202 = rightarm.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(68, 63).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0165F, 10.3558F, 7.1095F, 0.4017F, 0.003F, -0.0006F));

		PartDefinition cube_r203 = rightarm.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.5F, -1.0F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0064F, 0.212F, -0.6323F, 0.4017F, 0.003F, -0.0006F));

		PartDefinition cube_r204 = rightarm.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(18, 43).mirror().addBox(-0.5F, -6.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0097F, 5.3343F, 3.8167F, 0.7071F, 0.003F, -0.0006F));

		PartDefinition cube_r205 = rightarm.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(26, 40).mirror().addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0149F, 8.1224F, 5.032F, 0.5762F, 0.003F, -0.0006F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3158F, 12.8557F, 6.4886F, -1.2107F, -0.5813F, 1.4189F));

		PartDefinition cube_r206 = rightarm2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(31, 46).mirror().addBox(-0.05F, -0.05F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(0.8871F, 20.0532F, 0.2574F, 0.0F, 0.0F, -0.2094F));

		PartDefinition cube_r207 = rightarm2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(14, 51).mirror().addBox(-0.05F, -0.05F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.053F)).mirror(false), PartPose.offsetAndRotation(-0.0479F, 15.2433F, 0.2574F, 0.0F, 0.0F, -0.192F));

		PartDefinition cube_r208 = rightarm2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(9, 51).mirror().addBox(-0.05F, -0.05F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.5601F, 10.3701F, 0.2574F, 0.0F, 0.0F, -0.1047F));

		PartDefinition cube_r209 = rightarm2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.05F, -0.05F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.053F)).mirror(false), PartPose.offsetAndRotation(-0.6456F, 5.4709F, 0.2574F, 0.0F, 0.0F, -0.0175F));

		PartDefinition cube_r210 = rightarm2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(45, 29).mirror().addBox(-1.1F, -0.5F, -0.55F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(0.6882F, 0.0833F, 0.3074F, 0.0F, 0.0F, 0.0524F));

		PartDefinition cube_r211 = rightarm2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(16, 31).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0544F, 1.7201F, -1.0871F, 0.0698F, -0.003F, -0.0001F));

		PartDefinition cube_r212 = rightarm2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(70, 8).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.101F, 0.3857F, -0.6661F, -0.3054F, 0.0F, -0.0349F));

		PartDefinition cube_r213 = rightarm2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(5, 69).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.073F, 1.1872F, -0.8581F, -0.48F, 0.0F, -0.0349F));

		PartDefinition manus2 = rightarm2.addOrReplaceChild("manus2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5233F, 25.5996F, -0.4928F, -3.0869F, 0.2924F, 2.0566F));

		PartDefinition cube_r214 = manus2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(54, 57).mirror().addBox(-1.5014F, -1.6227F, -1.2299F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0611F, 1.3987F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition digit6 = manus2.addOrReplaceChild("digit6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.763F, 1.3526F, -0.7932F, 0.1309F, 0.1309F, 0.192F));

		PartDefinition cube_r215 = digit6.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5014F, -0.0227F, -1.2299F, 1.0F, 25.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.1745F));

		PartDefinition digit2phalanx7 = digit6.addOrReplaceChild("digit2phalanx7", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3281F, 24.3205F, -0.2F, 0.1309F, 0.0F, 0.0436F));

		PartDefinition cube_r216 = digit2phalanx7.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(21, 31).mirror().addBox(-0.5014F, -0.4227F, -1.2299F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3F, 1.0F, 0.0F, 0.0F, 0.192F));

		PartDefinition digit2phalanx8 = digit2phalanx7.addOrReplaceChild("digit2phalanx8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4746F, 9.5893F, -0.1F, 0.2628F, 0.0843F, 0.0226F));

		PartDefinition cube_r217 = digit2phalanx8.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(31, 37).mirror().addBox(-0.8264F, -0.2227F, -0.7299F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.4974F));

		PartDefinition digit7 = manus2.addOrReplaceChild("digit7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4892F, 1.1624F, -0.8099F, 0.0436F, 0.3054F, 0.5236F));

		PartDefinition cube_r218 = digit7.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(5, 0).mirror().addBox(-0.5014F, -0.0227F, -1.2299F, 1.0F, 24.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, 0.9F, 0.0F, 0.0F, 0.1745F));

		PartDefinition digit2phalanx9 = digit7.addOrReplaceChild("digit2phalanx9", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8892F, 23.3388F, -0.2F, 0.1745F, 0.0F, 0.0436F));

		PartDefinition cube_r219 = digit2phalanx9.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(20, 13).mirror().addBox(-0.5014F, -0.4227F, -1.2299F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.28F, 0.1884F, 1.1F, 0.0F, 0.0F, 0.192F));

		PartDefinition digit2phalanx10 = digit2phalanx9.addOrReplaceChild("digit2phalanx10", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7746F, 9.4893F, 0.0F, 0.264F, 0.1264F, 0.0341F));

		PartDefinition cube_r220 = digit2phalanx10.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(36, 37).mirror().addBox(-0.8264F, -0.2227F, -0.7299F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.02F, -0.0116F, 0.6F, 0.0F, 0.0F, 0.4974F));

		PartDefinition digit8 = manus2.addOrReplaceChild("digit8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7448F, 0.942F, -0.5677F, 0.2053F, 0.2595F, 1.2567F));

		PartDefinition cube_r221 = digit8.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(15, 0).mirror().addBox(-0.8F, -0.3F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7684F, 11.7487F, -0.2299F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r222 = digit8.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(15, 15).mirror().addBox(-0.5014F, -0.0227F, -1.2299F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.1745F));

		PartDefinition digit2phalanx11 = digit8.addOrReplaceChild("digit2phalanx11", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0904F, 23.4177F, -0.5F, 0.3054F, 0.0F, 0.1309F));

		PartDefinition cube_r223 = digit2phalanx11.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(26, 31).mirror().addBox(-0.5014F, -0.4227F, -1.2299F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.28F, 0.1884F, 1.0F, 0.0F, 0.0F, 0.192F));

		PartDefinition digit2phalanx12 = digit2phalanx11.addOrReplaceChild("digit2phalanx12", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2071F, 6.3651F, 0.1F, 0.2618F, 0.0F, 0.0873F));

		PartDefinition cube_r224 = digit2phalanx12.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(45, 21).mirror().addBox(-0.8264F, -0.2227F, -0.7299F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.02F, 0.1884F, 0.4F, 0.0F, 0.0F, 0.4974F));

		PartDefinition digit9 = manus2.addOrReplaceChild("digit9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0611F, 1.3987F, -1.0F, 0.3054F, 0.0F, 0.0436F));

		PartDefinition cube_r225 = digit9.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(10, 0).mirror().addBox(-0.9014F, -0.4227F, -1.2299F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5162F, 10.9023F, 1.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r226 = digit9.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(10, 16).mirror().addBox(-0.5014F, -0.0227F, -1.2299F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition digit10 = manus2.addOrReplaceChild("digit10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0291F, 1.1126F, 0.0F, 0.0F, 0.0F, -1.2654F));

		PartDefinition cube_r227 = digit10.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(64, 45).mirror().addBox(-0.5014F, -0.0227F, -1.2299F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1368F, -1.5471F, 0.1608F, -0.2154F, -0.0347F));

		PartDefinition cube_r228 = neck3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -0.9F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.5795F, -2.6173F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5073F, -0.9312F));

		PartDefinition cube_r229 = neck2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(60, 8).addBox(0.0F, -0.2854F, -0.0704F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -0.3F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r230 = neck2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(57, 33).addBox(-0.5F, -0.1681F, 1.9279F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7F, -1.5F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6225F, -1.0348F, -0.1073F, -0.1241F, 0.0417F));

		PartDefinition cube_r231 = neck.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(90, 83).addBox(0.0F, -1.0684F, -0.1304F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -0.4F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r232 = neck.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(36, 17).addBox(-0.5F, -0.1681F, -3.0721F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.7F, -0.9687F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0373F, -2.3451F, -1.3051F, -0.1911F, 0.0387F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5F, -0.825F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.375F, 0.7629F, -1.3412F, 0.8495F, 0.0633F, 0.0942F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(47, 11).addBox(-1.5F, -0.8114F, -0.5982F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4013F, 0.3055F, -0.4718F, 1.5302F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(66, 25).addBox(-1.5F, -0.4018F, -0.1886F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3055F, -0.4718F, 0.5703F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4139F, -2.6672F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(42, 6).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7562F, -3.0648F, 1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(41, 37).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7703F, -4.8598F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(20, 6).addBox(-0.5F, -1.425F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.4066F, -3.1004F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(83, 27).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -1.0065F, -3.5428F, -2.4522F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(58, 70).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.0F, -3.4174F, -0.3724F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(59, 25).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -3.4627F, -0.7698F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(59, 21).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -3.4558F, -1.1698F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(26, 58).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -3.4139F, -1.5676F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(12, 58).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -3.3206F, -1.9565F, -1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(5, 58).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -3.1772F, -2.33F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(58, 4).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -3.0019F, -2.6895F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(36, 50).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.0F, -2.0604F, -2.3836F, -2.042F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(29, 71).addBox(-0.5F, -1.3F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(68, 70).addBox(-0.5F, -1.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 2.1781F, -5.0055F, -2.4173F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(25, 81).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, 1.8445F, -4.7847F, 2.5569F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(20, 81).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.4777F, -4.6252F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(10, 81).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, 0.9954F, -4.9208F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(60, 80).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.6064F, -4.8274F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(80, 55).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, 0.2219F, -4.7172F, 2.8623F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(55, 80).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.1449F, -4.5577F, -1.9809F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(33, 59).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -0.5044F, -4.3823F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(63, 70).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.8473F, -4.1763F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(59, 29).addBox(-0.5F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -1.1808F, -3.9555F, 2.5569F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(5, 73).addBox(-0.5F, -0.975F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.0071F, -3.146F, -2.2864F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(50, 33).addBox(-0.5F, -1.675F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0F, -1.6679F, -3.5245F, -2.2166F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(40, 87).addBox(0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0065F, -3.5428F, -2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(85, 6).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6894F, -4.6024F, -0.4375F, 0.5929F, -0.1793F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(40, 84).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6894F, -4.6024F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(38, 67).addBox(0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, -0.1678F, -4.0874F, 1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r265 = head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(78, 20).addBox(0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5452F, -3.8423F, 2.5656F, 0.0F, 0.0F));

		PartDefinition cube_r266 = head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(86, 74).addBox(0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.8103F, -2.2939F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r267 = head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(25, 75).addBox(0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.994F, 3.1015F, -5.5235F, 2.7751F, 0.0F, 0.0F));

		PartDefinition cube_r268 = head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(78, 29).addBox(0.5F, -1.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.994F, 2.3547F, -5.2368F, -1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r269 = head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(19, 70).addBox(-0.2846F, -1.9385F, -0.6288F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2154F, 8.5497F, -6.2502F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r270 = head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(74, 66).addBox(-0.7846F, -2.4886F, -1.7462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.2846F, 8.5497F, -6.2502F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r271 = head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(74, 46).addBox(-0.5F, -0.525F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 5.8119F, -6.1818F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r272 = head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(50, 38).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.3939F, -6.0352F, 2.714F, 0.0F, 0.0F));

		PartDefinition cube_r273 = head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(76, 49).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.9595F, -6.2355F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r274 = head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(76, 36).addBox(-0.5F, -0.375F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 5.2218F, -5.9759F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r275 = head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(40, 55).addBox(-0.7846F, -1.2408F, 1.7911F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2846F, 8.5497F, -6.2502F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r276 = head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(33, 67).addBox(-0.7846F, -2.5136F, 0.4287F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.2846F, 8.5497F, -6.2502F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r277 = head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(70, 12).addBox(-0.7846F, -1.8088F, -0.8365F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.2846F, 8.1217F, -5.8297F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r278 = head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(65, 5).addBox(-1.0F, -0.5F, -0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.006F, -1.3197F, -0.7598F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r279 = head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(66, 28).addBox(-1.0F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -1.0548F, 0.2653F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r280 = head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(26, 66).addBox(-1.0F, -0.75F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.006F, -0.8288F, -0.0972F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r281 = head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(88, 57).addBox(0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.2412F, -1.408F, 1.5839F, 0.0F, 0.0F));

		PartDefinition cube_r282 = head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(85, 54).addBox(0.5F, 0.075F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.9612F, -2.1611F, 0.4494F, 0.0F, 0.0F));

		PartDefinition cube_r283 = head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(78, 69).addBox(0.498F, -0.3462F, -0.0527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.0F, -0.9441F, -2.0171F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r284 = head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(50, 50).addBox(-0.5F, -0.875F, -0.525F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.002F, 0.1445F, -2.1453F, 0.7592F, 0.0F, 0.0F));

		PartDefinition leftCanine = head.addOrReplaceChild("leftCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7775F, 8.3823F, -5.3857F, 0.1066F, -0.1277F, -0.1554F));

		PartDefinition cube_r285 = leftCanine.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(20, 75).addBox(-0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.5003F, -0.0507F, -0.7128F, -0.8549F, -0.0814F, -0.3956F));

		PartDefinition cube_r286 = leftCanine.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(30, 75).addBox(-0.65F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.5421F, -0.1926F, -0.5052F, -0.9759F, 0.0124F, 0.0395F));

		PartDefinition cube_r287 = leftCanine.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(75, 8).addBox(-0.4983F, -0.361F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.0102F, 0.0574F, 0.0555F, -0.9592F, 0.2657F, 0.0559F));

		PartDefinition cube_r288 = leftCanine.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(60, 86).addBox(-0.4983F, -0.4748F, -1.4477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(65, 85).addBox(-0.4983F, -0.4748F, -1.0477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0102F, 0.0574F, 0.0555F, -1.2647F, 0.2657F, 0.0559F));

		PartDefinition cube_r289 = leftCanine.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(78, 17).addBox(-0.4983F, -0.5285F, -0.3175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F))
				.texOffs(54, 77).addBox(-0.4983F, -0.5285F, -0.6925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(0.0102F, 0.0574F, 0.0555F, -1.0901F, 0.2657F, 0.0559F));

		PartDefinition cube_r290 = leftCanine.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(87, 3).addBox(-0.4983F, -1.0444F, -0.413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(84, 41).addBox(-0.4983F, -0.6444F, -0.413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0102F, 0.0574F, 0.0555F, -2.3555F, 0.2657F, 0.0559F));

		PartDefinition cube_r291 = leftCanine.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(55, 83).addBox(-0.4983F, -0.4119F, -0.7181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0102F, 0.0574F, 0.0555F, -0.8283F, 0.2657F, 0.0559F));

		PartDefinition rightCanine = head.addOrReplaceChild("rightCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7775F, 8.3823F, -5.3857F, 0.1066F, 0.1277F, 0.1554F));

		PartDefinition cube_r292 = rightCanine.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(20, 75).mirror().addBox(-0.7F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.5003F, -0.0507F, -0.7128F, -0.8549F, 0.0814F, 0.3956F));

		PartDefinition cube_r293 = rightCanine.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(30, 75).mirror().addBox(-0.35F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.5421F, -0.1926F, -0.5052F, -0.9759F, -0.0124F, -0.0395F));

		PartDefinition cube_r294 = rightCanine.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(75, 8).mirror().addBox(-0.5017F, -0.361F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.0102F, 0.0574F, 0.0555F, -0.9592F, -0.2657F, -0.0559F));

		PartDefinition cube_r295 = rightCanine.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(60, 86).mirror().addBox(-0.5017F, -0.4748F, -1.4477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(65, 85).mirror().addBox(-0.5017F, -0.4748F, -1.0477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0102F, 0.0574F, 0.0555F, -1.2647F, -0.2657F, -0.0559F));

		PartDefinition cube_r296 = rightCanine.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(78, 17).mirror().addBox(-0.5017F, -0.5285F, -0.3175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(54, 77).mirror().addBox(-0.5017F, -0.5285F, -0.6925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-0.0102F, 0.0574F, 0.0555F, -1.0901F, -0.2657F, -0.0559F));

		PartDefinition cube_r297 = rightCanine.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(87, 3).mirror().addBox(-0.5017F, -1.0444F, -0.413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(84, 41).mirror().addBox(-0.5017F, -0.6444F, -0.413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0102F, 0.0574F, 0.0555F, -2.3555F, -0.2657F, -0.0559F));

		PartDefinition cube_r298 = rightCanine.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(55, 83).mirror().addBox(-0.5017F, -0.4119F, -0.7181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.0102F, 0.0574F, 0.0555F, -0.8283F, -0.2657F, -0.0559F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9168F, -0.7672F, 2.789F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r299 = leftOrbit.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(88, 21).addBox(-0.7F, 0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(88, 18).addBox(-0.7F, 0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(87, 12).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.6062F, 3.957F, -8.4793F, -2.9482F, 0.6315F, -0.4705F));

		PartDefinition cube_r300 = leftOrbit.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(20, 87).addBox(-0.7F, -0.275F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(88, 24).addBox(-0.7F, -0.375F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.6062F, 3.957F, -8.4793F, -2.9842F, -0.1431F, -0.6083F));

		PartDefinition cube_r301 = leftOrbit.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(88, 27).addBox(-0.475F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F))
				.texOffs(30, 87).addBox(-0.475F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(25, 87).addBox(-0.475F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.1275F, 3.3998F, -8.5139F, -2.9905F, -0.1498F, -0.5647F));

		PartDefinition cube_r302 = leftOrbit.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(55, 86).addBox(-0.5F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F))
				.texOffs(50, 86).addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)), PartPose.offsetAndRotation(-1.1092F, 3.6736F, -8.4965F, -3.0772F, -0.2025F, -0.0799F));

		PartDefinition cube_r303 = leftOrbit.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(86, 47).addBox(-0.675F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(45, 86).addBox(-0.675F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.8779F, 3.9576F, -8.3317F, -3.1045F, -0.2091F, 0.0536F));

		PartDefinition cube_r304 = leftOrbit.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(86, 33).addBox(-0.7F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4776F, 4.1043F, -8.4374F, -2.9291F, -0.1223F, -0.7436F));

		PartDefinition cube_r305 = leftOrbit.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(86, 30).addBox(-0.7F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(15, 86).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.0494F, 4.3354F, -8.0029F, -2.877F, 0.6432F, -0.5562F));

		PartDefinition cube_r306 = leftOrbit.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(35, 86).addBox(-0.7F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2205F, 4.3991F, -8.3537F, -2.9278F, -0.165F, -0.7529F));

		PartDefinition cube_r307 = leftOrbit.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(86, 36).addBox(-0.7F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0646F, 4.7157F, -8.2088F, -2.5581F, -0.3608F, -0.3892F));

		PartDefinition cube_r308 = leftOrbit.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(66, 19).addBox(-1.5F, -0.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0809F, 4.6585F, -7.7225F, -2.5531F, 0.3803F, 0.0826F));

		PartDefinition cube_r309 = leftOrbit.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(7, 66).addBox(-1.4702F, 0.399F, 0.4652F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.1898F, 5.5701F, -6.7792F, -2.9022F, 0.3803F, 0.0826F));

		PartDefinition cube_r310 = leftOrbit.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(66, 22).addBox(-1.4702F, -1.4336F, 0.0491F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1898F, 5.5701F, -6.7792F, 1.8539F, 0.3803F, 0.0826F));

		PartDefinition cube_r311 = leftOrbit.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(85, 9).addBox(-0.4702F, -1.0158F, -1.3459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(0, 66).addBox(-1.4702F, -1.0158F, -1.2459F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.1898F, 5.5701F, -6.7792F, 0.6321F, 0.3803F, 0.0826F));

		PartDefinition cube_r312 = leftOrbit.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(0, 62).addBox(-1.4F, -1.3F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7367F, 5.2471F, -7.1609F, 1.1177F, -0.1569F, 1.1438F));

		PartDefinition cube_r313 = leftOrbit.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(61, 61).addBox(-1.0F, -0.925F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7367F, 5.2471F, -7.1609F, 1.3705F, 0.4681F, 0.8231F));

		PartDefinition cube_r314 = leftOrbit.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(85, 84).addBox(-0.7F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0924F, 5.9234F, -7.5681F, -0.4702F, 0.0195F, -0.7833F));

		PartDefinition cube_r315 = leftOrbit.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(61, 65).addBox(-1.4702F, -0.1418F, -1.1263F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1898F, 5.5701F, -6.7792F, -0.2842F, 0.3803F, 0.0826F));

		PartDefinition cube_r316 = leftOrbit.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(85, 81).addBox(-0.7F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2306F, 6.0131F, -7.2052F, -0.3951F, -0.0021F, -1.2048F));

		PartDefinition cube_r317 = leftOrbit.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(54, 65).addBox(-1.4702F, -0.2243F, -0.8168F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.1898F, 5.5701F, -6.7792F, -0.1096F, 0.3803F, 0.0826F));

		PartDefinition cube_r318 = leftOrbit.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(84, 44).addBox(-0.4702F, -0.2815F, -0.5544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1898F, 5.5701F, -6.7792F, 0.1958F, 0.3803F, 0.0826F));

		PartDefinition cube_r319 = leftOrbit.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(81, 75).addBox(-0.6993F, -0.6344F, -0.4118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4791F, 5.877F, -6.5123F, 0.4751F, 0.2923F, 0.1039F));

		PartDefinition cube_r320 = leftOrbit.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(25, 84).addBox(-0.6993F, -0.5736F, -0.0328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.4791F, 5.877F, -6.5123F, 0.6933F, 0.2923F, 0.1039F));

		PartDefinition cube_r321 = leftOrbit.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(20, 84).addBox(-0.6993F, -0.3013F, 0.2228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 84).addBox(-0.6993F, -0.3013F, 0.6228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.4791F, 5.877F, -6.5123F, 1.1296F, 0.2923F, 0.1039F));

		PartDefinition cube_r322 = leftOrbit.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(47, 63).addBox(-0.6993F, -0.4126F, -0.3838F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.4791F, 5.877F, -6.5123F, 0.9114F, 0.2923F, 0.1039F));

		PartDefinition cube_r323 = leftOrbit.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(80, 85).addBox(-0.6993F, 0.7828F, 0.0598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4791F, 5.877F, -6.5123F, 2.0895F, 0.2923F, 0.1039F));

		PartDefinition cube_r324 = leftOrbit.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(80, 6).addBox(-0.6993F, 0.9914F, -0.633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.4791F, 5.877F, -6.5123F, 2.5259F, 0.2923F, 0.1039F));

		PartDefinition cube_r325 = leftOrbit.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(83, 71).addBox(-0.3257F, 1.3532F, -0.631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(81, 48).addBox(-0.3257F, 1.7532F, -0.631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4791F, 5.877F, -6.5123F, 2.4986F, 0.1238F, -0.0462F));

		PartDefinition cube_r326 = leftOrbit.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(0, 49).addBox(-2.4721F, 3.3888F, -1.0832F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(9, 48).addBox(-2.2721F, 2.9888F, -1.0832F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4791F, 5.877F, -6.5123F, 2.6169F, -0.1207F, 0.0028F));

		PartDefinition cube_r327 = leftOrbit.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(19, 65).addBox(-3.7937F, 2.4231F, -1.0832F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4791F, 5.877F, -6.5123F, 2.6713F, 0.2698F, 0.6907F));

		PartDefinition cube_r328 = leftOrbit.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(73, 59).addBox(-0.0701F, 2.0869F, -0.4174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4791F, 5.877F, -6.5123F, 2.4044F, 0.0536F, -0.1243F));

		PartDefinition cube_r329 = leftOrbit.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(65, 82).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0531F, 5.9368F, -6.78F, 0.5882F, 0.3497F, 0.2606F));

		PartDefinition cube_r330 = leftOrbit.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(81, 32).addBox(-0.5108F, -0.2768F, 0.4283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3145F, 6.5989F, -7.3176F, 0.9373F, 0.3497F, 0.2606F));

		PartDefinition cube_r331 = leftOrbit.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(80, 0).addBox(-0.6108F, -0.2285F, -0.5665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.3145F, 6.5989F, -7.3176F, 2.4208F, 0.3497F, 0.2606F));

		PartDefinition cube_r332 = leftOrbit.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(30, 81).addBox(-0.6231F, -0.5732F, -0.1479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3145F, 6.5989F, -7.3176F, -2.4564F, 0.18F, 0.097F));

		PartDefinition cube_r333 = leftOrbit.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(50, 80).addBox(-0.6231F, 0.504F, -0.2483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.3145F, 6.5989F, -7.3176F, -1.1474F, 0.18F, 0.097F));

		PartDefinition cube_r334 = leftOrbit.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(5, 80).addBox(-0.275F, -0.625F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.8411F, 8.2208F, -8.4456F, 0.3212F, 0.0197F, 0.091F));

		PartDefinition cube_r335 = leftOrbit.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(5, 83).addBox(-0.5F, -0.6587F, -0.5218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0748F, 6.2439F, -6.2653F, -1.0938F, 0.2658F, 0.137F));

		PartDefinition cube_r336 = leftOrbit.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, -0.3609F, -0.5793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0748F, 6.2439F, -6.2653F, -0.4393F, 0.2658F, 0.137F));

		PartDefinition cube_r337 = leftOrbit.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(35, 80).addBox(-0.5F, -0.6735F, -0.5479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2809F, 6.9833F, -6.8504F, -1.1198F, 0.3345F, 0.0754F));

		PartDefinition cube_r338 = leftOrbit.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(15, 80).addBox(-0.5F, -0.3613F, -0.6647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.2809F, 6.9833F, -6.8504F, -0.1599F, 0.3345F, 0.0754F));

		PartDefinition cube_r339 = leftOrbit.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(56, 11).addBox(-0.4744F, 0.5002F, -2.1129F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.2302F, 6.6556F, -6.8053F, -0.15F, 0.2265F, 0.1612F));

		PartDefinition cube_r340 = leftOrbit.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(78, 26).addBox(-4.9808F, 3.6955F, 0.9691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4791F, 5.877F, -6.5123F, 0.133F, 0.3019F, 2.1857F));

		PartDefinition cube_r341 = leftOrbit.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(39, 73).addBox(-5.2837F, -3.4852F, 0.9691F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.4791F, 5.877F, -6.5123F, -0.2483F, 0.2182F, 0.8989F));

		PartDefinition cube_r342 = leftOrbit.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(63, 12).addBox(-1.3333F, -5.9231F, 0.043F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4791F, 5.877F, -6.5123F, -0.4811F, -0.0639F, -0.1405F));

		PartDefinition cube_r343 = leftOrbit.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(64, 39).addBox(-2.8636F, -5.7696F, 0.043F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4791F, 5.877F, -6.5123F, -0.4792F, 0.0781F, 0.1301F));

		PartDefinition cube_r344 = leftOrbit.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(89, 39).addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.6809F, 9.0401F, -9.3079F, 1.7441F, -0.7126F, -1.8277F));

		PartDefinition cube_r345 = leftOrbit.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(35, 89).addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.212F, 8.7621F, -9.0573F, 0.9619F, -0.4308F, -0.535F));

		PartDefinition cube_r346 = leftOrbit.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(89, 63).addBox(-0.5F, -0.475F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.5859F, 7.6771F, -9.1819F, 0.1369F, 0.1377F, -0.2871F));

		PartDefinition cube_r347 = leftOrbit.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(45, 89).addBox(-0.7703F, -0.2801F, -0.6989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.3926F, 7.3329F, -9.1101F, 0.3551F, 0.1377F, -0.2871F));

		PartDefinition cube_r348 = leftOrbit.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(83, 68).addBox(-0.8F, -0.5F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4308F, 7.0447F, -9.067F, 2.503F, 0.1677F, -0.2884F));

		PartDefinition cube_r349 = leftOrbit.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(83, 61).addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.8742F, 6.989F, -9.243F, 2.4682F, 0.3409F, -0.4257F));

		PartDefinition cube_r350 = leftOrbit.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(90, 0).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.8027F, 7.2726F, -9.2918F, 1.7991F, 0.2432F, -0.5206F));

		PartDefinition cube_r351 = leftOrbit.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(89, 42).addBox(-0.65F, -0.525F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4075F, 8.1839F, -9.0557F, 0.1985F, 0.0242F, 0.1293F));

		PartDefinition cube_r352 = leftOrbit.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(15, 89).addBox(-0.5F, -0.8F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5722F, 8.5589F, -8.4746F, 0.8441F, -0.0731F, -0.0772F));

		PartDefinition cube_r353 = leftOrbit.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(60, 89).addBox(-0.5071F, -0.3112F, -0.7523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(55, 89).addBox(-0.5071F, -0.6112F, -0.7523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.626F, 7.6719F, -9.0294F, -2.1691F, 0.2255F, -0.2812F));

		PartDefinition cube_r354 = leftOrbit.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(50, 89).addBox(-0.5F, -0.575F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5658F, 8.1456F, -8.5702F, -1.7799F, -0.0013F, 0.0151F));

		PartDefinition cube_r355 = leftOrbit.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(5, 89).addBox(-0.5F, 0.575F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5525F, 7.2206F, -8.0221F, -0.5581F, -0.0013F, 0.0151F));

		PartDefinition cube_r356 = leftOrbit.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(80, 9).addBox(-1.075F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0583F, 6.0925F, -7.6392F, 1.9995F, -0.6265F, 0.3531F));

		PartDefinition cube_r357 = leftOrbit.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(82, 12).addBox(-0.8F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0583F, 6.0925F, -7.6392F, 2.2957F, -0.1774F, -0.359F));

		PartDefinition cube_r358 = leftOrbit.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(82, 3).addBox(-0.8F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.0185F, 5.7215F, -7.9655F, 2.2957F, -0.1774F, -0.359F));

		PartDefinition cube_r359 = leftOrbit.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(19, 61).addBox(-0.8F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.121F, 5.4277F, -8.4473F, 1.3184F, -0.2059F, 0.2834F));

		PartDefinition cube_r360 = leftOrbit.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(47, 59).addBox(-0.8F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.121F, 5.4277F, -8.4473F, 1.2543F, -0.6675F, 0.4307F));

		PartDefinition cube_r361 = leftOrbit.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(80, 82).addBox(-0.8F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(40, 81).addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1083F, 5.157F, -8.3185F, 2.5633F, -0.6675F, 0.4307F));

		PartDefinition cube_r362 = leftOrbit.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(81, 38).addBox(-0.4664F, -0.6265F, 0.154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2555F, 5.4663F, -7.3593F, 2.6896F, 0.1847F, -0.0422F));

		PartDefinition cube_r363 = leftOrbit.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(75, 82).addBox(-0.8F, -0.425F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(81, 35).addBox(-0.8F, -1.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4977F, 4.4598F, -8.5807F, 2.6411F, 0.5006F, -0.1527F));

		PartDefinition cube_r364 = leftOrbit.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(64, 50).addBox(-0.2F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2527F, 0.1501F, -4.8017F, 3.106F, -0.5139F, -2.2948F));

		PartDefinition cube_r365 = leftOrbit.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(54, 61).addBox(-0.2F, -0.2F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2527F, 0.1501F, -4.8017F, 2.2159F, -0.5139F, -2.2948F));

		PartDefinition cube_r366 = leftOrbit.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(10, 71).addBox(-0.2F, -0.2F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3328F, 0.4023F, -5.0308F, 2.3256F, 0.3001F, 3.1052F));

		PartDefinition cube_r367 = leftOrbit.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(24, 71).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1305F, -0.0119F, -5.0227F, 1.7969F, 0.8282F, -2.217F));

		PartDefinition cube_r368 = leftOrbit.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(88, 15).addBox(-1.1F, -0.2F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 87).addBox(-0.725F, -0.2F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0336F, -0.0836F, -5.6938F, 2.8878F, 0.8282F, -2.217F));

		PartDefinition cube_r369 = leftOrbit.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(10, 87).addBox(-0.8F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0336F, -0.0836F, -5.6938F, 2.9482F, 0.4875F, -2.1196F));

		PartDefinition cube_r370 = leftOrbit.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(88, 67).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8974F, -0.4855F, -5.9976F, -2.8046F, 0.4059F, -0.9978F));

		PartDefinition cube_r371 = leftOrbit.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(0, 45).addBox(0.1F, -2.2F, -0.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(48, 67).addBox(-0.2F, -2.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(0.4916F, 2.1601F, -6.2013F, -1.5354F, 0.5983F, 2.0861F));

		PartDefinition cube_r372 = leftOrbit.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(49, 77).addBox(-1.175F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(35, 77).addBox(-0.775F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2373F, 2.8676F, -6.3691F, -1.5406F, 0.2494F, 2.0736F));

		PartDefinition cube_r373 = leftOrbit.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(43, 67).addBox(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4692F, 1.7315F, -5.9447F, -1.0149F, 0.2363F, -3.0495F));

		PartDefinition cube_r374 = leftOrbit.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(5, 77).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3876F, 2.5754F, -7.2282F, 1.7556F, 0.8996F, -2.3418F));

		PartDefinition cube_r375 = leftOrbit.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(77, 3).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0582F, 1.7141F, -6.9844F, 0.403F, 0.8996F, -2.3418F));

		PartDefinition cube_r376 = leftOrbit.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(76, 76).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0358F, 1.2855F, -6.7278F, -0.6006F, 0.8996F, -2.3418F));

		PartDefinition cube_r377 = leftOrbit.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(0, 77).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7672F, 1.4566F, -7.4868F, 0.5274F, -0.0588F, -1.3026F));

		PartDefinition cube_r378 = leftOrbit.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(71, 76).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7896F, 1.028F, -7.2303F, 0.7749F, 0.7697F, -0.6702F));

		PartDefinition cube_r379 = leftOrbit.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(47, 55).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4252F, 0.924F, -5.4421F, 0.5915F, 0.233F, -3.0442F));

		PartDefinition cube_r380 = leftOrbit.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(25, 78).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0096F, 0.4524F, -6.2092F, 1.008F, 0.8743F, -2.3155F));

		PartDefinition cube_r381 = leftOrbit.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(78, 23).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8358F, 0.1801F, -6.7024F, 2.3086F, 0.7477F, -0.6988F));

		PartDefinition cube_r382 = leftOrbit.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(84, 64).addBox(-0.2F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0804F, -0.3657F, -5.215F, 2.4784F, 0.0873F, -3.1416F));

		PartDefinition cube_r383 = leftOrbit.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(85, 0).addBox(-0.2F, 0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(84, 78).addBox(-0.2F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.1148F, -0.6735F, -4.8225F, 1.2319F, 0.678F, -2.901F));

		PartDefinition cube_r384 = leftOrbit.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(5, 86).addBox(-0.6F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4325F, -0.4989F, -5.3503F, 2.5574F, 0.345F, -2.7799F));

		PartDefinition cube_r385 = leftOrbit.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(61, 57).addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0539F, -1.4816F, -4.2924F, -0.3839F, 0.5822F, 1.8797F));

		PartDefinition cube_r386 = leftOrbit.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(78, 59).addBox(-1.2F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(79, 42).addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9684F, -1.0431F, -5.187F, -0.7756F, 1.1076F, 1.3781F));

		PartDefinition cube_r387 = leftOrbit.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(0, 86).addBox(-0.8F, -0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.934F, -0.7353F, -5.5796F, -2.6886F, 0.5093F, -0.8973F));

		PartDefinition cube_r388 = leftOrbit.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(70, 82).addBox(-0.575F, -0.425F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(40, 59).addBox(-0.575F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.7845F, 4.7649F, -7.8628F, 2.7068F, -0.0325F, 0.1191F));

		PartDefinition cube_r389 = leftOrbit.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(51, 0).addBox(-0.8F, -1.8F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5731F, 5.1816F, -8.9174F, 2.8288F, -0.0491F, 0.1245F));

		PartDefinition cube_r390 = leftOrbit.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(73, 18).addBox(-0.8F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5731F, 5.1816F, -8.9174F, 2.7811F, 0.5129F, -0.0743F));

		PartDefinition cube_r391 = leftOrbit.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(46, 71).addBox(-0.8F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2826F, 5.3722F, -8.4283F, 1.3303F, 1.2488F, -1.7152F));

		PartDefinition cube_r392 = leftOrbit.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(71, 49).addBox(-1.4F, -1.8F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2826F, 5.3722F, -8.4283F, 0.9434F, 1.1814F, -2.1269F));

		PartDefinition cube_r393 = leftOrbit.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(88, 60).addBox(2.126F, 1.0803F, 4.868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4791F, 5.877F, -6.5123F, 1.3862F, -0.2438F, -0.6178F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9168F, -0.7672F, 2.789F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r394 = rightOrbit.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(88, 21).mirror().addBox(-0.3F, 0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(88, 18).mirror().addBox(-0.3F, 0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(87, 12).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.6062F, 3.957F, -8.4793F, -2.9482F, -0.6315F, 0.4705F));

		PartDefinition cube_r395 = rightOrbit.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(20, 87).mirror().addBox(-0.3F, -0.275F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(88, 24).mirror().addBox(-0.3F, -0.375F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.6062F, 3.957F, -8.4793F, -2.9842F, 0.1431F, 0.6083F));

		PartDefinition cube_r396 = rightOrbit.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(88, 27).mirror().addBox(-0.525F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)).mirror(false)
				.texOffs(30, 87).mirror().addBox(-0.525F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(25, 87).mirror().addBox(-0.525F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.1275F, 3.3998F, -8.5139F, -2.9905F, 0.1498F, 0.5647F));

		PartDefinition cube_r397 = rightOrbit.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(55, 86).mirror().addBox(-0.5F, -0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)).mirror(false)
				.texOffs(50, 86).mirror().addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.398F)).mirror(false), PartPose.offsetAndRotation(1.1092F, 3.6736F, -8.4965F, -3.0772F, 0.2025F, 0.0799F));

		PartDefinition cube_r398 = rightOrbit.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(86, 47).mirror().addBox(-0.325F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(45, 86).mirror().addBox(-0.325F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.8779F, 3.9576F, -8.3317F, -3.1045F, 0.2091F, -0.0536F));

		PartDefinition cube_r399 = rightOrbit.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(86, 33).mirror().addBox(-0.3F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4776F, 4.1043F, -8.4374F, -2.9291F, 0.1223F, 0.7436F));

		PartDefinition cube_r400 = rightOrbit.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(86, 30).mirror().addBox(-0.3F, 0.1F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 86).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.0495F, 4.3354F, -8.0029F, -2.877F, -0.6432F, 0.5562F));

		PartDefinition cube_r401 = rightOrbit.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(35, 86).mirror().addBox(-0.3F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2205F, 4.3991F, -8.3537F, -2.9278F, 0.165F, 0.7529F));

		PartDefinition cube_r402 = rightOrbit.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(86, 36).mirror().addBox(-0.3F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0646F, 4.7157F, -8.2088F, -2.5581F, 0.3608F, 0.3892F));

		PartDefinition cube_r403 = rightOrbit.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(66, 19).mirror().addBox(-0.5F, -0.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0809F, 4.6585F, -7.7225F, -2.5531F, -0.3803F, -0.0826F));

		PartDefinition cube_r404 = rightOrbit.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(7, 66).mirror().addBox(-0.5298F, 0.399F, 0.4652F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.1898F, 5.5701F, -6.7792F, -2.9022F, -0.3803F, -0.0826F));

		PartDefinition cube_r405 = rightOrbit.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(66, 22).mirror().addBox(-0.5298F, -1.4336F, 0.0491F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1898F, 5.5701F, -6.7792F, 1.8539F, -0.3803F, -0.0826F));

		PartDefinition cube_r406 = rightOrbit.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(85, 9).mirror().addBox(-0.5298F, -1.0158F, -1.3459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(0, 66).mirror().addBox(-0.5298F, -1.0158F, -1.2459F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.1898F, 5.5701F, -6.7792F, 0.6321F, -0.3803F, -0.0826F));

		PartDefinition cube_r407 = rightOrbit.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.6F, -1.3F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7367F, 5.2471F, -7.1609F, 1.1177F, 0.1569F, -1.1438F));

		PartDefinition cube_r408 = rightOrbit.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(61, 61).mirror().addBox(-1.0F, -0.925F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7367F, 5.2471F, -7.1609F, 1.3705F, -0.4681F, -0.8231F));

		PartDefinition cube_r409 = rightOrbit.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(85, 84).mirror().addBox(-0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0924F, 5.9234F, -7.5681F, -0.4702F, -0.0195F, 0.7833F));

		PartDefinition cube_r410 = rightOrbit.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(61, 65).mirror().addBox(-0.5298F, -0.1418F, -1.1263F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1898F, 5.5701F, -6.7792F, -0.2842F, -0.3803F, -0.0826F));

		PartDefinition cube_r411 = rightOrbit.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(85, 81).mirror().addBox(-0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2306F, 6.0131F, -7.2052F, -0.3951F, 0.0021F, 1.2048F));

		PartDefinition cube_r412 = rightOrbit.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(54, 65).mirror().addBox(-0.5298F, -0.2243F, -0.8168F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.1898F, 5.5701F, -6.7792F, -0.1096F, -0.3803F, -0.0826F));

		PartDefinition cube_r413 = rightOrbit.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(84, 44).mirror().addBox(-0.5298F, -0.2815F, -0.5544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1898F, 5.5701F, -6.7792F, 0.1958F, -0.3803F, -0.0826F));

		PartDefinition cube_r414 = rightOrbit.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(81, 75).mirror().addBox(-0.3007F, -0.6344F, -0.4118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4791F, 5.877F, -6.5123F, 0.4751F, -0.2923F, -0.1039F));

		PartDefinition cube_r415 = rightOrbit.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(25, 84).mirror().addBox(-0.3007F, -0.5736F, -0.0328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.4791F, 5.877F, -6.5123F, 0.6933F, -0.2923F, -0.1039F));

		PartDefinition cube_r416 = rightOrbit.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(20, 84).mirror().addBox(-0.3007F, -0.3013F, 0.2228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 84).mirror().addBox(-0.3007F, -0.3013F, 0.6228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.4791F, 5.877F, -6.5123F, 1.1296F, -0.2923F, -0.1039F));

		PartDefinition cube_r417 = rightOrbit.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(47, 63).mirror().addBox(-0.3007F, -0.4126F, -0.3838F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.4791F, 5.877F, -6.5123F, 0.9114F, -0.2923F, -0.1039F));

		PartDefinition cube_r418 = rightOrbit.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(80, 85).mirror().addBox(-0.3007F, 0.7828F, 0.0598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4791F, 5.877F, -6.5123F, 2.0895F, -0.2923F, -0.1039F));

		PartDefinition cube_r419 = rightOrbit.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(80, 6).mirror().addBox(-0.3007F, 0.9914F, -0.633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.4791F, 5.877F, -6.5123F, 2.5259F, -0.2923F, -0.1039F));

		PartDefinition cube_r420 = rightOrbit.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(83, 71).mirror().addBox(-0.6743F, 1.3532F, -0.631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(81, 48).mirror().addBox(-0.6743F, 1.7532F, -0.631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4791F, 5.877F, -6.5123F, 2.4986F, -0.1238F, 0.0462F));

		PartDefinition cube_r421 = rightOrbit.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-0.5279F, 3.3888F, -1.0832F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(9, 48).mirror().addBox(-0.7279F, 2.9888F, -1.0832F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4791F, 5.877F, -6.5123F, 2.6169F, 0.1207F, -0.0028F));

		PartDefinition cube_r422 = rightOrbit.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(19, 65).mirror().addBox(1.7937F, 2.4231F, -1.0832F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4791F, 5.877F, -6.5123F, 2.6713F, -0.2698F, -0.6907F));

		PartDefinition cube_r423 = rightOrbit.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(73, 59).mirror().addBox(-0.9299F, 2.0869F, -0.4174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4791F, 5.877F, -6.5123F, 2.4044F, -0.0536F, 0.1243F));

		PartDefinition cube_r424 = rightOrbit.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(65, 82).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0531F, 5.9368F, -6.78F, 0.5882F, -0.3497F, -0.2606F));

		PartDefinition cube_r425 = rightOrbit.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(81, 32).mirror().addBox(-0.4892F, -0.2768F, 0.4283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3145F, 6.5989F, -7.3176F, 0.9373F, -0.3497F, -0.2606F));

		PartDefinition cube_r426 = rightOrbit.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-0.3892F, -0.2285F, -0.5665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.3145F, 6.5989F, -7.3176F, 2.4208F, -0.3497F, -0.2606F));

		PartDefinition cube_r427 = rightOrbit.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(30, 81).mirror().addBox(-0.3769F, -0.5732F, -0.1479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3145F, 6.5989F, -7.3176F, -2.4564F, -0.18F, -0.097F));

		PartDefinition cube_r428 = rightOrbit.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(50, 80).mirror().addBox(-0.3769F, 0.504F, -0.2483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.3145F, 6.5989F, -7.3176F, -1.1474F, -0.18F, -0.097F));

		PartDefinition cube_r429 = rightOrbit.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-0.725F, -0.625F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.8411F, 8.2208F, -8.4456F, 0.3212F, -0.0197F, -0.091F));

		PartDefinition cube_r430 = rightOrbit.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(5, 83).mirror().addBox(-0.5F, -0.6587F, -0.5218F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0748F, 6.2439F, -6.2653F, -1.0938F, -0.2658F, -0.137F));

		PartDefinition cube_r431 = rightOrbit.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.5F, -0.3609F, -0.5793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.0748F, 6.2439F, -6.2653F, -0.4393F, -0.2658F, -0.137F));

		PartDefinition cube_r432 = rightOrbit.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(35, 80).mirror().addBox(-0.5F, -0.6735F, -0.5479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2809F, 6.9833F, -6.8504F, -1.1198F, -0.3345F, -0.0754F));

		PartDefinition cube_r433 = rightOrbit.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(15, 80).mirror().addBox(-0.5F, -0.3613F, -0.6647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.2809F, 6.9833F, -6.8504F, -0.1599F, -0.3345F, -0.0754F));

		PartDefinition cube_r434 = rightOrbit.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(56, 11).mirror().addBox(-0.5256F, 0.5002F, -2.1129F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.2302F, 6.6556F, -6.8053F, -0.15F, -0.2265F, -0.1612F));

		PartDefinition cube_r435 = rightOrbit.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(78, 26).mirror().addBox(3.9808F, 3.6955F, 0.9691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4791F, 5.877F, -6.5123F, 0.133F, -0.3019F, -2.1857F));

		PartDefinition cube_r436 = rightOrbit.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(39, 73).mirror().addBox(4.2837F, -3.4852F, 0.9691F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.4791F, 5.877F, -6.5123F, -0.2483F, -0.2182F, -0.8989F));

		PartDefinition cube_r437 = rightOrbit.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(63, 12).mirror().addBox(-0.6667F, -5.9231F, 0.043F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4791F, 5.877F, -6.5123F, -0.4811F, 0.0639F, 0.1405F));

		PartDefinition cube_r438 = rightOrbit.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(64, 39).mirror().addBox(0.8636F, -5.7696F, 0.043F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4791F, 5.877F, -6.5123F, -0.4792F, -0.0781F, -0.1301F));

		PartDefinition cube_r439 = rightOrbit.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(89, 39).mirror().addBox(-0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.6809F, 9.0401F, -9.3079F, 1.7441F, 0.7126F, 1.8277F));

		PartDefinition cube_r440 = rightOrbit.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(35, 89).mirror().addBox(-0.2F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.2119F, 8.7621F, -9.0573F, 0.9619F, 0.4308F, 0.535F));

		PartDefinition cube_r441 = rightOrbit.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(89, 63).mirror().addBox(-0.5F, -0.475F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.5859F, 7.6771F, -9.1819F, 0.1369F, -0.1377F, 0.2871F));

		PartDefinition cube_r442 = rightOrbit.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(45, 89).mirror().addBox(-0.2297F, -0.2801F, -0.6989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.3926F, 7.3329F, -9.1101F, 0.3551F, -0.1377F, 0.2871F));

		PartDefinition cube_r443 = rightOrbit.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(83, 68).mirror().addBox(-0.2F, -0.5F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.4308F, 7.0447F, -9.067F, 2.503F, -0.1677F, 0.2884F));

		PartDefinition cube_r444 = rightOrbit.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(83, 61).mirror().addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.8742F, 6.989F, -9.243F, 2.4682F, -0.3409F, 0.4257F));

		PartDefinition cube_r445 = rightOrbit.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.8027F, 7.2726F, -9.2918F, 1.7991F, -0.2432F, 0.5206F));

		PartDefinition cube_r446 = rightOrbit.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(89, 42).mirror().addBox(-0.35F, -0.525F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.4075F, 8.1839F, -9.0557F, 0.1985F, -0.0242F, -0.1293F));

		PartDefinition cube_r447 = rightOrbit.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(15, 89).mirror().addBox(-0.5F, -0.8F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.5722F, 8.5589F, -8.4746F, 0.8441F, 0.0731F, 0.0772F));

		PartDefinition cube_r448 = rightOrbit.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(60, 89).mirror().addBox(-0.4929F, -0.3112F, -0.7523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(55, 89).mirror().addBox(-0.4929F, -0.6112F, -0.7523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.626F, 7.6719F, -9.0294F, -2.1691F, -0.2255F, 0.2812F));

		PartDefinition cube_r449 = rightOrbit.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(50, 89).mirror().addBox(-0.5F, -0.575F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.5658F, 8.1456F, -8.5702F, -1.7799F, 0.0013F, -0.0151F));

		PartDefinition cube_r450 = rightOrbit.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(5, 89).mirror().addBox(-0.5F, 0.575F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.5525F, 7.2206F, -8.0221F, -0.5581F, 0.0013F, -0.0151F));

		PartDefinition cube_r451 = rightOrbit.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(80, 9).mirror().addBox(0.075F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.0582F, 6.0925F, -7.6392F, 1.9995F, 0.6265F, -0.3531F));

		PartDefinition cube_r452 = rightOrbit.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(82, 12).mirror().addBox(-0.2F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.0582F, 6.0925F, -7.6392F, 2.2957F, 0.1774F, 0.359F));

		PartDefinition cube_r453 = rightOrbit.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(82, 3).mirror().addBox(-0.2F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0185F, 5.7215F, -7.9655F, 2.2957F, 0.1774F, 0.359F));

		PartDefinition cube_r454 = rightOrbit.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(19, 61).mirror().addBox(-0.2F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.121F, 5.4277F, -8.4473F, 1.3184F, 0.2059F, -0.2834F));

		PartDefinition cube_r455 = rightOrbit.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(47, 59).mirror().addBox(-0.2F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.121F, 5.4277F, -8.4473F, 1.2543F, 0.6675F, -0.4307F));

		PartDefinition cube_r456 = rightOrbit.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(80, 82).mirror().addBox(-0.2F, -0.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(40, 81).mirror().addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.1083F, 5.157F, -8.3185F, 2.5633F, 0.6675F, -0.4307F));

		PartDefinition cube_r457 = rightOrbit.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(81, 38).mirror().addBox(-0.5336F, -0.6265F, 0.154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2555F, 5.4663F, -7.3593F, 2.6896F, -0.1847F, 0.0422F));

		PartDefinition cube_r458 = rightOrbit.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(75, 82).mirror().addBox(-0.2F, -0.425F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(81, 35).mirror().addBox(-0.2F, -1.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.4977F, 4.4598F, -8.5807F, 2.6411F, -0.5006F, 0.1527F));

		PartDefinition cube_r459 = rightOrbit.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(64, 50).mirror().addBox(-1.8F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2527F, 0.1501F, -4.8017F, 3.106F, 0.5139F, 2.2948F));

		PartDefinition cube_r460 = rightOrbit.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(54, 61).mirror().addBox(-1.8F, -0.2F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2527F, 0.1501F, -4.8017F, 2.2159F, 0.5139F, 2.2948F));

		PartDefinition cube_r461 = rightOrbit.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(10, 71).mirror().addBox(-0.8F, -0.2F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3328F, 0.4023F, -5.0308F, 2.3256F, -0.3001F, -3.1052F));

		PartDefinition cube_r462 = rightOrbit.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(24, 71).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1306F, -0.0119F, -5.0227F, 1.7969F, -0.8282F, 2.217F));

		PartDefinition cube_r463 = rightOrbit.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(88, 15).mirror().addBox(0.1F, -0.2F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 87).mirror().addBox(-0.275F, -0.2F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0336F, -0.0836F, -5.6938F, 2.8878F, -0.8282F, 2.217F));

		PartDefinition cube_r464 = rightOrbit.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(10, 87).mirror().addBox(-0.2F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0336F, -0.0836F, -5.6938F, 2.9482F, -0.4875F, 2.1196F));

		PartDefinition cube_r465 = rightOrbit.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(88, 67).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8975F, -0.4855F, -5.9976F, -2.8046F, -0.4059F, 0.9978F));

		PartDefinition cube_r466 = rightOrbit.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-3.1F, -2.2F, -0.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(48, 67).mirror().addBox(-0.8F, -2.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-0.4916F, 2.1601F, -6.2013F, -1.5354F, -0.5983F, -2.0861F));

		PartDefinition cube_r467 = rightOrbit.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(49, 77).mirror().addBox(0.175F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(35, 77).mirror().addBox(-0.225F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2373F, 2.8676F, -6.3691F, -1.5406F, -0.2494F, -2.0736F));

		PartDefinition cube_r468 = rightOrbit.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(43, 67).mirror().addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4692F, 1.7315F, -5.9447F, -1.0149F, -0.2363F, 3.0495F));

		PartDefinition cube_r469 = rightOrbit.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(5, 77).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3875F, 2.5754F, -7.2282F, 1.7556F, -0.8996F, 2.3418F));

		PartDefinition cube_r470 = rightOrbit.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(77, 3).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0582F, 1.7141F, -6.9844F, 0.403F, -0.8996F, 2.3418F));

		PartDefinition cube_r471 = rightOrbit.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(76, 76).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0358F, 1.2855F, -6.7278F, -0.6006F, -0.8996F, 2.3418F));

		PartDefinition cube_r472 = rightOrbit.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7672F, 1.4566F, -7.4868F, 0.5274F, 0.0588F, 1.3026F));

		PartDefinition cube_r473 = rightOrbit.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(71, 76).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7896F, 1.028F, -7.2303F, 0.7749F, -0.7697F, 0.6702F));

		PartDefinition cube_r474 = rightOrbit.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(47, 55).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4252F, 0.924F, -5.4421F, 0.5915F, -0.233F, 3.0442F));

		PartDefinition cube_r475 = rightOrbit.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(25, 78).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0096F, 0.4524F, -6.2092F, 1.008F, -0.8743F, 2.3155F));

		PartDefinition cube_r476 = rightOrbit.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(78, 23).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8358F, 0.1801F, -6.7024F, 2.3086F, -0.7477F, 0.6988F));

		PartDefinition cube_r477 = rightOrbit.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(84, 64).mirror().addBox(-0.8F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0804F, -0.3657F, -5.215F, 2.4784F, -0.0873F, 3.1416F));

		PartDefinition cube_r478 = rightOrbit.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-0.8F, 0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(84, 78).mirror().addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.1148F, -0.6735F, -4.8225F, 1.2319F, -0.678F, 2.901F));

		PartDefinition cube_r479 = rightOrbit.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-0.4F, -0.2F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4325F, -0.4989F, -5.3503F, 2.5574F, -0.345F, 2.7799F));

		PartDefinition cube_r480 = rightOrbit.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(61, 57).mirror().addBox(-0.8F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0539F, -1.4816F, -4.2924F, -0.3839F, -0.5822F, -1.8797F));

		PartDefinition cube_r481 = rightOrbit.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(78, 59).mirror().addBox(0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(79, 42).mirror().addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9684F, -1.0431F, -5.187F, -0.7756F, -1.1076F, -1.3781F));

		PartDefinition cube_r482 = rightOrbit.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.2F, -0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.934F, -0.7353F, -5.5796F, -2.6886F, -0.5093F, 0.8973F));

		PartDefinition cube_r483 = rightOrbit.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(70, 82).mirror().addBox(-0.425F, -0.425F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(40, 59).mirror().addBox(-0.425F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.7845F, 4.7649F, -7.8628F, 2.7068F, 0.0325F, -0.1191F));

		PartDefinition cube_r484 = rightOrbit.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-0.2F, -1.8F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.5731F, 5.1816F, -8.9174F, 2.8288F, 0.0491F, -0.1245F));

		PartDefinition cube_r485 = rightOrbit.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(73, 18).mirror().addBox(-0.2F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.5731F, 5.1816F, -8.9174F, 2.7811F, -0.5129F, 0.0743F));

		PartDefinition cube_r486 = rightOrbit.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(46, 71).mirror().addBox(-0.2F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2826F, 5.3722F, -8.4283F, 1.3303F, -1.2488F, 1.7152F));

		PartDefinition cube_r487 = rightOrbit.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(71, 49).mirror().addBox(0.4F, -1.8F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2826F, 5.3722F, -8.4283F, 0.9434F, -1.1814F, 2.1269F));

		PartDefinition cube_r488 = rightOrbit.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(88, 60).mirror().addBox(-3.126F, 1.0803F, 4.868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4791F, 5.877F, -6.5123F, 1.3862F, 0.2438F, 0.6178F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 2.0308F, -1.0632F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(83, 58).mirror().addBox(-0.5F, -1.65F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.0607F, -0.2865F, -1.8809F, -2.9172F, -0.1724F, 0.0191F));

		PartDefinition cube_r490 = jaw.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(70, 88).mirror().addBox(0.0996F, -0.4012F, -0.0587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.3671F, -0.0466F, -1.3729F, -0.1899F, 0.0192F));

		PartDefinition cube_r491 = jaw.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(88, 70).mirror().addBox(-0.5F, -0.05F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2927F, 0.8779F, -0.0797F, -0.6311F, -0.1899F, 0.0192F));

		PartDefinition cube_r492 = jaw.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(75, 85).mirror().addBox(-0.5F, 0.0F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3099F, 1.969F, -0.0997F, -0.6354F, -0.1784F, 0.0682F));

		PartDefinition cube_r493 = jaw.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(80, 88).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1201F, 2.0262F, -1.11F, -0.24F, -0.1875F, 0.0359F));

		PartDefinition cube_r494 = jaw.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(65, 88).mirror().addBox(-0.5F, -0.95F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.0264F, 1.1031F, -1.6477F, -2.7077F, -0.1724F, 0.0191F));

		PartDefinition cube_r495 = jaw.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(75, 88).mirror().addBox(0.0996F, 0.5593F, -1.0474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.3671F, -0.0466F, -0.3428F, -0.1724F, 0.0191F));

		PartDefinition cube_r496 = jaw.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(33, 63).mirror().addBox(0.0996F, -0.6407F, -0.7474F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-3.15F, 0.3171F, -0.0466F, -1.9136F, -0.1724F, 0.0191F));

		PartDefinition cube_r497 = jaw.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(80, 52).mirror().addBox(-0.5F, -0.5325F, -0.3286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.7435F, 1.38F, 0.6551F, 2.8595F, -0.3691F, -0.0877F));

		PartDefinition cube_r498 = jaw.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(90, 6).mirror().addBox(-0.5F, -0.3329F, -0.5503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-2.7435F, 1.38F, 0.6551F, 1.7687F, -0.3691F, -0.0877F));

		PartDefinition cube_r499 = jaw.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(40, 78).mirror().addBox(-0.5F, -0.525F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(79, 65).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8693F, 3.3772F, -1.8384F, -0.8022F, -0.2855F, -0.1512F));

		PartDefinition cube_r500 = jaw.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0869F, 2.8221F, -1.1444F, -2.3142F, -0.2406F, -0.0625F));

		PartDefinition cube_r501 = jaw.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(78, 72).mirror().addBox(0.0F, -0.925F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4819F, 3.3069F, -1.6692F, -0.5645F, -0.1904F, -0.0824F));

		PartDefinition cube_r502 = jaw.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(72, 4).mirror().addBox(-0.5F, -0.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7901F, 3.2293F, -2.5122F, -0.764F, -0.2906F, -0.1453F));

		PartDefinition cube_r503 = jaw.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-0.5F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.5948F, 4.3612F, -2.6101F, -0.825F, -0.2906F, -0.1453F));

		PartDefinition cube_r504 = jaw.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(53, 70).mirror().addBox(-0.65F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(71, 33).mirror().addBox(-0.65F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.5984F, 3.5661F, -2.4777F, -1.6486F, -0.3175F, -0.1617F));

		PartDefinition cube_r505 = jaw.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(60, 83).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(30, 84).mirror().addBox(-0.5F, -0.575F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.9448F, 2.7041F, -2.1965F, -1.5689F, -0.12F, -0.1629F));

		PartDefinition cube_r506 = jaw.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(70, 53).mirror().addBox(-0.7F, -1.0F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(34, 71).mirror().addBox(-0.7F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-1.2083F, 4.294F, -3.2541F, -1.6846F, -0.2855F, -0.1182F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(43, 50).mirror().addBox(0.0996F, -1.6157F, -0.4474F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.15F, 0.3171F, -0.0466F, -3.0481F, -0.1724F, 0.0191F));

		PartDefinition cube_r508 = jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(34, 71).addBox(-0.3F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(70, 53).addBox(-0.3F, -1.0F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3917F, 4.294F, -3.2541F, -1.6846F, 0.2855F, 0.1182F));

		PartDefinition cube_r509 = jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(30, 84).addBox(-0.5F, -0.575F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(60, 83).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3449F, 2.7041F, -2.1965F, -1.5689F, 0.12F, 0.1629F));

		PartDefinition cube_r510 = jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(71, 33).addBox(-0.35F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F))
				.texOffs(53, 70).addBox(-0.35F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.0015F, 3.5661F, -2.4777F, -1.6486F, 0.3175F, 0.1617F));

		PartDefinition cube_r511 = jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.0051F, 4.3612F, -2.6101F, -0.825F, 0.2906F, 0.1453F));

		PartDefinition cube_r512 = jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(72, 4).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1901F, 3.2293F, -2.5122F, -0.764F, 0.2906F, 0.1453F));

		PartDefinition cube_r513 = jaw.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(78, 72).addBox(-1.0F, -0.925F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8819F, 3.3069F, -1.6692F, -0.5645F, 0.1904F, 0.0824F));

		PartDefinition cube_r514 = jaw.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4869F, 2.8221F, -1.1444F, -2.3142F, 0.2406F, 0.0625F));

		PartDefinition cube_r515 = jaw.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(79, 65).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(40, 78).addBox(-0.5F, -0.525F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2693F, 3.3772F, -1.8384F, -0.8022F, 0.2855F, 0.1512F));

		PartDefinition cube_r516 = jaw.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(90, 6).addBox(-0.5F, -0.3329F, -0.5503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.1435F, 1.38F, 0.6551F, 1.7687F, 0.3691F, 0.0877F));

		PartDefinition cube_r517 = jaw.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(80, 52).addBox(-0.5F, -0.5325F, -0.3286F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.1435F, 1.38F, 0.6551F, 2.8595F, 0.3691F, 0.0877F));

		PartDefinition cube_r518 = jaw.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(43, 50).addBox(-1.0996F, -1.6157F, -0.4474F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.55F, 0.3171F, -0.0466F, -3.0481F, 0.1724F, -0.0191F));

		PartDefinition cube_r519 = jaw.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(33, 63).addBox(-1.0996F, -0.6407F, -0.7474F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(1.55F, 0.3171F, -0.0466F, -1.9136F, 0.1724F, -0.0191F));

		PartDefinition cube_r520 = jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(75, 88).addBox(-1.0996F, 0.5593F, -1.0474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3F, 0.3671F, -0.0466F, -0.3428F, 0.1724F, -0.0191F));

		PartDefinition cube_r521 = jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(65, 88).addBox(-0.5F, -0.95F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.4264F, 1.1031F, -1.6477F, -2.7077F, 0.1724F, -0.0191F));

		PartDefinition cube_r522 = jaw.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(80, 88).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5201F, 2.0262F, -1.11F, -0.24F, 0.1875F, -0.0359F));

		PartDefinition cube_r523 = jaw.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(75, 85).addBox(-0.5F, 0.0F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7099F, 1.969F, -0.0997F, -0.6354F, 0.1784F, -0.0682F));

		PartDefinition cube_r524 = jaw.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(88, 70).addBox(-0.5F, -0.05F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6927F, 0.8779F, -0.0797F, -0.6311F, 0.1899F, -0.0192F));

		PartDefinition cube_r525 = jaw.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(70, 88).addBox(-1.0996F, -0.4012F, -0.0587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.3671F, -0.0466F, -1.3729F, 0.1899F, -0.0192F));

		PartDefinition cube_r526 = jaw.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(83, 58).addBox(-0.5F, -1.65F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.4607F, -0.2865F, -1.8809F, -2.9172F, 0.1724F, -0.0191F));

		PartDefinition bone3 = jaw.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.1554F, 4.9473F, -3.5115F));

		PartDefinition cube_r527 = bone3.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(59, 77).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9542F, 1.577F, -1.7284F, -2.0079F, -0.053F, 0.004F));

		PartDefinition cube_r528 = bone3.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(40, 63).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(63, 53).mirror().addBox(-0.5F, -0.8F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.9699F, 0.3735F, -0.9633F, -2.5577F, -0.053F, 0.004F));

		PartDefinition cube_r529 = bone3.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(75, 53).mirror().addBox(-0.4169F, -0.0083F, -0.7077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(64, 77).mirror().addBox(-0.4169F, -0.6083F, -0.7077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.2893F, 0.0F, 0.0F, -0.8597F, -0.2527F, -0.0914F));

		PartDefinition cube_r530 = bone3.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(75, 56).mirror().addBox(-0.5F, -0.425F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(76, 33).mirror().addBox(-0.5F, -0.425F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1284F, 0.644F, -0.0604F, -0.9496F, -0.2596F, -0.0686F));

		PartDefinition cube_r531 = bone3.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(-0.4169F, -0.735F, -0.1813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2893F, 0.0F, 0.0F, -0.7201F, -0.2527F, -0.0914F));

		PartDefinition cube_r532 = bone3.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-0.7939F, 0.1957F, -0.6441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6893F, 0.3F, -0.7F, 0.5665F, -0.053F, 0.004F));

		PartDefinition cube_r533 = bone3.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(15, 77).mirror().addBox(-0.5F, -0.125F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.9471F, 0.9889F, -1.8179F, 1.6137F, -0.053F, 0.004F));

		PartDefinition cube_r534 = bone3.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(51, 74).mirror().addBox(-0.2925F, 0.1234F, -1.1035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-0.6893F, 0.65F, -1.4F, -1.3334F, 0.0592F, 3.1052F));

		PartDefinition cube_r535 = bone3.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(70, 85).mirror().addBox(-0.475F, -0.9491F, -0.906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9206F, 0.1789F, -1.1385F, -1.5856F, -0.0847F, -0.0099F));

		PartDefinition cube_r536 = bone3.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(76, 39).mirror().addBox(-0.5F, -0.1712F, 0.0084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(77, 14).mirror().addBox(-0.5F, -0.5962F, -0.3916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.9206F, 0.1789F, -1.1385F, -1.8474F, -0.0847F, -0.0099F));

		PartDefinition cube_r537 = bone3.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(79, 45).mirror().addBox(-0.5233F, -0.5158F, -0.7022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-1.0633F, 0.8605F, -2.0517F, -1.078F, -0.1418F, 3.0931F));

		PartDefinition cube_r538 = bone3.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(15, 83).mirror().addBox(-0.5233F, -0.53F, -0.5496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.0633F, 0.8605F, -2.0517F, -1.2962F, -0.1418F, 3.0931F));

		PartDefinition cube_r539 = bone3.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(56, 74).mirror().addBox(-0.5233F, -0.2638F, -0.2261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.0633F, 0.8605F, -2.0517F, -2.387F, -0.1418F, 3.0931F));

		PartDefinition cube_r540 = bone3.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(89, 77).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.9956F, 1.3773F, -0.5562F, 1.8755F, -0.053F, 0.004F));

		PartDefinition cube_r541 = bone3.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(20, 78).mirror().addBox(-0.4169F, -0.735F, -0.1563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.2893F, 0.0F, 0.0F, -1.8982F, -0.2527F, -0.0914F));

		PartDefinition cube_r542 = bone3.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(61, 74).mirror().addBox(-0.5233F, -0.2057F, 0.1129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false)
				.texOffs(66, 74).mirror().addBox(-0.5233F, -0.2057F, 0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.0633F, 0.8605F, -2.0517F, -2.2561F, -0.1418F, 3.0931F));

		PartDefinition cube_r543 = bone3.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(83, 15).mirror().addBox(-0.5233F, -0.1867F, -0.6024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(83, 18).mirror().addBox(-0.5233F, 0.2132F, -0.6024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0633F, 0.8605F, -2.0517F, -0.9035F, -0.1418F, 3.0931F));

		PartDefinition cube_r544 = bone3.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(77, 14).addBox(-0.5F, -0.5962F, -0.3916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F))
				.texOffs(76, 39).addBox(-0.5F, -0.1712F, 0.0084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.3687F, 0.1789F, -1.1385F, -1.8474F, 0.0847F, 0.0099F));

		PartDefinition cube_r545 = bone3.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(70, 85).addBox(-0.525F, -0.9491F, -0.906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3687F, 0.1789F, -1.1385F, -1.5856F, 0.0847F, 0.0099F));

		PartDefinition cube_r546 = bone3.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(51, 74).addBox(-0.7075F, 0.1234F, -1.1035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(-0.6F, 0.65F, -1.4F, -1.3334F, -0.0592F, -3.1052F));

		PartDefinition cube_r547 = bone3.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(15, 77).addBox(-0.5F, -0.125F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.3422F, 0.9889F, -1.8179F, 1.6137F, 0.053F, -0.004F));

		PartDefinition cube_r548 = bone3.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(89, 77).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.2937F, 1.3773F, -0.5562F, 1.8755F, 0.053F, -0.004F));

		PartDefinition cube_r549 = bone3.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(0, 89).addBox(-0.2061F, 0.1957F, -0.6441F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 0.3F, -0.7F, 0.5665F, 0.053F, -0.004F));

		PartDefinition cube_r550 = bone3.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(20, 78).addBox(-0.5831F, -0.735F, -0.1563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.8982F, 0.2527F, 0.0914F));

		PartDefinition cube_r551 = bone3.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(10, 78).addBox(-0.5831F, -0.735F, -0.1813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7201F, 0.2527F, 0.0914F));

		PartDefinition cube_r552 = bone3.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(76, 33).addBox(-0.5F, -0.425F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(75, 56).addBox(-0.5F, -0.425F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.1609F, 0.644F, -0.0604F, -0.9496F, 0.2596F, 0.0686F));

		PartDefinition cube_r553 = bone3.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(64, 77).addBox(-0.5831F, -0.6083F, -0.7077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(75, 53).addBox(-0.5831F, -0.0083F, -0.7077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8597F, 0.2527F, 0.0914F));

		PartDefinition cube_r554 = bone3.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(63, 53).addBox(-0.5F, -0.8F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F))
				.texOffs(40, 63).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.3193F, 0.3735F, -0.9633F, -2.5577F, 0.053F, -0.004F));

		PartDefinition cube_r555 = bone3.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(59, 77).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3351F, 1.577F, -1.7284F, -2.0079F, 0.053F, -0.004F));

		PartDefinition cube_r556 = bone3.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(66, 74).addBox(-0.4767F, -0.2057F, 0.5129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(61, 74).addBox(-0.4767F, -0.2057F, 0.1129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(-0.226F, 0.8605F, -2.0517F, -2.2561F, 0.1418F, -3.0931F));

		PartDefinition cube_r557 = bone3.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(56, 74).addBox(-0.4767F, -0.2638F, -0.2261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.226F, 0.8605F, -2.0517F, -2.387F, 0.1418F, -3.0931F));

		PartDefinition cube_r558 = bone3.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(83, 18).addBox(-0.4767F, 0.2132F, -0.6024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(83, 15).addBox(-0.4767F, -0.1867F, -0.6024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-0.226F, 0.8605F, -2.0517F, -0.9035F, 0.1418F, -3.0931F));

		PartDefinition cube_r559 = bone3.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(15, 83).addBox(-0.4767F, -0.53F, -0.5496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.226F, 0.8605F, -2.0517F, -1.2962F, 0.1418F, -3.0931F));

		PartDefinition cube_r560 = bone3.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(79, 45).addBox(-0.4767F, -0.5158F, -0.7022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(-0.226F, 0.8605F, -2.0517F, -1.078F, 0.1418F, -3.0931F));

		PartDefinition bone2 = body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 8.4308F, -3.7781F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 40).addBox(-0.496F, -0.0236F, -0.0019F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5781F, 0.6285F, -0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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