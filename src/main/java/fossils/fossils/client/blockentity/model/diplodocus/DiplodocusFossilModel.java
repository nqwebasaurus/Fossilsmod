package fossils.fossils.client.blockentity.model.diplodocus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DiplodocusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hip;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart leftLeg6;
	private final ModelPart leftLeg7;
	private final ModelPart leftLeg8;
	private final ModelPart rightLeg5;
	private final ModelPart rightLeg6;
	private final ModelPart rightLeg7;
	private final ModelPart rightLeg8;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart tail12;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart leftArm6;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart rightArm6;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart throat;

	public DiplodocusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hip = this.root.getChild("hip");
		this.leftLeg = this.hip.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg.getChild("leftLeg5");
		this.leftLeg6 = this.leftLeg5.getChild("leftLeg6");
		this.leftLeg7 = this.leftLeg6.getChild("leftLeg7");
		this.leftLeg8 = this.leftLeg7.getChild("leftLeg8");
		this.rightLeg5 = this.leftLeg.getChild("rightLeg5");
		this.rightLeg6 = this.rightLeg5.getChild("rightLeg6");
		this.rightLeg7 = this.rightLeg6.getChild("rightLeg7");
		this.rightLeg8 = this.rightLeg7.getChild("rightLeg8");
		this.tail1 = this.hip.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.tail12 = this.tail11.getChild("tail12");
		this.body = this.hip.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm4 = this.leftArm.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.leftArm6 = this.leftArm5.getChild("leftArm6");
		this.rightArm4 = this.leftArm.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.rightArm6 = this.rightArm5.getChild("rightArm6");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.throat = this.jaw.getChild("throat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -51.05F, 1.0F));

		PartDefinition hip = root.addOrReplaceChild("hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 20.0F));

		PartDefinition cube_r1 = hip.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(81, 36).mirror().addBox(-13.7613F, -2.1176F, -1.1638F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0284F, -3.1954F, -6.6281F, -0.2376F, -0.306F, -1.089F));

		PartDefinition cube_r2 = hip.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(182, 113).mirror().addBox(-5.2432F, -0.1654F, -1.089F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0284F, -3.1954F, -6.6281F, -0.3394F, -0.2095F, -0.695F));

		PartDefinition cube_r3 = hip.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(184, 3).mirror().addBox(-5.2432F, -0.1654F, -1.089F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0284F, -4.2954F, -10.8281F, -0.2716F, -0.1532F, -0.7072F));

		PartDefinition cube_r4 = hip.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(177, 162).mirror().addBox(-12.7613F, -2.1176F, -1.1638F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0284F, -4.2954F, -10.8281F, -0.1962F, -0.2284F, -1.0999F));

		PartDefinition cube_r5 = hip.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(101, 72).mirror().addBox(-15.6728F, -7.3005F, -1.1638F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0284F, -4.2954F, -10.8281F, -0.0798F, -0.2895F, -1.5472F));

		PartDefinition cube_r6 = hip.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(117, 114).mirror().addBox(-10.934F, -0.0061F, -0.8192F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.4284F, 4.4046F, -16.1281F, -0.0699F, -0.2027F, -1.4623F));

		PartDefinition cube_r7 = hip.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(177, 165).mirror().addBox(-12.7766F, -2.1029F, -1.2616F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0284F, -5.2954F, -14.0281F, -0.1494F, -0.1542F, -1.0216F));

		PartDefinition cube_r8 = hip.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(184, 6).mirror().addBox(-5.2534F, -0.1456F, -1.1865F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0284F, -5.2954F, -14.0281F, -0.2003F, -0.1021F, -0.629F));

		PartDefinition cube_r9 = hip.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(81, 36).addBox(4.7613F, -2.1176F, -1.1638F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0284F, -3.1954F, -6.6281F, -0.2376F, 0.306F, 1.089F));

		PartDefinition cube_r10 = hip.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(182, 113).addBox(-0.7568F, -0.1654F, -1.089F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0284F, -3.1954F, -6.6281F, -0.3394F, 0.2095F, 0.695F));

		PartDefinition cube_r11 = hip.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(177, 162).addBox(4.7613F, -2.1176F, -1.1638F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0284F, -4.2954F, -10.8281F, -0.1962F, 0.2284F, 1.0999F));

		PartDefinition cube_r12 = hip.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(101, 72).addBox(10.6728F, -7.3005F, -1.1638F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0284F, -4.2954F, -10.8281F, -0.0798F, 0.2895F, 1.5472F));

		PartDefinition cube_r13 = hip.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(184, 3).addBox(-0.7568F, -0.1654F, -1.089F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0284F, -4.2954F, -10.8281F, -0.2716F, 0.1532F, 0.7072F));

		PartDefinition cube_r14 = hip.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(117, 114).addBox(-0.066F, -0.0061F, -0.8192F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.4284F, 4.4046F, -16.1281F, -0.0699F, 0.2027F, 1.4623F));

		PartDefinition cube_r15 = hip.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(63, 17).addBox(-1.5F, -8.437F, 2.7562F, 3.0F, 10.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(106, 171).addBox(-1.5F, -12.437F, 4.1562F, 3.0F, 14.0F, 3.0F, new CubeDeformation(-0.2F))
				.texOffs(158, 171).addBox(-1.5F, -12.437F, 1.1562F, 3.0F, 14.0F, 3.0F, new CubeDeformation(-0.2F))
				.texOffs(73, 173).addBox(-1.5F, -12.437F, -1.8438F, 3.0F, 14.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.4572F, -1.0555F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hip.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 174).addBox(-1.5F, -13.0806F, -0.4033F, 3.0F, 14.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -4.1468F, -6.6832F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hip.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(149, 71).addBox(-3.0F, 2.1437F, -1.8332F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.9221F, -4.6564F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hip.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(179, 71).addBox(-3.0F, 2.1437F, -1.8332F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.4221F, -9.3564F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hip.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(46, 174).addBox(-1.5F, -9.8646F, -1.6147F, 3.0F, 14.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -8.4221F, -9.3564F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hip.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 126).addBox(-1.5F, -9.6646F, -1.6147F, 3.0F, 13.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -9.7221F, -13.2564F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hip.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(180, 130).addBox(-3.0F, 2.1437F, -1.8332F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.7221F, -13.2564F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hip.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(177, 165).addBox(4.7766F, -2.1029F, -1.2616F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0284F, -5.2954F, -14.0281F, -0.1494F, 0.1542F, 1.0216F));

		PartDefinition cube_r23 = hip.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(184, 6).addBox(-0.7466F, -0.1456F, -1.1865F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0284F, -5.2954F, -14.0281F, -0.2003F, 0.1021F, 0.629F));

		PartDefinition cube_r24 = hip.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(174, 99).mirror().addBox(4.0403F, 13.6055F, -10.8028F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.1825F, 4.5788F, 0.6745F, -0.1731F, 0.1152F, -0.0563F));

		PartDefinition cube_r25 = hip.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(176, 19).mirror().addBox(-6.7796F, 2.364F, -5.574F, 2.0F, 13.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.1825F, 4.5788F, 0.6745F, -0.4236F, -0.0308F, -0.7849F));

		PartDefinition cube_r26 = hip.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(13, 145).mirror().addBox(-1.0F, -2.0F, -2.5F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6223F, 16.6443F, 8.6746F, -0.4399F, 0.0654F, -0.285F));

		PartDefinition cube_r27 = hip.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(96, 135).mirror().addBox(-1.6371F, 0.1028F, -12.3409F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4327F, 14.2743F, 8.2033F, -0.9291F, 0.2941F, -0.5768F));

		PartDefinition cube_r28 = hip.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(61, 84).mirror().addBox(-4.4342F, -4.1465F, -4.9139F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.1825F, 8.5788F, -2.3255F, -0.1735F, -0.0094F, -0.218F));

		PartDefinition cube_r29 = hip.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(61, 84).mirror().addBox(-5.2265F, -1.1295F, -0.53F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.1825F, 4.6788F, -7.7255F, -0.4266F, -0.0094F, -0.218F));

		PartDefinition cube_r30 = hip.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-4.8175F, -3.2965F, -6.8862F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(67, 132).mirror().addBox(-4.8175F, -6.2965F, -10.0862F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(64, 0).addBox(13.1825F, -3.2965F, -6.8862F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(67, 132).addBox(13.1825F, -6.2965F, -10.0862F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.1825F, 8.5788F, -2.3255F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r31 = hip.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(20, 0).mirror().addBox(-0.8F, -4.0F, -2.5F, 2.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.2114F, 0.9882F, 3.252F, -1.0741F, -0.1302F, 0.0981F));

		PartDefinition cube_r32 = hip.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(19, 58).mirror().addBox(-1.0589F, -0.0537F, -0.0272F, 2.0F, 5.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-9.5316F, 1.1719F, 7.7833F, -1.7804F, -0.127F, 0.0929F));

		PartDefinition cube_r33 = hip.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(97, 135).mirror().addBox(-5.2612F, 1.5249F, -3.5331F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(50, 112).mirror().addBox(-5.2612F, -0.4751F, -5.5331F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1825F, -7.0212F, -4.8255F, 0.4804F, 0.1482F, 0.0065F));

		PartDefinition cube_r34 = hip.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(27, 170).mirror().addBox(-5.2612F, 2.9598F, -4.9321F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.1825F, -7.0212F, -4.8255F, -0.174F, 0.1482F, 0.0065F));

		PartDefinition cube_r35 = hip.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(18, 41).mirror().addBox(-1.0F, -3.7F, -2.1F, 2.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 41).addBox(17.0F, -3.7F, -2.1F, 2.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -2.2985F, 0.5719F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r36 = hip.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(19, 18).mirror().addBox(-4.8175F, -0.0593F, -5.9466F, 2.0F, 8.0F, 6.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(19, 18).addBox(13.1825F, -0.0593F, -5.9466F, 2.0F, 8.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-5.1825F, -6.4212F, 1.0745F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r37 = hip.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(168, 153).mirror().addBox(-7.4839F, -8.6625F, -8.6204F, 8.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.1825F, 8.5788F, -0.4255F, -0.3534F, -0.2014F, 0.2129F));

		PartDefinition cube_r38 = hip.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(157, 44).mirror().addBox(-4.9324F, -9.3625F, -0.4646F, 7.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.1825F, 8.5788F, -2.3255F, -0.3575F, 0.2496F, 0.0472F));

		PartDefinition cube_r39 = hip.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(135, 0).mirror().addBox(-4.0222F, -8.6625F, -8.282F, 7.0F, 2.0F, 9.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-5.1825F, 8.5788F, -0.4255F, -0.3463F, 0.0447F, 0.1231F));

		PartDefinition cube_r40 = hip.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(168, 153).addBox(-0.5161F, -8.6625F, -8.6204F, 8.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.1825F, 8.5788F, -0.4255F, -0.3534F, 0.2014F, -0.2129F));

		PartDefinition cube_r41 = hip.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(135, 0).addBox(-2.9778F, -8.6625F, -8.282F, 7.0F, 2.0F, 9.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(5.1825F, 8.5788F, -0.4255F, -0.3463F, -0.0447F, -0.1231F));

		PartDefinition cube_r42 = hip.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(157, 44).addBox(-2.0676F, -9.3625F, -0.4646F, 7.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.1825F, 8.5788F, -2.3255F, -0.3575F, -0.2496F, -0.0472F));

		PartDefinition cube_r43 = hip.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(50, 112).addBox(3.2612F, -0.4751F, -5.5331F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(97, 135).addBox(3.2612F, 1.5249F, -3.5331F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(5.1825F, -7.0212F, -4.8255F, 0.4804F, -0.1482F, -0.0065F));

		PartDefinition cube_r44 = hip.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(27, 170).addBox(3.2612F, 2.9598F, -4.9321F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.1825F, -7.0212F, -4.8255F, -0.174F, -0.1482F, -0.0065F));

		PartDefinition cube_r45 = hip.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(20, 0).addBox(-1.2F, -4.0F, -2.5F, 2.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.2114F, 0.9882F, 3.252F, -1.0741F, 0.1302F, -0.0981F));

		PartDefinition cube_r46 = hip.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(19, 58).addBox(-0.9411F, -0.0537F, -0.0272F, 2.0F, 5.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(9.5316F, 1.1719F, 7.7833F, -1.7804F, 0.127F, -0.0929F));

		PartDefinition cube_r47 = hip.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(61, 84).addBox(3.2265F, -1.1295F, -0.53F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.1825F, 4.6788F, -7.7255F, -0.4266F, 0.0094F, 0.218F));

		PartDefinition cube_r48 = hip.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(61, 84).addBox(2.4342F, -4.1465F, -4.9139F, 2.0F, 5.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.1825F, 8.5788F, -2.3255F, -0.1735F, 0.0094F, 0.218F));

		PartDefinition cube_r49 = hip.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(170, 51).addBox(2.8175F, -5.9586F, -4.3653F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1825F, 8.5788F, -2.3255F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r50 = hip.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(176, 19).addBox(4.7796F, 2.364F, -5.574F, 2.0F, 13.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.1825F, 4.5788F, 0.6745F, -0.4236F, 0.0308F, 0.7849F));

		PartDefinition cube_r51 = hip.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(174, 99).addBox(-6.0403F, 13.6055F, -10.8028F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.1825F, 4.5788F, 0.6745F, -0.1731F, -0.1152F, 0.0563F));

		PartDefinition cube_r52 = hip.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(96, 135).addBox(-0.3629F, 0.1028F, -12.3409F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4327F, 14.2743F, 8.2033F, -0.9291F, -0.2941F, 0.5768F));

		PartDefinition cube_r53 = hip.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(13, 145).addBox(-1.0F, -2.0F, -2.5F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6223F, 16.6443F, 8.6746F, -0.4399F, -0.0654F, 0.285F));

		PartDefinition cube_r54 = hip.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 79).addBox(-1.5F, -0.0428F, -0.3692F, 4.0F, 4.0F, 28.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, -7.5F, -16.8F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftLeg = hip.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(13.5F, 1.75F, 3.25F, 1.5272F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 27.0F, -5.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 19.0F, 4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, -6.5F));

		PartDefinition leftLeg5 = leftLeg.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(97, 64).addBox(-5.6F, -0.75F, -21.0F, 4.0F, 4.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -6.05F, -4.05F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r55 = leftLeg5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(85, 164).addBox(-2.5F, -3.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 1.45F, 1.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r56 = leftLeg5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(141, 143).addBox(-4.6F, -2.0F, -11.0F, 2.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.25F, -1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r57 = leftLeg5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(43, 161).addBox(-2.5F, -3.5F, -0.1F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 2.05F, -22.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftLeg6 = leftLeg5.addOrReplaceChild("leftLeg6", CubeListBuilder.create().texOffs(178, 83).addBox(0.7F, 0.4051F, -4.9571F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.7348F, -23.6514F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leftLeg6.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(171, 117).addBox(-2.5F, -2.8721F, 4.242F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 1.4773F, -7.4991F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r59 = leftLeg6.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(23, 131).addBox(-2.5F, -2.6F, -4.5F, 4.0F, 4.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.8F, 2.8236F, -11.8529F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r60 = leftLeg6.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 58).addBox(-0.5F, -0.9155F, -2.7283F, 3.0F, 4.0F, 12.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.2F, 2.8054F, -13.9392F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg7 = leftLeg6.addOrReplaceChild("leftLeg7", CubeListBuilder.create().texOffs(46, 132).addBox(-5.5F, -7.3537F, -6.7561F, 11.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3054F, -16.4392F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r61 = leftLeg7.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(147, 159).addBox(-4.5F, -2.5F, -1.2F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1149F, -1.2669F, 0.829F, 0.0F, 0.0F));

		PartDefinition leftLeg8 = leftLeg7.addOrReplaceChild("leftLeg8", CubeListBuilder.create().texOffs(139, 19).addBox(-5.5F, -2.7F, 2.1F, 11.0F, 4.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, -8.3537F, -8.8561F));

		PartDefinition rightLeg5 = leftLeg.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(94, 89).addBox(1.6F, -0.75F, -21.0F, 4.0F, 4.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-29.5F, -6.05F, -4.05F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r62 = rightLeg5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(163, 71).addBox(-2.5F, -3.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 1.45F, 1.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r63 = rightLeg5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(125, 138).addBox(2.6F, -2.0F, -11.0F, 2.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.25F, -1.0F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r64 = rightLeg5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(84, 44).addBox(-2.5F, -3.5F, -0.1F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 2.05F, -22.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition rightLeg6 = rightLeg5.addOrReplaceChild("rightLeg6", CubeListBuilder.create().texOffs(117, 117).addBox(-3.7F, 0.4051F, -4.9571F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.7348F, -23.6514F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r65 = rightLeg6.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(170, 137).addBox(-1.5F, -2.8721F, 4.242F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 1.4773F, -7.4991F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r66 = rightLeg6.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(126, 64).addBox(-1.5F, -2.6F, -4.5F, 4.0F, 4.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8F, 2.8236F, -11.8529F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r67 = rightLeg6.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(45, 0).addBox(-2.5F, -0.9155F, -2.7283F, 3.0F, 4.0F, 12.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.2F, 2.8054F, -13.9392F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg7 = rightLeg6.addOrReplaceChild("rightLeg7", CubeListBuilder.create().texOffs(84, 19).addBox(-5.5F, -7.3537F, -6.7561F, 11.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3054F, -16.4392F, -0.2194F, 0.0006F, 0.0103F));

		PartDefinition cube_r68 = rightLeg7.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(159, 0).addBox(-3.5F, -2.5F, -1.2F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1149F, -1.2669F, 0.829F, 0.0F, 0.0F));

		PartDefinition rightLeg8 = rightLeg7.addOrReplaceChild("rightLeg8", CubeListBuilder.create().texOffs(138, 122).addBox(-5.5F, -2.7F, 2.1F, 11.0F, 4.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, -8.3537F, -8.8561F));

		PartDefinition tail1 = hip.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.4F, 8.6F, -0.3846F, -0.1541F, -0.0311F));

		PartDefinition cube_r69 = tail1.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(74, 24).addBox(0.0F, 2.3154F, 2.6486F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 86).addBox(0.0F, 0.2154F, -0.3514F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4512F, 28.1035F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r70 = tail1.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(25, 96).addBox(0.0F, -0.0885F, -0.5787F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4664F, 24.2702F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r71 = tail1.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(111, 89).addBox(0.0F, 0.2694F, -0.4534F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8664F, 20.3702F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r72 = tail1.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(31, 69).addBox(0.0F, -0.2452F, -0.1345F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4664F, 16.2702F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r73 = tail1.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(74, 17).addBox(0.0F, 1.092F, 2.9707F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 79).addBox(0.0F, -0.308F, -0.4293F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2336F, 9.5702F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r74 = tail1.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(82, 84).addBox(0.0F, -0.5F, 2.7F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(121, 41).addBox(0.0F, -2.0F, -0.3F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3599F, 4.877F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r75 = tail1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(42, 46).addBox(-0.5F, 0.1F, -0.8F, 4.0F, 4.0F, 33.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.9897F, 0.0003F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r76 = tail1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(84, 62).addBox(-1.0F, -9.1196F, -0.3458F, 2.0F, 11.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -7.0222F, 29.1283F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail1.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 79).addBox(-1.0F, -9.5867F, -0.0028F, 2.0F, 10.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -6.2222F, 24.7283F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r78 = tail1.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(14, 79).addBox(-1.0F, -9.9109F, -0.3647F, 2.0F, 10.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -5.3222F, 21.0283F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r79 = tail1.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(74, 109).addBox(-1.0F, -10.3212F, -0.1228F, 2.0F, 11.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -4.9222F, 16.7283F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r80 = tail1.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(126, 64).addBox(-1.0F, -10.6308F, 0.2496F, 2.0F, 11.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -3.9222F, 12.5283F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r81 = tail1.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(171, 183).addBox(-1.0F, -11.1508F, -1.2575F, 2.0F, 11.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -3.1222F, 10.2283F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r82 = tail1.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(21, 126).addBox(-1.5F, -10.8749F, -1.4585F, 3.0F, 12.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -3.1222F, 7.3283F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r83 = tail1.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(84, 176).addBox(-1.5F, -11.055F, -0.394F, 3.0F, 12.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.4719F, 3.211F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r84 = tail1.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(95, 176).addBox(-1.5F, -9.4F, -4.2F, 3.0F, 12.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -4.1982F, 3.5657F, 0.1484F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.0897F, 31.7003F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition cube_r85 = tail2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -0.5F, 4.0F, 4.0F, 36.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.0F, -1.4349F, 0.1421F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r86 = tail2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(135, 0).addBox(-1.0F, -9.1485F, 9.6739F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(187, 27).addBox(-1.0F, -7.6485F, 4.6739F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(187, 17).addBox(-1.0F, -6.2485F, -0.3261F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2964F, 20.6705F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r87 = tail2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(152, 187).addBox(-1.0F, -6.6095F, -0.4269F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8964F, 15.3705F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r88 = tail2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(185, 99).addBox(-0.01F, -0.3F, -2.9F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0719F, 15.0197F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r89 = tail2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(73, 0).addBox(0.0F, -3.1F, -1.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8623F, 15.1787F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r90 = tail2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(94, 84).addBox(0.0F, -1.9602F, 0.0004F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2377F, 34.0787F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r91 = tail2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(36, 186).addBox(-0.01F, -0.3F, -2.9F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3281F, 35.4197F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r92 = tail2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(57, 186).addBox(-0.01F, -0.3F, -2.9F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3719F, 30.1197F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r93 = tail2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(97, 39).addBox(0.0F, -1.9602F, 0.0004F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4623F, 28.7787F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(187, 184).addBox(-0.01F, -0.5F, -2.9F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1719F, 24.7197F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(117, 117).addBox(0.0F, -1.9602F, 0.0004F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2623F, 23.3787F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r96 = tail2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(121, 47).addBox(0.0F, -1.9602F, -0.1996F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5623F, 18.4787F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r97 = tail2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(41, 188).addBox(-0.01F, -0.2F, -2.9F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4719F, 19.8197F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r98 = tail2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(82, 99).addBox(0.0F, -2.3F, -1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4623F, 10.4787F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(44, 84).addBox(-0.01F, -0.3F, -1.9F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6719F, 10.3197F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r100 = tail2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(91, 109).addBox(0.0F, -2.3F, -1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8623F, 6.2787F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r101 = tail2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(91, 0).addBox(-0.01F, -0.3F, -1.9F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0719F, 6.1197F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r102 = tail2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(84, 132).addBox(-1.0F, -8.907F, 3.6175F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(119, 184).addBox(-1.0F, -7.907F, -0.5825F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.1964F, 6.2705F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r103 = tail2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(126, 184).addBox(-1.0F, -8.8997F, -0.2442F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3368F, 1.8042F, -0.288F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.6349F, 35.3421F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition cube_r104 = tail3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(45, 0).addBox(-0.5F, 0.0F, 0.1F, 3.0F, 3.0F, 32.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.501F, 0.0489F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r105 = tail3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(144, 94).addBox(-1.0F, -18.5485F, 42.0739F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 162).addBox(-1.0F, -17.2485F, 37.3739F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(13, 162).addBox(-1.0F, -16.0485F, 33.0739F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(167, 83).addBox(-1.0F, -15.0485F, 29.0739F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(104, 89).addBox(-1.0F, -13.8485F, 24.0739F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 112).addBox(-1.0F, -12.4485F, 19.0739F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(122, 22).addBox(-1.0F, -11.1485F, 14.4739F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6376F, -14.4226F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r106 = tail3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(24, 151).addBox(-0.005F, -0.1676F, -2.0211F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 0.1779F, 27.9927F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r107 = tail3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(48, 84).addBox(0.005F, -0.8291F, -0.5514F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 0.1779F, 27.9927F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r108 = tail3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(92, 151).addBox(-0.005F, -0.1676F, -2.0211F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 0.7779F, 22.9927F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r109 = tail3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(91, 0).addBox(0.005F, -0.8291F, -0.5514F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 0.7779F, 22.9927F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r110 = tail3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(107, 154).addBox(-0.005F, -0.1676F, -2.0211F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 1.3779F, 18.3927F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r111 = tail3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(95, 0).addBox(0.005F, -0.8291F, -0.5514F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 1.3779F, 18.3927F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r112 = tail3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(156, 32).addBox(-0.005F, -0.1722F, -1.6429F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 1.9095F, 13.4156F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r113 = tail3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(76, 99).addBox(0.005F, -0.8287F, -0.1736F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 1.9095F, 13.4156F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r114 = tail3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(184, 76).addBox(-0.005F, -0.1722F, -1.6429F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 2.3095F, 8.9156F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r115 = tail3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(64, 0).addBox(0.005F, -1.4287F, -0.1736F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 2.3095F, 8.9156F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r116 = tail3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(72, 56).addBox(0.005F, -1.6287F, -0.3736F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 2.5095F, 3.9156F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r117 = tail3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(141, 141).addBox(-0.005F, 0.1278F, -2.3429F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 2.5095F, 3.9156F, 0.0611F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.201F, 32.2489F, 0.0876F, 0.0869F, 0.0076F));

		PartDefinition cube_r118 = tail4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(0, 41).addBox(0.0F, -0.2F, 0.0F, 2.0F, 2.0F, 35.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.6105F, -0.169F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r119 = tail4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, -26.8485F, 75.0739F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(18, 41).addBox(-0.5F, -25.8485F, 71.0739F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(29, 41).addBox(-0.5F, -24.4485F, 66.3739F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(40, 41).addBox(-0.5F, -23.3485F, 62.0739F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(45, 17).addBox(-0.5F, -21.9485F, 57.0739F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(91, 112).addBox(-0.5F, -21.0485F, 52.0739F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(166, 120).addBox(-0.5F, -19.8485F, 47.0739F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.1281F, -46.6405F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r120 = tail4.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(125, 44).addBox(-0.005F, -0.1676F, -2.0211F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(11, 136).addBox(-0.005F, -0.0676F, 13.1789F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(7, 41).addBox(-0.005F, -0.1676F, 8.1789F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(67, 57).addBox(-0.005F, -0.1676F, 3.1789F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 0.7684F, 16.2748F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r121 = tail4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(32, 57).addBox(0.005F, -0.8291F, -0.5514F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 1.0684F, 10.5748F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r122 = tail4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(138, 44).addBox(-0.005F, -0.1676F, -2.0211F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 1.0684F, 10.5748F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r123 = tail4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(126, 138).addBox(-0.005F, -0.1676F, -2.0211F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 1.3684F, 5.7748F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r124 = tail4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(67, 57).addBox(0.005F, -0.8291F, -0.5514F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 1.3684F, 5.7748F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r125 = tail4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(44, 84).addBox(0.005F, -0.8291F, -0.5514F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 1.6684F, 1.0748F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r126 = tail4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(3, 151).addBox(-0.005F, -0.1676F, -2.0211F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 1.6684F, 1.0748F, 0.0611F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(115, 117).addBox(-1.0F, -0.8333F, -0.1819F, 2.0F, 2.0F, 18.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -1.2105F, 34.331F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r127 = tail5.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 58).addBox(0.0F, -1.4F, 4.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(6, 58).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8883F, 11.213F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r128 = tail5.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(19, 58).addBox(-0.5F, -28.5485F, 83.0739F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(29, 58).addBox(-0.5F, -27.8485F, 79.0739F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.5052F, -81.1535F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r129 = tail5.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(7, 41).addBox(0.0F, -1.1F, 16.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 41).addBox(0.0F, -0.8F, 12.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 123).addBox(0.0F, -0.5F, 7.3F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(134, 99).addBox(0.0F, -0.5F, 3.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(135, 73).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 1.2067F, 0.9192F, -0.0262F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1667F, 17.8181F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r130 = tail6.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(0, 126).addBox(0.5F, 0.0F, 0.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.001F, -0.0436F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r131 = tail6.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(47, 41).addBox(0.0F, -2.5F, 20.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(51, 0).addBox(0.0F, -2.2F, 17.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(52, 17).addBox(0.0F, -2.0F, 14.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(40, 57).addBox(0.0F, -1.9F, 11.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(47, 57).addBox(0.0F, -1.7F, 8.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.056F, -6.6487F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(118, 45).addBox(-0.5F, -0.5005F, -0.9171F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.001F, 15.9564F, 0.0438F, 0.0872F, 0.0038F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -0.0005F, 16.0829F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r132 = tail8.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 18).addBox(0.5F, -0.1F, 0.1F, 1.0F, 1.0F, 16.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4F, -0.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.35F, 16.0F, -0.044F, 0.1308F, -0.0057F));

		PartDefinition cube_r133 = tail9.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 41).addBox(0.0F, 0.0F, 0.1F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5072F, -0.1598F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(157, 141).addBox(-0.5F, -0.5307F, -0.2064F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2928F, 14.9402F, -0.1752F, 0.0859F, -0.0152F));

		PartDefinition cube_r134 = tail10.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(181, 144).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5307F, 9.7936F, -0.2094F, 0.0F, 0.0F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(74, 109).addBox(-0.5F, -0.4377F, -0.3625F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.2693F, 15.7936F, -0.4835F, 0.116F, -0.0607F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create().texOffs(84, 62).addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 14.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0623F, 13.6375F, -0.3193F, 0.2909F, -0.0945F));

		PartDefinition body = hip.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, -17.0F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 112).addBox(-10.0F, -3.9F, -8.9F, 20.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 28.1F, -10.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(84, 0).addBox(-9.0F, -4.0F, 0.1F, 18.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 28.2F, -10.1F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(26, 166).mirror().addBox(-5.3307F, 0.0283F, -1.1163F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0284F, -0.5954F, -0.8281F, -0.1201F, -0.067F, -0.5485F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(174, 36).mirror().addBox(-12.9157F, -1.9719F, -1.1932F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0284F, -0.5954F, -0.8281F, -0.0886F, -0.0911F, -0.9417F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(40, 73).mirror().addBox(-14.9114F, -0.0585F, -1.6107F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.1284F, 8.8046F, -1.4281F, -0.0311F, -0.1232F, -1.4675F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(139, 29).mirror().addBox(-24.8602F, -4.625F, -1.147F, 16.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.8284F, -1.5954F, -4.3281F, -0.0102F, -0.0828F, -1.4689F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(174, 110).mirror().addBox(-9.8393F, 1.7245F, -1.147F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.8284F, -1.5954F, -4.3281F, -0.0585F, -0.0595F, -0.8131F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(180, 0).mirror().addBox(-1.0745F, 2.2676F, -1.1337F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.8284F, -1.5954F, -4.3281F, -0.0802F, -0.0492F, -0.4199F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(60, 41).mirror().addBox(-25.8602F, -4.625F, -1.147F, 17.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.8284F, -2.0954F, -8.3281F, -0.0057F, -0.0394F, -1.4692F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(182, 39).mirror().addBox(-1.0745F, 2.2676F, -1.1337F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.8284F, -2.0954F, -8.3281F, -0.0403F, -0.0314F, -0.4216F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(176, 44).mirror().addBox(-9.8393F, 1.7245F, -1.147F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.8284F, -2.0954F, -8.3281F, -0.0285F, -0.0277F, -0.8144F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(177, 159).mirror().addBox(-9.8393F, 1.7245F, -1.147F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.8284F, -2.8954F, -12.3281F, 0.0074F, 0.0103F, -0.8147F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(138, 55).mirror().addBox(-25.8602F, -4.625F, -1.147F, 17.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.8284F, -2.8954F, -12.3281F, -0.0004F, 0.0127F, -1.4693F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(182, 53).mirror().addBox(-1.0745F, 2.2676F, -1.1337F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.8284F, -2.8954F, -12.3281F, 0.0075F, -0.01F, -0.4225F));

		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(40, 73).addBox(-0.0886F, -0.0585F, -1.6107F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.1284F, 8.8046F, -1.4281F, -0.0311F, 0.1232F, 1.4675F));

		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(174, 36).addBox(4.9157F, -1.9719F, -1.1932F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0284F, -0.5954F, -0.8281F, -0.0886F, 0.0911F, 0.9417F));

		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(26, 166).addBox(-0.6693F, 0.0283F, -1.1163F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0284F, -0.5954F, -0.8281F, -0.1201F, 0.067F, 0.5485F));

		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(139, 29).addBox(8.8602F, -4.625F, -1.147F, 16.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8284F, -1.5954F, -4.3281F, -0.0102F, 0.0828F, 1.4689F));

		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(174, 110).addBox(1.8393F, 1.7245F, -1.147F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8284F, -1.5954F, -4.3281F, -0.0585F, 0.0595F, 0.8131F));

		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(180, 0).addBox(-4.9255F, 2.2676F, -1.1337F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8284F, -1.5954F, -4.3281F, -0.0802F, 0.0492F, 0.4199F));

		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(60, 41).addBox(8.8602F, -4.625F, -1.147F, 17.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8284F, -2.0954F, -8.3281F, -0.0057F, 0.0394F, 1.4692F));

		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(176, 44).addBox(1.8393F, 1.7245F, -1.147F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8284F, -2.0954F, -8.3281F, -0.0285F, 0.0277F, 0.8144F));

		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(182, 39).addBox(-4.9255F, 2.2676F, -1.1337F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8284F, -2.0954F, -8.3281F, -0.0403F, 0.0314F, 0.4216F));

		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(138, 55).addBox(8.8602F, -4.625F, -1.147F, 17.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8284F, -2.8954F, -12.3281F, -0.0004F, -0.0127F, 1.4693F));

		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(177, 159).addBox(1.8393F, 1.7245F, -1.147F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8284F, -2.8954F, -12.3281F, 0.0074F, -0.0103F, 0.8147F));

		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(182, 53).addBox(-4.9255F, 2.2676F, -1.1337F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8284F, -2.8954F, -12.3281F, 0.0075F, 0.01F, 0.4225F));

		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(0.0489F, -1.9795F, -0.3451F, 0.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6695F, -2.2974F, -8.6302F, 1.4741F, -0.0175F, -0.1037F));

		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(0, 145).mirror().addBox(0.3099F, -2.3083F, -0.1743F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.888F, -2.6354F, -12.9284F, 1.5182F, -0.0219F, -0.1296F));

		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 79).addBox(-0.0489F, -1.9795F, -0.3451F, 0.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6695F, -2.2974F, -8.6302F, 1.4741F, 0.0175F, 0.1037F));

		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 145).addBox(-0.3099F, -2.3083F, -0.1743F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.888F, -2.6354F, -12.9284F, 1.5182F, 0.0219F, 0.1296F));

		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(62, 173).addBox(-1.5F, -12.8521F, -1.4045F, 3.0F, 14.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.7285F, -1.0936F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(123, 89).addBox(-1.5F, -12.5399F, -0.5687F, 3.0F, 13.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.3285F, -5.9936F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(65, 148).addBox(-2.0F, -1.0146F, 11.0856F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(149, 12).addBox(-2.0F, -1.0146F, 15.0856F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(47, 109).addBox(-1.0F, -0.0146F, 0.0856F, 4.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.4F, -17.9F, -0.096F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offset(-0.5F, -2.2F, -17.35F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(112, 19).mirror().addBox(-1.0745F, 2.2676F, -1.1337F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.3284F, -1.1954F, 0.4219F, 0.0632F, 0.0151F, -0.4224F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(138, 132).mirror().addBox(-24.8602F, -4.625F, -1.147F, 16.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.3284F, -1.1954F, 0.4219F, 0.0058F, 0.0735F, -1.469F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(125, 41).mirror().addBox(-9.8393F, 1.7245F, -1.147F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.3284F, -1.1954F, 0.4219F, 0.0494F, 0.0548F, -0.8134F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(141, 138).mirror().addBox(-23.5948F, 1.3968F, -1.6124F, 14.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.9F, -1.4807F, -4.1505F, 0.0366F, 0.1387F, -1.423F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(139, 32).mirror().addBox(-7.8573F, 5.6735F, -1.6124F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.9F, -1.4807F, -4.1505F, 0.0967F, 0.1061F, -0.9405F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(138, 58).mirror().addBox(2.2593F, 5.1313F, -1.6417F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.9F, -1.4807F, -4.1505F, 0.1264F, 0.0447F, -0.5514F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(37, 104).mirror().addBox(-22.8842F, -6.6833F, -0.6319F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.9807F, -12.4505F, -0.0024F, 0.3168F, -1.4962F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(39, 150).mirror().addBox(-13.3696F, -2.8177F, -0.6319F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.9807F, -12.4505F, 0.096F, 0.3024F, -1.1757F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(107, 151).mirror().addBox(-6.0535F, -0.6589F, -0.5397F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.9807F, -12.4505F, 0.2018F, 0.2262F, -0.7763F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(138, 132).addBox(8.8602F, -4.625F, -1.147F, 16.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.3284F, -1.1954F, 0.4219F, 0.0058F, -0.0735F, 1.469F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(125, 41).addBox(1.8393F, 1.7245F, -1.147F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.3284F, -1.1954F, 0.4219F, 0.0494F, -0.0548F, 0.8134F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(112, 19).addBox(-4.9255F, 2.2676F, -1.1337F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.3284F, -1.1954F, 0.4219F, 0.0632F, -0.0151F, 0.4224F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(114, 41).mirror().addBox(7.9126F, -3.6925F, 4.2204F, 0.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.1284F, 4.6046F, 0.4219F, 1.5192F, -0.0242F, -0.1732F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(94, 89).mirror().addBox(-0.4F, -4.3F, -2.4F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0872F, -3.7571F, -3.5752F, 1.5622F, -0.0167F, -0.1741F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(46, 132).mirror().addBox(-0.1553F, -2.2775F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3878F, -2.7157F, -6.6974F, 1.3206F, 0.5323F, 0.7185F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.3296F, -0.6878F, -1.25F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3878F, -2.7157F, -6.6974F, 1.3533F, 0.15F, 0.8145F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(74, 132).mirror().addBox(-0.1553F, -2.2775F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3878F, -2.7157F, -13.6974F, 1.3206F, 0.5323F, 0.7185F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(8, 0).mirror().addBox(-0.3296F, -0.6878F, -1.25F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3878F, -2.7157F, -13.6974F, 1.3533F, 0.15F, 0.8145F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(107, 154).mirror().addBox(-0.4F, -4.3F, -3.4F, 0.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0872F, -3.7571F, -9.5752F, 1.5622F, -0.0167F, -0.1741F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(114, 41).addBox(-7.9126F, -3.6925F, 4.2204F, 0.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.1284F, 4.6046F, 0.4219F, 1.5192F, 0.0242F, 0.1732F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(141, 138).addBox(9.5948F, 1.3968F, -1.6124F, 14.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.9F, -1.4807F, -4.1505F, 0.0366F, -0.1387F, 1.423F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(139, 32).addBox(-0.1427F, 5.6735F, -1.6124F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.9F, -1.4807F, -4.1505F, 0.0967F, -0.1061F, 0.9405F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(138, 58).addBox(-8.2593F, 5.1313F, -1.6417F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.9F, -1.4807F, -4.1505F, 0.1264F, -0.0447F, 0.5514F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6704F, -0.6878F, -1.25F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3878F, -2.7157F, -6.6974F, 1.3533F, -0.15F, -0.8145F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(46, 132).addBox(-0.8447F, -2.2775F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3878F, -2.7157F, -6.6974F, 1.3206F, -0.5323F, -0.7185F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(94, 89).addBox(0.4F, -4.3F, -2.4F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0872F, -3.7571F, -3.5752F, 1.5622F, 0.0167F, 0.1741F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(74, 132).addBox(-0.8447F, -2.2775F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3878F, -2.7157F, -13.6974F, 1.3206F, -0.5323F, -0.7185F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(107, 151).addBox(0.0535F, -0.6589F, -0.5397F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -0.9807F, -12.4505F, 0.2018F, -0.2262F, 0.7763F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(39, 150).addBox(5.3696F, -2.8177F, -0.6319F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -0.9807F, -12.4505F, 0.096F, -0.3024F, 1.1757F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(37, 104).addBox(11.8842F, -6.6833F, -0.6319F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -0.9807F, -12.4505F, -0.0024F, -0.3168F, 1.4962F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(8, 0).addBox(-0.6704F, -0.6878F, -1.25F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3878F, -2.7157F, -13.6974F, 1.3533F, -0.15F, -0.8145F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(133, 170).mirror().addBox(1.4324F, 2.4411F, 3.2131F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.0048F, 25.4487F, -4.656F, 0.4353F, -0.8155F, 0.6318F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(169, 130).mirror().addBox(0.3504F, 1.7783F, 3.332F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.0048F, 26.7487F, -3.556F, 0.3341F, -0.4906F, 0.3718F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(181, 93).mirror().addBox(-0.6883F, 0.1361F, -0.4624F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.6048F, 26.6487F, 3.744F, -0.0097F, -0.3958F, 0.9637F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(183, 178).mirror().addBox(-0.3081F, -0.3343F, 0.1353F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-14.6048F, 27.1487F, 7.444F, 0.5865F, -0.4281F, 0.8426F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(45, 17).mirror().addBox(0.9595F, -0.6289F, -2.9734F, 2.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.0048F, 25.9487F, -1.856F, -0.3593F, -0.301F, 0.9067F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(109, 23).mirror().addBox(-0.3509F, -0.6231F, -3.4513F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.0048F, 26.7487F, -3.556F, -0.3542F, -0.25F, 0.5676F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(159, 9).mirror().addBox(0.0731F, -0.418F, -1.5824F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.0048F, 26.6487F, -3.256F, -0.3774F, -0.3046F, 0.9999F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(113, 138).mirror().addBox(0.7835F, -0.2915F, -2.9746F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.0048F, 25.4487F, -4.656F, -0.3476F, -0.5844F, 0.8871F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(84, 135).mirror().addBox(-0.4914F, -0.1568F, -2.1888F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.8048F, 24.9487F, -4.856F, 0.2111F, -0.9775F, 0.4573F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(-0.7141F, 1.4865F, -7.8819F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 161).mirror().addBox(2.2859F, 1.4865F, -10.8819F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.0048F, 24.9487F, -1.856F, -0.3124F, -0.2079F, 0.0666F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(57, 174).mirror().addBox(6.9304F, 2.871F, -11.8792F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.1158F, 16.8659F, -3.6792F, -0.079F, 0.1911F, -1.304F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-10.2531F, -1.8538F, -6.3471F, 2.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1158F, 16.8659F, -3.6792F, 0.7205F, -1.3159F, -0.8844F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(122, 170).mirror().addBox(-8.133F, -1.1203F, -6.5F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1158F, 16.8659F, -3.6792F, 0.1204F, -0.838F, -0.3687F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(128, 154).mirror().addBox(-8.0548F, -8.2036F, -0.8765F, 2.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1158F, 16.8659F, -3.6792F, 1.4645F, -0.771F, 0.0176F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(50, 144).mirror().addBox(-7.8288F, -4.1656F, -5.1669F, 2.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1158F, 16.8659F, -3.6792F, 1.3757F, -0.4422F, -0.0252F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(171, 171).mirror().addBox(-8.048F, -5.4449F, 4.8795F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1158F, 19.8659F, -8.3792F, 0.9601F, 0.0057F, 0.0433F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(25, 150).mirror().addBox(-11.2414F, -4.5015F, 7.8237F, 2.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1158F, 19.8659F, -8.3792F, 1.1651F, 0.2029F, 0.3334F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(25, 150).addBox(9.2414F, -4.5015F, 7.8237F, 2.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.1158F, 19.8659F, -8.3792F, 1.1651F, -0.2029F, -0.3334F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(171, 171).addBox(6.048F, -5.4449F, 4.8795F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.1158F, 19.8659F, -8.3792F, 0.9601F, -0.0057F, -0.0433F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(50, 144).addBox(5.8288F, -4.1656F, -5.1669F, 2.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.1158F, 16.8659F, -3.6792F, 1.3757F, 0.4422F, 0.0252F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(128, 154).addBox(6.0548F, -8.2036F, -0.8765F, 2.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.1158F, 16.8659F, -3.6792F, 1.4645F, 0.771F, -0.0176F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(122, 170).addBox(6.133F, -1.1203F, -6.5F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.1158F, 16.8659F, -3.6792F, 0.1204F, 0.838F, 0.3687F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(0, 18).addBox(8.2531F, -1.8538F, -6.3471F, 2.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.1158F, 16.8659F, -3.6792F, 0.7205F, 1.3159F, 0.8844F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(57, 174).addBox(-7.9304F, 2.871F, -11.8792F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1158F, 16.8659F, -3.6792F, -0.079F, -0.1911F, 1.304F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(134, 89).addBox(-9.1158F, -5.1696F, -12.9008F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1158F, 16.8659F, -3.6792F, 0.1979F, 0.0F, 0.0F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(77, 161).addBox(-5.2859F, 1.4865F, -10.8819F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 96).addBox(-5.2859F, 1.4865F, -7.8819F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0048F, 24.9487F, -1.856F, -0.3124F, 0.2079F, -0.0666F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(45, 17).addBox(-2.9595F, -0.6289F, -2.9734F, 2.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0048F, 25.9487F, -1.856F, -0.3593F, 0.301F, -0.9067F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(109, 23).addBox(-1.6491F, -0.6231F, -3.4513F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0048F, 26.7487F, -3.556F, -0.3542F, 0.25F, -0.5676F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(84, 135).addBox(-1.5086F, -0.1568F, -2.1888F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.8048F, 24.9487F, -4.856F, 0.2111F, 0.9775F, -0.4573F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(133, 170).addBox(-3.4324F, 2.4411F, 3.2131F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0048F, 25.4487F, -4.656F, 0.4353F, 0.8155F, -0.6318F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(169, 130).addBox(-2.3504F, 1.7783F, 3.332F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0048F, 26.7487F, -3.556F, 0.3341F, 0.4906F, -0.3718F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(181, 93).addBox(-1.3117F, 0.1361F, -0.4624F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.6048F, 26.6487F, 3.744F, -0.0097F, 0.3958F, -0.9637F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(183, 178).addBox(-1.6919F, -0.3343F, 0.1353F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.6048F, 27.1487F, 7.444F, 0.5865F, 0.4281F, -0.8426F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(159, 9).addBox(-2.0731F, -0.418F, -1.5824F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0048F, 26.6487F, -3.256F, -0.3774F, 0.3046F, -0.9999F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(113, 138).addBox(-2.7835F, -0.2915F, -2.9746F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0048F, 25.4487F, -4.656F, -0.3476F, 0.5844F, -0.8871F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(107, 154).addBox(0.4F, -4.3F, -3.4F, 0.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0872F, -3.7571F, -9.5752F, 1.5622F, 0.0167F, 0.1741F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(37, 84).addBox(-1.5F, 0.1953F, -0.1678F, 4.0F, 4.0F, 15.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -1.6F, -15.25F, -0.0087F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(12.0F, 24.25F, -9.75F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3412F, -3.5576F, 0.5371F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r236 = leftArm4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(11, 177).addBox(-27.195F, 11.7509F, -40.4597F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.9371F, -45.3693F, 13.3043F, 1.1177F, -0.272F, -0.5042F));

		PartDefinition cube_r237 = leftArm4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(138, 108).addBox(-1.4041F, 10.7509F, -52.7216F, 4.0F, 3.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.9371F, -45.3693F, 13.3043F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r238 = leftArm4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(139, 168).addBox(9.4083F, 25.2995F, -42.6065F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9371F, -45.3693F, 13.3043F, 0.611F, -0.2085F, 0.2274F));

		PartDefinition cube_r239 = leftArm4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(101, 62).addBox(9.4083F, -30.494F, -45.3359F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.9371F, -45.3693F, 13.3043F, 1.8065F, -0.2085F, 0.2274F));

		PartDefinition cube_r240 = leftArm4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(25, 182).addBox(-1.4041F, -17.5127F, -61.4366F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(157, 105).addBox(-1.4041F, -16.5127F, -58.4366F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9371F, -45.3693F, 13.3043F, 1.5708F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4079F, 16.3588F, -1.2446F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r241 = leftArm5.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(59, 161).addBox(-1.6041F, 0.258F, -65.5893F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F))
				.texOffs(40, 57).addBox(-0.9041F, 0.258F, -78.2893F, 3.0F, 2.0F, 13.0F, new CubeDeformation(-0.12F))
				.texOffs(92, 114).addBox(-1.4041F, 3.558F, -79.2893F, 4.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5292F, -63.2461F, -4.6865F, 1.5708F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftArm5.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1063F, 15.6475F, -3.1181F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r242 = leftArm6.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(150, 168).addBox(24.5102F, -3.7631F, -82.6906F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5771F, -78.7301F, 5.3136F, 1.5708F, 0.0F, 0.3491F));

		PartDefinition cube_r243 = leftArm6.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 162).addBox(3.0959F, -3.7741F, -86.4393F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(144, 94).addBox(-2.9041F, -5.7741F, -86.4393F, 7.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(13, 166).addBox(-3.9041F, -3.7741F, -86.4393F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5771F, -78.7301F, 5.3136F, 1.5708F, 0.0F, 0.0F));

		PartDefinition rightArm4 = leftArm.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-25.3412F, -3.5576F, 0.5371F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r244 = rightArm4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(176, 63).addBox(24.195F, 11.7509F, -40.4597F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9371F, -45.3693F, 13.3043F, 1.1177F, 0.272F, 0.5042F));

		PartDefinition cube_r245 = rightArm4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(138, 41).addBox(-2.5959F, 10.7509F, -52.7216F, 4.0F, 3.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9371F, -45.3693F, 13.3043F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r246 = rightArm4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(167, 86).addBox(-10.4083F, 25.2995F, -42.6065F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9371F, -45.3693F, 13.3043F, 0.611F, 0.2085F, -0.2274F));

		PartDefinition cube_r247 = rightArm4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(60, 44).addBox(-10.4083F, -30.494F, -45.3359F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.9371F, -45.3693F, 13.3043F, 1.8065F, 0.2085F, -0.2274F));

		PartDefinition cube_r248 = rightArm4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(139, 180).addBox(-2.5959F, -17.5127F, -61.4366F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(157, 32).addBox(-2.5959F, -16.5127F, -58.4366F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9371F, -45.3693F, 13.3043F, 1.5708F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4079F, 16.3588F, -1.2446F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r249 = rightArm5.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(32, 126).addBox(-2.3959F, 0.258F, -65.5893F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F))
				.texOffs(40, 41).addBox(-2.0959F, 0.258F, -78.2893F, 3.0F, 2.0F, 13.0F, new CubeDeformation(-0.12F))
				.texOffs(114, 20).addBox(-2.5959F, 3.558F, -79.2893F, 4.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5292F, -63.2461F, -4.6865F, 1.5708F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightArm5.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1063F, 15.6475F, -3.1181F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r250 = rightArm6.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(39, 153).addBox(-25.5102F, -3.7631F, -82.6906F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5771F, -78.7301F, 5.3136F, 1.5708F, 0.0F, -0.3491F));

		PartDefinition cube_r251 = rightArm6.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(64, 161).addBox(-5.0959F, -3.7741F, -86.4393F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(144, 83).addBox(-4.0959F, -5.7741F, -86.4393F, 7.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(164, 160).addBox(1.9041F, -3.7741F, -86.4393F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5771F, -78.7301F, 5.3136F, 1.5708F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.0F, -1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 17.0F, 1.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -15.0F, -0.2214F, 0.1704F, -0.0381F));

		PartDefinition cube_r252 = neck1.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(84, 36).addBox(-1.5F, 0.0F, 0.0F, 4.0F, 4.0F, 21.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.4123F, -20.2355F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r253 = neck1.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(167, 98).mirror().addBox(-0.5112F, -0.5F, -0.6828F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.6074F, 3.2872F, -5.2146F, 1.5231F, -0.0217F, -0.4271F));

		PartDefinition cube_r254 = neck1.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(128, 117).mirror().addBox(-0.0669F, -1.5431F, 0.5175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1594F, -2.7996F, -8.9321F, 1.4971F, 0.382F, 0.7968F));

		PartDefinition cube_r255 = neck1.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, -4.3F, -3.4F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0872F, -3.9694F, -4.1107F, 1.5652F, -0.0179F, -0.3486F));

		PartDefinition cube_r256 = neck1.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(18, 185).mirror().addBox(-2.2289F, -3.867F, 1.4382F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2483F, 0.3129F, -5.2264F, 1.5024F, -0.0098F, 0.825F));

		PartDefinition cube_r257 = neck1.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(188, 152).mirror().addBox(-2.0179F, -0.9401F, -0.3732F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2483F, -1.8871F, -4.5264F, 1.5633F, -0.0044F, -0.5323F));

		PartDefinition cube_r258 = neck1.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(66, 190).mirror().addBox(-0.1441F, -0.7781F, -0.4925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5633F, 0.39F, -4.103F, 1.5711F, 0.1957F, -1.5728F));

		PartDefinition cube_r259 = neck1.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(188, 125).mirror().addBox(-4.7724F, -0.3327F, 0.6083F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4483F, -1.2871F, -4.0264F, 1.568F, -0.3141F, -1.5616F));

		PartDefinition cube_r260 = neck1.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(11, 126).mirror().addBox(-1.9521F, -3.2976F, -5.2621F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4483F, -1.2871F, -4.0264F, 1.5767F, -0.058F, -0.0169F));

		PartDefinition cube_r261 = neck1.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(184, 116).mirror().addBox(-0.586F, -0.5F, -1.0007F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3719F, 1.415F, -16.3577F, 1.2588F, -0.0377F, -0.1162F));

		PartDefinition cube_r262 = neck1.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(32, 131).mirror().addBox(-0.5F, -2.5F, 0.8F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.6019F, 3.6014F, -15.6745F, 1.3145F, -0.0604F, -0.0013F));

		PartDefinition cube_r263 = neck1.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(185, 9).mirror().addBox(-3.9424F, -0.1563F, 0.6155F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2483F, -1.7871F, -14.7264F, 1.5651F, -0.5759F, -1.5604F));

		PartDefinition cube_r264 = neck1.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(189, 56).mirror().addBox(-0.7163F, -2.1702F, 1.8365F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2483F, 0.4129F, -13.6264F, 1.3362F, -0.1361F, -0.5163F));

		PartDefinition cube_r265 = neck1.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(130, 44).mirror().addBox(-0.0669F, -1.5431F, 0.5175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1594F, -3.2996F, -17.7321F, 1.4971F, 0.382F, 0.7968F));

		PartDefinition cube_r266 = neck1.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(37, 84).mirror().addBox(0.0F, -3.0F, -3.0F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0872F, -4.4694F, -12.9107F, 1.5652F, -0.0179F, -0.3486F));

		PartDefinition cube_r267 = neck1.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(133, 186).mirror().addBox(-2.2289F, -3.867F, 1.4382F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2483F, -0.1871F, -14.0264F, 1.5024F, -0.0098F, 0.825F));

		PartDefinition cube_r268 = neck1.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(11, 126).addBox(0.9521F, -3.2976F, -5.2621F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.4483F, -1.2871F, -4.0264F, 1.5767F, 0.058F, 0.0169F));

		PartDefinition cube_r269 = neck1.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(167, 98).addBox(-3.4888F, -0.5F, -0.6828F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.6074F, 3.2872F, -5.2146F, 1.5231F, 0.0217F, 0.4271F));

		PartDefinition cube_r270 = neck1.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(128, 117).addBox(-0.9331F, -1.5431F, 0.5175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1594F, -2.7996F, -8.9321F, 1.4971F, -0.382F, -0.7968F));

		PartDefinition cube_r271 = neck1.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(66, 190).addBox(-1.8559F, -0.7781F, -0.4925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5633F, 0.39F, -4.103F, 1.5711F, -0.1957F, 1.5728F));

		PartDefinition cube_r272 = neck1.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(188, 125).addBox(1.7724F, -0.3327F, 0.6083F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4483F, -1.2871F, -4.0264F, 1.568F, 0.3141F, 1.5616F));

		PartDefinition cube_r273 = neck1.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(188, 152).addBox(0.0179F, -0.9401F, -0.3732F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2483F, -1.8871F, -4.5264F, 1.5633F, 0.0044F, 0.5323F));

		PartDefinition cube_r274 = neck1.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(18, 185).addBox(1.2289F, -3.867F, 1.4382F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2483F, 0.3129F, -5.2264F, 1.5024F, 0.0098F, -0.825F));

		PartDefinition cube_r275 = neck1.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -4.3F, -3.4F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0872F, -3.9694F, -4.1107F, 1.5652F, 0.0179F, 0.3486F));

		PartDefinition cube_r276 = neck1.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(184, 116).addBox(-3.414F, -0.5F, -1.0007F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.3719F, 1.415F, -16.3577F, 1.2588F, 0.0377F, 0.1162F));

		PartDefinition cube_r277 = neck1.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(32, 131).addBox(-0.5F, -2.5F, 0.8F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.6019F, 3.6014F, -15.6745F, 1.3145F, 0.0604F, 0.0013F));

		PartDefinition cube_r278 = neck1.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(185, 9).addBox(-0.0576F, -0.1563F, 0.6155F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2483F, -1.7871F, -14.7264F, 1.5651F, 0.5759F, 1.5604F));

		PartDefinition cube_r279 = neck1.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(189, 56).addBox(-1.2837F, -2.1702F, 1.8365F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2483F, 0.4129F, -13.6264F, 1.3362F, 0.1361F, 0.5163F));

		PartDefinition cube_r280 = neck1.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(37, 84).addBox(0.0F, -3.0F, -3.0F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0872F, -4.4694F, -12.9107F, 1.5652F, 0.0179F, 0.3486F));

		PartDefinition cube_r281 = neck1.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(130, 44).addBox(-0.9331F, -1.5431F, 0.5175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.1594F, -3.2996F, -17.7321F, 1.4971F, -0.382F, -0.7968F));

		PartDefinition cube_r282 = neck1.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(133, 186).addBox(1.2289F, -3.867F, 1.4382F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2483F, -0.1871F, -14.0264F, 1.5024F, 0.0098F, -0.825F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5123F, -19.3355F, -0.3695F, 0.3272F, -0.1238F));

		PartDefinition cube_r283 = neck2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(65, 84).addBox(-1.5F, 0.1F, -0.3F, 4.0F, 4.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6459F, -18.8767F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r284 = neck2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(45, 17).mirror().addBox(1.8941F, -0.0739F, -2.2865F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3442F, -1.4892F, -6.0033F, 1.6171F, -0.0149F, -0.3488F));

		PartDefinition cube_r285 = neck2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(60, 112).mirror().addBox(0.4119F, -4.1098F, 0.0995F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3442F, -1.4892F, -6.0033F, 1.3192F, 0.37F, 0.7239F));

		PartDefinition cube_r286 = neck2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(157, 141).mirror().addBox(-0.4414F, -2.3925F, 0.0273F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3442F, -1.4892F, -6.0033F, 1.5083F, -0.0162F, 0.8249F));

		PartDefinition cube_r287 = neck2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(26, 169).mirror().addBox(-1.7561F, -2.0612F, -0.4179F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3442F, -1.3892F, -4.6033F, 1.5332F, -0.0221F, -0.5319F));

		PartDefinition cube_r288 = neck2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(23, 79).mirror().addBox(-0.8F, -4.5F, -0.1F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2901F, 4.5858F, -4.3906F, 1.5858F, -0.0514F, -0.0318F));

		PartDefinition cube_r289 = neck2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(96, 144).mirror().addBox(-2.4064F, -3.0093F, -3.8629F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3442F, -0.2892F, -4.6033F, 1.7768F, 0.0723F, -0.3329F));

		PartDefinition cube_r290 = neck2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(64, 9).mirror().addBox(-4.999F, -0.3801F, -0.9809F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8442F, -0.9892F, -6.1033F, 1.5704F, -0.0436F, -1.5621F));

		PartDefinition cube_r291 = neck2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(188, 119).mirror().addBox(-2.4064F, -2.7093F, -2.8629F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3442F, -0.5892F, -14.8033F, 1.7768F, 0.0723F, -0.3329F));

		PartDefinition cube_r292 = neck2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(156, 135).mirror().addBox(-3.999F, -0.3801F, -0.9809F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8442F, -1.2892F, -16.3033F, 1.5704F, -0.0436F, -1.5621F));

		PartDefinition cube_r293 = neck2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(37, 79).mirror().addBox(-2.6109F, -3.3354F, -3.7466F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3442F, -0.5892F, -14.8033F, 1.3784F, -0.047F, -0.2502F));

		PartDefinition cube_r294 = neck2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(140, 188).mirror().addBox(-1.7561F, -2.0612F, -0.4179F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3442F, -1.6892F, -14.8033F, 1.5332F, -0.0221F, -0.5319F));

		PartDefinition cube_r295 = neck2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(102, 114).mirror().addBox(0.4119F, -4.1098F, 0.0995F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3442F, -1.6892F, -14.8033F, 1.3192F, 0.37F, 0.7239F));

		PartDefinition cube_r296 = neck2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(180, 184).mirror().addBox(-0.4414F, -2.3925F, 0.0273F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3442F, -1.6892F, -14.8033F, 1.5083F, -0.0162F, 0.8249F));

		PartDefinition cube_r297 = neck2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(40, 57).mirror().addBox(1.8941F, -0.0739F, -2.2865F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3442F, -1.6892F, -14.8033F, 1.6171F, -0.0149F, -0.3488F));

		PartDefinition cube_r298 = neck2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(188, 122).mirror().addBox(-0.5097F, -0.5F, -0.3608F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.297F, -0.0975F, -26.1126F, 1.5708F, 0.0F, -0.3403F));

		PartDefinition cube_r299 = neck2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(83, 109).mirror().addBox(-0.8F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2769F, 0.633F, -24.3815F, 1.1661F, -0.0995F, -0.2346F));

		PartDefinition cube_r300 = neck2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(167, 63).mirror().addBox(-3.8419F, -0.5311F, -0.7044F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9315F, -3.4235F, -25.2943F, 1.522F, -0.2573F, -1.3812F));

		PartDefinition cube_r301 = neck2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(83, 119).mirror().addBox(-0.3428F, -0.7087F, -0.2821F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6315F, -3.1235F, -25.2943F, 1.3439F, -0.1317F, -0.5173F));

		PartDefinition cube_r302 = neck2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(60, 57).mirror().addBox(1.4079F, -1.0365F, -1.6667F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9315F, -3.2235F, -23.2943F, 1.4114F, -0.0886F, -0.3381F));

		PartDefinition cube_r303 = neck2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(11, 185).mirror().addBox(-0.286F, -1.4111F, -1.0563F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6003F, -4.1449F, -24.6056F, 1.3594F, 0.1436F, 0.8153F));

		PartDefinition cube_r304 = neck2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(59, 121).mirror().addBox(0.1042F, -2.9891F, -0.8009F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6003F, -4.1449F, -24.6056F, 1.1324F, 0.5083F, 0.6441F));

		PartDefinition cube_r305 = neck2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(45, 17).addBox(-1.8941F, -0.0739F, -2.2865F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3442F, -1.4892F, -6.0033F, 1.6171F, 0.0149F, 0.3488F));

		PartDefinition cube_r306 = neck2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(23, 79).addBox(-0.2F, -4.5F, -0.1F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.2901F, 4.5858F, -4.3906F, 1.5858F, 0.0514F, 0.0318F));

		PartDefinition cube_r307 = neck2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(96, 144).addBox(-1.5936F, -3.0093F, -3.8629F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3442F, -0.2892F, -4.6033F, 1.7768F, -0.0723F, 0.3329F));

		PartDefinition cube_r308 = neck2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(64, 9).addBox(-0.001F, -0.3801F, -0.9809F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8442F, -0.9892F, -6.1033F, 1.5704F, 0.0436F, 1.5621F));

		PartDefinition cube_r309 = neck2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(157, 141).addBox(-0.5586F, -2.3925F, 0.0273F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3442F, -1.4892F, -6.0033F, 1.5083F, 0.0162F, -0.8249F));

		PartDefinition cube_r310 = neck2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(60, 112).addBox(-1.4119F, -4.1098F, 0.0995F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3442F, -1.4892F, -6.0033F, 1.3192F, -0.37F, -0.7239F));

		PartDefinition cube_r311 = neck2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(26, 169).addBox(-0.2439F, -2.0612F, -0.4179F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3442F, -1.3892F, -4.6033F, 1.5332F, 0.0221F, 0.5319F));

		PartDefinition cube_r312 = neck2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(188, 119).addBox(-0.5936F, -2.7093F, -2.8629F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3442F, -0.5892F, -14.8033F, 1.7768F, -0.0723F, 0.3329F));

		PartDefinition cube_r313 = neck2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(37, 79).addBox(1.6109F, -3.3354F, -3.7466F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3442F, -0.5892F, -14.8033F, 1.3784F, 0.047F, 0.2502F));

		PartDefinition cube_r314 = neck2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(156, 135).addBox(-0.001F, -0.3801F, -0.9809F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8442F, -1.2892F, -16.3033F, 1.5704F, 0.0436F, 1.5621F));

		PartDefinition cube_r315 = neck2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(102, 114).addBox(-1.4119F, -4.1098F, 0.0995F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3442F, -1.6892F, -14.8033F, 1.3192F, -0.37F, -0.7239F));

		PartDefinition cube_r316 = neck2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(140, 188).addBox(-0.2439F, -2.0612F, -0.4179F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3442F, -1.6892F, -14.8033F, 1.5332F, 0.0221F, 0.5319F));

		PartDefinition cube_r317 = neck2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(40, 57).addBox(-1.8941F, -0.0739F, -2.2865F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3442F, -1.6892F, -14.8033F, 1.6171F, 0.0149F, 0.3488F));

		PartDefinition cube_r318 = neck2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(180, 184).addBox(-0.5586F, -2.3925F, 0.0273F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3442F, -1.6892F, -14.8033F, 1.5083F, 0.0162F, -0.8249F));

		PartDefinition cube_r319 = neck2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(83, 119).addBox(-0.6572F, -0.7087F, -0.2821F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6315F, -3.1235F, -25.2943F, 1.3439F, 0.1317F, 0.5173F));

		PartDefinition cube_r320 = neck2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(167, 63).addBox(-0.1581F, -0.5311F, -0.7044F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.9315F, -3.4235F, -25.2943F, 1.522F, 0.2573F, 1.3812F));

		PartDefinition cube_r321 = neck2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(83, 109).addBox(-0.2F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2769F, 0.633F, -24.3815F, 1.1661F, 0.0995F, 0.2346F));

		PartDefinition cube_r322 = neck2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(188, 122).addBox(-2.4903F, -0.5F, -0.3608F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.297F, -0.0975F, -26.1126F, 1.5708F, 0.0F, 0.3403F));

		PartDefinition cube_r323 = neck2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(59, 121).addBox(-1.1042F, -2.9891F, -0.8009F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6003F, -4.1449F, -24.6056F, 1.1324F, -0.5083F, -0.6441F));

		PartDefinition cube_r324 = neck2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(11, 185).addBox(-0.714F, -1.4111F, -1.0563F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6003F, -4.1449F, -24.6056F, 1.3594F, -0.1436F, -0.8153F));

		PartDefinition cube_r325 = neck2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(60, 57).addBox(-1.4079F, -1.0365F, -1.6667F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9315F, -3.2235F, -23.2943F, 1.4114F, 0.0886F, 0.3381F));

		PartDefinition cube_r326 = neck2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(149, 58).addBox(-1.5F, -0.5F, -9.0F, 4.0F, 3.0F, 9.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.0459F, -18.1767F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(75, 148).addBox(-1.0F, -0.4979F, -9.7823F, 3.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.4459F, -26.8767F, -0.2494F, 0.2127F, 0.2463F));

		PartDefinition cube_r327 = neck3.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(93, 62).mirror().addBox(-0.5F, -4.0F, -0.8F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7852F, 1.9035F, -5.1577F, 1.3934F, -0.0284F, -0.2854F));

		PartDefinition cube_r328 = neck3.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(106, 189).mirror().addBox(-0.3306F, -0.5F, -0.7047F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4521F, 1.7134F, -6.9953F, 1.4087F, -0.0651F, -0.3787F));

		PartDefinition cube_r329 = neck3.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(142, 170).mirror().addBox(-1.4267F, -1.1951F, -1.0281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2086F, -1.0132F, -5.0625F, 1.1888F, -0.2162F, -0.4904F));

		PartDefinition cube_r330 = neck3.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(188, 62).mirror().addBox(-3.9159F, -1.1951F, -0.2139F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.2086F, -1.0132F, -5.0625F, 1.3979F, -0.4026F, -1.1514F));

		PartDefinition cube_r331 = neck3.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(93, 72).mirror().addBox(0.2253F, -3.651F, -0.8695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2086F, -1.1132F, -6.2625F, 1.3897F, 0.3863F, 0.5379F));

		PartDefinition cube_r332 = neck3.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(114, 41).mirror().addBox(-0.431F, -2.0703F, -1.0121F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2086F, -1.1132F, -6.2625F, 1.5751F, -0.0058F, 0.6121F));

		PartDefinition cube_r333 = neck3.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(0.5796F, -1.2089F, -1.7018F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2086F, -1.1132F, -6.2625F, 1.6581F, 0.0F, -0.3491F));

		PartDefinition cube_r334 = neck3.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(100, 39).mirror().addBox(-0.8F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4974F, 1.2125F, -14.277F, 1.4387F, -0.0407F, -0.2839F));

		PartDefinition cube_r335 = neck3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(159, 189).mirror().addBox(-0.1162F, -1.6299F, -0.7158F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7481F, 1.0417F, -14.9629F, 1.3619F, -0.0633F, -0.2901F));

		PartDefinition cube_r336 = neck3.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(173, 9).mirror().addBox(-0.5839F, -0.7252F, -0.9116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8756F, -1.4618F, -14.7233F, 1.1492F, -0.2366F, -0.4815F));

		PartDefinition cube_r337 = neck3.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(188, 65).mirror().addBox(-3.1764F, -0.7252F, -0.6345F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8756F, -1.4618F, -14.7233F, 1.3782F, -0.4424F, -1.1434F));

		PartDefinition cube_r338 = neck3.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(101, 62).mirror().addBox(0.5367F, -3.3777F, -0.2335F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8756F, -1.4618F, -14.3233F, 1.3073F, 0.4298F, 0.5052F));

		PartDefinition cube_r339 = neck3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(94, 89).mirror().addBox(-0.0407F, -1.8321F, -0.6062F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8756F, -1.4618F, -14.3233F, 1.5036F, 0.0443F, 0.6108F));

		PartDefinition cube_r340 = neck3.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(40, 41).mirror().addBox(0.0F, -3.5F, -3.1F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2086F, -3.2132F, -11.7625F, 1.576F, -0.0298F, -0.3478F));

		PartDefinition cube_r341 = neck3.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(135, 64).mirror().addBox(-0.2F, -3.5F, -0.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9391F, 0.0054F, -22.3493F, 1.4404F, -0.0528F, -0.2819F));

		PartDefinition cube_r342 = neck3.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(190, 12).mirror().addBox(-0.5364F, -0.5F, -0.7873F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3481F, -0.4583F, -23.9629F, 1.3091F, -0.009F, -0.0337F));

		PartDefinition cube_r343 = neck3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(171, 174).mirror().addBox(-2.6764F, -0.7252F, -0.6345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(25, 190).mirror().addBox(-2.1764F, -0.7252F, -0.6345F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8756F, -2.3618F, -23.3233F, 1.4708F, -0.2423F, -1.1746F));

		PartDefinition cube_r344 = neck3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(173, 19).mirror().addBox(-0.5839F, -0.7252F, -0.9116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8756F, -2.3618F, -23.3233F, 1.3439F, -0.1317F, -0.5173F));

		PartDefinition cube_r345 = neck3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(50, 112).mirror().addBox(0.5367F, -3.3777F, -0.2335F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8756F, -2.3618F, -23.3233F, 1.2649F, 0.4505F, 0.4871F));

		PartDefinition cube_r346 = neck3.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(0, 145).mirror().addBox(-0.0407F, -1.8321F, -0.3062F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8756F, -2.3618F, -23.3233F, 1.4678F, 0.0693F, 0.6087F));

		PartDefinition cube_r347 = neck3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(0.0F, -3.5F, -3.0F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0082F, -3.4372F, -20.6317F, 1.5786F, -0.0447F, -0.3463F));

		PartDefinition cube_r348 = neck3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5796F, -1.2089F, -1.7018F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2086F, -1.1132F, -6.2625F, 1.6581F, 0.0F, 0.3491F));

		PartDefinition cube_r349 = neck3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(114, 41).addBox(-0.569F, -2.0703F, -1.0121F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2086F, -1.1132F, -6.2625F, 1.5751F, 0.0058F, -0.6121F));

		PartDefinition cube_r350 = neck3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(93, 72).addBox(-1.2253F, -3.651F, -0.8695F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2086F, -1.1132F, -6.2625F, 1.3897F, -0.3863F, -0.5379F));

		PartDefinition cube_r351 = neck3.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(142, 170).addBox(0.4267F, -1.1951F, -1.0281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2086F, -1.0132F, -5.0625F, 1.1888F, 0.2162F, 0.4904F));

		PartDefinition cube_r352 = neck3.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(188, 62).addBox(0.9159F, -1.1951F, -0.2139F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2086F, -1.0132F, -5.0625F, 1.3979F, 0.4026F, 1.1514F));

		PartDefinition cube_r353 = neck3.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(93, 62).addBox(-0.5F, -4.0F, -0.8F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7852F, 1.9035F, -5.1577F, 1.3934F, 0.0284F, 0.2854F));

		PartDefinition cube_r354 = neck3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(106, 189).addBox(-1.6694F, -0.5F, -0.7047F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4521F, 1.7134F, -6.9953F, 1.4087F, 0.0651F, 0.3787F));

		PartDefinition cube_r355 = neck3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(159, 189).addBox(-1.8838F, -1.6299F, -0.7158F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7481F, 1.0417F, -14.9629F, 1.3619F, 0.0633F, 0.2901F));

		PartDefinition cube_r356 = neck3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(100, 39).addBox(-0.2F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4974F, 1.2125F, -14.277F, 1.4387F, 0.0407F, 0.2839F));

		PartDefinition cube_r357 = neck3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(188, 65).addBox(0.1764F, -0.7252F, -0.6345F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8756F, -1.4618F, -14.7233F, 1.3782F, 0.4424F, 1.1434F));

		PartDefinition cube_r358 = neck3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(173, 9).addBox(-0.4161F, -0.7252F, -0.9116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8756F, -1.4618F, -14.7233F, 1.1492F, 0.2366F, 0.4815F));

		PartDefinition cube_r359 = neck3.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(101, 62).addBox(-1.5367F, -3.3777F, -0.2335F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8756F, -1.4618F, -14.3233F, 1.3073F, -0.4298F, -0.5052F));

		PartDefinition cube_r360 = neck3.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(40, 41).addBox(0.0F, -3.5F, -3.1F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2086F, -3.2132F, -11.7625F, 1.576F, 0.0298F, 0.3478F));

		PartDefinition cube_r361 = neck3.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(94, 89).addBox(-0.9593F, -1.8321F, -0.6062F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8756F, -1.4618F, -14.3233F, 1.5036F, -0.0443F, -0.6108F));

		PartDefinition cube_r362 = neck3.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(173, 19).addBox(-0.4161F, -0.7252F, -0.9116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8756F, -2.3618F, -23.3233F, 1.3439F, 0.1317F, 0.5173F));

		PartDefinition cube_r363 = neck3.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(190, 12).addBox(-1.4636F, -0.5F, -0.7873F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3481F, -0.4583F, -23.9629F, 1.3091F, 0.009F, 0.0337F));

		PartDefinition cube_r364 = neck3.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(135, 64).addBox(-0.8F, -3.5F, -0.7F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9391F, 0.0054F, -22.3493F, 1.4404F, 0.0528F, 0.2819F));

		PartDefinition cube_r365 = neck3.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(171, 174).addBox(1.6764F, -0.7252F, -0.6345F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(25, 190).addBox(0.1764F, -0.7252F, -0.6345F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8756F, -2.3618F, -23.3233F, 1.4708F, 0.2423F, 1.1746F));

		PartDefinition cube_r366 = neck3.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(84, 0).addBox(0.0F, -3.5F, -3.0F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0082F, -3.4372F, -20.6317F, 1.5786F, 0.0447F, 0.3463F));

		PartDefinition cube_r367 = neck3.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(0, 145).addBox(-0.9593F, -1.8321F, -0.3062F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8756F, -2.3618F, -23.3233F, 1.4678F, -0.0693F, -0.6087F));

		PartDefinition cube_r368 = neck3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(50, 112).addBox(-1.5367F, -3.3777F, -0.2335F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8756F, -2.3618F, -23.3233F, 1.2649F, -0.4505F, -0.4871F));

		PartDefinition cube_r369 = neck3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(123, 89).addBox(-0.5F, -0.2F, 0.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9786F, -25.4131F, -0.1047F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6786F, -25.3131F, 0.1302F, -0.0076F, 0.1744F));

		PartDefinition cube_r370 = neck4.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1F, 0.0F, 2.0F, 2.0F, 15.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.8959F, -14.9626F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r371 = neck4.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(187, 141).mirror().addBox(-3.1917F, -0.5271F, -0.7036F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9387F, -1.1851F, -5.2F, 1.5153F, -0.2111F, -1.3118F));

		PartDefinition cube_r372 = neck4.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(143, 108).mirror().addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7133F, 1.7682F, -4.2358F, 1.5616F, -0.0839F, -0.278F));

		PartDefinition cube_r373 = neck4.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(87, 161).mirror().addBox(-0.5459F, -0.5271F, -0.9713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9387F, -1.1851F, -5.2F, 1.3821F, -0.1101F, -0.5219F));

		PartDefinition cube_r374 = neck4.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(151, 180).mirror().addBox(-0.3004F, -0.5F, -0.5244F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2811F, 1.5955F, -5.7417F, 1.3681F, -0.0812F, -0.3757F));

		PartDefinition cube_r375 = neck4.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(84, 19).mirror().addBox(0.345F, -1.8634F, -0.4587F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9387F, -1.7851F, -6.4F, 1.3489F, 0.4083F, 0.5221F));

		PartDefinition cube_r376 = neck4.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(75, 84).mirror().addBox(0.0595F, -2.1429F, -0.3405F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9387F, -1.1851F, -4.7F, 1.5393F, 0.0193F, 0.6119F));

		PartDefinition cube_r377 = neck4.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(45, 0).mirror().addBox(0.0F, -3.0F, -2.5F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.038F, -2.5217F, -2.9533F, 1.6171F, -0.0149F, -0.3488F));

		PartDefinition cube_r378 = neck4.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(146, 83).mirror().addBox(-0.5F, -2.5F, -0.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8132F, 1.3451F, -11.878F, 1.5202F, -0.0848F, -0.245F));

		PartDefinition cube_r379 = neck4.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(101, 164).mirror().addBox(-2.7627F, -0.7119F, -0.8323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(189, 82).mirror().addBox(-2.2627F, -0.7119F, -0.8323F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.9387F, -1.1851F, -12.0F, 1.4169F, -0.3627F, -1.1585F));

		PartDefinition cube_r380 = neck4.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(189, 76).mirror().addBox(-0.7442F, -0.6119F, -2.8192F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9387F, -1.1851F, -12.0F, 1.1783F, -0.0134F, -0.0323F));

		PartDefinition cube_r381 = neck4.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(20, 162).mirror().addBox(-0.5847F, -0.7119F, -1.0372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9387F, -1.1851F, -12.0F, 1.228F, -0.1955F, -0.4984F));

		PartDefinition cube_r382 = neck4.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(84, 44).mirror().addBox(0.345F, -1.8634F, -0.4587F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9387F, -1.7851F, -13.4F, 1.3489F, 0.4083F, 0.5221F));

		PartDefinition cube_r383 = neck4.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(160, 105).mirror().addBox(0.0595F, -2.1429F, 0.0595F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9387F, -1.1851F, -11.7F, 1.5393F, 0.0193F, 0.6119F));

		PartDefinition cube_r384 = neck4.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.166F, -1.9784F, -10.3573F, 1.6171F, -0.0149F, -0.3488F));

		PartDefinition cube_r385 = neck4.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(151, 180).addBox(-1.6996F, -0.5F, -0.5244F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2811F, 1.5955F, -5.7417F, 1.3681F, 0.0812F, 0.3757F));

		PartDefinition cube_r386 = neck4.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(143, 108).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7133F, 1.7682F, -4.2358F, 1.5616F, 0.0839F, 0.278F));

		PartDefinition cube_r387 = neck4.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(187, 141).addBox(0.1917F, -0.5271F, -0.7036F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.9387F, -1.1851F, -5.2F, 1.5153F, 0.2111F, 1.3118F));

		PartDefinition cube_r388 = neck4.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(87, 161).addBox(-0.4541F, -0.5271F, -0.9713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9387F, -1.1851F, -5.2F, 1.3821F, 0.1101F, 0.5219F));

		PartDefinition cube_r389 = neck4.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(84, 19).addBox(-1.345F, -1.8634F, -0.4587F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9387F, -1.7851F, -6.4F, 1.3489F, -0.4083F, -0.5221F));

		PartDefinition cube_r390 = neck4.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(45, 0).addBox(0.0F, -3.0F, -2.5F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.038F, -2.5217F, -2.9533F, 1.6171F, 0.0149F, 0.3488F));

		PartDefinition cube_r391 = neck4.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(75, 84).addBox(-1.0595F, -2.1429F, -0.3405F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9387F, -1.1851F, -4.7F, 1.5393F, -0.0193F, -0.6119F));

		PartDefinition cube_r392 = neck4.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(189, 76).addBox(-1.2558F, -0.6119F, -2.8192F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9387F, -1.1851F, -12.0F, 1.1783F, 0.0134F, 0.0323F));

		PartDefinition cube_r393 = neck4.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(146, 83).addBox(-0.5F, -2.5F, -0.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8132F, 1.3451F, -11.878F, 1.5202F, 0.0848F, 0.245F));

		PartDefinition cube_r394 = neck4.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(20, 162).addBox(-0.4153F, -0.7119F, -1.0372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9387F, -1.1851F, -12.0F, 1.228F, 0.1955F, 0.4984F));

		PartDefinition cube_r395 = neck4.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(101, 164).addBox(1.7627F, -0.7119F, -0.8323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(189, 82).addBox(0.2627F, -0.7119F, -0.8323F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.9387F, -1.1851F, -12.0F, 1.4169F, 0.3627F, 1.1585F));

		PartDefinition cube_r396 = neck4.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(160, 105).addBox(-1.0595F, -2.1429F, 0.0595F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9387F, -1.1851F, -11.7F, 1.5393F, -0.0193F, -0.6119F));

		PartDefinition cube_r397 = neck4.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(84, 44).addBox(-1.345F, -1.8634F, -0.4587F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9387F, -1.7851F, -13.4F, 1.3489F, -0.4083F, -0.5221F));

		PartDefinition cube_r398 = neck4.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(0, 58).addBox(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.834F, -1.9784F, -10.3573F, 1.6171F, 0.0149F, 0.3488F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4959F, -14.9626F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r399 = neck5.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(92, 151).addBox(-0.5F, 0.0763F, 0.1073F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4855F, -9.1197F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r400 = neck5.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8132F, 1.0688F, -2.3324F, 1.4276F, -0.1774F, -0.3018F));

		PartDefinition cube_r401 = neck5.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(157, 168).mirror().addBox(-0.8897F, -0.6409F, -1.9653F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7774F, -0.8582F, -3.2198F, 1.4836F, -0.003F, -0.0348F));

		PartDefinition cube_r402 = neck5.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(7, 148).mirror().addBox(-0.496F, -0.7409F, -0.5688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7774F, -0.8582F, -3.2198F, 1.4956F, -0.0442F, -0.5307F));

		PartDefinition cube_r403 = neck5.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(39, 174).mirror().addBox(-1.9361F, -0.7409F, -0.4849F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.7774F, -0.8582F, -3.2198F, 1.5311F, -0.0777F, -1.098F));

		PartDefinition cube_r404 = neck5.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(29, 150).mirror().addBox(1.0612F, -3.9233F, 0.5268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7774F, -0.7582F, -1.8198F, 1.4916F, 0.4899F, 0.4475F));

		PartDefinition cube_r405 = neck5.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(20, 96).mirror().addBox(-0.2163F, -3.6167F, 0.1659F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7774F, -0.7582F, -1.8198F, 1.3957F, 0.119F, 0.6019F));

		PartDefinition cube_r406 = neck5.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(113, 138).mirror().addBox(1.2581F, -2.8303F, -0.1287F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7774F, -0.7582F, -1.8198F, 1.3654F, -0.0741F, -0.3414F));

		PartDefinition cube_r407 = neck5.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(30, 18).mirror().addBox(-0.4F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6616F, -0.0335F, -7.1865F, 1.4263F, -0.2081F, -0.3083F));

		PartDefinition cube_r408 = neck5.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(185, 168).mirror().addBox(-1.0754F, -0.4928F, -1.6518F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5808F, -1.5581F, -7.7812F, 1.5272F, -0.0015F, -0.0349F));

		PartDefinition cube_r409 = neck5.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(97, 151).mirror().addBox(-0.5096F, -0.5928F, -0.2047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5808F, -1.5581F, -7.7812F, 1.5332F, -0.0221F, -0.5319F));

		PartDefinition cube_r410 = neck5.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(174, 83).mirror().addBox(-1.752F, -0.5928F, -0.1705F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.5808F, -1.5581F, -7.7812F, 1.551F, -0.0389F, -1.0992F));

		PartDefinition cube_r411 = neck5.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(112, 154).mirror().addBox(0.1924F, -2.4829F, 0.4935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5808F, -1.5581F, -7.3812F, 1.5358F, 0.4706F, 0.4679F));

		PartDefinition cube_r412 = neck5.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(45, 0).mirror().addBox(-0.5249F, -1.9016F, 0.2621F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5808F, -1.5581F, -7.3812F, 1.4318F, 0.0942F, 0.6058F));

		PartDefinition cube_r413 = neck5.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-0.2F, -1.5F, -0.4F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -2.4841F, -6.8294F, 1.4066F, -0.0594F, -0.3442F));

		PartDefinition cube_r414 = neck5.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(0, 96).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.8132F, 1.0688F, -2.3324F, 1.4276F, 0.1774F, 0.3018F));

		PartDefinition cube_r415 = neck5.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(157, 168).addBox(-1.1103F, -0.6409F, -1.9653F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7774F, -0.8582F, -3.2198F, 1.4836F, 0.003F, 0.0348F));

		PartDefinition cube_r416 = neck5.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(7, 148).addBox(-0.504F, -0.7409F, -0.5688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7774F, -0.8582F, -3.2198F, 1.4956F, 0.0442F, 0.5307F));

		PartDefinition cube_r417 = neck5.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(39, 174).addBox(-0.0639F, -0.7409F, -0.4849F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.7774F, -0.8582F, -3.2198F, 1.5311F, 0.0777F, 1.098F));

		PartDefinition cube_r418 = neck5.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(29, 150).addBox(-2.0612F, -3.9233F, 0.5268F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7774F, -0.7582F, -1.8198F, 1.4916F, -0.4899F, -0.4475F));

		PartDefinition cube_r419 = neck5.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(20, 96).addBox(-0.7837F, -3.6167F, 0.1659F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7774F, -0.7582F, -1.8198F, 1.3957F, -0.119F, -0.6019F));

		PartDefinition cube_r420 = neck5.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(113, 138).addBox(-1.2581F, -2.8303F, -0.1287F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7774F, -0.7582F, -1.8198F, 1.3654F, 0.0741F, 0.3414F));

		PartDefinition cube_r421 = neck5.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(185, 168).addBox(-1.9246F, -0.4928F, -1.6518F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5808F, -1.5581F, -7.7812F, 1.5272F, 0.0015F, 0.0349F));

		PartDefinition cube_r422 = neck5.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(30, 18).addBox(-0.6F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6616F, -0.0335F, -7.1865F, 1.4263F, 0.2081F, 0.3083F));

		PartDefinition cube_r423 = neck5.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(97, 151).addBox(-0.4904F, -0.5928F, -0.2047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5808F, -1.5581F, -7.7812F, 1.5332F, 0.0221F, 0.5319F));

		PartDefinition cube_r424 = neck5.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(174, 83).addBox(-0.248F, -0.5928F, -0.1705F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.5808F, -1.5581F, -7.7812F, 1.551F, 0.0389F, 1.0992F));

		PartDefinition cube_r425 = neck5.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(30, 0).addBox(0.2F, -1.5F, -0.4F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4841F, -6.8294F, 1.4066F, 0.0594F, 0.3442F));

		PartDefinition cube_r426 = neck5.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(112, 154).addBox(-1.1924F, -2.4829F, 0.4935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5808F, -1.5581F, -7.3812F, 1.5358F, -0.4706F, -0.4679F));

		PartDefinition cube_r427 = neck5.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(45, 0).addBox(-0.4751F, -1.9016F, 0.2621F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5808F, -1.5581F, -7.3812F, 1.4318F, -0.0942F, -0.6058F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7855F, -9.0197F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r428 = neck6.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(7, 145).mirror().addBox(-0.073F, -1.8955F, 0.6966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.7843F, -1.4432F, 1.106F, 0.6098F, 0.2438F));

		PartDefinition cube_r429 = neck6.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(143, 44).mirror().addBox(0.1713F, -0.7726F, 0.4049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8582F, -0.4525F, -1.9699F, 1.1492F, -0.2366F, -0.4815F));

		PartDefinition cube_r430 = neck6.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(69, 44).mirror().addBox(-0.7192F, -1.4204F, 0.4832F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.7843F, -1.4432F, 1.0953F, 0.3087F, 0.5374F));

		PartDefinition cube_r431 = neck6.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(64, 166).mirror().addBox(-0.8501F, -0.7726F, -0.0222F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.8582F, -0.4525F, -1.9699F, 1.3387F, -0.424F, -1.0494F));

		PartDefinition cube_r432 = neck6.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(168, 171).mirror().addBox(-0.7679F, -0.6726F, -0.7911F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8582F, -0.4525F, -1.9699F, 1.0911F, -0.0161F, -0.031F));

		PartDefinition cube_r433 = neck6.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(19, 18).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6616F, 0.3251F, -1.8326F, 0.98F, -0.3544F, -0.1669F));

		PartDefinition cube_r434 = neck6.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(37, 182).mirror().addBox(-0.6118F, -0.7929F, -0.4744F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0031F, -1.1035F, -4.2665F, 1.3528F, -0.0076F, -0.0341F));

		PartDefinition cube_r435 = neck6.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(20, 0).mirror().addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6856F, 0.0561F, -3.3896F, 0.9404F, -0.3407F, -0.2397F));

		PartDefinition cube_r436 = neck6.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(167, 117).mirror().addBox(-0.4975F, -0.8929F, -0.0052F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.0031F, -1.1035F, -4.2665F, 1.4705F, -0.1941F, -1.0898F));

		PartDefinition cube_r437 = neck6.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(147, 141).mirror().addBox(0.4596F, -0.8929F, 0.6088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0031F, -1.1035F, -4.2665F, 1.3821F, -0.1101F, -0.5219F));

		PartDefinition cube_r438 = neck6.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(13, 145).mirror().addBox(-0.4534F, -1.4971F, 0.6762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3928F, -2.2037F, -4.7578F, 1.2077F, 0.5863F, 0.3011F));

		PartDefinition cube_r439 = neck6.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-0.9206F, -0.9076F, 0.4985F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3928F, -2.2037F, -4.7578F, 1.1729F, 0.2632F, 0.5593F));

		PartDefinition cube_r440 = neck6.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(168, 171).addBox(-2.2321F, -0.6726F, -0.7911F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8582F, -0.4525F, -1.9699F, 1.0911F, 0.0161F, 0.031F));

		PartDefinition cube_r441 = neck6.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(19, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6616F, 0.3251F, -1.8326F, 0.98F, 0.3544F, 0.1669F));

		PartDefinition cube_r442 = neck6.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(64, 166).addBox(-1.1499F, -0.7726F, -0.0222F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8582F, -0.4525F, -1.9699F, 1.3387F, 0.424F, 1.0494F));

		PartDefinition cube_r443 = neck6.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(143, 44).addBox(-1.1713F, -0.7726F, 0.4049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8582F, -0.4525F, -1.9699F, 1.1492F, 0.2366F, 0.4815F));

		PartDefinition cube_r444 = neck6.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(7, 145).addBox(-0.927F, -1.8955F, 0.6966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.55F, -0.7843F, -1.4432F, 1.106F, -0.6098F, -0.2438F));

		PartDefinition cube_r445 = neck6.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(0, 18).addBox(-1.05F, -1.1383F, 0.2967F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.55F, -0.7843F, -1.4432F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r446 = neck6.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(69, 44).addBox(-0.2808F, -1.4204F, 0.4832F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.55F, -0.7843F, -1.4432F, 1.0953F, -0.3087F, -0.5374F));

		PartDefinition cube_r447 = neck6.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(10, 18).addBox(0.0F, -0.6F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.4831F, -4.1219F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r448 = neck6.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(84, 0).addBox(-0.0794F, -0.9076F, 0.4985F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3928F, -2.2037F, -4.7578F, 1.1729F, -0.2632F, -0.5593F));

		PartDefinition cube_r449 = neck6.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(13, 145).addBox(-0.5466F, -1.4971F, 0.6762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3928F, -2.2037F, -4.7578F, 1.2077F, -0.5863F, -0.3011F));

		PartDefinition cube_r450 = neck6.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(167, 117).addBox(-1.5025F, -0.8929F, -0.0052F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.0031F, -1.1035F, -4.2665F, 1.4705F, 0.1941F, 1.0898F));

		PartDefinition cube_r451 = neck6.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(147, 141).addBox(-1.4596F, -0.8929F, 0.6088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0031F, -1.1035F, -4.2665F, 1.3821F, 0.1101F, 0.5219F));

		PartDefinition cube_r452 = neck6.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(37, 182).addBox(-2.3882F, -0.7929F, -0.4744F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0031F, -1.1035F, -4.2665F, 1.3528F, 0.0076F, 0.0341F));

		PartDefinition cube_r453 = neck6.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6856F, 0.0561F, -3.3896F, 0.9404F, 0.3407F, 0.2397F));

		PartDefinition cube_r454 = neck6.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(91, 114).addBox(-0.5F, -0.1509F, -0.0049F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, -3.2971F, -5.0528F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r455 = neck6.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(119, 171).addBox(-0.5F, 1.9639F, 0.4988F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.031F)), PartPose.offsetAndRotation(0.0F, -5.7971F, -7.0528F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0471F, -6.6028F));

		PartDefinition cube_r456 = head.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(185, 49).addBox(-0.5F, -0.0178F, 3.5854F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(182, 47).addBox(-0.5F, -0.0178F, -0.1396F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 2.0299F, -7.5684F, 0.589F, 0.0F, 0.0F));

		PartDefinition cube_r457 = head.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(176, 12).addBox(-1.0F, 0.5379F, 2.234F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0701F, -5.0684F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r458 = head.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(188, 137).mirror().addBox(-0.4125F, -0.5125F, -0.904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(188, 137).mirror().addBox(-0.4125F, -0.5125F, -0.504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.583F, 1.5835F, -5.0251F, 0.0654F, 0.0087F, 0.0F));

		PartDefinition cube_r459 = head.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(196, 19).mirror().addBox(-0.5875F, -0.513F, -0.5015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.583F, 1.5835F, -5.0251F, -2.8798F, 0.0087F, 0.0F));

		PartDefinition cube_r460 = head.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(188, 137).mirror().addBox(-0.4125F, -0.5065F, -1.3916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8125F, 1.454F, -3.1561F, 0.0654F, -0.1222F, 0.0F));

		PartDefinition cube_r461 = head.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(187, 136).mirror().addBox(-0.4125F, 0.0881F, -2.3217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8125F, 1.454F, -3.1561F, 0.0742F, -0.1222F, 0.0F));

		PartDefinition cube_r462 = head.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(188, 137).mirror().addBox(-0.4484F, -1.009F, -1.0558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(188, 137).mirror().addBox(-0.4484F, -0.409F, -1.0558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9845F, 1.7778F, -2.4788F, 0.1963F, -0.0785F, 0.0F));

		PartDefinition cube_r463 = head.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(186, 171).mirror().addBox(-0.5077F, -0.3831F, -0.1987F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-0.9845F, 1.7778F, -2.4788F, 0.2667F, -0.1254F, 0.1245F));

		PartDefinition cube_r464 = head.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(139, 19).mirror().addBox(-0.5F, -0.9929F, -0.3742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 0.5241F, -2.2673F, -0.1309F, 0.0F, 0.2182F));

		PartDefinition cube_r465 = head.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(139, 19).mirror().addBox(-0.5F, -0.0103F, -0.3625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.85F, 0.5241F, -2.2673F, -0.6545F, 0.0F, 0.2182F));

		PartDefinition cube_r466 = head.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(0, 195).mirror().addBox(-0.8F, -1.1F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 195).addBox(-0.2F, -1.1F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 195).addBox(-0.5F, -1.5F, -0.425F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5F, -1.0168F, -3.1294F, -0.8072F, 0.0F, 0.0F));

		PartDefinition cube_r467 = head.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(141, 141).mirror().addBox(-2.605F, 108.6804F, -155.9282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false)
				.texOffs(196, 19).mirror().addBox(-2.78F, 108.6804F, -155.9282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(196, 19).addBox(0.78F, 108.6804F, -155.9282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(141, 141).addBox(0.605F, 108.6804F, -155.9282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(1.0F, -110.1554F, 154.4018F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r468 = head.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(196, 19).mirror().addBox(-0.5F, -0.0126F, -0.0068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(196, 19).mirror().addBox(-0.5F, -0.0126F, 0.3932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.05F, -0.375F, -0.3264F, -2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r469 = head.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(196, 19).mirror().addBox(-0.5F, -0.0338F, 0.0128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.05F, -1.375F, -0.1264F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r470 = head.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(196, 19).mirror().addBox(-0.5F, -0.55F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(196, 19).addBox(2.6F, -0.55F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.05F, -1.375F, -1.0264F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r471 = head.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(196, 19).mirror().addBox(-0.5F, 0.0055F, -0.9991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.05F, -1.575F, -1.8264F, 1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r472 = head.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(196, 19).mirror().addBox(-0.5F, 0.025F, -1.0224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.05F, -0.575F, -2.0264F, 2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r473 = head.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(123, 155).mirror().addBox(-0.5F, -2.0236F, -0.9331F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 1.2072F, -1.4628F, -0.2618F, 0.0F, 0.1702F));

		PartDefinition cube_r474 = head.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(196, 19).mirror().addBox(-0.475F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(196, 19).mirror().addBox(-0.475F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false)
				.texOffs(196, 19).mirror().addBox(-0.475F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.3672F, -0.052F, -0.0499F, -2.3456F, -0.0611F, 0.1209F));

		PartDefinition cube_r475 = head.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(200, 10).mirror().addBox(-0.5F, -0.4301F, -0.9306F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.6645F, -0.8906F, -2.6616F, 0.0F, 0.1833F));

		PartDefinition cube_r476 = head.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(196, 19).mirror().addBox(-0.5F, -0.1249F, 0.7039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(196, 19).mirror().addBox(-0.5F, -0.1249F, 0.3039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.6645F, -0.8906F, -2.2253F, 0.0F, 0.1833F));

		PartDefinition cube_r477 = head.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(196, 19).mirror().addBox(-0.5F, 0.8098F, -0.2013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.6645F, -0.8906F, -1.0908F, 0.0F, 0.1833F));

		PartDefinition cube_r478 = head.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(196, 19).mirror().addBox(-0.5F, 0.8842F, -0.5531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.6645F, -0.8906F, -0.6109F, 0.0F, 0.1833F));

		PartDefinition cube_r479 = head.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(186, 171).addBox(-0.4923F, -0.3831F, -0.1987F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(1.9845F, 1.7778F, -2.4788F, 0.2667F, 0.1254F, -0.1245F));

		PartDefinition cube_r480 = head.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(139, 19).addBox(-0.5F, -0.0103F, -0.3625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.85F, 0.5241F, -2.2673F, -0.6545F, 0.0F, -0.2182F));

		PartDefinition cube_r481 = head.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(139, 19).addBox(-0.5F, -0.9929F, -0.3742F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.85F, 0.5241F, -2.2673F, -0.1309F, 0.0F, -0.2182F));

		PartDefinition cube_r482 = head.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(196, 19).addBox(-0.5F, 0.0055F, -0.9991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.05F, -1.575F, -1.8264F, 1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r483 = head.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(196, 19).addBox(-0.4125F, -0.513F, -0.5015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.583F, 1.5835F, -5.0251F, -2.8798F, -0.0087F, 0.0F));

		PartDefinition cube_r484 = head.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(196, 19).addBox(-0.5F, 0.025F, -1.0224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.05F, -0.575F, -2.0264F, 2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r485 = head.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(196, 19).addBox(-0.5F, -0.0126F, 0.3932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(196, 19).addBox(-0.5F, -0.0126F, -0.0068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.05F, -0.375F, -0.3264F, -2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r486 = head.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(196, 19).addBox(-0.5F, 0.8842F, -0.5531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.45F, 0.6645F, -0.8906F, -0.6109F, 0.0F, -0.1833F));

		PartDefinition cube_r487 = head.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(196, 19).addBox(-0.5F, 0.8098F, -0.2013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(2.45F, 0.6645F, -0.8906F, -1.0908F, 0.0F, -0.1833F));

		PartDefinition cube_r488 = head.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(196, 19).addBox(-0.5F, -0.1249F, 0.7039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(196, 19).addBox(-0.5F, -0.1249F, 0.3039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(2.45F, 0.6645F, -0.8906F, -2.2253F, 0.0F, -0.1833F));

		PartDefinition cube_r489 = head.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(196, 19).addBox(-0.525F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(196, 19).addBox(-0.525F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F))
				.texOffs(196, 19).addBox(-0.525F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.3672F, -0.052F, -0.0499F, -2.3456F, 0.0611F, -0.1209F));

		PartDefinition cube_r490 = head.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(200, 10).addBox(-0.5F, -0.4301F, -0.9306F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.45F, 0.6645F, -0.8906F, -2.6616F, 0.0F, -0.1833F));

		PartDefinition cube_r491 = head.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(196, 19).addBox(-0.5F, -0.0338F, 0.0128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.05F, -1.375F, -0.1264F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r492 = head.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(120, 156).addBox(-2.0F, -0.1279F, -0.7653F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(120, 156).addBox(-2.0F, -0.1279F, -1.1653F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -1.8701F, -0.1684F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r493 = head.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(123, 156).addBox(1.15F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(123, 156).addBox(1.15F, -0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.0268F, 1.2547F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r494 = head.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(182, 197).addBox(-0.5F, 0.1971F, -1.1903F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.8701F, -0.1684F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r495 = head.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(119, 155).addBox(-2.0F, -2.4656F, -1.9202F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.5F, 1.1299F, -0.3684F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r496 = head.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(123, 155).addBox(-0.5F, -2.0236F, -0.9331F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.2F, 1.2072F, -1.4628F, -0.2618F, 0.0F, -0.1702F));

		PartDefinition cube_r497 = head.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(200, 30).addBox(-1.5F, -0.625F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.5F, 2.9947F, -6.4614F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r498 = head.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(168, 51).addBox(-1.0F, -0.475F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.5F, 3.2218F, -7.6526F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r499 = head.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(95, 127).addBox(-0.5F, 1.1553F, -7.4567F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7701F, -1.4684F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r500 = head.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(187, 136).addBox(-0.5875F, 0.0881F, -2.3217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8125F, 1.454F, -3.1561F, 0.0742F, 0.1222F, 0.0F));

		PartDefinition cube_r501 = head.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(188, 137).addBox(-0.5875F, -0.5125F, -0.504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(188, 137).addBox(-0.5875F, -0.5125F, -0.904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.583F, 1.5835F, -5.0251F, 0.0654F, -0.0087F, 0.0F));

		PartDefinition cube_r502 = head.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(188, 137).addBox(-0.5875F, -0.5065F, -1.3916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8125F, 1.454F, -3.1561F, 0.0654F, 0.1222F, 0.0F));

		PartDefinition cube_r503 = head.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(188, 137).addBox(-0.5875F, -0.5592F, 1.546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(188, 137).addBox(-0.5875F, -0.5592F, 0.546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8125F, 1.454F, -3.1561F, 0.1963F, 0.1222F, 0.0F));

		PartDefinition cube_r504 = head.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(188, 137).addBox(-0.5516F, -1.009F, -1.0558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(188, 137).addBox(-0.5516F, -0.409F, -1.0558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9845F, 1.7778F, -2.4788F, 0.1963F, 0.0785F, 0.0F));

		PartDefinition cube_r505 = head.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(116, 32).addBox(-1.0F, -0.8907F, 0.1215F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F))
				.texOffs(116, 32).addBox(-1.0F, -0.8907F, 4.1215F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(116, 32).addBox(-1.0F, -0.8907F, 2.1215F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 2.9299F, -7.4684F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r506 = head.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(117, 33).addBox(-1.5F, -0.7F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 1.6632F, -1.2628F, 0.6632F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8522F, -0.2786F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r507 = jaw.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(76, 99).mirror().addBox(0.0193F, -0.3951F, -3.4389F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.2144F, -0.2434F, 0.48F, -0.2443F, 0.0F));

		PartDefinition cube_r508 = jaw.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(60, 44).mirror().addBox(-0.5098F, -0.1472F, 1.6655F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.4903F, -2.6081F, 0.442F, -0.3833F, 0.1628F));

		PartDefinition cube_r509 = jaw.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(60, 57).mirror().addBox(0.0F, -0.9446F, -0.05F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.4903F, -2.6081F, 0.0873F, -0.6545F, 0.0F));

		PartDefinition cube_r510 = jaw.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(110, 62).mirror().addBox(0.0193F, -0.208F, -2.6189F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(128, 127).mirror().addBox(0.0193F, -0.208F, -0.6189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.2144F, -0.2434F, 0.1309F, -0.2443F, 0.0F));

		PartDefinition cube_r511 = jaw.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(138, 122).mirror().addBox(-0.6987F, -0.0848F, -0.1541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(131, 138).mirror().addBox(-0.6987F, -0.0848F, 0.3459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.1603F, 2.7061F, -6.0437F, 0.8219F, -0.1557F, -0.0207F));

		PartDefinition cube_r512 = jaw.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(75, 153).mirror().addBox(0.5754F, -0.0878F, -3.0991F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.3144F, -2.6434F, 0.4625F, -0.1571F, 0.0F));

		PartDefinition cube_r513 = jaw.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(167, 19).mirror().addBox(0.5442F, -1.0587F, -3.1967F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.2144F, -2.4434F, 0.2531F, -0.1571F, 0.0F));

		PartDefinition cube_r514 = jaw.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(76, 99).addBox(-1.0193F, -0.3951F, -3.4389F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.7F, 0.2144F, -0.2434F, 0.48F, 0.2443F, 0.0F));

		PartDefinition cube_r515 = jaw.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(60, 44).addBox(0.5098F, -0.1472F, 1.6655F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.4903F, -2.6081F, 0.442F, 0.3833F, -0.1628F));

		PartDefinition cube_r516 = jaw.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(60, 57).addBox(0.0F, -0.9446F, -0.05F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.4903F, -2.6081F, 0.0873F, 0.6545F, 0.0F));

		PartDefinition cube_r517 = jaw.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(110, 62).addBox(-1.0193F, -0.208F, -2.6189F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(128, 127).addBox(-1.0193F, -0.208F, -0.6189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 0.2144F, -0.2434F, 0.1309F, 0.2443F, 0.0F));

		PartDefinition cube_r518 = jaw.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(138, 122).addBox(-0.3013F, -0.0848F, -0.1541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 138).addBox(-0.3013F, -0.0848F, 0.3459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.8397F, 2.7061F, -6.0437F, 0.8219F, 0.1557F, 0.0207F));

		PartDefinition cube_r519 = jaw.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(75, 153).addBox(-1.5754F, -0.0878F, -3.0991F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.7F, 0.3144F, -2.6434F, 0.4625F, 0.1571F, 0.0F));

		PartDefinition cube_r520 = jaw.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(167, 19).addBox(-1.5442F, -1.0587F, -3.1967F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(2.7F, 2.2144F, -2.4434F, 0.2531F, 0.1571F, 0.0F));

		PartDefinition cube_r521 = jaw.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(149, 64).addBox(-1.3397F, -1.0294F, -1.1099F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(0.8397F, 2.7061F, -6.0437F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r522 = jaw.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(118, 161).addBox(-1.3397F, -0.2652F, -1.118F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.8397F, 2.7061F, -6.0437F, 1.1781F, 0.0F, 0.0F));

		PartDefinition throat = jaw.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.6174F, -5.2924F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 208, 208);
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