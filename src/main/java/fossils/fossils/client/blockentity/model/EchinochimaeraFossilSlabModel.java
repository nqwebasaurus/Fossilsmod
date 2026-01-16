package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EchinochimaeraFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart female;
	private final ModelPart body2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart head2;
	private final ModelPart femalehead2;
	private final ModelPart femalecube_r1;
	private final ModelPart femalecube_r2;
	private final ModelPart femalecube_r3;
	private final ModelPart femalecube_r4;
	private final ModelPart femalecube_r5;
	private final ModelPart femalehorn3;
	private final ModelPart femalecube_r6;
	private final ModelPart eye3;
	private final ModelPart cube_r5;
	private final ModelPart femalejaw2;
	private final ModelPart femalejaw_r1;
	private final ModelPart femalejaw_r2;
	private final ModelPart frontleftfin2;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart femalebody2;
	private final ModelPart femalecube_r7;
	private final ModelPart femalecube_r8;
	private final ModelPart femalecube_r9;
	private final ModelPart dorsalfemale3;
	private final ModelPart cube_r8;
	private final ModelPart cube_r9;
	private final ModelPart dorsalfemale4;
	private final ModelPart cube_r10;
	private final ModelPart tailfemale4;
	private final ModelPart cube_r11;
	private final ModelPart cube_r12;
	private final ModelPart backleftfinfemale2;
	private final ModelPart cube_r13;
	private final ModelPart tailfemale5;
	private final ModelPart cube_r14;
	private final ModelPart tailfemale6;
	private final ModelPart cube_r15;
	private final ModelPart cube_r16;
	private final ModelPart cube_r17;
	private final ModelPart cube_r18;
	private final ModelPart male;
	private final ModelPart body;
	private final ModelPart cube_r19;
	private final ModelPart head;
	private final ModelPart malehead;
	private final ModelPart malecube_r1;
	private final ModelPart malecube_r2;
	private final ModelPart malecube_r3;
	private final ModelPart malecube_r4;
	private final ModelPart malecube_r5;
	private final ModelPart hornmale2;
	private final ModelPart cube_r20;
	private final ModelPart cube_r21;
	private final ModelPart cube_r22;
	private final ModelPart cube_r23;
	private final ModelPart cube_r24;
	private final ModelPart eye2;
	private final ModelPart malejaw;
	private final ModelPart malejaw_r1;
	private final ModelPart frontrightfin;
	private final ModelPart malebody;
	private final ModelPart malecube_r6;
	private final ModelPart malecube_r7;
	private final ModelPart malecube_r8;
	private final ModelPart dorsalmale;
	private final ModelPart cube_r25;
	private final ModelPart tailmale;
	private final ModelPart cube_r26;
	private final ModelPart cube_r27;
	private final ModelPart tailmale2;
	private final ModelPart cube_r28;
	private final ModelPart tailmale3;
	private final ModelPart cube_r29;
	private final ModelPart cube_r30;
	private final ModelPart tailmale4;
	private final ModelPart cube_r31;
	private final ModelPart horn2;
	private final ModelPart cube_r32;
	private final ModelPart dorsalmale2;
	private final ModelPart cube_r33;
	private final ModelPart cube_r34;
	private final ModelPart backrightfinmale;
	private final ModelPart cube_r35;
	private final ModelPart cube_r36;
	private final ModelPart cube_r37;

	public EchinochimaeraFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.cube_r1 = this.fossil.getChild("cube_r1");
		this.cube_r2 = this.fossil.getChild("cube_r2");
		this.female = this.fossil.getChild("female");
		this.body2 = this.female.getChild("body2");
		this.cube_r3 = this.body2.getChild("cube_r3");
		this.cube_r4 = this.body2.getChild("cube_r4");
		this.head2 = this.body2.getChild("head2");
		this.femalehead2 = this.head2.getChild("femalehead2");
		this.femalecube_r1 = this.femalehead2.getChild("femalecube_r1");
		this.femalecube_r2 = this.femalehead2.getChild("femalecube_r2");
		this.femalecube_r3 = this.femalehead2.getChild("femalecube_r3");
		this.femalecube_r4 = this.femalehead2.getChild("femalecube_r4");
		this.femalecube_r5 = this.femalehead2.getChild("femalecube_r5");
		this.femalehorn3 = this.femalehead2.getChild("femalehorn3");
		this.femalecube_r6 = this.femalehorn3.getChild("femalecube_r6");
		this.eye3 = this.head2.getChild("eye3");
		this.cube_r5 = this.eye3.getChild("cube_r5");
		this.femalejaw2 = this.head2.getChild("femalejaw2");
		this.femalejaw_r1 = this.femalejaw2.getChild("femalejaw_r1");
		this.femalejaw_r2 = this.femalejaw2.getChild("femalejaw_r2");
		this.frontleftfin2 = this.body2.getChild("frontleftfin2");
		this.cube_r6 = this.frontleftfin2.getChild("cube_r6");
		this.cube_r7 = this.frontleftfin2.getChild("cube_r7");
		this.femalebody2 = this.body2.getChild("femalebody2");
		this.femalecube_r7 = this.femalebody2.getChild("femalecube_r7");
		this.femalecube_r8 = this.femalebody2.getChild("femalecube_r8");
		this.femalecube_r9 = this.femalebody2.getChild("femalecube_r9");
		this.dorsalfemale3 = this.body2.getChild("dorsalfemale3");
		this.cube_r8 = this.dorsalfemale3.getChild("cube_r8");
		this.cube_r9 = this.dorsalfemale3.getChild("cube_r9");
		this.dorsalfemale4 = this.body2.getChild("dorsalfemale4");
		this.cube_r10 = this.dorsalfemale4.getChild("cube_r10");
		this.tailfemale4 = this.body2.getChild("tailfemale4");
		this.cube_r11 = this.tailfemale4.getChild("cube_r11");
		this.cube_r12 = this.tailfemale4.getChild("cube_r12");
		this.backleftfinfemale2 = this.tailfemale4.getChild("backleftfinfemale2");
		this.cube_r13 = this.backleftfinfemale2.getChild("cube_r13");
		this.tailfemale5 = this.tailfemale4.getChild("tailfemale5");
		this.cube_r14 = this.tailfemale5.getChild("cube_r14");
		this.tailfemale6 = this.tailfemale5.getChild("tailfemale6");
		this.cube_r15 = this.tailfemale6.getChild("cube_r15");
		this.cube_r16 = this.tailfemale6.getChild("cube_r16");
		this.cube_r17 = this.tailfemale6.getChild("cube_r17");
		this.cube_r18 = this.tailfemale6.getChild("cube_r18");
		this.male = this.fossil.getChild("male");
		this.body = this.male.getChild("body");
		this.cube_r19 = this.body.getChild("cube_r19");
		this.head = this.body.getChild("head");
		this.malehead = this.head.getChild("malehead");
		this.malecube_r1 = this.malehead.getChild("malecube_r1");
		this.malecube_r2 = this.malehead.getChild("malecube_r2");
		this.malecube_r3 = this.malehead.getChild("malecube_r3");
		this.malecube_r4 = this.malehead.getChild("malecube_r4");
		this.malecube_r5 = this.malehead.getChild("malecube_r5");
		this.hornmale2 = this.malehead.getChild("hornmale2");
		this.cube_r20 = this.hornmale2.getChild("cube_r20");
		this.cube_r21 = this.hornmale2.getChild("cube_r21");
		this.cube_r22 = this.hornmale2.getChild("cube_r22");
		this.cube_r23 = this.hornmale2.getChild("cube_r23");
		this.cube_r24 = this.hornmale2.getChild("cube_r24");
		this.eye2 = this.head.getChild("eye2");
		this.malejaw = this.head.getChild("malejaw");
		this.malejaw_r1 = this.malejaw.getChild("malejaw_r1");
		this.frontrightfin = this.body.getChild("frontrightfin");
		this.malebody = this.body.getChild("malebody");
		this.malecube_r6 = this.malebody.getChild("malecube_r6");
		this.malecube_r7 = this.malebody.getChild("malecube_r7");
		this.malecube_r8 = this.malebody.getChild("malecube_r8");
		this.dorsalmale = this.body.getChild("dorsalmale");
		this.cube_r25 = this.dorsalmale.getChild("cube_r25");
		this.tailmale = this.body.getChild("tailmale");
		this.cube_r26 = this.tailmale.getChild("cube_r26");
		this.cube_r27 = this.tailmale.getChild("cube_r27");
		this.tailmale2 = this.tailmale.getChild("tailmale2");
		this.cube_r28 = this.tailmale2.getChild("cube_r28");
		this.tailmale3 = this.tailmale2.getChild("tailmale3");
		this.cube_r29 = this.tailmale3.getChild("cube_r29");
		this.cube_r30 = this.tailmale3.getChild("cube_r30");
		this.tailmale4 = this.tailmale3.getChild("tailmale4");
		this.cube_r31 = this.tailmale4.getChild("cube_r31");
		this.horn2 = this.tailmale.getChild("horn2");
		this.cube_r32 = this.horn2.getChild("cube_r32");
		this.dorsalmale2 = this.tailmale.getChild("dorsalmale2");
		this.cube_r33 = this.dorsalmale2.getChild("cube_r33");
		this.cube_r34 = this.dorsalmale2.getChild("cube_r34");
		this.backrightfinmale = this.tailmale.getChild("backrightfinmale");
		this.cube_r35 = this.backrightfinmale.getChild("cube_r35");
		this.cube_r36 = this.backrightfinmale.getChild("cube_r36");
		this.cube_r37 = this.backrightfinmale.getChild("cube_r37");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-13.0F, -2.0F, -23.0F, 32.0F, 2.0F, 34.0F, new CubeDeformation(0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(67, 39).addBox(-5.9497F, -2.0F, -35.7018F, 14.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.0F, 0.0F, 15.0F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 37).addBox(16.0F, -2.0F, 0.0F, 16.0F, 2.0F, 35.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-13.0F, 0.0F, -32.0F, 0.0F, -0.829F, 0.0F));

		PartDefinition female = fossil.addOrReplaceChild("female", CubeListBuilder.create(), PartPose.offset(3.0F, -20.75F, -16.0F));

		PartDefinition body2 = female.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 19.4392F, 2.9724F, -0.6981F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = body2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(26, 57).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2108F, 0.7224F, -2.9627F, 0.0F, 3.1416F));

		PartDefinition cube_r4 = body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.5F, -3.5F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 1.2108F, -0.7224F, 0.0F, 3.1416F, 0.0F));

		PartDefinition head2 = body2.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offset(-0.0042F, 0.1727F, -3.9918F));

		PartDefinition femalehead2 = head2.addOrReplaceChild("femalehead2", CubeListBuilder.create(), PartPose.offset(0.0042F, 0.2861F, -4.327F));

		PartDefinition femalecube_r1 = femalehead2.addOrReplaceChild("femalecube_r1", CubeListBuilder.create().texOffs(25, 48).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.2F, 0.9884F, 2.3682F, 0.0F, 3.1416F, 0.0F));

		PartDefinition femalecube_r2 = femalehead2.addOrReplaceChild("femalecube_r2", CubeListBuilder.create().texOffs(30, 45).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8256F, 1.1541F, 2.9671F, 0.0F, -3.1416F));

		PartDefinition femalecube_r3 = femalehead2.addOrReplaceChild("femalecube_r3", CubeListBuilder.create().texOffs(68, 47).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.5452F, 3.6419F, -2.9671F, 0.0F, 3.1416F));

		PartDefinition femalecube_r4 = femalehead2.addOrReplaceChild("femalecube_r4", CubeListBuilder.create().texOffs(18, 67).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.0528F, 1.4118F, 0.7418F, 0.0F, 3.1416F));

		PartDefinition femalecube_r5 = femalehead2.addOrReplaceChild("femalecube_r5", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5014F, 3.2324F, 2.8362F, 0.0F, -3.1416F));

		PartDefinition femalehorn3 = femalehead2.addOrReplaceChild("femalehorn3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2007F, 2.5287F, -0.6545F, 0.0F, 0.0F));

		PartDefinition femalecube_r6 = femalehorn3.addOrReplaceChild("femalecube_r6", CubeListBuilder.create().texOffs(13, 0).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.2195F, 0.1143F, 2.8362F, 0.0F, -3.1416F));

		PartDefinition eye3 = head2.addOrReplaceChild("eye3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1792F, -0.3618F, -1.7306F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r5 = eye3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(29, 10).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.925F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition femalejaw2 = head2.addOrReplaceChild("femalejaw2", CubeListBuilder.create(), PartPose.offset(0.0042F, 2.2808F, -1.5559F));

		PartDefinition femalejaw_r1 = femalejaw2.addOrReplaceChild("femalejaw_r1", CubeListBuilder.create().texOffs(21, 37).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.6871F, -0.9673F, -2.9976F, 0.0F, 3.1416F));

		PartDefinition femalejaw_r2 = femalejaw2.addOrReplaceChild("femalejaw_r2", CubeListBuilder.create().texOffs(30, 37).addBox(0.0F, -0.5F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.4628F, -0.982F, 0.0F, 3.1416F, 0.0F));

		PartDefinition frontleftfin2 = body2.addOrReplaceChild("frontleftfin2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4F, 2.8608F, -3.2974F, -0.6513F, 0.0F, 0.0F));

		PartDefinition cube_r6 = frontleftfin2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 0).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 2.75F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r7 = frontleftfin2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(27, 19).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0F, 1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition femalebody2 = body2.addOrReplaceChild("femalebody2", CubeListBuilder.create(), PartPose.offset(-0.5F, -1.3392F, -0.9724F));

		PartDefinition femalecube_r7 = femalebody2.addOrReplaceChild("femalecube_r7", CubeListBuilder.create().texOffs(0, 59).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 5.0198F, 1.6186F, 2.9234F, 0.0F, 3.1416F));

		PartDefinition femalecube_r8 = femalebody2.addOrReplaceChild("femalecube_r8", CubeListBuilder.create().texOffs(15, 29).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 5.2485F, -1.6478F, -3.0107F, 0.0F, -3.1416F));

		PartDefinition femalecube_r9 = femalebody2.addOrReplaceChild("femalecube_r9", CubeListBuilder.create().texOffs(28, 63).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.1539F, -1.6333F, 3.098F, 0.0F, 3.1416F));

		PartDefinition dorsalfemale3 = body2.addOrReplaceChild("dorsalfemale3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, -2.0392F, -2.4474F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r8 = dorsalfemale3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(17, 0).addBox(-0.2F, -4.5971F, -0.263F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r9 = dorsalfemale3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(21, 21).addBox(0.0F, -2.5F, -2.0F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2822F, 1.8124F, 0.0F, 3.1416F, 0.0F));

		PartDefinition dorsalfemale4 = body2.addOrReplaceChild("dorsalfemale4", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -1.8392F, 2.5526F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r10 = dorsalfemale4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(4, 45).addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 1.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition tailfemale4 = body2.addOrReplaceChild("tailfemale4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 0.2896F, 2.3244F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r11 = tailfemale4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(16, 52).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.4913F, 1.5122F, 2.6704F, 0.0F, -3.1416F));

		PartDefinition cube_r12 = tailfemale4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(7, 37).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -0.0287F, 1.9531F, 0.0F, 3.1416F, 0.0F));

		PartDefinition backleftfinfemale2 = tailfemale4.addOrReplaceChild("backleftfinfemale2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2F, 1.8949F, 0.5118F, -0.2867F, 0.0F, 0.0F));

		PartDefinition cube_r13 = backleftfinfemale2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(20, 45).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0F, 2.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition tailfemale5 = tailfemale4.addOrReplaceChild("tailfemale5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4787F, 3.4531F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tailfemale5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(11, 45).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0F, 2.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition tailfemale6 = tailfemale5.addOrReplaceChild("tailfemale6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, -0.4F, 3.65F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r15 = tailfemale6.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 47).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, 1.3151F, 1.4494F, 2.3998F, 0.0F, 3.1416F));

		PartDefinition cube_r16 = tailfemale6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(21, 55).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0477F, 2.1121F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r17 = tailfemale6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(16, 0).addBox(0.0F, -2.0F, -3.5F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.2522F, 5.8892F, 2.7925F, 0.0F, -3.1416F));

		PartDefinition cube_r18 = tailfemale6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(8, 0).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.3527F, 5.9182F, 2.9234F, 0.0F, 3.1416F));

		PartDefinition male = fossil.addOrReplaceChild("male", CubeListBuilder.create(), PartPose.offset(5.0F, 0.25F, -5.0F));

		PartDefinition body = male.addOrReplaceChild("body", CubeListBuilder.create().texOffs(8, 6).addBox(-1.9F, -1.2892F, -4.2224F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.0F, -0.8608F, 16.9724F, -2.8798F, 0.0F, 1.5708F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(14, 61).addBox(-1.2F, -0.0221F, 0.012F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0392F, -1.1724F, -0.1789F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(-0.2042F, 0.1727F, -3.9918F));

		PartDefinition malehead = head.addOrReplaceChild("malehead", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition malecube_r1 = malehead.addOrReplaceChild("malecube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.0087F, 0.0155F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0042F, -1.8118F, -2.6556F, 0.0262F, 0.0F, 0.0F));

		PartDefinition malecube_r2 = malehead.addOrReplaceChild("malecube_r2", CubeListBuilder.create().texOffs(68, 42).addBox(-1.0F, -1.4F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4958F, 3.2382F, -0.6806F, 0.0436F, 0.0F, 0.0F));

		PartDefinition malecube_r3 = malehead.addOrReplaceChild("malecube_r3", CubeListBuilder.create().texOffs(10, 20).addBox(-1.6F, -2.6F, -2.75F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0042F, 2.4882F, -1.4806F, 0.1745F, 0.0F, 0.0F));

		PartDefinition malecube_r4 = malehead.addOrReplaceChild("malecube_r4", CubeListBuilder.create().texOffs(6, 25).addBox(-1.5F, -2.9887F, 0.9758F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0042F, 0.4189F, -4.6388F, -0.6545F, 0.0F, 0.0F));

		PartDefinition malecube_r5 = malehead.addOrReplaceChild("malecube_r5", CubeListBuilder.create().texOffs(31, 24).addBox(-1.4F, -2.9887F, -0.0242F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0042F, 0.4189F, -4.6388F, -0.7374F, 0.0F, 0.0F));

		PartDefinition hornmale2 = malehead.addOrReplaceChild("hornmale2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3958F, -1.1118F, -0.4806F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hornmale2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 13).addBox(-0.425F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4864F, -1.9719F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hornmale2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.55F, -0.575F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -0.5579F, -1.391F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hornmale2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(4, 0).addBox(-0.3F, -0.9F, -1.675F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0073F, 0.3721F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r23 = hornmale2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(8, 0).addBox(-1.0F, -1.475F, -0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r24 = hornmale2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(31, 7).addBox(0.5F, -0.3F, -0.725F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.475F, -1.2565F, 0.3525F, 0.4625F, 0.0F, 0.0F));

		PartDefinition eye2 = head.addOrReplaceChild("eye2", CubeListBuilder.create().texOffs(0, 25).addBox(0.525F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1708F, -0.3618F, -1.7306F, 0.2182F, 0.0F, 0.0F));

		PartDefinition malejaw = head.addOrReplaceChild("malejaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0042F, 2.9308F, -1.5559F, 0.3491F, 0.0F, 0.0F));

		PartDefinition malejaw_r1 = malejaw.addOrReplaceChild("malejaw_r1", CubeListBuilder.create().texOffs(12, 37).addBox(-1.6F, -0.35F, -2.9F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3074F, 0.8753F, -0.0436F, 0.0F, 0.0F));

		PartDefinition frontrightfin = body.addOrReplaceChild("frontrightfin", CubeListBuilder.create().texOffs(27, 28).addBox(-0.1F, -0.5F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(7, 52).addBox(0.0F, -1.5F, 0.75F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 2.8608F, -3.2974F, -0.3022F, 0.0F, 0.0F));

		PartDefinition malebody = body.addOrReplaceChild("malebody", CubeListBuilder.create(), PartPose.offset(-0.5F, 3.7108F, -2.2224F));

		PartDefinition malecube_r6 = malebody.addOrReplaceChild("malecube_r6", CubeListBuilder.create().texOffs(11, 67).addBox(-0.9F, -0.6F, -2.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition malecube_r7 = malebody.addOrReplaceChild("malecube_r7", CubeListBuilder.create().texOffs(68, 37).addBox(-1.3F, -0.75F, -3.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.05F, 1.25F, 0.1309F, 0.0F, 0.0F));

		PartDefinition malecube_r8 = malebody.addOrReplaceChild("malecube_r8", CubeListBuilder.create().texOffs(9, 59).addBox(-0.8F, -1.0131F, -0.0149F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.5F, 0.975F, 0.1222F, 0.0F, 0.0F));

		PartDefinition dorsalmale = body.addOrReplaceChild("dorsalmale", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, -2.0392F, -1.2474F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r25 = dorsalmale.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(23, 63).addBox(0.3F, -5.5971F, -0.263F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 37).addBox(0.6F, -5.5221F, 0.737F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tailmale = body.addOrReplaceChild("tailmale", CubeListBuilder.create().texOffs(25, 37).addBox(-1.5F, -1.5287F, -0.2969F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 1.1396F, 2.3994F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tailmale.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(16, 21).addBox(-0.5F, -0.9029F, -0.0997F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 2.3713F, 0.1031F, 0.528F, 0.0F, 0.0F));

		PartDefinition cube_r27 = tailmale.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(7, 65).addBox(-0.5F, -0.125F, 0.4F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, -2.5287F, -0.2969F, -0.3403F, 0.0F, 0.0F));

		PartDefinition tailmale2 = tailmale.addOrReplaceChild("tailmale2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, -0.6169F, 3.4949F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r28 = tailmale2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(24, 12).addBox(0.5F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.9118F, -0.5417F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tailmale3 = tailmale2.addOrReplaceChild("tailmale3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, -0.4764F, 3.2007F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r29 = tailmale3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 65).addBox(-0.4F, -0.7F, -1.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8067F, 1.3848F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r30 = tailmale3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(8, 29).addBox(1.5F, 0.3F, -0.6F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.8604F, 0.2576F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tailmale4 = tailmale3.addOrReplaceChild("tailmale4", CubeListBuilder.create(), PartPose.offset(-0.1F, -0.5221F, 3.7158F));

		PartDefinition cube_r31 = tailmale4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 13).addBox(1.7F, -0.7F, 2.7F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(1.5F, 0.3F, 2.35F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.3383F, -3.4582F, 0.1309F, 0.0F, 0.0F));

		PartDefinition horn2 = tailmale.addOrReplaceChild("horn2", CubeListBuilder.create(), PartPose.offset(0.2F, 9.4713F, -3.5469F));

		PartDefinition cube_r32 = horn2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(4, 13).addBox(-0.075F, 0.375F, 0.35F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 12).addBox(-0.125F, -0.075F, -0.125F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 0).addBox(-0.15F, -0.475F, -0.625F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 19).addBox(-0.2F, -0.875F, -1.125F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, -11.3124F, 4.7792F, 0.288F, 0.0F, 0.0F));

		PartDefinition dorsalmale2 = tailmale.addOrReplaceChild("dorsalmale2", CubeListBuilder.create(), PartPose.offset(-0.6F, -2.5287F, -0.2969F));

		PartDefinition cube_r33 = dorsalmale2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(16, 37).addBox(0.0F, -1.425F, -2.05F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0879F, 2.677F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r34 = dorsalmale2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(12, 29).addBox(-0.2F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.25F, 0.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition backrightfinmale = tailmale.addOrReplaceChild("backrightfinmale", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.375F, 1.0713F, 0.6031F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r35 = backrightfinmale.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(17, 13).addBox(0.025F, 0.5932F, -0.4195F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.4863F, 0.8611F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r36 = backrightfinmale.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 51).addBox(0.0F, -1.0F, -0.75F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 1.1927F, 0.7599F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r37 = backrightfinmale.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(21, 21).addBox(0.25F, -0.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.1897F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 176, 80);
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