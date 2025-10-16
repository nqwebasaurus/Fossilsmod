package fossils.fossils.client.blockentity.model.lagerpeton;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LagerpetonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Lagerpeton;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart Body;
	private final ModelPart body3;
	private final ModelPart Body2;
	private final ModelPart bone2;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart neck4;
	private final ModelPart Neck3;
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

	public LagerpetonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Lagerpeton = this.fossil.getChild("Lagerpeton");
		this.bone = this.Lagerpeton.getChild("bone");
		this.bone3 = this.Lagerpeton.getChild("bone3");
		this.Body = this.Lagerpeton.getChild("Body");
		this.body3 = this.Body.getChild("body3");
		this.Body2 = this.body3.getChild("Body2");
		this.bone2 = this.Body2.getChild("bone2");
		this.Neck = this.Body2.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.neck4 = this.Neck2.getChild("neck4");
		this.Neck3 = this.neck4.getChild("Neck3");
		this.Head = this.Neck3.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.RArm = this.Body2.getChild("RArm");
		this.RArm2 = this.RArm.getChild("RArm2");
		this.RHand = this.RArm2.getChild("RHand");
		this.RArm3 = this.Body2.getChild("RArm3");
		this.RArm4 = this.RArm3.getChild("RArm4");
		this.RHand2 = this.RArm4.getChild("RHand2");
		this.Tail = this.Lagerpeton.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.RLeg = this.Lagerpeton.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RLeg3 = this.RLeg2.getChild("RLeg3");
		this.digit = this.RLeg3.getChild("digit");
		this.digit2 = this.digit.getChild("digit2");
		this.RFoot = this.RLeg3.getChild("RFoot");
		this.RFoot2 = this.RFoot.getChild("RFoot2");
		this.RLeg4 = this.Lagerpeton.getChild("RLeg4");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Lagerpeton = fossil.addOrReplaceChild("Lagerpeton", CubeListBuilder.create().texOffs(17, 45).addBox(-0.5F, -0.7891F, -2.2147F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F))
				.texOffs(50, 7).addBox(0.5F, -0.2891F, -1.2147F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(50, 7).mirror().addBox(-1.5F, -0.2891F, -1.2147F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -26.5923F, -1.7865F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Lagerpeton.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(85, 18).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7891F, 2.7853F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Lagerpeton.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(85, 28).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7891F, 0.7853F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Lagerpeton.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(85, 32).addBox(0.0F, -1.45F, -0.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8891F, -0.3147F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone = Lagerpeton.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, -0.6884F, 1.4539F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(70, 24).addBox(-0.5F, 0.0151F, -0.5636F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.8F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(81, 60).addBox(-0.5F, -0.2117F, 0.2806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F))
				.texOffs(81, 66).addBox(-0.5F, -0.2117F, -0.7194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.6F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(74, 64).addBox(-0.5F, -1.1627F, -2.2657F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.0F, -0.9977F, 2.1245F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(61, 25).addBox(-1.1F, 2.295F, -0.9555F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, 0.2F, 0.0F, -0.6632F, 0.0F, 0.1571F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(69, 60).addBox(-1.1F, 1.4489F, -0.384F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.55F, 0.2F, 0.0F, -0.8901F, 0.0F, 0.1571F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(76, 59).addBox(-0.2467F, 2.8522F, -0.8785F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.55F, 0.2F, 0.0F, -0.5498F, 0.0F, 0.5411F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(76, 55).addBox(-0.2467F, 2.6962F, -1.8592F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.55F, 0.2F, 0.0F, -0.4189F, 0.0F, 0.5411F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(32, 82).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(10, 82).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.7141F, 4.4598F, -3.1025F, -0.5329F, -0.0984F, 0.376F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(67, 76).addBox(-0.2467F, 3.9253F, -1.8924F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.55F, 0.2F, 0.0F, -0.3316F, 0.0F, 0.5411F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(62, 76).addBox(-0.2467F, 3.5328F, -3.1523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.55F, 0.2F, 0.0F, -0.1047F, 0.0F, 0.5411F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(72, 81).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F))
				.texOffs(81, 69).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.0F, -0.0238F, -1.4615F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(51, 67).addBox(-1.1F, 1.8849F, -0.2644F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.55F, 0.2F, 0.0F, -0.6545F, 0.0F, 0.1571F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(79, 72).addBox(-1.096F, 0.4486F, -0.259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.15F, 2.7F, 0.4F, 0.2454F, -0.1034F, 0.1928F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(84, 25).addBox(-0.5508F, 0.5806F, 3.4464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 82).addBox(-0.5508F, 0.5806F, 2.8464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.15F, 2.7F, 0.4F, 0.0629F, -0.3442F, 0.3253F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(73, 45).addBox(-0.5508F, -0.4284F, 1.524F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.15F, 2.7F, 0.4F, -0.2512F, -0.3442F, 0.3253F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(77, 78).addBox(-0.5508F, -0.2166F, 0.9389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.15F, 2.7F, 0.4F, -0.1291F, -0.3442F, 0.3253F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(32, 79).addBox(-1.096F, -0.706F, 0.6003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.019F))
				.texOffs(81, 63).addBox(-1.096F, -0.706F, 0.0003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.15F, 2.7F, 0.4F, -0.6709F, -0.1034F, 0.1928F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(64, 41).addBox(-1.1F, -2.1324F, 0.1743F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.55F, 0.2F, 0.0F, -2.6616F, 0.0F, 0.1571F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(66, 36).addBox(-1.1F, -0.655F, 2.0368F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.55F, 0.2F, 0.0F, -1.4835F, 0.0F, 0.1571F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(37, 65).addBox(-1.1F, 0.0187F, -1.2845F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(0.55F, 0.2F, 0.0F, -0.4363F, 0.0F, 0.1571F));

		PartDefinition bone3 = Lagerpeton.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, -0.6884F, 1.4539F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(70, 24).mirror().addBox(-0.5F, 0.0151F, -0.5636F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5F, -0.8F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(81, 60).mirror().addBox(-0.5F, -0.2117F, 0.2806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.023F)).mirror(false)
				.texOffs(81, 66).mirror().addBox(-0.5F, -0.2117F, -0.7194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.024F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9F, 0.6F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(74, 64).mirror().addBox(-0.5F, -1.1627F, -2.2657F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9977F, 2.1245F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(61, 25).mirror().addBox(0.1F, 2.295F, -0.9555F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 0.2F, 0.0F, -0.6632F, 0.0F, -0.1571F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(69, 60).mirror().addBox(0.1F, 1.4489F, -0.384F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 0.2F, 0.0F, -0.8901F, 0.0F, -0.1571F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(76, 59).mirror().addBox(-0.7533F, 2.8522F, -0.8785F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 0.2F, 0.0F, -0.5498F, 0.0F, -0.5411F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(76, 55).mirror().addBox(-0.7533F, 2.6962F, -1.8592F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 0.2F, 0.0F, -0.4189F, 0.0F, -0.5411F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(32, 82).mirror().addBox(-0.5F, 0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(10, 82).mirror().addBox(-0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.7141F, 4.4598F, -3.1025F, -0.5329F, 0.0984F, -0.376F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(67, 76).mirror().addBox(-0.7533F, 3.9253F, -1.8924F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 0.2F, 0.0F, -0.3316F, 0.0F, -0.5411F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(62, 76).mirror().addBox(-0.7533F, 3.5328F, -3.1523F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 0.2F, 0.0F, -0.1047F, 0.0F, -0.5411F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(72, 81).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false)
				.texOffs(81, 69).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0238F, -1.4615F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(51, 67).mirror().addBox(0.1F, 1.8849F, -0.2644F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 0.2F, 0.0F, -0.6545F, 0.0F, -0.1571F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(79, 72).mirror().addBox(0.096F, 0.4486F, -0.259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 2.7F, 0.4F, 0.2454F, 0.1034F, -0.1928F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(84, 25).mirror().addBox(-0.4492F, 0.5806F, 3.4464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 82).mirror().addBox(-0.4492F, 0.5806F, 2.8464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 2.7F, 0.4F, 0.0629F, 0.3442F, -0.3253F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(73, 45).mirror().addBox(-0.4492F, -0.4284F, 1.524F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 2.7F, 0.4F, -0.2512F, 0.3442F, -0.3253F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(77, 78).mirror().addBox(-0.4492F, -0.2166F, 0.9389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 2.7F, 0.4F, -0.1291F, 0.3442F, -0.3253F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(32, 79).mirror().addBox(0.096F, -0.706F, 0.6003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.019F)).mirror(false)
				.texOffs(81, 63).mirror().addBox(0.096F, -0.706F, 0.0003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 2.7F, 0.4F, -0.6709F, 0.1034F, -0.1928F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(64, 41).mirror().addBox(0.1F, -2.1324F, 0.1743F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 0.2F, 0.0F, -2.6616F, 0.0F, -0.1571F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(66, 36).mirror().addBox(0.1F, -0.655F, 2.0368F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 0.2F, 0.0F, -1.4835F, 0.0F, -0.1571F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(37, 65).mirror().addBox(0.1F, 0.0187F, -1.2845F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.024F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 0.2F, 0.0F, -0.4363F, 0.0F, -0.1571F));

		PartDefinition Body = Lagerpeton.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1891F, -1.9147F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r44 = Body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(30, 85).addBox(0.0F, -1.6981F, -0.9786F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6845F, -0.1375F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(86, 58).addBox(0.0F, -1.5981F, -0.9786F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0619F, -2.1041F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r46 = Body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 85).addBox(0.0F, -1.3981F, 0.0214F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4794F, -5.0749F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(51, 44).addBox(-0.5F, -0.9495F, -0.2088F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, -0.5025F, -5.0134F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(60, 86).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2074F, -0.6101F, -0.1018F, -0.0605F, -1.2872F));

		PartDefinition cube_r49 = Body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(86, 15).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2074F, -0.6101F, -0.1173F, -0.016F, -0.8879F));

		PartDefinition cube_r50 = Body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(40, 76).mirror().addBox(-3.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6074F, -2.5101F, -0.0334F, 0.0793F, -1.6113F));

		PartDefinition cube_r51 = Body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(85, 42).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6074F, -2.5101F, 0.0019F, 0.086F, -1.191F));

		PartDefinition cube_r52 = Body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(85, 36).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6074F, -2.5101F, 0.0354F, 0.0784F, -0.7883F));

		PartDefinition cube_r53 = Body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(22, 70).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9074F, -4.5101F, 0.1022F, 0.0819F, -0.6853F));

		PartDefinition cube_r54 = Body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(44, 65).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9074F, -4.5101F, 0.0621F, 0.1153F, -1.0873F));

		PartDefinition cube_r55 = Body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(64, 49).mirror().addBox(-4.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9074F, -4.5101F, 0.0096F, 0.1305F, -1.5092F));

		PartDefinition cube_r56 = Body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(60, 86).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2074F, -0.6101F, -0.1018F, 0.0605F, 1.2872F));

		PartDefinition cube_r57 = Body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(86, 15).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2074F, -0.6101F, -0.1173F, 0.016F, 0.8879F));

		PartDefinition cube_r58 = Body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(40, 76).addBox(1.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6074F, -2.5101F, -0.0334F, -0.0793F, 1.6113F));

		PartDefinition cube_r59 = Body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(85, 42).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6074F, -2.5101F, 0.0019F, -0.086F, 1.191F));

		PartDefinition cube_r60 = Body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(85, 36).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6074F, -2.5101F, 0.0354F, -0.0784F, 0.7883F));

		PartDefinition cube_r61 = Body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(22, 70).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9074F, -4.5101F, 0.1022F, -0.0819F, 0.6853F));

		PartDefinition cube_r62 = Body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(44, 65).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9074F, -4.5101F, 0.0621F, -0.1153F, 1.0873F));

		PartDefinition cube_r63 = Body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(64, 49).addBox(1.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9074F, -4.5101F, 0.0096F, -0.1305F, 1.5092F));

		PartDefinition cube_r64 = Body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 36).addBox(-2.0F, -2.0121F, 0.0044F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 6.3097F, -6.0127F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body3 = Body.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(80, 84).addBox(0.0F, -2.702F, -1.7804F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2025F, -5.3134F, -0.0699F, -0.0435F, 0.003F));

		PartDefinition cube_r65 = body3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(85, 6).addBox(0.0F, -1.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.202F, -3.2804F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(85, 10).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7049F, -1.1967F, 0.2024F, 0.153F, -0.6389F));

		PartDefinition cube_r67 = body3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(84, 75).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7049F, -1.1967F, 0.1267F, 0.2197F, -1.0419F));

		PartDefinition cube_r68 = body3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(53, 41).mirror().addBox(-5.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7049F, -1.1967F, 0.0248F, 0.2519F, -1.4717F));

		PartDefinition cube_r69 = body3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(53, 37).mirror().addBox(-6.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5049F, -3.1967F, 0.0302F, 0.304F, -1.4178F));

		PartDefinition cube_r70 = body3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(83, 52).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5049F, -3.1967F, 0.154F, 0.2648F, -0.983F));

		PartDefinition cube_r71 = body3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(28, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5049F, -3.1967F, 0.2451F, 0.1841F, -0.5794F));

		PartDefinition cube_r72 = body3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(85, 10).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7049F, -1.1967F, 0.2024F, -0.153F, 0.6389F));

		PartDefinition cube_r73 = body3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 44).addBox(-2.0F, -1.0121F, 0.0544F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 6.8999F, -4.293F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(84, 75).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7049F, -1.1967F, 0.1267F, -0.2197F, 1.0419F));

		PartDefinition cube_r75 = body3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(53, 41).addBox(1.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7049F, -1.1967F, 0.0248F, -0.2519F, 1.4717F));

		PartDefinition cube_r76 = body3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(53, 37).addBox(1.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5049F, -3.1967F, 0.0302F, -0.304F, 1.4178F));

		PartDefinition cube_r77 = body3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(83, 52).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5049F, -3.1967F, 0.154F, -0.2648F, 0.983F));

		PartDefinition cube_r78 = body3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(28, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5049F, -3.1967F, 0.2451F, -0.1841F, 0.5794F));

		PartDefinition cube_r79 = body3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.7F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Body2 = body3.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -4.8F, 0.1489F, -0.0863F, -0.0129F));

		PartDefinition cube_r80 = Body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(83, 84).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7033F, -0.4968F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r81 = Body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(57, 84).addBox(0.0F, -2.25F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 87).addBox(0.0F, -2.1F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 44).addBox(-0.5F, -1.1F, 1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 1.5975F, -6.7134F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r82 = Body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(86, 68).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.4101F, 0.2117F, 0.1704F, -0.5682F));

		PartDefinition cube_r83 = Body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(86, 66).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.4101F, 0.1283F, 0.2393F, -0.9723F));

		PartDefinition cube_r84 = Body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(72, 17).mirror().addBox(-4.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.4101F, 0.0178F, 0.2704F, -1.4042F));

		PartDefinition cube_r85 = Body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(13, 86).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.4101F, 0.2249F, 0.1831F, -0.4786F));

		PartDefinition cube_r86 = Body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(3, 86).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.4101F, 0.1356F, 0.2561F, -0.8833F));

		PartDefinition cube_r87 = Body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(61, 30).mirror().addBox(-5.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.4101F, 0.0171F, 0.2885F, -1.3172F));

		PartDefinition cube_r88 = Body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(85, 46).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2074F, -0.5101F, 0.1851F, 0.1472F, -0.5369F));

		PartDefinition cube_r89 = Body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(53, 39).mirror().addBox(-6.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2074F, -0.5101F, 0.0174F, 0.2353F, -1.3688F));

		PartDefinition cube_r90 = Body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(85, 44).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2074F, -0.5101F, 0.113F, 0.2076F, -0.9402F));

		PartDefinition cube_r91 = Body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(86, 68).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.4101F, 0.2117F, -0.1704F, 0.5682F));

		PartDefinition cube_r92 = Body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(86, 66).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.4101F, 0.1283F, -0.2393F, 0.9723F));

		PartDefinition cube_r93 = Body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(72, 17).addBox(1.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.4101F, 0.0178F, -0.2704F, 1.4042F));

		PartDefinition cube_r94 = Body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(13, 86).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.4101F, 0.2249F, -0.1831F, 0.4786F));

		PartDefinition cube_r95 = Body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(3, 86).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.4101F, 0.1356F, -0.2561F, 0.8833F));

		PartDefinition cube_r96 = Body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(61, 30).addBox(1.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.4101F, 0.0171F, -0.2885F, 1.3172F));

		PartDefinition cube_r97 = Body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(85, 46).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2074F, -0.5101F, 0.1851F, -0.1472F, 0.5369F));

		PartDefinition cube_r98 = Body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(53, 39).addBox(1.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2074F, -0.5101F, 0.0174F, -0.2353F, 1.3688F));

		PartDefinition cube_r99 = Body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(85, 44).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2074F, -0.5101F, 0.113F, -0.2076F, 0.9402F));

		PartDefinition cube_r100 = Body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(53, 33).addBox(-1.5F, -1.0298F, -2.0847F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 7.2286F, -0.4485F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.0F, 4.0675F, -4.7554F));

		PartDefinition cube_r101 = bone2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(48, 20).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2959F, 2.1645F, 0.6063F, -0.2422F, -0.3848F, 1.0311F));

		PartDefinition cube_r102 = bone2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(46, 33).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2959F, 2.1645F, 0.6063F, -0.2261F, -1.0255F, 1.2086F));

		PartDefinition cube_r103 = bone2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-0.5F, -0.0001F, 0.2099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false)
				.texOffs(5, 80).addBox(4.5F, -0.0001F, 0.2099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-5.5F, -2.0F, 0.9F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r104 = bone2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(70, 84).mirror().addBox(-0.5F, -0.45F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false)
				.texOffs(70, 84).addBox(4.5F, -0.45F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-5.5F, -2.6026F, 2.39F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r105 = bone2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(79, 75).mirror().addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 75).addBox(4.5F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, -2.4092F, 1.8541F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r106 = bone2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(34, 70).mirror().addBox(0.0F, -0.7222F, -1.96F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, 0.8499F, -0.2632F, -0.3521F));

		PartDefinition cube_r107 = bone2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(39, 60).mirror().addBox(-0.5F, -0.525F, -2.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.025F)).mirror(false)
				.texOffs(39, 60).addBox(4.5F, -0.525F, -2.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(-5.5F, -1.7F, 1.3F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r108 = bone2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(48, 20).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7041F, 2.1645F, 0.6063F, -0.2422F, 0.3848F, -1.0311F));

		PartDefinition cube_r109 = bone2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(46, 33).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7041F, 2.1645F, 0.6063F, -0.2261F, 1.0255F, -1.2086F));

		PartDefinition cube_r110 = bone2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-2.2041F, 2.5338F, -0.4998F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r111 = bone2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(63, 0).addBox(-1.0F, -1.0F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-2.2041F, 1.9338F, -1.539F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r112 = bone2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(34, 70).addBox(-1.0F, -0.7222F, -1.96F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8499F, 0.2632F, 0.3521F));

		PartDefinition Neck = Body2.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6234F, -5.5505F, -0.1834F, -0.0429F, 0.008F));

		PartDefinition cube_r113 = Neck.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(72, 76).mirror().addBox(-3.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0321F, -1.4354F, 0.0647F, 0.6864F, -1.5597F));

		PartDefinition cube_r114 = Neck.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(86, 84).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0321F, -1.4354F, 0.3746F, 0.5927F, -1.0484F));

		PartDefinition cube_r115 = Neck.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(86, 70).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0321F, -1.4354F, 0.5726F, 0.4067F, -0.6413F));

		PartDefinition cube_r116 = Neck.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(72, 76).addBox(1.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0321F, -1.4354F, 0.0647F, -0.6864F, 1.5597F));

		PartDefinition cube_r117 = Neck.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(86, 84).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0321F, -1.4354F, 0.3746F, -0.5927F, 1.0484F));

		PartDefinition cube_r118 = Neck.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(86, 70).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0321F, -1.4354F, 0.5726F, -0.4067F, 0.6413F));

		PartDefinition cube_r119 = Neck.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(88, 48).addBox(0.0F, -1.7477F, 0.9598F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 57).addBox(-0.5F, -0.9727F, -0.0402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.2728F, -2.9387F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3272F, -2.6387F, -0.157F, 0.2223F, 0.0091F));

		PartDefinition cube_r120 = Neck2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(51, 87).addBox(0.0F, -1.1F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2537F, 0.1119F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r121 = Neck2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(48, 87).addBox(0.0F, -0.85F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 51).addBox(-0.5F, 0.0F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9472F, -6.6801F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r122 = Neck2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(77, 23).mirror().addBox(-1.8054F, -0.126F, -0.3696F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0178F, -2.5495F, 0.4041F, 0.7392F, -0.9452F));

		PartDefinition cube_r123 = Neck2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(73, 49).mirror().addBox(-3.0902F, 0.0116F, -0.3701F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.248F, -0.6768F, 0.3135F, 0.7045F, -1.0867F));

		PartDefinition cube_r124 = Neck2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(77, 23).addBox(-0.1946F, -0.126F, -0.3696F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0178F, -2.5495F, 0.4041F, -0.7392F, 0.9452F));

		PartDefinition cube_r125 = Neck2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(73, 49).addBox(0.0902F, 0.0116F, -0.3701F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.248F, -0.6768F, 0.3135F, -0.7045F, 1.0867F));

		PartDefinition neck4 = Neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8471F, -3.7801F, -0.2689F, 0.3654F, 0.0534F));

		PartDefinition cube_r126 = neck4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(24, 87).mirror().addBox(-0.9398F, -0.0554F, -0.5358F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2296F, -2.8106F, 0.4475F, 0.8346F, -0.8839F));

		PartDefinition cube_r127 = neck4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(77, 25).mirror().addBox(-1.9822F, -0.0264F, -0.6676F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0488F, -0.805F, 0.4172F, 0.7712F, -0.926F));

		PartDefinition cube_r128 = neck4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(24, 87).addBox(-0.0603F, -0.0554F, -0.5358F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2296F, -2.8106F, 0.4475F, -0.8346F, 0.8839F));

		PartDefinition cube_r129 = neck4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(32, 52).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(45, 87).addBox(0.0F, -0.8F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 87).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -2.9F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r130 = neck4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(77, 25).addBox(-0.0178F, -0.0264F, -0.6676F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0488F, -0.805F, 0.4172F, -0.7712F, 0.926F));

		PartDefinition Neck3 = neck4.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(60, 62).addBox(-0.5F, -0.5227F, -2.8813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F))
				.texOffs(54, 87).addBox(0.0F, -1.2227F, -0.8813F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7534F, -3.8729F, -0.5991F, 0.3917F, -0.0289F));

		PartDefinition cube_r131 = Neck3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(75, 8).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7227F, -2.3813F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0588F, -2.9246F, 0.5958F, 0.2926F, 0.1931F));

		PartDefinition cube_r132 = Head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(64, 32).addBox(-1.5F, 0.0052F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.163F, -3.6476F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r133 = Head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(63, 16).addBox(-1.5F, -0.0047F, -0.9933F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.2852F, -2.6481F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r134 = Head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(80, 19).addBox(-0.5F, -0.01F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1235F, -6.3336F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r135 = Head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(44, 67).addBox(-0.5F, -0.01F, -0.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1235F, -6.3336F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r136 = Head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(47, 84).addBox(-0.5F, -0.2052F, -0.2327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 0.1533F, -9.5342F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r137 = Head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(37, 84).addBox(-0.5F, -0.2052F, -0.2327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1533F, -9.5342F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r138 = Head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(83, 39).addBox(-0.5F, -0.0302F, -0.9577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4842F, -8.1852F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r139 = Head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(20, 83).addBox(-0.5F, -0.0253F, -0.966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.8115F, -7.2699F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r140 = Head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(15, 83).addBox(-0.5F, -0.0201F, -1.0134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.8745F, -4.5662F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r141 = Head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(71, 51).addBox(-0.5F, 0.2852F, -1.2099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(17, 80).addBox(-0.5F, 0.0102F, -0.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.4615F, -0.3294F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r142 = Head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(80, 6).addBox(-0.5F, 0.1101F, -0.01F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.9266F, -0.862F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r143 = Head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(28, 58).addBox(-1.5F, -0.525F, -0.675F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.662F, -3.3562F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r144 = Head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(48, 13).addBox(-1.5F, 1.225F, -0.7F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.1267F, -2.862F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r145 = Head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(64, 46).addBox(-1.5F, -0.775F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.5467F, -1.4314F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r146 = Head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(58, 67).addBox(-1.5F, -0.025F, -0.075F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7758F, -0.9671F, -1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r147 = Head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(17, 59).addBox(-1.5F, -0.825F, 0.325F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(71, 41).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3634F, -1.6415F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r148 = Head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(63, 4).addBox(-1.5F, 0.275F, -0.05F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 67).addBox(-1.0F, 0.025F, 0.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3255F, -2.8411F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5927F, -0.3278F, -5.1282F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(73, 36).addBox(-0.5F, -0.85F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2253F, -0.3961F, 0.2596F, 0.4196F, 0.198F, 0.0059F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(5, 66).addBox(-0.969F, -2.0407F, -1.9988F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8645F, 1.465F, 1.1163F, -0.0168F, 0.198F, 0.0059F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(27, 78).addBox(-0.969F, -1.2548F, -4.9027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8645F, 1.465F, 1.1163F, 0.0007F, 0.198F, 0.0059F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(52, 84).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3677F, 0.9112F, -3.6968F, -0.0358F, 0.218F, -0.0077F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(55, 74).addBox(-0.5F, -0.35F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.149F, -0.1962F, -1.5999F, 0.3061F, 0.198F, 0.0059F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(84, 12).addBox(-0.5F, -0.6F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(84, 3).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2189F, 1.363F, -0.4826F, 0.0007F, 0.198F, 0.0059F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(84, 0).addBox(-0.819F, -0.4512F, -3.0968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 83).addBox(-0.819F, -0.4512F, -3.9968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(74, 68).addBox(-0.969F, -0.9012F, -3.9968F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8645F, 1.465F, 1.1163F, -0.0866F, 0.198F, 0.0059F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(84, 22).addBox(-0.625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5042F, 1.0388F, -4.0967F, -0.2175F, 0.198F, 0.0059F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(25, 84).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3088F, 1.1264F, -3.1199F, -0.0004F, 0.2502F, 0.0013F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(12, 79).addBox(-0.4542F, -0.0754F, -0.9023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.196F, 0.3072F, -3.2066F, 2.7576F, 0.2051F, 0.0F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(79, 3).addBox(-0.4542F, -0.8871F, -0.0649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.196F, 0.3072F, -3.2066F, 2.8449F, 0.2051F, 0.0F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(57, 78).addBox(-0.5542F, -0.4818F, -0.217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.196F, 0.3072F, -3.2066F, -2.6529F, 0.2051F, 0.0F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5542F, -0.4818F, -0.7836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.196F, 0.3072F, -3.2066F, -2.7576F, 0.2051F, 0.0F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(73, 32).addBox(-0.4985F, 0.0931F, -1.1007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.2425F, 0.4155F, -0.5425F, 1.9912F, 0.2121F, 0.0062F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(82, 78).addBox(-0.4985F, -0.3865F, -0.6587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F))
				.texOffs(28, 74).addBox(-0.4985F, -0.0865F, -0.6587F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.2425F, 0.4155F, -0.5425F, -2.8085F, 0.2121F, 0.0062F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(62, 51).addBox(-0.4985F, -0.7835F, -1.2344F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2425F, 0.4155F, -0.5425F, 2.9511F, 0.2121F, 0.0062F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(75, 84).addBox(-0.5F, -0.2062F, -0.2726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5073F, -0.139F, 4.0006F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(84, 72).addBox(-0.5F, 0.2344F, -0.2549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5073F, -1.139F, 3.8006F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(72, 78).addBox(-0.5F, -0.013F, 0.3137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(52, 78).addBox(-0.5F, -0.013F, 0.0138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5073F, -1.5374F, 2.1793F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(5, 83).addBox(-0.5F, -0.9784F, -0.9947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5073F, 1.3133F, 2.2992F, -1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(82, 81).addBox(-0.5F, -0.9784F, 0.0053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5073F, 1.261F, 1.3006F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(69, 64).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5073F, -1.3651F, 1.212F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(78, 40).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5073F, -0.5312F, 0.66F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(40, 78).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5073F, 0.4664F, 0.7298F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(69, 56).addBox(-0.5F, 0.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5073F, -0.239F, 1.7006F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(68, 8).addBox(-0.29F, -0.9F, -0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F))
				.texOffs(67, 67).addBox(-0.56F, -0.9F, -0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7073F, -0.1972F, 2.0984F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(78, 51).addBox(-1.5F, -0.2898F, -0.7099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(78, 51).addBox(-1.1F, -0.2898F, -0.7099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(78, 51).addBox(-0.7F, -0.2898F, -0.7099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.5073F, -0.454F, 6.0115F, -0.5895F, -0.2683F, 0.1611F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(78, 51).addBox(-0.5F, -0.2898F, -0.31F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.7073F, -0.7111F, 5.7051F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, -0.0648F, -0.2099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(7, 71).addBox(-0.525F, 1.0102F, 0.3401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7073F, -0.7111F, 5.7051F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(14, 71).addBox(0.5F, -0.6148F, -1.66F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3177F, 1.8709F, 5.2329F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(77, 81).addBox(-0.5F, -0.875F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5073F, 0.3942F, 2.9412F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(60, 83).addBox(-0.5F, -0.45F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(83, 49).addBox(-0.5F, -0.45F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6823F, 1.1749F, 3.8073F, 2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(42, 83).addBox(-0.5F, -0.675F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6823F, 0.7026F, 4.5932F, -2.7925F, 0.0F, 0.0F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.6323F, 0.7026F, 4.5932F, -1.8762F, 0.0F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5927F, -0.3278F, -5.1282F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(73, 36).mirror().addBox(-0.5F, -0.85F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2253F, -0.3961F, 0.2596F, 0.4196F, -0.198F, -0.0059F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(5, 66).mirror().addBox(-0.031F, -2.0407F, -1.9988F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8645F, 1.465F, 1.1163F, -0.0168F, -0.198F, -0.0059F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(27, 78).mirror().addBox(-0.031F, -1.2548F, -4.9027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8645F, 1.465F, 1.1163F, 0.0007F, -0.198F, -0.0059F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(52, 84).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3677F, 0.9112F, -3.6968F, -0.0358F, -0.218F, 0.0077F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(55, 74).mirror().addBox(-0.5F, -0.35F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.149F, -0.1962F, -1.5999F, 0.3061F, -0.198F, -0.0059F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(84, 12).mirror().addBox(-0.5F, -0.6F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(84, 3).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2189F, 1.363F, -0.4826F, 0.0007F, -0.198F, -0.0059F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-0.181F, -0.4512F, -3.0968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 83).mirror().addBox(-0.181F, -0.4512F, -3.9968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(74, 68).mirror().addBox(-0.031F, -0.9012F, -3.9968F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8645F, 1.465F, 1.1163F, -0.0866F, -0.198F, -0.0059F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(84, 22).mirror().addBox(-0.375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5042F, 1.0388F, -4.0967F, -0.2175F, -0.198F, -0.0059F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(25, 84).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3088F, 1.1264F, -3.1199F, -0.0004F, -0.2502F, -0.0013F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(12, 79).mirror().addBox(-0.5458F, -0.0754F, -0.9023F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.196F, 0.3072F, -3.2066F, 2.7576F, -0.2051F, 0.0F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(79, 3).mirror().addBox(-0.5458F, -0.8871F, -0.0649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.196F, 0.3072F, -3.2066F, 2.8449F, -0.2051F, 0.0F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(57, 78).mirror().addBox(-0.4458F, -0.4818F, -0.217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.196F, 0.3072F, -3.2066F, -2.6529F, -0.2051F, 0.0F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.4458F, -0.4818F, -0.7836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.196F, 0.3072F, -3.2066F, -2.7576F, -0.2051F, 0.0F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(73, 32).mirror().addBox(-0.5015F, 0.0931F, -1.1007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.2425F, 0.4155F, -0.5425F, 1.9912F, -0.2121F, -0.0062F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(82, 78).mirror().addBox(-0.5015F, -0.3865F, -0.6587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false)
				.texOffs(28, 74).mirror().addBox(-0.5015F, -0.0865F, -0.6587F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.2425F, 0.4155F, -0.5425F, -2.8085F, -0.2121F, -0.0062F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(62, 51).mirror().addBox(-0.5015F, -0.7835F, -1.2344F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2425F, 0.4155F, -0.5425F, 2.9511F, -0.2121F, -0.0062F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(75, 84).mirror().addBox(-0.5F, -0.2062F, -0.2726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5073F, -0.139F, 4.0006F, -1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(84, 72).mirror().addBox(-0.5F, 0.2344F, -0.2549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5073F, -1.139F, 3.8006F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(72, 78).mirror().addBox(-0.5F, -0.013F, 0.3137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(52, 78).mirror().addBox(-0.5F, -0.013F, 0.0138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5073F, -1.5374F, 2.1793F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(5, 83).mirror().addBox(-0.5F, -0.9784F, -0.9947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5073F, 1.3133F, 2.2992F, -1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(82, 81).mirror().addBox(-0.5F, -0.9784F, 0.0053F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5073F, 1.261F, 1.3006F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(69, 64).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5073F, -1.3651F, 1.212F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(78, 40).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5073F, -0.5312F, 0.66F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(40, 78).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5073F, 0.4664F, 0.7298F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(69, 56).mirror().addBox(-0.5F, 0.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5073F, -0.239F, 1.7006F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(68, 8).mirror().addBox(-0.71F, -0.9F, -0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(67, 67).mirror().addBox(-0.44F, -0.9F, -0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7073F, -0.1972F, 2.0984F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(78, 51).mirror().addBox(0.5F, -0.2898F, -0.7099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(78, 51).mirror().addBox(0.1F, -0.2898F, -0.7099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(78, 51).mirror().addBox(-0.3F, -0.2898F, -0.7099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.5073F, -0.454F, 6.0115F, -0.5895F, 0.2683F, -0.1611F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(78, 51).mirror().addBox(-0.5F, -0.2898F, -0.31F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.7073F, -0.7111F, 5.7051F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.5F, -0.0648F, -0.2099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(7, 71).mirror().addBox(-0.475F, 1.0102F, 0.3401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7073F, -0.7111F, 5.7051F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(14, 71).mirror().addBox(-1.5F, -0.6148F, -1.66F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3177F, 1.8709F, 5.2329F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(77, 81).mirror().addBox(-0.5F, -0.875F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5073F, 0.3942F, 2.9412F, -1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(60, 83).mirror().addBox(-0.5F, -0.45F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(83, 49).mirror().addBox(-0.5F, -0.45F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6823F, 1.1749F, 3.8073F, 2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(42, 83).mirror().addBox(-0.5F, -0.675F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6823F, 0.7026F, 4.5932F, -2.7925F, 0.0F, 0.0F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.6323F, 0.7026F, 4.5932F, -1.8762F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.3588F, 0.2901F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r217 = Jaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(27, 81).mirror().addBox(-0.525F, -0.8F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(81, 15).mirror().addBox(-0.525F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(27, 81).addBox(1.725F, -0.8F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(81, 15).addBox(1.725F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.2F, 0.9011F, -2.8746F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r218 = Jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(72, 72).mirror().addBox(-0.525F, -0.975F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(80, 30).mirror().addBox(-0.5F, -0.775F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(72, 72).addBox(1.725F, -0.975F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(80, 30).addBox(1.7F, -0.775F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2F, 1.0124F, -2.2596F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r219 = Jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(67, 80).mirror().addBox(-0.175F, -0.3519F, -1.1931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0404F, -3.8419F, -0.0524F, -0.1047F, 0.0F));

		PartDefinition cube_r220 = Jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(62, 80).mirror().addBox(-0.1674F, -0.7554F, -0.6034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.35F, 0.3405F, -5.3419F, -0.0524F, -0.192F, 0.0F));

		PartDefinition cube_r221 = Jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(80, 46).mirror().addBox(-0.1661F, -0.637F, -1.6683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.05F, 0.3405F, -6.8919F, 0.2007F, -0.2618F, 0.0F));

		PartDefinition cube_r222 = Jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(45, 80).mirror().addBox(-0.1661F, -0.6211F, -0.7732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.05F, 0.3405F, -6.8919F, 0.1658F, -0.2618F, 0.0F));

		PartDefinition cube_r223 = Jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(80, 43).mirror().addBox(-0.1674F, -0.7635F, -1.4808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(41, 72).mirror().addBox(-0.1924F, -0.3635F, -1.7808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.35F, 0.3405F, -5.3419F, 0.0349F, -0.192F, 0.0F));

		PartDefinition cube_r224 = Jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(81, 57).mirror().addBox(-0.2911F, -0.4374F, -1.9162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.05F, 0.3405F, -6.8919F, 0.3403F, -0.2618F, 0.0F));

		PartDefinition cube_r225 = Jaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(55, 81).mirror().addBox(-0.2911F, 0.166F, -2.7099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(81, 54).mirror().addBox(-0.2911F, 0.166F, -2.5099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.05F, 0.3405F, -6.8919F, -0.0262F, -0.2618F, 0.0F));

		PartDefinition cube_r226 = Jaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(50, 81).mirror().addBox(-0.2911F, -0.0281F, -2.1931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.05F, 0.3405F, -6.8919F, 0.0785F, -0.2618F, 0.0F));

		PartDefinition cube_r227 = Jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(65, 72).mirror().addBox(-0.2911F, -0.6307F, -3.2551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.05F, 0.3405F, -6.8919F, 0.2967F, -0.2618F, 0.0F));

		PartDefinition cube_r228 = Jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(48, 72).mirror().addBox(-0.1911F, -0.3081F, -1.7917F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.05F, 0.3405F, -6.8919F, 0.1396F, -0.2618F, 0.0F));

		PartDefinition cube_r229 = Jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(72, 28).mirror().addBox(-0.2F, 0.1693F, -1.6073F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0404F, -3.8419F, -0.1571F, -0.1047F, 0.0F));

		PartDefinition cube_r230 = Jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(21, 72).mirror().addBox(-0.2F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.0404F, -3.8419F, 0.0873F, -0.1047F, 0.0F));

		PartDefinition cube_r231 = Jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(80, 36).mirror().addBox(-0.5F, -0.775F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(80, 36).addBox(1.7F, -0.775F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2F, 1.0646F, -3.4562F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r232 = Jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(80, 33).mirror().addBox(-0.5F, -0.775F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(80, 33).addBox(1.7F, -0.775F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.2F, 1.0751F, -2.8563F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r233 = Jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(72, 13).mirror().addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(72, 13).addBox(1.7F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2F, 0.0125F, -2.2422F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r234 = Jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(22, 80).mirror().addBox(-0.5F, -0.775F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(22, 80).addBox(1.7F, -0.775F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.2F, 0.8174F, -0.6716F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r235 = Jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(72, 4).mirror().addBox(-0.5F, -0.775F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(72, 4).addBox(1.7F, -0.775F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.2F, 1.0124F, -2.2596F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r236 = Jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(72, 0).addBox(1.7F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.2F, 0.0404F, -0.6424F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r237 = Jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(58, 70).mirror().addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(58, 70).addBox(1.7F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.2F, 0.535F, 0.1029F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r238 = Jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(72, 28).addBox(-0.8F, 0.1693F, -1.6073F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3F, 0.0404F, -3.8419F, -0.1571F, 0.1047F, 0.0F));

		PartDefinition cube_r239 = Jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(55, 81).addBox(-0.7089F, 0.166F, -2.7099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(81, 54).addBox(-0.7089F, 0.166F, -2.5099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.85F, 0.3405F, -6.8919F, -0.0262F, 0.2618F, 0.0F));

		PartDefinition cube_r240 = Jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(81, 57).addBox(-0.7089F, -0.4374F, -1.9162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.85F, 0.3405F, -6.8919F, 0.3403F, 0.2618F, 0.0F));

		PartDefinition cube_r241 = Jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(50, 81).addBox(-0.7089F, -0.0281F, -2.1931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.85F, 0.3405F, -6.8919F, 0.0785F, 0.2618F, 0.0F));

		PartDefinition cube_r242 = Jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(65, 72).addBox(-0.7089F, -0.6307F, -3.2551F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.85F, 0.3405F, -6.8919F, 0.2967F, 0.2618F, 0.0F));

		PartDefinition cube_r243 = Jaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(48, 72).addBox(-0.8089F, -0.3081F, -1.7917F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.85F, 0.3405F, -6.8919F, 0.1396F, 0.2618F, 0.0F));

		PartDefinition cube_r244 = Jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(80, 46).addBox(-0.8339F, -0.637F, -1.6683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.85F, 0.3405F, -6.8919F, 0.2007F, 0.2618F, 0.0F));

		PartDefinition cube_r245 = Jaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(45, 80).addBox(-0.8339F, -0.6211F, -0.7732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.85F, 0.3405F, -6.8919F, 0.1658F, 0.2618F, 0.0F));

		PartDefinition cube_r246 = Jaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(67, 80).addBox(-0.825F, -0.3519F, -1.1931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3F, 0.0404F, -3.8419F, -0.0524F, 0.1047F, 0.0F));

		PartDefinition cube_r247 = Jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(62, 80).addBox(-0.8326F, -0.7554F, -0.6034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.15F, 0.3405F, -5.3419F, -0.0524F, 0.192F, 0.0F));

		PartDefinition cube_r248 = Jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(80, 43).addBox(-0.8326F, -0.7635F, -1.4808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(41, 72).addBox(-0.8076F, -0.3635F, -1.7808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.15F, 0.3405F, -5.3419F, 0.0349F, 0.192F, 0.0F));

		PartDefinition cube_r249 = Jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(21, 72).addBox(-0.8F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.3F, 0.0404F, -3.8419F, 0.0873F, 0.1047F, 0.0F));

		PartDefinition RArm = Body2.addOrReplaceChild("RArm", CubeListBuilder.create().texOffs(19, 36).addBox(-0.0771F, -0.5307F, -0.3199F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9683F, 5.4654F, -4.9356F, -1.8024F, 0.2368F, -0.0429F));

		PartDefinition RArm2 = RArm.addOrReplaceChild("RArm2", CubeListBuilder.create().texOffs(50, 57).addBox(0.0F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(55, 57).addBox(0.0F, 0.2F, -1.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0771F, -0.2237F, 6.88F, 0.5585F, 0.0F, 0.0F));

		PartDefinition RHand = RArm2.addOrReplaceChild("RHand", CubeListBuilder.create().texOffs(43, 52).addBox(-0.9F, -0.01F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8897F, 8.079F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r250 = RHand.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(10, 60).addBox(-0.91F, -0.01F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.99F, 0.0F, 0.0F, -0.303F, -0.0393F, -0.1249F));

		PartDefinition RArm3 = Body2.addOrReplaceChild("RArm3", CubeListBuilder.create().texOffs(19, 36).mirror().addBox(-0.9229F, -0.5307F, -0.3199F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9683F, 5.4654F, -4.9356F, -0.8861F, -0.2368F, 0.0429F));

		PartDefinition RArm4 = RArm3.addOrReplaceChild("RArm4", CubeListBuilder.create().texOffs(50, 57).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(55, 57).mirror().addBox(-1.0F, 0.2F, -1.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0771F, -0.2237F, 6.88F, 0.0349F, 0.0F, 0.0F));

		PartDefinition RHand2 = RArm4.addOrReplaceChild("RHand2", CubeListBuilder.create().texOffs(43, 52).mirror().addBox(-0.1F, -0.01F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8897F, 8.079F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r251 = RHand2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(10, 60).mirror().addBox(-1.09F, -0.01F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.99F, 0.0F, 0.0F, -0.303F, 0.0393F, 0.1249F));

		PartDefinition Tail = Lagerpeton.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(25, 25).addBox(-0.5F, -0.6013F, -0.0611F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.1852F, 3.8355F, 0.0903F, -0.1231F, -0.098F));

		PartDefinition cube_r252 = Tail.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(71, 87).addBox(0.0F, -0.95F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6013F, 6.9389F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r253 = Tail.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(18, 86).addBox(0.0F, -1.125F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6013F, 4.9389F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r254 = Tail.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(33, 85).addBox(0.0F, -1.325F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6013F, 2.9389F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r255 = Tail.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(28, 53).addBox(0.0F, 2.4F, 5.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 45).addBox(0.0F, 1.7F, 3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 31).addBox(0.0F, 0.5F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 26).addBox(0.0F, -1.3F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0987F, 1.4389F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r256 = Tail.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(10, 85).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6013F, 0.9389F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r257 = Tail.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(36, 36).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1013F, 0.9389F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r258 = Tail.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(36, 36).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1013F, 0.9389F, 0.0F, -0.0349F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(25, 13).addBox(-0.5F, -0.6584F, -0.0376F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.006F))
				.texOffs(87, 77).addBox(0.0F, -1.1584F, 3.9624F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 80).addBox(0.0F, -1.1584F, 5.9624F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 88).addBox(0.0F, -1.0584F, 7.9624F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0958F, 8.9416F, 0.0595F, -0.1698F, -0.0961F));

		PartDefinition cube_r259 = Tail2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(77, 87).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6584F, 1.9624F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r260 = Tail2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(74, 87).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6584F, -0.0376F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r261 = Tail2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-0.8F, 0.0F, 0.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1584F, -0.0376F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r262 = Tail2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 26).addBox(-0.2F, 0.0F, 0.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1584F, -0.0376F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r263 = Tail2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(86, 54).addBox(0.0F, 8.6F, 15.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 86).addBox(0.0F, 7.4F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 86).addBox(0.0F, 6.5F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 86).addBox(0.0F, 5.3F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -9.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, -0.4147F, 0.0474F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.01F))
				.texOffs(6, 88).addBox(0.0F, -0.8147F, 0.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 6).addBox(0.0F, -0.8147F, 2.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 88).addBox(0.0F, -0.7147F, 4.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 17).addBox(0.0F, -0.6147F, 6.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2087F, 9.8515F, 0.0448F, 0.3567F, -0.1074F));

		PartDefinition cube_r264 = Tail3.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(88, 38).addBox(0.0F, 1.4F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 31).addBox(0.0F, 0.7F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 28).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5768F, 5.7818F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r265 = Tail3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(86, 62).addBox(0.0F, 12.8F, 22.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 86).addBox(0.0F, 11.7F, 20.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3584F, -23.3624F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4147F, 0.0474F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.044F, 10.9706F, 0.1007F, 0.5214F, 0.0503F));

		PartDefinition cube_r266 = Tail4.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(36, 87).addBox(0.0F, 15.6F, 26.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 13).addBox(0.0F, 14.4F, 24.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 67).addBox(0.0F, 13.2F, 22.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 51).addBox(0.0F, 11.9F, 20.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3584F, -23.3624F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.4148F, 0.0474F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0366F, 10.9354F, -0.128F, 0.3031F, -0.0384F));

		PartDefinition RLeg = Lagerpeton.addOrReplaceChild("RLeg", CubeListBuilder.create().texOffs(22, 63).addBox(0.5F, 0.7067F, 0.3421F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.0F, 1.026F, 0.8445F, -0.9773F, -0.2556F, -0.1412F));

		PartDefinition cube_r267 = RLeg.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(37, 81).addBox(-1.0F, -1.0F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 10.1538F, 3.211F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r268 = RLeg.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(75, 19).addBox(-1.0F, -1.95F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5F, 9.5815F, 3.3226F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r269 = RLeg.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(12, 66).addBox(1.0F, 0.175F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 7.4292F, 0.8934F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r270 = RLeg.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(12, 75).addBox(1.0F, 0.2F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.5067F, 0.3421F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r271 = RLeg.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(80, 9).addBox(1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.7127F, 1.6523F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r272 = RLeg.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(47, 76).addBox(1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 1.7128F, 1.6348F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r273 = RLeg.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(22, 76).addBox(1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2145F, 1.1003F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r274 = RLeg.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(79, 27).addBox(1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -0.7145F, 0.2343F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r275 = RLeg.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(79, 12).addBox(1.0F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.6629F, 0.0275F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r276 = RLeg.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(79, 0).addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6629F, 0.0275F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r277 = RLeg.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(17, 76).addBox(1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, 1.5067F, 1.3421F, 0.3054F, 0.0F, 0.0F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 10.8272F, 3.0921F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r278 = RLeg2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(0, 50).addBox(0.0F, -6.2F, -0.7F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(68, 20).addBox(-1.0F, -6.15F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(5, 50).addBox(-1.0F, -5.2F, -0.7F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 6.3486F, 1.1721F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r279 = RLeg2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(63, 8).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.5F, 1.3402F, -0.6715F, 0.2094F, 0.0F, 0.0F));

		PartDefinition RLeg3 = RLeg2.addOrReplaceChild("RLeg3", CubeListBuilder.create().texOffs(10, 50).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 15.1975F, 1.4474F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r280 = RLeg3.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(35, 74).addBox(-0.6F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.024F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition digit = RLeg3.addOrReplaceChild("digit", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9458F, 0.2629F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r281 = digit.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(7, 75).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(-0.1376F, 0.3376F, 0.0817F, 0.082F, -0.0298F, 0.5224F));

		PartDefinition cube_r282 = digit.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(17, 63).addBox(-0.2826F, -0.4019F, -0.5086F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.1745F));

		PartDefinition digit2 = digit.addOrReplaceChild("digit2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, 5.5093F, 0.3943F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r283 = digit2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(7, 75).addBox(-0.2826F, 5.01F, -2.4011F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(0.7F, -5.5F, -0.5F, 0.4363F, 0.0F, 0.1745F));

		PartDefinition RFoot = RLeg3.addOrReplaceChild("RFoot", CubeListBuilder.create().texOffs(59, 20).addBox(-0.5F, -0.8827F, -2.4239F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 8.5447F, -0.1234F, 0.6547F, 0.0421F, 0.0113F));

		PartDefinition cube_r284 = RFoot.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(28, 62).addBox(-0.9F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, -0.8827F, 0.0761F, 0.0F, -0.2182F, 0.0F));

		PartDefinition RFoot2 = RFoot.addOrReplaceChild("RFoot2", CubeListBuilder.create().texOffs(17, 53).addBox(-0.5F, -0.4827F, -3.9239F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3979F, -2.2418F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r285 = RFoot2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(46, 25).addBox(-0.45F, -0.5F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7794F, 0.0173F, -1.461F, 0.0F, -0.2182F, 0.0F));

		PartDefinition RLeg4 = Lagerpeton.addOrReplaceChild("RLeg4", CubeListBuilder.create().texOffs(22, 63).mirror().addBox(-1.5F, 0.7067F, 0.3421F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.026F, 0.8445F, -1.4219F, 0.3994F, 0.0453F));

		PartDefinition cube_r286 = RLeg4.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(37, 81).mirror().addBox(0.0F, -1.0F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 10.1538F, 3.211F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r287 = RLeg4.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(75, 19).mirror().addBox(0.0F, -1.95F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 9.5815F, 3.3226F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r288 = RLeg4.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(12, 66).mirror().addBox(-2.0F, 0.175F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5F, 7.4292F, 0.8934F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r289 = RLeg4.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(12, 75).mirror().addBox(-2.0F, 0.2F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.5067F, 0.3421F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r290 = RLeg4.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(80, 9).mirror().addBox(-2.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.7127F, 1.6523F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r291 = RLeg4.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(47, 76).mirror().addBox(-2.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.7128F, 1.6348F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r292 = RLeg4.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(22, 76).mirror().addBox(-2.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.2145F, 1.1003F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r293 = RLeg4.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(79, 27).mirror().addBox(-2.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.7145F, 0.2343F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r294 = RLeg4.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(79, 12).mirror().addBox(-2.0F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.6629F, 0.0275F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r295 = RLeg4.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.6629F, 0.0275F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r296 = RLeg4.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(17, 76).mirror().addBox(-2.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.5067F, 1.3421F, 0.3054F, 0.0F, 0.0F));

		PartDefinition RLeg5 = RLeg4.addOrReplaceChild("RLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 10.8272F, 3.0921F, 1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r297 = RLeg5.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-1.0F, -6.2F, -0.7F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(68, 20).mirror().addBox(0.0F, -6.15F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(5, 50).mirror().addBox(0.0F, -5.2F, -0.7F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.3486F, 1.1721F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r298 = RLeg5.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(63, 8).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.3402F, -0.6715F, 0.2094F, 0.0F, 0.0F));

		PartDefinition RLeg6 = RLeg5.addOrReplaceChild("RLeg6", CubeListBuilder.create().texOffs(10, 50).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, 15.1975F, 1.4474F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r299 = RLeg6.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(35, 74).mirror().addBox(-0.4F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.024F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition digit3 = RLeg6.addOrReplaceChild("digit3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9458F, 0.2629F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r300 = digit3.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(7, 75).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.022F)).mirror(false), PartPose.offsetAndRotation(0.1376F, 0.3376F, 0.0817F, 0.082F, 0.0298F, -0.5224F));

		PartDefinition cube_r301 = digit3.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(17, 63).mirror().addBox(-0.7174F, -0.4019F, -0.5086F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.022F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, -0.1745F));

		PartDefinition digit4 = digit3.addOrReplaceChild("digit4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, 5.5093F, 0.3943F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r302 = digit4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(7, 75).mirror().addBox(-0.7174F, 5.01F, -2.4011F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.022F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -5.5F, -0.5F, 0.4363F, 0.0F, -0.1745F));

		PartDefinition RFoot3 = RLeg6.addOrReplaceChild("RFoot3", CubeListBuilder.create().texOffs(59, 20).mirror().addBox(-0.5F, -0.8827F, -2.4239F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 8.5447F, -0.1234F, 0.262F, -0.0421F, -0.0113F));

		PartDefinition cube_r303 = RFoot3.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(28, 62).mirror().addBox(-0.1F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.8827F, 0.0761F, 0.0F, 0.2182F, 0.0F));

		PartDefinition RFoot4 = RFoot3.addOrReplaceChild("RFoot4", CubeListBuilder.create().texOffs(17, 53).mirror().addBox(-0.5F, -0.4827F, -3.9239F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -0.3979F, -2.2418F));

		PartDefinition cube_r304 = RFoot4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(46, 25).mirror().addBox(-0.55F, -0.5F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7794F, 0.0173F, -1.461F, 0.0F, 0.2182F, 0.0F));

		return LayerDefinition.create(meshdefinition, 92, 92);
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