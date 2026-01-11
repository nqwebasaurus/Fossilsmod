package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BundenbachiellusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart Body;
	private final ModelPart ArmL;
	private final ModelPart ArmfillamentL1;
	private final ModelPart ArmfillamentL2;
	private final ModelPart ArmfillamentL3;
	private final ModelPart ArmL2;
	private final ModelPart ArmfillamentL4;
	private final ModelPart ArmfillamentL5;
	private final ModelPart ArmfillamentL6;
	private final ModelPart HeadlegL;
	private final ModelPart HeadlegL3;
	private final ModelPart HeadlegL2;
	private final ModelPart HeadlegL4;
	private final ModelPart legL;
	private final ModelPart cube_r3;
	private final ModelPart legL13;
	private final ModelPart cube_r4;
	private final ModelPart Body2;
	private final ModelPart legL2;
	private final ModelPart cube_r5;
	private final ModelPart legL14;
	private final ModelPart cube_r6;
	private final ModelPart Body3;
	private final ModelPart legL3;
	private final ModelPart cube_r7;
	private final ModelPart legL15;
	private final ModelPart cube_r8;
	private final ModelPart Body4;
	private final ModelPart legL4;
	private final ModelPart cube_r9;
	private final ModelPart legL16;
	private final ModelPart cube_r10;
	private final ModelPart Body5;
	private final ModelPart legL5;
	private final ModelPart cube_r11;
	private final ModelPart legL17;
	private final ModelPart cube_r12;
	private final ModelPart Body6;
	private final ModelPart legL6;
	private final ModelPart cube_r13;
	private final ModelPart legL18;
	private final ModelPart cube_r14;
	private final ModelPart Body7;
	private final ModelPart legL7;
	private final ModelPart cube_r15;
	private final ModelPart legL19;
	private final ModelPart cube_r16;
	private final ModelPart Body8;
	private final ModelPart legL8;
	private final ModelPart cube_r17;
	private final ModelPart legL20;
	private final ModelPart cube_r18;
	private final ModelPart Body9;
	private final ModelPart legL9;
	private final ModelPart cube_r19;
	private final ModelPart legL21;
	private final ModelPart cube_r20;
	private final ModelPart Body10;
	private final ModelPart legL10;
	private final ModelPart cube_r21;
	private final ModelPart legL22;
	private final ModelPart cube_r22;
	private final ModelPart Body11;
	private final ModelPart legL11;
	private final ModelPart cube_r23;
	private final ModelPart legL23;
	private final ModelPart cube_r24;
	private final ModelPart Body12;
	private final ModelPart legL12;
	private final ModelPart cube_r25;
	private final ModelPart legL24;
	private final ModelPart cube_r26;
	private final ModelPart Telson;
	private final ModelPart cube_r27;
	private final ModelPart cube_r28;

	public BundenbachiellusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.cube_r1 = this.fossil.getChild("cube_r1");
		this.cube_r2 = this.fossil.getChild("cube_r2");
		this.Body = this.fossil.getChild("Body");
		this.ArmL = this.Body.getChild("ArmL");
		this.ArmfillamentL1 = this.ArmL.getChild("ArmfillamentL1");
		this.ArmfillamentL2 = this.ArmL.getChild("ArmfillamentL2");
		this.ArmfillamentL3 = this.ArmL.getChild("ArmfillamentL3");
		this.ArmL2 = this.Body.getChild("ArmL2");
		this.ArmfillamentL4 = this.ArmL2.getChild("ArmfillamentL4");
		this.ArmfillamentL5 = this.ArmL2.getChild("ArmfillamentL5");
		this.ArmfillamentL6 = this.ArmL2.getChild("ArmfillamentL6");
		this.HeadlegL = this.Body.getChild("HeadlegL");
		this.HeadlegL3 = this.Body.getChild("HeadlegL3");
		this.HeadlegL2 = this.Body.getChild("HeadlegL2");
		this.HeadlegL4 = this.Body.getChild("HeadlegL4");
		this.legL = this.Body.getChild("legL");
		this.cube_r3 = this.legL.getChild("cube_r3");
		this.legL13 = this.Body.getChild("legL13");
		this.cube_r4 = this.legL13.getChild("cube_r4");
		this.Body2 = this.Body.getChild("Body2");
		this.legL2 = this.Body2.getChild("legL2");
		this.cube_r5 = this.legL2.getChild("cube_r5");
		this.legL14 = this.Body2.getChild("legL14");
		this.cube_r6 = this.legL14.getChild("cube_r6");
		this.Body3 = this.Body2.getChild("Body3");
		this.legL3 = this.Body3.getChild("legL3");
		this.cube_r7 = this.legL3.getChild("cube_r7");
		this.legL15 = this.Body3.getChild("legL15");
		this.cube_r8 = this.legL15.getChild("cube_r8");
		this.Body4 = this.Body3.getChild("Body4");
		this.legL4 = this.Body4.getChild("legL4");
		this.cube_r9 = this.legL4.getChild("cube_r9");
		this.legL16 = this.Body4.getChild("legL16");
		this.cube_r10 = this.legL16.getChild("cube_r10");
		this.Body5 = this.Body4.getChild("Body5");
		this.legL5 = this.Body5.getChild("legL5");
		this.cube_r11 = this.legL5.getChild("cube_r11");
		this.legL17 = this.Body5.getChild("legL17");
		this.cube_r12 = this.legL17.getChild("cube_r12");
		this.Body6 = this.Body5.getChild("Body6");
		this.legL6 = this.Body6.getChild("legL6");
		this.cube_r13 = this.legL6.getChild("cube_r13");
		this.legL18 = this.Body6.getChild("legL18");
		this.cube_r14 = this.legL18.getChild("cube_r14");
		this.Body7 = this.Body6.getChild("Body7");
		this.legL7 = this.Body7.getChild("legL7");
		this.cube_r15 = this.legL7.getChild("cube_r15");
		this.legL19 = this.Body7.getChild("legL19");
		this.cube_r16 = this.legL19.getChild("cube_r16");
		this.Body8 = this.Body7.getChild("Body8");
		this.legL8 = this.Body8.getChild("legL8");
		this.cube_r17 = this.legL8.getChild("cube_r17");
		this.legL20 = this.Body8.getChild("legL20");
		this.cube_r18 = this.legL20.getChild("cube_r18");
		this.Body9 = this.Body8.getChild("Body9");
		this.legL9 = this.Body9.getChild("legL9");
		this.cube_r19 = this.legL9.getChild("cube_r19");
		this.legL21 = this.Body9.getChild("legL21");
		this.cube_r20 = this.legL21.getChild("cube_r20");
		this.Body10 = this.Body9.getChild("Body10");
		this.legL10 = this.Body10.getChild("legL10");
		this.cube_r21 = this.legL10.getChild("cube_r21");
		this.legL22 = this.Body10.getChild("legL22");
		this.cube_r22 = this.legL22.getChild("cube_r22");
		this.Body11 = this.Body10.getChild("Body11");
		this.legL11 = this.Body11.getChild("legL11");
		this.cube_r23 = this.legL11.getChild("cube_r23");
		this.legL23 = this.Body11.getChild("legL23");
		this.cube_r24 = this.legL23.getChild("cube_r24");
		this.Body12 = this.Body11.getChild("Body12");
		this.legL12 = this.Body12.getChild("legL12");
		this.cube_r25 = this.legL12.getChild("cube_r25");
		this.legL24 = this.Body12.getChild("legL24");
		this.cube_r26 = this.legL24.getChild("cube_r26");
		this.Telson = this.Body12.getChild("Telson");
		this.cube_r27 = this.Telson.getChild("cube_r27");
		this.cube_r28 = this.Telson.getChild("cube_r28");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.0F, -19.0F, 15.0F, 2.0F, 44.0F, new CubeDeformation(0.002F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 47).addBox(-21.5F, -1.0F, -24.0F, 19.0F, 2.0F, 35.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5F, -1.0F, 1.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(75, 0).addBox(-5.3358F, -1.0F, -0.1973F, 18.0F, 2.0F, 33.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.1F, -1.0F, -4.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition Body = fossil.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(17, 72).addBox(-2.0F, -0.125F, -1.55F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(75, 3).addBox(-1.5F, 0.125F, -1.45F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.425F, -11.45F, 0.0F, 0.1309F, 0.0F));

		PartDefinition ArmL = Body.addOrReplaceChild("ArmL", CubeListBuilder.create().texOffs(35, 18).addBox(0.0F, 0.35F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.325F, -0.8F, 0.0F, 0.829F, 0.0F));

		PartDefinition ArmfillamentL1 = ArmL.addOrReplaceChild("ArmfillamentL1", CubeListBuilder.create().texOffs(18, 1).addBox(0.0F, 0.2F, -0.5F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, 0.0F, 0.0F, 0.0F, -1.0036F, 0.0F));

		PartDefinition ArmfillamentL2 = ArmL.addOrReplaceChild("ArmfillamentL2", CubeListBuilder.create().texOffs(18, 7).addBox(0.0F, 0.0F, -0.5F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, 0.25F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition ArmfillamentL3 = ArmL.addOrReplaceChild("ArmfillamentL3", CubeListBuilder.create().texOffs(0, 18).addBox(0.0F, -0.2F, -0.5F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, 0.5F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition ArmL2 = Body.addOrReplaceChild("ArmL2", CubeListBuilder.create().texOffs(34, 34).addBox(-2.0F, 0.35F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.325F, -0.8F, 0.0F, -0.829F, 0.0F));

		PartDefinition ArmfillamentL4 = ArmL2.addOrReplaceChild("ArmfillamentL4", CubeListBuilder.create().texOffs(0, 12).addBox(-6.0F, 0.2F, -0.5F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, 0.0F, 0.0F, 0.0F, -0.9599F, 0.0F));

		PartDefinition ArmfillamentL5 = ArmL2.addOrReplaceChild("ArmfillamentL5", CubeListBuilder.create().texOffs(0, 6).addBox(-6.0F, 0.0F, -0.5F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, 0.25F, 0.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition ArmfillamentL6 = ArmL2.addOrReplaceChild("ArmfillamentL6", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -0.2F, -0.5F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, 0.5F, 0.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition HeadlegL = Body.addOrReplaceChild("HeadlegL", CubeListBuilder.create().texOffs(34, 31).addBox(-0.5F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 0.325F, -0.55F, 0.0F, 0.3054F, 0.0F));

		PartDefinition HeadlegL3 = Body.addOrReplaceChild("HeadlegL3", CubeListBuilder.create().texOffs(34, 25).addBox(-2.5F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.325F, -0.55F, 0.0F, -0.3054F, 0.0F));

		PartDefinition HeadlegL2 = Body.addOrReplaceChild("HeadlegL2", CubeListBuilder.create().texOffs(34, 28).addBox(-0.5F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 0.225F, -0.05F, 0.0F, 0.0436F, 0.0F));

		PartDefinition HeadlegL4 = Body.addOrReplaceChild("HeadlegL4", CubeListBuilder.create().texOffs(23, 16).addBox(-2.5F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.225F, -0.05F, 0.0F, -0.0436F, 0.0F));

		PartDefinition legL = Body.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(75, 16).addBox(0.25F, 0.0F, -0.5F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 0.225F, 0.95F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r3 = legL.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(75, 13).addBox(0.25F, 0.0F, 0.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, -0.0436F));

		PartDefinition legL13 = Body.addOrReplaceChild("legL13", CubeListBuilder.create().texOffs(75, 10).addBox(-4.25F, 0.0F, -0.5F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.225F, 0.95F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r4 = legL13.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(75, 7).addBox(-4.25F, 0.0F, 0.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0436F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(33, 85).addBox(-1.5F, 0.1F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(22, 85).addBox(-1.5F, 0.2F, 0.45F, 3.0F, 0.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, -0.075F, 1.55F));

		PartDefinition legL2 = Body2.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(75, 0).addBox(0.25F, 0.0F, -0.5F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 0.3F, 1.65F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r5 = legL2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(74, 74).addBox(0.25F, 0.0F, 0.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.0436F));

		PartDefinition legL14 = Body2.addOrReplaceChild("legL14", CubeListBuilder.create().texOffs(74, 65).addBox(-5.25F, 0.0F, -0.5F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.3F, 1.65F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r6 = legL14.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(74, 62).addBox(-5.25F, 0.0F, 0.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0436F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create().texOffs(85, 3).addBox(-1.5F, 0.1F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 85).addBox(-1.5F, 0.2F, 0.55F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.25F, 0.0F, -0.0873F, 0.0F));

		PartDefinition legL3 = Body3.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(74, 71).addBox(0.25F, 0.0F, -0.5F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 0.3F, 1.65F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r7 = legL3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(74, 68).addBox(0.25F, 0.0F, 0.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.0436F));

		PartDefinition legL15 = Body3.addOrReplaceChild("legL15", CubeListBuilder.create().texOffs(74, 59).addBox(-5.25F, 0.0F, -0.5F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.3F, 1.65F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r8 = legL15.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(74, 56).addBox(-5.25F, 0.0F, 0.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0436F));

		PartDefinition Body4 = Body3.addOrReplaceChild("Body4", CubeListBuilder.create().texOffs(84, 40).addBox(-1.5F, 0.1F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(84, 37).addBox(-1.5F, 0.2F, 0.65F, 3.0F, 0.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.25F, 0.0F, -0.1309F, 0.0F));

		PartDefinition legL4 = Body4.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(17, 63).addBox(0.25F, 0.0F, -0.5F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 0.3F, 1.65F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r9 = legL4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(17, 60).addBox(0.25F, 0.0F, 0.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.0436F));

		PartDefinition legL16 = Body4.addOrReplaceChild("legL16", CubeListBuilder.create().texOffs(17, 57).addBox(-6.25F, 0.0F, -0.5F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.3F, 1.65F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r10 = legL16.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(17, 54).addBox(-6.25F, 0.0F, 0.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0436F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create().texOffs(84, 29).addBox(-1.5F, 0.1F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(84, 26).addBox(-1.5F, 0.2F, 0.55F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.25F, 0.0F, -0.1745F, 0.0F));

		PartDefinition legL5 = Body5.addOrReplaceChild("legL5", CubeListBuilder.create().texOffs(0, 47).addBox(0.25F, 0.0F, -0.5F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 0.3F, 1.65F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r11 = legL5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(17, 40).addBox(0.25F, 0.0F, 0.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.0436F));

		PartDefinition legL17 = Body5.addOrReplaceChild("legL17", CubeListBuilder.create().texOffs(0, 39).addBox(-7.25F, 0.0F, -0.5F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.3F, 1.65F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r12 = legL17.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(17, 37).addBox(-7.25F, 0.0F, 0.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0436F));

		PartDefinition Body6 = Body5.addOrReplaceChild("Body6", CubeListBuilder.create().texOffs(84, 23).addBox(-1.5F, 0.1F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(84, 20).addBox(-1.5F, 0.2F, 0.55F, 3.0F, 0.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.25F, 0.0F, 0.0873F, 0.0F));

		PartDefinition legL6 = Body6.addOrReplaceChild("legL6", CubeListBuilder.create().texOffs(74, 53).addBox(0.25F, 0.0F, -0.5F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 0.3F, 1.65F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r13 = legL6.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(74, 50).addBox(0.25F, 0.0F, 0.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.0436F));

		PartDefinition legL18 = Body6.addOrReplaceChild("legL18", CubeListBuilder.create().texOffs(0, 36).addBox(-7.25F, 0.0F, -0.5F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.3F, 1.65F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r14 = legL18.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(17, 34).addBox(-7.25F, 0.0F, 0.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0436F));

		PartDefinition Body7 = Body6.addOrReplaceChild("Body7", CubeListBuilder.create().texOffs(83, 78).addBox(-1.5F, 0.1F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 79).addBox(-1.5F, 0.2F, 0.55F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.25F, 0.0F, 0.2182F, 0.0F));

		PartDefinition legL7 = Body7.addOrReplaceChild("legL7", CubeListBuilder.create().texOffs(74, 47).addBox(0.25F, 0.0F, -0.5F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 0.3F, 1.65F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r15 = legL7.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 74).addBox(0.25F, 0.0F, 0.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.0436F));

		PartDefinition legL19 = Body7.addOrReplaceChild("legL19", CubeListBuilder.create().texOffs(0, 33).addBox(-7.25F, 0.0F, -0.5F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.3F, 1.65F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r16 = legL19.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(17, 31).addBox(-7.25F, 0.0F, 0.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0436F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create().texOffs(9, 79).addBox(-1.5F, 0.1F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(74, 77).addBox(-1.5F, 0.2F, 0.55F, 3.0F, 0.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.25F, 0.0F, 0.2182F, 0.0F));

		PartDefinition legL8 = Body8.addOrReplaceChild("legL8", CubeListBuilder.create().texOffs(0, 71).addBox(0.25F, 0.0F, -0.5F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 0.3F, 1.65F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r17 = legL8.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 68).addBox(0.25F, 0.0F, 0.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.0436F));

		PartDefinition legL20 = Body8.addOrReplaceChild("legL20", CubeListBuilder.create().texOffs(0, 30).addBox(-7.25F, 0.0F, -0.5F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.3F, 1.65F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r18 = legL20.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(17, 28).addBox(-7.25F, 0.0F, 0.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0436F));

		PartDefinition Body9 = Body8.addOrReplaceChild("Body9", CubeListBuilder.create().texOffs(0, 77).addBox(-1.5F, 0.1F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(17, 76).addBox(-1.5F, 0.2F, 0.55F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.25F, 0.0F, 0.1309F, 0.0F));

		PartDefinition legL9 = Body9.addOrReplaceChild("legL9", CubeListBuilder.create().texOffs(0, 65).addBox(0.25F, 0.0F, -0.5F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 0.3F, 1.65F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r19 = legL9.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 62).addBox(0.25F, 0.0F, 0.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.0436F));

		PartDefinition legL21 = Body9.addOrReplaceChild("legL21", CubeListBuilder.create().texOffs(0, 27).addBox(-7.25F, 0.0F, -0.5F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.3F, 1.65F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r20 = legL21.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(17, 25).addBox(-7.25F, 0.0F, 0.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0436F));

		PartDefinition Body10 = Body9.addOrReplaceChild("Body10", CubeListBuilder.create().texOffs(75, 39).addBox(-1.5F, 0.1F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(75, 36).addBox(-1.5F, 0.2F, 0.65F, 3.0F, 0.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.25F, 0.0F, 0.1309F, 0.0F));

		PartDefinition legL10 = Body10.addOrReplaceChild("legL10", CubeListBuilder.create().texOffs(0, 59).addBox(0.25F, 0.0F, -0.5F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 0.3F, 1.65F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r21 = legL10.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 56).addBox(0.25F, 0.0F, 0.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.0436F));

		PartDefinition legL22 = Body10.addOrReplaceChild("legL22", CubeListBuilder.create().texOffs(0, 24).addBox(-7.25F, 0.0F, -0.5F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.3F, 1.65F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r22 = legL22.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(21, 22).addBox(-7.25F, 0.0F, 0.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0436F));

		PartDefinition Body11 = Body10.addOrReplaceChild("Body11", CubeListBuilder.create().texOffs(75, 19).addBox(-1.5F, 0.1F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(75, 28).addBox(-1.5F, 0.2F, 0.65F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.25F, 0.0F, 0.2182F, 0.0F));

		PartDefinition legL11 = Body11.addOrReplaceChild("legL11", CubeListBuilder.create().texOffs(0, 53).addBox(0.25F, 0.0F, -0.5F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 0.3F, 1.65F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r23 = legL11.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 50).addBox(0.25F, 0.0F, 0.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.0436F));

		PartDefinition legL23 = Body11.addOrReplaceChild("legL23", CubeListBuilder.create().texOffs(18, 18).addBox(-7.25F, 0.0F, -0.5F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.3F, 1.65F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r24 = legL23.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(18, 13).addBox(-7.25F, 0.0F, 0.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0436F));

		PartDefinition Body12 = Body11.addOrReplaceChild("Body12", CubeListBuilder.create().texOffs(75, 25).addBox(-1.5F, 0.1F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(75, 22).addBox(-1.5F, 0.2F, 0.65F, 3.0F, 0.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.25F, 0.0F, 0.1745F, 0.0F));

		PartDefinition legL12 = Body12.addOrReplaceChild("legL12", CubeListBuilder.create().texOffs(17, 69).addBox(0.25F, 0.0F, -0.5F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 0.3F, 1.65F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r25 = legL12.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(17, 66).addBox(0.25F, 0.0F, 0.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.0436F));

		PartDefinition legL24 = Body12.addOrReplaceChild("legL24", CubeListBuilder.create().texOffs(17, 51).addBox(-6.25F, 0.0F, -0.5F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 0.3F, 1.65F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r26 = legL24.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(17, 48).addBox(-6.25F, 0.0F, 0.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0436F));

		PartDefinition Telson = Body12.addOrReplaceChild("Telson", CubeListBuilder.create().texOffs(11, 85).addBox(-1.5F, 0.15F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.25F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r27 = Telson.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(33, 13).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 2.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r28 = Telson.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(32, 39).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 2.0F, 0.0F, -0.5236F, 0.0F));

		return LayerDefinition.create(meshdefinition, 180, 90);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}