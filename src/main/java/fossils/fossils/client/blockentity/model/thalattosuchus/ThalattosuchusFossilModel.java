package fossils.fossils.client.blockentity.model.thalattosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ThalattosuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Body;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Lowerjaw;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart UpperArmL;
	private final ModelPart HandL;
	private final ModelPart UpperArmL2;
	private final ModelPart HandL2;
	private final ModelPart Body2;
	private final ModelPart bone;
	private final ModelPart Body3;
	private final ModelPart body5;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart UpperLegL;
	private final ModelPart LowerLegL;
	private final ModelPart FootL;
	private final ModelPart UpperLegL2;
	private final ModelPart LowerLegL2;
	private final ModelPart FootL2;
	private final ModelPart Body4;
	private final ModelPart Tail;
	private final ModelPart tail5;
	private final ModelPart Tail2;
	private final ModelPart tail6;
	private final ModelPart Tail3;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart Tail4;

	public ThalattosuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Body = this.fossil.getChild("Body");
		this.Neck = this.Body.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Head = this.Neck2.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
		this.bone2 = this.Body.getChild("bone2");
		this.bone4 = this.Body.getChild("bone4");
		this.UpperArmL = this.Body.getChild("UpperArmL");
		this.HandL = this.UpperArmL.getChild("HandL");
		this.UpperArmL2 = this.Body.getChild("UpperArmL2");
		this.HandL2 = this.UpperArmL2.getChild("HandL2");
		this.Body2 = this.Body.getChild("Body2");
		this.bone = this.Body2.getChild("bone");
		this.Body3 = this.bone.getChild("Body3");
		this.body5 = this.Body3.getChild("body5");
		this.bone3 = this.body5.getChild("bone3");
		this.bone5 = this.body5.getChild("bone5");
		this.UpperLegL = this.body5.getChild("UpperLegL");
		this.LowerLegL = this.UpperLegL.getChild("LowerLegL");
		this.FootL = this.LowerLegL.getChild("FootL");
		this.UpperLegL2 = this.body5.getChild("UpperLegL2");
		this.LowerLegL2 = this.UpperLegL2.getChild("LowerLegL2");
		this.FootL2 = this.LowerLegL2.getChild("FootL2");
		this.Body4 = this.body5.getChild("Body4");
		this.Tail = this.Body4.getChild("Tail");
		this.tail5 = this.Tail.getChild("tail5");
		this.Tail2 = this.tail5.getChild("Tail2");
		this.tail6 = this.Tail2.getChild("tail6");
		this.Tail3 = this.tail6.getChild("Tail3");
		this.tail7 = this.Tail3.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.Tail4 = this.tail9.getChild("Tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = fossil.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(13, 91).addBox(0.2F, -2.2013F, -2.5895F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2F, -20.2871F, -15.087F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(19, 91).addBox(1.565F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.365F, -1.0978F, 1.3954F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 91).addBox(1.565F, -1.35F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.365F, -0.9235F, -0.597F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(61, 41).mirror().addBox(-0.9326F, 0.0086F, -0.4191F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4948F, 1.8638F, 0.5732F, 0.089F, -0.3765F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(31, 48).mirror().addBox(-2.8293F, -0.422F, -0.3966F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4948F, 1.8638F, 0.4846F, 0.3129F, -0.811F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(68, 39).mirror().addBox(-4.2995F, -1.6646F, -0.3319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4948F, 1.8638F, 0.2923F, 0.4748F, -1.3019F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(62, 35).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4448F, -0.1362F, 0.6075F, 0.145F, -0.499F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(68, 46).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4448F, -0.1362F, 0.4923F, 0.378F, -0.9348F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(88, 72).mirror().addBox(-3.4821F, -1.6322F, -0.4069F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4448F, -0.1362F, 0.264F, 0.5354F, -1.442F));

		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(89, 49).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2948F, -2.1362F, 0.5606F, 0.2705F, -0.5978F));

		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(34, 29).mirror().addBox(-3.9745F, -0.3095F, -0.4759F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.2948F, -2.1362F, 0.3868F, 0.4708F, -1.0674F));

		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(19, 67).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.7541F, 3.8838F, -1.8318F, 0.1864F, -0.8205F, 0.4066F));

		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(47, 22).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.7192F, 3.8418F, -1.9436F, 0.1261F, -0.4402F, 0.5027F));

		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(19, 24).mirror().addBox(-0.5F, 0.0F, -0.3F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.1855F, 4.2226F, -1.4231F, -0.0298F, -0.4801F, 0.5231F));

		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-0.5F, 0.0F, 0.3F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.0943F, 4.2672F, -1.6262F, -0.0951F, -0.3805F, 0.4866F));

		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(65, 4).mirror().addBox(-0.325F, -0.5F, -0.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3564F, 3.7572F, -2.1546F, -0.1866F, 0.1887F, -0.0354F));

		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(65, 4).addBox(-0.675F, -0.5F, -0.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7564F, 3.7572F, -2.1546F, -0.1866F, -0.1887F, 0.0354F));

		PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, 0.0F, 0.3F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.4944F, 4.2672F, -1.6262F, -0.0951F, 0.3805F, -0.4866F));

		PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(19, 24).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5855F, 4.2226F, -1.4231F, -0.0298F, 0.4801F, -0.5231F));

		PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(47, 22).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1193F, 3.8418F, -1.9436F, 0.1261F, 0.4402F, -0.5027F));

		PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(19, 67).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1541F, 3.8838F, -1.8318F, 0.1864F, 0.8205F, -0.4066F));

		PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(58, 19).addBox(-1.4643F, -0.1546F, -2.2226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1643F, 3.7133F, -0.4959F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(16, 57).addBox(-1.9643F, 0.289F, -3.9983F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1643F, 3.7133F, -0.4959F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(15, 38).addBox(0.065F, 0.25F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.365F, -1.0567F, -2.5159F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(34, 29).addBox(0.9745F, -0.3095F, -0.4759F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.2948F, -2.1362F, 0.3868F, -0.4708F, 1.0674F));

		PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(89, 49).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.2948F, -2.1362F, 0.5606F, -0.2705F, 0.5978F));

		PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(88, 72).addBox(2.4821F, -1.6322F, -0.4069F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.4448F, -0.1362F, 0.264F, -0.5354F, 1.442F));

		PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(68, 46).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.4448F, -0.1362F, 0.4923F, -0.378F, 0.9348F));

		PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(28, 38).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 5.0906F, 1.9314F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r29 = Body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(62, 35).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.4448F, -0.1362F, 0.6075F, -0.145F, 0.499F));

		PartDefinition cube_r30 = Body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(68, 39).addBox(2.2995F, -1.6646F, -0.3319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.4948F, 1.8638F, 0.2923F, -0.4748F, 1.3019F));

		PartDefinition cube_r31 = Body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(31, 48).addBox(0.8293F, -0.422F, -0.3966F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.4948F, 1.8638F, 0.4846F, -0.3129F, 0.811F));

		PartDefinition cube_r32 = Body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(61, 41).addBox(-0.0674F, 0.0086F, -0.4191F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -0.4948F, 1.8638F, 0.5732F, -0.089F, 0.3765F));

		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.135F, -0.3493F, -2.3944F, 0.0801F, 0.0F, 0.0F));

		PartDefinition cube_r33 = Neck.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(45, 90).addBox(1.065F, -1.125F, 4.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 0).addBox(0.565F, 0.05F, 3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.75F, -6.55F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r34 = Neck.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(31, 69).mirror().addBox(-2.0077F, 0.0749F, -0.8012F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.51F, -0.0455F, -1.7417F, 0.5874F, 0.9016F, -0.7987F));

		PartDefinition cube_r35 = Neck.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(31, 69).addBox(0.0077F, 0.0749F, -0.8012F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.64F, -0.0455F, -1.7417F, 0.5874F, -0.9016F, 0.7987F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0905F, -2.9821F, -0.3214F, 0.0F, 0.0F));

		PartDefinition cube_r36 = Neck2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(18, 31).addBox(0.565F, 0.05F, 1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(10, 91).addBox(1.065F, -1.05F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.75F, -6.55F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r37 = Neck2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(69, 31).addBox(0.0F, -0.45F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, -0.8527F, -3.0443F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r38 = Neck2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(90, 83).mirror().addBox(-1.0077F, 0.0748F, -0.8012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.51F, -0.055F, -0.7596F, 0.6566F, 0.9726F, -0.7128F));

		PartDefinition cube_r39 = Neck2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(90, 85).mirror().addBox(-1.0077F, 0.0748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.51F, -0.055F, -2.7596F, 0.4096F, 0.8776F, -1.218F));

		PartDefinition cube_r40 = Neck2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(90, 85).addBox(0.0077F, 0.0748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.64F, -0.055F, -2.7596F, 0.4096F, -0.8776F, 1.218F));

		PartDefinition cube_r41 = Neck2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(90, 83).addBox(0.0077F, 0.0748F, -0.8012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.64F, -0.055F, -0.7596F, 0.6566F, -0.9726F, 0.7128F));

		PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5975F, -4.5511F, -0.2893F, 0.0F, 0.0F));

		PartDefinition cube_r42 = Head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(20, 53).addBox(-1.0F, 0.4F, 0.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.065F, 1.1365F, -1.5027F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r43 = Head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(50, 71).addBox(-0.5F, -5.7F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(35, 63).addBox(-0.5F, -3.9F, -1.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.065F, -1.8501F, -12.031F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r44 = Head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(38, 55).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, 0.1195F, -8.4088F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(55, 31).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, 0.917F, -4.4891F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r46 = Head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 53).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, 0.9694F, -2.4898F, 1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(65, 21).addBox(-0.5F, -2.8F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.065F, -2.2074F, -14.2206F, -1.7191F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(36, 71).addBox(-0.5F, -1.325F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.065F, -1.2687F, -8.8322F, -1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(71, 27).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.065F, -1.0486F, -10.1481F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r50 = Head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(26, 71).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.065F, -1.2297F, -11.7379F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r51 = Head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(5, 71).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.065F, -2.4162F, -15.8069F, -1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r52 = Head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(63, 70).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.065F, -2.5974F, -17.3966F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r53 = Head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(79, 62).addBox(-1.935F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, -2.4037F, -17.6377F, -2.7096F, 0.0F, 0.0F));

		PartDefinition cube_r54 = Head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(62, 31).addBox(-0.5F, -0.525F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.065F, -2.1098F, -18.1062F, -2.9365F, 0.0F, 0.0F));

		PartDefinition cube_r55 = Head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(25, 59).addBox(-0.5F, -0.55F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.065F, -2.1098F, -18.1062F, 2.9627F, 0.0F, 0.0F));

		PartDefinition cube_r56 = Head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 59).addBox(-1.935F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, -2.3076F, -17.8392F, 2.9976F, 0.0F, 0.0F));

		PartDefinition cube_r57 = Head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(79, 48).addBox(-1.935F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, -2.3418F, -17.9388F, -3.0761F, 0.0F, 0.0F));

		PartDefinition cube_r58 = Head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(85, 85).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.065F, -1.5222F, -4.0013F, 3.1023F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(86, 36).addBox(-0.5F, -0.575F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.065F, 1.0508F, -3.4353F, 0.528F, 0.0F, 0.0F));

		PartDefinition cube_r60 = Head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.065F, 1.4589F, -4.0127F, 1.4006F, 0.0F, 0.0F));

		PartDefinition cube_r61 = Head.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(64, 27).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.065F, 0.9368F, -5.946F, 2.7096F, 0.0F, 0.0F));

		PartDefinition cube_r62 = Head.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(58, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.065F, 0.8642F, -4.3953F, 2.9278F, 0.0F, 0.0F));

		PartDefinition cube_r63 = Head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(81, 40).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.565F, -1.6235F, -4.8797F, 2.6354F, 0.0F, 0.0F));

		PartDefinition cube_r64 = Head.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(12, 67).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.065F, -1.7123F, -6.8876F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r65 = Head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(65, 8).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.565F, -1.6932F, -5.8773F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r66 = Head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(31, 71).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.065F, -1.7123F, -6.8876F, -1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r67 = Head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 67).addBox(-1.0F, 0.0F, -1.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.065F, -1.6944F, -5.8628F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r68 = Head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(25, 78).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.065F, -1.521F, -3.9869F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r69 = Head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(69, 65).addBox(-0.5F, -0.1874F, 0.8069F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(69, 48).addBox(-0.5F, -0.1874F, 0.0069F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, -1.3652F, -3.009F, -0.0611F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.229F, -1.5413F, -2.1664F));

		PartDefinition cube_r70 = leftFace.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(58, 0).addBox(-0.7147F, -2.3911F, -0.2134F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.1395F, 0.7816F, -7.0909F, 1.4962F, 0.1397F, -0.0029F));

		PartDefinition cube_r71 = leftFace.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(72, 4).addBox(-0.741F, -2.3202F, -0.3494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.1395F, 0.7816F, -7.0909F, 1.4353F, 0.0699F, -0.0029F));

		PartDefinition cube_r72 = leftFace.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(70, 0).addBox(-0.475F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.3225F, 2.5428F, -1.1744F, 1.4565F, 0.1611F, -0.0066F));

		PartDefinition cube_r73 = leftFace.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(79, 30).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.2384F, 1.9003F, -0.7024F, 1.7104F, 0.1789F, 0.0F));

		PartDefinition cube_r74 = leftFace.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(46, 75).addBox(-0.5016F, -1.1101F, -0.0684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.2675F, 2.0955F, 1.6852F, -1.7108F, 0.0909F, -0.0132F));

		PartDefinition cube_r75 = leftFace.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 70).addBox(-0.4953F, -1.3415F, -0.6868F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.2675F, 2.0955F, 1.6852F, 0.336F, 0.0916F, 0.0F));

		PartDefinition cube_r76 = leftFace.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(69, 69).addBox(-0.4953F, -1.0392F, -1.1311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2675F, 2.0955F, 1.6852F, -0.144F, 0.0916F, 0.0F));

		PartDefinition cube_r77 = leftFace.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(20, 79).addBox(-0.5016F, -0.5006F, -0.0389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(15, 79).addBox(-0.5016F, -0.9006F, -0.0389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2675F, 2.0955F, 1.6852F, -1.689F, 0.0909F, -0.0132F));

		PartDefinition cube_r78 = leftFace.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(82, 15).addBox(-0.15F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.1756F, 0.3103F, 0.2453F, 3.0333F, -0.3798F, 1.7168F));

		PartDefinition cube_r79 = leftFace.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(65, 53).addBox(-1.85F, -0.15F, -0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.5455F, 1.2187F, 1.8724F, -2.9625F, -0.5956F, 0.4289F));

		PartDefinition cube_r80 = leftFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(10, 79).addBox(0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.8508F, 1.1033F, 1.0427F, -2.7306F, -0.4766F, -0.0185F));

		PartDefinition cube_r81 = leftFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(9, 51).addBox(-2.1982F, -0.5021F, 0.1979F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.0304F, 1.0455F, -1.009F, -0.2604F, -1.5089F, 0.6915F));

		PartDefinition cube_r82 = leftFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(49, 50).addBox(-1.7602F, -0.5021F, -0.3784F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(44, 35).addBox(-1.6102F, -0.5021F, -1.1534F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.0304F, 1.0455F, -1.009F, -0.1083F, -1.4228F, 0.5387F));

		PartDefinition cube_r83 = leftFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(87, 18).addBox(-0.625F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5616F, 0.1154F, -2.8664F, -0.7416F, 0.003F, 0.1896F));

		PartDefinition cube_r84 = leftFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(71, 60).addBox(-0.625F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.5616F, 0.1154F, -2.8664F, -1.623F, 0.003F, 0.1896F));

		PartDefinition cube_r85 = leftFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(87, 15).addBox(-0.9F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.5616F, 0.1154F, -2.8664F, -2.1523F, 0.8827F, -0.2512F));

		PartDefinition cube_r86 = leftFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(87, 12).addBox(-0.9F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.3299F, 1.222F, -2.908F, -0.8433F, 0.8827F, -0.2512F));

		PartDefinition cube_r87 = leftFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.1854F, 1.1574F, -2.2619F, -0.6688F, 0.8827F, -0.2512F));

		PartDefinition cube_r88 = leftFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(79, 6).addBox(-0.5F, -0.45F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0987F, 1.3224F, -1.7085F, -0.2878F, 0.2262F, 0.0402F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(60, 74).addBox(-0.3775F, -1.4239F, -0.7983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(74, 48).addBox(-0.3775F, -1.8239F, -0.7983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1395F, 0.7816F, -7.0909F, -2.1332F, 0.125F, -0.1136F));

		PartDefinition cube_r90 = leftFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(64, 65).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.044F, 1.6006F, -1.6858F, 1.5896F, 0.1541F, 0.0146F));

		PartDefinition cube_r91 = leftFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(82, 51).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-0.1026F, 1.7598F, -2.048F, 0.4115F, 0.1541F, 0.0146F));

		PartDefinition cube_r92 = leftFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(82, 21).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0649F, 2.2448F, -1.7595F, -0.243F, 0.1541F, 0.0146F));

		PartDefinition cube_r93 = leftFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(20, 82).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.0036F, 2.2556F, -1.3643F, -1.5956F, 0.1541F, 0.0146F));

		PartDefinition cube_r94 = leftFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(82, 18).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0578F, 2.249F, -0.9691F, -3.1228F, 0.1541F, 0.0146F));

		PartDefinition cube_r95 = leftFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.2736F, 2.1282F, 0.4088F, -3.0529F, 0.1541F, 0.0146F));

		PartDefinition cube_r96 = leftFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(78, 73).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2995F, 1.9076F, 0.5547F, 1.834F, 0.1541F, 0.0146F));

		PartDefinition cube_r97 = leftFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(65, 83).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9287F, 0.0942F, -16.0204F, 1.4323F, 0.0935F, -0.1064F));

		PartDefinition cube_r98 = leftFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(45, 78).addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9513F, -0.1512F, -16.7852F, 1.2577F, 0.0935F, -0.1064F));

		PartDefinition cube_r99 = leftFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(71, 77).addBox(-1.1032F, 4.5472F, -1.0823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 78).addBox(-1.1032F, 2.1472F, -1.0323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(76, 77).addBox(-1.1032F, 2.9472F, -1.0323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(66, 77).addBox(-1.1032F, 3.7472F, -1.0823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9939F, 0.5246F, -9.6029F, 1.3308F, 0.144F, 0.0F));

		PartDefinition cube_r100 = leftFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(77, 51).addBox(-0.4713F, -7.8874F, -0.2611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(51, 77).addBox(-0.4713F, -7.0874F, -0.2611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(40, 77).addBox(-0.4713F, -6.2874F, -0.2611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(77, 22).addBox(-0.4713F, -5.4874F, -0.2861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(77, 19).addBox(-0.4713F, -4.6874F, -0.2861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4575F, 1.4689F, -7.6995F, 1.4268F, 0.0611F, 0.0F));

		PartDefinition cube_r101 = leftFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(77, 16).addBox(-0.6972F, -0.2325F, 0.2188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4575F, 1.4689F, -11.3995F, 1.4268F, 0.096F, 0.0F));

		PartDefinition cube_r102 = leftFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(77, 13).addBox(-0.6972F, 0.5295F, 0.2319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(77, 3).addBox(-0.6972F, 1.3295F, 0.1819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4575F, 1.4689F, -11.3995F, 1.3744F, 0.096F, 0.0F));

		PartDefinition cube_r103 = leftFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 77).addBox(-0.6972F, 2.1575F, 0.1014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4575F, 1.4689F, -11.3995F, 1.4181F, 0.096F, 0.0F));

		PartDefinition cube_r104 = leftFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(76, 59).addBox(-0.6972F, 2.895F, 0.3307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4575F, 1.4689F, -11.3995F, 1.3308F, 0.096F, 0.0F));

		PartDefinition cube_r105 = leftFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(61, 77).addBox(0.1928F, -3.2573F, -0.8683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(56, 77).addBox(-0.0722F, -3.2971F, -0.8711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-1.8137F, 1.3654F, -6.4391F, -1.6406F, 0.1789F, 0.0F));

		PartDefinition cube_r106 = leftFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(87, 51).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.5086F, 2.264F, -3.44F, -2.8623F, 0.1789F, 0.0F));

		PartDefinition cube_r107 = leftFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(87, 3).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.7336F, 1.8167F, -4.6843F, -0.5323F, 0.1789F, 0.0F));

		PartDefinition cube_r108 = leftFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7902F, 1.3079F, -4.9972F, 0.5585F, 0.1789F, 0.0F));

		PartDefinition cube_r109 = leftFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(78, 86).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.7528F, 0.7459F, -4.7904F, 1.213F, 0.1789F, 0.0F));

		PartDefinition cube_r110 = leftFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(86, 74).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.6834F, 0.2897F, -4.407F, 2.4347F, 0.1789F, 0.0F));

		PartDefinition cube_r111 = leftFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(15, 88).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5801F, 0.1394F, -3.8354F, -2.8885F, 0.1789F, 0.0F));

		PartDefinition cube_r112 = leftFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(10, 88).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.4738F, 0.1969F, -3.2476F, -1.6668F, 0.1789F, 0.0F));

		PartDefinition cube_r113 = leftFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(73, 86).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4133F, 0.6914F, -2.9132F, -0.9687F, 0.1789F, 0.0F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(68, 86).addBox(-0.5F, -0.8F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.3735F, 1.2486F, -2.6929F, 0.3403F, 0.1789F, 0.0F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(63, 86).addBox(-0.5F, -0.725F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.3425F, 1.6163F, -2.5213F, 2.1991F, 0.1789F, 0.0F));

		PartDefinition cube_r116 = leftFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(58, 86).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.406F, 2.0986F, -2.8725F, 2.5045F, 0.1789F, 0.0F));

		PartDefinition cube_r117 = leftFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(43, 87).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.6147F, 2.1961F, -4.0267F, -1.6842F, 0.1789F, 0.0F));

		PartDefinition cube_r118 = leftFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(53, 86).addBox(0.1523F, -1.3191F, 1.8501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.7137F, 1.3654F, -6.4391F, -0.5061F, 0.1789F, 0.0F));

		PartDefinition cube_r119 = leftFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(57, 62).addBox(-0.7023F, -0.275F, -0.154F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F))
				.texOffs(41, 62).addBox(-0.7023F, -0.5F, -0.154F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2685F, 0.1517F, -4.4319F, 2.982F, -0.8835F, -2.9715F));

		PartDefinition cube_r120 = leftFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(63, 0).addBox(-0.8F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9748F, -0.1337F, -4.9165F, 2.2553F, -0.1367F, -1.7168F));

		PartDefinition cube_r121 = leftFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(10, 76).addBox(-0.641F, -0.4F, -0.612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.2685F, 0.1517F, -4.4319F, 0.8118F, -1.0268F, -0.804F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(15, 82).addBox(-0.491F, -0.5F, -0.612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2685F, 0.1517F, -4.4319F, 0.2758F, -1.1916F, -0.2108F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(15, 76).addBox(-0.2F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4055F, -0.1852F, -4.1486F, -0.1808F, -0.1342F, 1.4446F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(75, 45).addBox(-0.2865F, -0.5F, -0.1608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2685F, 0.1517F, -4.4319F, 0.1031F, -0.2F, 0.0258F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(88, 69).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.1892F, -0.816F, -17.1131F, -1.4289F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(88, 33).addBox(-0.75F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.9392F, -0.5448F, -16.908F, -1.8653F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(20, 88).addBox(-3.5705F, 4.389F, 0.6077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4644F, -0.1197F, -11.0641F, -1.8653F, -0.4608F, 0.1321F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(30, 87).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.0111F, -0.8804F, -16.6753F, -0.2072F, -0.4608F, 0.1321F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(87, 21).addBox(-3.5705F, 4.2331F, -1.8447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4644F, -0.1197F, -11.0641F, -1.3853F, -0.4608F, 0.1321F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(76, 39).addBox(-0.6839F, 5.1429F, 0.6264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.4644F, -0.1197F, -11.0641F, -1.837F, 0.0349F, 0.0F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(81, 54).addBox(-0.5825F, 0.1463F, -5.7668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.4644F, -0.1197F, -11.0641F, -0.1963F, 0.0698F, 0.0F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(81, 57).addBox(-0.5825F, 2.6422F, -3.6583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.4644F, -0.1197F, -11.0641F, -0.8945F, 0.0698F, 0.0F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(86, 57).addBox(-0.5825F, 3.972F, -2.0118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4644F, -0.1197F, -11.0641F, -1.3308F, 0.0698F, 0.0F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(86, 54).addBox(-0.5825F, 4.2033F, -0.0712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.4644F, -0.1197F, -11.0641F, -1.7235F, 0.0698F, 0.0F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(45, 81).addBox(-0.5825F, -0.1531F, 3.663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.4644F, -0.1197F, -11.0641F, -3.1198F, 0.0698F, 0.0F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(22, 48).addBox(-0.7978F, -1.3117F, -2.621F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.1829F, -0.4512F, -10.538F, 2.9103F, 0.1047F, 0.0F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(82, 12).addBox(-0.5825F, -0.7619F, -4.6295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 82).addBox(-0.5825F, -0.7619F, -4.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.4644F, -0.1197F, -11.0641F, -0.0829F, 0.0698F, 0.0F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(82, 3).addBox(-0.5825F, -3.5221F, -0.3538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4644F, -0.1197F, -11.0641F, 1.453F, 0.0698F, 0.0F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(81, 76).addBox(-0.5825F, -0.4014F, 1.9295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(40, 50).addBox(-0.5825F, -0.4014F, -0.6705F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F))
				.texOffs(49, 16).addBox(-0.5825F, -0.8049F, 1.9191F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-1.4644F, -0.1197F, -11.0641F, 3.0063F, 0.0698F, 0.0F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(50, 44).addBox(-0.7978F, -0.8062F, -2.764F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.1829F, -0.4512F, -10.538F, 2.9714F, 0.1047F, 0.0F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(31, 50).addBox(-0.5825F, -0.8788F, -0.6824F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4644F, -0.1197F, -11.0641F, 2.9714F, 0.0698F, 0.0F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(58, 15).addBox(-0.7F, -0.325F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3909F, 0.0724F, -7.1419F, -0.0572F, -0.0019F, 0.0214F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5534F, 0.1677F, -8.3219F, -0.1279F, 0.0496F, 0.0088F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(58, 66).addBox(-0.7141F, -0.3955F, -0.701F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-1.1395F, 0.7816F, -7.0909F, 1.2612F, 0.157F, 0.0007F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(71, 56).addBox(-0.7236F, -1.6847F, -0.7351F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1395F, 0.7816F, -7.0909F, 1.3221F, 0.0698F, 0.0F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(75, 10).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.9322F, 2.3637F, -4.4346F, -0.3272F, 0.1789F, 0.0F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(7, 58).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0134F)), PartPose.offsetAndRotation(-0.7613F, 2.6436F, -3.4899F, -1.8544F, 0.1789F, 0.0F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(60, 83).addBox(-0.5F, -0.25F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5834F, 2.6654F, -2.506F, 1.5053F, 0.1789F, 0.0F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(83, 33).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.5834F, 2.6654F, -2.506F, 1.6362F, 0.1789F, 0.0F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(35, 78).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5834F, 2.6654F, -2.506F, 3.1198F, 0.1789F, 0.0F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(48, 86).addBox(-0.9997F, -0.4935F, -0.3885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(86, 39).addBox(-0.7997F, -0.4935F, -0.3885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2189F, 1.3295F, 0.7418F, 0.1626F, 0.9973F, 0.2344F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(58, 53).addBox(-1.2545F, -0.8109F, -0.2413F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.825F, 1.775F, -1.75F, 0.0156F, 0.2016F, 0.1108F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(55, 83).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.1641F, -0.1622F, -4.2213F, -0.0052F, -0.0166F, -1.2653F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(90, 0).addBox(-0.8F, -0.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.266F, -0.2137F, -4.7305F, -0.0334F, -1.4128F, -1.2325F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(38, 83).addBox(-0.9F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1541F, -0.1194F, -3.1017F, 1.5486F, -0.0662F, -1.2472F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(50, 83).addBox(-0.9F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1541F, -0.1473F, -3.5007F, 1.5486F, -0.0357F, -1.2479F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(71, 41).addBox(-0.9F, -1.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(38, 86).addBox(-0.9F, 0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-1.6641F, -0.1099F, -5.7193F, -1.555F, 0.059F, -1.3085F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(78, 34).addBox(-0.4021F, -0.4873F, -1.0024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(30, 78).addBox(-0.4021F, -0.4873F, -0.8024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2189F, 1.3295F, 0.7418F, 0.0574F, -0.1534F, 0.0645F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.0991F, -1.5413F, -2.1664F));

		PartDefinition cube_r159 = rightFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-0.2853F, -2.3911F, -0.2134F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.1395F, 0.7816F, -7.0909F, 1.4962F, -0.1397F, 0.0029F));

		PartDefinition cube_r160 = rightFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(72, 4).mirror().addBox(-0.259F, -2.3202F, -0.3494F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.1395F, 0.7816F, -7.0909F, 1.4353F, -0.0699F, 0.0029F));

		PartDefinition cube_r161 = rightFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-0.525F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.3225F, 2.5428F, -1.1744F, 1.4565F, -0.1611F, 0.0066F));

		PartDefinition cube_r162 = rightFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(79, 30).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.2384F, 1.9003F, -0.7024F, 1.7104F, -0.1789F, 0.0F));

		PartDefinition cube_r163 = rightFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(46, 75).mirror().addBox(-0.4984F, -1.1101F, -0.0684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.2675F, 2.0955F, 1.6852F, -1.7108F, -0.0909F, 0.0132F));

		PartDefinition cube_r164 = rightFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.5046F, -1.3415F, -0.6868F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.2675F, 2.0955F, 1.6852F, 0.336F, -0.0916F, 0.0F));

		PartDefinition cube_r165 = rightFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(69, 69).mirror().addBox(-0.5046F, -1.0392F, -1.1311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2675F, 2.0955F, 1.6852F, -0.144F, -0.0916F, 0.0F));

		PartDefinition cube_r166 = rightFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(20, 79).mirror().addBox(-0.4984F, -0.5006F, -0.0389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(15, 79).mirror().addBox(-0.4984F, -0.9006F, -0.0389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2675F, 2.0955F, 1.6852F, -1.689F, -0.0909F, 0.0132F));

		PartDefinition cube_r167 = rightFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(82, 15).mirror().addBox(-0.85F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(1.1756F, 0.3103F, 0.2453F, 3.0333F, 0.3798F, -1.7168F));

		PartDefinition cube_r168 = rightFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(65, 53).mirror().addBox(-0.15F, -0.15F, -0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(0.5455F, 1.2187F, 1.8724F, -2.9625F, 0.5956F, -0.4289F));

		PartDefinition cube_r169 = rightFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(10, 79).mirror().addBox(-1.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.8508F, 1.1033F, 1.0427F, -2.7306F, 0.4766F, 0.0185F));

		PartDefinition cube_r170 = rightFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(9, 51).mirror().addBox(-1.8018F, -0.5021F, 0.1979F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.0304F, 1.0455F, -1.009F, -0.2604F, 1.5089F, -0.6915F));

		PartDefinition cube_r171 = rightFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(49, 50).mirror().addBox(-2.2398F, -0.5021F, -0.3784F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(44, 35).mirror().addBox(-2.3898F, -0.5021F, -1.1534F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.0304F, 1.0455F, -1.009F, -0.1083F, 1.4228F, -0.5387F));

		PartDefinition cube_r172 = rightFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(87, 18).mirror().addBox(-0.375F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.5616F, 0.1154F, -2.8664F, -0.7416F, -0.003F, -0.1896F));

		PartDefinition cube_r173 = rightFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(71, 60).mirror().addBox(-0.375F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.5616F, 0.1154F, -2.8664F, -1.623F, -0.003F, -0.1896F));

		PartDefinition cube_r174 = rightFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(87, 15).mirror().addBox(-0.1F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.5616F, 0.1154F, -2.8664F, -2.1523F, -0.8827F, 0.2512F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(87, 12).mirror().addBox(-0.1F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.3299F, 1.222F, -2.908F, -0.8433F, -0.8827F, 0.2512F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.1854F, 1.1574F, -2.2619F, -0.6688F, -0.8827F, 0.2512F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(79, 6).mirror().addBox(-0.5F, -0.45F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0987F, 1.3224F, -1.7085F, -0.2878F, -0.2262F, -0.0402F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(60, 74).mirror().addBox(-0.6225F, -1.4239F, -0.7983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(74, 48).mirror().addBox(-0.6225F, -1.8239F, -0.7983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1395F, 0.7816F, -7.0909F, -2.1332F, -0.125F, 0.1136F));

		PartDefinition cube_r179 = rightFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(64, 65).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.044F, 1.6006F, -1.6858F, 1.5896F, -0.1541F, -0.0146F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(82, 51).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(0.1026F, 1.7598F, -2.048F, 0.4115F, -0.1541F, -0.0146F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(82, 21).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0649F, 2.2448F, -1.7595F, -0.243F, -0.1541F, -0.0146F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(20, 82).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.0036F, 2.2556F, -1.3643F, -1.5956F, -0.1541F, -0.0146F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(82, 18).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0578F, 2.249F, -0.9691F, -3.1228F, -0.1541F, -0.0146F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.2736F, 2.1282F, 0.4088F, -3.0529F, -0.1541F, -0.0146F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(78, 73).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2995F, 1.9076F, 0.5547F, 1.834F, -0.1541F, -0.0146F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(65, 83).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.9287F, 0.0942F, -16.0204F, 1.4323F, -0.0935F, 0.1064F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(45, 78).mirror().addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.9513F, -0.1512F, -16.7852F, 1.2577F, -0.0935F, 0.1064F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(71, 77).mirror().addBox(0.1032F, 4.5472F, -1.0823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 78).mirror().addBox(0.1032F, 2.1472F, -1.0323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(76, 77).mirror().addBox(0.1032F, 2.9472F, -1.0323F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 77).mirror().addBox(0.1032F, 3.7472F, -1.0823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9939F, 0.5246F, -9.6029F, 1.3308F, -0.144F, 0.0F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(77, 51).mirror().addBox(-0.5287F, -7.8874F, -0.2611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(51, 77).mirror().addBox(-0.5287F, -7.0874F, -0.2611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(40, 77).mirror().addBox(-0.5287F, -6.2874F, -0.2611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(77, 22).mirror().addBox(-0.5287F, -5.4874F, -0.2861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(77, 19).mirror().addBox(-0.5287F, -4.6874F, -0.2861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4575F, 1.4689F, -7.6995F, 1.4268F, -0.0611F, 0.0F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(77, 16).mirror().addBox(-0.3028F, -0.2325F, 0.2188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4575F, 1.4689F, -11.3995F, 1.4268F, -0.096F, 0.0F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(77, 13).mirror().addBox(-0.3028F, 0.5295F, 0.2319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(77, 3).mirror().addBox(-0.3028F, 1.3295F, 0.1819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4575F, 1.4689F, -11.3995F, 1.3744F, -0.096F, 0.0F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-0.3028F, 2.1575F, 0.1014F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4575F, 1.4689F, -11.3995F, 1.4181F, -0.096F, 0.0F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(76, 59).mirror().addBox(-0.3028F, 2.895F, 0.3307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4575F, 1.4689F, -11.3995F, 1.3308F, -0.096F, 0.0F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(61, 77).mirror().addBox(-1.1928F, -3.2573F, -0.8683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(56, 77).mirror().addBox(-0.9278F, -3.2971F, -0.8711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(1.8137F, 1.3654F, -6.4391F, -1.6406F, -0.1789F, 0.0F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(87, 51).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.5086F, 2.264F, -3.44F, -2.8623F, -0.1789F, 0.0F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(87, 3).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.7336F, 1.8167F, -4.6843F, -0.5323F, -0.1789F, 0.0F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7902F, 1.3079F, -4.9972F, 0.5585F, -0.1789F, 0.0F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(78, 86).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.7528F, 0.7459F, -4.7904F, 1.213F, -0.1789F, 0.0F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(86, 74).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.6834F, 0.2897F, -4.407F, 2.4347F, -0.1789F, 0.0F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(15, 88).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5801F, 0.1394F, -3.8354F, -2.8885F, -0.1789F, 0.0F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(10, 88).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.4738F, 0.1969F, -3.2476F, -1.6668F, -0.1789F, 0.0F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(73, 86).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.4133F, 0.6914F, -2.9132F, -0.9687F, -0.1789F, 0.0F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(68, 86).mirror().addBox(-0.5F, -0.8F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.3735F, 1.2486F, -2.6929F, 0.3403F, -0.1789F, 0.0F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(63, 86).mirror().addBox(-0.5F, -0.725F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.3425F, 1.6163F, -2.5213F, 2.1991F, -0.1789F, 0.0F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(58, 86).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.406F, 2.0986F, -2.8725F, 2.5045F, -0.1789F, 0.0F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(43, 87).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.6147F, 2.1961F, -4.0267F, -1.6842F, -0.1789F, 0.0F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(53, 86).mirror().addBox(-1.1523F, -1.3191F, 1.8501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.7137F, 1.3654F, -6.4391F, -0.5061F, -0.1789F, 0.0F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(57, 62).mirror().addBox(-0.2977F, -0.275F, -0.154F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(41, 62).mirror().addBox(-0.2977F, -0.5F, -0.154F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2685F, 0.1517F, -4.4319F, 2.982F, 0.8835F, 2.9715F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(-0.2F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9748F, -0.1337F, -4.9165F, 2.2553F, 0.1367F, 1.7168F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(10, 76).mirror().addBox(-0.359F, -0.4F, -0.612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.2685F, 0.1517F, -4.4319F, 0.8118F, 1.0268F, 0.804F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(15, 82).mirror().addBox(-0.509F, -0.5F, -0.612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2685F, 0.1517F, -4.4319F, 0.2758F, 1.1916F, 0.2108F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(15, 76).mirror().addBox(-0.8F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4055F, -0.1852F, -4.1486F, -0.1808F, 0.1342F, -1.4446F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(75, 45).mirror().addBox(-0.7135F, -0.5F, -0.1608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2685F, 0.1517F, -4.4319F, 0.1031F, 0.2F, -0.0258F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(88, 69).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.1892F, -0.816F, -17.1131F, -1.4289F, 0.0F, 0.0F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(88, 33).mirror().addBox(-0.25F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.9392F, -0.5448F, -16.908F, -1.8653F, 0.0F, 0.0F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(20, 88).mirror().addBox(2.5705F, 4.389F, 0.6077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.4644F, -0.1197F, -11.0641F, -1.8653F, 0.4608F, -0.1321F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(30, 87).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.0111F, -0.8804F, -16.6753F, -0.2072F, 0.4608F, -0.1321F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(87, 21).mirror().addBox(2.5705F, 4.2331F, -1.8447F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.4644F, -0.1197F, -11.0641F, -1.3853F, 0.4608F, -0.1321F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(76, 39).mirror().addBox(-0.3161F, 5.1429F, 0.6264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(1.4644F, -0.1197F, -11.0641F, -1.837F, -0.0349F, 0.0F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(81, 54).mirror().addBox(-0.4175F, 0.1463F, -5.7668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.4644F, -0.1197F, -11.0641F, -0.1963F, -0.0698F, 0.0F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(81, 57).mirror().addBox(-0.4175F, 2.6422F, -3.6583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.4644F, -0.1197F, -11.0641F, -0.8945F, -0.0698F, 0.0F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(86, 57).mirror().addBox(-0.4175F, 3.972F, -2.0118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4644F, -0.1197F, -11.0641F, -1.3308F, -0.0698F, 0.0F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(86, 54).mirror().addBox(-0.4175F, 4.2033F, -0.0712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(1.4644F, -0.1197F, -11.0641F, -1.7235F, -0.0698F, 0.0F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(45, 81).mirror().addBox(-0.4175F, -0.1531F, 3.663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.4644F, -0.1197F, -11.0641F, -3.1198F, -0.0698F, 0.0F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(22, 48).mirror().addBox(-0.2022F, -1.3117F, -2.621F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.1829F, -0.4512F, -10.538F, 2.9103F, -0.1047F, 0.0F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(82, 12).mirror().addBox(-0.4175F, -0.7619F, -4.6295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 82).mirror().addBox(-0.4175F, -0.7619F, -4.1045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(1.4644F, -0.1197F, -11.0641F, -0.0829F, -0.0698F, 0.0F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(82, 3).mirror().addBox(-0.4175F, -3.5221F, -0.3538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4644F, -0.1197F, -11.0641F, 1.453F, -0.0698F, 0.0F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(81, 76).mirror().addBox(-0.4175F, -0.4014F, 1.9295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(40, 50).mirror().addBox(-0.4175F, -0.4014F, -0.6705F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(49, 16).mirror().addBox(-0.4175F, -0.8049F, 1.9191F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(1.4644F, -0.1197F, -11.0641F, 3.0063F, -0.0698F, 0.0F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(50, 44).mirror().addBox(-0.2022F, -0.8062F, -2.764F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(1.1829F, -0.4512F, -10.538F, 2.9714F, -0.1047F, 0.0F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(31, 50).mirror().addBox(-0.4175F, -0.8788F, -0.6824F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4644F, -0.1197F, -11.0641F, 2.9714F, -0.0698F, 0.0F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(58, 15).mirror().addBox(-0.3F, -0.325F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3909F, 0.0724F, -7.1419F, -0.0572F, 0.0019F, -0.0214F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5534F, 0.1677F, -8.3219F, -0.1279F, -0.0496F, -0.0088F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(58, 66).mirror().addBox(-0.2859F, -0.3955F, -0.701F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(1.1395F, 0.7816F, -7.0909F, 1.2612F, -0.157F, -0.0007F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(71, 56).mirror().addBox(-0.2764F, -1.6847F, -0.7351F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1395F, 0.7816F, -7.0909F, 1.3221F, -0.0698F, 0.0F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(75, 10).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.9322F, 2.3637F, -4.4346F, -0.3272F, -0.1789F, 0.0F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(7, 58).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0134F)).mirror(false), PartPose.offsetAndRotation(0.7613F, 2.6436F, -3.4899F, -1.8544F, -0.1789F, 0.0F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(60, 83).mirror().addBox(-0.5F, -0.25F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5834F, 2.6654F, -2.506F, 1.5053F, -0.1789F, 0.0F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(83, 33).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.5834F, 2.6654F, -2.506F, 1.6362F, -0.1789F, 0.0F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(35, 78).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5834F, 2.6654F, -2.506F, 3.1198F, -0.1789F, 0.0F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(48, 86).mirror().addBox(-0.0003F, -0.4935F, -0.3885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(86, 39).mirror().addBox(-0.2003F, -0.4935F, -0.3885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2189F, 1.3295F, 0.7418F, 0.1626F, -0.9973F, -0.2344F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(58, 53).mirror().addBox(0.2545F, -0.8109F, -0.2413F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.825F, 1.775F, -1.75F, 0.0156F, -0.2016F, -0.1108F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(55, 83).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.1641F, -0.1622F, -4.2213F, -0.0052F, 0.0166F, 1.2653F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-0.2F, -0.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.266F, -0.2137F, -4.7305F, -0.0334F, 1.4128F, 1.2325F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(38, 83).mirror().addBox(-0.1F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.1541F, -0.1194F, -3.1017F, 1.5486F, 0.0662F, 1.2472F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(50, 83).mirror().addBox(-0.1F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.1541F, -0.1473F, -3.5007F, 1.5486F, 0.0357F, 1.2479F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(71, 41).mirror().addBox(-0.1F, -1.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(38, 86).mirror().addBox(-0.1F, 0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(1.6641F, -0.1099F, -5.7193F, -1.555F, -0.059F, 1.3085F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(78, 34).mirror().addBox(-0.5979F, -0.4873F, -1.0024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(30, 78).mirror().addBox(-0.5979F, -0.4873F, -0.8024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2189F, 1.3295F, 0.7418F, 0.0574F, 0.1534F, -0.0645F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3239F, -0.1619F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r248 = Lowerjaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(79, 65).mirror().addBox(-0.1017F, -0.3492F, -0.0673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.7201F, 0.3437F, 0.2209F, 0.0964F, -0.1261F, -0.0038F));

		PartDefinition cube_r249 = Lowerjaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(79, 68).mirror().addBox(-0.1017F, -0.5944F, -0.4338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-2.7201F, 0.3437F, 0.2209F, -0.8111F, -0.1261F, -0.0038F));

		PartDefinition cube_r250 = Lowerjaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.3433F, -0.2402F, 0.3986F, -1.1427F, -0.1261F, -0.0038F));

		PartDefinition cube_r251 = Lowerjaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(70, 11).mirror().addBox(-0.5F, -0.35F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.3538F, 0.6461F, 0.4978F, 1.9635F, -0.1265F, 0.0F));

		PartDefinition cube_r252 = Lowerjaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(70, 83).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-2.3011F, 0.778F, 0.0962F, -1.5354F, -0.1261F, -0.0038F));

		PartDefinition cube_r253 = Lowerjaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(83, 71).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.2004F, 0.8059F, -0.6969F, -0.0955F, -0.1261F, -0.0038F));

		PartDefinition cube_r254 = Lowerjaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(14, 63).mirror().addBox(-0.5F, -0.9F, -1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-2.1005F, 0.7292F, -1.4869F, -0.2003F, -0.1261F, -0.0038F));

		PartDefinition cube_r255 = Lowerjaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(75, 83).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.9214F, -0.3837F, -2.9332F, -1.1602F, -0.1261F, -0.0038F));

		PartDefinition cube_r256 = Lowerjaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(80, 83).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.3053F, 0.3722F, 0.1168F, 1.9984F, -0.1265F, 0.0F));

		PartDefinition cube_r257 = Lowerjaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2553F, 1.4319F, -0.2763F, -2.8449F, -0.1265F, 0.0F));

		PartDefinition cube_r258 = Lowerjaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(84, 6).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.1588F, 1.6658F, -1.0352F, -1.405F, -0.1265F, 0.0F));

		PartDefinition cube_r259 = Lowerjaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(84, 24).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0592F, 1.7978F, -1.8179F, -0.0611F, -0.1265F, 0.0F));

		PartDefinition cube_r260 = Lowerjaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(84, 27).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(48, 64).mirror().addBox(-0.5F, -1.6F, 0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-1.9585F, 1.749F, -2.61F, 1.4661F, -0.1265F, 0.0F));

		PartDefinition cube_r261 = Lowerjaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(28, 84).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.858F, 1.6654F, -3.3993F, 2.9322F, -0.1265F, 0.0F));

		PartDefinition cube_r262 = Lowerjaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(84, 30).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-1.877F, 0.629F, -3.2532F, -1.3784F, -0.1261F, -0.0038F));

		PartDefinition cube_r263 = Lowerjaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(33, 84).mirror().addBox(-0.1032F, -0.0511F, -0.8874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.1593F, 1.499F, -4.1755F, -1.8239F, -0.2138F, 0.0F));

		PartDefinition cube_r264 = Lowerjaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(43, 84).mirror().addBox(-0.1032F, -0.8726F, -1.7485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.1593F, 1.499F, -4.1755F, -0.2705F, -0.2138F, 0.0F));

		PartDefinition cube_r265 = Lowerjaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(52, 57).mirror().addBox(-0.8599F, -4.7761F, -0.1519F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-1.0593F, 0.999F, -5.6755F, 1.2741F, -0.1614F, 0.0F));

		PartDefinition cube_r266 = Lowerjaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(84, 48).mirror().addBox(-0.8599F, -4.3627F, 0.1803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0593F, 0.999F, -5.6755F, 1.2959F, -0.1614F, 0.0F));

		PartDefinition cube_r267 = Lowerjaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(84, 60).mirror().addBox(-0.1006F, -1.6142F, -0.7933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-2.1593F, 1.499F, -4.1755F, 0.0182F, -0.2134F, -0.0039F));

		PartDefinition cube_r268 = Lowerjaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(84, 63).mirror().addBox(-0.1006F, -1.6641F, 0.5378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-2.1593F, 1.499F, -4.1755F, 1.4843F, -0.2134F, -0.0039F));

		PartDefinition cube_r269 = Lowerjaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(21, 63).mirror().addBox(-0.8599F, 0.2106F, -0.2322F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-1.0593F, 0.999F, -5.6755F, 2.924F, -0.161F, -0.0038F));

		PartDefinition cube_r270 = Lowerjaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(28, 63).mirror().addBox(-0.8599F, 0.0567F, 1.5892F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-1.0593F, 0.999F, -5.6755F, 2.8324F, -0.161F, -0.0038F));

		PartDefinition cube_r271 = Lowerjaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(84, 66).mirror().addBox(-0.8274F, -1.1481F, -0.3899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.3593F, -0.301F, -10.1755F, -0.24F, -0.0829F, 0.0F));

		PartDefinition cube_r272 = Lowerjaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(7, 66).mirror().addBox(-0.8274F, -2.8154F, -0.0659F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3593F, -0.301F, -10.1755F, 1.3046F, -0.0829F, 0.0F));

		PartDefinition cube_r273 = Lowerjaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(83, 88).mirror().addBox(-0.8274F, 0.1899F, -1.1481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.3593F, -0.301F, -10.1755F, -1.8108F, -0.0829F, 0.0F));

		PartDefinition cube_r274 = Lowerjaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(34, 22).mirror().addBox(-0.8274F, 0.1855F, 0.9526F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-0.3593F, -0.301F, -10.1755F, 2.9365F, -0.0829F, 0.0F));

		PartDefinition cube_r275 = Lowerjaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(40, 66).mirror().addBox(-0.8274F, -5.5847F, 0.0284F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.3593F, -0.301F, -10.1755F, 1.3395F, -0.0829F, 0.0F));

		PartDefinition cube_r276 = Lowerjaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(88, 88).mirror().addBox(-0.8274F, 2.2052F, 7.7407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3593F, -0.301F, -10.1755F, 3.1154F, -0.0829F, 0.0F));

		PartDefinition cube_r277 = Lowerjaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-0.8274F, 0.4144F, 8.0055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(52, 38).mirror().addBox(-0.8274F, 0.4144F, 5.7055F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.3593F, -0.301F, -10.1755F, 2.9758F, -0.0829F, 0.0F));

		PartDefinition cube_r278 = Lowerjaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(89, 63).mirror().addBox(-0.8274F, 1.1117F, 7.2171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(89, 66).mirror().addBox(-0.8274F, 1.0867F, 6.4171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(48, 89).mirror().addBox(-0.8274F, 1.0117F, 5.6171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(53, 89).mirror().addBox(-0.8274F, 1.0367F, 4.8171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3593F, -0.301F, -10.1755F, 2.9845F, -0.0829F, 0.0F));

		PartDefinition cube_r279 = Lowerjaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(68, 89).mirror().addBox(-0.8274F, 0.7732F, 4.0913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(73, 89).mirror().addBox(-0.8274F, 0.7732F, 3.1913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(78, 89).mirror().addBox(-0.8274F, 0.7732F, 2.3913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3593F, -0.301F, -10.1755F, 2.9322F, -0.0829F, 0.0F));

		PartDefinition cube_r280 = Lowerjaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(85, 9).mirror().addBox(-0.8274F, 0.637F, 1.6551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 85).mirror().addBox(-0.8274F, 0.637F, 0.8551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 85).mirror().addBox(-0.8274F, 0.637F, 0.0551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3593F, -0.301F, -10.1755F, 2.8798F, -0.0829F, 0.0F));

		PartDefinition cube_r281 = Lowerjaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(20, 85).mirror().addBox(-0.8599F, 0.714F, 3.9904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0593F, 0.999F, -5.6755F, 2.8798F, -0.1614F, 0.0F));

		PartDefinition cube_r282 = Lowerjaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(85, 43).mirror().addBox(-0.8599F, 0.5192F, 3.2489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 79).mirror().addBox(-0.8599F, 0.5192F, 2.4489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 82).mirror().addBox(-0.8599F, 0.4692F, 1.6488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0593F, 0.999F, -5.6755F, 2.8274F, -0.1614F, 0.0F));

		PartDefinition cube_r283 = Lowerjaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(85, 0).addBox(-0.1726F, 0.4144F, 8.0055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(52, 38).addBox(-0.1726F, 0.4144F, 5.7055F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.4892F, -0.301F, -10.1755F, 2.9758F, 0.0829F, 0.0F));

		PartDefinition cube_r284 = Lowerjaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(85, 82).addBox(-0.1401F, 0.4692F, 1.6488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 79).addBox(-0.1401F, 0.5192F, 2.4489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 43).addBox(-0.1401F, 0.5192F, 3.2489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1892F, 0.999F, -5.6755F, 2.8274F, 0.1614F, 0.0F));

		PartDefinition cube_r285 = Lowerjaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(20, 85).addBox(-0.1401F, 0.714F, 3.9904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1892F, 0.999F, -5.6755F, 2.8798F, 0.1614F, 0.0F));

		PartDefinition cube_r286 = Lowerjaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(15, 85).addBox(-0.1726F, 0.637F, 0.0551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 85).addBox(-0.1726F, 0.637F, 0.8551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 9).addBox(-0.1726F, 0.637F, 1.6551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4892F, -0.301F, -10.1755F, 2.8798F, 0.0829F, 0.0F));

		PartDefinition cube_r287 = Lowerjaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(78, 89).addBox(-0.1726F, 0.7732F, 2.3913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(73, 89).addBox(-0.1726F, 0.7732F, 3.1913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(68, 89).addBox(-0.1726F, 0.7732F, 4.0913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4892F, -0.301F, -10.1755F, 2.9322F, 0.0829F, 0.0F));

		PartDefinition cube_r288 = Lowerjaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(53, 89).addBox(-0.1726F, 1.0367F, 4.8171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 89).addBox(-0.1726F, 1.0117F, 5.6171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(89, 66).addBox(-0.1726F, 1.0867F, 6.4171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(89, 63).addBox(-0.1726F, 1.1117F, 7.2171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4892F, -0.301F, -10.1755F, 2.9845F, 0.0829F, 0.0F));

		PartDefinition cube_r289 = Lowerjaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(88, 88).addBox(-0.1726F, 2.2052F, 7.7407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4892F, -0.301F, -10.1755F, 3.1154F, 0.0829F, 0.0F));

		PartDefinition cube_r290 = Lowerjaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(34, 22).addBox(-0.1726F, 0.1855F, 0.9526F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(0.4892F, -0.301F, -10.1755F, 2.9365F, 0.0829F, 0.0F));

		PartDefinition cube_r291 = Lowerjaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(83, 88).addBox(-0.1726F, 0.1899F, -1.1481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.4892F, -0.301F, -10.1755F, -1.8108F, 0.0829F, 0.0F));

		PartDefinition cube_r292 = Lowerjaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(84, 66).addBox(-0.1726F, -1.1481F, -0.3899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.4892F, -0.301F, -10.1755F, -0.24F, 0.0829F, 0.0F));

		PartDefinition cube_r293 = Lowerjaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(84, 48).addBox(-0.1401F, -4.3627F, 0.1803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1892F, 0.999F, -5.6755F, 1.2959F, 0.1614F, 0.0F));

		PartDefinition cube_r294 = Lowerjaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(40, 66).addBox(-0.1726F, -5.5847F, 0.0284F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.4892F, -0.301F, -10.1755F, 1.3395F, 0.0829F, 0.0F));

		PartDefinition cube_r295 = Lowerjaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(7, 66).addBox(-0.1726F, -2.8154F, -0.0659F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4892F, -0.301F, -10.1755F, 1.3046F, 0.0829F, 0.0F));

		PartDefinition cube_r296 = Lowerjaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(52, 57).addBox(-0.1401F, -4.7761F, -0.1519F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(1.1892F, 0.999F, -5.6755F, 1.2741F, 0.1614F, 0.0F));

		PartDefinition cube_r297 = Lowerjaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(43, 84).addBox(-0.8968F, -0.8726F, -1.7485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.2892F, 1.499F, -4.1755F, -0.2705F, 0.2138F, 0.0F));

		PartDefinition cube_r298 = Lowerjaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(33, 84).addBox(-0.8968F, -0.0511F, -0.8874F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.2892F, 1.499F, -4.1755F, -1.8239F, 0.2138F, 0.0F));

		PartDefinition cube_r299 = Lowerjaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(28, 84).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.988F, 1.6654F, -3.3993F, 2.9322F, 0.1265F, 0.0F));

		PartDefinition cube_r300 = Lowerjaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(48, 64).addBox(-0.5F, -1.6F, 0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.09F))
				.texOffs(84, 27).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.0884F, 1.749F, -2.61F, 1.4661F, 0.1265F, 0.0F));

		PartDefinition cube_r301 = Lowerjaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(84, 24).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.1892F, 1.7978F, -1.8179F, -0.0611F, 0.1265F, 0.0F));

		PartDefinition cube_r302 = Lowerjaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(84, 6).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.2887F, 1.6658F, -1.0352F, -1.405F, 0.1265F, 0.0F));

		PartDefinition cube_r303 = Lowerjaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(5, 84).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3853F, 1.4319F, -0.2763F, -2.8449F, 0.1265F, 0.0F));

		PartDefinition cube_r304 = Lowerjaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(80, 83).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.4353F, 0.3722F, 0.1168F, 1.9984F, 0.1265F, 0.0F));

		PartDefinition cube_r305 = Lowerjaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(70, 11).addBox(-0.5F, -0.35F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.4838F, 0.6461F, 0.4978F, 1.9635F, 0.1265F, 0.0F));

		PartDefinition cube_r306 = Lowerjaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(28, 63).addBox(-0.1401F, 0.0567F, 1.5892F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(1.1892F, 0.999F, -5.6755F, 2.8324F, 0.161F, 0.0038F));

		PartDefinition cube_r307 = Lowerjaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(21, 63).addBox(-0.1401F, 0.2106F, -0.2322F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(1.1892F, 0.999F, -5.6755F, 2.924F, 0.161F, 0.0038F));

		PartDefinition cube_r308 = Lowerjaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(84, 63).addBox(-0.8994F, -1.6641F, 0.5378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(2.2892F, 1.499F, -4.1755F, 1.4843F, 0.2134F, 0.0039F));

		PartDefinition cube_r309 = Lowerjaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(84, 60).addBox(-0.8994F, -1.6142F, -0.7933F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(2.2892F, 1.499F, -4.1755F, 0.0182F, 0.2134F, 0.0039F));

		PartDefinition cube_r310 = Lowerjaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(84, 30).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(2.0069F, 0.629F, -3.2532F, -1.3784F, 0.1261F, 0.0038F));

		PartDefinition cube_r311 = Lowerjaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(75, 83).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.0514F, -0.3837F, -2.9332F, -1.1602F, 0.1261F, 0.0038F));

		PartDefinition cube_r312 = Lowerjaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(14, 63).addBox(-0.5F, -0.9F, -1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(2.2305F, 0.7292F, -1.4869F, -0.2003F, 0.1261F, 0.0038F));

		PartDefinition cube_r313 = Lowerjaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(83, 71).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.3304F, 0.8059F, -0.6969F, -0.0955F, 0.1261F, 0.0038F));

		PartDefinition cube_r314 = Lowerjaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(70, 83).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(2.4311F, 0.778F, 0.0962F, -1.5354F, 0.1261F, 0.0038F));

		PartDefinition cube_r315 = Lowerjaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.4733F, -0.2402F, 0.3986F, -1.1427F, 0.1261F, 0.0038F));

		PartDefinition cube_r316 = Lowerjaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(79, 68).addBox(-0.8983F, -0.5944F, -0.4338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(2.85F, 0.3437F, 0.2209F, -0.8111F, 0.1261F, 0.0038F));

		PartDefinition cube_r317 = Lowerjaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(79, 65).addBox(-0.8983F, -0.3492F, -0.0673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.85F, 0.3437F, 0.2209F, 0.0964F, 0.1261F, 0.0038F));

		PartDefinition bone2 = Body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1845F, 1.9647F, -3.6146F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r318 = bone2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(60, 80).addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(-0.5F, -0.3327F, -0.5195F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r319 = bone2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(33, 81).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(55, 80).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)), PartPose.offsetAndRotation(-0.5F, -0.6904F, -0.4736F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r320 = bone2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(81, 37).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.5F, -2.2994F, 0.1994F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r321 = bone2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(50, 80).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5F, -2.4225F, 0.269F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r322 = bone2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(59, 43).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(-0.5F, -1.3615F, -0.2175F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r323 = bone2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(80, 45).addBox(-0.4977F, 0.1774F, -0.5166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.2405F, 0.4123F, -0.6873F, -0.0204F, -0.0436F, 1.0892F));

		PartDefinition cube_r324 = bone2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(76, 42).addBox(-0.4977F, 0.0999F, -0.6998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.2405F, 0.4123F, -0.6873F, 0.8174F, -0.0436F, 1.0892F));

		PartDefinition cube_r325 = bone2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(40, 80).addBox(-0.4977F, 0.1138F, -0.2952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.2405F, 0.4123F, -0.6873F, -0.8843F, -0.0436F, 1.0892F));

		PartDefinition cube_r326 = bone2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(80, 9).addBox(-0.4977F, -0.5221F, 0.1816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.2405F, 0.4123F, -0.6873F, 1.3846F, -0.0436F, 1.0892F));

		PartDefinition cube_r327 = bone2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(63, 89).addBox(-0.4977F, -0.3561F, 0.132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.2405F, 0.4123F, -0.6873F, 2.2137F, -0.0436F, 1.0892F));

		PartDefinition cube_r328 = bone2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(80, 0).addBox(-0.4977F, -0.4607F, -0.4969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.2405F, 0.4123F, -0.6873F, 1.6028F, -0.0436F, 1.0892F));

		PartDefinition bone4 = Body.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7845F, 1.9647F, -3.6146F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r329 = bone4.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(60, 80).mirror().addBox(-0.5F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.3327F, -0.5195F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r330 = bone4.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(33, 81).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(55, 80).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.6904F, -0.4736F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r331 = bone4.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(81, 37).mirror().addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.5F, -2.2994F, 0.1994F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r332 = bone4.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(50, 80).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.5F, -2.4225F, 0.269F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r333 = bone4.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(59, 43).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.3615F, -0.2175F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r334 = bone4.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(80, 45).mirror().addBox(-0.5023F, 0.1774F, -0.5166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(1.2405F, 0.4123F, -0.6873F, -0.0204F, 0.0436F, -1.0892F));

		PartDefinition cube_r335 = bone4.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(76, 42).mirror().addBox(-0.5023F, 0.0999F, -0.6998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.2405F, 0.4123F, -0.6873F, 0.8174F, 0.0436F, -1.0892F));

		PartDefinition cube_r336 = bone4.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(40, 80).mirror().addBox(-0.5023F, 0.1138F, -0.2952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.2405F, 0.4123F, -0.6873F, -0.8843F, 0.0436F, -1.0892F));

		PartDefinition cube_r337 = bone4.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(80, 9).mirror().addBox(-0.5023F, -0.5221F, 0.1816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(1.2405F, 0.4123F, -0.6873F, 1.3846F, 0.0436F, -1.0892F));

		PartDefinition cube_r338 = bone4.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(63, 89).mirror().addBox(-0.5023F, -0.3561F, 0.132F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.2405F, 0.4123F, -0.6873F, 2.2137F, 0.0436F, -1.0892F));

		PartDefinition cube_r339 = bone4.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-0.5023F, -0.4607F, -0.4969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.2405F, 0.4123F, -0.6873F, 1.6028F, 0.0436F, -1.0892F));

		PartDefinition UpperArmL = Body.addOrReplaceChild("UpperArmL", CubeListBuilder.create().texOffs(89, 6).addBox(-0.5F, -1.217F, 0.5099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(89, 24).addBox(-0.5F, -1.217F, 0.9099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.5684F, 2.1803F, -4.6736F, -0.6458F, 0.5672F, 0.0F));

		PartDefinition cube_r340 = UpperArmL.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(25, 90).addBox(-0.5F, -1.05F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0065F, -0.1117F, 1.2062F, 0.4374F, 0.006F, 0.0121F));

		PartDefinition cube_r341 = UpperArmL.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(90, 9).addBox(-0.5F, -0.5F, -1.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0004F, -0.5476F, 1.4707F, -0.348F, 0.006F, 0.0121F));

		PartDefinition cube_r342 = UpperArmL.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(30, 90).addBox(-0.5F, -0.5F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(5, 90).addBox(-0.5F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0014F, -0.5256F, 1.2217F, -0.0862F, 0.006F, 0.0121F));

		PartDefinition cube_r343 = UpperArmL.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(64, 57).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, -0.8834F, 2.2039F, 0.3054F, 0.0F, 0.0F));

		PartDefinition HandL = UpperArmL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0484F, -1.3408F, 2.9076F, 0.4704F, -0.1698F, 0.0789F));

		PartDefinition cube_r344 = HandL.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(74, 67).addBox(-0.5F, -0.7625F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(22, 45).addBox(-0.5F, -0.1125F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(74, 31).addBox(-0.5F, -0.0375F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(74, 64).addBox(-0.5F, -0.7625F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.2125F, 0.25F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r345 = HandL.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(45, 57).addBox(-0.5F, -1.05F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 1.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition UpperArmL2 = Body.addOrReplaceChild("UpperArmL2", CubeListBuilder.create().texOffs(89, 30).addBox(-0.5F, -1.217F, 0.5099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(35, 89).addBox(-0.5F, -1.217F, 0.9099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-2.1684F, 2.1803F, -4.6736F, -0.733F, -0.5672F, 0.0F));

		PartDefinition cube_r346 = UpperArmL2.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(90, 80).addBox(-0.5F, -1.05F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0065F, -0.1117F, 1.2062F, 0.4374F, -0.006F, -0.0121F));

		PartDefinition cube_r347 = UpperArmL2.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(90, 77).addBox(-0.5F, -0.5F, -1.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.0004F, -0.5476F, 1.4707F, -0.348F, -0.006F, -0.0121F));

		PartDefinition cube_r348 = UpperArmL2.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(90, 42).addBox(-0.5F, -0.5F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(40, 90).addBox(-0.5F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0014F, -0.5256F, 1.2217F, -0.0862F, -0.006F, -0.0121F));

		PartDefinition cube_r349 = UpperArmL2.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(64, 61).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, -0.8834F, 2.2039F, 0.3054F, 0.0F, 0.0F));

		PartDefinition HandL2 = UpperArmL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0484F, -1.3408F, 2.9076F, 0.4704F, 0.1698F, -0.0789F));

		PartDefinition cube_r350 = HandL2.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(75, 0).addBox(-0.5F, -0.7625F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 74).addBox(-0.5F, -0.1125F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(41, 74).addBox(-0.5F, -0.0375F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(74, 70).addBox(-0.5F, -0.7625F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.2125F, 0.25F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r351 = HandL2.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(57, 57).addBox(-0.5F, -1.05F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 1.7F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(31, 31).addBox(-0.435F, -0.475F, -0.05F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(22, 91).addBox(0.065F, -1.6F, 0.95F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.135F, -0.7567F, 2.4341F, 0.0437F, 0.0436F, 0.0019F));

		PartDefinition cube_r352 = Body2.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(91, 54).addBox(1.065F, -1.175F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.475F, 2.95F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r353 = Body2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(59, 47).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 1.4297F, 0.2216F, 0.3348F, -1.2392F));

		PartDefinition cube_r354 = Body2.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(12, 70).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 1.4297F, 0.3571F, 0.2197F, -0.7541F));

		PartDefinition cube_r355 = Body2.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(91, 36).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 1.4297F, 0.4216F, 0.0581F, -0.2971F));

		PartDefinition cube_r356 = Body2.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(91, 38).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 3.4297F, 0.5154F, 0.0767F, -0.292F));

		PartDefinition cube_r357 = Body2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(70, 15).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 3.4297F, 0.4356F, 0.2772F, -0.736F));

		PartDefinition cube_r358 = Body2.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(60, 49).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0619F, 3.4297F, 0.2651F, 0.4212F, -1.2244F));

		PartDefinition cube_r359 = Body2.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(60, 49).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 3.4297F, 0.2651F, -0.4212F, 1.2244F));

		PartDefinition cube_r360 = Body2.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(70, 15).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 3.4297F, 0.4356F, -0.2772F, 0.736F));

		PartDefinition cube_r361 = Body2.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(91, 38).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 3.4297F, 0.5154F, -0.0767F, 0.292F));

		PartDefinition cube_r362 = Body2.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(91, 36).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 1.4297F, 0.4216F, -0.0581F, 0.2971F));

		PartDefinition cube_r363 = Body2.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(12, 70).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 1.4297F, 0.3571F, -0.2197F, 0.7541F));

		PartDefinition cube_r364 = Body2.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(59, 47).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0619F, 1.4297F, 0.2216F, -0.3348F, 1.2392F));

		PartDefinition cube_r365 = Body2.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(0, 19).addBox(-2.0F, -0.6264F, -4.8923F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, 6.344F, 4.1212F, -0.1833F, 0.0F, 0.0F));

		PartDefinition bone = Body2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(19, 16).addBox(-0.435F, -0.4F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 37).addBox(-1.935F, 5.9725F, 2.7179F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(83, 91).addBox(0.065F, -1.65F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 91).addBox(0.065F, -1.675F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 91).addBox(0.065F, -1.675F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.075F, 4.95F, -0.0786F, 0.0435F, -0.0034F));

		PartDefinition cube_r366 = bone.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(60, 51).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 0.4797F, 0.2716F, 0.4377F, -1.2217F));

		PartDefinition cube_r367 = bone.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(70, 17).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 0.4797F, 0.4491F, 0.2889F, -0.7322F));

		PartDefinition cube_r368 = bone.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(91, 40).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 0.4797F, 0.5322F, 0.0817F, -0.2907F));

		PartDefinition cube_r369 = bone.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(19, 70).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 2.4797F, 0.4043F, 0.2598F, -0.7431F));

		PartDefinition cube_r370 = bone.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(91, 58).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 2.4797F, 0.4806F, 0.074F, -0.2935F));

		PartDefinition cube_r371 = bone.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(14, 61).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 2.4797F, 0.2449F, 0.3917F, -1.2312F));

		PartDefinition cube_r372 = bone.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(70, 19).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 4.4797F, 0.4176F, 0.2715F, -0.7396F));

		PartDefinition cube_r373 = bone.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(91, 74).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 4.4797F, 0.4973F, 0.079F, -0.2922F));

		PartDefinition cube_r374 = bone.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(32, 61).mirror().addBox(-5.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1369F, 4.4797F, 0.2513F, 0.4081F, -1.2287F));

		PartDefinition cube_r375 = bone.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(32, 61).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 4.4797F, 0.2513F, -0.4081F, 1.2287F));

		PartDefinition cube_r376 = bone.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(91, 74).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 4.4797F, 0.4973F, -0.079F, 0.2922F));

		PartDefinition cube_r377 = bone.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(70, 19).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 4.4797F, 0.4176F, -0.2715F, 0.7396F));

		PartDefinition cube_r378 = bone.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(14, 61).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 2.4797F, 0.2449F, -0.3917F, 1.2312F));

		PartDefinition cube_r379 = bone.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(91, 58).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 2.4797F, 0.4806F, -0.074F, 0.2935F));

		PartDefinition cube_r380 = bone.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(19, 70).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 2.4797F, 0.4043F, -0.2598F, 0.7431F));

		PartDefinition cube_r381 = bone.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(91, 40).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 0.4797F, 0.5322F, -0.0817F, 0.2907F));

		PartDefinition cube_r382 = bone.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(70, 17).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 0.4797F, 0.4491F, -0.2889F, 0.7322F));

		PartDefinition cube_r383 = bone.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(60, 51).addBox(2.4821F, -1.6322F, -0.4069F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1369F, 0.4797F, 0.2716F, -0.4377F, 1.2217F));

		PartDefinition cube_r384 = bone.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(34, 0).addBox(-2.0F, -0.625F, -2.9967F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, 6.5977F, 2.7309F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Body3 = bone.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1336F, 5.9522F, 0.0067F, 0.0873F, 0.0006F));

		PartDefinition cube_r385 = Body3.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(34, 17).addBox(-0.935F, -0.5039F, 2.9715F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.8654F, -0.2191F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r386 = Body3.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(34, 12).addBox(-0.935F, -1.0254F, 0.0128F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.8654F, -0.2191F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r387 = Body3.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(41, 93).addBox(1.065F, -1.475F, 6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(38, 93).addBox(1.065F, -1.425F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(31, 93).addBox(1.065F, -1.4F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(28, 93).addBox(1.065F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(0, 0).addBox(0.565F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.4984F, 0.0092F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r388 = Body3.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(55, 71).mirror().addBox(-2.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1284F, 0.3525F, 0.4251F, 0.2893F, -0.7804F));

		PartDefinition cube_r389 = Body3.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(92, 51).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1284F, 0.3525F, 0.5115F, 0.092F, -0.3339F));

		PartDefinition cube_r390 = Body3.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(72, 8).mirror().addBox(-4.4821F, -1.6322F, -0.4069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1284F, 0.3525F, 0.249F, 0.4272F, -1.2725F));

		PartDefinition cube_r391 = Body3.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(32, 59).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0034F, 2.1775F, 0.6255F, 0.1341F, -0.3658F));

		PartDefinition cube_r392 = Body3.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(70, 21).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0034F, 2.1775F, 0.5146F, 0.3755F, -0.7959F));

		PartDefinition cube_r393 = Body3.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(47, 27).mirror().addBox(-4.4821F, -1.6322F, -0.4069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.0034F, 2.1775F, 0.2866F, 0.5433F, -1.2997F));

		PartDefinition cube_r394 = Body3.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.9244F, 0.0085F, -0.4278F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.4034F, 4.5275F, 0.721F, 0.1749F, -0.3961F));

		PartDefinition cube_r395 = Body3.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(70, 23).mirror().addBox(-2.8221F, -0.4183F, -0.4055F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.4034F, 4.5275F, 0.5904F, 0.4515F, -0.8105F));

		PartDefinition cube_r396 = Body3.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(92, 3).mirror().addBox(-3.2951F, -1.658F, -0.3409F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.4034F, 4.5275F, 0.3148F, 0.6435F, -1.329F));

		PartDefinition cube_r397 = Body3.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(92, 12).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2034F, 6.5275F, 0.7905F, 0.2091F, -0.4281F));

		PartDefinition cube_r398 = Body3.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(70, 25).mirror().addBox(-2.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2034F, 6.5275F, 0.6457F, 0.51F, -0.8302F));

		PartDefinition cube_r399 = Body3.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(70, 25).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2034F, 6.5275F, 0.6457F, -0.51F, 0.8302F));

		PartDefinition cube_r400 = Body3.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(92, 12).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2034F, 6.5275F, 0.7905F, -0.2091F, 0.4281F));

		PartDefinition cube_r401 = Body3.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(92, 3).addBox(2.2951F, -1.658F, -0.3409F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.4034F, 4.5275F, 0.3148F, -0.6435F, 1.329F));

		PartDefinition cube_r402 = Body3.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(70, 23).addBox(0.8221F, -0.4183F, -0.4055F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.4034F, 4.5275F, 0.5904F, -0.4515F, 0.8105F));

		PartDefinition cube_r403 = Body3.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(0, 92).addBox(-0.0756F, 0.0085F, -0.4278F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.4034F, 4.5275F, 0.721F, -0.1749F, 0.3961F));

		PartDefinition cube_r404 = Body3.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(47, 27).addBox(2.4821F, -1.6322F, -0.4069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0034F, 2.1775F, 0.2866F, -0.5433F, 1.2997F));

		PartDefinition cube_r405 = Body3.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(70, 21).addBox(0.9745F, -0.3095F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0034F, 2.1775F, 0.5146F, -0.3755F, 0.7959F));

		PartDefinition cube_r406 = Body3.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(32, 59).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.0034F, 2.1775F, 0.6255F, -0.1341F, 0.3658F));

		PartDefinition cube_r407 = Body3.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(72, 8).addBox(2.4821F, -1.6322F, -0.4069F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1284F, 0.3525F, 0.249F, -0.4272F, 1.2725F));

		PartDefinition cube_r408 = Body3.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(92, 51).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1284F, 0.3525F, 0.5115F, -0.092F, 0.3339F));

		PartDefinition cube_r409 = Body3.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(55, 71).addBox(0.9745F, -0.3095F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1284F, 0.3525F, 0.4251F, -0.2893F, 0.7804F));

		PartDefinition body5 = Body3.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1016F, 8.0092F, 0.0611F, 0.0436F, 0.0027F));

		PartDefinition cube_r410 = body5.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(48, 92).addBox(1.065F, -1.825F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.2302F, 1.9988F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r411 = body5.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(35, 92).addBox(1.065F, -1.725F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.3F, 0.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r412 = body5.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(11, 45).addBox(0.565F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.3F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r413 = body5.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(92, 14).mirror().addBox(-1.0077F, 0.1749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2018F, 0.5183F, 0.7627F, 0.1984F, -0.4795F));

		PartDefinition cube_r414 = body5.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(92, 16).mirror().addBox(-1.9745F, -0.3095F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.2018F, 0.5183F, 0.622F, 0.4894F, -0.8873F));

		PartDefinition cube_r415 = body5.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.3018F, 2.5183F, 0.45F, 0.0154F, -0.5149F));

		PartDefinition cube_r416 = body5.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(92, 20).mirror().addBox(-1.9745F, -0.3095F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.3018F, 2.5183F, 0.4021F, 0.1937F, -0.9636F));

		PartDefinition cube_r417 = body5.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(92, 20).addBox(0.9745F, -0.3095F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.3018F, 2.5183F, 0.4021F, -0.1937F, 0.9636F));

		PartDefinition cube_r418 = body5.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(92, 18).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.3018F, 2.5183F, 0.45F, -0.0154F, 0.5149F));

		PartDefinition cube_r419 = body5.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(92, 16).addBox(0.9745F, -0.3095F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2018F, 0.5183F, 0.622F, -0.4894F, 0.8873F));

		PartDefinition cube_r420 = body5.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(92, 14).addBox(0.0077F, 0.1749F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.2018F, 0.5183F, 0.7627F, -0.1984F, 0.4795F));

		PartDefinition bone3 = body5.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6414F, 4.6136F, 2.2366F, 0.0352F, 0.0F, 0.0F));

		PartDefinition cube_r421 = bone3.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(35, 75).addBox(-0.5089F, -0.8909F, 0.0207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(25, 75).addBox(-0.5089F, -0.8909F, -0.5793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.8095F, 0.1388F, -3.1182F, -3.0811F, 0.2412F, 0.4653F));

		PartDefinition cube_r422 = bone3.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(20, 76).addBox(-0.5089F, -0.622F, -0.7535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.8095F, 0.1388F, -3.1182F, 2.853F, 0.2412F, 0.4653F));

		PartDefinition cube_r423 = bone3.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(76, 56).addBox(-0.5089F, -0.7667F, 0.0659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.8095F, 0.1388F, -3.1182F, -2.9938F, 0.2412F, 0.4653F));

		PartDefinition cube_r424 = bone3.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(76, 27).addBox(-0.5089F, -0.5909F, -2.1517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(58, 7).addBox(-0.5089F, -0.5909F, -1.6767F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.8095F, 0.1388F, -3.1182F, -2.2957F, 0.2412F, 0.4653F));

		PartDefinition cube_r425 = bone3.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(89, 46).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.9843F, -2.5469F, -1.0307F, -0.3904F, 0.1337F, -0.2258F));

		PartDefinition cube_r426 = bone3.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(25, 87).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-1.0578F, -2.4866F, -1.6639F, -1.0441F, 0.1238F, -0.2313F));

		PartDefinition cube_r427 = bone3.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(5, 81).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F))
				.texOffs(80, 80).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(-0.8543F, -1.7342F, -1.4579F, -1.8295F, 0.1238F, -0.2313F));

		PartDefinition cube_r428 = bone3.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(75, 80).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7835F, -1.7826F, -0.8151F, -1.4368F, 0.1238F, -0.2313F));

		PartDefinition cube_r429 = bone3.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(70, 80).addBox(-0.5F, -0.35F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.7835F, -1.7826F, -0.8151F, 0.0031F, 0.1238F, -0.2313F));

		PartDefinition cube_r430 = bone3.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(30, 75).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.7835F, -1.7826F, -0.8151F, -0.8696F, 0.1238F, -0.2313F));

		PartDefinition cube_r431 = bone3.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(65, 80).addBox(-1.1061F, 0.0337F, 0.2361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.4153F, -1.0747F, -0.1272F, -0.9569F, 0.1238F, 0.5105F));

		PartDefinition cube_r432 = bone3.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(26, 67).addBox(-1.1061F, -0.8354F, -0.6627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9974F, -0.0984F, -0.3752F, -2.8767F, 0.1238F, 0.5105F));

		PartDefinition cube_r433 = bone3.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(5, 75).addBox(-1.1061F, -0.3012F, -0.3166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8305F, 0.0834F, 1.5087F, -1.2187F, 0.1238F, 0.5105F));

		PartDefinition cube_r434 = bone3.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(68, 35).addBox(-1.5955F, -2.0331F, -0.3703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.7423F, 0.3597F, -0.7513F, -1.5765F, 0.1238F, 0.5105F));

		PartDefinition cube_r435 = bone3.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(45, 70).addBox(-1.5955F, -1.7951F, 0.7571F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.0F, -0.8F, -0.1F, -1.6114F, 0.1238F, 0.5105F));

		PartDefinition bone5 = body5.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5115F, 4.6136F, 2.2366F, 0.0352F, 0.0F, 0.0F));

		PartDefinition cube_r436 = bone5.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(35, 75).mirror().addBox(-0.4911F, -0.8909F, 0.0207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(25, 75).mirror().addBox(-0.4911F, -0.8909F, -0.5793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.8095F, 0.1388F, -3.1182F, -3.0811F, -0.2412F, -0.4653F));

		PartDefinition cube_r437 = bone5.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(20, 76).mirror().addBox(-0.4911F, -0.622F, -0.7535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.8095F, 0.1388F, -3.1182F, 2.853F, -0.2412F, -0.4653F));

		PartDefinition cube_r438 = bone5.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(76, 56).mirror().addBox(-0.4911F, -0.7667F, 0.0659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.8095F, 0.1388F, -3.1182F, -2.9938F, -0.2412F, -0.4653F));

		PartDefinition cube_r439 = bone5.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(76, 27).mirror().addBox(-0.4911F, -0.5909F, -2.1517F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(58, 7).mirror().addBox(-0.4911F, -0.5909F, -1.6767F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(1.8095F, 0.1388F, -3.1182F, -2.2957F, -0.2412F, -0.4653F));

		PartDefinition cube_r440 = bone5.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(89, 46).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.9843F, -2.5469F, -1.0307F, -0.3904F, -0.1337F, 0.2258F));

		PartDefinition cube_r441 = bone5.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(25, 87).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(1.0578F, -2.4866F, -1.6639F, -1.0441F, -0.1238F, 0.2313F));

		PartDefinition cube_r442 = bone5.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false)
				.texOffs(80, 80).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.8543F, -1.7342F, -1.4579F, -1.8295F, -0.1238F, 0.2313F));

		PartDefinition cube_r443 = bone5.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(75, 80).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7835F, -1.7826F, -0.8151F, -1.4368F, -0.1238F, 0.2313F));

		PartDefinition cube_r444 = bone5.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(70, 80).mirror().addBox(-0.5F, -0.35F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.7835F, -1.7826F, -0.8151F, 0.0031F, -0.1238F, 0.2313F));

		PartDefinition cube_r445 = bone5.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(30, 75).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.7835F, -1.7826F, -0.8151F, -0.8696F, -0.1238F, 0.2313F));

		PartDefinition cube_r446 = bone5.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(65, 80).mirror().addBox(0.1061F, 0.0337F, 0.2361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.4153F, -1.0747F, -0.1272F, -0.9569F, -0.1238F, -0.5105F));

		PartDefinition cube_r447 = bone5.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(26, 67).mirror().addBox(0.1061F, -0.8354F, -0.6627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.9974F, -0.0984F, -0.3752F, -2.8767F, -0.1238F, -0.5105F));

		PartDefinition cube_r448 = bone5.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(5, 75).mirror().addBox(0.1061F, -0.3012F, -0.3166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8305F, 0.0834F, 1.5087F, -1.2187F, -0.1238F, -0.5105F));

		PartDefinition cube_r449 = bone5.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(68, 35).mirror().addBox(0.5955F, -2.0331F, -0.3703F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.7423F, 0.3597F, -0.7513F, -1.5765F, -0.1238F, -0.5105F));

		PartDefinition cube_r450 = bone5.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(45, 70).mirror().addBox(0.5955F, -1.7951F, 0.7571F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8F, -0.1F, -1.6114F, -0.1238F, -0.5105F));

		PartDefinition UpperLegL = body5.addOrReplaceChild("UpperLegL", CubeListBuilder.create().texOffs(0, 89).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.1618F, 2.7F, 0.9375F, 1.1994F, 0.2163F, -0.8591F));

		PartDefinition cube_r451 = UpperLegL.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(73, 35).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.7282F, -3.1455F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r452 = UpperLegL.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(72, 52).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 4.7756F, -2.7126F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r453 = UpperLegL.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(20, 72).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.9279F, -1.9472F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r454 = UpperLegL.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(10, 72).addBox(-0.5F, -0.6573F, 0.1387F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 1.7485F, -1.2907F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r455 = UpperLegL.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(58, 89).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition LowerLegL = UpperLegL.addOrReplaceChild("LowerLegL", CubeListBuilder.create().texOffs(65, 11).addBox(-0.55F, -0.15F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(65, 16).addBox(-0.55F, -0.35F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.7987F, 8.6F, -2.3093F, 0.5056F, -0.1872F, 0.0677F));

		PartDefinition FootL = LowerLegL.addOrReplaceChild("FootL", CubeListBuilder.create().texOffs(0, 26).addBox(-0.75F, -0.3F, -1.85F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2074F, 2.9146F, 0.3739F, 0.1262F, 0.1128F, 0.037F));

		PartDefinition UpperLegL2 = body5.addOrReplaceChild("UpperLegL2", CubeListBuilder.create().texOffs(89, 27).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.0318F, 2.7F, 0.9375F, 0.3608F, -0.3364F, 1.0609F));

		PartDefinition cube_r456 = UpperLegL2.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(73, 73).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.7282F, -3.1455F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r457 = UpperLegL2.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(68, 73).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 4.7756F, -2.7126F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r458 = UpperLegL2.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(55, 73).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.9279F, -1.9472F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r459 = UpperLegL2.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(15, 72).addBox(-0.5F, -0.6573F, 0.1387F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 1.7485F, -1.2907F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r460 = UpperLegL2.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(89, 60).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition LowerLegL2 = UpperLegL2.addOrReplaceChild("LowerLegL2", CubeListBuilder.create().texOffs(66, 41).addBox(-0.45F, -0.15F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(53, 66).addBox(-0.45F, -0.35F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7987F, 8.6F, -2.3093F, 0.7238F, 0.1872F, -0.0677F));

		PartDefinition FootL2 = LowerLegL2.addOrReplaceChild("FootL2", CubeListBuilder.create().texOffs(9, 26).addBox(-0.25F, -0.3F, -1.85F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2074F, 2.9146F, 0.3739F, 0.1262F, -0.1128F, -0.037F));

		PartDefinition Body4 = body5.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, 3.9F, 0.0003F, 0.0873F, 0.0F));

		PartDefinition cube_r461 = Body4.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(25, 81).addBox(0.0F, -0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, 0.8625F, 2.7857F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r462 = Body4.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(60, 92).addBox(1.065F, -0.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5245F, 4.589F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r463 = Body4.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(57, 92).addBox(1.065F, -1.875F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0072F, 4.0813F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r464 = Body4.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(54, 92).addBox(1.065F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.1672F, 2.0889F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r465 = Body4.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(51, 92).addBox(1.065F, -1.825F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.3415F, 0.0965F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r466 = Body4.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(92, 22).mirror().addBox(-1.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1018F, 0.4183F, 0.5827F, 0.0478F, -0.5534F));

		PartDefinition cube_r467 = Body4.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(49, 53).mirror().addBox(-2.565F, 0.6F, 2.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(49, 53).addBox(-0.565F, 0.6F, 2.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(19, 8).addBox(-1.565F, 0.1F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1299F, -0.4411F, 0.1052F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r468 = Body4.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(92, 22).addBox(0.0077F, 0.1748F, -0.5012F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1018F, 0.4183F, 0.5827F, -0.0478F, 0.5534F));

		PartDefinition Tail = Body4.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(41, 38).addBox(-0.435F, -0.3651F, -0.0129F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.5589F, 6.0052F, 0.0052F, -0.2182F, -0.0011F));

		PartDefinition cube_r469 = Tail.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(69, 92).addBox(1.065F, -1.95F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.3651F, 1.9871F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r470 = Tail.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(66, 92).addBox(1.065F, -1.825F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.4651F, -0.0629F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r471 = Tail.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(7, 54).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.1349F, -0.0129F, 0.0068F, 0.0342F, 0.0016F));

		PartDefinition cube_r472 = Tail.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(7, 54).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.1349F, -0.0129F, 0.0068F, -0.0342F, -0.0016F));

		PartDefinition cube_r473 = Tail.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(63, 92).addBox(1.065F, 0.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5827F, 2.5912F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r474 = Tail.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(81, 25).addBox(1.065F, -0.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.7404F, 0.443F, 0.672F, 0.0F, 0.0F));

		PartDefinition tail5 = Tail.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 42).addBox(-0.435F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.1349F, 3.9871F, 0.0447F, -0.218F, -0.0097F));

		PartDefinition cube_r475 = tail5.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(78, 92).addBox(1.065F, -1.9F, -0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.4F, 2.05F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r476 = tail5.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(75, 92).addBox(1.065F, -1.925F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r477 = tail5.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(55, 27).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.335F, 0.0F, 0.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r478 = tail5.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(55, 27).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.465F, 0.0F, 0.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r479 = tail5.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(45, 66).addBox(0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, 0.1324F, 2.9007F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r480 = tail5.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(72, 92).addBox(1.065F, 0.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.38F, 0.7963F, 0.7592F, 0.0F, 0.0F));

		PartDefinition Tail2 = tail5.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(28, 42).addBox(-0.435F, -0.478F, 0.0123F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.975F, 0.0326F, -0.1744F, -0.0057F));

		PartDefinition cube_r481 = Tail2.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(5, 93).addBox(1.065F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.478F, 2.0123F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r482 = Tail2.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(92, 91).addBox(1.065F, -1.725F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.478F, 0.0123F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r483 = Tail2.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(29, 55).mirror().addBox(-0.7F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.435F, 0.022F, 0.0123F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r484 = Tail2.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(29, 55).addBox(-0.3F, 0.0F, 0.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.565F, 0.022F, 0.0123F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r485 = Tail2.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(11, 42).addBox(1.065F, 3.4F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5548F, -6.4998F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r486 = Tail2.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(95, 0).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, 0.7442F, 2.0056F, 0.672F, 0.0F, 0.0F));

		PartDefinition tail6 = Tail2.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(47, 5).addBox(-0.435F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.022F, 4.0123F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition cube_r487 = tail6.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(41, 71).addBox(1.065F, -1.05F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r488 = tail6.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(16, 54).addBox(1.065F, 4.4F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5327F, -10.5122F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r489 = tail6.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(25, 93).addBox(1.065F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Tail3 = tail6.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(44, 29).addBox(-0.435F, -0.0994F, 0.0567F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.9F, 0.0287F, -0.0038F, 0.1308F));

		PartDefinition cube_r490 = Tail3.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(93, 69).addBox(1.065F, -0.85F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.0994F, 0.0567F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r491 = Tail3.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(93, 33).addBox(1.065F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.0994F, 2.0567F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r492 = Tail3.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(65, 74).addBox(1.065F, 6.3F, 15.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 95).addBox(1.065F, 5.4F, 13.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.9327F, -14.4122F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail7 = Tail3.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(39, 44).addBox(-0.435F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.4006F, 4.0567F, -0.1513F, -0.1256F, 0.0947F));

		PartDefinition cube_r493 = tail7.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(94, 24).addBox(1.065F, -0.6F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 2.1F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r494 = tail7.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(94, 5).addBox(1.065F, -0.65F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r495 = tail7.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(0, 94).addBox(1.065F, 8.2F, 19.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 87).addBox(1.065F, 7.2F, 17.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.5321F, -18.4689F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(49, 11).addBox(-0.435F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4999F, 4.0087F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r496 = tail8.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(44, 94).addBox(1.065F, -0.55F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, 0.026F, 2.054F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r497 = tail8.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(94, 30).addBox(1.065F, -0.675F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r498 = tail8.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(94, 27).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, 0.9265F, 1.4691F, 0.1047F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(61, 37).addBox(-0.435F, -0.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(94, 45).addBox(0.065F, -1.1F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1096F, 2.9801F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r499 = tail9.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(94, 53).addBox(1.065F, -0.2F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.1F, 2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r500 = tail9.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(28, 81).addBox(0.565F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.1F, 2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r501 = tail9.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(94, 48).addBox(1.065F, -0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.911F, 1.6579F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Tail4 = tail9.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6928F, 2.5703F, 0.1329F, 0.0F, 0.0F));

		PartDefinition cube_r502 = Tail4.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(0, 48).addBox(0.565F, 0.1702F, 3.7313F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0F, 3.6394F, 3.4247F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r503 = Tail4.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(58, 11).addBox(0.565F, -0.9968F, 1.9168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.6394F, 3.4247F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r504 = Tail4.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(7, 62).addBox(0.565F, -1.0949F, -0.0864F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.6394F, 3.4247F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r505 = Tail4.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(94, 66).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.065F, 1.2524F, 2.2201F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r506 = Tail4.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(94, 63).addBox(1.065F, -0.4F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 60).addBox(1.065F, -0.1F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.153F, 0.881F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r507 = Tail4.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(34, 5).addBox(0.565F, 0.8F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, -1.6606F, 0.0247F, -0.6981F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 98, 98);
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