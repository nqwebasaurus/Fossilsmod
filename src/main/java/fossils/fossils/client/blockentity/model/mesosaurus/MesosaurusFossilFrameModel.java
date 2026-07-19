package fossils.fossils.client.blockentity.model.mesosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MesosaurusFossilFrameModel extends SkullModelBase {
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

	public MesosaurusFossilFrameModel(ModelPart root) {
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

		PartDefinition Mesosaurus = fossil.addOrReplaceChild("Mesosaurus", CubeListBuilder.create().texOffs(21, 7).addBox(-0.5F, -2.075F, -6.6F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F))
				.texOffs(70, 90).addBox(-0.5F, -2.075F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(70, 90).addBox(-0.5F, -2.075F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0F, -6.875F, 0.0F, 0.3752F, 0.0F, 0.0F));

		PartDefinition body = Mesosaurus.addOrReplaceChild("body", CubeListBuilder.create().texOffs(21, 16).addBox(-0.5F, 0.325F, -0.225F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.3869F, 1.1997F, -0.044F, -0.1308F, 0.0057F));

		PartDefinition Hip = body.addOrReplaceChild("Hip", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2564F, 5.6257F, 0.0119F, -0.0873F, -0.001F));

		PartDefinition cube_r1 = Hip.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(90, 72).addBox(-0.5F, -0.125F, 8.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 7).addBox(-0.5F, -0.125F, -0.275F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hip.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 15).addBox(-0.6F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1F, 3.1653F, 7.2799F, -0.0023F, 0.0523F, 1.5271F));

		PartDefinition cube_r3 = Hip.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 15).addBox(-0.5F, -1.925F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 2.9656F, 7.2904F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = Hip.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.2F, 3.1609F, 6.2746F));

		PartDefinition bone4 = Hip.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.2F, 3.1609F, 6.2746F));

		PartDefinition RLeg = Hip.addOrReplaceChild("RLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4748F, 3.0285F, 6.9747F, 0.1191F, -0.9437F, 0.9242F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.1385F, 0.0F, -2.5311F, 0.0F, -0.6109F, 0.0F));

		PartDefinition RFoot = RLeg2.addOrReplaceChild("RFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9241F, 0.0F, 0.4688F, 0.0F, 0.1309F, 0.0F));

		PartDefinition RLeg3 = Hip.addOrReplaceChild("RLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4748F, 3.0285F, 6.9747F, 0.0765F, 0.4224F, -0.9894F));

		PartDefinition RLeg4 = RLeg3.addOrReplaceChild("RLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.1385F, 0.0F, -2.5311F, 0.0F, 0.6109F, 0.0F));

		PartDefinition RFoot2 = RLeg4.addOrReplaceChild("RFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9241F, 0.0F, 0.4688F, 0.0F, -0.1309F, 0.0F));

		PartDefinition Tail = Hip.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4278F, 9.4079F, -0.0281F, 0.1745F, -0.0049F));

		PartDefinition cube_r4 = Tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, 0.3F, 4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 30).addBox(-0.5F, 0.3F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.175F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail5 = Tail.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3483F, 4.7F, 0.0177F, 0.1745F, 0.0031F));

		PartDefinition cube_r5 = tail5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(75, 90).addBox(-0.5F, 0.3F, 9.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(36, 16).addBox(-0.5F, 0.3F, 5.025F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.55F, -5.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tail2 = tail5.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(38, 7).addBox(-0.5F, -0.05F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F))
				.texOffs(42, 11).addBox(-0.5F, -0.05F, 4.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.4912F, 5.2434F, -0.0176F, 0.1309F, -0.0023F));

		PartDefinition tail6 = Tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5F, 0.15F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.1904F, 4.6839F, 0.0447F, 0.218F, 0.0097F));

		PartDefinition Tail3 = tail6.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(43, 42).addBox(-0.5F, 0.15F, -0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0253F, 4.7996F, -0.0366F, 0.3034F, -0.0942F));

		PartDefinition tail7 = Tail3.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(43, 28).addBox(-0.5F, 0.21F, -0.4729F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F))
				.texOffs(47, 32).addBox(-0.5F, 0.21F, 4.1271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0687F, 4.6731F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(30, 37).addBox(-0.5F, 0.21F, 0.0271F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0055F, 4.6751F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tail4 = tail8.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.185F, 4.7271F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Tail4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(90, 79).addBox(-0.5F, 0.25F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(42, 0).addBox(-0.5F, 0.25F, -1.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.5F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail9 = Tail4.addOrReplaceChild("tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5529F, 5.2639F, -0.0452F, -0.2615F, 0.0117F));

		PartDefinition cube_r7 = tail9.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(47, 39).addBox(-0.5F, 0.25F, 7.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(43, 35).addBox(-0.5F, 0.25F, 3.375F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.54F, -3.5729F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7046F, 4.7044F, -0.0472F, -0.3923F, 0.0181F));

		PartDefinition cube_r8 = tail10.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(3, 47).addBox(-0.5F, 0.25F, 12.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(0, 44).addBox(-0.5F, 0.25F, 8.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.3F, -8.6F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6707F, 4.6274F, -0.1007F, -0.5214F, 0.0503F));

		PartDefinition cube_r9 = tail11.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(15, 38).addBox(-0.5F, 0.25F, 8.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.3F, -8.6F, -0.1396F, 0.0F, 0.0F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6413F, 4.5024F, -0.0481F, -0.4359F, 0.0203F));

		PartDefinition cube_r10 = tail12.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, 0.25F, 8.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.3F, -8.5F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Chest = Mesosaurus.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3224F, -6.275F, 0.0131F, 0.0873F, 0.0011F));

		PartDefinition cube_r11 = Chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(14, 29).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.2661F, -3.0859F, -1.5679F, -0.0654F, 1.5271F));

		PartDefinition cube_r12 = Chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(17, 32).addBox(-0.5F, -1.65F, 0.475F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.0F, 0.275F, -4.5F, -1.5053F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(15, 30).addBox(-0.5F, 0.35F, -0.225F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.275F, -5.7F, 0.0654F, 0.0F, 0.0F));

		PartDefinition bone3 = Chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.7F, 0.5493F, -4.4791F));

		PartDefinition bone5 = Chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-0.7F, 0.5493F, -4.4791F));

		PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(51, 7).addBox(-0.5F, 0.25F, -2.875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.39F, -5.6326F, 0.1285F, -0.3031F, -0.0385F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(56, 35).addBox(-0.5F, -0.15F, -2.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 90).addBox(-0.5F, -0.125F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 90).addBox(-0.5F, -0.125F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.3895F, -2.5931F, -0.1595F, -0.1724F, 0.0276F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(16, 59).addBox(-0.5F, 0.175F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2939F, -2.4306F, -0.2599F, -0.1624F, 0.0738F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create().texOffs(9, 54).addBox(-0.5F, 0.15F, -3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0426F, -1.6503F, -0.4097F, -0.2815F, 0.1201F));

		PartDefinition cube_r14 = Neck4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(40, 80).addBox(-0.2F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 0.8873F, -0.1033F, 0.1067F, 0.1909F, 0.0203F));

		PartDefinition cube_r15 = Neck4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(40, 80).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.95F, -0.7F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4508F, -3.3355F, -0.0746F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.0F, -0.0106F, -0.3781F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.0106F, -0.3781F));

		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7999F, -5.9892F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1142F, 0.0264F, 0.6807F, 0.0F, 0.0F));

		PartDefinition RArm = Chest.addOrReplaceChild("RArm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8101F, 4.0309F, -3.5935F, 0.525F, -0.8298F, 1.1618F));

		PartDefinition RArm2 = RArm.addOrReplaceChild("RArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5252F, 0.4156F, 0.8287F, -0.3992F, 0.5282F, -0.8195F));

		PartDefinition RHand = RArm2.addOrReplaceChild("RHand", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition RArm3 = Chest.addOrReplaceChild("RArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8101F, 4.0309F, -3.5935F, 0.4178F, 0.3297F, -1.0644F));

		PartDefinition RArm4 = RArm3.addOrReplaceChild("RArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5252F, 0.4156F, 0.8287F, -0.1564F, -0.2635F, 0.5444F));

		PartDefinition RHand2 = RArm4.addOrReplaceChild("RHand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

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