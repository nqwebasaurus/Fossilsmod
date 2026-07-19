package fossils.fossils.client.blockentity.model.mesosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MesosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Mesosaurus;
	private final ModelPart body;
	private final ModelPart Hip;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart RLeg;
	private final ModelPart RLeg2;
	private final ModelPart RFoot;
	private final ModelPart RLeg3;
	private final ModelPart RLeg4;
	private final ModelPart RFoot2;
	private final ModelPart Tail;
	private final ModelPart tail5;
	private final ModelPart Tail2;
	private final ModelPart tail6;
	private final ModelPart Tail3;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart Tail4;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart tail12;
	private final ModelPart Chest;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart bone;
	private final ModelPart Jaw;
	private final ModelPart RArm;
	private final ModelPart RArm2;
	private final ModelPart RHand;
	private final ModelPart RArm3;
	private final ModelPart RArm4;
	private final ModelPart RHand2;

	public MesosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Mesosaurus = this.fossil.getChild("Mesosaurus");
		this.body = this.Mesosaurus.getChild("body");
		this.Hip = this.body.getChild("Hip");
		this.bone2 = this.Hip.getChild("bone2");
		this.bone4 = this.Hip.getChild("bone4");
		this.RLeg = this.Hip.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RFoot = this.RLeg2.getChild("RFoot");
		this.RLeg3 = this.Hip.getChild("RLeg3");
		this.RLeg4 = this.RLeg3.getChild("RLeg4");
		this.RFoot2 = this.RLeg4.getChild("RFoot2");
		this.Tail = this.Hip.getChild("Tail");
		this.tail5 = this.Tail.getChild("tail5");
		this.Tail2 = this.tail5.getChild("Tail2");
		this.tail6 = this.Tail2.getChild("tail6");
		this.Tail3 = this.tail6.getChild("Tail3");
		this.tail7 = this.Tail3.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.Tail4 = this.tail8.getChild("Tail4");
		this.tail9 = this.Tail4.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.tail12 = this.tail11.getChild("tail12");
		this.Chest = this.Mesosaurus.getChild("Chest");
		this.bone3 = this.Chest.getChild("bone3");
		this.bone5 = this.Chest.getChild("bone5");
		this.Neck = this.Chest.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Head = this.Neck4.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.bone = this.Head.getChild("bone");
		this.Jaw = this.Head.getChild("Jaw");
		this.RArm = this.Chest.getChild("RArm");
		this.RArm2 = this.RArm.getChild("RArm2");
		this.RHand = this.RArm2.getChild("RHand");
		this.RArm3 = this.Chest.getChild("RArm3");
		this.RArm4 = this.RArm3.getChild("RArm4");
		this.RHand2 = this.RArm4.getChild("RHand2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Mesosaurus = fossil.addOrReplaceChild("Mesosaurus", CubeListBuilder.create().texOffs(21, 7).addBox(-0.5F, -2.675F, -6.4F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(70, 90).addBox(-0.5F, -2.675F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -6.875F, 0.0F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Mesosaurus.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(38, 14).mirror().addBox(-6.2479F, -1.4312F, -0.3354F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -5.8791F, 0.003F, 0.3993F, -1.4277F));

		PartDefinition cube_r2 = Mesosaurus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 68).mirror().addBox(-2.6623F, -0.1155F, -0.3354F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -5.8791F, 0.2104F, 0.342F, -0.8682F));

		PartDefinition cube_r3 = Mesosaurus.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(91, 21).mirror().addBox(-0.6232F, 0.2504F, -0.3328F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -5.8791F, 0.3912F, 0.1685F, -0.3335F));

		PartDefinition cube_r4 = Mesosaurus.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(91, 54).mirror().addBox(-0.6232F, 0.2504F, -0.3328F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -3.8791F, 0.3411F, 0.1511F, -0.3415F));

		PartDefinition cube_r5 = Mesosaurus.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(51, 12).mirror().addBox(-6.2479F, -1.4312F, -0.3353F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -3.8791F, -0.005F, 0.3475F, -1.4306F));

		PartDefinition cube_r6 = Mesosaurus.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(19, 68).mirror().addBox(-2.6623F, -0.1155F, -0.3353F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -3.8791F, 0.175F, 0.3018F, -0.8794F));

		PartDefinition cube_r7 = Mesosaurus.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(92, 6).mirror().addBox(-0.5821F, 0.155F, -0.5037F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -1.6791F, 0.2583F, 0.1214F, -0.3528F));

		PartDefinition cube_r8 = Mesosaurus.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(54, 53).mirror().addBox(-6.1484F, -1.4352F, -0.5089F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -1.6791F, -0.0176F, 0.2611F, -1.4344F));

		PartDefinition cube_r9 = Mesosaurus.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(69, 10).mirror().addBox(-2.5782F, -0.1687F, -0.5089F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, -1.6791F, 0.1178F, 0.2341F, -0.8946F));

		PartDefinition cube_r10 = Mesosaurus.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(20, 92).mirror().addBox(-0.5821F, 0.155F, -0.5036F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 0.3209F, 0.2171F, 0.1063F, -0.3575F));

		PartDefinition cube_r11 = Mesosaurus.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-6.1484F, -1.4352F, -0.5089F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 0.3209F, -0.0237F, 0.2178F, -1.4358F));

		PartDefinition cube_r12 = Mesosaurus.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(69, 12).mirror().addBox(-2.5782F, -0.1687F, -0.5089F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -2.2257F, 0.3209F, 0.09F, 0.2F, -0.9006F));

		PartDefinition cube_r13 = Mesosaurus.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(69, 12).addBox(0.5782F, -0.1687F, -0.5089F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 0.3209F, 0.09F, -0.2F, 0.9006F));

		PartDefinition cube_r14 = Mesosaurus.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(55, 0).addBox(2.1485F, -1.4352F, -0.5089F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 0.3209F, -0.0237F, -0.2178F, 1.4358F));

		PartDefinition cube_r15 = Mesosaurus.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(20, 92).addBox(-0.4179F, 0.155F, -0.5036F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, 0.3209F, 0.2171F, -0.1063F, 0.3575F));

		PartDefinition cube_r16 = Mesosaurus.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(69, 10).addBox(0.5782F, -0.1687F, -0.5089F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -1.6791F, 0.1178F, -0.2341F, 0.8946F));

		PartDefinition cube_r17 = Mesosaurus.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(54, 53).addBox(2.1485F, -1.4352F, -0.5089F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -1.6791F, -0.0176F, -0.2611F, 1.4344F));

		PartDefinition cube_r18 = Mesosaurus.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(92, 6).addBox(-0.4179F, 0.155F, -0.5037F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -1.6791F, 0.2583F, -0.1214F, 0.3528F));

		PartDefinition cube_r19 = Mesosaurus.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(19, 68).addBox(0.6623F, -0.1155F, -0.3353F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -3.8791F, 0.175F, -0.3018F, 0.8794F));

		PartDefinition cube_r20 = Mesosaurus.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(51, 12).addBox(2.2479F, -1.4312F, -0.3353F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -3.8791F, -0.005F, -0.3475F, 1.4306F));

		PartDefinition cube_r21 = Mesosaurus.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(91, 54).addBox(-0.3768F, 0.2504F, -0.3328F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -3.8791F, 0.3411F, -0.1511F, 0.3415F));

		PartDefinition cube_r22 = Mesosaurus.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(91, 21).addBox(-0.3768F, 0.2504F, -0.3328F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -5.8791F, 0.3912F, -0.1685F, 0.3335F));

		PartDefinition cube_r23 = Mesosaurus.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(5, 68).addBox(0.6623F, -0.1155F, -0.3354F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -5.8791F, 0.2104F, -0.342F, 0.8682F));

		PartDefinition cube_r24 = Mesosaurus.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(38, 14).addBox(2.2479F, -1.4312F, -0.3354F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -2.2257F, -5.8791F, 0.003F, -0.3993F, 1.4277F));

		PartDefinition cube_r25 = Mesosaurus.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(62, 91).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.65F, -0.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Mesosaurus.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(59, 91).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.75F, -2.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r27 = Mesosaurus.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(95, 42).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.65F, -4.1F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r28 = Mesosaurus.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(56, 91).addBox(0.0F, -1.55F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -6.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r29 = Mesosaurus.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 39).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 4.3206F, -3.2441F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r30 = Mesosaurus.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(21, 24).addBox(-2.0F, -1.0F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 4.5996F, 0.7462F, -0.0698F, 0.0F, 0.0F));

		PartDefinition body = Mesosaurus.addOrReplaceChild("body", CubeListBuilder.create().texOffs(21, 16).addBox(-0.5F, -0.275F, -0.225F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.3869F, 1.1997F, -0.044F, -0.1308F, 0.0057F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(92, 23).mirror().addBox(-0.6026F, 0.2027F, -0.4182F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1743F, 1.0209F, 0.2583F, 0.1214F, -0.3528F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(55, 2).mirror().addBox(-6.1982F, -1.4332F, -0.4221F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1743F, 1.0209F, -0.0176F, 0.2611F, -1.4344F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(69, 17).mirror().addBox(-2.6203F, -0.1421F, -0.4221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1743F, 1.0209F, 0.1178F, 0.2341F, -0.8946F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(25, 92).mirror().addBox(-0.6232F, 0.2504F, -0.3327F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.0743F, 2.9209F, 0.2583F, 0.1214F, -0.3528F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(55, 4).mirror().addBox(-6.2479F, -1.4312F, -0.3353F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.0743F, 2.9209F, -0.0176F, 0.2611F, -1.4344F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(69, 19).mirror().addBox(-2.6623F, -0.1155F, -0.3353F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.0743F, 2.9209F, 0.1178F, 0.2341F, -0.8946F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(69, 21).mirror().addBox(-2.6922F, -0.0949F, -0.3561F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1743F, 4.9209F, 0.1575F, 0.2283F, -1.0207F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(92, 25).mirror().addBox(-0.6385F, 0.2828F, -0.3545F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1743F, 4.9209F, 0.2886F, 0.0966F, -0.4847F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(7, 59).mirror().addBox(-5.2841F, -1.4282F, -0.3561F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1743F, 4.9209F, 0.0199F, 0.2758F, -1.5596F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(7, 59).addBox(2.2841F, -1.4282F, -0.3561F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1743F, 4.9209F, 0.0199F, -0.2758F, 1.5596F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(92, 25).addBox(-0.3615F, 0.2828F, -0.3545F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1743F, 4.9209F, 0.2886F, -0.0966F, 0.4847F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(69, 21).addBox(0.6922F, -0.0949F, -0.3561F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1743F, 4.9209F, 0.1575F, -0.2283F, 1.0207F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(69, 19).addBox(0.6623F, -0.1155F, -0.3353F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.0743F, 2.9209F, 0.1178F, -0.2341F, 0.8946F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(55, 4).addBox(2.2479F, -1.4312F, -0.3353F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.0743F, 2.9209F, -0.0176F, -0.2611F, 1.4344F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 18).addBox(-2.0F, -0.05F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 5.8998F, 2.8192F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(25, 92).addBox(-0.3768F, 0.2504F, -0.3327F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.0743F, 2.9209F, 0.2583F, -0.1214F, 0.3528F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(69, 17).addBox(0.6202F, -0.1421F, -0.4221F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1743F, 1.0209F, 0.1178F, -0.2341F, 0.8946F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(55, 2).addBox(2.1982F, -1.4332F, -0.4221F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1743F, 1.0209F, -0.0176F, -0.2611F, 1.4344F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(92, 23).addBox(-0.3974F, 0.2027F, -0.4182F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1743F, 1.0209F, 0.2583F, -0.1214F, 0.3528F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(10, 92).addBox(0.0F, -1.775F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, 4.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(53, 91).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.35F, 2.7F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(90, 91).addBox(0.0F, -1.725F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.35F, 0.7F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Hip = body.addOrReplaceChild("Hip", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2564F, 5.6257F, 0.0119F, -0.0873F, -0.001F));

		PartDefinition cube_r53 = Hip.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(38, 23).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0329F, 3.1459F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r54 = Hip.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 34).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3985F, 0.1683F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r55 = Hip.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(26, 69).mirror().addBox(-1.7398F, 0.1491F, -0.4936F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, 7.5F, 0.0542F, 0.0556F, -0.5181F));

		PartDefinition cube_r56 = Hip.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(95, 33).mirror().addBox(-0.6385F, 0.2828F, -0.3545F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.0821F, 1.2952F, 0.3275F, 0.1168F, -0.4805F));

		PartDefinition cube_r57 = Hip.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(65, 53).mirror().addBox(-2.6922F, -0.0949F, -0.3561F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.0821F, 1.2952F, 0.1811F, 0.2654F, -1.0149F));

		PartDefinition cube_r58 = Hip.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(56, 39).mirror().addBox(-5.2841F, -1.4282F, -0.3561F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.0821F, 1.2952F, 0.0204F, 0.3195F, -1.5595F));

		PartDefinition cube_r59 = Hip.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(5, 70).mirror().addBox(-2.6922F, -0.0949F, -0.3561F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.0321F, 3.2452F, 0.2052F, 0.3024F, -1.0082F));

		PartDefinition cube_r60 = Hip.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(19, 70).mirror().addBox(-4.2841F, -1.4282F, -0.3561F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.0321F, 3.2452F, 0.0209F, 0.3631F, -1.5593F));

		PartDefinition cube_r61 = Hip.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(92, 51).mirror().addBox(-0.6385F, 0.2828F, -0.3545F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.0321F, 3.2452F, 0.3665F, 0.1369F, -0.4756F));

		PartDefinition cube_r62 = Hip.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(93, 4).mirror().addBox(-0.6385F, 0.2828F, -0.3545F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1679F, 5.2452F, 0.5252F, 0.2148F, -0.4478F));

		PartDefinition cube_r63 = Hip.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(70, 25).mirror().addBox(-2.6922F, -0.0949F, -0.3561F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1679F, 5.2452F, 0.3082F, 0.4484F, -0.9703F));

		PartDefinition cube_r64 = Hip.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(70, 25).addBox(0.6922F, -0.0949F, -0.3561F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1679F, 5.2452F, 0.3082F, -0.4484F, 0.9703F));

		PartDefinition cube_r65 = Hip.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(93, 4).addBox(-0.3615F, 0.2828F, -0.3545F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1679F, 5.2452F, 0.5252F, -0.2148F, 0.4478F));

		PartDefinition cube_r66 = Hip.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(92, 51).addBox(-0.3615F, 0.2828F, -0.3545F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0321F, 3.2452F, 0.3665F, -0.1369F, 0.4756F));

		PartDefinition cube_r67 = Hip.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(19, 70).addBox(2.2841F, -1.4282F, -0.3561F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0321F, 3.2452F, 0.0209F, -0.3631F, 1.5593F));

		PartDefinition cube_r68 = Hip.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(5, 70).addBox(0.6922F, -0.0949F, -0.3561F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0321F, 3.2452F, 0.2052F, -0.3024F, 1.0082F));

		PartDefinition cube_r69 = Hip.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(95, 33).addBox(-0.3615F, 0.2828F, -0.3545F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0821F, 1.2952F, 0.3275F, -0.1168F, 0.4805F));

		PartDefinition cube_r70 = Hip.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(65, 53).addBox(0.6922F, -0.0949F, -0.3561F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0821F, 1.2952F, 0.1811F, -0.2654F, 1.0149F));

		PartDefinition cube_r71 = Hip.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(56, 39).addBox(2.2841F, -1.4282F, -0.3561F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.0821F, 1.2952F, 0.0204F, -0.3195F, 1.5595F));

		PartDefinition cube_r72 = Hip.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(54, 49).addBox(-1.0F, -0.825F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.337F, 9.1961F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r73 = Hip.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(90, 72).addBox(-0.5F, -0.725F, 8.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 7).addBox(-0.5F, -0.725F, -0.175F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r74 = Hip.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(26, 69).addBox(-0.2602F, 0.1491F, -0.4936F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, 7.5F, 0.0542F, -0.0556F, 0.5181F));

		PartDefinition cube_r75 = Hip.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(19, 94).addBox(0.0F, -1.675F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4259F, 3.0488F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r76 = Hip.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(22, 94).addBox(0.0F, -1.475F, -0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2495F, 7.0738F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r77 = Hip.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(36, 92).addBox(0.0F, -1.65F, -0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2744F, 5.0683F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r78 = Hip.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(95, 46).addBox(0.0F, -1.8F, 0.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4823F, 0.9708F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = Hip.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.2F, 3.1609F, 6.2746F));

		PartDefinition cube_r79 = bone2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(80, 42).addBox(-0.5F, -0.0114F, -0.0397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4498F, 1.154F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r80 = bone2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(35, 80).addBox(-0.5F, -0.7864F, -0.3397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.9F, 0.5F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r81 = bone2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(81, 18).addBox(-1.0F, -0.2797F, -0.2361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1F, 0.1971F, 0.6864F, -1.3003F, 0.0F, 0.829F));

		PartDefinition cube_r82 = bone2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(80, 45).addBox(-1.0F, -0.6797F, -0.011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.1F, 0.1971F, 0.6864F, -0.6021F, 0.0F, 0.829F));

		PartDefinition cube_r83 = bone2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(15, 81).addBox(-1.0F, 0.2203F, 0.376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.1971F, 0.6864F, -2.2166F, 0.0F, 0.829F));

		PartDefinition cube_r84 = bone2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(81, 12).addBox(-1.0F, 0.2774F, 0.3858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 0.1971F, 0.6864F, -1.5184F, 0.0F, 0.829F));

		PartDefinition cube_r85 = bone2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(81, 9).addBox(-1.0F, -1.4669F, 0.7804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.1971F, 0.6864F, -2.7402F, 0.0F, 0.829F));

		PartDefinition cube_r86 = bone2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(5, 81).addBox(-1.0F, -1.4093F, -0.8802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.1F, 0.1971F, 0.6864F, 2.4958F, 0.0F, 0.829F));

		PartDefinition cube_r87 = bone2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 81).addBox(-1.0F, -0.1581F, -1.4352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.1971F, 0.6864F, 1.885F, 0.0F, 0.829F));

		PartDefinition cube_r88 = bone2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(80, 74).addBox(-1.0F, 0.8531F, -1.165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1F, 0.1971F, 0.6864F, 1.1432F, 0.0F, 0.829F));

		PartDefinition cube_r89 = bone2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 64).addBox(-1.0F, 0.9354F, 1.0223F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.1971F, 0.6864F, 0.096F, 0.0F, 0.829F));

		PartDefinition cube_r90 = bone2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(80, 48).addBox(-1.0F, 1.6508F, -0.8994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.1F, 0.1971F, 0.6864F, 1.2305F, 0.0F, 0.829F));

		PartDefinition cube_r91 = bone2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(20, 80).addBox(-1.0F, 0.7793F, -0.0875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 0.1971F, 0.6864F, 0.7069F, 0.0F, 0.829F));

		PartDefinition cube_r92 = bone2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(81, 15).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6086F, 0.6305F, -0.2333F, 0.1198F, 0.4659F));

		PartDefinition cube_r93 = bone2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(80, 33).addBox(-0.5F, -1.7511F, -0.0485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone4 = Hip.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.2F, 3.1609F, 6.2746F));

		PartDefinition cube_r94 = bone4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(80, 42).mirror().addBox(-0.5F, -0.0114F, -0.0397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4498F, 1.154F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r95 = bone4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(35, 80).mirror().addBox(-0.5F, -0.7864F, -0.3397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9F, 0.5F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r96 = bone4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(81, 18).mirror().addBox(0.0F, -0.2797F, -0.2361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.1971F, 0.6864F, -1.3003F, 0.0F, -0.829F));

		PartDefinition cube_r97 = bone4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(80, 45).mirror().addBox(0.0F, -0.6797F, -0.011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.1971F, 0.6864F, -0.6021F, 0.0F, -0.829F));

		PartDefinition cube_r98 = bone4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(15, 81).mirror().addBox(0.0F, 0.2203F, 0.376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.1971F, 0.6864F, -2.2166F, 0.0F, -0.829F));

		PartDefinition cube_r99 = bone4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(81, 12).mirror().addBox(0.0F, 0.2774F, 0.3858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.1971F, 0.6864F, -1.5184F, 0.0F, -0.829F));

		PartDefinition cube_r100 = bone4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(81, 9).mirror().addBox(0.0F, -1.4669F, 0.7804F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.1971F, 0.6864F, -2.7402F, 0.0F, -0.829F));

		PartDefinition cube_r101 = bone4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(0.0F, -1.4093F, -0.8802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.1971F, 0.6864F, 2.4958F, 0.0F, -0.829F));

		PartDefinition cube_r102 = bone4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(0.0F, -0.1581F, -1.4352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.1971F, 0.6864F, 1.885F, 0.0F, -0.829F));

		PartDefinition cube_r103 = bone4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(80, 74).mirror().addBox(0.0F, 0.8531F, -1.165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.1971F, 0.6864F, 1.1432F, 0.0F, -0.829F));

		PartDefinition cube_r104 = bone4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(0.0F, 0.9354F, 1.0223F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.1971F, 0.6864F, 0.096F, 0.0F, -0.829F));

		PartDefinition cube_r105 = bone4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(80, 48).mirror().addBox(0.0F, 1.6508F, -0.8994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.1971F, 0.6864F, 1.2305F, 0.0F, -0.829F));

		PartDefinition cube_r106 = bone4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(20, 80).mirror().addBox(0.0F, 0.7793F, -0.0875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.1971F, 0.6864F, 0.7069F, 0.0F, -0.829F));

		PartDefinition cube_r107 = bone4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(81, 15).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6086F, 0.6305F, -0.2333F, -0.1198F, -0.4659F));

		PartDefinition cube_r108 = bone4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(80, 33).mirror().addBox(-0.5F, -1.7511F, -0.0485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition RLeg = Hip.addOrReplaceChild("RLeg", CubeListBuilder.create().texOffs(80, 39).addBox(0.0F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.4748F, 3.0285F, 6.9747F, 0.1191F, -0.9437F, 0.9242F));

		PartDefinition cube_r109 = RLeg.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(82, 30).addBox(-0.45F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.7085F, 0.0F, -2.3815F, 0.0F, -2.8187F, 0.0F));

		PartDefinition cube_r110 = RLeg.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(82, 27).addBox(-0.675F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(5.5165F, 0.0F, -1.7363F, 0.0F, 3.1154F, 0.0F));

		PartDefinition cube_r111 = RLeg.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(30, 62).addBox(-0.075F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(3.5494F, 0.0F, -1.8381F, 0.0F, -1.2043F, 0.0F));

		PartDefinition cube_r112 = RLeg.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(62, 22).addBox(-0.075F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(3.5494F, 0.0F, -1.8381F, 0.0F, -1.0734F, 0.0F));

		PartDefinition cube_r113 = RLeg.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(62, 18).addBox(-0.925F, -0.5F, -2.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3925F, 0.0F, -0.053F, 0.0F, -0.9861F, 0.0F));

		PartDefinition cube_r114 = RLeg.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(62, 10).addBox(-0.925F, -0.5F, -2.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.7746F, 0.0F, 0.736F, 0.0F, -1.117F, 0.0F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.1385F, 0.0F, -2.5311F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r115 = RLeg2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(50, 82).addBox(0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(82, 36).addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(2.8249F, 0.0F, 1.5772F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r116 = RLeg2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(82, 58).addBox(-0.8F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 82).addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.9165F, 0.0F, -0.1115F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r117 = RLeg2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(82, 51).addBox(-1.7F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(54, 55).addBox(-1.1F, -0.5F, -0.375F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7971F, 0.0F, -0.5754F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r118 = RLeg2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(45, 55).addBox(-1.6F, -0.5F, -0.45F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6809F, 0.0F, 1.0736F, 0.0F, -0.1309F, 0.0F));

		PartDefinition RFoot = RLeg2.addOrReplaceChild("RFoot", CubeListBuilder.create().texOffs(0, 0).addBox(0.7F, 0.0F, -3.7F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(60, 82).addBox(-0.3F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.9241F, 0.0F, 0.4688F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r119 = RFoot.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(82, 64).addBox(-1.175F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(82, 61).addBox(-0.375F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2F, 0.0F, -0.7F, 0.0F, 0.829F, 0.0F));

		PartDefinition RLeg3 = Hip.addOrReplaceChild("RLeg3", CubeListBuilder.create().texOffs(80, 39).mirror().addBox(-1.0F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.4748F, 3.0285F, 6.9747F, 0.0765F, 0.4224F, -0.9894F));

		PartDefinition cube_r120 = RLeg3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(82, 30).mirror().addBox(-0.55F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.7085F, 0.0F, -2.3815F, 0.0F, 2.8187F, 0.0F));

		PartDefinition cube_r121 = RLeg3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(82, 27).mirror().addBox(-0.325F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-5.5165F, 0.0F, -1.7363F, 0.0F, -3.1154F, 0.0F));

		PartDefinition cube_r122 = RLeg3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(30, 62).mirror().addBox(-0.925F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-3.5494F, 0.0F, -1.8381F, 0.0F, 1.2043F, 0.0F));

		PartDefinition cube_r123 = RLeg3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(62, 22).mirror().addBox(-0.925F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-3.5494F, 0.0F, -1.8381F, 0.0F, 1.0734F, 0.0F));

		PartDefinition cube_r124 = RLeg3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(62, 18).mirror().addBox(-0.075F, -0.5F, -2.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3925F, 0.0F, -0.053F, 0.0F, 0.9861F, 0.0F));

		PartDefinition cube_r125 = RLeg3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(62, 10).mirror().addBox(-0.075F, -0.5F, -2.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.7746F, 0.0F, 0.736F, 0.0F, 1.117F, 0.0F));

		PartDefinition RLeg4 = RLeg3.addOrReplaceChild("RLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.1385F, 0.0F, -2.5311F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r126 = RLeg4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(50, 82).mirror().addBox(-1.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(82, 36).mirror().addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.8249F, 0.0F, 1.5772F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r127 = RLeg4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(82, 58).mirror().addBox(-0.2F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 82).mirror().addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.9165F, 0.0F, -0.1115F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r128 = RLeg4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(82, 51).mirror().addBox(0.7F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(54, 55).mirror().addBox(-1.9F, -0.5F, -0.375F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7971F, 0.0F, -0.5754F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r129 = RLeg4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(45, 55).mirror().addBox(-1.4F, -0.5F, -0.45F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6809F, 0.0F, 1.0736F, 0.0F, 0.1309F, 0.0F));

		PartDefinition RFoot2 = RLeg4.addOrReplaceChild("RFoot2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-8.7F, 0.0F, -3.7F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 82).mirror().addBox(-0.7F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.9241F, 0.0F, 0.4688F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r130 = RFoot2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(82, 64).mirror().addBox(0.175F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(82, 61).mirror().addBox(-0.625F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0F, -0.7F, 0.0F, -0.829F, 0.0F));

		PartDefinition Tail = Hip.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4278F, 9.4079F, -0.0281F, 0.1745F, -0.0049F));

		PartDefinition cube_r131 = Tail.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(92, 64).addBox(0.0F, -0.0068F, -0.1522F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6365F, 3.8902F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r132 = Tail.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(13, 45).mirror().addBox(-1.3F, 0.2F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(13, 45).addBox(0.3F, 0.2F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(30, 30).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.175F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r133 = Tail.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(42, 92).addBox(0.0F, -1.3F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 92).addBox(0.0F, -1.2F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.15F, -5.675F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r134 = Tail.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(91, 17).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4714F, -0.2134F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail5 = Tail.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3483F, 4.7F, 0.0177F, 0.1745F, 0.0031F));

		PartDefinition cube_r135 = tail5.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(92, 75).addBox(0.0F, -1.4F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.913F, 3.5151F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r136 = tail5.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(92, 68).addBox(0.0F, -0.7F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1185F, 1.4412F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r137 = tail5.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(27, 55).mirror().addBox(-1.3F, 0.2F, 6.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 55).addBox(0.3F, 0.2F, 6.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(75, 90).addBox(-0.5F, -0.3F, 9.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(36, 16).addBox(-0.5F, -0.3F, 4.925F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.55F, -5.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r138 = tail5.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(92, 60).addBox(0.0F, -1.3F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 56).addBox(0.0F, -1.3F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -10.6F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail2 = tail5.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(38, 7).addBox(-0.5F, -0.65F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4912F, 5.2434F, -0.0176F, 0.1309F, -0.0023F));

		PartDefinition cube_r139 = Tail2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(6, 93).addBox(0.0F, -0.825F, 1.35F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 38).addBox(0.0F, -0.675F, -0.675F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1914F, 2.5887F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r140 = Tail2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(3, 93).addBox(0.0F, -0.7F, -0.65F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1914F, 0.5887F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r141 = Tail2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(93, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3171F, 3.9333F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r142 = Tail2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 93).addBox(0.0F, 0.0F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3182F, 1.9185F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r143 = Tail2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(85, 92).addBox(0.0F, -0.1F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2968F, 0.1061F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r144 = Tail2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(41, 49).mirror().addBox(-0.8F, 0.45F, -0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6F, 0.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r145 = Tail2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(41, 49).addBox(-0.2F, 0.45F, -0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6F, 0.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition tail6 = Tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5F, -0.45F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1904F, 4.6839F, 0.0447F, 0.218F, 0.0097F));

		PartDefinition cube_r146 = tail6.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(13, 93).addBox(0.0F, -0.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.526F, 2.7887F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r147 = tail6.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(51, 95).addBox(0.0F, -0.925F, 3.45F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9914F, -0.5113F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r148 = tail6.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(91, 9).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4271F, 0.8739F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r149 = tail6.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(91, 13).addBox(0.0F, -0.975F, 3.35F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9914F, -2.4113F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r150 = tail6.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(28, 44).mirror().addBox(-0.8F, 0.45F, 4.9F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4F, -5.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r151 = tail6.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(28, 44).addBox(-0.2F, 0.45F, 4.9F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4F, -5.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition Tail3 = tail6.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(43, 42).addBox(-0.5F, -0.45F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0253F, 4.7996F, -0.0366F, 0.3034F, -0.0942F));

		PartDefinition cube_r152 = Tail3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(93, 91).addBox(0.0F, -1.7F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 93).addBox(0.0F, -1.45F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 93).addBox(0.0F, -1.175F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9914F, -5.7113F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r153 = Tail3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(68, 93).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4902F, 3.8948F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r154 = Tail3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(65, 93).addBox(0.0F, -0.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4946F, 1.8357F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r155 = Tail3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(45, 93).addBox(0.0F, -0.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4979F, -0.2086F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail7 = Tail3.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(43, 28).addBox(-0.5F, -0.39F, -0.1729F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0687F, 4.6731F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r156 = tail7.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(94, 12).addBox(0.0F, -1.8F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 8).addBox(0.0F, -1.7F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9314F, -10.6842F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail7.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(74, 93).addBox(0.0F, -0.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4491F, 2.9367F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r158 = tail7.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(71, 93).addBox(0.0F, -0.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4491F, 0.9367F, 0.6283F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(30, 37).addBox(-0.5F, -0.39F, -0.1729F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0055F, 4.6751F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r159 = tail8.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(95, 56).addBox(0.0F, -2.0F, 19.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 95).addBox(0.0F, -1.9F, 17.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 16).addBox(0.0F, -1.9F, 15.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9314F, -15.6842F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r160 = tail8.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(48, 95).addBox(0.0F, -0.5F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4469F, 4.0034F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r161 = tail8.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(50, 91).addBox(0.0F, -0.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3469F, 1.9663F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r162 = tail8.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(77, 93).addBox(0.0F, -0.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5469F, -0.0337F, 0.6283F, 0.0F, 0.0F));

		PartDefinition Tail4 = tail8.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.185F, 4.7271F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r163 = Tail4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(95, 71).addBox(0.0F, -1.25F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 95).addBox(0.0F, -1.25F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r164 = Tail4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(60, 95).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2064F, 3.9338F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r165 = Tail4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(95, 59).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1064F, 1.8967F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r166 = Tail4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(90, 79).addBox(-0.5F, -0.35F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(42, 0).addBox(-0.5F, -0.35F, -1.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.5F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail9 = Tail4.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5529F, 5.2639F, -0.0452F, -0.2615F, 0.0117F));

		PartDefinition cube_r167 = tail9.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(43, 35).addBox(-0.5F, -0.35F, 3.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.54F, -3.5729F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r168 = tail9.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(95, 86).addBox(0.0F, -1.05F, 8.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 95).addBox(0.0F, -1.15F, 4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 95).addBox(0.0F, -1.15F, 6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.54F, -4.5729F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r169 = tail9.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(95, 65).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0642F, 2.9648F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r170 = tail9.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(95, 62).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7664F, 0.8981F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7046F, 4.7044F, -0.0472F, -0.3923F, 0.0181F));

		PartDefinition cube_r171 = tail10.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(94, 95).addBox(0.0F, -0.85F, 12.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 59).addBox(0.0F, -0.95F, 10.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -9.6F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r172 = tail10.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(95, 68).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.503F, -0.0104F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r173 = tail10.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, -0.35F, 8.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3F, -8.6F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6707F, 4.6274F, -0.1007F, -0.5214F, 0.0503F));

		PartDefinition cube_r174 = tail11.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(15, 38).addBox(-0.5F, -0.35F, 8.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3F, -8.6F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6413F, 4.5024F, -0.0481F, -0.4359F, 0.0203F));

		PartDefinition cube_r175 = tail12.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.35F, 8.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3F, -8.5F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Chest = Mesosaurus.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(92, 27).addBox(0.0F, -1.175F, -5.775F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3224F, -6.275F, 0.0131F, 0.0873F, 0.0011F));

		PartDefinition cube_r176 = Chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(15, 30).addBox(-0.5F, -0.25F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.275F, -5.7F, 0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r177 = Chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(33, 92).addBox(0.0F, -1.55F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.225F, -1.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r178 = Chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(30, 92).addBox(0.0F, -1.35F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.125F, -3.8F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r179 = Chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(63, 55).mirror().addBox(-5.2479F, -1.4312F, -0.3353F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1493F, -1.4791F, -0.0101F, 0.3129F, -1.4322F));

		PartDefinition cube_r180 = Chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(50, 70).mirror().addBox(-2.6623F, -0.1155F, -0.3353F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1493F, -1.4791F, 0.1519F, 0.2748F, -0.886F));

		PartDefinition cube_r181 = Chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(38, 28).mirror().addBox(-0.6232F, 0.2504F, -0.3327F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.1493F, -1.4791F, 0.3079F, 0.1394F, -0.3463F));

		PartDefinition cube_r182 = Chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(23, 59).mirror().addBox(-5.2479F, -1.4312F, -0.3354F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.2493F, -3.4791F, -0.0037F, 0.3561F, -1.4301F));

		PartDefinition cube_r183 = Chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(70, 27).mirror().addBox(-2.6623F, -0.1155F, -0.3354F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.2493F, -3.4791F, 0.1808F, 0.3085F, -0.8777F));

		PartDefinition cube_r184 = Chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(25, 94).mirror().addBox(-0.6232F, 0.2504F, -0.3328F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.2493F, -3.4791F, 0.3495F, 0.1541F, -0.3402F));

		PartDefinition cube_r185 = Chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(70, 29).mirror().addBox(-4.2479F, -1.4312F, -0.3354F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.3493F, -5.4791F, 0.017F, 0.4857F, -1.4217F));

		PartDefinition cube_r186 = Chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(70, 31).mirror().addBox(-2.6623F, -0.1155F, -0.3354F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.3493F, -5.4791F, 0.2718F, 0.408F, -0.8457F));

		PartDefinition cube_r187 = Chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(95, 27).mirror().addBox(-0.6232F, 0.2504F, -0.3328F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.3493F, -5.4791F, 0.4752F, 0.1964F, -0.3183F));

		PartDefinition cube_r188 = Chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(95, 27).addBox(-0.3768F, 0.2504F, -0.3328F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3493F, -5.4791F, 0.4752F, -0.1964F, 0.3183F));

		PartDefinition cube_r189 = Chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(70, 31).addBox(0.6623F, -0.1155F, -0.3354F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3493F, -5.4791F, 0.2718F, -0.408F, 0.8457F));

		PartDefinition cube_r190 = Chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(70, 29).addBox(2.2479F, -1.4312F, -0.3354F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.3493F, -5.4791F, 0.017F, -0.4857F, 1.4217F));

		PartDefinition cube_r191 = Chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(25, 94).addBox(-0.3768F, 0.2504F, -0.3328F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2493F, -3.4791F, 0.3495F, -0.1541F, 0.3402F));

		PartDefinition cube_r192 = Chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(70, 27).addBox(0.6623F, -0.1155F, -0.3354F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2493F, -3.4791F, 0.1808F, -0.3085F, 0.8777F));

		PartDefinition cube_r193 = Chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(49, 18).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.2257F, -0.0214F, -0.2836F, 0.0F, 0.0F));

		PartDefinition cube_r194 = Chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(23, 59).addBox(2.2479F, -1.4312F, -0.3354F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.2493F, -3.4791F, -0.0037F, -0.3561F, 1.4301F));

		PartDefinition cube_r195 = Chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(38, 28).addBox(-0.3768F, 0.2504F, -0.3327F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1493F, -1.4791F, 0.3079F, -0.1394F, 0.3463F));

		PartDefinition cube_r196 = Chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(50, 70).addBox(0.6623F, -0.1155F, -0.3353F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1493F, -1.4791F, 0.1519F, -0.2748F, 0.886F));

		PartDefinition cube_r197 = Chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(63, 55).addBox(2.2479F, -1.4312F, -0.3353F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 0.1493F, -1.4791F, -0.0101F, -0.3129F, 1.4322F));

		PartDefinition bone3 = Chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.7F, 0.5493F, -4.4791F));

		PartDefinition cube_r198 = bone3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(0, 68).addBox(0.0F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5301F, 3.8793F, -0.9857F, 1.0248F, -0.5684F, 0.0497F));

		PartDefinition cube_r199 = bone3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(18, 55).addBox(-2.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5869F, 4.0338F, 0.0483F, 1.2953F, -0.0673F, -0.1124F));

		PartDefinition cube_r200 = bone3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(60, 6).addBox(-0.4972F, -0.5468F, -0.5013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F))
				.texOffs(75, 81).addBox(-0.4972F, -1.5468F, -0.2013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F))
				.texOffs(0, 60).addBox(-0.4972F, -0.9468F, -0.5013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.2165F, 2.9924F, 0.2388F, 2.1129F, 0.1024F, 0.2374F));

		PartDefinition cube_r201 = bone3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(70, 33).addBox(-0.4972F, -1.4623F, -1.3308F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(2.2165F, 2.9924F, 0.2388F, -1.5522F, 0.1024F, 0.2374F));

		PartDefinition cube_r202 = bone3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(70, 81).addBox(-0.4972F, -0.744F, 0.0469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.2165F, 2.9924F, 0.2388F, 0.7603F, 0.1024F, 0.2374F));

		PartDefinition cube_r203 = bone3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(53, 22).addBox(-0.4972F, -0.2024F, -0.7159F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(2.2165F, 2.9924F, 0.2388F, -0.4178F, 0.1024F, 0.2374F));

		PartDefinition cube_r204 = bone3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(23, 61).addBox(-0.4972F, 0.5105F, 0.1593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(2.2165F, 2.9924F, 0.2388F, -0.0687F, 0.1024F, 0.2374F));

		PartDefinition cube_r205 = bone3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(82, 24).addBox(-0.4972F, -0.1476F, -0.5228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F))
				.texOffs(82, 6).addBox(-0.4972F, -0.1476F, -0.9228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(7, 61).addBox(-0.4972F, 0.4524F, -1.2728F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2165F, 2.9924F, 0.2388F, -0.1996F, 0.1024F, 0.2374F));

		PartDefinition cube_r206 = bone3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(80, 81).addBox(-0.4972F, -1.3118F, -1.7676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.2165F, 2.9924F, 0.2388F, 0.9785F, 0.1024F, 0.2374F));

		PartDefinition cube_r207 = bone3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(65, 81).addBox(-0.4972F, -0.5852F, 0.6478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2165F, 2.9924F, 0.2388F, 2.3747F, 0.1024F, 0.2374F));

		PartDefinition cube_r208 = bone3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(81, 55).addBox(-0.4972F, 0.6029F, -0.3828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.2165F, 2.9924F, 0.2388F, -2.774F, 0.1024F, 0.2374F));

		PartDefinition cube_r209 = bone3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(45, 81).addBox(-0.4972F, -0.5525F, -1.5929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2165F, 2.9924F, 0.2388F, -1.5086F, 0.1024F, 0.2374F));

		PartDefinition cube_r210 = bone3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(81, 21).addBox(-0.4972F, -1.633F, -0.0948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.2165F, 2.9924F, 0.2388F, -0.1123F, 0.1024F, 0.2374F));

		PartDefinition cube_r211 = bone3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(25, 80).addBox(-0.4972F, 0.9865F, -0.8956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.2165F, 2.9924F, 0.2388F, 2.2875F, 0.1024F, 0.2374F));

		PartDefinition cube_r212 = bone3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(30, 80).addBox(-0.4972F, 0.0417F, 0.7787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(2.2165F, 2.9924F, 0.2388F, 1.153F, 0.1024F, 0.2374F));

		PartDefinition bone5 = Chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-0.7F, 0.5493F, -4.4791F));

		PartDefinition cube_r213 = bone5.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-1.0F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5301F, 3.8793F, -0.9857F, 1.0248F, 0.5684F, -0.0497F));

		PartDefinition cube_r214 = bone5.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(18, 55).mirror().addBox(-0.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5869F, 4.0338F, 0.0483F, 1.2953F, 0.0673F, 0.1124F));

		PartDefinition cube_r215 = bone5.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(60, 6).mirror().addBox(-0.5028F, -0.5468F, -0.5013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(75, 81).mirror().addBox(-0.5028F, -1.5468F, -0.2013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false)
				.texOffs(0, 60).mirror().addBox(-0.5028F, -0.9468F, -0.5013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.2165F, 2.9924F, 0.2388F, 2.1129F, -0.1024F, -0.2374F));

		PartDefinition cube_r216 = bone5.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(70, 33).mirror().addBox(-0.5028F, -1.4623F, -1.3308F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-2.2165F, 2.9924F, 0.2388F, -1.5522F, -0.1024F, -0.2374F));

		PartDefinition cube_r217 = bone5.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(70, 81).mirror().addBox(-0.5028F, -0.744F, 0.0469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.2165F, 2.9924F, 0.2388F, 0.7603F, -0.1024F, -0.2374F));

		PartDefinition cube_r218 = bone5.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(53, 22).mirror().addBox(-0.5028F, -0.2024F, -0.7159F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-2.2165F, 2.9924F, 0.2388F, -0.4178F, -0.1024F, -0.2374F));

		PartDefinition cube_r219 = bone5.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(23, 61).mirror().addBox(-0.5028F, 0.5105F, 0.1593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-2.2165F, 2.9924F, 0.2388F, -0.0687F, -0.1024F, -0.2374F));

		PartDefinition cube_r220 = bone5.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(82, 24).mirror().addBox(-0.5028F, -0.1476F, -0.5228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false)
				.texOffs(82, 6).mirror().addBox(-0.5028F, -0.1476F, -0.9228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(7, 61).mirror().addBox(-0.5028F, 0.4524F, -1.2728F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2165F, 2.9924F, 0.2388F, -0.1996F, -0.1024F, -0.2374F));

		PartDefinition cube_r221 = bone5.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(80, 81).mirror().addBox(-0.5028F, -1.3118F, -1.7676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.2165F, 2.9924F, 0.2388F, 0.9785F, -0.1024F, -0.2374F));

		PartDefinition cube_r222 = bone5.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(65, 81).mirror().addBox(-0.5028F, -0.5852F, 0.6478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2165F, 2.9924F, 0.2388F, 2.3747F, -0.1024F, -0.2374F));

		PartDefinition cube_r223 = bone5.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(81, 55).mirror().addBox(-0.5028F, 0.6029F, -0.3828F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.2165F, 2.9924F, 0.2388F, -2.774F, -0.1024F, -0.2374F));

		PartDefinition cube_r224 = bone5.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(45, 81).mirror().addBox(-0.5028F, -0.5525F, -1.5929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2165F, 2.9924F, 0.2388F, -1.5086F, -0.1024F, -0.2374F));

		PartDefinition cube_r225 = bone5.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(81, 21).mirror().addBox(-0.5028F, -1.633F, -0.0948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.2165F, 2.9924F, 0.2388F, -0.1123F, -0.1024F, -0.2374F));

		PartDefinition cube_r226 = bone5.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(25, 80).mirror().addBox(-0.5028F, 0.9865F, -0.8956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.2165F, 2.9924F, 0.2388F, 2.2875F, -0.1024F, -0.2374F));

		PartDefinition cube_r227 = bone5.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(30, 80).mirror().addBox(-0.5028F, 0.0417F, 0.7787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.2165F, 2.9924F, 0.2388F, 1.153F, -0.1024F, -0.2374F));

		PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(51, 7).addBox(-0.5F, -0.35F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(36, 71).addBox(0.0F, -1.1F, -2.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.39F, -5.6326F, 0.1285F, -0.3031F, -0.0385F));

		PartDefinition cube_r228 = Neck.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(69, 23).mirror().addBox(-2.0F, 0.2F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.25F, -1.6F, 0.3509F, 0.6861F, -0.7257F));

		PartDefinition cube_r229 = Neck.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(69, 23).addBox(0.0F, 0.2F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.25F, -1.6F, 0.3509F, -0.6861F, 0.7257F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(56, 35).addBox(-0.5F, -0.725F, -2.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(65, 90).addBox(-0.5F, -0.725F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3895F, -2.5931F, -0.1595F, -0.1724F, 0.0276F));

		PartDefinition cube_r230 = Neck2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(33, 69).mirror().addBox(-1.6F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.15F, -1.0F, 0.2918F, 0.7019F, -0.841F));

		PartDefinition cube_r231 = Neck2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(33, 69).addBox(-0.4F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.15F, -1.0F, 0.2918F, -0.7019F, 0.841F));

		PartDefinition cube_r232 = Neck2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(95, 74).addBox(0.0F, -0.75F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -2.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(16, 59).addBox(-0.5F, -0.425F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2939F, -2.4306F, -0.2599F, -0.1624F, 0.0738F));

		PartDefinition cube_r233 = Neck3.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(92, 31).mirror().addBox(-0.8577F, 0.1393F, -0.4813F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, -0.5F, 0.5672F, 0.5672F, -0.5672F));

		PartDefinition cube_r234 = Neck3.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(92, 31).addBox(-0.1423F, 0.1393F, -0.4813F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, -0.5F, 0.5672F, -0.5672F, 0.5672F));

		PartDefinition cube_r235 = Neck3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(95, 77).addBox(0.0F, -0.5F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, -1.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create().texOffs(40, 80).addBox(-0.5F, -0.45F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(9, 54).addBox(-0.5F, -0.45F, -3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(95, 83).addBox(0.0F, -1.0154F, -1.3095F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0426F, -1.6503F, -0.4097F, -0.2815F, 0.1201F));

		PartDefinition cube_r236 = Neck4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(92, 36).mirror().addBox(-0.8955F, 0.1704F, -0.4942F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, -0.8F, 0.4572F, 0.6555F, -0.8507F));

		PartDefinition cube_r237 = Neck4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(95, 29).mirror().addBox(-0.9358F, 0.1884F, -0.5196F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.15F, -2.8F, 0.4944F, 0.8438F, -1.0669F));

		PartDefinition cube_r238 = Neck4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(95, 29).addBox(-0.0642F, 0.1884F, -0.5196F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, -2.8F, 0.4944F, -0.8438F, 1.0669F));

		PartDefinition cube_r239 = Neck4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(92, 36).addBox(-0.1045F, 0.1704F, -0.4942F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.15F, -0.8F, 0.4572F, -0.6555F, 0.8507F));

		PartDefinition cube_r240 = Neck4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(95, 80).addBox(0.0F, -0.3F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.85F, -2.3F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4508F, -3.3355F, -0.0746F, 0.0F, 0.0F));

		PartDefinition cube_r241 = Head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(28, 66).addBox(-1.5F, -0.2F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.5F, -0.6983F, 0.306F, -0.3971F, 0.0F, 0.0F));

		PartDefinition cube_r242 = Head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(66, 3).addBox(-1.5F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.5F, -1.2976F, 0.3348F, -1.6188F, 0.0F, 0.0F));

		PartDefinition cube_r243 = Head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(66, 0).addBox(-1.5F, -0.8F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.5F, -1.5769F, -0.1962F, -2.0551F, 0.0F, 0.0F));

		PartDefinition cube_r244 = Head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(30, 86).addBox(-1.0F, -0.625F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(65, 63).addBox(-1.5F, -0.8F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.5F, -1.6578F, -0.7908F, 3.0063F, 0.0F, 0.0F));

		PartDefinition cube_r245 = Head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(65, 60).addBox(-1.5F, -0.2F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.5F, -1.6866F, -1.3901F, 1.5228F, 0.0F, 0.0F));

		PartDefinition cube_r246 = Head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(65, 38).addBox(-1.5F, -0.2F, -0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.5F, -1.6631F, -1.9896F, 0.0393F, 0.0F, 0.0F));

		PartDefinition cube_r247 = Head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(37, 62).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, -1.3872F, -3.26F, 0.1265F, 0.0F, 0.0F));

		PartDefinition cube_r248 = Head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(63, 26).addBox(-0.5F, -0.625F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F))
				.texOffs(35, 66).addBox(-1.0F, -0.625F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, -0.8658F, -3.6584F, 0.2138F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.0F, -0.0106F, -0.3781F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(0, 84).addBox(-0.5F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.85F, -1.3992F, -12.1811F, -1.3046F, 0.0F, 0.0F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(40, 83).addBox(-0.5F, -0.65F, -1.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(35, 83).addBox(-0.5F, -0.65F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(30, 83).addBox(-0.5F, -0.65F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(25, 83).addBox(-0.5F, -0.65F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.85F, -1.0008F, -11.0101F, -0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(5, 84).addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.2F, -1.232F, -2.1342F, 0.217F, 0.1705F, 0.0374F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(15, 75).addBox(-0.7958F, -0.215F, -0.1917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.025F, -0.5655F, -2.2467F, 2.9655F, 0.4035F, -0.3365F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(5, 75).addBox(-0.8021F, -0.2023F, -0.2354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.05F, -0.5655F, -1.6968F, 3.1188F, 0.1168F, -0.3337F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(75, 84).addBox(-0.5F, -0.5938F, -0.248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.35F, -0.8405F, -1.1217F, 3.1198F, 0.0F, -0.2967F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(63, 49).addBox(-0.5F, -0.2919F, -1.839F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.35F, -0.8405F, -1.1217F, 3.0761F, 0.0F, -0.2967F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(75, 33).addBox(-0.7958F, -0.0564F, -0.2408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.025F, -0.5655F, -2.2467F, 3.1051F, 0.4035F, -0.3365F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(85, 39).addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.4218F, -0.9226F, -1.907F, -3.0585F, 0.11F, -0.2461F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(86, 12).addBox(-0.499F, -0.5809F, -0.2094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.441F, -1.1273F, -1.4725F, -0.2454F, 0.0345F, -0.1572F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(86, 18).addBox(-0.499F, -0.3524F, -0.5492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(10, 86).addBox(-0.499F, -0.2024F, -0.5492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.441F, -1.1273F, -1.4725F, -1.3799F, 0.0345F, -0.1572F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(86, 9).addBox(-0.8068F, -0.2107F, -0.7965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0111F, -0.7126F, -1.6804F, -1.9822F, 0.1169F, -0.2908F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(86, 15).addBox(-0.5068F, -0.2839F, -0.7618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.4096F, -1.0625F, -1.4791F, 2.5089F, 0.0F, -0.2967F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(85, 83).addBox(-0.5068F, -0.6414F, -0.5575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.4096F, -1.0625F, -1.4791F, -3.0325F, 0.0F, -0.2967F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(85, 33).addBox(-0.5F, -0.3064F, -0.2766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.35F, -0.8405F, -1.1217F, -3.0325F, 0.0F, -0.2967F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(70, 84).addBox(-0.5F, -0.5893F, -0.8207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.35F, -0.8405F, -1.1217F, 2.9889F, 0.0F, -0.2967F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(80, 84).addBox(-0.5F, -0.536F, -1.8999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(65, 84).addBox(-0.5F, -0.536F, -1.3999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.35F, -0.8405F, -1.1217F, 2.9016F, 0.0F, -0.2967F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(45, 84).addBox(-0.8F, -0.175F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.4594F, -1.1579F, -3.1841F, -0.1085F, 0.3156F, -0.0186F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(15, 84).addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.3042F, -1.1066F, -2.7116F, 0.2257F, 0.3238F, 0.0729F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(85, 42).addBox(-0.5263F, -0.7496F, 1.8465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(70, 45).addBox(-0.5263F, -1.5996F, 1.5465F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.8235F, -0.6728F, -4.7335F, -0.2427F, 0.1046F, -0.4748F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(45, 70).addBox(-0.5263F, -1.3098F, 1.2707F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(70, 41).addBox(-0.5263F, -1.2098F, 0.9707F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(14, 67).addBox(-0.5263F, -1.0098F, 0.6707F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(40, 70).addBox(-0.5263F, -1.2098F, 0.3707F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.8235F, -0.6728F, -4.7335F, -0.1991F, 0.1046F, -0.4748F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(85, 48).addBox(-0.5272F, -0.2696F, -3.216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(50, 85).addBox(-0.5272F, -0.2196F, -3.816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(85, 45).addBox(-0.5272F, -0.2446F, -2.916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(85, 80).addBox(-0.5272F, -0.3946F, -1.416F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.8235F, -0.6728F, -4.7335F, -0.1271F, -0.0321F, -0.4747F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(47, 75).addBox(-0.524F, -0.0322F, -3.7169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(76, 21).addBox(-0.524F, -0.0822F, -4.6169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(76, 18).addBox(-0.524F, 0.1178F, -4.6169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(55, 73).addBox(-0.524F, 0.3178F, -4.6169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(76, 9).addBox(-0.524F, 0.5178F, -4.6169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(5, 78).addBox(-0.524F, 0.1678F, -7.7169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(77, 27).addBox(-0.524F, 0.1428F, -7.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(25, 77).addBox(-0.524F, 0.3428F, -7.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(78, 3).addBox(-0.524F, 0.5428F, -7.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(67, 78).addBox(-0.524F, 0.1678F, -7.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(77, 24).addBox(-0.524F, 0.3678F, -7.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(73, 3).addBox(-0.524F, 0.5678F, -7.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(65, 73).addBox(-0.524F, 0.0678F, -6.7169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(20, 77).addBox(-0.524F, 0.2678F, -6.7169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(76, 15).addBox(-0.524F, 0.4678F, -6.7169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(45, 78).addBox(-0.524F, 0.1678F, -6.4169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(77, 6).addBox(-0.524F, 0.3678F, -6.4169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(73, 0).addBox(-0.524F, 0.5678F, -6.4169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(62, 76).addBox(-0.524F, 0.0178F, -6.1169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(57, 76).addBox(-0.524F, 0.2178F, -6.1169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(15, 78).addBox(-0.524F, 0.4178F, -6.1169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(76, 12).addBox(-0.524F, 0.6178F, -6.1169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(90, 85).addBox(-0.524F, 0.1178F, -5.8169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(80, 90).addBox(-0.524F, 0.3178F, -5.8169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(90, 82).addBox(-0.524F, 0.5178F, -5.8169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(50, 72).addBox(-0.524F, 0.1178F, -5.5169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(71, 57).addBox(-0.524F, 0.4178F, -5.2169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(31, 71).addBox(-0.524F, 0.0178F, -5.2169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(26, 71).addBox(-0.524F, 0.2178F, -5.2169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(62, 70).addBox(-0.524F, 0.0178F, -4.9169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(57, 70).addBox(-0.524F, 0.2178F, -4.9169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(67, 70).addBox(-0.524F, 0.4178F, -4.9169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(75, 75).addBox(-0.524F, 0.1178F, -4.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(70, 75).addBox(-0.524F, -0.0822F, -4.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(76, 56).addBox(-0.524F, -0.0822F, -4.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(52, 76).addBox(-0.524F, 0.1178F, -4.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(60, 73).addBox(-0.524F, 0.3178F, -4.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(75, 49).addBox(-0.524F, 0.5178F, -4.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(78, 0).addBox(-0.524F, 0.1678F, -3.7169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(55, 85).addBox(-0.524F, -0.1322F, -3.4169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(10, 74).addBox(-0.524F, 0.0678F, -3.4169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(30, 77).addBox(-0.524F, 0.2678F, -3.4169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(75, 46).addBox(-0.524F, 0.4678F, -3.4169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(75, 43).addBox(-0.524F, -0.0822F, -3.1169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(72, 72).addBox(-0.524F, -0.0572F, -2.8169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(15, 26).addBox(-0.524F, -0.5572F, -2.5169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(52, 66).addBox(-0.524F, -0.5072F, -2.2169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(60, 85).addBox(-0.524F, -0.2072F, -1.9169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(77, 30).addBox(-0.524F, -0.0072F, -1.9169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(72, 69).addBox(-0.524F, 0.1928F, -1.9169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(47, 66).addBox(-0.524F, -0.6072F, -1.6169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(22, 74).addBox(-0.524F, 0.1928F, -1.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(85, 73).addBox(-0.524F, -0.2072F, -1.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(75, 40).addBox(-0.524F, -0.0072F, -1.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(42, 66).addBox(-0.524F, -0.8572F, -1.0169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(20, 51).addBox(-0.524F, -0.8822F, -0.7169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.8235F, -0.6728F, -4.8335F, -0.1271F, -0.0321F, -0.6928F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(70, 49).addBox(-0.8923F, 5.9932F, -3.778F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.8235F, -0.6728F, -4.8335F, -1.1771F, -0.07F, -0.3774F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(35, 50).addBox(-0.524F, -0.8822F, -0.4169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.8235F, -0.6728F, -4.8335F, -0.0958F, -0.0741F, -0.6421F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(67, 66).addBox(-0.5367F, -1.0828F, -0.6315F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(67, 6).addBox(-0.5367F, -1.0828F, -0.3315F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.7616F, -0.6416F, -4.3383F, -0.1195F, 0.0711F, -0.5685F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(25, 86).addBox(-0.45F, -0.475F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(86, 21).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(20, 86).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.732F, -0.9915F, -4.073F, 0.0914F, 0.1656F, 0.0124F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(63, 45).addBox(-0.9F, 0.075F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.3F, -1.3766F, -2.8819F, -0.0482F, 0.1656F, 0.0124F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(63, 30).addBox(-0.9F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.3F, -1.3766F, -2.8819F, 0.1263F, 0.1656F, 0.0124F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(56, 27).addBox(-0.5F, -0.65F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.85F, -0.9158F, -9.7128F, -0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(56, 31).addBox(-0.5F, -0.65F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.85F, -0.8582F, -8.5142F, -0.048F, 0.0F, 0.0F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(14, 63).addBox(-0.5F, -0.65F, -0.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.85F, -0.8582F, -8.5142F, -0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(58, 62).addBox(-0.5F, -0.65F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.85F, -0.8412F, -7.2143F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(63, 41).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9F, -0.7413F, -7.2174F, -0.048F, 0.0F, 0.0F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(51, 62).addBox(-0.5F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.9F, -0.7229F, -5.8175F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(63, 34).addBox(-0.5F, -0.525F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.9F, -0.7779F, -4.4186F, -0.048F, 0.0F, 0.0F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(44, 62).addBox(-0.5F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9F, -0.7779F, -4.4186F, 0.0393F, 0.0F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.0106F, -0.3781F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.5F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.85F, -1.3992F, -12.1811F, -1.3046F, 0.0F, 0.0F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(40, 83).mirror().addBox(-0.5F, -0.65F, -1.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(35, 83).mirror().addBox(-0.5F, -0.65F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(30, 83).mirror().addBox(-0.5F, -0.65F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(25, 83).mirror().addBox(-0.5F, -0.65F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.85F, -1.0008F, -11.0101F, -0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.2F, -1.232F, -2.1342F, 0.217F, -0.1705F, -0.0374F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(15, 75).mirror().addBox(-0.2042F, -0.215F, -0.1917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.025F, -0.5655F, -2.2467F, 2.9655F, -0.4035F, 0.3365F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(5, 75).mirror().addBox(-0.1979F, -0.2023F, -0.2354F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.05F, -0.5655F, -1.6968F, 3.1188F, -0.1168F, 0.3337F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(75, 84).mirror().addBox(-0.5F, -0.5938F, -0.248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.35F, -0.8405F, -1.1217F, 3.1198F, 0.0F, 0.2967F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(63, 49).mirror().addBox(-0.5F, -0.2919F, -1.839F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.35F, -0.8405F, -1.1217F, 3.0761F, 0.0F, 0.2967F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(75, 33).mirror().addBox(-0.2042F, -0.0564F, -0.2408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.025F, -0.5655F, -2.2467F, 3.1051F, -0.4035F, 0.3365F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(85, 39).mirror().addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.4218F, -0.9226F, -1.907F, -3.0585F, -0.11F, 0.2461F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(86, 12).mirror().addBox(-0.501F, -0.5809F, -0.2094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.441F, -1.1273F, -1.4725F, -0.2454F, -0.0345F, 0.1572F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(86, 18).mirror().addBox(-0.501F, -0.3524F, -0.5492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(10, 86).mirror().addBox(-0.501F, -0.2024F, -0.5492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(0.441F, -1.1273F, -1.4725F, -1.3799F, -0.0345F, 0.1572F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(86, 9).mirror().addBox(-0.1932F, -0.2107F, -0.7965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.0111F, -0.7126F, -1.6804F, -1.9822F, -0.1169F, 0.2908F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(86, 15).mirror().addBox(-0.4932F, -0.2839F, -0.7618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(0.4096F, -1.0625F, -1.4791F, 2.5089F, 0.0F, 0.2967F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(85, 83).mirror().addBox(-0.4932F, -0.6414F, -0.5575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.4096F, -1.0625F, -1.4791F, -3.0325F, 0.0F, 0.2967F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(85, 33).mirror().addBox(-0.5F, -0.3064F, -0.2766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.35F, -0.8405F, -1.1217F, -3.0325F, 0.0F, 0.2967F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(70, 84).mirror().addBox(-0.5F, -0.5893F, -0.8207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.35F, -0.8405F, -1.1217F, 2.9889F, 0.0F, 0.2967F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(80, 84).mirror().addBox(-0.5F, -0.536F, -1.8999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(65, 84).mirror().addBox(-0.5F, -0.536F, -1.3999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.35F, -0.8405F, -1.1217F, 2.9016F, 0.0F, 0.2967F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(45, 84).mirror().addBox(-0.2F, -0.175F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.4594F, -1.1579F, -3.1841F, -0.1085F, -0.3156F, 0.0186F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(15, 84).mirror().addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.3042F, -1.1066F, -2.7116F, 0.2257F, -0.3238F, -0.0729F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(85, 42).mirror().addBox(-0.4737F, -0.7496F, 1.8465F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(70, 45).mirror().addBox(-0.4737F, -1.5996F, 1.5465F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.8235F, -0.6728F, -4.7335F, -0.2427F, -0.1046F, 0.4748F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(45, 70).mirror().addBox(-0.4737F, -1.3098F, 1.2707F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(70, 41).mirror().addBox(-0.4737F, -1.2098F, 0.9707F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(14, 67).mirror().addBox(-0.4737F, -1.0098F, 0.6707F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(40, 70).mirror().addBox(-0.4737F, -1.2098F, 0.3707F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.8235F, -0.6728F, -4.7335F, -0.1991F, -0.1046F, 0.4748F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(85, 48).mirror().addBox(-0.4728F, -0.2696F, -3.216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(50, 85).mirror().addBox(-0.4728F, -0.2196F, -3.816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(85, 45).mirror().addBox(-0.4728F, -0.2446F, -2.916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(85, 80).mirror().addBox(-0.4728F, -0.3946F, -1.416F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.8235F, -0.6728F, -4.7335F, -0.1271F, 0.0321F, 0.4747F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(47, 75).mirror().addBox(-0.476F, -0.0322F, -3.7169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(76, 21).mirror().addBox(-0.476F, -0.0822F, -4.6169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(76, 18).mirror().addBox(-0.476F, 0.1178F, -4.6169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(55, 73).mirror().addBox(-0.476F, 0.3178F, -4.6169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(76, 9).mirror().addBox(-0.476F, 0.5178F, -4.6169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(5, 78).mirror().addBox(-0.476F, 0.1678F, -7.7169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(77, 27).mirror().addBox(-0.476F, 0.1428F, -7.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(25, 77).mirror().addBox(-0.476F, 0.3428F, -7.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(78, 3).mirror().addBox(-0.476F, 0.5428F, -7.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(67, 78).mirror().addBox(-0.476F, 0.1678F, -7.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(77, 24).mirror().addBox(-0.476F, 0.3678F, -7.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(73, 3).mirror().addBox(-0.476F, 0.5678F, -7.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(65, 73).mirror().addBox(-0.476F, 0.0678F, -6.7169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(20, 77).mirror().addBox(-0.476F, 0.2678F, -6.7169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(76, 15).mirror().addBox(-0.476F, 0.4678F, -6.7169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(45, 78).mirror().addBox(-0.476F, 0.1678F, -6.4169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(77, 6).mirror().addBox(-0.476F, 0.3678F, -6.4169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(73, 0).mirror().addBox(-0.476F, 0.5678F, -6.4169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(62, 76).mirror().addBox(-0.476F, 0.0178F, -6.1169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(57, 76).mirror().addBox(-0.476F, 0.2178F, -6.1169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(15, 78).mirror().addBox(-0.476F, 0.4178F, -6.1169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(76, 12).mirror().addBox(-0.476F, 0.6178F, -6.1169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(90, 85).mirror().addBox(-0.476F, 0.1178F, -5.8169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(80, 90).mirror().addBox(-0.476F, 0.3178F, -5.8169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(90, 82).mirror().addBox(-0.476F, 0.5178F, -5.8169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(50, 72).mirror().addBox(-0.476F, 0.1178F, -5.5169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(71, 57).mirror().addBox(-0.476F, 0.4178F, -5.2169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(31, 71).mirror().addBox(-0.476F, 0.0178F, -5.2169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(26, 71).mirror().addBox(-0.476F, 0.2178F, -5.2169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(62, 70).mirror().addBox(-0.476F, 0.0178F, -4.9169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(57, 70).mirror().addBox(-0.476F, 0.2178F, -4.9169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(67, 70).mirror().addBox(-0.476F, 0.4178F, -4.9169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(75, 75).mirror().addBox(-0.476F, 0.1178F, -4.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(70, 75).mirror().addBox(-0.476F, -0.0822F, -4.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(76, 56).mirror().addBox(-0.476F, -0.0822F, -4.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(52, 76).mirror().addBox(-0.476F, 0.1178F, -4.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(60, 73).mirror().addBox(-0.476F, 0.3178F, -4.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(75, 49).mirror().addBox(-0.476F, 0.5178F, -4.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(78, 0).mirror().addBox(-0.476F, 0.1678F, -3.7169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(55, 85).mirror().addBox(-0.476F, -0.1322F, -3.4169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(10, 74).mirror().addBox(-0.476F, 0.0678F, -3.4169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(30, 77).mirror().addBox(-0.476F, 0.2678F, -3.4169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(75, 46).mirror().addBox(-0.476F, 0.4678F, -3.4169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(75, 43).mirror().addBox(-0.476F, -0.0822F, -3.1169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(72, 72).mirror().addBox(-0.476F, -0.0572F, -2.8169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(15, 26).mirror().addBox(-0.476F, -0.5572F, -2.5169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(52, 66).mirror().addBox(-0.476F, -0.5072F, -2.2169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(60, 85).mirror().addBox(-0.476F, -0.2072F, -1.9169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(77, 30).mirror().addBox(-0.476F, -0.0072F, -1.9169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(72, 69).mirror().addBox(-0.476F, 0.1928F, -1.9169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(47, 66).mirror().addBox(-0.476F, -0.6072F, -1.6169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(22, 74).mirror().addBox(-0.476F, 0.1928F, -1.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(85, 73).mirror().addBox(-0.476F, -0.2072F, -1.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(75, 40).mirror().addBox(-0.476F, -0.0072F, -1.3169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(42, 66).mirror().addBox(-0.476F, -0.8572F, -1.0169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(20, 51).mirror().addBox(-0.476F, -0.8822F, -0.7169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.8235F, -0.6728F, -4.8335F, -0.1271F, 0.0321F, 0.6928F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(70, 49).mirror().addBox(-0.1077F, 5.9932F, -3.778F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.8235F, -0.6728F, -4.8335F, -1.1771F, 0.07F, 0.3774F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(35, 50).mirror().addBox(-0.476F, -0.8822F, -0.4169F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.8235F, -0.6728F, -4.8335F, -0.0958F, 0.0741F, 0.6421F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(67, 66).mirror().addBox(-0.4633F, -1.0828F, -0.6315F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(67, 6).mirror().addBox(-0.4633F, -1.0828F, -0.3315F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.7616F, -0.6416F, -4.3383F, -0.1195F, -0.0711F, 0.5685F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(25, 86).mirror().addBox(-0.55F, -0.475F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(86, 21).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(20, 86).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.732F, -0.9915F, -4.073F, 0.0914F, -0.1656F, -0.0124F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(63, 45).mirror().addBox(-0.1F, 0.075F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.3F, -1.3766F, -2.8819F, -0.0482F, -0.1656F, -0.0124F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(63, 30).mirror().addBox(-0.1F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(0.3F, -1.3766F, -2.8819F, 0.1263F, -0.1656F, -0.0124F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(56, 27).mirror().addBox(-0.5F, -0.65F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.85F, -0.9158F, -9.7128F, -0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(56, 31).mirror().addBox(-0.5F, -0.65F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.85F, -0.8582F, -8.5142F, -0.048F, 0.0F, 0.0F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(14, 63).mirror().addBox(-0.5F, -0.65F, -0.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.85F, -0.8582F, -8.5142F, -0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(58, 62).mirror().addBox(-0.5F, -0.65F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.85F, -0.8412F, -7.2143F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(63, 41).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.9F, -0.7413F, -7.2174F, -0.048F, 0.0F, 0.0F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(51, 62).mirror().addBox(-0.5F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.9F, -0.7229F, -5.8175F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(63, 34).mirror().addBox(-0.5F, -0.525F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.9F, -0.7779F, -4.4186F, -0.048F, 0.0F, 0.0F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(44, 62).mirror().addBox(-0.5F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.9F, -0.7779F, -4.4186F, 0.0393F, 0.0F, 0.0F));

		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7999F, -5.9892F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1142F, 0.0264F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r323 = Jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(0, 75).addBox(1.1F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.8F, 0.1385F, -0.1386F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r324 = Jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(72, 78).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(72, 78).addBox(1.1F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8F, 0.3145F, 0.1288F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r325 = Jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(35, 77).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(35, 77).addBox(1.1F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.8F, 0.4381F, -0.2516F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r326 = Jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(77, 78).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(77, 78).addBox(1.1F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8F, 0.511F, -0.6449F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r327 = Jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(50, 79).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(50, 79).addBox(1.1F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.8F, 0.5319F, -1.0444F, -3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r328 = Jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(77, 36).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(77, 36).addBox(1.1F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8F, 0.5354F, -1.4444F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r329 = Jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(40, 77).mirror().addBox(-0.3F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(77, 71).mirror().addBox(-0.3F, -0.7F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(0, 78).mirror().addBox(-0.3F, -0.7F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.504F, -1.8431F, -0.1484F, -0.2269F, 0.0F));

		PartDefinition cube_r330 = Jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(56, 41).mirror().addBox(-0.3F, -0.7688F, -2.6697F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.504F, -1.8431F, -0.0785F, -0.2269F, 0.0F));

		PartDefinition cube_r331 = Jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(56, 45).mirror().addBox(-0.6121F, -0.9095F, -1.6106F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.504F, -4.1431F, -0.096F, -0.0698F, 0.0F));

		PartDefinition cube_r332 = Jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(36, 58).mirror().addBox(-0.6121F, -0.9531F, -2.8904F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.504F, -4.1431F, -0.0611F, -0.0698F, 0.0F));

		PartDefinition cube_r333 = Jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.6121F, -1.0414F, -4.8678F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.504F, -4.1431F, -0.0262F, -0.0698F, 0.0F));

		PartDefinition cube_r334 = Jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(26, 50).mirror().addBox(-0.3589F, -0.7945F, -2.5279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(26, 50).addBox(-0.241F, -0.7945F, -2.5279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.2F, 0.104F, -10.0431F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r335 = Jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(12, 71).mirror().addBox(-0.3589F, -2.8199F, -0.5859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(71, 14).mirror().addBox(-0.3589F, -3.0199F, -0.5859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(71, 14).addBox(-0.241F, -3.0199F, -0.5859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(12, 71).addBox(-0.241F, -2.8199F, -0.5859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.2F, 0.104F, -10.0431F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r336 = Jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(43, 58).mirror().addBox(-0.6121F, -1.0172F, -1.5571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.504F, -4.1431F, -0.0087F, -0.0698F, 0.0F));

		PartDefinition cube_r337 = Jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(50, 58).mirror().addBox(-0.3F, -0.9533F, -2.6256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.504F, -1.8431F, 0.0F, -0.2269F, 0.0F));

		PartDefinition cube_r338 = Jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(27, 74).mirror().addBox(-0.3F, -0.9369F, -1.2752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.504F, -1.8431F, -0.0087F, -0.2269F, 0.0F));

		PartDefinition cube_r339 = Jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(77, 52).mirror().addBox(-0.3F, -0.9929F, -0.8857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(77, 59).mirror().addBox(-0.3F, -0.9929F, -0.6857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.504F, -1.8431F, 0.0785F, -0.2269F, 0.0F));

		PartDefinition cube_r340 = Jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(57, 58).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(57, 58).addBox(1.1F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.8F, -0.1879F, -1.8832F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r341 = Jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(32, 74).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(37, 74).mirror().addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(37, 74).addBox(1.1F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(32, 74).addBox(1.1F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8F, -0.0348F, -0.7939F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r342 = Jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(10, 80).mirror().addBox(-0.5108F, -0.5518F, -0.4995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(55, 79).mirror().addBox(-0.5108F, -0.4517F, -0.1995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(77, 62).mirror().addBox(-0.5108F, -0.3767F, 0.1005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(35, 86).mirror().addBox(-0.5108F, -0.6517F, -0.7995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(40, 86).mirror().addBox(-0.4858F, -0.7267F, -1.0995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.5109F, -0.147F, -3.2556F, 0.301F, -0.2008F, -0.4069F));

		PartDefinition cube_r343 = Jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(77, 65).mirror().addBox(-0.5024F, 0.1248F, 1.8083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -0.296F, -6.5431F, 0.2537F, -0.0152F, -0.7385F));

		PartDefinition cube_r344 = Jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(60, 79).mirror().addBox(-0.4121F, -0.2175F, 1.5697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -0.296F, -6.5431F, 0.123F, -0.0585F, -0.7438F));

		PartDefinition cube_r345 = Jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(86, 54).mirror().addBox(-0.4121F, -0.4226F, 1.2832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(42, 74).mirror().addBox(-0.4121F, -0.3476F, 0.9832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(85, 86).mirror().addBox(-0.4121F, -0.4476F, 0.6832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(0, 87).mirror().addBox(-0.3871F, -0.4476F, 0.3832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(5, 87).mirror().addBox(-0.3871F, -0.5476F, 0.3832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false)
				.texOffs(87, 6).mirror().addBox(-0.3871F, -0.4476F, 0.0832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(15, 87).mirror().addBox(-0.3871F, -0.6476F, 0.0832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(87, 24).mirror().addBox(-0.3871F, -0.4976F, -0.2168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(87, 27).mirror().addBox(-0.3871F, -0.6976F, -0.2168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(87, 30).mirror().addBox(-0.3621F, -0.6476F, -0.5168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(87, 36).mirror().addBox(-0.3621F, -0.4476F, -0.5168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(45, 87).mirror().addBox(-0.3621F, -0.6226F, -0.8168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(87, 51).mirror().addBox(-0.3621F, -0.8226F, -0.8168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(87, 57).mirror().addBox(-0.3621F, -0.4226F, -0.8168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(87, 60).mirror().addBox(-0.3621F, -0.7226F, -1.1168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false)
				.texOffs(87, 63).mirror().addBox(-0.3621F, -0.6226F, -1.1168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(65, 87).mirror().addBox(-0.3621F, -0.4226F, -1.1168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(87, 66).mirror().addBox(-0.3621F, -0.4976F, -1.4168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(87, 69).mirror().addBox(-0.3621F, -0.6976F, -1.4168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(57, 66).mirror().addBox(-0.3371F, -0.9226F, -1.7168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(70, 87).mirror().addBox(-0.3371F, -0.4976F, -2.0168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(75, 87).mirror().addBox(-0.3371F, -0.6976F, -2.0168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(87, 76).mirror().addBox(-0.3371F, -0.7976F, -2.0168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false)
				.texOffs(80, 87).mirror().addBox(-0.3371F, -0.4976F, -2.3168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(88, 0).mirror().addBox(-0.3371F, -0.6976F, -2.3168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -0.296F, -6.5431F, 0.0357F, -0.0585F, -0.7438F));

		PartDefinition cube_r346 = Jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(62, 66).mirror().addBox(-0.0988F, -0.7979F, -2.5638F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(88, 3).mirror().addBox(-0.0988F, -0.6979F, -2.8638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(50, 88).mirror().addBox(-0.0988F, -0.4979F, -2.8638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(77, 68).mirror().addBox(-0.0988F, -0.2979F, -2.8638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(55, 88).mirror().addBox(-0.0988F, -0.5979F, -3.1638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(60, 88).mirror().addBox(-0.0988F, -0.3979F, -3.1638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(0, 72).mirror().addBox(-0.0988F, -0.4229F, -3.4638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(5, 72).mirror().addBox(-0.0988F, -0.6229F, -3.4638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(72, 6).mirror().addBox(-0.0738F, -0.6479F, -3.7638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(17, 72).mirror().addBox(-0.0738F, -0.4479F, -3.7638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -0.296F, -6.5431F, -0.0209F, 0.0498F, -0.7436F));

		PartDefinition cube_r347 = Jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(72, 37).mirror().addBox(-0.0878F, -0.9169F, -0.5692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(72, 60).mirror().addBox(-0.0878F, -0.9169F, -0.8692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(72, 63).mirror().addBox(-0.0878F, -1.1169F, -0.8692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(72, 66).mirror().addBox(-0.0878F, -1.2169F, -0.8692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false)
				.texOffs(10, 89).mirror().addBox(-0.0878F, -1.1169F, -1.1692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(20, 89).mirror().addBox(-0.0878F, -0.9169F, -1.1692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(25, 89).mirror().addBox(-0.0878F, -1.3169F, -1.1692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(30, 89).mirror().addBox(-0.0878F, -0.9169F, -1.4692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(35, 89).mirror().addBox(-0.0878F, -1.0669F, -1.4692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(40, 89).mirror().addBox(-0.0878F, -1.1169F, -1.7692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(85, 89).mirror().addBox(-0.0878F, -0.9169F, -1.7692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(0, 90).mirror().addBox(-0.0878F, -0.9169F, -2.0692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(5, 90).mirror().addBox(-0.0878F, -1.1169F, -2.0692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(15, 90).mirror().addBox(-0.0878F, -1.1169F, -2.3692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(90, 33).mirror().addBox(-0.0878F, -0.9169F, -2.3692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.104F, -10.0431F, 0.0146F, 0.0112F, -0.7425F));

		PartDefinition cube_r348 = Jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(90, 39).mirror().addBox(-0.0628F, -1.1956F, -2.5832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(90, 42).mirror().addBox(-0.0628F, -1.3206F, -2.5832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F)).mirror(false)
				.texOffs(45, 90).mirror().addBox(-0.0378F, -1.2456F, -2.8832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.104F, -10.0431F, 0.1455F, 0.0112F, -0.7425F));

		PartDefinition cube_r349 = Jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(90, 45).mirror().addBox(0.2445F, -2.9081F, -1.4947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(90, 48).mirror().addBox(0.2445F, -3.1081F, -1.4947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.104F, -10.0431F, 1.0383F, 0.1561F, -0.5027F));

		PartDefinition cube_r350 = Jaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.5905F, -1.1621F, -1.5596F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.504F, -8.7431F, -0.0262F, 0.0524F, 0.0F));

		PartDefinition cube_r351 = Jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(0, 56).addBox(-0.4095F, -1.1621F, -1.5596F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.1F, 0.504F, -8.7431F, -0.0262F, -0.0524F, 0.0F));

		PartDefinition cube_r352 = Jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(0, 51).addBox(-0.3879F, -1.0414F, -4.8678F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.2F, 0.504F, -4.1431F, -0.0262F, 0.0698F, 0.0F));

		PartDefinition cube_r353 = Jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(36, 58).addBox(-0.3879F, -0.9531F, -2.8904F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2F, 0.504F, -4.1431F, -0.0611F, 0.0698F, 0.0F));

		PartDefinition cube_r354 = Jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(43, 58).addBox(-0.3879F, -1.0172F, -1.5571F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.2F, 0.504F, -4.1431F, -0.0087F, 0.0698F, 0.0F));

		PartDefinition cube_r355 = Jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(56, 45).addBox(-0.3879F, -0.9095F, -1.6106F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2F, 0.504F, -4.1431F, -0.096F, 0.0698F, 0.0F));

		PartDefinition cube_r356 = Jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(77, 62).addBox(-0.4892F, -0.3767F, 0.1005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(55, 79).addBox(-0.4892F, -0.4517F, -0.1995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(40, 86).addBox(-0.5142F, -0.7267F, -1.0995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(35, 86).addBox(-0.4892F, -0.6517F, -0.7995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(10, 80).addBox(-0.4892F, -0.5518F, -0.4995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.5109F, -0.147F, -3.2556F, 0.301F, 0.2008F, 0.4069F));

		PartDefinition cube_r357 = Jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(88, 0).addBox(-0.6629F, -0.6976F, -2.3168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(80, 87).addBox(-0.6629F, -0.4976F, -2.3168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(87, 76).addBox(-0.6629F, -0.7976F, -2.0168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F))
				.texOffs(75, 87).addBox(-0.6629F, -0.6976F, -2.0168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(70, 87).addBox(-0.6629F, -0.4976F, -2.0168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(57, 66).addBox(-0.6629F, -0.9226F, -1.7168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(87, 69).addBox(-0.6379F, -0.6976F, -1.4168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(87, 66).addBox(-0.6379F, -0.4976F, -1.4168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(65, 87).addBox(-0.6379F, -0.4226F, -1.1168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(87, 63).addBox(-0.6379F, -0.6226F, -1.1168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(87, 60).addBox(-0.6379F, -0.7226F, -1.1168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F))
				.texOffs(87, 51).addBox(-0.6379F, -0.8226F, -0.8168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(87, 57).addBox(-0.6379F, -0.4226F, -0.8168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(45, 87).addBox(-0.6379F, -0.6226F, -0.8168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(87, 36).addBox(-0.6379F, -0.4476F, -0.5168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(87, 30).addBox(-0.6379F, -0.6476F, -0.5168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(87, 27).addBox(-0.6129F, -0.6976F, -0.2168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(87, 24).addBox(-0.6129F, -0.4976F, -0.2168F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(15, 87).addBox(-0.6129F, -0.6476F, 0.0832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(87, 6).addBox(-0.6129F, -0.4476F, 0.0832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(5, 87).addBox(-0.6129F, -0.5476F, 0.3832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F))
				.texOffs(0, 87).addBox(-0.6129F, -0.4476F, 0.3832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(85, 86).addBox(-0.5879F, -0.4476F, 0.6832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(42, 74).addBox(-0.5879F, -0.3476F, 0.9832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(86, 54).addBox(-0.5879F, -0.4226F, 1.2832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.35F, -0.296F, -6.5431F, 0.0357F, 0.0585F, 0.7438F));

		PartDefinition cube_r358 = Jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(90, 48).addBox(-1.2445F, -3.1081F, -1.4947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(90, 45).addBox(-1.2445F, -2.9081F, -1.4947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2F, 0.104F, -10.0431F, 1.0383F, -0.1561F, 0.5027F));

		PartDefinition cube_r359 = Jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(45, 90).addBox(-0.9622F, -1.2456F, -2.8832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(90, 42).addBox(-0.9372F, -1.3206F, -2.5832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F))
				.texOffs(90, 39).addBox(-0.9372F, -1.1956F, -2.5832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2F, 0.104F, -10.0431F, 0.1455F, -0.0112F, 0.7425F));

		PartDefinition cube_r360 = Jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(90, 33).addBox(-0.9122F, -0.9169F, -2.3692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(15, 90).addBox(-0.9122F, -1.1169F, -2.3692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(5, 90).addBox(-0.9122F, -1.1169F, -2.0692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 90).addBox(-0.9122F, -0.9169F, -2.0692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(85, 89).addBox(-0.9122F, -0.9169F, -1.7692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(40, 89).addBox(-0.9122F, -1.1169F, -1.7692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(35, 89).addBox(-0.9122F, -1.0669F, -1.4692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(30, 89).addBox(-0.9122F, -0.9169F, -1.4692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(25, 89).addBox(-0.9122F, -1.3169F, -1.1692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(20, 89).addBox(-0.9122F, -0.9169F, -1.1692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(10, 89).addBox(-0.9122F, -1.1169F, -1.1692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(72, 66).addBox(-0.9122F, -1.2169F, -0.8692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.402F))
				.texOffs(72, 63).addBox(-0.9122F, -1.1169F, -0.8692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(72, 60).addBox(-0.9122F, -0.9169F, -0.8692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(72, 37).addBox(-0.9122F, -0.9169F, -0.5692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.2F, 0.104F, -10.0431F, 0.0146F, -0.0112F, 0.7425F));

		PartDefinition cube_r361 = Jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(17, 72).addBox(-0.9262F, -0.4479F, -3.7638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(72, 6).addBox(-0.9262F, -0.6479F, -3.7638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(5, 72).addBox(-0.9012F, -0.6229F, -3.4638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 72).addBox(-0.9012F, -0.4229F, -3.4638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(60, 88).addBox(-0.9012F, -0.3979F, -3.1638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(55, 88).addBox(-0.9012F, -0.5979F, -3.1638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(77, 68).addBox(-0.9012F, -0.2979F, -2.8638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(50, 88).addBox(-0.9012F, -0.4979F, -2.8638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(88, 3).addBox(-0.9012F, -0.6979F, -2.8638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(62, 66).addBox(-0.9012F, -0.7979F, -2.5638F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.35F, -0.296F, -6.5431F, -0.0209F, -0.0498F, 0.7436F));

		PartDefinition cube_r362 = Jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(60, 79).addBox(-0.5879F, -0.2175F, 1.5697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.35F, -0.296F, -6.5431F, 0.123F, 0.0585F, 0.7438F));

		PartDefinition cube_r363 = Jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(77, 65).addBox(-0.4976F, 0.1248F, 1.8083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.35F, -0.296F, -6.5431F, 0.2537F, 0.0152F, 0.7385F));

		PartDefinition cube_r364 = Jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(50, 58).addBox(-0.7F, -0.9533F, -2.6256F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.0F, 0.504F, -1.8431F, 0.0F, 0.2269F, 0.0F));

		PartDefinition cube_r365 = Jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(56, 41).addBox(-0.7F, -0.7688F, -2.6697F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.0F, 0.504F, -1.8431F, -0.0785F, 0.2269F, 0.0F));

		PartDefinition cube_r366 = Jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(77, 59).addBox(-0.7F, -0.9929F, -0.6857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(77, 52).addBox(-0.7F, -0.9929F, -0.8857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.0F, 0.504F, -1.8431F, 0.0785F, 0.2269F, 0.0F));

		PartDefinition cube_r367 = Jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(27, 74).addBox(-0.7F, -0.9369F, -1.2752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, 0.504F, -1.8431F, -0.0087F, 0.2269F, 0.0F));

		PartDefinition cube_r368 = Jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(77, 71).addBox(-0.7F, -0.7F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(0, 78).addBox(-0.7F, -0.7F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(40, 77).addBox(-0.7F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.0F, 0.504F, -1.8431F, -0.1484F, 0.2269F, 0.0F));

		PartDefinition RArm = Chest.addOrReplaceChild("RArm", CubeListBuilder.create().texOffs(9, 51).addBox(-0.2F, 0.0F, -0.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.8101F, 4.0309F, -3.5935F, 0.525F, -0.8298F, 1.1618F));

		PartDefinition cube_r369 = RArm.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(82, 77).addBox(-0.1F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(6.2118F, 0.5F, 0.5936F, 0.0F, 2.618F, 0.0F));

		PartDefinition cube_r370 = RArm.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(82, 70).addBox(-0.9F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(6.2118F, 0.5F, -0.2064F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r371 = RArm.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(82, 67).addBox(-0.9F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(5.4727F, 0.5F, -0.5126F, 0.0F, 1.1781F, 0.0F));

		PartDefinition cube_r372 = RArm.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(64, 57).addBox(-0.1F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.7F, 0.5F, -0.2F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r373 = RArm.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(64, 14).addBox(-0.1F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(3.7F, 0.5F, -0.2F, 0.0F, -0.2182F, 0.0F));

		PartDefinition RArm2 = RArm.addOrReplaceChild("RArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5252F, 0.4156F, 0.8287F, -0.3992F, 0.5282F, -0.8195F));

		PartDefinition cube_r374 = RArm2.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(83, 0).addBox(0.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(36, 55).addBox(-2.25F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.15F, -0.5F, -0.6F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r375 = RArm2.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(83, 3).addBox(0.95F, -0.5F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(21, 65).addBox(-0.25F, -0.5F, -0.775F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(1.2446F, -0.5F, 0.8516F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r376 = RArm2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(7, 65).addBox(-1.7F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.4F, -0.5F, 0.4F, 0.0F, -0.4363F, 0.0F));

		PartDefinition RHand = RArm2.addOrReplaceChild("RHand", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r377 = RHand.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(20, 83).addBox(-0.325F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0168F, -0.601F, 0.5771F, 0.0F, -1.2217F, -0.1745F));

		PartDefinition cube_r378 = RHand.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(10, 83).addBox(-0.85F, -0.475F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6578F, -0.7394F, 0.0F, 0.0F, -0.4363F, -0.1745F));

		PartDefinition cube_r379 = RHand.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(49, 14).addBox(0.15F, 0.025F, -1.025F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6578F, -0.7394F, 0.0F, 0.0F, -0.3491F, -0.1745F));

		PartDefinition RArm3 = Chest.addOrReplaceChild("RArm3", CubeListBuilder.create().texOffs(9, 51).mirror().addBox(-3.8F, 0.0F, -0.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.8101F, 4.0309F, -3.5935F, 0.4178F, 0.3297F, -1.0644F));

		PartDefinition cube_r380 = RArm3.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(82, 77).mirror().addBox(-0.9F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-6.2118F, 0.5F, 0.5936F, 0.0F, -2.618F, 0.0F));

		PartDefinition cube_r381 = RArm3.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(82, 70).mirror().addBox(-0.1F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-6.2118F, 0.5F, -0.2064F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r382 = RArm3.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(82, 67).mirror().addBox(-0.1F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-5.4727F, 0.5F, -0.5126F, 0.0F, -1.1781F, 0.0F));

		PartDefinition cube_r383 = RArm3.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(64, 57).mirror().addBox(-1.9F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 0.5F, -0.2F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r384 = RArm3.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(64, 14).mirror().addBox(-1.9F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 0.5F, -0.2F, 0.0F, 0.2182F, 0.0F));

		PartDefinition RArm4 = RArm3.addOrReplaceChild("RArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5252F, 0.4156F, 0.8287F, -0.1564F, -0.2635F, 0.5444F));

		PartDefinition cube_r385 = RArm4.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-1.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(36, 55).mirror().addBox(-0.75F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.15F, -0.5F, -0.6F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r386 = RArm4.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(83, 3).mirror().addBox(-1.95F, -0.5F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(21, 65).mirror().addBox(-1.75F, -0.5F, -0.775F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-1.2446F, -0.5F, 0.8516F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r387 = RArm4.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(7, 65).mirror().addBox(-0.3F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.5F, 0.4F, 0.0F, 0.4363F, 0.0F));

		PartDefinition RHand2 = RArm4.addOrReplaceChild("RHand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r388 = RHand2.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(20, 83).mirror().addBox(-0.675F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0168F, -0.601F, 0.5771F, 0.0F, 1.2217F, 0.1745F));

		PartDefinition cube_r389 = RHand2.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(10, 83).mirror().addBox(-0.15F, -0.475F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6578F, -0.7394F, 0.0F, 0.0F, 0.4363F, 0.1745F));

		PartDefinition cube_r390 = RHand2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(49, 14).mirror().addBox(-4.15F, 0.025F, -1.025F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6578F, -0.7394F, 0.0F, 0.0F, 0.3491F, 0.1745F));

		return LayerDefinition.create(meshdefinition, 100, 100);
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