package fossils.fossils.client.blockentity.model.temnodontosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TemnodontosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Temnodontosaurus;
	private final ModelPart Body1;
	private final ModelPart Body2;
	private final ModelPart ForelimbL;
	private final ModelPart ForelimbL2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Body3;
	private final ModelPart Body10;
	private final ModelPart Body11;
	private final ModelPart Body4;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart HindlimbL;
	private final ModelPart HindlimbL2;
	private final ModelPart Body5;
	private final ModelPart Body6;
	private final ModelPart Body9;
	private final ModelPart Body7;
	private final ModelPart Body8;
	private final ModelPart Body12;
	private final ModelPart Body13;
	private final ModelPart Body14;
	private final ModelPart Body15;
	private final ModelPart Body17;
	private final ModelPart Body19;
	private final ModelPart Body20;
	private final ModelPart Body18;
	private final ModelPart Body16;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;

	public TemnodontosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Temnodontosaurus = this.fossil.getChild("Temnodontosaurus");
		this.Body1 = this.Temnodontosaurus.getChild("Body1");
		this.Body2 = this.Body1.getChild("Body2");
		this.ForelimbL = this.Body2.getChild("ForelimbL");
		this.ForelimbL2 = this.Body2.getChild("ForelimbL2");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone3 = this.Body2.getChild("bone3");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body10 = this.Body3.getChild("Body10");
		this.Body11 = this.Body10.getChild("Body11");
		this.Body4 = this.Body11.getChild("Body4");
		this.bone = this.Body4.getChild("bone");
		this.bone4 = this.Body4.getChild("bone4");
		this.HindlimbL = this.Body4.getChild("HindlimbL");
		this.HindlimbL2 = this.Body4.getChild("HindlimbL2");
		this.Body5 = this.Body4.getChild("Body5");
		this.Body6 = this.Body5.getChild("Body6");
		this.Body9 = this.Body6.getChild("Body9");
		this.Body7 = this.Body9.getChild("Body7");
		this.Body8 = this.Body7.getChild("Body8");
		this.Body12 = this.Body8.getChild("Body12");
		this.Body13 = this.Body12.getChild("Body13");
		this.Body14 = this.Body13.getChild("Body14");
		this.Body15 = this.Body14.getChild("Body15");
		this.Body17 = this.Body15.getChild("Body17");
		this.Body19 = this.Body17.getChild("Body19");
		this.Body20 = this.Body19.getChild("Body20");
		this.Body18 = this.Body17.getChild("Body18");
		this.Body16 = this.Body15.getChild("Body16");
		this.Head = this.Temnodontosaurus.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Temnodontosaurus = fossil.addOrReplaceChild("Temnodontosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.6181F, -10.325F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Body1 = Temnodontosaurus.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3817F, -16.8422F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, 0.2F, -4.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4817F, 1.7672F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.026F, 3.1368F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(28, 56).addBox(-1.5F, 0.6247F, 6.4944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 51).addBox(-1.5F, 0.6247F, -0.2056F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -1.0557F, 2.7054F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(81, 38).addBox(2.1F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.9874F, 1.4342F, -1.5708F, -0.2443F, 1.5708F));

		PartDefinition cube_r4 = Body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(86, 43).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.3973F, 0.5391F, -1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(89, 46).addBox(-1.5F, 0.65F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3557F, -0.1946F, 0.2443F, 0.0F, 0.0F));

		PartDefinition ForelimbL = Body2.addOrReplaceChild("ForelimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2F, 6.4775F, 2.0769F, 0.4386F, 0.2044F, -0.2672F));

		PartDefinition ForelimbL2 = Body2.addOrReplaceChild("ForelimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.2F, 6.4775F, 2.0769F, 0.4195F, 0.8236F, 0.4958F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8738F, 4.7509F, 2.0219F, -0.4363F, 0.0F, 0.0F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8738F, 4.7509F, 2.0219F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5931F, 9.6655F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(25, 36).addBox(-1.5F, 0.7F, 0.375F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.5626F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body10 = Body3.addOrReplaceChild("Body10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5541F, 7.803F, 0.0786F, 0.0435F, 0.0034F));

		PartDefinition cube_r7 = Body10.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(44, 36).addBox(-1.5F, 0.7F, 0.025F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body11 = Body10.addOrReplaceChild("Body11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4644F, 7.7689F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Body11.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(6, 45).addBox(-1.5F, 0.7F, 7.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 38).addBox(-1.5F, 0.7F, -0.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.5625F, -0.0601F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body4 = Body11.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3906F, 7.6977F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Body4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(91, 33).addBox(-1.5F, -0.3354F, 2.4444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(89, 31).addBox(-1.5F, -0.3354F, -0.2555F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 1.3988F, 3.7216F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Body4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(85, 27).addBox(1.4F, -0.5F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.7422F, 5.7353F, -1.5708F, 0.0698F, 1.5708F));

		PartDefinition cube_r11 = Body4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(87, 29).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.6498F, 5.9515F, -1.6406F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Body4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(52, 79).addBox(-1.5F, 0.6352F, 0.2356F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.4012F, -0.0784F, -0.2094F, 0.0F, 0.0F));

		PartDefinition bone = Body4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 5.5481F, 5.9413F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone4 = Body4.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 5.5481F, 5.9413F, -0.2618F, 0.0F, 0.0F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3555F, 6.8611F, 5.3481F, 0.5007F, -0.1874F, 0.0757F));

		PartDefinition HindlimbL2 = Body4.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3555F, 6.8611F, 5.3481F, 0.6521F, 0.2016F, -0.2662F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8617F, 6.7871F, -0.0007F, 0.0859F, -0.0152F));

		PartDefinition cube_r13 = Body5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(40, 55).addBox(-1.5F, 0.75F, 0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3629F, -0.0655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body6 = Body5.addOrReplaceChild("Body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1222F, 6.7884F, 0.1396F, 0.0422F, 0.0174F));

		PartDefinition cube_r14 = Body6.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(14, 83).addBox(-1.5F, 0.15F, 3.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(11, 80).addBox(-1.5F, 0.15F, -0.425F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.2149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Body9 = Body6.addOrReplaceChild("Body9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, 4.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Body9.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(22, 80).addBox(-1.5F, 0.175F, -0.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.2149F, 0.1461F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Body7 = Body9.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0209F, 4.003F, 0.044F, -0.1308F, -0.0057F));

		PartDefinition cube_r16 = Body7.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 64).addBox(-1.5F, 0.7088F, -0.2096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.125F, 4.925F, 0.0087F, -0.0436F, -0.0004F));

		PartDefinition cube_r17 = Body8.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(72, 69).addBox(-1.5F, 0.6838F, 4.2404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(68, 65).addBox(-1.5F, 0.6838F, -0.4596F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body12 = Body8.addOrReplaceChild("Body12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.125F, 5.0F, -0.0783F, -0.2182F, -0.0019F));

		PartDefinition cube_r18 = Body12.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(47, 73).addBox(-1.5F, 0.6838F, 4.6154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(43, 69).addBox(-1.5F, 0.6838F, -0.0846F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body13 = Body12.addOrReplaceChild("Body13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.125F, 4.975F, -0.0792F, -0.1305F, 0.0103F));

		PartDefinition cube_r19 = Body13.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(89, 89).addBox(-1.5F, 0.6838F, 0.1904F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body14 = Body13.addOrReplaceChild("Body14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.075F, 2.925F, -0.2978F, -0.0834F, 0.0256F));

		PartDefinition cube_r20 = Body14.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(90, 0).addBox(-1.5F, 0.7623F, -0.0085F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 3.0431F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Body14.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 90).addBox(-1.5F, 0.6838F, -0.0096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body15 = Body14.addOrReplaceChild("Body15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0258F, 5.5521F, -0.7524F, 0.0638F, -0.0596F));

		PartDefinition cube_r22 = Body15.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(75, 57).addBox(-1.5F, -0.285F, 4.3133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(72, 54).addBox(-1.5F, -0.285F, -0.3867F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.7358F, 5.0431F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Body15.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 71).addBox(-1.5F, 0.6838F, -0.0096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body17 = Body15.addOrReplaceChild("Body17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0558F, 9.8009F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Body17.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(79, 14).addBox(-1.5F, -0.285F, 4.2633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(75, 10).addBox(-1.5F, -0.285F, -0.4366F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.7358F, 5.0431F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Body17.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(73, 22).addBox(-1.5F, 0.6838F, -0.0096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body19 = Body17.addOrReplaceChild("Body19", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4395F, 9.6533F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Body19.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(80, 37).addBox(-1.5F, -0.36F, -0.5616F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.7358F, 5.0431F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Body19.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(26, 73).addBox(-1.5F, 0.6838F, -0.1096F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.3642F, 0.0431F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Body20 = Body19.addOrReplaceChild("Body20", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1434F, 4.9595F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Body18 = Body17.addOrReplaceChild("Body18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1434F, 4.9595F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Body16 = Body15.addOrReplaceChild("Body16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1434F, 4.9595F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Head = Temnodontosaurus.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0536F, 1.0848F, -19.2102F, 0.0438F, 0.0872F, 0.0038F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.4464F, 0.454F, -6.2482F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.5536F, 0.454F, -6.2482F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0536F, 1.1453F, 0.7914F, 0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 123, 123);
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