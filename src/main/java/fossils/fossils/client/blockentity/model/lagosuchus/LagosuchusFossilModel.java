package fossils.fossils.client.blockentity.model.lagosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LagosuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Lagosuchus;
	private final ModelPart Body;
	private final ModelPart Body2;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart RArm;
	private final ModelPart RArm2;
	private final ModelPart RHand;
	private final ModelPart RArm3;
	private final ModelPart RArm4;
	private final ModelPart RHand2;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart RLeg;
	private final ModelPart RLeg2;
	private final ModelPart RLeg3;
	private final ModelPart RFoot;
	private final ModelPart RLeg4;
	private final ModelPart RLeg5;
	private final ModelPart RLeg6;
	private final ModelPart RFoot2;

	public LagosuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Lagosuchus = this.fossil.getChild("Lagosuchus");
		this.Body = this.Lagosuchus.getChild("Body");
		this.Body2 = this.Body.getChild("Body2");
		this.Neck = this.Body2.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Head = this.Neck3.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.RArm = this.Body2.getChild("RArm");
		this.RArm2 = this.RArm.getChild("RArm2");
		this.RHand = this.RArm2.getChild("RHand");
		this.RArm3 = this.Body2.getChild("RArm3");
		this.RArm4 = this.RArm3.getChild("RArm4");
		this.RHand2 = this.RArm4.getChild("RHand2");
		this.Tail = this.Lagosuchus.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.RLeg = this.Lagosuchus.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RLeg3 = this.RLeg2.getChild("RLeg3");
		this.RFoot = this.RLeg3.getChild("RFoot");
		this.RLeg4 = this.Lagosuchus.getChild("RLeg4");
		this.RLeg5 = this.RLeg4.getChild("RLeg5");
		this.RLeg6 = this.RLeg5.getChild("RLeg6");
		this.RFoot2 = this.RLeg6.getChild("RFoot2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Lagosuchus = fossil.addOrReplaceChild("Lagosuchus", CubeListBuilder.create().texOffs(44, 42).addBox(-0.5F, -0.7891F, -2.2147F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F))
				.texOffs(7, 39).addBox(0.5F, -0.7891F, -0.5147F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F))
				.texOffs(7, 39).mirror().addBox(-1.5F, -0.7891F, -0.5147F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false)
				.texOffs(54, 61).addBox(0.0F, -1.7891F, -1.2147F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 61).addBox(0.0F, -1.6891F, 0.7853F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 61).addBox(0.0F, -1.5891F, 2.7853F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -26.0F, -2.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Lagosuchus.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(38, 48).mirror().addBox(0.0F, -0.2697F, -0.1383F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 1.7114F, 0.7592F, -1.1571F, 0.1335F, -0.3695F));

		PartDefinition cube_r2 = Lagosuchus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 37).mirror().addBox(0.0F, -0.245F, 0.3885F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 1.7114F, 0.7592F, -0.6685F, 0.1335F, -0.3695F));

		PartDefinition cube_r3 = Lagosuchus.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 33).mirror().addBox(-0.5F, -1.0627F, -0.9657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false)
				.texOffs(13, 33).addBox(3.7F, -1.0627F, -0.9657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(-2.1F, -0.7886F, 2.3592F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Lagosuchus.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(8, 45).mirror().addBox(0.0F, 0.9007F, 0.72F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.023F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 1.7114F, 0.7592F, -0.3194F, 0.1335F, -0.3695F));

		PartDefinition cube_r5 = Lagosuchus.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(58, 40).mirror().addBox(0.0F, -0.8736F, -0.7646F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 1.7114F, 0.7592F, -1.1048F, 0.1335F, -0.3695F));

		PartDefinition cube_r6 = Lagosuchus.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(21, 45).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.197F, 6.0826F, -3.1186F, 0.5934F, 0.0F, -0.384F));

		PartDefinition cube_r7 = Lagosuchus.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 24).mirror().addBox(-0.5F, -1.6F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.017F)).mirror(false)
				.texOffs(22, 24).addBox(3.7F, -1.6F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(-2.1F, 1.5644F, -0.5675F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Lagosuchus.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(22, 31).mirror().addBox(-0.3F, 3.1139F, -1.8057F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 1.4114F, -1.9408F, 0.1396F, 0.0F, -0.384F));

		PartDefinition cube_r9 = Lagosuchus.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.1647F, -0.2013F, -0.2174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(-0.397F, 6.4826F, -3.0186F, 1.309F, 0.0F, -0.384F));

		PartDefinition cube_r10 = Lagosuchus.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(30, 24).mirror().addBox(-0.3F, 2.2495F, -0.6794F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 1.4114F, -1.9408F, -0.192F, 0.0F, -0.384F));

		PartDefinition cube_r11 = Lagosuchus.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(25, 0).mirror().addBox(-0.3F, -0.321F, -0.466F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 1.4114F, -1.9408F, -0.2793F, 0.0F, -0.384F));

		PartDefinition cube_r12 = Lagosuchus.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(31, 0).mirror().addBox(-0.5F, -0.0167F, -0.0693F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false)
				.texOffs(31, 0).addBox(3.7F, -0.0167F, -0.0693F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-2.1F, -0.0886F, -0.6408F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Lagosuchus.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(10, 8).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.024F)).mirror(false)
				.texOffs(10, 8).addBox(3.7F, -0.1F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(-2.1F, -0.8886F, 0.7592F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Lagosuchus.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(30, 31).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false)
				.texOffs(30, 31).addBox(3.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(-2.1F, -0.9123F, -0.7024F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Lagosuchus.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(54, 27).mirror().addBox(-0.5F, -0.0117F, -0.0194F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.023F)).mirror(false)
				.texOffs(54, 27).addBox(3.7F, -0.0117F, -0.0194F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(-2.1F, -1.7886F, 1.3592F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Lagosuchus.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-0.5F, 0.0151F, -0.5636F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false)
				.texOffs(0, 39).addBox(3.7F, 0.0151F, -0.5636F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-2.1F, -1.3886F, -0.0408F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Lagosuchus.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(25, 0).addBox(-0.7F, -0.321F, -0.466F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3F, 1.4114F, -1.9408F, -0.2793F, 0.0F, 0.384F));

		PartDefinition cube_r18 = Lagosuchus.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(22, 31).addBox(-0.7F, 3.1139F, -1.8057F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3F, 1.4114F, -1.9408F, 0.1396F, 0.0F, 0.384F));

		PartDefinition cube_r19 = Lagosuchus.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 45).addBox(-0.8353F, -0.2013F, -0.2174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(0.397F, 6.4826F, -3.0186F, 1.309F, 0.0F, 0.384F));

		PartDefinition cube_r20 = Lagosuchus.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(21, 45).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.197F, 6.0826F, -3.1186F, 0.5934F, 0.0F, 0.384F));

		PartDefinition cube_r21 = Lagosuchus.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(30, 24).addBox(-0.7F, 2.2495F, -0.6794F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.3F, 1.4114F, -1.9408F, -0.192F, 0.0F, 0.384F));

		PartDefinition cube_r22 = Lagosuchus.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(38, 48).addBox(-1.0F, -0.2697F, -0.1383F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(2.3F, 1.7114F, 0.7592F, -1.1571F, -0.1335F, 0.3695F));

		PartDefinition cube_r23 = Lagosuchus.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(8, 45).addBox(-1.0F, 0.9007F, 0.72F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.023F)), PartPose.offsetAndRotation(2.3F, 1.7114F, 0.7592F, -0.3194F, -0.1335F, 0.3695F));

		PartDefinition cube_r24 = Lagosuchus.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(50, 37).addBox(-1.0F, -0.245F, 0.3885F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(2.3F, 1.7114F, 0.7592F, -0.6685F, -0.1335F, 0.3695F));

		PartDefinition cube_r25 = Lagosuchus.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(58, 40).addBox(-1.0F, -0.8736F, -0.7646F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(2.3F, 1.7114F, 0.7592F, -1.1048F, -0.1335F, 0.3695F));

		PartDefinition Body = Lagosuchus.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(9, 61).addBox(0.0F, -2.4044F, -9.0938F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 61).addBox(0.0F, -2.4044F, -7.0938F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1891F, -1.9147F, 0.2193F, 0.1298F, 0.0172F));

		PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 61).addBox(0.0F, -0.9981F, 4.0214F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 61).addBox(0.0F, -1.0981F, 2.0214F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 61).addBox(0.0F, -0.9981F, 0.0214F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4794F, -5.0749F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(22, 24).addBox(-0.5F, -0.9495F, -0.2087F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, -0.5025F, -5.0134F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(60, 44).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2074F, -0.6101F, -0.1726F, -0.2948F, -1.2746F));

		PartDefinition cube_r29 = Body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(60, 36).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2074F, -0.6101F, -0.2739F, -0.2046F, -0.8705F));

		PartDefinition cube_r30 = Body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(6, 52).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6074F, -2.5101F, -0.1741F, -0.1321F, -0.7826F));

		PartDefinition cube_r31 = Body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(21, 52).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6074F, -2.5101F, -0.1087F, -0.1895F, -1.1852F));

		PartDefinition cube_r32 = Body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(57, 11).mirror().addBox(-2.5955F, -1.1381F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6074F, -2.5101F, -0.0212F, -0.2171F, -1.6121F));

		PartDefinition cube_r33 = Body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(59, 31).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9074F, -4.5101F, 0.0215F, 0.038F, -1.0904F));

		PartDefinition cube_r34 = Body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(59, 27).mirror().addBox(-2.5955F, -1.1381F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9074F, -4.5101F, 0.0042F, 0.0434F, -1.5096F));

		PartDefinition cube_r35 = Body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(46, 59).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9074F, -4.5101F, 0.0346F, 0.0266F, -0.6889F));

		PartDefinition cube_r36 = Body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(10, 17).mirror().addBox(-3.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9074F, -6.5101F, 0.0248F, 0.2519F, -1.4717F));

		PartDefinition cube_r37 = Body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(59, 46).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9074F, -6.5101F, 0.1267F, 0.2197F, -1.0419F));

		PartDefinition cube_r38 = Body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(51, 59).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9074F, -6.5101F, 0.2024F, 0.153F, -0.6389F));

		PartDefinition cube_r39 = Body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(60, 18).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7074F, -8.5101F, 0.2451F, 0.1841F, -0.5794F));

		PartDefinition cube_r40 = Body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(10, 29).mirror().addBox(-4.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7074F, -8.5101F, 0.0302F, 0.304F, -1.4178F));

		PartDefinition cube_r41 = Body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(56, 59).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7074F, -8.5101F, 0.154F, 0.2648F, -0.983F));

		PartDefinition cube_r42 = Body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(60, 44).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2074F, -0.6101F, -0.1726F, 0.2948F, 1.2746F));

		PartDefinition cube_r43 = Body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(60, 36).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2074F, -0.6101F, -0.2739F, 0.2046F, 0.8705F));

		PartDefinition cube_r44 = Body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(57, 11).addBox(1.5955F, -1.1381F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6074F, -2.5101F, -0.0212F, 0.2171F, 1.6121F));

		PartDefinition cube_r45 = Body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(21, 52).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6074F, -2.5101F, -0.1087F, 0.1895F, 1.1852F));

		PartDefinition cube_r46 = Body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(6, 52).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6074F, -2.5101F, -0.1741F, 0.1321F, 0.7826F));

		PartDefinition cube_r47 = Body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(46, 59).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9074F, -4.5101F, 0.0346F, -0.0266F, 0.6889F));

		PartDefinition cube_r48 = Body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(59, 31).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9074F, -4.5101F, 0.0215F, -0.038F, 1.0904F));

		PartDefinition cube_r49 = Body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(59, 27).addBox(1.5955F, -1.1381F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9074F, -4.5101F, 0.0042F, -0.0434F, 1.5096F));

		PartDefinition cube_r50 = Body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(51, 59).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9074F, -6.5101F, 0.2024F, -0.153F, 0.6389F));

		PartDefinition cube_r51 = Body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(59, 46).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9074F, -6.5101F, 0.1267F, -0.2197F, 1.0419F));

		PartDefinition cube_r52 = Body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(10, 17).addBox(1.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9074F, -6.5101F, 0.0248F, -0.2519F, 1.4717F));

		PartDefinition cube_r53 = Body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(10, 29).addBox(1.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7074F, -8.5101F, 0.0302F, -0.304F, 1.4178F));

		PartDefinition cube_r54 = Body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(56, 59).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7074F, -8.5101F, 0.154F, -0.2648F, 0.983F));

		PartDefinition cube_r55 = Body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(60, 18).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7074F, -8.5101F, 0.2451F, -0.1841F, 0.5794F));

		PartDefinition cube_r56 = Body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(39, 0).addBox(-2.5F, -1.9121F, 0.0544F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 6.2975F, -9.6134F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r57 = Body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(13, 45).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.2025F, -10.0134F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5025F, -10.1134F, 0.0004F, 0.1308F, 0.0057F));

		PartDefinition cube_r58 = Body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(12, 61).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7033F, -0.4968F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(13, 0).addBox(0.0F, -2.3F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 20).addBox(0.0F, -2.1F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 62).addBox(0.0F, -1.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 24).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 1.5975F, -6.7134F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r60 = Body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(35, 13).mirror().addBox(-1.0F, -1.0F, -1.4F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.024F)).mirror(false), PartPose.offsetAndRotation(-0.7959F, 5.5013F, -7.6944F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r61 = Body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(0.0F, -1.5222F, -1.96F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.5675F, -6.1554F, 0.9547F, -0.2632F, -0.3521F));

		PartDefinition cube_r62 = Body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(46, 55).mirror().addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false)
				.texOffs(46, 55).addBox(4.5F, -0.4F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-2.5F, 1.1583F, -4.3013F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r63 = Body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(53, 55).mirror().addBox(-0.5F, -0.0001F, -0.3901F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false)
				.texOffs(53, 55).addBox(4.5F, -0.0001F, -0.3901F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-2.5F, 1.5675F, -5.2554F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r64 = Body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(55, 19).mirror().addBox(-0.5F, -0.0261F, -1.9493F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.016F)).mirror(false)
				.texOffs(55, 19).addBox(4.5F, -0.0261F, -1.9493F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-2.5F, 0.3583F, -2.7013F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r65 = Body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-0.5F, -0.5F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.025F)).mirror(false)
				.texOffs(48, 21).addBox(4.5F, -0.5F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(-2.5F, 1.8675F, -4.8554F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r66 = Body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(25, 9).mirror().addBox(-5.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2074F, -0.5101F, 0.0284F, 0.2866F, -1.366F));

		PartDefinition cube_r67 = Body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(21, 48).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2074F, -0.5101F, 0.1448F, 0.2498F, -0.933F));

		PartDefinition cube_r68 = Body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2074F, -0.5101F, 0.2308F, 0.1738F, -0.5296F));

		PartDefinition cube_r69 = Body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(14, 41).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1926F, -2.4101F, 0.2884F, 0.2148F, -0.4661F));

		PartDefinition cube_r70 = Body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(30, 34).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1926F, -2.4101F, 0.1821F, 0.3097F, -0.8703F));

		PartDefinition cube_r71 = Body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(25, 7).mirror().addBox(-5.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1926F, -2.4101F, 0.0358F, 0.3561F, -1.3113F));

		PartDefinition cube_r72 = Body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(31, 40).mirror().addBox(-4.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4926F, -4.4101F, 0.0397F, 0.3908F, -1.3971F));

		PartDefinition cube_r73 = Body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(31, 61).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4926F, -4.4101F, 0.3175F, 0.2351F, -0.5469F));

		PartDefinition cube_r74 = Body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(61, 29).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4926F, -4.4101F, 0.2012F, 0.3396F, -0.9515F));

		PartDefinition cube_r75 = Body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(22, 40).mirror().addBox(-4.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8926F, -6.4101F, 0.0437F, 0.4255F, -1.4654F));

		PartDefinition cube_r76 = Body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(23, 61).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8926F, -6.4101F, 0.2208F, 0.3693F, -1.0145F));

		PartDefinition cube_r77 = Body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(18, 61).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8926F, -6.4101F, 0.3469F, 0.2552F, -0.6095F));

		PartDefinition cube_r78 = Body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(35, 13).addBox(-1.0F, -1.0F, -1.4F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.7959F, 5.5013F, -7.6944F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r79 = Body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, -1.5222F, -1.96F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(3.0F, 3.5675F, -6.1554F, 0.9547F, 0.2632F, 0.3521F));

		PartDefinition cube_r80 = Body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(22, 40).addBox(1.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8926F, -6.4101F, 0.0437F, -0.4255F, 1.4654F));

		PartDefinition cube_r81 = Body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(23, 61).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8926F, -6.4101F, 0.2208F, -0.3693F, 1.0145F));

		PartDefinition cube_r82 = Body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(18, 61).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8926F, -6.4101F, 0.3469F, -0.2552F, 0.6095F));

		PartDefinition cube_r83 = Body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(31, 61).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4926F, -4.4101F, 0.3175F, -0.2351F, 0.5469F));

		PartDefinition cube_r84 = Body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(61, 29).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4926F, -4.4101F, 0.2012F, -0.3396F, 0.9515F));

		PartDefinition cube_r85 = Body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(31, 40).addBox(1.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4926F, -4.4101F, 0.0397F, -0.3908F, 1.3971F));

		PartDefinition cube_r86 = Body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(14, 41).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1926F, -2.4101F, 0.2884F, -0.2148F, 0.4661F));

		PartDefinition cube_r87 = Body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(30, 34).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1926F, -2.4101F, 0.1821F, -0.3097F, 0.8703F));

		PartDefinition cube_r88 = Body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(25, 7).addBox(1.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1926F, -2.4101F, 0.0358F, -0.3561F, 1.3113F));

		PartDefinition cube_r89 = Body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 48).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2074F, -0.5101F, 0.2308F, -0.1738F, 0.5296F));

		PartDefinition cube_r90 = Body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(25, 9).addBox(1.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2074F, -0.5101F, 0.0284F, -0.2866F, 1.366F));

		PartDefinition cube_r91 = Body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(21, 48).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2074F, -0.5101F, 0.1448F, -0.2498F, 0.933F));

		PartDefinition cube_r92 = Body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 33).addBox(-2.0F, -1.0298F, -4.0847F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 6.8975F, 0.2866F, -0.096F, 0.0F, 0.0F));

		PartDefinition Neck = Body2.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7975F, -6.6134F, -0.1459F, 0.2254F, -0.0115F));

		PartDefinition cube_r93 = Neck.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(48, 27).mirror().addBox(-3.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0321F, -1.4354F, 0.0634F, 0.5816F, -1.5606F));

		PartDefinition cube_r94 = Neck.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(61, 12).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0321F, -1.4354F, 0.3151F, 0.5011F, -1.0794F));

		PartDefinition cube_r95 = Neck.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(60, 57).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0321F, -1.4354F, 0.4835F, 0.3427F, -0.6739F));

		PartDefinition cube_r96 = Neck.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(48, 27).addBox(1.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0321F, -1.4354F, 0.0634F, -0.5816F, 1.5606F));

		PartDefinition cube_r97 = Neck.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(61, 12).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0321F, -1.4354F, 0.3151F, -0.5011F, 1.0794F));

		PartDefinition cube_r98 = Neck.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(60, 57).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0321F, -1.4354F, 0.4835F, -0.3427F, 0.6739F));

		PartDefinition cube_r99 = Neck.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(18, 63).addBox(0.0F, -1.4727F, 0.9598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 50).addBox(-0.5F, -0.9727F, -0.0402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.2728F, -2.9387F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3272F, -2.6387F, -0.0994F, -0.2947F, 0.0814F));

		PartDefinition cube_r100 = Neck2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(21, 63).addBox(0.0F, -0.6F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 63).addBox(0.0F, -0.6F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 63).addBox(0.0F, -0.7F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 63).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 13).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9472F, -6.6802F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r101 = Neck2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(12, 39).mirror().addBox(-2.0902F, 0.0115F, -0.3701F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.248F, -0.6768F, 0.3813F, 0.6747F, -0.9803F));

		PartDefinition cube_r102 = Neck2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(25, 18).mirror().addBox(-1.8054F, -0.126F, -0.3696F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0179F, -2.5495F, 0.4041F, 0.7392F, -0.9452F));

		PartDefinition cube_r103 = Neck2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(51, 16).mirror().addBox(-1.9822F, -0.0264F, -0.6676F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7983F, -4.5852F, 0.4172F, 0.7712F, -0.926F));

		PartDefinition cube_r104 = Neck2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(61, 33).mirror().addBox(-0.9398F, -0.0554F, -0.5358F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0768F, -6.5908F, 0.4475F, 0.8346F, -0.8839F));

		PartDefinition cube_r105 = Neck2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(61, 33).addBox(-0.0602F, -0.0554F, -0.5358F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0768F, -6.5908F, 0.4475F, -0.8346F, 0.8839F));

		PartDefinition cube_r106 = Neck2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(51, 16).addBox(-0.0178F, -0.0264F, -0.6676F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7983F, -4.5852F, 0.4172F, -0.7712F, 0.926F));

		PartDefinition cube_r107 = Neck2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(25, 18).addBox(-0.1946F, -0.126F, -0.3696F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0179F, -2.5495F, 0.4041F, -0.7392F, 0.9452F));

		PartDefinition cube_r108 = Neck2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(12, 39).addBox(0.0902F, 0.0115F, -0.3701F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.248F, -0.6768F, 0.3813F, -0.6747F, 0.9803F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, -0.5227F, -2.8813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F))
				.texOffs(33, 63).addBox(0.0F, -1.2227F, -1.8813F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4472F, -6.6802F, -0.1309F, 0.3054F, 0.0F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(42, 13).addBox(-0.4F, 0.0733F, -8.762F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(42, 13).mirror().addBox(-0.6F, 0.0733F, -8.762F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2227F, -2.2813F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r109 = Head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(58, 4).addBox(-1.0F, -0.0448F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8267F, -3.762F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r110 = Head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(59, 23).addBox(-1.0F, -0.0047F, -1.0433F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1267F, -2.762F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r111 = Head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(58, 14).addBox(-0.5F, 0.99F, 2.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0733F, -8.762F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r112 = Head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(39, 27).addBox(-0.5F, 0.0198F, -0.9827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.3267F, -8.062F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r113 = Head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(44, 40).addBox(-0.5F, 0.0247F, -0.591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4267F, -7.462F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r114 = Head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(51, 11).addBox(-0.5F, -0.0451F, -2.9634F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.4267F, -4.662F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r115 = Head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-0.5F, 0.4F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 31).mirror().addBox(-0.5F, -0.6F, -2.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5927F, -0.3278F, -5.1282F, 0.4014F, -0.1676F, 0.0F));

		PartDefinition cube_r116 = Head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5067F, 0.5633F, -5.6366F, -0.0175F, -0.1676F, 0.0F));

		PartDefinition cube_r117 = Head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(58, 53).mirror().addBox(-0.6F, -0.6F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(58, 53).addBox(1.8F, -0.6F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.1F, 0.2123F, -0.8063F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r118 = Head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(57, 48).mirror().addBox(-0.5F, -0.9784F, 0.0053F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 48).addBox(1.7F, -0.9784F, 0.0053F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.9332F, -3.7276F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r119 = Head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(47, 21).mirror().addBox(-0.5F, -0.0312F, -0.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(47, 21).addBox(1.7F, -0.0312F, -0.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.1F, -0.4668F, -1.0276F, -2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r120 = Head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(48, 50).mirror().addBox(-0.5F, 0.0344F, -0.0049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(48, 50).addBox(1.7F, 0.0344F, -0.0049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.1F, -1.4668F, -1.2276F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r121 = Head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(53, 42).mirror().addBox(-1.6F, 0.6F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(0, 17).addBox(-1.5F, 2.1F, 0.2F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F))
				.texOffs(53, 42).addBox(0.6F, 0.6F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(39, 32).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1267F, -2.862F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r122 = Head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-0.5F, -0.088F, 0.0138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(58, 0).addBox(1.7F, -0.088F, 0.0138F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -1.7668F, -3.2276F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r123 = Head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(16, 52).mirror().addBox(-0.5F, -1.0F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(16, 52).addBox(1.7F, -1.0F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.1F, -0.5668F, -3.3276F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r124 = Head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(9, 52).mirror().addBox(-0.44F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(25, 13).mirror().addBox(-0.66F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(25, 13).addBox(2.26F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(9, 52).addBox(2.04F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.3F, -0.525F, -2.9298F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r125 = Head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(21, 57).mirror().addBox(-0.5F, -0.7206F, -1.2004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.3024F, -5.5636F, 3.0456F, -0.192F, 0.0F));

		PartDefinition cube_r126 = Head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(14, 57).mirror().addBox(-0.5F, -0.1332F, -0.7648F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.3024F, -5.5636F, -2.4086F, -0.192F, 0.0F));

		PartDefinition cube_r127 = Head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(7, 57).mirror().addBox(-0.5F, -0.0352F, -1.1332F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.3024F, -5.5636F, 2.3038F, -0.192F, 0.0F));

		PartDefinition cube_r128 = Head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(44, 43).mirror().addBox(0.3F, 0.6F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(44, 43).addBox(0.9F, 0.6F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.1F, 0.4549F, -6.2811F, -2.4086F, 0.0F, 0.0F));

		PartDefinition cube_r129 = Head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(25, 0).mirror().addBox(0.05F, -0.5F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.91F, 1.1733F, -6.2187F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r130 = Head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(25, 0).addBox(-0.05F, -0.5F, -2.5F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.91F, 1.1733F, -6.2187F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r131 = Head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, 0.4F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(22, 31).addBox(-0.5F, -0.6F, -2.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5927F, -0.3278F, -5.1282F, 0.4014F, 0.1676F, 0.0F));

		PartDefinition cube_r132 = Head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5067F, 0.5633F, -5.6366F, -0.0175F, 0.1676F, 0.0F));

		PartDefinition cube_r133 = Head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(50, 32).addBox(-1.5F, 0.0102F, -0.0099F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.9267F, -0.862F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r134 = Head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(7, 57).addBox(-0.5F, -0.0352F, -1.1332F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.7F, 0.3024F, -5.5636F, 2.3038F, 0.192F, 0.0F));

		PartDefinition cube_r135 = Head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(14, 57).addBox(-0.5F, -0.1332F, -0.7648F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.7F, 0.3024F, -5.5636F, -2.4086F, 0.192F, 0.0F));

		PartDefinition cube_r136 = Head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(21, 57).addBox(-0.5F, -0.7206F, -1.2004F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7F, 0.3024F, -5.5636F, 3.0456F, 0.192F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(39, 24).addBox(-0.5F, 0.0F, -8.99F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(39, 24).mirror().addBox(-0.7F, 0.0F, -8.99F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1F, 1.0633F, 0.238F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r137 = Jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(51, 50).mirror().addBox(-1.5F, -0.7326F, -2.7788F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(51, 50).addBox(0.7F, -0.7326F, -2.7788F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.2F, 1.1F, -0.7F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r138 = Jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(56, 37).mirror().addBox(-1.5F, -0.7719F, -0.81F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(56, 37).addBox(0.7F, -0.7719F, -0.81F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2F, 0.9F, -0.1F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r139 = Jaw.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(31, 48).mirror().addBox(-1.5F, -0.6F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(31, 48).addBox(0.7F, -0.6F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.2F, 0.6F, -0.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r140 = Jaw.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(39, 24).mirror().addBox(0.02F, -0.81F, -5.59F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.01F, -2.99F, -0.0349F, -0.1676F, 0.0F));

		PartDefinition cube_r141 = Jaw.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(13, 0).mirror().addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7358F, 0.4F, -6.7722F, -0.0349F, -0.1676F, 0.0F));

		PartDefinition cube_r142 = Jaw.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(35, 40).mirror().addBox(0.02F, -1.01F, -5.59F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 1.01F, -2.99F, 0.0F, -0.1676F, 0.0F));

		PartDefinition cube_r143 = Jaw.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(39, 24).addBox(-1.02F, -0.81F, -5.59F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.5F, 1.01F, -2.99F, -0.0349F, 0.1676F, 0.0F));

		PartDefinition cube_r144 = Jaw.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(13, 0).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5358F, 0.4F, -6.7722F, -0.0349F, 0.1676F, 0.0F));

		PartDefinition cube_r145 = Jaw.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(35, 40).addBox(-1.02F, -1.01F, -5.59F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 1.01F, -2.99F, 0.0F, 0.1676F, 0.0F));

		PartDefinition RArm = Body2.addOrReplaceChild("RArm", CubeListBuilder.create().texOffs(0, 8).addBox(-0.0771F, -0.5307F, -0.3199F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 6.1975F, -6.2134F, -0.537F, 0.2368F, -0.0429F));

		PartDefinition RArm2 = RArm.addOrReplaceChild("RArm2", CubeListBuilder.create().texOffs(36, 54).addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(41, 55).addBox(0.0F, 0.2F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0771F, -0.2307F, 6.0801F, 0.3403F, 0.0F, 0.0F));

		PartDefinition RHand = RArm2.addOrReplaceChild("RHand", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -0.01F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.99F, 5.0F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition RArm3 = Body2.addOrReplaceChild("RArm3", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-0.9229F, -0.5307F, -0.3199F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 6.1975F, -6.2134F, -1.2352F, -0.2368F, 0.0429F));

		PartDefinition RArm4 = RArm3.addOrReplaceChild("RArm4", CubeListBuilder.create().texOffs(36, 54).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(41, 55).mirror().addBox(-1.0F, 0.2F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0771F, -0.2307F, 6.0801F, 0.6021F, 0.0F, 0.0F));

		PartDefinition RHand2 = RArm4.addOrReplaceChild("RHand2", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(0.0F, -0.01F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.99F, 5.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition Tail = Lagosuchus.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, -0.6013F, -0.0611F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.01F))
				.texOffs(45, 61).addBox(0.0F, -1.4013F, 0.9389F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 61).addBox(0.0F, -1.3013F, 2.9389F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 61).addBox(0.0F, -1.2013F, 4.9389F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 54).addBox(0.0F, -1.1013F, 6.9389F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 52).addBox(0.0F, -1.0013F, 8.9389F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1891F, 3.8853F, 0.0702F, 0.1745F, 0.0046F));

		PartDefinition cube_r146 = Tail.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(35, 13).addBox(0.0F, 3.9F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 13).addBox(0.0F, 2.9F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 45).addBox(0.0F, 1.7F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 59).addBox(0.0F, 0.2F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 60).addBox(0.0F, -1.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0987F, 1.4389F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(22, 24).addBox(-0.5F, -0.6584F, -0.0376F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.0013F, 10.9389F, 0.1506F, 0.1726F, 0.0261F));

		PartDefinition cube_r147 = Tail2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(14, 45).addBox(0.0F, 11.3F, 19.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 49).addBox(0.0F, 10.3F, 17.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 11).addBox(0.0F, 9.2F, 15.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 61).addBox(0.0F, 7.2F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 0).addBox(0.0F, 6.1F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 33).addBox(0.0F, 4.9F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -9.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -0.4147F, 0.0474F, 1.0F, 1.0F, 19.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.2584F, 13.8624F, 0.0903F, -0.2608F, -0.0233F));

		PartDefinition cube_r148 = Tail3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(63, 38).addBox(0.0F, 16.2F, 27.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 17).addBox(0.0F, 15.0F, 25.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 19).addBox(0.0F, 13.8F, 23.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 45).addBox(0.0F, 12.5F, 21.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3584F, -23.3624F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4756F, -0.3993F, 1.0F, 1.0F, 22.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0853F, 19.4474F, -0.065F, -0.3484F, 0.0222F));

		PartDefinition RLeg = Lagosuchus.addOrReplaceChild("RLeg", CubeListBuilder.create().texOffs(31, 54).addBox(0.5F, -0.9933F, -0.6579F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, 1.0109F, 0.1853F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r149 = RLeg.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(10, 24).addBox(0.0F, -0.0792F, -0.0221F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0067F, 0.1421F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r150 = RLeg.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.0067F, -0.6579F, 0.192F, 0.0F, 0.0F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 10.1067F, 1.6421F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r151 = RLeg2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(26, 45).addBox(0.0F, -6.2F, -0.7F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(17, 8).addBox(-1.0F, -6.2F, -0.7F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 6.3486F, 1.1721F, 0.0873F, 0.0F, 0.0F));

		PartDefinition RLeg3 = RLeg2.addOrReplaceChild("RLeg3", CubeListBuilder.create().texOffs(39, 0).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 12.6486F, 1.1721F, -0.6196F, 0.0F, 0.0F));

		PartDefinition RFoot = RLeg3.addOrReplaceChild("RFoot", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.8827F, -5.4239F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.0F, 0.3F, 0.0873F, 0.0F, 0.0F));

		PartDefinition RLeg4 = Lagosuchus.addOrReplaceChild("RLeg4", CubeListBuilder.create().texOffs(31, 54).mirror().addBox(-1.5F, -0.9933F, -0.6579F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.0109F, 0.1853F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r152 = RLeg4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(10, 24).mirror().addBox(-2.0F, -0.0792F, -0.0221F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.0067F, 0.1421F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r153 = RLeg4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 4.0067F, -0.6579F, 0.192F, 0.0F, 0.0F));

		PartDefinition RLeg5 = RLeg4.addOrReplaceChild("RLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 10.1067F, 1.6421F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r154 = RLeg5.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(26, 45).mirror().addBox(-1.0F, -6.2F, -0.7F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(17, 8).mirror().addBox(0.0F, -6.2F, -0.7F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.3486F, 1.1721F, 0.0873F, 0.0F, 0.0F));

		PartDefinition RLeg6 = RLeg5.addOrReplaceChild("RLeg6", CubeListBuilder.create().texOffs(39, 0).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, 12.6486F, 1.1721F, -0.7941F, 0.0F, 0.0F));

		PartDefinition RFoot2 = RLeg6.addOrReplaceChild("RFoot2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -0.8827F, -5.4239F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 6.0F, 0.3F, 0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 67, 67);
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