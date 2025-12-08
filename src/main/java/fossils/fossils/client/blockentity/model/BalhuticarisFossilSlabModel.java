package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BalhuticarisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Body;
	private final ModelPart eyeL;
	private final ModelPart antennaR;
	private final ModelPart Body2;
	private final ModelPart legL15;
	private final ModelPart Body3;
	private final ModelPart legL21;
	private final ModelPart Body4;
	private final ModelPart legL23;
	private final ModelPart legL25;
	private final ModelPart Body5;
	private final ModelPart legL27;
	private final ModelPart legL29;
	private final ModelPart Body6;
	private final ModelPart legL31;
	private final ModelPart legL33;
	private final ModelPart Body7;
	private final ModelPart legL35;
	private final ModelPart legL37;
	private final ModelPart Body8;
	private final ModelPart legL39;
	private final ModelPart legL41;
	private final ModelPart Body9;
	private final ModelPart legL43;
	private final ModelPart legL45;
	private final ModelPart Body10;
	private final ModelPart legL47;
	private final ModelPart legL49;
	private final ModelPart Body11;
	private final ModelPart legL51;
	private final ModelPart legL53;
	private final ModelPart Body12;
	private final ModelPart legL55;
	private final ModelPart legL57;
	private final ModelPart Body13;
	private final ModelPart legL59;
	private final ModelPart legL61;
	private final ModelPart Body14;
	private final ModelPart legL63;
	private final ModelPart legL65;
	private final ModelPart Body15;
	private final ModelPart legL67;
	private final ModelPart legL69;
	private final ModelPart Body16;
	private final ModelPart legL71;
	private final ModelPart legL73;
	private final ModelPart Body17;
	private final ModelPart legL75;
	private final ModelPart legL77;
	private final ModelPart Body18;
	private final ModelPart legL79;
	private final ModelPart legL81;
	private final ModelPart Body19;
	private final ModelPart legL83;
	private final ModelPart legL85;
	private final ModelPart Body20;
	private final ModelPart legL87;
	private final ModelPart legL89;
	private final ModelPart Body21;
	private final ModelPart legL91;
	private final ModelPart legL93;
	private final ModelPart Body22;
	private final ModelPart legL95;
	private final ModelPart legL97;
	private final ModelPart Body23;
	private final ModelPart legL99;
	private final ModelPart Body24;
	private final ModelPart legL103;
	private final ModelPart legL105;
	private final ModelPart Body25;
	private final ModelPart telson;

	public BalhuticarisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Body = this.fossil.getChild("Body");
		this.eyeL = this.Body.getChild("eyeL");
		this.antennaR = this.Body.getChild("antennaR");
		this.Body2 = this.Body.getChild("Body2");
		this.legL15 = this.Body2.getChild("legL15");
		this.Body3 = this.Body2.getChild("Body3");
		this.legL21 = this.Body3.getChild("legL21");
		this.Body4 = this.Body3.getChild("Body4");
		this.legL23 = this.Body4.getChild("legL23");
		this.legL25 = this.Body4.getChild("legL25");
		this.Body5 = this.Body4.getChild("Body5");
		this.legL27 = this.Body5.getChild("legL27");
		this.legL29 = this.Body5.getChild("legL29");
		this.Body6 = this.Body5.getChild("Body6");
		this.legL31 = this.Body6.getChild("legL31");
		this.legL33 = this.Body6.getChild("legL33");
		this.Body7 = this.Body6.getChild("Body7");
		this.legL35 = this.Body7.getChild("legL35");
		this.legL37 = this.Body7.getChild("legL37");
		this.Body8 = this.Body7.getChild("Body8");
		this.legL39 = this.Body8.getChild("legL39");
		this.legL41 = this.Body8.getChild("legL41");
		this.Body9 = this.Body8.getChild("Body9");
		this.legL43 = this.Body9.getChild("legL43");
		this.legL45 = this.Body9.getChild("legL45");
		this.Body10 = this.Body9.getChild("Body10");
		this.legL47 = this.Body10.getChild("legL47");
		this.legL49 = this.Body10.getChild("legL49");
		this.Body11 = this.Body10.getChild("Body11");
		this.legL51 = this.Body11.getChild("legL51");
		this.legL53 = this.Body11.getChild("legL53");
		this.Body12 = this.Body11.getChild("Body12");
		this.legL55 = this.Body12.getChild("legL55");
		this.legL57 = this.Body12.getChild("legL57");
		this.Body13 = this.Body12.getChild("Body13");
		this.legL59 = this.Body13.getChild("legL59");
		this.legL61 = this.Body13.getChild("legL61");
		this.Body14 = this.Body13.getChild("Body14");
		this.legL63 = this.Body14.getChild("legL63");
		this.legL65 = this.Body14.getChild("legL65");
		this.Body15 = this.Body14.getChild("Body15");
		this.legL67 = this.Body15.getChild("legL67");
		this.legL69 = this.Body15.getChild("legL69");
		this.Body16 = this.Body15.getChild("Body16");
		this.legL71 = this.Body16.getChild("legL71");
		this.legL73 = this.Body16.getChild("legL73");
		this.Body17 = this.Body16.getChild("Body17");
		this.legL75 = this.Body17.getChild("legL75");
		this.legL77 = this.Body17.getChild("legL77");
		this.Body18 = this.Body17.getChild("Body18");
		this.legL79 = this.Body18.getChild("legL79");
		this.legL81 = this.Body18.getChild("legL81");
		this.Body19 = this.Body18.getChild("Body19");
		this.legL83 = this.Body19.getChild("legL83");
		this.legL85 = this.Body19.getChild("legL85");
		this.Body20 = this.Body19.getChild("Body20");
		this.legL87 = this.Body20.getChild("legL87");
		this.legL89 = this.Body20.getChild("legL89");
		this.Body21 = this.Body20.getChild("Body21");
		this.legL91 = this.Body21.getChild("legL91");
		this.legL93 = this.Body21.getChild("legL93");
		this.Body22 = this.Body21.getChild("Body22");
		this.legL95 = this.Body22.getChild("legL95");
		this.legL97 = this.Body22.getChild("legL97");
		this.Body23 = this.Body22.getChild("Body23");
		this.legL99 = this.Body23.getChild("legL99");
		this.Body24 = this.Body23.getChild("Body24");
		this.legL103 = this.Body24.getChild("legL103");
		this.legL105 = this.Body24.getChild("legL105");
		this.Body25 = this.Body24.getChild("Body25");
		this.telson = this.Body25.getChild("telson");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 40).addBox(-10.0F, -1.0F, -23.0F, 20.0F, 1.0F, 33.0F, new CubeDeformation(0.004F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-20.0858F, -0.5F, -38.006F, 20.0F, 1.0F, 38.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.9F, -0.5F, 16.3F, 0.0F, 0.1833F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(74, 40).addBox(-8.6F, -0.5F, -5.1F, 20.0F, 1.0F, 19.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, 10.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition Body = fossil.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(17, 6).addBox(-1.2F, -3.7097F, -1.4217F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.25F, -1.9347F, -3.6717F, 0.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, -2.5403F, -11.9783F, -0.1745F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.1F, -0.05F, -2.95F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -3.6597F, -1.4217F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 21).addBox(-1.4F, -1.2F, -2.8F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5597F, -1.2217F, 0.3927F, 0.0F, 0.0F));

		PartDefinition eyeL = Body.addOrReplaceChild("eyeL", CubeListBuilder.create().texOffs(4, 0).addBox(-0.9F, -0.5F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3097F, -2.7217F, 0.2618F, 0.0F, 0.0F));

		PartDefinition antennaR = Body.addOrReplaceChild("antennaR", CubeListBuilder.create().texOffs(28, 28).addBox(-0.5F, -0.6F, -2.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -0.3097F, -2.9717F, 0.0F, 1.1345F, -1.5708F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(33, 31).addBox(-1.4F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3097F, 4.2783F, 0.0436F, 0.0F, 0.0F));

		PartDefinition legL15 = Body2.addOrReplaceChild("legL15", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 2.0F, 0.0F, -1.5708F, -1.5272F, 1.5708F));

		PartDefinition cube_r5 = legL15.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(3, 28).addBox(-0.041F, -0.001F, 0.0399F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0698F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create().texOffs(21, 0).addBox(-1.35F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition legL21 = Body3.addOrReplaceChild("legL21", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 2.0F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r6 = legL21.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 22).addBox(-0.541F, -0.001F, 0.0399F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0785F));

		PartDefinition Body4 = Body3.addOrReplaceChild("Body4", CubeListBuilder.create().texOffs(33, 23).addBox(-1.4F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition legL23 = Body4.addOrReplaceChild("legL23", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, 2.0F, 0.0F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition cube_r7 = legL23.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(26, 0).addBox(-0.541F, -0.001F, 0.0399F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0349F));

		PartDefinition legL25 = Body4.addOrReplaceChild("legL25", CubeListBuilder.create().texOffs(27, 22).addBox(-0.541F, -0.001F, 0.0399F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, 2.0F, 0.5F, 1.5708F, -1.5359F, -1.5708F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create().texOffs(35, 19).addBox(-1.35F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition legL27 = Body5.addOrReplaceChild("legL27", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1F, 2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r8 = legL27.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 28).addBox(-0.541F, -0.001F, 0.1399F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1396F));

		PartDefinition legL29 = Body5.addOrReplaceChild("legL29", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, 2.0F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r9 = legL29.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(9, 21).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Body6 = Body5.addOrReplaceChild("Body6", CubeListBuilder.create().texOffs(33, 5).addBox(-1.4F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition legL31 = Body6.addOrReplaceChild("legL31", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4F, 2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r10 = legL31.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(12, 22).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition legL33 = Body6.addOrReplaceChild("legL33", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, 2.0F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r11 = legL33.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(21, 22).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Body7 = Body6.addOrReplaceChild("Body7", CubeListBuilder.create().texOffs(24, 7).addBox(-1.35F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition legL35 = Body7.addOrReplaceChild("legL35", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r12 = legL35.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(18, 22).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition legL37 = Body7.addOrReplaceChild("legL37", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, 2.0F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r13 = legL37.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(15, 22).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create().texOffs(32, 18).addBox(-1.4F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition legL39 = Body8.addOrReplaceChild("legL39", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 1.75F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r14 = legL39.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 30).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition legL41 = Body8.addOrReplaceChild("legL41", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 1.75F, 0.5F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition Body9 = Body8.addOrReplaceChild("Body9", CubeListBuilder.create().texOffs(35, 0).addBox(-1.35F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition legL43 = Body9.addOrReplaceChild("legL43", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 1.75F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r15 = legL43.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(29, 15).addBox(-0.5F, 0.0F, -0.02F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition legL45 = Body9.addOrReplaceChild("legL45", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 1.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Body10 = Body9.addOrReplaceChild("Body10", CubeListBuilder.create().texOffs(32, 13).addBox(-1.4F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition legL47 = Body10.addOrReplaceChild("legL47", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 1.75F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r16 = legL47.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(9, 29).addBox(-0.5F, 0.0F, -0.03F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition legL49 = Body10.addOrReplaceChild("legL49", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 1.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r17 = legL49.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5F, 0.0F, -0.002F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition Body11 = Body10.addOrReplaceChild("Body11", CubeListBuilder.create().texOffs(32, 0).addBox(-1.35F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition legL51 = Body11.addOrReplaceChild("legL51", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 1.75F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r18 = legL51.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(30, 7).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition legL53 = Body11.addOrReplaceChild("legL53", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4F, 1.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r19 = legL53.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(6, 28).addBox(-0.5F, 0.0F, -0.08F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition Body12 = Body11.addOrReplaceChild("Body12", CubeListBuilder.create().texOffs(30, 31).addBox(-1.4F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition legL55 = Body12.addOrReplaceChild("legL55", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, 1.75F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition legL57 = Body12.addOrReplaceChild("legL57", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, 1.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r20 = legL57.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(17, 6).addBox(-0.5F, 0.0F, 0.11F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Body13 = Body12.addOrReplaceChild("Body13", CubeListBuilder.create().texOffs(9, 0).addBox(-1.35F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition legL59 = Body13.addOrReplaceChild("legL59", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, 1.75F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition legL61 = Body13.addOrReplaceChild("legL61", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 1.75F, 0.5F, -1.5708F, -1.3963F, 1.5708F));

		PartDefinition cube_r21 = legL61.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(20, 6).addBox(-0.5F, 0.0F, 0.03F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Body14 = Body13.addOrReplaceChild("Body14", CubeListBuilder.create().texOffs(35, 14).addBox(-1.4F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition legL63 = Body14.addOrReplaceChild("legL63", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, 1.75F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition legL65 = Body14.addOrReplaceChild("legL65", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 1.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Body15 = Body14.addOrReplaceChild("Body15", CubeListBuilder.create().texOffs(27, 31).addBox(-1.35F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition legL67 = Body15.addOrReplaceChild("legL67", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, 1.75F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r22 = legL67.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(15, 30).addBox(-0.7F, 0.0F, 0.08F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition legL69 = Body15.addOrReplaceChild("legL69", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 1.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r23 = legL69.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(24, 15).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Body16 = Body15.addOrReplaceChild("Body16", CubeListBuilder.create().texOffs(24, 30).addBox(-1.4F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition legL71 = Body16.addOrReplaceChild("legL71", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 1.75F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition legL73 = Body16.addOrReplaceChild("legL73", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, 1.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r24 = legL73.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(15, 40).addBox(-0.5F, 0.0F, 0.09F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Body17 = Body16.addOrReplaceChild("Body17", CubeListBuilder.create().texOffs(35, 9).addBox(-1.35F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition legL75 = Body17.addOrReplaceChild("legL75", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, 1.75F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r25 = legL75.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(9, 40).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition legL77 = Body17.addOrReplaceChild("legL77", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 1.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Body18 = Body17.addOrReplaceChild("Body18", CubeListBuilder.create().texOffs(30, 22).addBox(-1.4F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition legL79 = Body18.addOrReplaceChild("legL79", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 1.75F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r26 = legL79.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(6, 40).addBox(-0.5F, 0.0F, -0.02F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition legL81 = Body18.addOrReplaceChild("legL81", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 1.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Body19 = Body18.addOrReplaceChild("Body19", CubeListBuilder.create().texOffs(21, 30).addBox(-1.35F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition legL83 = Body19.addOrReplaceChild("legL83", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3F, 1.75F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r27 = legL83.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(3, 40).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition legL85 = Body19.addOrReplaceChild("legL85", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, 1.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r28 = legL85.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, 0.0F, 0.13F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Body20 = Body19.addOrReplaceChild("Body20", CubeListBuilder.create().texOffs(18, 30).addBox(-1.4F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition legL87 = Body20.addOrReplaceChild("legL87", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.75F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition legL89 = Body20.addOrReplaceChild("legL89", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4F, 1.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r29 = legL89.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(35, 28).addBox(-0.5F, -0.5F, -0.03F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Body21 = Body20.addOrReplaceChild("Body21", CubeListBuilder.create().texOffs(12, 40).addBox(-1.05F, -0.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.0F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition legL91 = Body21.addOrReplaceChild("legL91", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, 1.75F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition legL93 = Body21.addOrReplaceChild("legL93", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, 1.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Body22 = Body21.addOrReplaceChild("Body22", CubeListBuilder.create().texOffs(27, 8).addBox(-1.0F, -0.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.0F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition legL95 = Body22.addOrReplaceChild("legL95", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, 1.75F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r30 = legL95.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(21, 35).addBox(-0.5F, 0.0F, 0.2F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition legL97 = Body22.addOrReplaceChild("legL97", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, 1.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Body23 = Body22.addOrReplaceChild("Body23", CubeListBuilder.create().texOffs(5, 21).addBox(-0.98F, -0.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition legL99 = Body23.addOrReplaceChild("legL99", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, 1.75F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r31 = legL99.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(15, 35).addBox(-0.5F, 0.0F, -0.04F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Body24 = Body23.addOrReplaceChild("Body24", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -0.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition legL103 = Body24.addOrReplaceChild("legL103", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, 1.75F, 0.0F, -1.5708F, -1.3963F, 1.5708F));

		PartDefinition cube_r32 = legL103.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(18, 35).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition legL105 = Body24.addOrReplaceChild("legL105", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, 1.75F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r33 = legL105.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(6, 35).addBox(-0.5F, 0.0F, -0.02F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Body25 = Body24.addOrReplaceChild("Body25", CubeListBuilder.create().texOffs(18, 40).addBox(-0.97F, -0.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition telson = Body25.addOrReplaceChild("telson", CubeListBuilder.create().texOffs(0, 0).addBox(-0.9F, -0.5F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 35).addBox(-1.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.9F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r34 = telson.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(9, 0).addBox(-2.2F, -1.2F, 0.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.1F, 0.0F, 0.0F, -0.6109F, -1.5708F));

		PartDefinition cube_r35 = telson.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(12, 16).addBox(-0.8F, 1.2F, 0.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.1F, 0.0F, 0.0F, 0.2618F, 1.5708F));

		return LayerDefinition.create(meshdefinition, 160, 100);
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