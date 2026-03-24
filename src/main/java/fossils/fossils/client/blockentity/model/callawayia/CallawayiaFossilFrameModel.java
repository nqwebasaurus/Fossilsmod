package fossils.fossils.client.blockentity.model.callawayia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CallawayiaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Callawayia;
	private final ModelPart Body1;
	private final ModelPart ForelimbL;
	private final ModelPart ForelimbL2;
	private final ModelPart Body2;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Body3;
	private final ModelPart Body10;
	private final ModelPart Body11;
	private final ModelPart Body4;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart HindlimbL;
	private final ModelPart HindlimbL2;
	private final ModelPart Body5;
	private final ModelPart Body12;
	private final ModelPart Body13;
	private final ModelPart Body14;
	private final ModelPart Body15;
	private final ModelPart Body16;
	private final ModelPart Body17;
	private final ModelPart Body18;
	private final ModelPart Body6;
	private final ModelPart Body9;
	private final ModelPart Body7;
	private final ModelPart Body8;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;

	public CallawayiaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Callawayia = this.fossil.getChild("Callawayia");
		this.Body1 = this.Callawayia.getChild("Body1");
		this.ForelimbL = this.Body1.getChild("ForelimbL");
		this.ForelimbL2 = this.Body1.getChild("ForelimbL2");
		this.Body2 = this.Body1.getChild("Body2");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone4 = this.Body2.getChild("bone4");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body10 = this.Body3.getChild("Body10");
		this.Body11 = this.Body10.getChild("Body11");
		this.Body4 = this.Body11.getChild("Body4");
		this.bone = this.Body4.getChild("bone");
		this.bone3 = this.Body4.getChild("bone3");
		this.HindlimbL = this.Body4.getChild("HindlimbL");
		this.HindlimbL2 = this.Body4.getChild("HindlimbL2");
		this.Body5 = this.Body4.getChild("Body5");
		this.Body12 = this.Body5.getChild("Body12");
		this.Body13 = this.Body12.getChild("Body13");
		this.Body14 = this.Body13.getChild("Body14");
		this.Body15 = this.Body14.getChild("Body15");
		this.Body16 = this.Body15.getChild("Body16");
		this.Body17 = this.Body16.getChild("Body17");
		this.Body18 = this.Body17.getChild("Body18");
		this.Body6 = this.Body18.getChild("Body6");
		this.Body9 = this.Body6.getChild("Body9");
		this.Body7 = this.Body9.getChild("Body7");
		this.Body8 = this.Body7.getChild("Body8");
		this.Head = this.Callawayia.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Callawayia = fossil.addOrReplaceChild("Callawayia", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.1181F, 0.675F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Body1 = Callawayia.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8817F, -18.4422F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 50).addBox(-0.5F, 0.3F, -4.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2817F, 3.3672F, 0.3491F, 0.0F, 0.0F));

		PartDefinition ForelimbL = Body1.addOrReplaceChild("ForelimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0987F, 5.298F, 8.1405F, 0.5267F, -0.4059F, -0.0218F));

		PartDefinition ForelimbL2 = Body1.addOrReplaceChild("ForelimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0987F, 5.298F, 8.1405F, 0.4421F, 0.0301F, 0.1194F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.826F, 4.7368F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition cube_r2 = Body2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(25, 46).addBox(-1.5F, 0.7247F, 6.4944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 40).addBox(-1.5F, 0.7247F, -0.2056F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.0557F, 2.7054F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(48, 69).addBox(1.3F, -0.5F, -5.2F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 5.7859F, 2.3399F, -1.6954F, -0.1992F, 1.5956F));

		PartDefinition cube_r4 = Body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(52, 73).addBox(-0.625F, -0.5F, -5.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 5.7859F, 2.3399F, -1.3701F, -0.1222F, 0.0F));

		PartDefinition cube_r5 = Body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 77).addBox(-1.5F, 0.75F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3557F, -0.1946F, 0.2443F, 0.0F, 0.0F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.5F, 4.7181F, 1.5697F));

		PartDefinition bone4 = Body2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(1.5F, 4.7181F, 1.5697F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5909F, 9.6028F, 0.1226F, 0.0866F, 0.0107F));

		PartDefinition cube_r6 = Body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 34).addBox(-1.5F, 0.8F, 0.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body10 = Body3.addOrReplaceChild("Body10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5541F, 7.803F, -0.0358F, 0.1741F, -0.0119F));

		PartDefinition cube_r7 = Body10.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(35, 0).addBox(-1.5F, 0.8F, -0.05F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body11 = Body10.addOrReplaceChild("Body11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5393F, 7.7656F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Body11.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(42, 17).addBox(-1.5F, 0.8F, 7.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(35, 10).addBox(-1.5F, 0.8F, -0.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body4 = Body11.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3906F, 7.6977F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Body4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(80, 14).addBox(-0.5F, 0.1636F, 2.391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(78, 12).addBox(-0.5F, 0.1636F, -0.309F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0079F, 3.8526F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Body4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(61, 29).addBox(-2.6F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.4237F, 3.2942F, -1.5708F, -0.2094F, -1.5708F));

		PartDefinition cube_r11 = Body4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(65, 33).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.2718F, 3.7516F, -1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Body4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(65, 33).addBox(-1.5F, 0.7352F, 0.2356F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.4012F, -0.0784F, -0.2094F, 0.0F, 0.0F));

		PartDefinition bone = Body4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3F, 4.6638F, 2.6589F, 0.3927F, 0.0F, 0.0F));

		PartDefinition bone3 = Body4.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3F, 4.6638F, 2.6589F, 0.3927F, 0.0F, 0.0F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6574F, 5.0255F, 2.5304F, 0.3286F, -0.3315F, 0.4052F));

		PartDefinition HindlimbL2 = Body4.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6574F, 5.0255F, 2.5304F, 0.3286F, 0.3315F, -0.4052F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0617F, 6.7906F, -0.1051F, -0.0868F, 0.0091F));

		PartDefinition cube_r13 = Body5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(35, 65).addBox(-1.5F, 0.85F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body12 = Body5.addOrReplaceChild("Body12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0725F, 3.9045F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r14 = Body12.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(72, 45).addBox(-1.5F, 0.85F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body13 = Body12.addOrReplaceChild("Body13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0611F, 3.9796F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition cube_r15 = Body13.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(68, 65).addBox(-1.5F, 0.85F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body14 = Body13.addOrReplaceChild("Body14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0603F, 4.0045F, -0.0526F, -0.0871F, 0.0046F));

		PartDefinition cube_r16 = Body14.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(72, 3).addBox(-1.5F, 0.85F, 3.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(69, 0).addBox(-1.5F, 0.85F, -0.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body15 = Body14.addOrReplaceChild("Body15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0638F, 3.9046F, -0.0175F, -0.0873F, 0.0015F));

		PartDefinition cube_r17 = Body15.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(72, 9).addBox(-1.5F, 0.85F, 3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(69, 6).addBox(-1.5F, 0.85F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3629F, 0.0345F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body16 = Body15.addOrReplaceChild("Body16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0698F, 3.9994F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r18 = Body16.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(35, 71).addBox(-1.5F, 0.85F, 0.15F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3629F, 0.0345F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body17 = Body16.addOrReplaceChild("Body17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.05F, 4.0F, 0.0176F, -0.1309F, -0.0023F));

		PartDefinition cube_r19 = Body17.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(49, 74).addBox(-1.5F, 0.85F, 3.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(46, 71).addBox(-1.5F, 0.85F, -0.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3629F, 0.0345F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body18 = Body17.addOrReplaceChild("Body18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0797F, 3.977F, -0.0177F, -0.1745F, 0.0031F));

		PartDefinition cube_r20 = Body18.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(60, 74).addBox(-1.5F, 0.85F, 3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 71).addBox(-1.5F, 0.85F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3629F, 0.0345F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body6 = Body18.addOrReplaceChild("Body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0878F, 3.942F, 0.1063F, 0.1736F, 0.0184F));

		PartDefinition cube_r21 = Body6.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(46, 65).addBox(-1.5F, 0.25F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.2149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Body9 = Body6.addOrReplaceChild("Body9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, 4.0035F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r22 = Body9.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(59, 67).addBox(-1.5F, 0.25F, 3.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 65).addBox(-1.5F, 0.25F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.4149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Body7 = Body9.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1791F, 4.003F, 0.1676F, 0.1658F, 0.0383F));

		PartDefinition cube_r23 = Body7.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(15, 54).addBox(-1.5F, 0.7838F, -0.0096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0165F, 5.0478F, 0.2921F, 0.2932F, 0.0867F));

		PartDefinition cube_r24 = Body8.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(68, 71).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 15.3951F, 7.4984F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Body8.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(80, 58).addBox(-0.5F, -0.2F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(78, 56).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 12.968F, 5.7351F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Body8.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(65, 82).addBox(-1.5F, -0.0112F, -0.2737F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 1.5692F, 1.0703F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Body8.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(58, 62).addBox(-0.5F, -0.25F, 4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(54, 58).addBox(-0.5F, -0.25F, -0.45F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 8.5265F, 3.4141F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r28 = Body8.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(54, 16).addBox(-0.5F, 0.8F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.4381F, 3.0859F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r29 = Body8.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(45, 87).addBox(-1.5F, 0.7261F, 0.0534F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.2808F, -0.1047F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Head = Callawayia.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0536F, 1.0848F, -19.2102F, -0.0915F, -0.3042F, 0.0275F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.9464F, 0.454F, -6.2482F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.0536F, 0.454F, -6.2482F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0536F, 2.4445F, 0.8368F, 0.4276F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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