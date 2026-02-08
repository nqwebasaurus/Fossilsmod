package fossils.fossils.client.blockentity.model.thecodontosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ThecodontosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Thecodontosaurus;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart Body;
	private final ModelPart body3;
	private final ModelPart Body2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart neck4;
	private final ModelPart Neck3;
	private final ModelPart Neck5;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
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
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart Tail9;
	private final ModelPart Tail10;
	private final ModelPart Tail11;
	private final ModelPart Tail12;
	private final ModelPart Tail13;
	private final ModelPart Tail14;
	private final ModelPart RLeg;
	private final ModelPart RLeg2;
	private final ModelPart RLeg3;
	private final ModelPart digit;
	private final ModelPart digit2;
	private final ModelPart RFoot;
	private final ModelPart RFoot2;
	private final ModelPart RLeg4;
	private final ModelPart RLeg5;
	private final ModelPart RLeg6;
	private final ModelPart digit3;
	private final ModelPart digit4;
	private final ModelPart RFoot3;
	private final ModelPart RFoot4;

	public ThecodontosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Thecodontosaurus = this.fossil.getChild("Thecodontosaurus");
		this.bone = this.Thecodontosaurus.getChild("bone");
		this.bone4 = this.Thecodontosaurus.getChild("bone4");
		this.Body = this.Thecodontosaurus.getChild("Body");
		this.body3 = this.Body.getChild("body3");
		this.Body2 = this.body3.getChild("Body2");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone3 = this.Body2.getChild("bone3");
		this.Neck = this.Body2.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.neck4 = this.Neck2.getChild("neck4");
		this.Neck3 = this.neck4.getChild("Neck3");
		this.Neck5 = this.Neck3.getChild("Neck5");
		this.Head = this.Neck5.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.RArm = this.Body2.getChild("RArm");
		this.RArm2 = this.RArm.getChild("RArm2");
		this.RHand = this.RArm2.getChild("RHand");
		this.RArm3 = this.Body2.getChild("RArm3");
		this.RArm4 = this.RArm3.getChild("RArm4");
		this.RHand2 = this.RArm4.getChild("RHand2");
		this.Tail = this.Thecodontosaurus.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Tail9 = this.Tail8.getChild("Tail9");
		this.Tail10 = this.Tail9.getChild("Tail10");
		this.Tail11 = this.Tail10.getChild("Tail11");
		this.Tail12 = this.Tail11.getChild("Tail12");
		this.Tail13 = this.Tail12.getChild("Tail13");
		this.Tail14 = this.Tail13.getChild("Tail14");
		this.RLeg = this.Thecodontosaurus.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RLeg3 = this.RLeg2.getChild("RLeg3");
		this.digit = this.RLeg3.getChild("digit");
		this.digit2 = this.digit.getChild("digit2");
		this.RFoot = this.RLeg3.getChild("RFoot");
		this.RFoot2 = this.RFoot.getChild("RFoot2");
		this.RLeg4 = this.Thecodontosaurus.getChild("RLeg4");
		this.RLeg5 = this.RLeg4.getChild("RLeg5");
		this.RLeg6 = this.RLeg5.getChild("RLeg6");
		this.digit3 = this.RLeg6.getChild("digit3");
		this.digit4 = this.digit3.getChild("digit4");
		this.RFoot3 = this.RLeg6.getChild("RFoot3");
		this.RFoot4 = this.RFoot3.getChild("RFoot4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.575F, -24.0F, -2.1F, 1.0F, 24.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(3.2F, -19.7F, -19.3F, 0.4331F, -0.0552F, -1.452F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -6.4F, -0.5F, 1.0F, 24.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(3.2F, -17.5F, -19.3F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.1F, -23.5F, -1.6F, 0.0436F, 0.0F, -1.3526F));

		PartDefinition Thecodontosaurus = fossil.addOrReplaceChild("Thecodontosaurus", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, 0.0707F, -2.385F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 22).addBox(-0.5F, 0.0707F, 3.315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -24.7674F, -1.7865F, -0.0902F, 0.0159F, 0.1738F));

		PartDefinition bone = Thecodontosaurus.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1402F, 1.5661F, 0.8884F, 0.0519F, -0.0073F, 0.1394F));

		PartDefinition bone4 = Thecodontosaurus.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1402F, 1.5661F, 0.8884F, 0.0519F, 0.0073F, -0.1394F));

		PartDefinition Body = Thecodontosaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1779F, -1.8967F, 0.2573F, -0.0734F, -0.0642F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 15).addBox(-0.5F, -0.1495F, -0.1088F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5025F, -5.0134F, -0.1745F, 0.0F, 0.0F));

		PartDefinition body3 = Body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.129F, -5.0401F, -0.1936F, -0.1285F, 0.0251F));

		PartDefinition cube_r5 = body3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(32, 28).addBox(-0.5F, -0.1F, 4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(28, 24).addBox(-0.5F, -0.1F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9F, -5.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Body2 = body3.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5905F, -5.1274F, -0.0499F, -0.1355F, -0.0799F));

		PartDefinition cube_r6 = Body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.5975F, -6.7134F, 0.1571F, 0.0F, 0.0F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9F, 4.8602F, -5.9905F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9F, 4.8602F, -5.9905F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Neck = Body2.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8099F, -6.9064F, 0.1752F, -0.0859F, -0.0152F));

		PartDefinition cube_r7 = Neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 24).addBox(-0.4F, -0.5F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(54, 22).addBox(-0.4F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7723F, -1.7367F, -0.1398F, -0.0432F, 0.0061F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3272F, -2.6387F, 0.2058F, -0.1911F, -0.1991F));

		PartDefinition cube_r8 = Neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(56, 14).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1728F, -3.1378F, -0.2447F, -0.0508F, 0.0127F));

		PartDefinition neck4 = Neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.483F, -2.8502F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 56).addBox(-0.5F, 0.7F, 0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.5F, -3.7F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Neck3 = neck4.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, 0.1773F, -2.6813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7698F, -2.902F, -0.2552F, -0.1267F, 0.033F));

		PartDefinition Neck5 = Neck3.addOrReplaceChild("Neck5", CubeListBuilder.create().texOffs(57, 42).addBox(-0.5F, 0.2773F, -3.6813F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0276F, -2.7779F, 0.3628F, -0.1634F, -0.0617F));

		PartDefinition Head = Neck5.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.286F, -3.1801F, 0.1503F, -0.1301F, 0.1177F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5427F, -0.3278F, -4.8282F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5427F, -0.3278F, -4.8282F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.4154F, -0.405F, 0.7854F, 0.0F, 0.0F));

		PartDefinition RArm = Body2.addOrReplaceChild("RArm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6602F, 4.9749F, -5.3913F, -0.8107F, 0.1827F, -0.2256F));

		PartDefinition RArm2 = RArm.addOrReplaceChild("RArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0771F, -0.5128F, 6.7545F, 0.642F, 0.1148F, -0.2964F));

		PartDefinition RHand = RArm2.addOrReplaceChild("RHand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8575F, 5.1083F, -0.3878F, 0.1745F, 0.0F, 0.2618F));

		PartDefinition RArm3 = Body2.addOrReplaceChild("RArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6602F, 4.9749F, -5.3913F, -1.6196F, -0.1139F, 0.371F));

		PartDefinition RArm4 = RArm3.addOrReplaceChild("RArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0771F, -0.5128F, 6.7545F, 0.7497F, 0.0224F, 0.5039F));

		PartDefinition RHand2 = RArm4.addOrReplaceChild("RHand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8575F, 5.1083F, -0.3878F, 0.1745F, 0.0F, -0.2618F));

		PartDefinition Tail = Thecodontosaurus.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(13, 31).addBox(-0.5F, 0.1987F, 0.1389F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1254F, 3.8651F, -0.0635F, 0.0795F, -0.1357F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(39, 38).addBox(-0.5F, 0.1416F, -0.1376F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0694F, 4.9105F, 0.0264F, 0.1309F, 0.0034F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(41, 22).addBox(-0.5F, 0.3853F, -0.4526F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 26).addBox(-0.5F, 0.3853F, 4.2474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2133F, 4.8901F, 0.0176F, 0.1309F, 0.0023F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(26, 31).addBox(-0.5F, 0.3853F, -0.0526F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0414F, 4.9579F, 0.005F, 0.1748F, -0.0426F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, 0.3852F, -0.4526F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(4, 36).addBox(-0.5F, 0.3852F, 4.2474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0004F, 4.9331F, 0.0586F, 0.2204F, -0.0307F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0048F, 4.9233F, 0.1025F, 0.2649F, -0.0165F));

		PartDefinition cube_r10 = Tail6.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(36, 4).addBox(-0.5F, -0.5F, 4.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 0).addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8852F, 0.0974F, 0.0F, 0.0131F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0014F, 4.9147F, 0.0288F, 0.4385F, -0.0751F));

		PartDefinition cube_r11 = Tail7.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -0.5F, -2.55F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8853F, 2.5474F, 0.0F, 0.0262F, 0.0F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0114F, 4.9505F, -0.0734F, 0.3391F, -0.1557F));

		PartDefinition cube_r12 = Tail8.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(36, 11).addBox(-0.5F, -0.7F, 4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 7).addBox(-0.5F, -0.7F, -0.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0853F, -0.1526F, 0.0F, 0.0087F, 0.0F));

		PartDefinition Tail9 = Tail8.addOrReplaceChild("Tail9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0132F, 4.976F, 0.1086F, 0.2876F, -0.1949F));

		PartDefinition cube_r13 = Tail9.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(13, 38).addBox(-0.575F, -0.5F, -2.55F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8852F, 2.3474F, 0.0F, 0.0262F, 0.0F));

		PartDefinition Tail10 = Tail9.addOrReplaceChild("Tail10", CubeListBuilder.create().texOffs(26, 38).addBox(-0.5F, 0.3852F, -0.4526F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0068F, 4.9064F, -0.1343F, 0.4213F, -0.1329F));

		PartDefinition Tail11 = Tail10.addOrReplaceChild("Tail11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.003F, 4.9281F, -0.2243F, 0.3229F, -0.2368F));

		PartDefinition cube_r14 = Tail11.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(4, 43).addBox(-0.5F, -0.7F, 5.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 39).addBox(-0.5F, -0.7F, 0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0853F, -0.9526F, 0.0F, -0.0175F, 0.0F));

		PartDefinition Tail12 = Tail11.addOrReplaceChild("Tail12", CubeListBuilder.create().texOffs(39, 31).addBox(-0.5F, 0.2852F, -0.1526F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0288F, 0.0729F, 4.7841F, -0.0463F, -0.3772F, 0.0789F));

		PartDefinition Tail13 = Tail12.addOrReplaceChild("Tail13", CubeListBuilder.create().texOffs(15, 24).addBox(-0.4713F, 0.0242F, 0.0388F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0087F, 0.1456F, 4.5046F, -0.3156F, -0.4204F, 0.1434F));

		PartDefinition Tail14 = Tail13.addOrReplaceChild("Tail14", CubeListBuilder.create().texOffs(58, 8).addBox(-0.4713F, 0.0242F, 0.1138F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1695F, -0.0826F, 4.5665F, -0.2752F, -0.4176F, 0.1374F));

		PartDefinition RLeg = Thecodontosaurus.addOrReplaceChild("RLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, 0.7067F, 0.046F, -0.2435F, -0.0211F, -0.0847F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 9.3477F, 4.1821F, 1.2654F, 0.0F, 0.0F));

		PartDefinition RLeg3 = RLeg2.addOrReplaceChild("RLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.2204F, 1.2331F, -0.8795F, -0.0673F, -0.0556F));

		PartDefinition digit = RLeg3.addOrReplaceChild("digit", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9458F, 0.2629F, 0.0F, 0.169F, -0.1046F, 0.009F));

		PartDefinition digit2 = digit.addOrReplaceChild("digit2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, 5.5092F, 0.3943F, -0.6981F, 0.0F, 0.0F));

		PartDefinition RFoot = RLeg3.addOrReplaceChild("RFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4782F, 6.4836F, -0.1585F, 0.7463F, -0.0964F, -0.0887F));

		PartDefinition RFoot2 = RFoot.addOrReplaceChild("RFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2972F, -2.202F, -0.8026F, 0.0F, 0.0F));

		PartDefinition RLeg4 = Thecodontosaurus.addOrReplaceChild("RLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8F, 0.7067F, 0.046F, -1.0698F, -0.115F, -0.0627F));

		PartDefinition RLeg5 = RLeg4.addOrReplaceChild("RLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 9.3477F, 4.1821F, 1.4832F, 0.0869F, -0.0076F));

		PartDefinition RLeg6 = RLeg5.addOrReplaceChild("RLeg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.2204F, 1.2331F, -0.925F, 0.0F, 0.0F));

		PartDefinition digit3 = RLeg6.addOrReplaceChild("digit3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9458F, 0.2629F, 0.0F, -0.0055F, 0.1046F, -0.009F));

		PartDefinition digit4 = digit3.addOrReplaceChild("digit4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, 5.5092F, 0.3943F, -0.6981F, 0.0F, 0.0F));

		PartDefinition RFoot3 = RLeg6.addOrReplaceChild("RFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4782F, 6.4836F, -0.1585F, 0.9165F, 0.0F, 0.0F));

		PartDefinition RFoot4 = RFoot3.addOrReplaceChild("RFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2972F, -2.202F, -0.279F, 0.0F, 0.0F));

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